package xsna;

import com.vk.core.tool.view.onboarding.VkOnboardingBanner;

/* compiled from: AdBloggerBannerViewHolder.kt */
/* loaded from: classes5.dex */
public final class hd0 extends vif0<fd0> implements y4u0 {
    public final a n;
    public final VkOnboardingBanner o;
    public boolean p;
    public boolean q;

    /* compiled from: AdBloggerBannerViewHolder.kt */
    public interface a {
        void a();

        void b(String str, String str2);

        void c(String str);
    }

    public hd0(VkOnboardingBanner vkOnboardingBanner, u3h u3hVar) {
        super(vkOnboardingBanner);
        this.n = u3hVar;
        this.o = vkOnboardingBanner;
    }

    @Override // xsna.y4u0
    public final void B5(boolean z) {
        if (this.q != z) {
            this.q = z;
            if (!z || this.p) {
                return;
            }
            this.n.a();
            this.p = true;
        }
    }

    @Override // xsna.vif0
    public final void i6(fd0 fd0Var) {
        this.p = false;
        ed0 ed0Var = fd0Var.g;
        String str = ed0Var.b;
        VkOnboardingBanner vkOnboardingBanner = this.o;
        vkOnboardingBanner.setTitle(str);
        vkOnboardingBanner.setButtonText(ed0Var.c);
        vkOnboardingBanner.setOnButtonClick(new cm(1, this, ed0Var));
        vkOnboardingBanner.setOnDismiss(new gd0(0, this, ed0Var));
    }

    @Override // xsna.y4u0
    public final void onDestroy() {
    }
}
