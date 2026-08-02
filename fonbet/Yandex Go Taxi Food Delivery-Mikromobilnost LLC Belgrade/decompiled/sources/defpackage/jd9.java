package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jd9 implements kd9 {
    public final rr51 a;
    public final String b;

    public jd9(rr51 rr51Var, String str) {
        this.a = rr51Var;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final rr51 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd9)) {
            return false;
        }
        jd9 jd9Var = (jd9) obj;
        return jl40.l(this.a, jd9Var.a) && jl40.l(this.b, jd9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Success(ybDivData=" + this.a + ", urlFor3ds=" + this.b + Extension.C_BRAKE;
    }
}
