package ru.ok.gl.tf.gestures.processor;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.face.entity.CatFigure;
import ru.ok.face.entity.FaceFigure;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.tf.gestures.TensorflowRenderer;
import ru.ok.gl.tf.gestures.processor.Processor;
import ru.ok.gl.util.Consumer5;
import ru.ok.gl.util.IntPair;
import ru.ok.gl.util.Poolable;
import ru.ok.gl.util.ScaledTime;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.entity.Recognition;
import xsna.kv3;

@SuppressLint({"NewApi"})
/* loaded from: classes9.dex */
public final class Processor {
    public final Composer composer;
    private final HandlerThread executor;
    private final Handler executorDispatcher;
    private FiguresConsumer figuresConsumer;

    @Nullable
    private final TensorflowRenderer renderer;
    private final Handler uiDispatcher;
    private final AtomicBoolean isReleased = new AtomicBoolean();
    private IntPair frameSize = new IntPair();

    public static final class Data extends Poolable<Data> {
        private static final Poolable.Pool<Data> POOL = new Poolable.Pool<>(100, true, new a());
        List<CatFigure> catRecognitions;
        List<FaceFigure> faceRecognitions;
        final IntPair frameSize = new IntPair();
        Bitmap fullSegmentationResult;
        List<Recognition> recognitions;

        private Data() {
        }

        public static /* synthetic */ Data a() {
            return new Data();
        }

        public static Data obtain(List<Recognition> list, List<FaceFigure> list2, List<CatFigure> list3, Bitmap bitmap, int i, int i2) {
            Data obtain = POOL.obtain();
            IntPair intPair = obtain.frameSize;
            intPair.second = i2;
            intPair.first = i;
            obtain.recognitions = list;
            obtain.faceRecognitions = list2;
            obtain.catRecognitions = list3;
            obtain.fullSegmentationResult = bitmap;
            return obtain;
        }

        @Override // ru.ok.gl.util.Poolable
        public void recycle() {
            this.recognitions = null;
            this.faceRecognitions = null;
            this.fullSegmentationResult = null;
            IntPair intPair = this.frameSize;
            intPair.second = 0;
            intPair.first = 0;
        }

        public void release() {
            POOL.recycle(this);
        }
    }

    public interface FiguresConsumer extends Consumer5<Collection<? extends Figure<Gesture>>, Collection<? extends Figure<CompositeGesture>>, Collection<? extends FaceFigure>, Collection<? extends CatFigure>, Bitmap> {
    }

    public Processor(OverlayView overlayView) {
        if (overlayView != null) {
            this.renderer = new TensorflowRenderer.Builder(overlayView.getContext()).setOverlayView(overlayView).setTextSizeDp(18.0f).build();
        } else {
            this.renderer = null;
        }
        this.uiDispatcher = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: xsna.khd0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean acceptUi;
                acceptUi = Processor.this.acceptUi(message);
                return acceptUi;
            }
        });
        HandlerThread handlerThread = new HandlerThread("Tensorflow_gesture_detector");
        this.executor = handlerThread;
        handlerThread.start();
        this.executorDispatcher = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: xsna.mhd0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean acceptExecutor;
                acceptExecutor = Processor.this.acceptExecutor(message);
                return acceptExecutor;
            }
        });
        Composer composer = new Composer();
        this.composer = composer;
        composer.setFiguresUpdateCallback(new kv3(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean acceptExecutor(Message message) {
        Data data = (Data) message.obj;
        TensorflowRenderer tensorflowRenderer = this.renderer;
        try {
            this.composer.process(data.recognitions, data.faceRecognitions, data.catRecognitions, data.fullSegmentationResult, data.frameSize, tensorflowRenderer != null ? tensorflowRenderer.getSize() : this.frameSize);
            data.release();
            return true;
        } catch (Throwable th) {
            data.release();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean acceptUi(Message message) {
        FiguresConsumer figuresConsumer = this.figuresConsumer;
        if (figuresConsumer == null) {
            return true;
        }
        figuresConsumer.accept(this.composer.getFigures(), this.composer.getCompositeFigures(), this.composer.getFaces(), this.composer.getCats(), null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFiguresUpdate() {
        if (isReleased()) {
            return;
        }
        TensorflowRenderer tensorflowRenderer = this.renderer;
        if (tensorflowRenderer != null) {
            tensorflowRenderer.setFigures(this.composer.getFigures(), this.composer.getCompositeFigures());
        }
        this.uiDispatcher.obtainMessage(0).sendToTarget();
    }

    private boolean isReleased() {
        return this.isReleased.get();
    }

    public void enableDrawing(boolean z) {
        TensorflowRenderer tensorflowRenderer = this.renderer;
        if (tensorflowRenderer != null) {
            tensorflowRenderer.enableDrawing(z);
        }
    }

    public void enableSd(boolean z) {
        this.composer.setUseSd(z);
    }

    public void enableSmooth(boolean z) {
        this.composer.enableSmooth(z);
    }

    public void process(List<Recognition> list, List<FaceFigure> list2, List<CatFigure> list3, Bitmap bitmap, int i, int i2) {
        if (isReleased()) {
            return;
        }
        this.executorDispatcher.obtainMessage(0, Data.obtain(list, list2, list3, bitmap, i, i2)).sendToTarget();
    }

    public void release() {
        this.isReleased.set(true);
        this.composer.release();
        this.figuresConsumer = null;
        this.uiDispatcher.removeCallbacksAndMessages(null);
        TensorflowRenderer tensorflowRenderer = this.renderer;
        if (tensorflowRenderer != null) {
            tensorflowRenderer.release();
        }
        this.executor.quitSafely();
    }

    public void setClearFiguresDelay(@NonNull ScaledTime scaledTime) {
        this.composer.setClearFiguresDelay(scaledTime);
    }

    public void setFiguresConsumer(FiguresConsumer figuresConsumer) {
        this.figuresConsumer = figuresConsumer;
    }

    public void setSize(Size size) {
        TensorflowRenderer tensorflowRenderer = this.renderer;
        if (tensorflowRenderer != null) {
            tensorflowRenderer.setSize(size);
        } else {
            this.frameSize = new IntPair(size.getWidth(), size.getHeight());
        }
    }

    public void setUseMovementPrediction(boolean z) {
        this.composer.setUseMovementPrediction(z);
    }
}
