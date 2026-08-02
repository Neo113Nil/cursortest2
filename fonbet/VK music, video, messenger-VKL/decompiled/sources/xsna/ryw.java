package xsna;

import android.content.Context;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.subscription.impl.RxUsersSubscriptionBusImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ryw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ryw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                syw sywVar = (syw) this.c;
                return new dcl(((PurchasesManagerComponent) sywVar.c().a(fpf0.a(PurchasesManagerComponent.class))).J7(), ((Boolean) obj).booleanValue());
            default:
                RxUsersSubscriptionBusImpl rxUsersSubscriptionBusImpl = (RxUsersSubscriptionBusImpl) this.c;
                if (rxUsersSubscriptionBusImpl.c.getAndIncrement() == 0) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    anj.d(context, rxUsersSubscriptionBusImpl, rxUsersSubscriptionBusImpl.e, hf8.a, 4);
                }
                return s3q0.a;
        }
    }
}
