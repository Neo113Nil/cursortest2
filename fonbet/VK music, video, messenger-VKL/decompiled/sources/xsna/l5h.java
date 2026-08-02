package xsna;

import androidx.compose.ui.graphics.Path;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class l5h implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ l5h(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.P(ggjVar, this.c, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 3, 62);
                return s3q0.a;
            case 1:
                kw8 kw8Var = (kw8) obj;
                androidx.compose.ui.graphics.a a = androidx.compose.ui.graphics.b.a();
                a.a(kw8Var.getDensity() * 18.6f, kw8Var.getDensity() * 6.2f);
                a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kw8Var.getDensity() * 6.2f);
                a.b(kw8Var.getDensity() * 2.325f, kw8Var.getDensity() * 3.1f, kw8Var.getDensity() * 7.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kw8Var.getDensity() * 15.95f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                a.c(kw8Var.getDensity() * 18.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                a.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kw8Var.getDensity() * 6.2f);
                a.close();
                androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
                a2.g(new zhf0(kw8Var.getDensity() * 18.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) - (kw8Var.getDensity() * 15.95f), Float.intBitsToFloat((int) (kw8Var.b.d() & 4294967295L))), Path.Direction.CounterClockwise);
                androidx.compose.ui.graphics.a a3 = androidx.compose.ui.graphics.b.a();
                a3.a(Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) - (kw8Var.getDensity() * 18.6f), kw8Var.getDensity() * 6.2f);
                a3.c(Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)), kw8Var.getDensity() * 6.2f);
                a3.b(Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) - (kw8Var.getDensity() * 2.325f), kw8Var.getDensity() * 3.1f, Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) - (kw8Var.getDensity() * 7.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) - (kw8Var.getDensity() * 15.95f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                a3.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kw8Var.getDensity() * 6.2f);
                a3.close();
                return kw8Var.c(new zya(a.r(a2).r(a3), this.c, 2));
            default:
                ((oio) obj).b1(1.0f, (r20 & 16) != 0 ? 0 : 0, 3, this.c, 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2.d() >> 32))) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L));
                return s3q0.a;
        }
    }
}
