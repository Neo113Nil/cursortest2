package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class dwj0 {
    public final g7j0 a;
    public final long b;
    public final cwd c;

    public dwj0(g7j0 g7j0Var, long j, cwd cwdVar) {
        this.a = g7j0Var;
        this.b = j;
        this.c = cwdVar;
    }

    public static dwj0 a(dwj0 dwj0Var, g7j0 g7j0Var, cwd cwdVar, int i) {
        if ((i & 1) != 0) {
            g7j0Var = dwj0Var.a;
        }
        long j = dwj0Var.b;
        if ((i & 4) != 0) {
            cwdVar = dwj0Var.c;
        }
        dwj0Var.getClass();
        return new dwj0(g7j0Var, j, cwdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwj0)) {
            return false;
        }
        dwj0 dwj0Var = (dwj0) obj;
        return jl40.l(this.a, dwj0Var.a) && this.b == dwj0Var.b && jl40.l(this.c, dwj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ResponseEntry(request=" + this.a + ", timeStampMs=" + this.b + ", info=" + this.c + Extension.C_BRAKE;
    }
}
