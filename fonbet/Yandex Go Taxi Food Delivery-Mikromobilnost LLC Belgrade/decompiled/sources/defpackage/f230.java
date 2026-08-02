package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f230 implements i230 {
    public final xys0 a;

    public f230(xys0 xys0Var) {
        this.a = xys0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f230) && this.a.equals(((f230) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ModalViewOverCamera(initialType=" + this.a + Extension.C_BRAKE;
    }
}
