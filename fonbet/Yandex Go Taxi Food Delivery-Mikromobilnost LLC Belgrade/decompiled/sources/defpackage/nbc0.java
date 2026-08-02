package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nbc0 extends obc0 {
    public final i5t0 a;

    public nbc0(i5t0 i5t0Var) {
        this.a = i5t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbc0) && jl40.l(this.a, ((nbc0) obj).a);
    }

    public final int hashCode() {
        i5t0 i5t0Var = this.a;
        if (i5t0Var == null) {
            return 0;
        }
        return i5t0Var.hashCode();
    }

    public final String toString() {
        return "Restored(updateInfo=" + this.a + Extension.C_BRAKE;
    }
}
