package xsna;

import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InternalDropdown.kt */
/* loaded from: classes17.dex */
public final class f820 implements r5j0 {
    public final r5j0 a;
    public final float b;
    public final boolean c;

    public f820(r5j0 r5j0Var, float f, boolean z) {
        this.a = r5j0Var;
        this.b = f;
        this.c = z;
    }

    @Override // xsna.r5j0
    public final androidx.compose.ui.graphics.c a(long j, LayoutDirection layoutDirection, azl azlVar) {
        zhf0 e;
        androidx.compose.ui.graphics.c a = this.a.a(j, layoutDirection, azlVar);
        boolean z = this.c;
        float f = this.b;
        if (z) {
            int i = (int) (j & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat(i) - (Float.intBitsToFloat(i) * f);
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat3 = Float.intBitsToFloat(i);
            e = p490.d((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32));
        } else {
            e = p490.e(0L, mxj0.a(j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (4294967295L & j)) * f, 1));
        }
        zhf0 zhf0Var = e;
        if ((a instanceof c.a) || (a instanceof c.b)) {
            return new c.b(zhf0Var);
        }
        if (!(a instanceof c.C0013c)) {
            throw new NoWhenBranchMatchedException();
        }
        aog0 aog0Var = ((c.C0013c) a).a;
        return new c.C0013c(ne7.e(zhf0Var, aog0Var.e, aog0Var.f, aog0Var.g, aog0Var.h));
    }
}
