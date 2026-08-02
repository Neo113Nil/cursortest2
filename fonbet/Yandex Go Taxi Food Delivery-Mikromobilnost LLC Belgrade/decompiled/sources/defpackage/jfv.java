package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class jfv implements kfv {
    public final wp2 b;

    public jfv(wp2 wp2Var) {
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfv) && jl40.l(this.b, ((jfv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Local(color=" + this.b + Extension.C_BRAKE;
    }
}
