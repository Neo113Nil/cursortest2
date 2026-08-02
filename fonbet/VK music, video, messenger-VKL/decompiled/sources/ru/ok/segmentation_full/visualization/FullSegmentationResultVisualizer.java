package ru.ok.segmentation_full.visualization;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import ru.ok.segmentation_full.visualization.FullSegmentationResultVisualizer;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.util.ImageUtils;
import ru.ok.tensorflow.util.Logger;
import ru.ok.tensorflow.visualization.BorderedText;
import xsna.tj0;

/* loaded from: classes9.dex */
public class FullSegmentationResultVisualizer implements OverlayView.DrawCallback {
    private static final int MSG_FRAME_SIZE = 0;
    private static final int MSG_RECOGNITIONS = 1;
    private static final int MSG_VISIBILITY = 2;
    private final BorderedText borderedText;
    private final Paint boxPaint;
    private int canvasHeight;
    private int canvasWidth;
    private final Handler dispatcher;
    private int frameHeight;
    private Matrix frameToCanvasTransform;
    private int frameWidth;
    private volatile boolean isDrawDisabled;
    private boolean isInitialized;
    private final Logger logger;
    private final OverlayView overlayView;
    private Bitmap result;

    public static final class Builder {
        final Context context;
        final Logger logger;
        OverlayView overlayView;
        float textSizeDp = 18.0f;

        public Builder(@NonNull Context context, @NonNull Logger logger) {
            this.context = context;
            this.logger = logger;
        }

        public FullSegmentationResultVisualizer build() {
            return new FullSegmentationResultVisualizer(this);
        }

        public Builder setOverlayView(OverlayView overlayView) {
            this.overlayView = overlayView;
            return this;
        }

        public Builder setTextSizeDp(float f) {
            this.textSizeDp = f;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean accept(Message message) {
        int i = message.what;
        if (i == 0) {
            updateFrameToCanvasTransform(message.arg1, message.arg2, this.canvasWidth, this.canvasHeight);
        } else if (i == 1) {
            this.result = (Bitmap) message.obj;
            this.overlayView.invalidate();
        } else if (i == 2) {
            this.overlayView.setVisibility(message.arg1);
        }
        return true;
    }

    private void updateFrameToCanvasTransform(int i, int i2, int i3, int i4) {
        this.canvasHeight = i4;
        this.canvasWidth = i3;
        this.frameHeight = i2;
        this.frameWidth = i;
        this.frameToCanvasTransform = ImageUtils.getTransformationMatrix(i, i2, i3, i4, false, false, true);
    }

    @Override // ru.ok.tensorflow.customview.OverlayView.DrawCallback
    public void draw(Canvas canvas) {
        if (this.isDrawDisabled) {
            return;
        }
        updateFrameToCanvasTransform(this.frameWidth, this.frameHeight, canvas.getWidth(), canvas.getHeight());
        if (this.result != null) {
            this.boxPaint.setAlpha(128);
            canvas.drawBitmap(this.result, this.frameToCanvasTransform, this.boxPaint);
            this.boxPaint.setAlpha(255);
        }
    }

    public void release() {
        this.dispatcher.obtainMessage(2, 4).sendToTarget();
        this.overlayView.removeCallback(this);
    }

    public void setDrawEnabled(boolean z) {
        this.isDrawDisabled = !z;
    }

    public void setFrameSize(int i, int i2) {
        this.dispatcher.obtainMessage(0, i, i2).sendToTarget();
    }

    public void setInitialized(boolean z) {
        this.isInitialized = z;
    }

    public void setResults(@NonNull Bitmap bitmap) {
        this.dispatcher.obtainMessage(1, bitmap).sendToTarget();
    }

    private FullSegmentationResultVisualizer(Builder builder) {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: xsna.kws
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean accept;
                accept = FullSegmentationResultVisualizer.this.accept(message);
                return accept;
            }
        });
        this.dispatcher = handler;
        Paint paint = new Paint();
        this.boxPaint = paint;
        this.logger = builder.logger;
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeMiter(100.0f);
        this.borderedText = new BorderedText(tj0.a(1, builder.textSizeDp, builder.context));
        OverlayView overlayView = builder.overlayView;
        this.overlayView = overlayView;
        overlayView.addCallback(this);
        handler.obtainMessage(2, 0).sendToTarget();
    }
}
