package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hsy0 implements jsy0 {
    public final String a;
    public final hty0 b;

    public hsy0(String str, hty0 hty0Var) {
        this.a = str;
        this.b = hty0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsy0)) {
            return false;
        }
        hsy0 hsy0Var = (hsy0) obj;
        return jl40.l(this.a, hsy0Var.a) && this.b.equals(hsy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Dynamic(formStateKey=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}
