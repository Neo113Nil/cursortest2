package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.auth.personalaccount.VkPersonalAccountRouter;

/* compiled from: LkPasskeyRouterImpl.kt */
/* loaded from: classes5.dex */
public final class joz implements ioz {
    @Override // xsna.ioz
    public final void a(FragmentActivity fragmentActivity) {
        new VkPersonalAccountRouter(fragmentActivity).a(VkPersonalAccountRouter.Tab.PASSKEY_ADDING, "promo_onepass", 723);
    }
}
