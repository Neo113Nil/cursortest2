package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class iks0 {
    public static final hks0 Companion = new hks0();
    public final String a;
    public final gks0 b;

    public /* synthetic */ iks0(int i, String str, gks0 gks0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, dks0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = gks0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iks0.class != obj.getClass()) {
            return false;
        }
        iks0 iks0Var = (iks0) obj;
        return jl40.l(this.a, iks0Var.a) && jl40.l(this.b, iks0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gks0 gks0Var = this.b;
        return hashCode + (gks0Var != null ? gks0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SkeletonContentSurrogate(skeleton=" + this.a + ", animations=" + this.b + Extension.C_BRAKE;
    }
}
