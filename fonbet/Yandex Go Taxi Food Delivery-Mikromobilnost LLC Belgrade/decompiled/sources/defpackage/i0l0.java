package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class i0l0 {
    public final long a;
    public final long b;
    public final int c;

    public i0l0(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0l0)) {
            return false;
        }
        i0l0 i0l0Var = (i0l0) obj;
        long j = i0l0Var.a;
        int i = up2.c;
        return ldc.c(this.a, j) && ldc.c(this.b, i0l0Var.b) && this.c == i0l0Var.c;
    }

    public final int hashCode() {
        int i = up2.c;
        int i2 = ldc.n;
        return Integer.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.v("RouteBadge(text=, textColor=", up2.a(this.a), ", backgroundColor=", up2.a(this.b), ", iconRes="));
    }
}
