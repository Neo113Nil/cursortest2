package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.c63;

/* loaded from: classes7.dex */
public final class gl61 {
    public final c63 a;
    public final String b;
    public final String c;
    public final Integer d;

    public gl61(c63 c63Var, String str, String str2, Integer num) {
        this.a = c63Var;
        this.b = str;
        this.c = str2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl61)) {
            return false;
        }
        gl61 gl61Var = (gl61) obj;
        return this.a == gl61Var.a && this.b.equals(gl61Var.b) && this.c.equals(gl61Var.c) && jl40.l(this.d, gl61Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CategorizedError(category=" + this.a + ", errorCode=" + this.b + ", errorMessage=" + this.c + ", httpCode=" + this.d + Extension.C_BRAKE;
    }
}
