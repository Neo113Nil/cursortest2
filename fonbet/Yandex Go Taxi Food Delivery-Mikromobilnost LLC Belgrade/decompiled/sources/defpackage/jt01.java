package defpackage;

import android.text.SpannableStringBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jt01 implements m1j {
    public final obm a;
    public final String b;
    public final SpannableStringBuilder c;
    public final String d;
    public final CharSequence e;
    public final String f;
    public final String g;

    public jt01(obm obmVar, String str, SpannableStringBuilder spannableStringBuilder, String str2, SpannableStringBuilder spannableStringBuilder2, String str3, String str4) {
        this.a = obmVar;
        this.b = str;
        this.c = spannableStringBuilder;
        this.d = str2;
        this.e = spannableStringBuilder2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt01)) {
            return false;
        }
        jt01 jt01Var = (jt01) obj;
        if (!jl40.l(this.a, jt01Var.a) || !jl40.l(this.b, jt01Var.b) || !this.c.equals(jt01Var.c) || !jl40.l(this.d, jt01Var.d) || !jl40.l(this.e, jt01Var.e)) {
            return false;
        }
        g911 g911Var = g911.a;
        if (!g911Var.equals(g911Var) || !this.f.equals(jt01Var.f)) {
            return false;
        }
        f911 f911Var = f911.a;
        return f911Var.equals(f911Var) && jl40.l(this.g, jt01Var.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.g;
    }

    public final int hashCode() {
        obm obmVar = this.a;
        int b = unr0.b((this.c.hashCode() + unr0.b((obmVar == null ? 0 : obmVar.a.hashCode()) * 31, 31, this.b)) * 31, 31, this.d);
        return this.g.hashCode() + ((((this.f.hashCode() + ((((b + (this.e != null ? r3.hashCode() : 0)) * 31) - 677487839) * 31)) * 31) + 1831550193) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferStopItem(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", time=");
        sb.append(this.d);
        sb.append(", exit=");
        sb.append((Object) this.e);
        sb.append(", prevTransportType=");
        sb.append(g911.a);
        sb.append(", contentDescription=");
        sb.append(this.f);
        sb.append(", transportType=");
        sb.append(f911.a);
        sb.append(", id=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
