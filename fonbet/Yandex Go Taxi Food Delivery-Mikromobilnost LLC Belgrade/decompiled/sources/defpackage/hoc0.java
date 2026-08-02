package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hoc0 {
    public final Long a;
    public final boolean b;

    public hoc0(Long l) {
        this.a = l;
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoc0)) {
            return false;
        }
        hoc0 hoc0Var = (hoc0) obj;
        return jl40.l(this.a, hoc0Var.a) && this.b == hoc0Var.b;
    }

    public final int hashCode() {
        Long l = this.a;
        return Boolean.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "ShownParams(closeAfter=" + this.a + ", canBeSwiped=" + this.b + Extension.C_BRAKE;
    }

    public hoc0() {
        this(null);
    }
}
