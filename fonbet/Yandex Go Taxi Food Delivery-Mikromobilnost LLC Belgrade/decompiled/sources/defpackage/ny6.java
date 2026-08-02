package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ny6 {
    public final kdc a;
    public final CharSequence b;
    public final kdc c;
    public final sls d;

    public ny6(kdc kdcVar, String str, kdc kdcVar2, sls slsVar) {
        this.a = kdcVar;
        this.b = str;
        this.c = kdcVar2;
        this.d = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny6)) {
            return false;
        }
        ny6 ny6Var = (ny6) obj;
        return this.a.equals(ny6Var.a) && jl40.l(this.b, ny6Var.b) && this.c.equals(ny6Var.c) && this.d.equals(ny6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.d(this.c, smw0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "Button(bgColor=" + this.a + ", text=" + ((Object) this.b) + ", textColor=" + this.c + ", clickCallback=" + this.d + Extension.C_BRAKE;
    }
}
