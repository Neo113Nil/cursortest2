package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class g8r extends b9r {
    public static final f8r Companion = new f8r();
    public final p8r a;
    public final int b;

    public g8r(int i, p8r p8rVar, int i2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, e8r.a.getDescriptor());
            throw null;
        }
        this.a = p8rVar;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8r)) {
            return false;
        }
        g8r g8rVar = (g8r) obj;
        return jl40.l(this.a, g8rVar.a) && this.b == g8rVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FingerprintActivity(currentActivity=" + this.a + ", steps=" + this.b + Extension.C_BRAKE;
    }
}
