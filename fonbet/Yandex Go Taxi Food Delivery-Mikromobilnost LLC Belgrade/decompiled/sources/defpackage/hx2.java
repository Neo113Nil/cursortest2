package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hx2 implements kx2 {
    public final v8r0 a;

    public hx2(v8r0 v8r0Var) {
        this.a = v8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx2) && jl40.l(this.a, ((hx2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Shown(item=" + this.a + Extension.C_BRAKE;
    }
}
