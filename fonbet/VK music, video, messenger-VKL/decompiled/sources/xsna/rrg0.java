package xsna;

import xsna.tra0;

/* compiled from: Ruler.kt */
/* loaded from: classes11.dex */
public final class rrg0 {
    public static final float a(tra0.a aVar, boolean z, qrg0[] qrg0VarArr, float f) {
        float f2 = Float.NaN;
        for (qrg0 qrg0Var : qrg0VarArr) {
            float e = aVar.e(qrg0Var);
            if (!Float.isNaN(f2)) {
                int i = z != (e > f2) ? i + 1 : 0;
            }
            f2 = e;
        }
        return Float.isNaN(f2) ? f : f2;
    }
}
