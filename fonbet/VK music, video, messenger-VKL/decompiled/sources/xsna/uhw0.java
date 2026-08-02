package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ipi;
import xsna.tlo0;
import xsna.vhw0;

/* compiled from: VoipCallServiceBannerDelegate.kt */
/* loaded from: classes7.dex */
public final class uhw0 extends p1u0<vhw0> {
    public final VoipCallServiceFragment.b a;

    /* compiled from: VoipCallServiceBannerDelegate.kt */
    public interface a {
        void e(vhw0 vhw0Var);

        void h(vhw0 vhw0Var);
    }

    /* compiled from: VoipCallServiceBannerDelegate.kt */
    public static final class b extends vfz<vhw0> {
        public final a l;
        public final VkBanner m;

        public b(FrameLayout frameLayout, VoipCallServiceFragment.b bVar) {
            super(frameLayout);
            this.l = bVar;
            this.m = (VkBanner) frameLayout.findViewById(R.id.voip_vkapp_calls_banner);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(vhw0 vhw0Var) {
            vhw0 vhw0Var2 = vhw0Var;
            if (!(vhw0Var2 instanceof vhw0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            VkBanner.b.C0806b c0806b = new VkBanner.b.C0806b(new gko(R.drawable.vk_icon_phone_arrow_up_right_outline_28), new a8g(VkColorToken.IconAccent), null, 12);
            VkBanner vkBanner = this.m;
            vkBanner.setBefore(c0806b);
            tlo0.f h = tq.h(tlo0.Companion, R.string.voip_vkapp_services_banner_allow_incoming_call_title);
            tlo0.f fVar = new tlo0.f(R.string.voip_vkapp_services_banner_allow_incoming_call_desc);
            tlo0.f fVar2 = new tlo0.f(R.string.voip_vkapp_services_banner_allow_incoming_call_btn);
            VkButton.Size size = VkButton.Size.Small;
            vkBanner.setMiddle(new VkBanner.e(h, fVar, null, new VkBanner.c(fVar2, new com.vk.movika.sdk.android.defaultplayer.container.e(28, this, vhw0Var2), VkButton.Mode.Link, VkButton.Appearance.Accent, size, null, null, 992), null, null, 116));
            vkBanner.setAfter(new VkBanner.a.b(new ag1(19, this, vhw0Var2), new tlo0.f(R.string.close), null, new VkBanner.a.b.C0805a(new gko(R.drawable.vk_icon_dismiss_dark_24), ipi.a.a), 4));
        }
    }

    public uhw0(VoipCallServiceFragment.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends vhw0> b(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        VkBanner vkBanner = new VkBanner(frameLayout.getContext(), null, 6);
        vkBanner.setId(R.id.voip_vkapp_calls_banner);
        vkBanner.setLayoutParams(cpy.a(0, -1, e3m.a(R.dimen.vk_ui_spacing_size2_xl, vkBanner.getContext()), 0, 0, e3m.a(R.dimen.vk_ui_spacing_size2_xl, vkBanner.getContext()), 25));
        frameLayout.addView(vkBanner);
        return new b(frameLayout, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vhw0;
    }
}
