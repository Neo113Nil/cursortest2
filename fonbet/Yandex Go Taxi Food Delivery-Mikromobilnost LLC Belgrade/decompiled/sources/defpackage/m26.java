package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class m26 {
    public static final m26 c = new m26("", "");
    public final String a;
    public final String b;

    public m26(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m26)) {
            return false;
        }
        m26 m26Var = (m26) obj;
        return jl40.l(this.a, m26Var.a) && jl40.l(this.b, m26Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("BlePaymentBluetoothPermissionState(description=", this.a, ", settingsButtonTitle=", this.b, Extension.C_BRAKE);
    }

    public m26() {
        this(null, null);
    }
}
