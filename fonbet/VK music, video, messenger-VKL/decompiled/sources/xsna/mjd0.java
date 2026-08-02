package xsna;

import com.vk.dto.common.Image;

/* compiled from: ProductCardBannerHolder.kt */
/* loaded from: classes18.dex */
public final class mjd0 {
    public final String a;
    public final String b;
    public final Image c;

    public mjd0(String str, String str2, Image image) {
        this.a = str;
        this.b = str2;
        this.c = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjd0)) {
            return false;
        }
        mjd0 mjd0Var = (mjd0) obj;
        return epx.f(this.a, mjd0Var.a) && epx.f(this.b, mjd0Var.b) && epx.f(this.c, mjd0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCardBannerItem(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", icon=");
        return er.d(sb, this.c, ')');
    }
}
