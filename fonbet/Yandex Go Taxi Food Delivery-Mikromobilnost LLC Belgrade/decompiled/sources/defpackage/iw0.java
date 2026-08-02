package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class iw0 implements pre, pru {
    public final String a;
    public final c0k0 b;
    public final hyq c;
    public final String d;
    public final sv0 e;
    public final fws0 f;
    public final o690 g;

    public iw0(String str, c0k0 c0k0Var, hyq hyqVar, String str2, sv0 sv0Var, fws0 fws0Var, o690 o690Var) {
        this.a = str;
        this.b = c0k0Var;
        this.c = hyqVar;
        this.d = str2;
        this.e = sv0Var;
        this.f = fws0Var;
        this.g = o690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw0)) {
            return false;
        }
        iw0 iw0Var = (iw0) obj;
        return jl40.l(this.a, iw0Var.a) && this.b.equals(iw0Var.b) && this.c.equals(iw0Var.c) && jl40.l(this.d, iw0Var.d) && jl40.l(this.e, iw0Var.e) && jl40.l(this.f, iw0Var.f) && jl40.l(this.g, iw0Var.g);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "address-input-field";
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        sv0 sv0Var = this.e;
        int hashCode3 = (hashCode2 + (sv0Var == null ? 0 : sv0Var.hashCode())) * 31;
        fws0 fws0Var = this.f;
        int hashCode4 = (hashCode3 + (fws0Var == null ? 0 : fws0Var.hashCode())) * 31;
        o690 o690Var = this.g;
        return hashCode4 + (o690Var != null ? o690Var.hashCode() : 0);
    }

    public final String toString() {
        return "AddressInputFieldRemoteCoreWidget(id=" + this.a + ", resultPosition=" + this.b + ", fieldType=" + this.c + ", placeholder=" + this.d + ", bubble=" + this.e + ", trail=" + this.f + ", horizontalPaddings=" + this.g + Extension.C_BRAKE;
    }
}
