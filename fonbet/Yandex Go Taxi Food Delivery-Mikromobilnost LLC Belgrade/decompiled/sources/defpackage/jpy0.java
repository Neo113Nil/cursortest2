package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jpy0 extends n351 {
    public final String c;
    public final float d;
    public final String e;
    public final cqy0 f;
    public final cqy0 g;
    public final tky0 h;
    public final List i;
    public final CharSequence j;
    public final x2s k;
    public final Integer l;
    public final boolean m;
    public final float n;
    public final String o;
    public final String p;

    public jpy0(String str, float f, String str2, cqy0 cqy0Var, cqy0 cqy0Var2, tky0 tky0Var, List list, CharSequence charSequence, x2s x2sVar, Integer num, boolean z, float f2, String str3, String str4) {
        super("text-input", false, 14);
        this.c = str;
        this.d = f;
        this.e = str2;
        this.f = cqy0Var;
        this.g = cqy0Var2;
        this.h = tky0Var;
        this.i = list;
        this.j = charSequence;
        this.k = x2sVar;
        this.l = num;
        this.m = z;
        this.n = f2;
        this.o = str3;
        this.p = str4;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpy0)) {
            return false;
        }
        jpy0 jpy0Var = (jpy0) obj;
        return jl40.l(this.c, jpy0Var.c) && y7m.b(this.d, jpy0Var.d) && jl40.l(this.e, jpy0Var.e) && jl40.l(this.f, jpy0Var.f) && jl40.l(this.g, jpy0Var.g) && jl40.l(this.h, jpy0Var.h) && jl40.l(this.i, jpy0Var.i) && jl40.l(this.j, jpy0Var.j) && this.k.equals(jpy0Var.k) && this.l.equals(jpy0Var.l) && this.m == jpy0Var.m && y7m.b(this.n, jpy0Var.n) && jl40.l(this.o, jpy0Var.o) && jl40.l(this.p, jpy0Var.p);
    }

    public final int hashCode() {
        int b = unr0.b(g8e.c(this.d, this.c.hashCode() * 31, 31), 31, this.e);
        cqy0 cqy0Var = this.f;
        int hashCode = (b + (cqy0Var == null ? 0 : cqy0Var.hashCode())) * 31;
        cqy0 cqy0Var2 = this.g;
        int c = unr0.c((this.h.hashCode() + ((hashCode + (cqy0Var2 == null ? 0 : cqy0Var2.hashCode())) * 31)) * 31, 31, this.i);
        CharSequence charSequence = this.j;
        int c2 = g8e.c(this.n, unr0.e((this.l.hashCode() + tse0.a(this.k, (c + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31)) * 31, 31, this.m), 31);
        String str = this.o;
        int hashCode2 = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.p;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String c = y7m.c(this.d);
        String c2 = y7m.c(this.n);
        StringBuilder v = b64.v("TextInputModel(text=", this.c, ", height=", c, ", placeholder=");
        v.append(this.e);
        v.append(", focusedStyle=");
        v.append(this.f);
        v.append(", unfocusedStyle=");
        v.append(this.g);
        v.append(", widgetAction=");
        v.append(this.h);
        v.append(", trails=");
        v.append(this.i);
        v.append(", errorText=");
        v.append((Object) this.j);
        v.append(", errorTextShownAnalyticsData=");
        v.append(this.k);
        v.append(", maxSymbols=");
        v.append(this.l);
        v.append(", forceOpenKeyboard=");
        unr0.A(", horizontalInset=", c2, ", metricaLabel=", v, this.m);
        return g8e.r(v, this.o, ", id=", this.p, Extension.C_BRAKE);
    }
}
