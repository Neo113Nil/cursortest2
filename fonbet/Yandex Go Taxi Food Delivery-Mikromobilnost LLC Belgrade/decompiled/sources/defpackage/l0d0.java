package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class l0d0 extends q0d0 {
    public final String b;
    public final boolean c;

    public l0d0(String str, boolean z) {
        super("composite_switch");
        this.b = str;
        this.c = z;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0d0)) {
            return false;
        }
        l0d0 l0d0Var = (l0d0) obj;
        return jl40.l(this.b, l0d0Var.b) && this.c == l0d0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("CompositeSwitch(spendAmount=", this.b, ", turnOn=", this.c, Extension.C_BRAKE);
    }
}
