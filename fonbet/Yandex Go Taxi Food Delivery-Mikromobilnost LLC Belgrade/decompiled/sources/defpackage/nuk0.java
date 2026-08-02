package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nuk0 implements puk0 {
    public final kk2 a;

    public nuk0(kk2 kk2Var) {
        this.a = kk2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nuk0) && this.a.equals(((nuk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(subtitle=" + ((Object) this.a) + Extension.C_BRAKE;
    }
}
