package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lae0 {
    public final long a;
    public final Float b;

    public lae0(long j, Float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lae0)) {
            return false;
        }
        lae0 lae0Var = (lae0) obj;
        return z5w.a(this.a, lae0Var.a) && jl40.l(this.b, lae0Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Float f = this.b;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "PopupResult(windowPosition=" + z5w.d(this.a) + ", tailCenterOffset=" + this.b + Extension.C_BRAKE;
    }
}
