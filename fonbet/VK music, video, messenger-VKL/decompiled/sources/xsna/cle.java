package xsna;

import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import java.util.List;
import java.util.Map;

/* compiled from: ClipsMarketAdsCard.kt */
/* loaded from: classes17.dex */
public final class cle {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final SdkImages g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;
    public final Map<AdStatPixel.Type, List<AdStatPixel>> o;

    /* JADX WARN: Multi-variable type inference failed */
    public cle(String str, String str2, String str3, String str4, String str5, String str6, SdkImages sdkImages, String str7, String str8, String str9, String str10, String str11, int i, String str12, Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = sdkImages;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = i;
        this.n = str12;
        this.o = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cle)) {
            return false;
        }
        cle cleVar = (cle) obj;
        return epx.f(this.a, cleVar.a) && epx.f(this.b, cleVar.b) && epx.f(this.c, cleVar.c) && epx.f(this.d, cleVar.d) && epx.f(this.e, cleVar.e) && epx.f(this.f, cleVar.f) && epx.f(this.g, cleVar.g) && epx.f(this.h, cleVar.h) && epx.f(this.i, cleVar.i) && epx.f(this.j, cleVar.j) && epx.f(this.k, cleVar.k) && epx.f(this.l, cleVar.l) && this.m == cleVar.m && epx.f(this.n, cleVar.n) && epx.f(this.o, cleVar.o);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SdkImages sdkImages = this.g;
        int hashCode7 = (hashCode6 + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
        String str6 = this.h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.l;
        int a = shy.a(this.m, (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31, 31);
        String str11 = this.n;
        int hashCode12 = (a + (str11 == null ? 0 : str11.hashCode())) * 31;
        Map<AdStatPixel.Type, List<AdStatPixel>> map = this.o;
        return hashCode12 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsMarketAdsCard(id=");
        sb.append(this.a);
        sb.append(", price=");
        sb.append(this.b);
        sb.append(", oldPrice=");
        sb.append(this.c);
        sb.append(", discount=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", photo=");
        sb.append(this.g);
        sb.append(", link=");
        sb.append(this.h);
        sb.append(", deepLink=");
        sb.append(this.i);
        sb.append(", appPackage=");
        sb.append(this.j);
        sb.append(", buttonText=");
        sb.append(this.k);
        sb.append(", buttonTextInstalled=");
        sb.append(this.l);
        sb.append(", linkTarget=");
        sb.append(this.m);
        sb.append(", ctaLink=");
        sb.append(this.n);
        sb.append(", statPixels=");
        return cjl0.a(sb, this.o, ')');
    }
}
