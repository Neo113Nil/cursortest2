package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class er70 implements fr70 {
    public final String a;
    public final String b;
    public final j37 c;

    public er70(String str, String str2, j37 j37Var) {
        this.a = str;
        this.b = str2;
        this.c = j37Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er70)) {
            return false;
        }
        er70 er70Var = (er70) obj;
        return jl40.l(this.a, er70Var.a) && this.b.equals(er70Var.b) && this.c.equals(er70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("SliderItem(text=", this.a, ", subtitle=", this.b, ", style=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
