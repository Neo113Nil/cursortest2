package xsna;

import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import java.util.ArrayList;
import xsna.wih0;

/* compiled from: MarketAdsState.kt */
/* loaded from: classes17.dex */
public final class hr00 {
    public final ImageUrl a;
    public final wih0.b.a b;
    public final SdkActionLink c;
    public final String d;
    public final CharSequence e;
    public final m2m f;
    public final String g;
    public final String h;
    public final ArrayList i;
    public final int j;
    public final boolean k;
    public final boolean l;

    public hr00(ImageUrl imageUrl, wih0.b.a aVar, SdkActionLink sdkActionLink, String str, CharSequence charSequence, m2m m2mVar, String str2, String str3, ArrayList arrayList, int i, boolean z, boolean z2) {
        this.a = imageUrl;
        this.b = aVar;
        this.c = sdkActionLink;
        this.d = str;
        this.e = charSequence;
        this.f = m2mVar;
        this.g = str2;
        this.h = str3;
        this.i = arrayList;
        this.j = i;
        this.k = z;
        this.l = z2;
    }

    public static hr00 a(hr00 hr00Var, boolean z, boolean z2, int i) {
        ImageUrl imageUrl = hr00Var.a;
        wih0.b.a aVar = hr00Var.b;
        SdkActionLink sdkActionLink = hr00Var.c;
        String str = hr00Var.d;
        CharSequence charSequence = hr00Var.e;
        m2m m2mVar = hr00Var.f;
        String str2 = hr00Var.g;
        String str3 = hr00Var.h;
        ArrayList arrayList = hr00Var.i;
        int i2 = hr00Var.j;
        if ((i & 2048) != 0) {
            z2 = hr00Var.l;
        }
        return new hr00(imageUrl, aVar, sdkActionLink, str, charSequence, m2mVar, str2, str3, arrayList, i2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr00)) {
            return false;
        }
        hr00 hr00Var = (hr00) obj;
        return epx.f(this.a, hr00Var.a) && this.b.equals(hr00Var.b) && epx.f(this.c, hr00Var.c) && epx.f(this.d, hr00Var.d) && this.e.equals(hr00Var.e) && this.f.equals(hr00Var.f) && epx.f(this.g, hr00Var.g) && epx.f(this.h, hr00Var.h) && this.i.equals(hr00Var.i) && this.j == hr00Var.j && this.k == hr00Var.k && this.l == hr00Var.l;
    }

    public final int hashCode() {
        ImageUrl imageUrl = this.a;
        int hashCode = (this.b.hashCode() + ((imageUrl == null ? 0 : imageUrl.hashCode()) * 31)) * 31;
        SdkActionLink sdkActionLink = this.c;
        int a = urd0.a((this.f.hashCode() + u11.c(urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g);
        String str = this.h;
        return Boolean.hashCode(this.l) + qoy.b(shy.a(this.j, qr.a(this.i, (a + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAdsState(image=");
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
        sb.append(this.h);
        sb.append(", cards=");
        sb.append(this.i);
        sb.append(", topEdge=");
        sb.append(this.j);
        sb.append(", cardsClickable=");
        sb.append(this.k);
        sb.append(", itemVisible=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
