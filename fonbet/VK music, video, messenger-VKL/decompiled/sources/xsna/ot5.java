package xsna;

import com.vk.dto.common.Image;

/* compiled from: AvitoData.kt */
/* loaded from: classes18.dex */
public final class ot5 {
    public final Image a;
    public final String b;
    public final String c;
    public final a d;

    /* compiled from: AvitoData.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(title=");
            sb.append(this.a);
            sb.append(", url=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public ot5(Image image, String str, String str2, a aVar) {
        this.a = image;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot5)) {
            return false;
        }
        ot5 ot5Var = (ot5) obj;
        return epx.f(this.a, ot5Var.a) && epx.f(this.b, ot5Var.b) && epx.f(this.c, ot5Var.c) && epx.f(this.d, ot5Var.d);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        a aVar = this.d;
        return a2 + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "AvitoData(image=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + ')';
    }
}
