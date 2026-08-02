package xsna;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkVerifyInfo;

/* compiled from: EndOverlayMappingData.kt */
/* loaded from: classes17.dex */
public final class ukp {
    public final boolean a;
    public final String b;
    public final tgg c;
    public final SdkActionLink d;
    public final SdkVerifyInfo e;
    public final CharSequence f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final SdkOwner j;
    public final SdkImages k;

    public ukp(boolean z, String str, tgg tggVar, SdkActionLink sdkActionLink, SdkVerifyInfo sdkVerifyInfo, CharSequence charSequence, boolean z2, String str2, boolean z3, SdkOwner sdkOwner, SdkImages sdkImages) {
        this.a = z;
        this.b = str;
        this.c = tggVar;
        this.d = sdkActionLink;
        this.e = sdkVerifyInfo;
        this.f = charSequence;
        this.g = z2;
        this.h = str2;
        this.i = z3;
        this.j = sdkOwner;
        this.k = sdkImages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukp)) {
            return false;
        }
        ukp ukpVar = (ukp) obj;
        return this.a == ukpVar.a && epx.f(this.b, ukpVar.b) && epx.f(this.c, ukpVar.c) && epx.f(this.d, ukpVar.d) && epx.f(this.e, ukpVar.e) && epx.f(this.f, ukpVar.f) && this.g == ukpVar.g && epx.f(this.h, ukpVar.h) && this.i == ukpVar.i && epx.f(this.j, ukpVar.j) && epx.f(this.k, ukpVar.k);
    }

    public final int hashCode() {
        int a = urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        tgg tggVar = this.c;
        int hashCode = (a + (tggVar == null ? 0 : tggVar.hashCode())) * 31;
        SdkActionLink sdkActionLink = this.d;
        int hashCode2 = (hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31;
        SdkVerifyInfo sdkVerifyInfo = this.e;
        int b = qoy.b(u11.c((hashCode2 + (sdkVerifyInfo == null ? 0 : sdkVerifyInfo.hashCode())) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        int b2 = qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        SdkOwner sdkOwner = this.j;
        int hashCode3 = (b2 + (sdkOwner == null ? 0 : sdkOwner.hashCode())) * 31;
        SdkImages sdkImages = this.k;
        return hashCode3 + (sdkImages != null ? sdkImages.hashCode() : 0);
    }

    public final String toString() {
        return "EndOverlayMappingData(visible=" + this.a + ", uniqueKey=" + this.b + ", adsData=" + this.c + ", actionLink=" + this.d + ", verifyInfo=" + this.e + ", formattedDescription=" + ((Object) this.f) + ", isAdWithAnyFakeId=" + this.g + ", ownerName=" + this.h + ", isSubscribed=" + this.i + ", owner=" + this.j + ", ownerPhoto=" + this.k + ')';
    }
}
