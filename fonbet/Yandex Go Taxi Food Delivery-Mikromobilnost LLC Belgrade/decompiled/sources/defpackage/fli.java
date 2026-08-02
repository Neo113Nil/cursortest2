package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fli implements zlj0 {
    public final e95 a;

    public fli(e95 e95Var) {
        this.a = e95Var;
    }

    @Override // defpackage.zlj0
    public final e95 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fli) && this.a.equals(((fli) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeliveryPromoRequirementUiState(itemState=" + this.a + Extension.C_BRAKE;
    }
}
