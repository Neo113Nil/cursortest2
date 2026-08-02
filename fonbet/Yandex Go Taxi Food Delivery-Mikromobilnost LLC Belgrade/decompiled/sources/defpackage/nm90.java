package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nm90 {
    public final u8j0 a;
    public final boolean b;

    public nm90(u8j0 u8j0Var, boolean z) {
        this.a = u8j0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm90)) {
            return false;
        }
        nm90 nm90Var = (nm90) obj;
        return this.a.equals(nm90Var.a) && this.b == nm90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PassesWidgetState(passesWidgetEntity=" + this.a + ", hasAgreementAccepted=" + this.b + Extension.C_BRAKE;
    }
}
