package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ei40 {
    public final boolean a;
    public final CharSequence b;
    public final Boolean c;
    public final CharSequence d;
    public final Boolean e;
    public final CharSequence f;
    public final CharSequence g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final String k;
    public final String l;
    public final Boolean m;
    public final CharSequence n;
    public final CharSequence o;
    public final Integer p;
    public final Integer q;
    public final Integer r;

    public ei40(boolean z, CharSequence charSequence, Boolean bool, CharSequence charSequence2, Boolean bool2, CharSequence charSequence3, CharSequence charSequence4, Integer num, Integer num2, Integer num3, String str, String str2, Boolean bool3, CharSequence charSequence5, CharSequence charSequence6, Integer num4, Integer num5, Integer num6) {
        this.a = z;
        this.b = charSequence;
        this.c = bool;
        this.d = charSequence2;
        this.e = bool2;
        this.f = charSequence3;
        this.g = charSequence4;
        this.h = num;
        this.i = num2;
        this.j = num3;
        this.k = str;
        this.l = str2;
        this.m = bool3;
        this.n = charSequence5;
        this.o = charSequence6;
        this.p = num4;
        this.q = num5;
        this.r = num6;
    }

    public static ei40 a(ei40 ei40Var, boolean z, Integer num, Integer num2, int i) {
        boolean z2 = (i & 1) != 0 ? ei40Var.a : z;
        CharSequence charSequence = ei40Var.b;
        Boolean bool = ei40Var.c;
        CharSequence charSequence2 = ei40Var.d;
        Boolean bool2 = ei40Var.e;
        CharSequence charSequence3 = ei40Var.f;
        CharSequence charSequence4 = ei40Var.g;
        Integer num3 = (i & 128) != 0 ? ei40Var.h : num;
        Integer num4 = ei40Var.i;
        Integer num5 = ei40Var.j;
        String str = ei40Var.k;
        String str2 = ei40Var.l;
        Boolean bool3 = ei40Var.m;
        CharSequence charSequence5 = ei40Var.n;
        CharSequence charSequence6 = ei40Var.o;
        Integer num6 = (i & 32768) != 0 ? ei40Var.p : num2;
        Integer num7 = ei40Var.q;
        Integer num8 = ei40Var.r;
        ei40Var.getClass();
        return new ei40(z2, charSequence, bool, charSequence2, bool2, charSequence3, charSequence4, num3, num4, num5, str, str2, bool3, charSequence5, charSequence6, num6, num7, num8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei40)) {
            return false;
        }
        ei40 ei40Var = (ei40) obj;
        return this.a == ei40Var.a && jl40.l(this.b, ei40Var.b) && jl40.l(this.c, ei40Var.c) && jl40.l(this.d, ei40Var.d) && jl40.l(this.e, ei40Var.e) && jl40.l(this.f, ei40Var.f) && jl40.l(this.g, ei40Var.g) && jl40.l(this.h, ei40Var.h) && jl40.l(this.i, ei40Var.i) && jl40.l(this.j, ei40Var.j) && jl40.l(this.k, ei40Var.k) && jl40.l(this.l, ei40Var.l) && jl40.l(this.m, ei40Var.m) && jl40.l(this.n, ei40Var.n) && jl40.l(this.o, ei40Var.o) && jl40.l(this.p, ei40Var.p) && jl40.l(this.q, ei40Var.q) && jl40.l(this.r, ei40Var.r);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CharSequence charSequence3 = this.f;
        int hashCode6 = (hashCode5 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.g;
        int hashCode7 = (hashCode6 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        Integer num = this.h;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.k;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.m;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        CharSequence charSequence5 = this.n;
        int hashCode14 = (hashCode13 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        CharSequence charSequence6 = this.o;
        int hashCode15 = (hashCode14 + (charSequence6 == null ? 0 : charSequence6.hashCode())) * 31;
        Integer num4 = this.p;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.q;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.r;
        return hashCode17 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTrainTicketsCountState(backAndForth=");
        sb.append(this.a);
        sb.append(", oneWayTicketTypeTitle=");
        sb.append((Object) this.b);
        sb.append(", isBackAndForthEnabled=");
        sb.append(this.c);
        sb.append(", backAndForthTicketTypeTitle=");
        sb.append((Object) this.d);
        sb.append(", isAdultSectionEnabled=");
        sb.append(this.e);
        sb.append(", adultTicketsCountTitle=");
        sb.append((Object) this.f);
        sb.append(", adultTicketsCountSubtitle=");
        sb.append((Object) this.g);
        sb.append(", adultTicketsCount=");
        sb.append(this.h);
        sb.append(", adultTicketsMinValue=");
        sb.append(this.i);
        sb.append(", adultTicketsMaxValue=");
        sb.append(this.j);
        sb.append(", incrementDescription=");
        g8e.D(sb, this.k, ", decrementDescription=", this.l, ", isChildSectionEnabled=");
        sb.append(this.m);
        sb.append(", childTicketsCountTitle=");
        sb.append((Object) this.n);
        sb.append(", childTicketsCountSubtitle=");
        sb.append((Object) this.o);
        sb.append(", childTicketsCount=");
        sb.append(this.p);
        sb.append(", childTicketsMinValue=");
        sb.append(this.q);
        sb.append(", childTicketsMaxValue=");
        sb.append(this.r);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
