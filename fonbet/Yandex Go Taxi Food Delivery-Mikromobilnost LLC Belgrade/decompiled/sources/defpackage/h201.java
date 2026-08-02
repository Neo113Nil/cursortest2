package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class h201 {
    public final zzs a;
    public final Double b;
    public final boolean c;
    public final long d;
    public final g201 e;

    public h201(zzs zzsVar, Double d, boolean z, long j, g201 g201Var) {
        this.a = zzsVar;
        this.b = d;
        this.c = z;
        this.d = j;
        this.e = g201Var;
    }

    public static h201 a(h201 h201Var, zzs zzsVar, Double d, boolean z, long j, int i) {
        if ((i & 1) != 0) {
            zzsVar = h201Var.a;
        }
        zzs zzsVar2 = zzsVar;
        if ((i & 2) != 0) {
            d = h201Var.b;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            z = h201Var.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = h201Var.d;
        }
        return new h201(zzsVar2, d2, z2, j, h201Var.e);
    }

    public final h201 b(boolean z) {
        return a(this, null, null, z, 0L, 27);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h201)) {
            return false;
        }
        h201 h201Var = (h201) obj;
        return jl40.l(this.a, h201Var.a) && jl40.l(this.b, h201Var.b) && this.c == h201Var.c && this.d == h201Var.d && jl40.l(this.e, h201Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int c = qv10.c(unr0.e((hashCode + (d == null ? 0 : d.hashCode())) * 31, 31, this.c), 31, this.d);
        g201 g201Var = this.e;
        return c + (g201Var != null ? g201Var.hashCode() : 0);
    }

    public final String toString() {
        return "TrackerCarPosition(location=" + this.a + ", direction=" + this.b + ", isCarStopped=" + this.c + ", date=" + this.d + ", analyticsData=" + this.e + Extension.C_BRAKE;
    }
}
