package ru.ok.face.visualization;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.opencv.calib3d.Calib3d;
import org.opencv.core.Mat;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.visualization.FaceFigureVisualizer;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.ImageUtils;
import ru.ok.tensorflow.util.Logger;
import ru.ok.tensorflow.util.MatUtils;
import ru.ok.tensorflow.visualization.BorderedText;
import xsna.flb0;
import xsna.hlb0;
import xsna.qk10;
import xsna.sk10;
import xsna.tj0;
import xsna.tk10;

/* loaded from: classes9.dex */
public class FaceFigureVisualizer implements OverlayView.DrawCallback {
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
    private List<FaceFigure> results;

    public static final class Builder {
        final Context context;
        final Logger logger;
        OverlayView overlayView;
        float textSizeDp = 5.0f;

        public Builder(@NonNull Context context, @NonNull Logger logger) {
            this.context = context;
            this.logger = logger;
        }

        public FaceFigureVisualizer build() {
            return new FaceFigureVisualizer(this);
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
            this.results = (List) message.obj;
            this.overlayView.invalidate();
        } else if (i == 2) {
            this.overlayView.setVisibility(message.arg1);
        }
        return true;
    }

    private hlb0 computePointProjection(double d, double d2, float[] fArr, float[] fArr2, float f) {
        double radians = Math.toRadians(d);
        double d3 = ((d2 / 80.0d) + 1.5d) * f;
        double cos = (d3 / Math.cos(radians)) + (Math.cos(radians) * (((Math.tan(radians) + 1.0d) * d3) - (d3 / Math.pow(Math.cos(radians), 2.0d))));
        float f2 = fArr2[0];
        return new hlb0(fArr[0] + (((f2 - r7) / (r11 - fArr2[1])) * cos), fArr[1] - cos);
    }

