package xsna;

import com.vk.dzenarticle.impl.ui.entity.AdPosition;

/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class mm3 implements yp3 {
    public final int a;
    public final zu50 b;
    public final fe0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final kiw h;
    public final boolean i;
    public final String j;
    public final String k;
    public final AdPosition l;

    public mm3(int i, zu50 zu50Var, fe0 fe0Var, String str, String str2, String str3, String str4, kiw kiwVar, boolean z, String str5, String str6, AdPosition adPosition) {
        this.a = i;
        this.b = zu50Var;
        this.c = fe0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = kiwVar;
        this.i = z;
        this.j = str5;
        this.k = str6;
        this.l = adPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm3)) {
            return false;
        }
        mm3 mm3Var = (mm3) obj;
        return this.a == mm3Var.a && epx.f(this.b, mm3Var.b) && epx.f(this.c, mm3Var.c) && epx.f(this.d, mm3Var.d) && epx.f(this.e, mm3Var.e) && epx.f(this.f, mm3Var.f) && epx.f(this.g, mm3Var.g) && epx.f(this.h, mm3Var.h) && this.i == mm3Var.i && epx.f(this.j, mm3Var.j) && epx.f(this.k, mm3Var.k) && this.l == mm3Var.l;
    }

    @Override // xsna.yp3
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        kiw kiwVar = this.h;
        int b = qoy.b((hashCode5 + (kiwVar == null ? 0 : kiwVar.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        int hashCode6 = (b + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        return this.l.hashCode() + ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ArticleAdViewItem(id=" + this.a + ", nativeAd=" + this.b + ", adChoicesController=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", advertisingLabel=" + this.f + ", ageRestrictions=" + this.g + ", imageData=" + this.h + ", isImage=" + this.i + ", buttonText=" + this.j + ", disclaimerText=" + this.k + ", adPosition=" + this.l + ')';
    }
}
