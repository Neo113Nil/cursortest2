package xsna;

import com.vk.superapp.vkpay.checkout.feature.success.CheckoutStatusFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CheckoutStatusPresenter.kt */
/* loaded from: classes6.dex */
public final class x8c implements fm6, nou {
    public final Object b;

    @Override // xsna.fm6
    public boolean a0() {
        return false;
    }

    @Override // xsna.nou
    public Iterator c() {
        return ((ArrayList) this.b).iterator();
    }

    @Override // xsna.nou
    public Object e(Object obj) {
        return (String) obj;
    }

    public x8c() {
        this.b = new ne6();
    }

    public x8c(CheckoutStatusFragment checkoutStatusFragment, kku0 kku0Var) {
        this.b = checkoutStatusFragment;
    }

    @Override // xsna.fm6
    public void d() {
    }

    @Override // xsna.fm6
    public void onDestroy() {
    }

    @Override // xsna.fm6
    public void onDestroyView() {
    }

    @Override // xsna.fm6
    public void onResume() {
    }

    @Override // xsna.fm6
    public void onStart() {
    }
}
