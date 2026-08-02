package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.er9;

/* compiled from: BackgroundPainterWithOverflowImage.kt */
/* loaded from: classes18.dex */
public final class twn extends lg90 {
    public final rek0 g;
    public final lg90 h;
    public final float i;
    public final long j;

    public twn(rek0 rek0Var, lg90 lg90Var, float f, long j) {
        this.g = rek0Var;
        this.h = lg90Var;
        this.i = f;
        this.j = j;
    }

    @Override // xsna.lg90
    public final long i() {
        return 9205357640488583168L;
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        oio.x1(oioVar, this.g, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        LayoutDirection layoutDirection = oioVar.getLayoutDirection();
        float f = this.i;
        float I0 = oioVar.I0(f);
        float I02 = oioVar.I0(f);
        long j = this.j;
        float I03 = oioVar.I0(rco.a(j));
        float I04 = oioVar.I0(rco.b(j));
        float intBitsToFloat = layoutDirection == LayoutDirection.Ltr ? (Float.intBitsToFloat((int) (oioVar.d() >> 32)) - I0) + I03 : -I03;
        er9.b a0 = oioVar.a0();
        long d = a0.d();
        a0.a().e();
        try {
            fr9 fr9Var = a0.a;
            fr9Var.l(intBitsToFloat, (Float.intBitsToFloat((int) (((er9.b) fr9Var.b).d() & 4294967295L)) - I02) + I04);
            lg90.h(this.h, oioVar, (Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L), null, 6);
        } finally {
            nq.b(a0, d);
        }
    }
}
