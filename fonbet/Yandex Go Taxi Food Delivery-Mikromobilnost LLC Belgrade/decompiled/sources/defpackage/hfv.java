package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class hfv implements kfv {
    public final wp2 b;

    public hfv(wp2 wp2Var) {
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfv) && jl40.l(this.b, ((hfv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Backend(color=" + this.b + Extension.C_BRAKE;
    }
}
