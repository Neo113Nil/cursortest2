package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dvt0 {
    public final eu01 a;
    public final boolean b;
    public final cvt0 c;

    public dvt0(eu01 eu01Var, boolean z, cvt0 cvt0Var) {
        this.a = eu01Var;
        this.b = z;
        this.c = cvt0Var;
    }

    public final eu01 a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final cvt0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvt0)) {
            return false;
        }
        dvt0 dvt0Var = (dvt0) obj;
        return this.a.equals(dvt0Var.a) && this.b == dvt0Var.b && this.c.equals(dvt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SplitDepositViewState(headerState=" + this.a + ", headerVisible=" + this.b + ", screenState=" + this.c + Extension.C_BRAKE;
    }
}
