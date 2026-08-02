package xsna;

import com.vk.clips.sdk.models.ads.SdkAdsChoices;

/* compiled from: MarketAdsUIEventExternal.kt */
/* loaded from: classes17.dex */
public final class jr00 implements lr00 {
    public final String a;
    public final SdkAdsChoices b;
    public final boolean c;

    public jr00(String str, SdkAdsChoices sdkAdsChoices, boolean z) {
        this.a = str;
        this.b = sdkAdsChoices;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr00)) {
            return false;
        }
        jr00 jr00Var = (jr00) obj;
        return epx.f(this.a, jr00Var.a) && epx.f(this.b, jr00Var.b) && this.c == jr00Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SdkAdsChoices sdkAdsChoices = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (sdkAdsChoices == null ? 0 : sdkAdsChoices.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotInterestedClicked(adUniqueKey=");
        sb.append(this.a);
        sb.append(", adsChoices=");
        sb.append(this.b);
        sb.append(", mtSdkBehaviour=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
