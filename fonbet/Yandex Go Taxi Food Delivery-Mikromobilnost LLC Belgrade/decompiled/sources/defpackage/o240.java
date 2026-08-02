package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class o240 implements q240 {
    public final vt30 a;

    public o240(vt30 vt30Var) {
        this.a = vt30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o240) && jl40.l(this.a, ((o240) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Purchase(event=" + this.a + Extension.C_BRAKE;
    }
}
