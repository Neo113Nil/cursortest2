package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class nd7 {
    public static final md7 Companion = new md7();
    public final String a;
    public final String b;

    public /* synthetic */ nd7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ld7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd7)) {
            return false;
        }
        nd7 nd7Var = (nd7) obj;
        return jl40.l(this.a, nd7Var.a) && jl40.l(this.b, nd7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CachedExperimentsSupportParam(name=", this.a, ", version=", this.b, Extension.C_BRAKE);
    }

    public nd7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
