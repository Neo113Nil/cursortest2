package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dx90 extends n351 {
    public final float c;
    public final v4v d;
    public final String e;
    public final dty0 f;
    public final CharSequence g;
    public final ldc h;
    public final e770 i;
    public final x2s j;
    public final String k;

    public dx90(float f, ra90 ra90Var, String str, dty0 dty0Var, CharSequence charSequence, ldc ldcVar, e770 e770Var, x2s x2sVar, String str2) {
        super("payment-button", false, 14);
        this.c = f;
        this.d = ra90Var;
        this.e = str;
        this.f = dty0Var;
        this.g = charSequence;
        this.h = ldcVar;
        this.i = e770Var;
        this.j = x2sVar;
        this.k = str2;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx90)) {
            return false;
        }
        dx90 dx90Var = (dx90) obj;
        return y7m.b(this.c, dx90Var.c) && jl40.l(this.d, dx90Var.d) && jl40.l(this.e, dx90Var.e) && jl40.l(this.f, dx90Var.f) && jl40.l(this.g, dx90Var.g) && jl40.l(this.h, dx90Var.h) && this.i.equals(dx90Var.i) && this.j.equals(dx90Var.j) && jl40.l(this.k, dx90Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + unr0.b((this.d.hashCode() + (Float.hashCode(this.c) * 31)) * 31, 31, this.e)) * 31;
        CharSequence charSequence = this.g;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ldc ldcVar = this.h;
        int a = tse0.a(this.j, (this.i.hashCode() + ((hashCode2 + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31)) * 31, 31);
        String str = this.k;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String c = y7m.c(this.c);
        StringBuilder sb = new StringBuilder("PaymentButtonModel(height=");
        sb.append(c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", subtitleStyle=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append((Object) this.g);
        sb.append(", backgroundColor=");
        sb.append(this.h);
        sb.append(", widgetAction=");
        sb.append(this.i);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.j);
        sb.append(", id=");
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }
}
