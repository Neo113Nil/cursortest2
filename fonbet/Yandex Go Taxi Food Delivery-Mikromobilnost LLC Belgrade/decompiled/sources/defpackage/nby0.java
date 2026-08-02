package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nby0 {
    public final mby0 a;
    public final long b;

    public nby0(mby0 mby0Var, long j) {
        this.a = mby0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nby0)) {
            return false;
        }
        nby0 nby0Var = (nby0) obj;
        return jl40.l(this.a, nby0Var.a) && this.b == nby0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TurboMode(strategy=" + this.a + ", requiredEtaMs=" + this.b + Extension.C_BRAKE;
    }
}
