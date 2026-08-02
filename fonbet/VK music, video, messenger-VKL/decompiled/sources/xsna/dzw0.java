package xsna;

import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: VoipSearchFriendsEmptyDelegate.kt */
/* loaded from: classes7.dex */
public final class dzw0 extends p1u0<czw0> {
    public final VoipCallServiceFragment.b a;

    /* compiled from: VoipSearchFriendsEmptyDelegate.kt */
    public static final class a extends vfz<czw0> {
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final /* bridge */ /* synthetic */ void i6(czw0 czw0Var) {
        }
    }

    public dzw0(VoipCallServiceFragment.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends czw0> b(ViewGroup viewGroup) {
        VkPlaceholder vkPlaceholder = new VkPlaceholder(viewGroup.getContext(), null, 6, 0);
        vkPlaceholder.setId(R.id.voip_vkapp_calls_search_friend_empty);
        vkPlaceholder.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.voip_vkapp_services_empty_search_friends_description_item))));
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.voip_vkapp_services_empty_search_friends_button_item), (gzs) new hri0(this, 25), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, (VkButton.Mode) null, (VkButton.Appearance) null, false, IronSourceError.ERROR_CODE_INIT_FAILED), null, null, null, 8));
        return new a(vkPlaceholder);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof czw0;
    }
}
