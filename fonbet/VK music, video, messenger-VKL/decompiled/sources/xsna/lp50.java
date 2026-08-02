package xsna;

import com.vk.dto.common.Image;

/* compiled from: MyTargetCardUiDto.kt */
/* loaded from: classes4.dex */
public final class lp50 {
    public final wix a;
    public final String b;
    public final Image c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public lp50(wix wixVar, String str, Image image, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = wixVar;
        this.b = str;
        this.c = image;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp50)) {
            return false;
        }
        lp50 lp50Var = (lp50) obj;
        return epx.f(this.a, lp50Var.a) && epx.f(this.b, lp50Var.b) && epx.f(this.c, lp50Var.c) && epx.f(this.d, lp50Var.d) && epx.f(this.e, lp50Var.e) && epx.f(this.f, lp50Var.f) && epx.f(this.g, lp50Var.g) && epx.f(this.h, lp50Var.h) && epx.f(this.i, lp50Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.c;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTargetCardUiDto(internalNativeAdCard=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", ctaText=");
        sb.append(this.d);
        sb.append(", currency=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", discount=");
        sb.append(this.g);
        sb.append(", oldPrice=");
        sb.append(this.h);
        sb.append(", price=");
        return ho8.a(sb, this.i, ')');
    }
}