    private float correctPitch(float[] fArr, float[] fArr2) {
        double d;
        double d2;
        double d3;
        double d4;
        float f;
        double d5 = fArr[0];
        float[] fArr3 = {fArr2[4], fArr2[5]};
        float[] fArr4 = {(fArr2[8] + fArr2[10]) / 2.0f, (fArr2[9] + fArr2[11]) / 2.0f};
        double d6 = 2.0d;
        float sqrt = (float) Math.sqrt(Math.pow(fArr2[3] - fArr2[1], 2.0d) + Math.pow(fArr2[2] - fArr2[0], 2.0d));
        double abs = Math.abs(fArr[1]);
        float[] fArr5 = fArr3;
        if (computePointProjection(d5, abs, fArr5, fArr4, sqrt).b - fArr4[1] >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            d = 0.0d;
            d2 = 0.0d;
            d3 = 2.0f + d5;
            d4 = 1000.0d;
            f = 2.0f;
        } else {
            d = 0.0d;
            d2 = 0.0d;
            d3 = d5;
            d4 = 1000.0d;
            f = -2.0f;
            d5 = (-2.0f) + d5;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 > 1000) {
                break;
            }
            if (Math.abs(d5 - d3) <= 1.0d && i2 > 0) {
                d2 = (d5 + d3) / d6;
                break;
            }
            double d7 = abs;
            float[] fArr6 = fArr5;
            double d8 = d5;
            double d9 = d6;
            double d10 = computePointProjection(d8, d7, fArr6, fArr4, sqrt).b - fArr4[1];
            int i4 = i2;
            double d11 = computePointProjection(d3, d7, fArr6, fArr4, sqrt).b - fArr4[1];
            if (Math.abs(d4) >= Math.abs(d10)) {
                d2 = d8;
                d4 = d10;
            }
            if (d11 * d10 >= d) {
                double d12 = f;
                d5 = d8 + d12;
                d3 += d12;
                i2 = i4;
            } else {
                int i5 = i4 + 1;
                double d13 = (d8 + d3) / d9;
                if ((computePointProjection(d13, d7, fArr6, fArr4, sqrt).b - fArr4[1]) * d10 >= d) {
                    i2 = i5;
                    d5 = d13;
                } else {
                    i2 = i5;
                    d5 = d8;
                    d3 = d13;
                }
            }
            abs = d7;
            fArr5 = fArr6;
            d6 = d9;
            i = i3;
        }
        return (float) d2;
    }

    private void drawKeyPoint(Canvas canvas, Detection detection, int i) {
        PointF keypoint = detection.getKeypoint(i);
        canvas.drawPoint(keypoint.x, keypoint.y, this.boxPaint);
        this.borderedText.drawText(canvas, keypoint.x, keypoint.y, String.valueOf(i), this.boxPaint);
    }

    private Mat faceOrientation(float[] fArr, float[] fArr2, Mat mat) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new hlb0(fArr[326], fArr[327]));
        arrayList.add(new hlb0(fArr[780], fArr[781]));
        arrayList.add(new hlb0(fArr[16], fArr[17]));
        arrayList.add(new hlb0(fArr[36], fArr[37]));
        arrayList.add(new hlb0(fArr[476], fArr[477]));
        arrayList.add(new hlb0(fArr[916], fArr[917]));
        sk10 sk10Var = new sk10();
        sk10Var.A(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < fArr2.length; i += 3) {
            arrayList2.add(new flb0(fArr2[i], fArr2[i + 1], fArr2[i + 2]));
        }
        tk10 tk10Var = new tk10();
        tk10Var.A(arrayList2);
        qk10 qk10Var = new qk10(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        Mat mat2 = new Mat(3, 1, 6);
        Calib3d.d(mat, mat2, new Mat(3, 1, 6), qk10Var, sk10Var, tk10Var);
        Mat mat3 = new Mat();
        Calib3d.a(mat2, mat3);
        return mat3;
    }

    private float[] toDegrees(float[] fArr) {
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = (float) Math.toDegrees(fArr[i]);
        }
        return fArr2;
    }

    private float[] toRadians(float[] fArr) {
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = (float) Math.toRadians(fArr[i]);
        }
        return fArr2;
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
        Canvas canvas2;
        if (this.isDrawDisabled) {
            return;
        }
        updateFrameToCanvasTransform(this.frameWidth, this.frameHeight, canvas.getWidth(), canvas.getHeight());
        if (this.isInitialized) {
            canvas2 = canvas;
        } else {
            this.boxPaint.setColor(-65536);
            canvas2 = canvas;
            this.borderedText.drawText(canvas2, 30.0f, 180.0f, "Head segmentation: GPU initializing...", this.boxPaint);
        }
        List<FaceFigure> list = this.results;
        if (list == null) {
            return;
        }
        int i = 0;
        for (FaceFigure faceFigure : list) {
            i++;
            if (i % 2 == 0) {
                this.boxPaint.setColor(-65536);
            } else {
                this.boxPaint.setColor(-16711936);
            }
            Detection addLocations = faceFigure.detection.addLocations(faceFigure.mesh);
            Detection transform = addLocations.transform(this.frameToCanvasTransform);
            for (int i2 = 0; i2 < transform.getNumKeypoints(); i2++) {
                drawKeyPoint(canvas2, transform, i2);
            }
            canvas2.drawRect(transform.getRect(), this.boxPaint);
            addLocations.getCenterPoint();
            transform.getCenterPoint();
        }
    }

    public void drawAxes(Mat mat, Matrix matrix, Canvas canvas, float f, float f2, float f3) {
        double d = -f3;
        boolean z = false;
        char c = 7;
        double[] dArr = {ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, d, f3, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE};
        Mat mat2 = new Mat(4, 3, 6);
        mat2.q(0, 0, dArr);
        Mat w = MatUtils.multiplyMatrices(mat, mat2.w()).w();
        int v = w.v() * 3;
        double[] dArr2 = new double[v];
        w.k(dArr2);
        float[] fArr = new float[w.v() * 2];
        int i = 0;
        while (i < v / 3) {
            int i2 = i * 3;
            char c2 = c;
            int i3 = i;
            double d2 = dArr2[i2];
            boolean z2 = z;
            double d3 = dArr2[i2 + 1];
            int i4 = i3 * 2;
            fArr[i4] = (float) d2;
            fArr[i4 + 1] = (float) d3;
            i = i3 + 1;
            c = c2;
            z = z2;
        }
        char c3 = c;
        matrix.mapPoints(fArr);
        double d4 = fArr[z ? 1 : 0];
        double d5 = fArr[1];
        double d6 = fArr[2];
        double d7 = fArr[3];
        double d8 = fArr[4];
        double d9 = fArr[5];
        double d10 = fArr[6];
        double d11 = fArr[c3];
        this.boxPaint.setColor(-16776961);
        double d12 = f;
        float f4 = (float) (d12 + d4);
        double d13 = f2;
        float f5 = (float) (d5 + d13);
        canvas.drawLine(f4, f5, (float) (d12 + d8), (float) (d9 + d13), this.boxPaint);
        this.boxPaint.setColor(-256);
        canvas.drawLine(f4, f5, (float) (d12 + d10), (float) (d13 + d11), this.boxPaint);
        this.boxPaint.setColor(-65536);
        canvas.drawLine(f4, f5, (float) (d12 + d6), (float) (d13 + d7), this.boxPaint);
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

    public void setResults(@NonNull List<FaceFigure> list) {
        this.dispatcher.obtainMessage(1, list).sendToTarget();
    }

    private FaceFigureVisualizer(Builder builder) {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: xsna.mhq
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean accept;
                accept = FaceFigureVisualizer.this.accept(message);
                return accept;
            }
        });
        this.dispatcher = handler;
        Paint paint = new Paint();
        this.boxPaint = paint;
        this.results = Collections.EMPTY_LIST;
        this.logger = builder.logger;
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5.0f);
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
