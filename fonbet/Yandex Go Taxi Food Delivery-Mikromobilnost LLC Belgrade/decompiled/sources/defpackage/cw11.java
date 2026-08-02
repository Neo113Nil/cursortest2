package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class cw11 extends d7 {
    public static final vms c = new vms(12);
    public final boolean a;
    public final boolean b;

    public cw11(boolean z, boolean z2) {
        super(c);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw11)) {
            return false;
        }
        cw11 cw11Var = (cw11) obj;
        return this.a == cw11Var.a && this.b == cw11Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.b("UnauthorizedRequestRetry(", Extension.C_BRAKE, this.b);
    }
}
