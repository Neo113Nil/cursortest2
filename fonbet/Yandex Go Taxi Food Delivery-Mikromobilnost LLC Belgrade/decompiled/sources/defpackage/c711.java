package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class c711 implements h711 {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final String d;

    public c711(CharSequence charSequence, String str, String str2, String str3) {
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c711)) {
            return false;
        }
        c711 c711Var = (c711) obj;
        if (!jl40.l(this.a, c711Var.a) || !this.b.equals(c711Var.b) || !jl40.l(this.c, c711Var.c)) {
            return false;
        }
        g911 g911Var = g911.a;
        return g911Var.equals(g911Var) && this.d.equals(c711Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31) - 677487839) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return g911.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferRouteItem(text=");
        sb.append((Object) this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", v2Text=");
        sb.append(this.c);
        sb.append(", transportType=");
        sb.append(g911.a);
        sb.append(", id=");
        return oyr.t(sb, this.d, Extension.C_BRAKE);
    }
}
