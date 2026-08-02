package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pwh implements zlj0 {
    public final e95 a;
    public final boolean b;

    public pwh(e95 e95Var, boolean z) {
        this.a = e95Var;
        this.b = z;
    }

    @Override // defpackage.zlj0
    public final e95 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwh)) {
            return false;
        }
        pwh pwhVar = (pwh) obj;
        return this.a.equals(pwhVar.a) && this.b == pwhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryBooleanRequirementUiState(itemState=" + this.a + ", isSelected=" + this.b + Extension.C_BRAKE;
    }
}
