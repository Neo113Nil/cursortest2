package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cmi0 implements dmi0 {
    public final n0t0 a;

    public cmi0(n0t0 n0t0Var) {
        this.a = n0t0Var;
    }

    public final n0t0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmi0) && this.a.equals(((cmi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return n.i("Snackbar(content=", this.a, Extension.C_BRAKE);
    }
}
