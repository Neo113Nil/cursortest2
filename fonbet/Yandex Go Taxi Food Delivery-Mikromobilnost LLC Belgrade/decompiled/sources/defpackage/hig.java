package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hig {
    public final String a;
    public final Text.Constant b;
    public final ColorModel c;
    public final rbv d;
    public final rbv e;
    public final dig f;
    public final dig g;
    public final fig h;
    public final gig i;
    public final rbv j;
    public final ColorModel k;
    public final qzt l;
    public final rr51 m;
    public final eig n;
    public final String o;
    public final cig p;
    public final sms0 q;

    public hig(String str, Text.Constant constant, ColorModel colorModel, rbv rbvVar, rbv rbvVar2, dig digVar, dig digVar2, fig figVar, gig gigVar, rbv rbvVar3, ColorModel colorModel2, qzt qztVar, rr51 rr51Var, eig eigVar, String str2, cig cigVar, sms0 sms0Var) {
        this.a = str;
        this.b = constant;
        this.c = colorModel;
        this.d = rbvVar;
        this.e = rbvVar2;
        this.f = digVar;
        this.g = digVar2;
        this.h = figVar;
        this.i = gigVar;
        this.j = rbvVar3;
        this.k = colorModel2;
        this.l = qztVar;
        this.m = rr51Var;
        this.n = eigVar;
        this.o = str2;
        this.p = cigVar;
        this.q = sms0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hig)) {
            return false;
        }
        hig higVar = (hig) obj;
        return jl40.l(this.a, higVar.a) && this.b.equals(higVar.b) && jl40.l(this.c, higVar.c) && jl40.l(this.d, higVar.d) && jl40.l(this.e, higVar.e) && this.f.equals(higVar.f) && jl40.l(this.g, higVar.g) && this.h.equals(higVar.h) && this.i.equals(higVar.i) && jl40.l(this.j, higVar.j) && this.k.equals(higVar.k) && jl40.l(this.l, higVar.l) && jl40.l(this.m, higVar.m) && this.n.equals(higVar.n) && jl40.l(this.o, higVar.o) && jl40.l(this.p, higVar.p) && jl40.l(this.q, higVar.q);
    }

    public final int hashCode() {
        int d = vfc.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31);
        rbv rbvVar = this.d;
        int hashCode = (d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        rbv rbvVar2 = this.e;
        int hashCode2 = (this.f.hashCode() + ((hashCode + (rbvVar2 == null ? 0 : rbvVar2.hashCode())) * 31)) * 31;
        dig digVar = this.g;
        int hashCode3 = (this.i.hashCode() + ((this.h.hashCode() + ((hashCode2 + (digVar == null ? 0 : digVar.hashCode())) * 31)) * 31)) * 31;
        rbv rbvVar3 = this.j;
        int d2 = vfc.d(this.k, (hashCode3 + (rbvVar3 == null ? 0 : rbvVar3.hashCode())) * 31, 31);
        qzt qztVar = this.l;
        int hashCode4 = (d2 + (qztVar == null ? 0 : qztVar.hashCode())) * 31;
        rr51 rr51Var = this.m;
        int c = n.c(this.n.a, (hashCode4 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31, 31);
        String str = this.o;
        int hashCode5 = (c + (str == null ? 0 : str.hashCode())) * 31;
        cig cigVar = this.p;
        int hashCode6 = (hashCode5 + (cigVar == null ? 0 : cigVar.hashCode())) * 31;
        sms0 sms0Var = this.q;
        return hashCode6 + (sms0Var != null ? sms0Var.hashCode() : 0);
    }

    public final String toString() {
        return "State(id=" + this.a + ", title=" + this.b + ", titleColor=" + this.c + ", titleIcon=" + this.d + ", iconAfterTitle=" + this.e + ", balance=" + this.f + ", additionalBalance=" + this.g + ", shimmer=" + this.h + ", spoiler=" + this.i + ", backgroundImage=" + this.j + ", backgroundColor=" + this.k + ", backgroundGradient=" + this.l + ", divkitOverlay=" + this.m + ", a11y=" + this.n + ", viewId=" + this.o + ", backdrop=" + this.p + ", skinSelectionEntity=" + this.q + Extension.C_BRAKE;
    }
}
