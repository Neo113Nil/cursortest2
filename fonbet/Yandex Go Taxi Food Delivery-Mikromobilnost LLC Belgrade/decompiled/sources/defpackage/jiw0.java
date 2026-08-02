package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jiw0 implements miw0 {
    public final akw0 a;

    public jiw0(akw0 akw0Var) {
        this.a = akw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jiw0) && this.a.equals(((jiw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ModalViewAction(info=" + this.a + Extension.C_BRAKE;
    }
}
