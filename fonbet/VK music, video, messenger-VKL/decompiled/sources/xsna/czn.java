package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;

/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class czn {
    public final String a;
    public final DonutPriceTemplate b;
    public final String c;

    public czn(String str, DonutPriceTemplate donutPriceTemplate, String str2) {
        this.a = str;
        this.b = donutPriceTemplate;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czn)) {
            return false;
        }
        czn cznVar = (czn) obj;
        cznVar.getClass();
        return epx.f(this.a, cznVar.a) && epx.f(this.b, cznVar.b) && epx.f(this.c, cznVar.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(true) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DonutPriceTemplate donutPriceTemplate = this.b;
        int hashCode3 = (hashCode2 + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31;
        String str2 = this.c;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutChipState(isVisible=true, text=");
        sb.append(this.a);
        sb.append(", priceTemplate=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return ho8.a(sb, this.c, ')');
    }
}
