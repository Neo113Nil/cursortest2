package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nq51 extends hz91 {
    public final rbv c;

    public nq51(rbv rbvVar) {
        this.c = rbvVar;
    }

    @Override // defpackage.hz91
    public final rbv a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq51) && jl40.l(this.c, ((nq51) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "IssueFailed(icon=" + this.c + Extension.C_BRAKE;
    }
}
