package ru.ok.gl.tf.gestures;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface Figure<G> {
    float getAngle();

    void getBoundsRect(@NonNull RectF rectF);

    int getColor();

    void getForeFingerBase(PointF pointF);

    void getForefinger(PointF pointF);

    @NonNull
    G getGesture();

    @NonNull
    G getLastGesture();

    void getLeftRightRects(@NonNull RectF rectF, @NonNull RectF rectF2);

    float getMaxRadius();

    void getMiddleFingerBase(PointF pointF);

    void getPalmBase(PointF pointF);

    void getRect(@NonNull RectF rectF);

    void getRingFingerBase(PointF pointF);
}
