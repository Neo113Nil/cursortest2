package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pq51 extends hz91 {
    public final boolean c;
    public final boolean d;
    public final rbv e;

    public pq51(boolean z, boolean z2, rbv rbvVar) {
        this.c = z;
        this.d = z2;
        this.e = rbvVar;
    }

    @Override // defpackage.hz91
    public final rbv a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq51)) {
            return false;
        }
        pq51 pq51Var = (pq51) obj;
        return this.c == pq51Var.c && this.d == pq51Var.d && jl40.l(this.e, pq51Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(Boolean.hashCode(this.c) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder u = qv10.u("Multiple(issued=", ", plasticPromoAvailable=", ", icon=", this.c, this.d);
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
