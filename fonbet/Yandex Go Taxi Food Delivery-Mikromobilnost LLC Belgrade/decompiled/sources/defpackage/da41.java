package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class da41 extends ye0 {
    public final String b;
    public final Throwable c;

    public da41(String str, Throwable th) {
        super(str);
        this.b = str;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da41)) {
            return false;
        }
        da41 da41Var = (da41) obj;
        return jl40.l(this.b, da41Var.b) && jl40.l(this.c, da41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.ye0
    public final String k() {
        return this.b;
    }

    public final String toString() {
        return "Failure(urlFor3ds=" + this.b + ", error=" + this.c + Extension.C_BRAKE;
    }
}
