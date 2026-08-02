package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kq51 extends hz91 {
    public final rbv c;
    public final boolean d;

    public kq51(rbv rbvVar, boolean z) {
        this.c = rbvVar;
        this.d = z;
    }

    @Override // defpackage.hz91
    public final rbv a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq51)) {
            return false;
        }
        kq51 kq51Var = (kq51) obj;
        return jl40.l(this.c, kq51Var.c) && this.d == kq51Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Absent(icon=" + this.c + ", isPromoAvailable=" + this.d + Extension.C_BRAKE;
    }
}
