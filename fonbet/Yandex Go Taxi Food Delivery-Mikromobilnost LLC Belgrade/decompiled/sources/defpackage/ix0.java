package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ix0 {
    public final ov0 a;

    public ix0(ov0 ov0Var) {
        this.a = ov0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix0) && this.a.equals(((ix0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddressLeadUiState(imageUiState=" + this.a + Extension.C_BRAKE;
    }
}
