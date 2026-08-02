package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dkv extends ekv {
    public final String a;
    public final String b;
    public final String c;

    public dkv(String str, String str2, String str3) {
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
        if (!(obj instanceof dkv)) {
            return false;
        }
        dkv dkvVar = (dkv) obj;
        return this.a.equals(dkvVar.a) && this.b.equals(dkvVar.b) && this.c.equals(dkvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("Loading(title=", this.a, ", subtitle=", this.b, ", phoneNumberButtonTitle="), this.c, Extension.C_BRAKE);
    }
}
