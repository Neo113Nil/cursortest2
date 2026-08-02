package xsna;

import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.superapp.browser.internal.ui.banner.PersonalBannerView;

/* compiled from: PersonalDiscountModalBottomSheet.kt */
/* loaded from: classes6.dex */
public final class v1a0 implements PersonalBannerView.a {
    public final /* synthetic */ u1a0 a;

    public v1a0(u1a0 u1a0Var) {
        this.a = u1a0Var;
    }

    @Override // com.vk.superapp.browser.internal.ui.banner.PersonalBannerView.a
    public final void a(String str) {
        r1a0 r1a0Var = this.a.u1;
        if (r1a0Var != null) {
            r1a0Var.b(str);
        }
    }

    @Override // com.vk.superapp.browser.internal.ui.banner.PersonalBannerView.a
    public final void b(BannerType bannerType) {
    }
}
