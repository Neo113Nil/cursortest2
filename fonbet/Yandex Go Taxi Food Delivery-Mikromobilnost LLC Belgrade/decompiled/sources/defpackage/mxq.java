package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mxq extends n351 {
    public final String c;
    public final CharSequence d;
    public final boolean e;
    public final dty0 f;
    public final hts0 g;
    public final jvs0 h;
    public final x9x0 i;
    public final x2s j;
    public final pus0 k;
    public final String l;

    public mxq(String str, CharSequence charSequence, boolean z, dty0 dty0Var, hts0 hts0Var, jvs0 jvs0Var, x9x0 x9x0Var, x2s x2sVar, pus0 pus0Var, String str2) {
        super("field-display", false, 14);
        this.c = str;
        this.d = charSequence;
        this.e = z;
        this.f = dty0Var;
        this.g = hts0Var;
        this.h = jvs0Var;
        this.i = x9x0Var;
        this.j = x2sVar;
        this.k = pus0Var;
        this.l = str2;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxq)) {
            return false;
        }
        mxq mxqVar = (mxq) obj;
        return jl40.l(this.c, mxqVar.c) && jl40.l(this.d, mxqVar.d) && this.e == mxqVar.e && jl40.l(this.f, mxqVar.f) && jl40.l(this.g, mxqVar.g) && jl40.l(this.h, mxqVar.h) && this.i.equals(mxqVar.i) && this.j.equals(mxqVar.j) && this.k.equals(mxqVar.k) && jl40.l(this.l, mxqVar.l);
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.d;
        int e = unr0.e((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.e);
        dty0 dty0Var = this.f;
        int hashCode2 = (e + (dty0Var == null ? 0 : dty0Var.hashCode())) * 31;
        hts0 hts0Var = this.g;
        int hashCode3 = (hashCode2 + (hts0Var == null ? 0 : hts0Var.hashCode())) * 31;
        jvs0 jvs0Var = this.h;
        int hashCode4 = (this.k.hashCode() + tse0.a(this.j, (this.i.hashCode() + ((hashCode3 + (jvs0Var == null ? 0 : jvs0Var.hashCode())) * 31)) * 31, 31)) * 31;
        String str2 = this.l;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.d, "FieldDisplayModel(value=", this.c, ", description=", ", descriptionFirst=");
        t.append(this.e);
        t.append(", valueStyle=");
        t.append(this.f);
        t.append(", lead=");
        t.append(this.g);
        t.append(", trail=");
        t.append(this.h);
        t.append(", widgetAction=");
        t.append(this.i);
        t.append(", analyticsData=");
        t.append(this.j);
        t.append(", style=");
        t.append(this.k);
        t.append(", id=");
        t.append(this.l);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
