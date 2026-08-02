package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class r630 implements izs {
    public final /* synthetic */ y18 b;
    public final /* synthetic */ float c;

    public /* synthetic */ r630(y18 y18Var, float f) {
        this.b = y18Var;
        this.c = f;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ggj ggjVar = (ggj) obj;
        ggjVar.s1();
        y18 y18Var = this.b;
        float I0 = ggjVar.I0(y18Var.a);
        yk8 yk8Var = y18Var.b;
        float f = 2;
        float f2 = I0 / f;
        float I02 = ggjVar.I0(this.c) * f;
        ggjVar.C(yk8Var, 180.0f, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(I02) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L), new frm0(I0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30));
        ggjVar.C(yk8Var, 270.0f, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ggjVar.d() >> 32)) - I02) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(I02) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L), new frm0(I0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30));
        ggjVar.V0(yk8Var, (Float.floatToRawIntBits(r11) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ggjVar.d() >> 32)) - r11) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), I0, (r17 & 64) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return s3q0.a;
    }
}
