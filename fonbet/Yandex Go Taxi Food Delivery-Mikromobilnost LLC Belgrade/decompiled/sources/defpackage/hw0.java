package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hw0 extends n351 {
    public final String c;
    public final String d;
    public final l8e e;
    public final uv0 f;
    public final jvs0 g;
    public final l690 h;
    public final ow0 i;
    public final tv0 j;
    public final String k;

    public hw0(String str, String str2, l8e l8eVar, uv0 uv0Var, jvs0 jvs0Var, l690 l690Var, ow0 ow0Var, tv0 tv0Var, String str3) {
        super("address-input-field", false, 14);
        this.c = str;
        this.d = str2;
        this.e = l8eVar;
        this.f = uv0Var;
        this.g = jvs0Var;
        this.h = l690Var;
        this.i = ow0Var;
        this.j = tv0Var;
        this.k = str3;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw0)) {
            return false;
        }
        hw0 hw0Var = (hw0) obj;
        return jl40.l(this.c, hw0Var.c) && jl40.l(this.d, hw0Var.d) && jl40.l(this.e, hw0Var.e) && jl40.l(this.f, hw0Var.f) && jl40.l(this.g, hw0Var.g) && this.h.equals(hw0Var.h) && this.i.equals(hw0Var.i) && this.j.equals(hw0Var.j) && jl40.l(this.k, hw0Var.k);
    }

    public final int hashCode() {
        String str = this.c;
        int b = oyr.b(this.e.a, unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.d), 31);
        uv0 uv0Var = this.f;
        int hashCode = (b + (uv0Var == null ? 0 : uv0Var.hashCode())) * 31;
        jvs0 jvs0Var = this.g;
        int hashCode2 = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((hashCode + (jvs0Var == null ? 0 : jvs0Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.k;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddressInputFieldModel(title=", this.c, ", value=", this.d, ", constraints=");
        v.append(this.e);
        v.append(", bubble=");
        v.append(this.f);
        v.append(", trail=");
        v.append(this.g);
        v.append(", paddings=");
        v.append(this.h);
        v.append(", textChangeAction=");
        v.append(this.i);
        v.append(", bubbleClickAction=");
        v.append(this.j);
        v.append(", id=");
        return oyr.t(v, this.k, Extension.C_BRAKE);
    }
}
