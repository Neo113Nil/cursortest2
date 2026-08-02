package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;

/* compiled from: DonutBannerUiModel.kt */
/* loaded from: classes5.dex */
public final class ws9 {
    public final String a;
    public final DonutPriceTemplate b;
    public final String c;

    public ws9(String str, DonutPriceTemplate donutPriceTemplate, String str2) {
        this.a = str;
        this.b = donutPriceTemplate;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws9)) {
            return false;
        }
        ws9 ws9Var = (ws9) obj;
        return epx.f(this.a, ws9Var.a) && epx.f(this.b, ws9Var.b) && epx.f(this.c, ws9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        DonutPriceTemplate donutPriceTemplate = this.b;
        int hashCode2 = (hashCode + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardButtonModel(rawTitle=");
        sb.append(this.a);
        sb.append(", titleTemplate=");
        sb.append(this.b);
        sb.append(", accessibilityTitle=");
        return ho8.a(sb, this.c, ')');
    }
}
