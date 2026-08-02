package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment;

/* loaded from: classes2.dex */
public final class d0f implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CounterOffersFragment b;

    public /* synthetic */ d0f(CounterOffersFragment counterOffersFragment, int i) {
        this.a = i;
        this.b = counterOffersFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        CounterOffersFragment counterOffersFragment = this.b;
        switch (i) {
        }
        return counterOffersFragment.getViewLifecycleOwner().getLifecycle();
    }
}
