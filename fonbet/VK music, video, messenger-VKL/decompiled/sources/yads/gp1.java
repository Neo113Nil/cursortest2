package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import kotlin.Result;

/* loaded from: classes10.dex */
public final class gp1 {
    public final com.monetization.ads.mediation.base.a a;

    public gp1(com.monetization.ads.mediation.base.a aVar) {
        this.a = aVar;
    }

    public final MediatedAdapterInfo b() {
        Object failure;
        try {
            failure = this.a.getAdapterInfo();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = new MediatedAdapterInfo.Builder().setAdapterVersion("null").setNetworkName("null").setNetworkSdkVersion("null").build();
        }
        return (MediatedAdapterInfo) failure;
    }
}
