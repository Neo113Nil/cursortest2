package ru.ok.gleffects.recognition;

import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes9.dex */
public class FigureData {
    private final String accGestureHandle;
    private final float angle;
    private final PointF forefinger;
    private final PointF forefingerBase;
    private final RectF gestureRect;
    private final RectF gestureRectLeft;
    private final RectF gestureRectRight;
    private final String lastGestureHandle;
    private final PointF middleFingerBase;
    private final PointF palmBase;
    private final PointF ringFingerBase;

    public FigureData(String str, String str2, RectF rectF, RectF rectF2, RectF rectF3, float f, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5) {
        RectF rectF4 = new RectF();
        this.gestureRect = rectF4;
        RectF rectF5 = new RectF();
        this.gestureRectLeft = rectF5;
        RectF rectF6 = new RectF();
        this.gestureRectRight = rectF6;
        PointF pointF6 = new PointF();
        this.forefinger = pointF6;
        PointF pointF7 = new PointF();
        this.forefingerBase = pointF7;
        PointF pointF8 = new PointF();
        this.middleFingerBase = pointF8;
        PointF pointF9 = new PointF();
        this.ringFingerBase = pointF9;
        PointF pointF10 = new PointF();
        this.palmBase = pointF10;
        this.accGestureHandle = str;
        this.lastGestureHandle = str2;
        rectF4.set(rectF);
        rectF5.set(rectF2);
        rectF6.set(rectF3);
        this.angle = f;
        pointF6.set(pointF);
        pointF7.set(pointF2);
        pointF8.set(pointF3);
        pointF9.set(pointF4);
        pointF10.set(pointF5);
    }

    public float getAngle() {
        return this.angle;
    }

    public String getAverageGestureHandle() {
        return this.accGestureHandle;
    }

    public float getForefingerBaseX() {
        return this.forefingerBase.x;
    }

    public float getForefingerBaseY() {
        return this.forefingerBase.y;
    }

    public float getForefingerX() {
        return this.forefinger.x;
    }

    public float getForefingerY() {
        return this.forefinger.y;
    }

    public RectF getGestureRect() {
        return this.gestureRect;
    }

    public RectF getGestureRectLeft() {
        return this.gestureRectLeft;
    }

    public RectF getGestureRectRight() {
        return this.gestureRectRight;
    }

    public String getLastGestureHandle() {
        return this.lastGestureHandle;
    }

    public float getMiddleFingerBaseX() {
        return this.middleFingerBase.x;
    }

    public float getMiddleFingerBaseY() {
        return this.middleFingerBase.y;
    }

    public float getPalmBaseX() {
        return this.palmBase.x;
    }

    public float getPalmBaseY() {
        return this.palmBase.y;
    }

    public float getRingFingerBaseX() {
        return this.ringFingerBase.x;
    }

    public float getRingFingerBaseY() {
        return this.ringFingerBase.y;
    }
}
