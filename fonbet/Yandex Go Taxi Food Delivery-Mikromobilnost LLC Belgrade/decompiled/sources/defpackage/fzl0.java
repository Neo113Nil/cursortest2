package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fzl0 implements gzl0 {
    public final String a;
    public final String b;

    public fzl0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzl0)) {
            return false;
        }
        fzl0 fzl0Var = (fzl0) obj;
        return this.a.equals(fzl0Var.a) && this.b.equals(fzl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Success(deviceId=", this.a, ", walletId=", this.b, Extension.C_BRAKE);
    }
}
