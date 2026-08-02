package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nec0 implements oec0 {
    public final v66 a;

    public nec0(v66 v66Var) {
        this.a = v66Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nec0) && this.a.equals(((nec0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Searchbar(blurDelegate=" + this.a + Extension.C_BRAKE;
    }
}
