package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class am4 implements dm4 {
    public final wp2 a;

    public /* synthetic */ am4(wp2 wp2Var) {
        this.a = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof am4) {
            return jl40.l(this.a, ((am4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Colored(color=" + this.a + Extension.C_BRAKE;
    }
}
