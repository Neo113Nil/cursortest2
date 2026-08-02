package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ls70 implements ns70 {
    public final xs70 a;

    public ls70(xs70 xs70Var) {
        this.a = xs70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ls70) && jl40.l(this.a, ((ls70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenOnOrderLoaded(order=" + this.a + Extension.C_BRAKE;
    }
}
