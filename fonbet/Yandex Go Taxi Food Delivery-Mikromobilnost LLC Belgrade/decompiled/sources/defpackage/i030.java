package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i030 implements uni {
    public final lr20 a;

    public i030(lr20 lr20Var) {
        this.a = lr20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i030) && this.a.equals(((i030) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ModalViewActionArgs(modal=" + this.a + Extension.C_BRAKE;
    }
}
