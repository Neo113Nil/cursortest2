package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class dz01 {
    public final String a;
    public final String b;

    public dz01(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz01)) {
            return false;
        }
        dz01 dz01Var = (dz01) obj;
        return jl40.l(this.a, dz01Var.a) && this.b.equals(dz01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TranslationEntry(keySetName=", this.a, ", key=", this.b, Extension.C_BRAKE);
    }
}
