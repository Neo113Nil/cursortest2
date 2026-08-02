package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes5.dex */
public final class lj80 {
    public static final kj80 Companion = new kj80();
    public final String a;
    public final oj80 b;

    public /* synthetic */ lj80(int i, String str, oj80 oj80Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, jj80.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = oj80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj80)) {
            return false;
        }
        lj80 lj80Var = (lj80) obj;
        return jl40.l(this.a, lj80Var.a) && jl40.l(this.b, lj80Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrganizationNameUriInfo(type=" + this.a + ", params=" + this.b + Extension.C_BRAKE;
    }

    public lj80(String str, oj80 oj80Var) {
        this.a = str;
        this.b = oj80Var;
    }
}
