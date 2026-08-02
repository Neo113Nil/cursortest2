package ru.ok.tensorflow.visualization;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.entity.CompositeRecognition;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.gesture.GestureManager;
import ru.ok.tensorflow.gesture.HeartGestureAssembler;
import ru.ok.tensorflow.util.ImageUtils;
import xsna.b440;
import xsna.tj0;

/* loaded from: classes9.dex */
public class MultiBoxVisualizer implements OverlayView.DrawCallback {
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
    private HeartGestureAssembler heartGestureAssembler;
    private volatile boolean isDrawDisabled;
    private boolean isInitialized;
    private final OverlayView overlayView;
    private final GestureColorer recognitionColorer;
    private List<List<Recognition>> recognitionTrack;
    private List<Recognition> recognitions;
    private Bitmap traceBitmap;
    private Canvas traceCanvas;
    private int trackMaxLength;

    public static final class Builder {
        final Context context;
        GestureColorer gestureColorer;
        OverlayView overlayView;
        float textSizeDp = 18.0f;

        public Builder(@NonNull Context context) {
            this.context = context;
        }

        public MultiBoxVisualizer build() {
            if (this.gestureColorer == null || this.overlayView == null) {
                throw new IllegalStateException();
            }
            return new MultiBoxVisualizer(this);
        }

