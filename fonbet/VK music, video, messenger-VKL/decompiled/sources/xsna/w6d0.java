package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.photo.Photo;

/* compiled from: PrimaryArticleDonutUiDto.kt */
/* loaded from: classes4.dex */
public final class w6d0 extends ol60 {
    public final String h;
    public final String i;
    public final boolean j;
    public final Photo k;
    public final String l;
    public final String m;
    public final String n;
    public final DonutPriceTemplate o;
    public final ea60 p;

    public w6d0(String str, String str2, boolean z, Photo photo, String str3, String str4, String str5, DonutPriceTemplate donutPriceTemplate, ea60 ea60Var) {
        super(344, 0, 0, 0, ea60Var);
        this.h = str;
        this.i = str2;
        this.j = z;
        this.k = photo;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = donutPriceTemplate;
        this.p = ea60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6d0)) {
            return false;
        }
        w6d0 w6d0Var = (w6d0) obj;
        return epx.f(this.h, w6d0Var.h) && epx.f(this.i, w6d0Var.i) && this.j == w6d0Var.j && epx.f(this.k, w6d0Var.k) && epx.f(this.l, w6d0Var.l) && epx.f(this.m, w6d0Var.m) && epx.f(this.n, w6d0Var.n) && epx.f(this.o, w6d0Var.o) && epx.f(this.p, w6d0Var.p);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.h.hashCode() * 31, 31, this.i), 31, this.j);
        Photo photo = this.k;
        int hashCode = (b + (photo == null ? 0 : photo.hashCode())) * 31;
        String str = this.l;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DonutPriceTemplate donutPriceTemplate = this.o;
        int hashCode5 = (hashCode4 + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31;
        ea60 ea60Var = this.p;
        return hashCode5 + (ea60Var != null ? ea60Var.hashCode() : 0);
    }

    public final String toString() {
        return "PrimaryArticleDonutUiDto(articleTitle=" + this.h + ", articleAuthorName=" + this.i + ", articleAuthorIsGroup=" + this.j + ", photo=" + this.k + ", dimensionRatio=" + this.l + ", donutMessage=" + this.m + ", donutButton=" + this.n + ", donutPriceTemplate=" + this.o + ", testTag=" + this.p + ')';
    }
}
