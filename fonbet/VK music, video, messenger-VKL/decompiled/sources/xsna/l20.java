package xsna;

import com.vk.dto.common.Image;

/* compiled from: ActionLinkSnippetItem.kt */
/* loaded from: classes18.dex */
public final class l20 implements pmc {
    public final String a;
    public final String b;
    public final String c;
    public final Image d;
    public final String e;
    public final String f;
    public final String g;

    public l20(String str, Image image, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = image;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20)) {
            return false;
        }
        l20 l20Var = (l20) obj;
        return epx.f(this.a, l20Var.a) && epx.f(this.b, l20Var.b) && epx.f(this.c, l20Var.c) && epx.f(this.d, l20Var.d) && epx.f(this.e, l20Var.e) && epx.f(this.f, l20Var.f) && epx.f(this.g, l20Var.g);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Image image = this.d;
        int hashCode = (a + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionLinkSnippetItem(snippetId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", openTitle=");
        sb.append(this.e);
        sb.append(", url=");
        sb.append(this.f);
        sb.append(", snippetIcon=");
        return ho8.a(sb, this.g, ')');
    }
}
