package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class p26 {
    public static final p26 c = new p26("", "");
    public final String a;
    public final String b;

    public p26(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p26)) {
            return false;
        }
        p26 p26Var = (p26) obj;
        return jl40.l(this.a, p26Var.a) && jl40.l(this.b, p26Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("BlePaymentLocationPermissionState(description=", this.a, ", settingsButtonTitle=", this.b, Extension.C_BRAKE);
    }

    public p26() {
        this(null, null);
    }
}
