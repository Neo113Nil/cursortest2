package defpackage;

import com.ybsdk.feature.testpayment.internal.network.AutoPaymentsApi;
import com.ybsdk.feature.testpayment.internal.network.AutoTopupApi;

/* loaded from: classes5.dex */
public final class dhy0 implements v7p {
    public final /* synthetic */ int a;
    public final hag b;

    public /* synthetic */ dhy0(hag hagVar, int i) {
        this.a = i;
        this.b = hagVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        hag hagVar = this.b;
        switch (i) {
            case 0:
                return (AutoPaymentsApi) ((t0k0) hagVar.get()).b(AutoPaymentsApi.class);
            default:
                return (AutoTopupApi) ((t0k0) hagVar.get()).b(AutoTopupApi.class);
        }
    }
}
