package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class co60 extends n351 {
    public final String c;
    public final String d;
    public final String e;
    public final CharSequence f;
    public final v4v g;
    public final boolean h;
    public final tky0 i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;

    public co60(String str, String str2, String str3, CharSequence charSequence, lvi0 lvi0Var, boolean z, tky0 tky0Var, String str4, String str5, int i, String str6) {
        super("numeric-input", false, 14);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = charSequence;
        this.g = lvi0Var;
        this.h = z;
        this.i = tky0Var;
        this.j = str4;
        this.k = str5;
        this.l = i;
        this.m = str6;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co60)) {
            return false;
        }
        co60 co60Var = (co60) obj;
        return jl40.l(this.c, co60Var.c) && jl40.l(this.d, co60Var.d) && jl40.l(this.e, co60Var.e) && jl40.l(this.f, co60Var.f) && jl40.l(this.g, co60Var.g) && this.h == co60Var.h && this.i.equals(co60Var.i) && jl40.l(this.j, co60Var.j) && this.k.equals(co60Var.k) && this.l == co60Var.l && jl40.l(this.m, co60Var.m);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        CharSequence charSequence = this.f;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        v4v v4vVar = this.g;
        int hashCode2 = (this.i.hashCode() + unr0.e((hashCode + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31, 31, this.h)) * 31;
        String str = this.j;
        int b2 = oyr.b(this.l, unr0.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31);
        String str2 = this.m;
        return b2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String a = mkx.a(this.l);
        StringBuilder v = b64.v("NumericInputModel(text=", this.c, ", placeholder=", this.d, ", label=");
        v.append(this.e);
        v.append(", invalidInputMessage=");
        v.append((Object) this.f);
        v.append(", leadIcon=");
        v.append(this.g);
        v.append(", forceOpenKeyboard=");
        v.append(this.h);
        v.append(", widgetAction=");
        v.append(this.i);
        v.append(", metricaLabel=");
        v.append(this.j);
        v.append(", invalidMessageMetricaLabel=");
        g8e.D(v, this.k, ", keyboardType=", a, ", id=");
        return oyr.t(v, this.m, Extension.C_BRAKE);
    }
}
