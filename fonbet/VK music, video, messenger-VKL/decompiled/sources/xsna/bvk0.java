package xsna;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import xsna.wih0;

/* compiled from: StaticAdsBindingModel.kt */
/* loaded from: classes17.dex */
public final class bvk0 {
    public final ImageUrl a;
    public final wih0.d.a b;
    public final SdkActionLink c;
    public final String d;
    public final String e;
    public final String f;
    public final wp50 g;

    public bvk0(ImageUrl imageUrl, SdkActionLink sdkActionLink, String str, String str2, String str3, wp50 wp50Var, wih0.d.a aVar) {
        this.a = imageUrl;
        this.b = aVar;
        this.c = sdkActionLink;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = wp50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvk0)) {
            return false;
        }
        bvk0 bvk0Var = (bvk0) obj;
        return epx.f(this.a, bvk0Var.a) && epx.f(this.b, bvk0Var.b) && epx.f(this.c, bvk0Var.c) && epx.f(this.d, bvk0Var.d) && epx.f(this.e, bvk0Var.e) && epx.f(this.f, bvk0Var.f) && epx.f(this.g, bvk0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        SdkActionLink sdkActionLink = this.c;
        int a = urd0.a(urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
        wp50 wp50Var = this.g;
        return hashCode2 + (wp50Var != null ? wp50Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StaticAdsBindingModel(image=");
        sb.append(this.a);
        sb.append(", adInfo=");
        sb.append(this.b);
        sb.append(", actionLink=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", uniqueKey=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", myTargetFacade=");
        return iq.c(sb, this.g, ')');
    }
}
