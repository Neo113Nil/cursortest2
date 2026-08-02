package xsna;

import com.vk.dto.common.Image;

/* compiled from: GoodCategoryHolder.kt */
/* loaded from: classes18.dex */
public final class cla {
    public final String a;
    public final String b;
    public final Image c;
    public final String d;
    public final y7l0 e;

    public cla(String str, String str2, Image image, String str3, y7l0 y7l0Var) {
        this.a = str;
        this.b = str2;
        this.c = image;
        this.d = str3;
        this.e = y7l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cla)) {
            return false;
        }
        cla claVar = (cla) obj;
        return epx.f(this.a, claVar.a) && epx.f(this.b, claVar.b) && epx.f(this.c, claVar.c) && epx.f(this.d, claVar.d) && this.e.equals(claVar.e);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        Image image = this.c;
        return this.e.hashCode() + urd0.a((a + (image == null ? 0 : image.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "CategoryItemData(title=" + this.a + ", description=" + this.b + ", image=" + this.c + ", link=" + this.d + ", listener=" + this.e + ')';
    }
}
