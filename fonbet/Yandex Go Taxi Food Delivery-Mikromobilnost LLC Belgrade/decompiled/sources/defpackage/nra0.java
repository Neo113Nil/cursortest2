package defpackage;

import android.text.SpannableStringBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nra0 implements m1j {
    public final SpannableStringBuilder a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public nra0(SpannableStringBuilder spannableStringBuilder, String str, String str2, String str3, String str4) {
        this.a = spannableStringBuilder;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nra0)) {
            return false;
        }
        nra0 nra0Var = (nra0) obj;
        if (!this.a.equals(nra0Var.a) || !jl40.l(this.b, nra0Var.b) || !jl40.l(this.c, nra0Var.c) || !this.d.equals(nra0Var.d)) {
            return false;
        }
        f911 f911Var = f911.a;
        return f911Var.equals(f911Var) && jl40.l(this.e, nra0Var.e);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + 1831550193) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PedestrianSectionItem(text=");
        sb.append((Object) this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", v2Text=");
        g8e.D(sb, this.c, ", contentDescription=", this.d, ", transportType=");
        sb.append(f911.a);
        sb.append(", id=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
