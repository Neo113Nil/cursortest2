package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ckv extends ekv {
    public final String a;
    public final String b;
    public final String c;

    public ckv(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.ekv
    public final String a() {
        return this.c;
    }

    @Override // defpackage.ekv
    public final String b() {
        return this.b;
    }

    @Override // defpackage.ekv
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckv)) {
            return false;
        }
        ckv ckvVar = (ckv) obj;
        return this.a.equals(ckvVar.a) && this.b.equals(ckvVar.b) && this.c.equals(ckvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("Error(title=", this.a, ", subtitle=", this.b, ", phoneNumberButtonTitle="), this.c, Extension.C_BRAKE);
    }
}
