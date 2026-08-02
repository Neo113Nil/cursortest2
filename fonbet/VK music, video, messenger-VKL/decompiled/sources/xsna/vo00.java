package xsna;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import java.util.ArrayList;
import xsna.wih0;

/* compiled from: MarketAdsBindingModel.kt */
/* loaded from: classes17.dex */
public final class vo00 {
    public final ArrayList a;
    public final ImageUrl b;
    public final wih0.b.a c;
    public final SdkActionLink d;
    public final String e;
    public final String f;
    public final String g;
    public final wp50 h;

    public vo00(ImageUrl imageUrl, SdkActionLink sdkActionLink, String str, String str2, String str3, ArrayList arrayList, wp50 wp50Var, wih0.b.a aVar) {
        this.a = arrayList;
        this.b = imageUrl;
        this.c = aVar;
        this.d = sdkActionLink;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = wp50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo00)) {
            return false;
        }
        vo00 vo00Var = (vo00) obj;
        return this.a.equals(vo00Var.a) && epx.f(this.b, vo00Var.b) && this.c.equals(vo00Var.c) && epx.f(this.d, vo00Var.d) && epx.f(this.e, vo00Var.e) && epx.f(this.f, vo00Var.f) && epx.f(this.g, vo00Var.g) && epx.f(this.h, vo00Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ImageUrl imageUrl = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31)) * 31;
        SdkActionLink sdkActionLink = this.d;
        int a = urd0.a(urd0.a((hashCode2 + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode3 = (a + (str == null ? 0 : str.hashCode())) * 31;
        wp50 wp50Var = this.h;
        return hashCode3 + (wp50Var != null ? wp50Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAdsBindingModel(cards=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", adInfo=");
        sb.append(this.c);
        sb.append(", actionLink=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", uniqueKey=");
        sb.append(this.f);
        sb.append(", trackCode=");
        sb.append(this.g);
        sb.append(", myTargetFacade=");
        return iq.c(sb, this.h, ')');
    }
}
