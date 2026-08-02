package xsna;

import android.animation.TypeEvaluator;
import android.util.Size;

/* compiled from: SizeEvaluator.kt */
/* loaded from: classes2.dex */
public final class sxj0 implements TypeEvaluator<Size> {
    @Override // android.animation.TypeEvaluator
    public final Size evaluate(float f, Size size, Size size2) {
        Size size3 = size;
        Size size4 = size2;
        return new Size((int) (((size4.getWidth() - size3.getWidth()) * f) + size3.getWidth()), (int) (((size4.getHeight() - size3.getHeight()) * f) + size3.getHeight()));
    }
}
