package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jb0 {
    public final String a;
    public final String b;
    public final bo31 c;

    public jb0(String str, String str2, bo31 bo31Var) {
        this.a = str;
        this.b = str2;
        this.c = bo31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jb0) {
            jb0 jb0Var = (jb0) obj;
            return this.a.equals(jb0Var.a) && this.b.equals(jb0Var.b) && this.c == jb0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("TopTrailing(titleText=", this.a, ", contentDescription=", this.b, ", onClickAction=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
