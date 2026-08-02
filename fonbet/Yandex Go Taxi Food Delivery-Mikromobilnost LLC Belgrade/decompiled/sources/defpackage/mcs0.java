package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment;

/* loaded from: classes2.dex */
public final class mcs0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SilentPaymentFragment b;

    public /* synthetic */ mcs0(SilentPaymentFragment silentPaymentFragment, int i) {
        this.a = i;
        this.b = silentPaymentFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        SilentPaymentFragment silentPaymentFragment = this.b;
        switch (i) {
        }
        return silentPaymentFragment.getViewLifecycleOwner().getLifecycle();
    }
}
