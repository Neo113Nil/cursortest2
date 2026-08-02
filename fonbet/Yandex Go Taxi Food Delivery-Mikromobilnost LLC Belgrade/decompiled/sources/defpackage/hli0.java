package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost.RedirectHostFragment;

/* loaded from: classes12.dex */
public final /* synthetic */ class hli0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RedirectHostFragment b;

    public /* synthetic */ hli0(RedirectHostFragment redirectHostFragment, int i) {
        this.a = i;
        this.b = redirectHostFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        gli0 componentStore_delegate$lambda$0;
        zy11 attachNavigationController$lambda$2;
        int i = this.a;
        RedirectHostFragment redirectHostFragment = this.b;
        switch (i) {
            case 0:
                componentStore_delegate$lambda$0 = RedirectHostFragment.componentStore_delegate$lambda$0(redirectHostFragment);
                return componentStore_delegate$lambda$0;
            default:
                attachNavigationController$lambda$2 = RedirectHostFragment.attachNavigationController$lambda$2(redirectHostFragment);
                return attachNavigationController$lambda$2;
        }
    }
}
