package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import xsna.uaw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class saw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ saw(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                return Boolean.valueOf(((uaw.a) entry.getKey()).a == this.c && epx.f(entry.getValue(), xx1.c));
            default:
                oio oioVar = (oio) obj;
                androidx.compose.ui.graphics.a a = androidx.compose.ui.graphics.b.a();
                a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)));
                a.c(Float.intBitsToFloat((int) (oioVar.d() >> 32)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                a.c(Float.intBitsToFloat((int) (oioVar.d() >> 32)), Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)));
                a.close();
                oio.C0(oioVar, a, this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                return s3q0.a;
        }
    }
}
