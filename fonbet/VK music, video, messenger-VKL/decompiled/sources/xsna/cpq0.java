package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.tlo0;

/* compiled from: UserProfileErrorPlaceholder.kt */
/* loaded from: classes5.dex */
public final class cpq0 implements dhr0.e {
    public final VkPlaceholder b;
    public wm80 c;

    public cpq0(VkPlaceholder vkPlaceholder) {
        this.b = vkPlaceholder;
        vkPlaceholder.setTop(a());
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.user_profile_loading_error))));
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.err_try_again), (gzs) new h8n0(this, 6), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, (VkButton.Mode) null, (VkButton.Appearance) null, false, IronSourceError.ERROR_CODE_INIT_FAILED), null, null, null, 8));
        dhr0.f(this);
    }

    public static VkPlaceholder.c.b a() {
        return new VkPlaceholder.c.b(new gko(dhr0.M() ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56), new b8g(0), null, 12);
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        this.b.setTop(a());
    }
}
