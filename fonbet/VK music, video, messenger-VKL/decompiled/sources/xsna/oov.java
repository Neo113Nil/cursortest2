package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;

/* compiled from: ISticker.kt */
/* loaded from: classes5.dex */
public interface oov {
    void a(float f);

    float b();

    float c();

    boolean d();

    void e(float f);

    float f();

    void g(float f);

    float getBottom();

    float getCenterX();

    float getCenterY();

    PointF[] getFillPoints();

    boolean getInDraggingMode();

    boolean getInEditMode();

    float getLeft();

    float getRight();

    float getTop();

    Matrix getTransformMatrix();

    void h(float f, float f2);

    void i(float f);

    boolean isVisible();

    boolean j(PointF[] pointFArr, float f, float f2);

    float k();

    PointF[] l();

    void m(oov oovVar);

    void n(boolean z);

    q500 o();

    void p(q500 q500Var);

    void setInEditMode(boolean z);

    void setRemovable(boolean z);

    void setStatic(boolean z);

    void setVisible(boolean z);

    boolean v0();

    void w0(float f, float f2);

    void y0(float f, float f2, float f3, boolean z);
}
