package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jfx0 implements kfx0 {
    public final pex0 a;

    public jfx0(pex0 pex0Var) {
        this.a = pex0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfx0) && this.a.equals(((jfx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenMulticlassTariff(tariffDescription=" + this.a + Extension.C_BRAKE;
    }
}
