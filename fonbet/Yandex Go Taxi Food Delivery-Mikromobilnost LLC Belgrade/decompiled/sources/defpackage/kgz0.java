package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kgz0 {
    public final String a;
    public final jgz0 b;

    public kgz0(String str, jgz0 jgz0Var) {
        this.a = str;
        this.b = jgz0Var;
    }

    public final jgz0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgz0)) {
            return false;
        }
        kgz0 kgz0Var = (kgz0) obj;
        return jl40.l(this.a, kgz0Var.a) && this.b.equals(kgz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TipsButton(title=" + this.a + ", tipValue=" + this.b + Extension.C_BRAKE;
    }
}
