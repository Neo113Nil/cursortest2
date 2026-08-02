package xsna;

import com.vk.onboarding.api.dto.VkOnboardingCampaign;

/* compiled from: CommunityOnboardingBannerModel.kt */
/* loaded from: classes5.dex */
public final class wbh extends s4h {
    public final String b;
    public final String c;
    public final String d;
    public final VkOnboardingCampaign e;

    public wbh(VkOnboardingCampaign vkOnboardingCampaign, String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = vkOnboardingCampaign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbh)) {
            return false;
        }
        wbh wbhVar = (wbh) obj;
        return epx.f(this.b, wbhVar.b) && epx.f(this.c, wbhVar.c) && epx.f(this.d, wbhVar.d) && epx.f(this.e, wbhVar.e);
    }

    public final int hashCode() {
        int a = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CommunityOnboardingBannerModel(title=" + this.b + ", subtitle=" + this.c + ", textButton=" + this.d + ", campaign=" + this.e + ')';
    }
}
