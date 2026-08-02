package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dof0 {
    public final qnf0 a;

    public dof0(qnf0 qnf0Var) {
        this.a = qnf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dof0) && this.a.equals(((dof0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PromoLeadUiState(promoImageUiState=" + this.a + Extension.C_BRAKE;
    }
}
