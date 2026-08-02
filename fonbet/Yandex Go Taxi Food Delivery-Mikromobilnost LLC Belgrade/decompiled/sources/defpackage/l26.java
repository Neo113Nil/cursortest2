package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class l26 {
    public static final l26 c = new l26("", "");
    public final String a;
    public final String b;

    public l26(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l26)) {
            return false;
        }
        l26 l26Var = (l26) obj;
        return jl40.l(this.a, l26Var.a) && jl40.l(this.b, l26Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("BlePaymentBluetoothDisabledState(description=", this.a, ", settingsButtonTitle=", this.b, Extension.C_BRAKE);
    }

    public l26() {
        this(null, null);
    }
}
