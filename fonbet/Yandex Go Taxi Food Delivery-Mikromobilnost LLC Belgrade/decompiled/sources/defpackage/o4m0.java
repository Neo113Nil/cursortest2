package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class o4m0 implements s4m0 {
    public final Throwable a;

    public o4m0(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.s4m0
    public final String a() {
        return dya1.f(this);
    }

    @Override // defpackage.s4m0
    public final Throwable b() {
        return this.a;
    }

    @Override // defpackage.s4m0
    public final String c() {
        return dya1.e(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4m0) && jl40.l(this.a, ((o4m0) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return b64.m("AccountCreation(throwable=", Extension.C_BRAKE, this.a);
    }
}
