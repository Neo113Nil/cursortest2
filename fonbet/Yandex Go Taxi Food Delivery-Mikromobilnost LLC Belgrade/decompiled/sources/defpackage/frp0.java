package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class frp0 extends jnl {
    public final boolean c;
    public final boolean d;

    public frp0(boolean z, boolean z2) {
        super("BiometricEnabled", (Object) null);
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frp0)) {
            return false;
        }
        frp0 frp0Var = (frp0) obj;
        return this.c == frp0Var.c && this.d == frp0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Boolean.hashCode(this.c) * 31);
    }

    public final String toString() {
        return ly3.o("BiometricEnabled(deviceSupported=", ", userConfirmed=", Extension.C_BRAKE, this.c, this.d);
    }
}
