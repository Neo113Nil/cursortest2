package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class l401 implements n401 {
    public final kdc a;
    public final k401 b;

    public l401(kdc kdcVar, k401 k401Var) {
        this.a = kdcVar;
        this.b = k401Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l401)) {
            return false;
        }
        l401 l401Var = (l401) obj;
        return jl40.l(this.a, l401Var.a) && this.b.equals(l401Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Layered(color=" + this.a + ", layers=" + this.b + Extension.C_BRAKE;
    }
}
