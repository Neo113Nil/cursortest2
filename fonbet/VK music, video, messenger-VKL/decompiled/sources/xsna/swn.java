package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.er9;

/* compiled from: DonutBannerBackgroundPainter.kt */
/* loaded from: classes5.dex */
public final class swn extends lg90 {
    public final lg90 g;
    public final float h;
    public final long i;
    public final y7z j;

    public swn() {
        throw null;
    }

    public swn(List list, lg90 lg90Var) {
        float f = Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE;
        float f2 = 45;
        long floatToRawIntBits = Float.floatToRawIntBits(f2);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f2);
        this.g = lg90Var;
        this.h = f;
        this.i = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
        this.j = new y7z(list, null, 0L, 9187343241974906880L, 0);
    }

    @Override // xsna.lg90
    public final long i() {
        return 9205357640488583168L;
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        oio.x1(oioVar, this.j, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        float f = this.h;
        float I0 = oioVar.I0(f);
        float I02 = oioVar.I0(f);
        long j = this.i;
        float I03 = oioVar.I0(rco.a(j));
        float I04 = oioVar.I0(rco.b(j));
        er9.b a0 = oioVar.a0();
        long d = a0.d();
        a0.a().e();
        try {
            fr9 fr9Var = a0.a;
            er9.b bVar = (er9.b) fr9Var.b;
            fr9Var.l((Float.intBitsToFloat((int) (bVar.d() >> 32)) - I0) + I03, (Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - I02) + I04);
            lg90.h(this.g, oioVar, (Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L), null, 6);
        } finally {
            nq.b(a0, d);
        }
    }
}
