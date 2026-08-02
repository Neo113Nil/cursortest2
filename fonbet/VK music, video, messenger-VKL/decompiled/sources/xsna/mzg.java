package xsna;

import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock;

/* compiled from: CommunityCreationOnboardingData.kt */
/* loaded from: classes17.dex */
public final class mzg {
    public final j0h a;
    public final String b;
    public final String c;
    public final String d;
    public final CommunityCreationOnboardingBlock<?> e;

    public mzg(j0h j0hVar, String str, String str2, String str3, CommunityCreationOnboardingBlock<?> communityCreationOnboardingBlock) {
        this.a = j0hVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = communityCreationOnboardingBlock;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzg)) {
            return false;
        }
        mzg mzgVar = (mzg) obj;
        return epx.f(this.a, mzgVar.a) && epx.f(this.b, mzgVar.b) && epx.f(this.c, mzgVar.c) && epx.f(this.d, mzgVar.d) && epx.f(this.e, mzgVar.e);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommunityCreationOnboardingBlock<?> communityCreationOnboardingBlock = this.e;
        return hashCode2 + (communityCreationOnboardingBlock != null ? communityCreationOnboardingBlock.hashCode() : 0);
    }

    public final String toString() {
        return "CommunityCreationOnboardingData(title=" + this.a + ", subtitle=" + this.b + ", textButton=" + this.c + ", imageUrl=" + this.d + ", onboardingBlock=" + this.e + ')';
    }
}
