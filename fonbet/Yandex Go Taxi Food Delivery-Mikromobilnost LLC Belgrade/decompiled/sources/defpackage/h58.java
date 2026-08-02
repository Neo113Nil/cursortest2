package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class h58 {
    public final q68 a;
    public final m3u0 b;

    public h58(q68 q68Var, m3u0 m3u0Var) {
        this.a = q68Var;
        this.b = m3u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h58)) {
            return false;
        }
        h58 h58Var = (h58) obj;
        return this.a.equals(h58Var.a) && jl40.l(this.b, h58Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CarImageHolder(car=" + this.a + ", imageState=" + this.b + Extension.C_BRAKE;
    }
}