        public Builder setGestureColorer(GestureColorer gestureColorer) {
            this.gestureColorer = gestureColorer;
            return this;
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

    public interface GestureColorer {
        int getColor(@NonNull Gesture gesture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean accept(Message message) {
        int i;
        int i2 = message.what;
        if (i2 == 0) {
            updateFrameToCanvasTransform(message.arg1, message.arg2, this.canvasWidth, this.canvasHeight);
            int i3 = this.canvasWidth;
            if (i3 > 0 && (i = this.canvasHeight) > 0) {
                initializeTrace(i3, i);
            }
        } else if (i2 == 1) {
            List<Recognition> list = (List) message.obj;
            this.recognitions = list;
            updateRecognitionTrack(list);
            this.overlayView.invalidate();
        } else if (i2 == 2) {
            this.overlayView.setVisibility(message.arg1);
        }
        return true;
    }

    private Map<Long, List<Recognition>> getRecognitionTraces(List<List<Recognition>> list) {
        HashMap hashMap = new HashMap();
        Iterator<List<Recognition>> it = list.iterator();
        while (it.hasNext()) {
            for (Recognition recognition : it.next()) {
                long j = recognition.id;
                if (!hashMap.containsKey(Long.valueOf(j))) {
                    hashMap.put(Long.valueOf(j), new ArrayList());
                }
                ((List) hashMap.get(Long.valueOf(j))).add(recognition);
            }
        }
        return hashMap;
    }

    private void initializeTrace(int i, int i2) {
        this.traceBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.traceCanvas = new Canvas(this.traceBitmap);
    }

    private void updateFrameToCanvasTransform(int i, int i2, int i3, int i4) {
        this.canvasHeight = i4;
        this.canvasWidth = i3;
        this.frameHeight = i2;
        this.frameWidth = i;
        this.frameToCanvasTransform = ImageUtils.getTransformationMatrix(i, i2, i3, i4, false, false, true);
    }

    private void updateRecognitionTrack(List<Recognition> list) {
        this.recognitionTrack.add(list);
        while (this.recognitionTrack.size() > this.trackMaxLength) {
            this.recognitionTrack.remove(0);
        }
    }

    @Override // ru.ok.tensorflow.customview.OverlayView.DrawCallback
    public void draw(Canvas canvas) {
        Canvas canvas2;
        if (this.isDrawDisabled) {
            return;
        }
        updateFrameToCanvasTransform(this.frameWidth, this.frameHeight, canvas.getWidth(), canvas.getHeight());
        if (this.isInitialized) {
            canvas2 = canvas;
        } else {
            this.boxPaint.setColor(-65536);
            this.borderedText.drawText(canvas, 30.0f, 120.0f, "Hand recognition: GPU initializing...", this.boxPaint);
            canvas2 = canvas;
        }
        List<Recognition> list = this.recognitions;
        if (list == null) {
            return;
        }
        for (Recognition recognition : list) {
            Gesture recognitionToGesture = GestureManager.recognitionToGesture(recognition);
            if (this.recognitionColorer.getColor(recognitionToGesture) != 0) {
                this.boxPaint.setColor(this.recognitionColorer.getColor(recognitionToGesture));
                RectF rectF = new RectF(recognition.detection.getRect());
                this.frameToCanvasTransform.mapRect(rectF);
                Detection transform = recognition.detection.transform(this.frameToCanvasTransform);
                for (int i = 0; i < transform.getNumKeypoints(); i++) {
                    PointF keypoint = transform.getKeypoint(i);
                    canvas2.drawCircle(keypoint.x, keypoint.y, 3.0f, this.boxPaint);
                }
                Matrix matrix = new Matrix();
                matrix.postScale(transform.getSize(), transform.getSize());
                matrix.postRotate(-transform.angleDegrees.floatValue());
                PointF centerPoint = transform.getCenterPoint();
                matrix.postTranslate(centerPoint.x, centerPoint.y);
                float[] fArr = {0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                matrix.mapPoints(fArr);
                canvas2.drawLine(fArr[0], fArr[1], fArr[2], fArr[3], this.boxPaint);
                float min = Math.min(rectF.width(), rectF.height()) / 16.0f;
                canvas2.drawRoundRect(rectF, min, min, this.boxPaint);
                this.borderedText.drawText(canvas, rectF.left + min, rectF.top, String.format("[%s]<%s> %s %.2f", ("" + recognition.id).substring(1, 4), transform.angleDegrees, recognitionToGesture, recognition.confidence), this.boxPaint);
                canvas2 = canvas;
            }
        }
        List<CompositeRecognition> assembleHearts = this.heartGestureAssembler.assembleHearts(this.recognitions, canvas2);
        this.boxPaint.setColor(-256);
        for (CompositeRecognition compositeRecognition : assembleHearts) {
            float[] fArr2 = compositeRecognition.center;
            float f = compositeRecognition.size;
            this.frameToCanvasTransform.mapPoints(fArr2);
            canvas2.drawCircle(fArr2[0], fArr2[1], f * 0.5f, this.boxPaint);
            Matrix matrix2 = new Matrix();
            matrix2.postRotate(compositeRecognition.rotationDegrees);
            matrix2.postTranslate(fArr2[0], fArr2[1]);
            float[] fArr3 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-f) * 0.5f};
            matrix2.mapPoints(fArr3);
            canvas2.drawLine(fArr3[0], fArr3[1], fArr3[2], fArr3[3], this.boxPaint);
        }
        for (int i2 = 0; i2 < this.recognitionTrack.size(); i2++) {
            Iterator<Recognition> it = this.recognitionTrack.get(i2).iterator();
            while (it.hasNext()) {
                Detection transform2 = it.next().detection.transform(this.frameToCanvasTransform);
                PointF keypoint2 = transform2.getKeypoint(transform2.getNumKeypoints() - 1);
                canvas2.drawCircle(keypoint2.x, keypoint2.y, 3.0f, this.boxPaint);
            }
        }
        for (List<Recognition> list2 : getRecognitionTraces(this.recognitionTrack).values()) {
            if (list2.size() > 1) {
                int i3 = 0;
                while (i3 < list2.size() - 1) {
                    Recognition recognition2 = list2.get(i3);
                    int i4 = i3 + 1;
                    Recognition recognition3 = list2.get(i4);
                    Detection transform3 = recognition2.detection.transform(this.frameToCanvasTransform);
                    Detection transform4 = recognition3.detection.transform(this.frameToCanvasTransform);
                    PointF keypoint3 = transform3.getKeypoint(transform3.getNumKeypoints() - 1);
                    PointF keypoint4 = transform4.getKeypoint(transform4.getNumKeypoints() - 1);
                    canvas2.drawLine(keypoint3.x, keypoint3.y, keypoint4.x, keypoint4.y, this.boxPaint);
                    canvas2 = canvas;
                    i3 = i4;
                }
            }
            canvas2 = canvas;
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

    public void setRecognitions(@NonNull List<Recognition> list) {
        this.dispatcher.obtainMessage(1, list).sendToTarget();
    }

    private MultiBoxVisualizer(Builder builder) {
        this.recognitionTrack = new ArrayList();
        this.trackMaxLength = 60;
        this.heartGestureAssembler = new HeartGestureAssembler(this);
        Handler handler = new Handler(Looper.getMainLooper(), new b440(this, 0));
        this.dispatcher = handler;
        Paint paint = new Paint();
        this.boxPaint = paint;
        this.recognitions = Collections.EMPTY_LIST;
        this.recognitionColorer = builder.gestureColorer;
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
