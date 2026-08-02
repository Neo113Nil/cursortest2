package xsna;

import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelSubtype;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelType;

/* compiled from: ProductLabel.kt */
/* loaded from: classes18.dex */
public final class lpd0 {
    public final ProductLabelType a;
    public final ProductLabelSubtype b;
    public final String c;
    public final String d;
    public final String e;
    public final ppd0 f;
    public final Integer g;
    public final dly h;

    public lpd0(ProductLabelType productLabelType, ProductLabelSubtype productLabelSubtype, String str, String str2, String str3, ppd0 ppd0Var, Integer num, dly dlyVar) {
        this.a = productLabelType;
        this.b = productLabelSubtype;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = ppd0Var;
        this.g = num;
        this.h = dlyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpd0)) {
            return false;
        }
        lpd0 lpd0Var = (lpd0) obj;
        return this.a == lpd0Var.a && this.b == lpd0Var.b && epx.f(this.c, lpd0Var.c) && epx.f(this.d, lpd0Var.d) && epx.f(this.e, lpd0Var.e) && epx.f(this.f, lpd0Var.f) && epx.f(this.g, lpd0Var.g) && epx.f(this.h, lpd0Var.h);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        ppd0 ppd0Var = this.f;
        int hashCode2 = (hashCode + (ppd0Var == null ? 0 : ppd0Var.hashCode())) * 31;
        Integer num = this.g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        dly dlyVar = this.h;
        return hashCode3 + (dlyVar != null ? dlyVar.hashCode() : 0);
    }

    public final String toString() {
        return "ProductLabel(type=" + this.a + ", subtype=" + this.b + ", subtypeName=" + this.c + ", text=" + this.d + ", tooltip=" + this.e + ", action=" + this.f + ", counterValue=" + this.g + ", labelIcon=" + this.h + ')';
    }
}
