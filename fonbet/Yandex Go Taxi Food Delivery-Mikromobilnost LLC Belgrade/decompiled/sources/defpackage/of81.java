package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class of81 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public of81(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final of81 a(of81 of81Var, String str) {
        String a = cia1.a(str, this.c);
        if (of81Var == null) {
            return null;
        }
        long j = of81Var.b;
        if (!a.equals(cia1.a(str, of81Var.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            if (j3 + j2 == of81Var.a) {
                return new of81(a, j3, j != -1 ? j2 + j : -1L);
            }
        }
        if (j == -1) {
            return null;
        }
        long j4 = of81Var.a;
        if (j4 + j == this.a) {
            return new of81(a, j4, j2 != -1 ? j + j2 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || of81.class != obj.getClass()) {
            return false;
        }
        of81 of81Var = (of81) obj;
        return this.a == of81Var.a && this.b == of81Var.b && this.c.equals(of81Var.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return oyr.n(this.b, Extension.C_BRAKE, sb);
    }
}
