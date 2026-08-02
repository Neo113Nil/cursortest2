package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fa70 implements ha70 {
    public final snr0 a;
    public final Throwable b;

    public fa70(snr0 snr0Var, Throwable th) {
        this.a = snr0Var;
        this.b = th;
    }

    public final Throwable a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa70)) {
            return false;
        }
        fa70 fa70Var = (fa70) obj;
        return jl40.l(this.a, fa70Var.a) && this.b.equals(fa70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadFailed(sharedPayment=" + this.a + ", error=" + this.b + Extension.C_BRAKE;
    }
}
