package xsna;

import com.vk.clips.sdk.models.ads.SdkAdsChoices;

/* compiled from: MarketAdsUIEventExternal.kt */
/* loaded from: classes17.dex */
public final class kr00 implements lr00 {
    public final String a;
    public final SdkAdsChoices b;

    public kr00(SdkAdsChoices sdkAdsChoices, String str) {
        this.a = str;
        this.b = sdkAdsChoices;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr00)) {
            return false;
        }
        kr00 kr00Var = (kr00) obj;
        return epx.f(this.a, kr00Var.a) && epx.f(this.b, kr00Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SdkAdsChoices sdkAdsChoices = this.b;
        return hashCode + (sdkAdsChoices == null ? 0 : sdkAdsChoices.hashCode());
    }

    public final String toString() {
        return "ReportClicked(adUniqueKey=" + this.a + ", adsChoices=" + this.b + ')';
    }
}
