package xsna;

import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;

/* compiled from: VKSocialViewDelegate.kt */
/* loaded from: classes6.dex */
public final class jfr0 implements s1a0 {
    public final /* synthetic */ kfr0 a;

    public jfr0(kfr0 kfr0Var) {
        this.a = kfr0Var;
    }

    @Override // xsna.s1a0
    public final void a(VkBridgeAnalytics.PersonalDiscountExitReason personalDiscountExitReason, int i, Integer num, BannerType bannerType) {
        VkBridgeAnalytics E = this.a.a.E();
        if (E != null) {
            E.d(personalDiscountExitReason, i, num, bannerType);
        }
    }

    @Override // xsna.s1a0
    public final void b(BannerType bannerType) {
        VkBridgeAnalytics E = this.a.a.E();
        if (E != null) {
            E.l(VkBridgeAnalytics.PersonalDiscountEvent.CLICK_RULES_BUTTON, bannerType);
        }
    }
}
