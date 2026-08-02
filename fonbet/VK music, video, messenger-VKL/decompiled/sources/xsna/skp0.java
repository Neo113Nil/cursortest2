package xsna;

import android.graphics.Matrix;

/* compiled from: TransformableElement.kt */
/* loaded from: classes4.dex */
public interface skp0 extends uap {
    Matrix c();

    default boolean e(float f, float f2) {
        return c().postTranslate(f, f2);
    }

    default boolean f(float f, float f2, float f3) {
        return c().postScale(f, f, f2, f3);
    }

    default boolean g(float f, float f2, float f3) {
        return c().postRotate(f, f2, f3);
    }
}
