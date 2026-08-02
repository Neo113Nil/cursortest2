package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.er9;

/* compiled from: MembersScreen.kt */
/* loaded from: classes5.dex */
public final class us9 extends lg90 {
    public final u890 g;
    public final long h;
    public final lg90 i;

    public us9(u890 u890Var, long j, lg90 lg90Var) {
        this.g = u890Var;
        this.h = j;
        this.i = lg90Var;
    }

    @Override // xsna.lg90
    public final long i() {
        return 9205357640488583168L;
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        oio.P(oioVar, this.h, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        LayoutDirection layoutDirection = oioVar.getLayoutDirection();
        u890 u890Var = this.g;
        float I0 = oioVar.I0(u890Var.c(layoutDirection));
        float f = u890Var.b;
        float I02 = oioVar.I0(f);
        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32)) - oioVar.I0(u890Var.a(oioVar.getLayoutDirection()) + u890Var.c(oioVar.getLayoutDirection()));
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) - oioVar.I0(f)) - oioVar.I0(u890Var.d);
        er9.b a0 = oioVar.a0();
        long d = a0.d();
        a0.a().e();
        try {
            a0.a.l(I0, I02);
            lg90.h(this.i, oioVar, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), null, 6);
        } finally {
            nq.b(a0, d);
        }
    }
}
