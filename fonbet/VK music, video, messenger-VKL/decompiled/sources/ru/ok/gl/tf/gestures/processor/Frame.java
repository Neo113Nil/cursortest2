package ru.ok.gl.tf.gestures.processor;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import ru.ok.gl.tf.gestures.Figure;

/* loaded from: classes9.dex */
interface Frame<G> extends Figure<G> {
    long getId();

    long getLeftId();

    @NonNull
    RectF getRawRect();

    @NonNull
    RectF getRect();

    Matrix getRectTransform();

    long getRightId();

    void release();

    void setBoundsRect(float f, float f2, float f3, float f4);

    void setGesture(G g);

    void setGestureAngle(float f);

    void setGestureColor(int i);

    void setKeepRawRectSize(boolean z);

    void setLastGesture(@NonNull G g);

    void setLeftId(long j);

    void setLeftRect(@NonNull RectF rectF);

    void setPoints(@NonNull PointF pointF, @NonNull PointF pointF2, @NonNull PointF pointF3, @NonNull PointF pointF4, @NonNull PointF pointF5);

    void setRawRect(@NonNull RectF rectF);

    void setRectTransform(Matrix matrix);

    void setRightId(long j);

    void setRightRect(@NonNull RectF rectF);

    void setStraighGestureAngle(float f);
}
