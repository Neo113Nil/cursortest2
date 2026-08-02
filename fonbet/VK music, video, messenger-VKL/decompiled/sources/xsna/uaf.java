package xsna;

import com.vk.core.view.components.banner.VkBanner;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.ipi;

/* compiled from: ClipsTrendsBannerHelper.kt */
/* loaded from: classes17.dex */
public final class uaf {
    public static void a(VkBanner vkBanner, gzs gzsVar) {
        l7s u = bwt0.u(vkBanner.getContext());
        vkBanner.setBackgroundMode(VkBanner.BackgroundMode.Dark);
        e3m.a aVar = e3m.a;
        vkBanner.setBackground(m33.a(R.drawable.default_placeholder_16, u));
        VkBanner.a.b.C0805a c0805a = new VkBanner.a.b.C0805a(new gko(R.drawable.vk_icon_dismiss_dark_24), ipi.a.a);
        vkBanner.setAfter(new VkBanner.a.b(new taf(0, gzsVar), tq.h(tlo0.Companion, R.string.accessibility_hide), null, c0805a, 4));
        int b = cn70.b(16);
        f4m.u(vkBanner, b, 0, b, b);
    }
}
