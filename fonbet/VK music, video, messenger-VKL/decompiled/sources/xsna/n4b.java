package xsna;

import android.content.Intent;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n4b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ n4b(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                Intent intent = (Intent) obj;
                i8f.w7(intent);
                intent.putExtra("video_min_length_ms", this.c);
                intent.putExtra("single_mode", true);
                break;
            case 2:
                break;
            case 3:
                tdu tduVar = (tdu) obj;
                long j = this.c;
                tduVar.o(tduVar.I0(rco.a(j)));
                tduVar.n(tduVar.I0(rco.b(j)));
                break;
            default:
                oio oioVar = (oio) obj;
                oio.V1(oioVar, this.c, oioVar.I0(20), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n4b(i8f i8fVar, long j) {
        this.b = 1;
        this.c = j;
    }
}
