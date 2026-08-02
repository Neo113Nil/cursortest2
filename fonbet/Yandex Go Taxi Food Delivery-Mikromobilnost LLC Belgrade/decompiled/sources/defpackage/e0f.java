package defpackage;

import android.view.View;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.CounterOffersContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment;

/* loaded from: classes2.dex */
public final class e0f implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CounterOffersFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ e0f(CounterOffersFragment counterOffersFragment, int i, int i2) {
        this.a = i2;
        this.b = counterOffersFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        CounterOffersFragment counterOffersFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = counterOffersFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return (CounterOffersContentView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.CounterOffersContentView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = counterOffersFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return (ProgressView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.common.api.ui.view.ProgressView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
