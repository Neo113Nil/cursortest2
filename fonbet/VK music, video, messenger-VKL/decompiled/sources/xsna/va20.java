package xsna;

import com.vk.dto.common.Image;

/* compiled from: MessageProductSnippetConfig.kt */
/* loaded from: classes18.dex */
public final class va20 {
    public final String a;
    public final String b;
    public final boolean c;
    public final Image d;

    public va20(String str, String str2, boolean z, Image image) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va20)) {
            return false;
        }
        va20 va20Var = (va20) obj;
        return epx.f(this.a, va20Var.a) && epx.f(this.b, va20Var.b) && this.c == va20Var.c && epx.f(this.d, va20Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Image image = this.d;
        return b + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageProductItem(titleText=");
        sb.append(this.a);
        sb.append(", priceText=");
        sb.append(this.b);
        sb.append(", isService=");
        sb.append(this.c);
        sb.append(", image=");
        return er.d(sb, this.d, ')');
    }
}
