package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jw7 implements vv7 {
    public final String a;
    public final String b;
    public final hw7 c;
    public final iw7 d;

    public jw7(String str, String str2, hw7 hw7Var, iw7 iw7Var) {
        this.a = str;
        this.b = str2;
        this.c = hw7Var;
        this.d = iw7Var;
    }

    public final String a() {
        return this.b;
    }

    public final hw7 b() {
        return this.c;
    }

    public final iw7 c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw7)) {
            return false;
        }
        jw7 jw7Var = (jw7) obj;
        return jl40.l(this.a, jw7Var.a) && jl40.l(this.b, jw7Var.b) && this.c.equals(jw7Var.c) && jl40.l(this.d, jw7Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a);
        iw7 iw7Var = this.d;
        return b + (iw7Var != null ? iw7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CancelMessageV1(title=", this.a, ", body=", this.b, ", closeButton=");
        v.append(this.c);
        v.append(", confirmButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
