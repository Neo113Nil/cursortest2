package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lub {
    public final int a;
    public final int b;
    public final int c;
    public final List d;
    public final String e;
    public final String f;
    public final gty0 g;
    public final String h;
    public final CharSequence i;
    public final boolean j;
    public final List k;

    public lub(int i, int i2, int i3, List list, String str, String str2, gty0 gty0Var, String str3, CharSequence charSequence, boolean z, List list2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
        this.e = str;
        this.f = str2;
        this.g = gty0Var;
        this.h = str3;
        this.i = charSequence;
        this.j = z;
        this.k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lub)) {
            return false;
        }
        lub lubVar = (lub) obj;
        return this.a == lubVar.a && this.b == lubVar.b && this.c == lubVar.c && jl40.l(this.d, lubVar.d) && jl40.l(this.e, lubVar.e) && jl40.l(this.f, lubVar.f) && jl40.l(this.g, lubVar.g) && jl40.l(this.h, lubVar.h) && jl40.l(this.i, lubVar.i) && this.j == lubVar.j && jl40.l(this.k, lubVar.k);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.c(oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
        gty0 gty0Var = this.g;
        int b2 = unr0.b((b + (gty0Var == null ? 0 : gty0Var.hashCode())) * 31, 31, this.h);
        CharSequence charSequence = this.i;
        return this.k.hashCode() + unr0.e((b2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "CircleInputInnerModel(initialValue=", ", minInputValue=", ", maxInputValue=");
        s.append(this.c);
        s.append(", inputValueSteps=");
        s.append(this.d);
        s.append(", minValueTitle=");
        g8e.D(s, this.e, ", valueFormater=", this.f, ", valueTextStyle=");
        s.append(this.g);
        s.append(", formaterMask=");
        s.append(this.h);
        s.append(", subtitle=");
        s.append((Object) this.i);
        s.append(", isSubtitleLoading=");
        s.append(this.j);
        s.append(", progressLineColors=");
        return ly3.s(s, this.k, Extension.C_BRAKE);
    }
}
