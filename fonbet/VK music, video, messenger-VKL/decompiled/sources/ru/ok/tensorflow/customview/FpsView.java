package ru.ok.tensorflow.customview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import ru.ok.tensorflow.customview.OverlayView;
import ru.ok.tensorflow.visualization.BorderedText;

/* loaded from: classes9.dex */
public class FpsView implements OverlayView.DrawCallback {
    private final BorderedText borderedText;
    private final Paint boxPaint;
    private volatile boolean fhd;
    private volatile int fps;
    private long lastFpsCall;
    private final OverlayView overlayView;
    private StringBuilder text;
    private long timeCollector;
    private int timeCounter;
    private final int GREEN_LIMIT = 23;
    private final int YELLOW_LIMIT = 15;
    private final int FPS_COUNTS_PER_UPDATE = 5;

    public FpsView(OverlayView overlayView) {
        Paint paint = new Paint();
        this.boxPaint = paint;
        this.fps = -1;
        this.lastFpsCall = -1L;
        this.timeCollector = 0L;
        this.timeCounter = 0;
        this.fhd = false;
        this.text = new StringBuilder();
        this.overlayView = overlayView;
        paint.setColor(-16711936);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeMiter(100.0f);
        this.borderedText = new BorderedText(TypedValue.applyDimension(1, 18.0f, overlayView.getContext().getResources().getDisplayMetrics()));
        overlayView.addCallback(this);
    }

    @Override // ru.ok.tensorflow.customview.OverlayView.DrawCallback
    public void draw(@NonNull Canvas canvas) {
        int i = this.fps;
        if (i == -1) {
            return;
        }
        this.boxPaint.setColor(i < 15 ? -65536 : i < 23 ? -256 : -16711936);
        this.text.setLength(0);
        boolean z = this.fhd;
        StringBuilder sb = this.text;
        sb.append("Fps: ");
        sb.append(i);
        sb.append(", fhd: ");
        sb.append(z ? "on" : "off");
        this.borderedText.drawText(canvas, 30.0f, 400.0f, this.text.toString(), this.boxPaint);
    }

    public void release() {
        this.overlayView.removeCallback(this);
    }

    public void updateFps() {
        if (this.lastFpsCall == -1) {
            this.lastFpsCall = System.nanoTime() / 1000000;
            return;
        }
        long nanoTime = System.nanoTime() / 1000000;
        long max = Math.max(0L, nanoTime - this.lastFpsCall) + this.timeCollector;
        this.timeCollector = max;
        int i = this.timeCounter + 1;
        this.timeCounter = i;
        if (i % 5 == 0) {
            this.timeCounter = 0;
            this.fps = Math.round(1000.0f / ((max * 1.0f) / 5.0f));
            this.timeCollector = 0L;
        }
        this.lastFpsCall = nanoTime;
    }

    public void updateQuality(boolean z) {
        this.fhd = z;
    }
}
