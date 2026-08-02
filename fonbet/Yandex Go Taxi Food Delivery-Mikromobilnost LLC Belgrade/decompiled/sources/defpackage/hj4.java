package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class hj4 extends kr {
    public static final gj4 Companion = new gj4();
    public final Boolean a;
    public final s9i0 b;

    public hj4(int i, Boolean bool, s9i0 s9i0Var) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, fj4.a.getDescriptor());
            throw null;
        }
        this.a = bool;
        if ((i & 2) != 0) {
            this.b = s9i0Var;
        } else {
            s9i0.Companion.getClass();
            this.b = s9i0.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj4) || !hj4.class.equals(obj.getClass())) {
            return false;
        }
        hj4 hj4Var = (hj4) obj;
        return jl40.l(this.a, hj4Var.a) && jl40.l(this.b, hj4Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return this.b.a.hashCode() + ((bool != null ? bool.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "BackwardAction(animated=" + this.a + ", customProps=" + this.b + Extension.C_BRAKE;
    }
}
