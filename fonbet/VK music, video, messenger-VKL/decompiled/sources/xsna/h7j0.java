package xsna;

import com.vk.onboarding.api.dto.VkOnboardingCampaign;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class h7j0 {
    public final int a;
    public final VkOnboardingCampaign b;

    public h7j0(int i, VkOnboardingCampaign vkOnboardingCampaign) {
        this.a = i;
        this.b = vkOnboardingCampaign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7j0)) {
            return false;
        }
        h7j0 h7j0Var = (h7j0) obj;
        return this.a == h7j0Var.a && epx.f(this.b, h7j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ShareButtonOnboarding(textResId=" + this.a + ", campaign=" + this.b + ')';
    }
}
