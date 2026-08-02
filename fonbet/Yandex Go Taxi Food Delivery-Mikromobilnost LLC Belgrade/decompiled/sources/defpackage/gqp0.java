package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gqp0 extends crp0 {
    public final Throwable c;
    public final String d;
    public final boolean e;
    public final String f;

    public gqp0(Throwable th, String str, boolean z, String str2) {
        super("Cryptography");
        this.c = th;
        this.d = str;
        this.e = z;
        this.f = str2;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.c;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqp0)) {
            return false;
        }
        gqp0 gqp0Var = (gqp0) obj;
        return this.c.equals(gqp0Var.c) && jl40.l(this.d, gqp0Var.d) && this.e == gqp0Var.e && this.f.equals(gqp0Var.f);
    }

    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.e(unr0.b(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Cryptography(exception=" + this.c + ", mode=" + this.d + ", isBiometricEncrypt=" + this.e + ", payload=" + ((Object) this.f) + Extension.C_BRAKE;
    }
}
