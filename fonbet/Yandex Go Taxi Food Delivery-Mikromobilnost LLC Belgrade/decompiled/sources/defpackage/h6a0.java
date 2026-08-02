package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h6a0 extends n351 {
    public final v4v c;
    public final String d;
    public final dty0 e;
    public final CharSequence f;
    public final fqs0 g;
    public final jvs0 h;
    public final e770 i;
    public final x2s j;
    public final String k;

    public h6a0(ra90 ra90Var, String str, dty0 dty0Var, CharSequence charSequence, fqs0 fqs0Var, jvs0 jvs0Var, e770 e770Var, x2s x2sVar, String str2) {
        super("payment-method", false, 14);
        this.c = ra90Var;
        this.d = str;
        this.e = dty0Var;
        this.f = charSequence;
        this.g = fqs0Var;
        this.h = jvs0Var;
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
        if (!(obj instanceof h6a0)) {
            return false;
        }
        h6a0 h6a0Var = (h6a0) obj;
        return jl40.l(this.c, h6a0Var.c) && jl40.l(this.d, h6a0Var.d) && jl40.l(this.e, h6a0Var.e) && jl40.l(this.f, h6a0Var.f) && jl40.l(this.g, h6a0Var.g) && jl40.l(this.h, h6a0Var.h) && this.i.equals(h6a0Var.i) && this.j.equals(h6a0Var.j) && jl40.l(this.k, h6a0Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.b(this.c.hashCode() * 31, 31, this.d)) * 31;
        CharSequence charSequence = this.f;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        fqs0 fqs0Var = this.g;
        int hashCode3 = (hashCode2 + (fqs0Var == null ? 0 : fqs0Var.hashCode())) * 31;
        jvs0 jvs0Var = this.h;
        int a = tse0.a(this.j, (this.i.hashCode() + ((hashCode3 + (jvs0Var == null ? 0 : jvs0Var.hashCode())) * 31)) * 31, 31);
        String str = this.k;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodModel(icon=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", titleStyle=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append((Object) this.f);
        sb.append(", additionalBody=");
        sb.append(this.g);
        sb.append(", trail=");
        sb.append(this.h);
        sb.append(", widgetAction=");
        sb.append(this.i);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.j);
        sb.append(", id=");
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }
}
