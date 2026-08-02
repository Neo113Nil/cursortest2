package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p4m0 extends gya1 {
    public final Throwable a;
    public final String b;

    public p4m0(Throwable th, String str) {
        this.a = th;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4m0)) {
            return false;
        }
        p4m0 p4m0Var = (p4m0) obj;
        return this.a.equals(p4m0Var.a) && jl40.l(this.b, p4m0Var.b);
    }

    @Override // defpackage.gya1
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Exception(throwable=" + this.a + ", requestId=" + this.b + Extension.C_BRAKE;
    }
}
