package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bhg extends hhg {
    public final lr20 a;

    public bhg(lr20 lr20Var) {
        this.a = lr20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhg) && this.a.equals(((bhg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowModalViewAction(modalView=" + this.a + Extension.C_BRAKE;
    }
}
