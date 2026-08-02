package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class aen0 {
    public final String a;
    public final String b;
    public final String c;

    public aen0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aen0)) {
            return false;
        }
        aen0 aen0Var = (aen0) obj;
        return this.a.equals(aen0Var.a) && this.b.equals(aen0Var.b) && this.c.equals(aen0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("ScootersDepositCommunicationUiState(title=", this.a, ", description=", this.b, ", actionTitle="), this.c, Extension.C_BRAKE);
    }
}
