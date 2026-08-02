package xsna;

import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;

/* compiled from: VkFastLoginView.kt */
/* loaded from: classes15.dex */
public final class ttu0 extends xsj0 {
    public final /* synthetic */ VkFastLoginView b;

    public ttu0(VkFastLoginView vkFastLoginView) {
        this.b = vkFastLoginView;
    }

    @Override // xsna.xsj0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 > 0 || i3 > 0) {
            VkFastLoginView vkFastLoginView = this.b;
            if (vkFastLoginView.p) {
                return;
            }
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INPUT_NUMBER_INTERACTION, null, null, null, null, null, null, 254);
            vkFastLoginView.p = true;
        }
    }
}
