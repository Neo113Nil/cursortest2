package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment;

/* loaded from: classes2.dex */
public final class fkb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CheckoutFragment b;

    public /* synthetic */ fkb(CheckoutFragment checkoutFragment, int i) {
        this.a = i;
        this.b = checkoutFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        CheckoutFragment checkoutFragment = this.b;
        switch (i) {
        }
        return checkoutFragment.getViewLifecycleOwner().getLifecycle();
    }
}
