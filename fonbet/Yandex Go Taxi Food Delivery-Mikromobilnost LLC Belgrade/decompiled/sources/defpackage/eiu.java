package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class eiu extends kr {
    public static final diu Companion = new diu();
    public final String a;
    public final s9i0 b;

    public eiu(int i, String str, s9i0 s9i0Var) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ciu.a.getDescriptor());
            throw null;
        }
        this.a = str;
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
        if (!(obj instanceof eiu) || !eiu.class.equals(obj.getClass())) {
            return false;
        }
        eiu eiuVar = (eiu) obj;
        return jl40.l(this.a, eiuVar.a) && jl40.l(this.b, eiuVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HideOverlayAction(tag=" + this.a + ", customProps=" + this.b + Extension.C_BRAKE;
    }
}
