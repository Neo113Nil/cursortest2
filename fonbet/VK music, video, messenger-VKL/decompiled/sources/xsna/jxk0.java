package xsna;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import xsna.wih0;

/* compiled from: StaticAdsState.kt */
/* loaded from: classes17.dex */
public final class jxk0 {
    public final ImageUrl a;
    public final wih0.d.a b;
    public final SdkActionLink c;
    public final String d;
    public final CharSequence e;
    public final m2m f;
    public final String g;
    public final String h;

    public jxk0(ImageUrl imageUrl, wih0.d.a aVar, SdkActionLink sdkActionLink, String str, CharSequence charSequence, m2m m2mVar, String str2, String str3) {
        this.a = imageUrl;
        this.b = aVar;
        this.c = sdkActionLink;
        this.d = str;
        this.e = charSequence;
        this.f = m2mVar;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxk0)) {
            return false;
        }
        jxk0 jxk0Var = (jxk0) obj;
        return epx.f(this.a, jxk0Var.a) && epx.f(this.b, jxk0Var.b) && epx.f(this.c, jxk0Var.c) && epx.f(this.d, jxk0Var.d) && epx.f(this.e, jxk0Var.e) && epx.f(this.f, jxk0Var.f) && epx.f(this.g, jxk0Var.g) && epx.f(this.h, jxk0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        SdkActionLink sdkActionLink = this.c;
        int a = urd0.a((this.f.hashCode() + u11.c(urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g);
        String str = this.h;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StaticAdsState(image=");
        sb.append(this.a);
        sb.append(", adInfo=");
        sb.append(this.b);
        sb.append(", actionLink=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", formattedDescription=");
        sb.append((Object) this.e);
        sb.append(", descriptionState=");
        sb.append(this.f);
        sb.append(", uniqueKey=");
        sb.append(this.g);
        sb.append(", trackCode=");
        return ho8.a(sb, this.h, ')');
    }
}
