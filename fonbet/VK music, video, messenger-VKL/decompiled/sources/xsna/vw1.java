package xsna;

import com.vk.dto.common.data.Subscription;
import com.vk.log.L;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ys8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vw1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vw1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AnalyticsClient.b((Sdk.SDKError.Reason) this.c, (String) this.d, (com.vungle.ads.internal.util.s) this.e);
                break;
            default:
                mge0 mge0Var = (mge0) this.c;
                ys8.b bVar = (ys8.b) this.d;
                dcl dclVar = (dcl) this.e;
                if (mge0Var instanceof Subscription) {
                    Subscription subscription = (Subscription) mge0Var;
                    if (!subscription.ma()) {
                        L.G("BMSBM", "Can't use in-app(Restriction)");
                        bVar.onError(2);
                        break;
                    } else {
                        dclVar.d = subscription;
                        bVar.b(subscription);
                        break;
                    }
                }
                break;
        }
    }
}
