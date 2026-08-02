package xsna;

import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.ads.DisclaimerBannerData;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;

/* compiled from: CommonAdsData.kt */
/* loaded from: classes17.dex */
public final class tgg {
    public final String a;
    public final DisclaimerBannerData b;
    public final String c;
    public final String d;
    public final String e;
    public final SdkImages f;
    public final SdkVideoAdsType g;

    public tgg(String str, DisclaimerBannerData disclaimerBannerData, String str2, String str3, String str4, SdkImages sdkImages, SdkVideoAdsType sdkVideoAdsType) {
        this.a = str;
        this.b = disclaimerBannerData;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = sdkImages;
        this.g = sdkVideoAdsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgg)) {
            return false;
        }
        tgg tggVar = (tgg) obj;
        return epx.f(this.a, tggVar.a) && epx.f(this.b, tggVar.b) && epx.f(this.c, tggVar.c) && epx.f(this.d, tggVar.d) && epx.f(this.e, tggVar.e) && epx.f(this.f, tggVar.f) && this.g == tggVar.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DisclaimerBannerData disclaimerBannerData = this.b;
        int hashCode2 = (hashCode + (disclaimerBannerData == null ? 0 : disclaimerBannerData.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SdkImages sdkImages = this.f;
        int hashCode6 = (hashCode5 + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
        SdkVideoAdsType sdkVideoAdsType = this.g;
        return hashCode6 + (sdkVideoAdsType != null ? sdkVideoAdsType.hashCode() : 0);
    }

    public final String toString() {
        return "CommonAdsData(title=" + this.a + ", disclaimerBannerData=" + this.b + ", disclaimer=" + this.c + ", ownerTitle=" + this.d + ", ageRestrictions=" + this.e + ", photoIcon=" + this.f + ", adsType=" + this.g + ')';
    }
}
