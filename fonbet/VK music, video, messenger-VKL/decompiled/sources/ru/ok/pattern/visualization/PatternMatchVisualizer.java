package ru.ok.pattern.visualization;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.opencv.calib3d.Calib3d;
import org.opencv.core.Mat;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.pattern.entity.PatternMatch;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.util.ImageUtils;
import ru.ok.tensorflow.util.Logger;
import ru.ok.tensorflow.util.MatUtils;
import ru.ok.tensorflow.visualization.BorderedText;
import xsna.cr90;
import xsna.flb0;
import xsna.hlb0;
import xsna.qk10;
import xsna.sk10;
import xsna.tj0;
import xsna.tk10;

/* loaded from: classes9.dex */
public class PatternMatchVisualizer implements OverlayView.DrawCallback {
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
    private List<PatternMatch> results;

    public static final class Builder {
        final Context context;
        final Logger logger;
        OverlayView overlayView;
        float textSizeDp = 18.0f;

        public Builder(@NonNull Context context, @NonNull Logger logger) {
            this.context = context;
            this.logger = logger;
        }

        public PatternMatchVisualizer build() {
            return new PatternMatchVisualizer(this);
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
        List<PatternMatch> list = this.results;
        if (list == null) {
            return;
        }
        for (PatternMatch patternMatch : list) {
            Mat eulerAngles2rotationMat = MatUtils.eulerAngles2rotationMat(new float[]{patternMatch.angleX, patternMatch.angleY, patternMatch.angleZ});
            Mat mat = patternMatch.tvec;
            Mat i = Mat.i();
            double d = 800.0f;
            i.q(0, 0, d);
            i.q(1, 1, d);
            i.q(0, 2, 216.0d);
            i.q(1, 2, 439.0d);
            Mat multiplyMatrices = MatUtils.multiplyMatrices(ImageUtils.matrix2Mat(this.frameToCanvasTransform, 6), i);
            RectF rectF = new RectF(patternMatch.areaDetection.transform(this.frameToCanvasTransform).getRect());
            this.boxPaint.setColor(-256);
            canvas.drawRect(rectF, this.boxPaint);
            RectF rectF2 = new RectF(patternMatch.patternDetection.transform(this.frameToCanvasTransform).getRect());
            this.boxPaint.setColor(-16711936);
            canvas.drawRect(rectF2, this.boxPaint);
            drawAxes(eulerAngles2rotationMat, mat, multiplyMatrices, canvas);
        }
    }

    public void drawAxes(Mat mat, Mat mat2, Mat mat3, Canvas canvas) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new flb0(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
        arrayList.add(new flb0(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d));
        arrayList.add(new flb0(1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
        arrayList.add(new flb0(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
        tk10 tk10Var = new tk10();
        tk10Var.A(arrayList);
        sk10 sk10Var = new sk10();
        Mat mat4 = new Mat();
        Calib3d.a(mat, mat4);
        Calib3d.c(mat4, mat2, mat3, new qk10(), sk10Var, tk10Var);
        int x = (int) sk10Var.x();
        hlb0[] hlb0VarArr = new hlb0[x];
        if (x != 0) {
            sk10Var.l(new float[x * 2]);
            for (int i = 0; i < x; i++) {
                int i2 = i * 2;
                hlb0VarArr[i] = new hlb0(r5[i2], r5[i2 + 1]);
            }
        }
        List asList = Arrays.asList(hlb0VarArr);
        hlb0 hlb0Var = (hlb0) asList.get(0);
        hlb0 hlb0Var2 = (hlb0) asList.get(1);
        hlb0 hlb0Var3 = (hlb0) asList.get(2);
        hlb0 hlb0Var4 = (hlb0) asList.get(3);
        this.boxPaint.setColor(-16776961);
        double d = hlb0Var.a;
        float f = (float) hlb0Var.b;
        canvas.drawLine((float) d, f, (float) hlb0Var3.a, (float) hlb0Var3.b, this.boxPaint);
        this.boxPaint.setColor(-256);
        float f2 = (float) d;
        canvas.drawLine(f2, f, (float) hlb0Var4.a, (float) hlb0Var4.b, this.boxPaint);
        this.boxPaint.setColor(-65536);
        canvas.drawLine(f2, f, (float) hlb0Var2.a, (float) hlb0Var2.b, this.boxPaint);
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

    public void setResults(@NonNull List<PatternMatch> list) {
        this.dispatcher.obtainMessage(1, list).sendToTarget();
    }

    private PatternMatchVisualizer(Builder builder) {
        Handler handler = new Handler(Looper.getMainLooper(), new cr90(this, 0));
        this.dispatcher = handler;
        Paint paint = new Paint();
        this.boxPaint = paint;
        this.results = Collections.EMPTY_LIST;
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
