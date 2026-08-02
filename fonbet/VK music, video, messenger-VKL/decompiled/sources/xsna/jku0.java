package xsna;

import com.vk.superapp.vkpay.checkout.feature.success.CheckoutStatusFragment;
import com.vk.superapp.vkpay.checkout.feature.success.states.Action;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import java.io.Serializable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jku0 implements CheckoutStatusFragment.OnBackPressedListener, Serializable {
    public final /* synthetic */ Action b;

    public /* synthetic */ jku0(Action action) {
        this.b = action;
    }

    @Override // com.vk.superapp.vkpay.checkout.feature.success.CheckoutStatusFragment.OnBackPressedListener
    public final void a0() {
        Action action = this.b;
        if (action instanceof ButtonAction) {
            ((ButtonAction) action).d().invoke();
        }
    }
}
