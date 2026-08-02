package xsna;

import androidx.compose.ui.graphics.Path;

/* compiled from: ShapeContainingUtil.kt */
/* loaded from: classes11.dex */
public final class t5j0 {
    public static final boolean a(Path path, float f, float f2) {
        zhf0 zhf0Var = new zhf0(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        androidx.compose.ui.graphics.a a = androidx.compose.ui.graphics.b.a();
        a.g(zhf0Var, Path.Direction.CounterClockwise);
        androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
        a2.x(path, a, 1);
        boolean isEmpty = a2.a.isEmpty();
        a2.reset();
        a.reset();
        return !isEmpty;
    }

    public static final boolean b(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }
}
