package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dae {
    public final String a;
    public final String b;

    public dae(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dae)) {
            return false;
        }
        dae daeVar = (dae) obj;
        return jl40.l(this.a, daeVar.a) && jl40.l(this.b, daeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ContactItem(name=", this.a, ", phone=", this.b, Extension.C_BRAKE);
    }
}
