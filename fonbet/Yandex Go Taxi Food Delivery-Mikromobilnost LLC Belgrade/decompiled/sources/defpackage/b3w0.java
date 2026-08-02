package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class b3w0 {
    public final c3w0 a;
    public final Long b;
    public final boolean c;
    public final boolean d;

    public b3w0(c3w0 c3w0Var, Long l, boolean z, boolean z2) {
        this.a = c3w0Var;
        this.b = l;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3w0)) {
            return false;
        }
        b3w0 b3w0Var = (b3w0) obj;
        return jl40.l(this.a, b3w0Var.a) && jl40.l(this.b, b3w0Var.b) && this.c == b3w0Var.c && this.d == b3w0Var.d;
    }

    public final int hashCode() {
        c3w0 c3w0Var = this.a;
        int hashCode = (c3w0Var == null ? 0 : c3w0Var.hashCode()) * 31;
        Long l = this.b;
        return Boolean.hashCode(this.d) + unr0.e((hashCode + (l != null ? l.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalState(triggers=");
        sb.append(this.a);
        sb.append(", loadingStartTimeMs=");
        sb.append(this.b);
        sb.append(", loadedBefore=");
        return smw0.k(", failedBefore=", Extension.C_BRAKE, sb, this.c, this.d);
    }

    public /* synthetic */ b3w0(int i) {
        this(null, null, false, false);
    }

    public b3w0() {
        this(0);
    }
}
