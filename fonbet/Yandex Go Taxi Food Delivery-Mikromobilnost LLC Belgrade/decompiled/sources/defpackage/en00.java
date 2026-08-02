package defpackage;

import com.yandex.mapkit.geometry.Point;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class en00 {
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final Integer f;
    public final Point g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final Double l;
    public final Integer m;
    public final Integer n;
    public final Double o;
    public final List p;
    public final String q;
    public final String r;
    public final wrr s;
    public final wrr t;

    public en00(String str, String str2, String str3, Boolean bool, Boolean bool2, Integer num, Point point, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Double d, Integer num2, Integer num3, Double d2, List list, String str4, String str5, wrr wrrVar, wrr wrrVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = bool2;
        this.f = num;
        this.g = point;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = arrayList3;
        this.k = arrayList4;
        this.l = d;
        this.m = num2;
        this.n = num3;
        this.o = d2;
        this.p = list;
        this.q = str4;
        this.r = str5;
        this.s = wrrVar;
        this.t = wrrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en00)) {
            return false;
        }
        en00 en00Var = (en00) obj;
        return this.a.equals(en00Var.a) && jl40.l(this.b, en00Var.b) && jl40.l(this.c, en00Var.c) && jl40.l(this.d, en00Var.d) && jl40.l(this.e, en00Var.e) && jl40.l(this.f, en00Var.f) && jl40.l(this.g, en00Var.g) && jl40.l(this.h, en00Var.h) && jl40.l(this.i, en00Var.i) && jl40.l(this.j, en00Var.j) && jl40.l(this.k, en00Var.k) && jl40.l(this.l, en00Var.l) && jl40.l(this.m, en00Var.m) && jl40.l(this.n, en00Var.n) && jl40.l(this.o, en00Var.o) && jl40.l(this.p, en00Var.p) && jl40.l(this.q, en00Var.q) && jl40.l(this.r, en00Var.r) && jl40.l(this.s, en00Var.s) && jl40.l(this.t, en00Var.t);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Point point = this.g;
        int hashCode7 = (hashCode6 + (point == null ? 0 : point.hashCode())) * 31;
        List list = this.h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.j;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.k;
        int hashCode11 = (hashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Double d = this.l;
        int hashCode12 = (hashCode11 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.m;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.n;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d2 = this.o;
        int hashCode15 = (hashCode14 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List list5 = this.p;
        int hashCode16 = (hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str3 = this.q;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.r;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        wrr wrrVar = this.s;
        int hashCode19 = (hashCode18 + (wrrVar == null ? 0 : wrrVar.hashCode())) * 31;
        wrr wrrVar2 = this.t;
        return hashCode19 + (wrrVar2 != null ? wrrVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MapObjectData(id=", this.a, ", parentId=", this.b, ", type=");
        tse0.A(v, this.c, ", visible=", this.d, ", visibilityAnimated=");
        v.append(this.e);
        v.append(", zIndex=");
        v.append(this.f);
        v.append(", point=");
        v.append(this.g);
        v.append(", points=");
        v.append(this.h);
        v.append(", outerRing=");
        nnm.w(v, this.i, ", innerRings=", this.j, ", scaleFunction=");
        v.append(this.k);
        v.append(", direction=");
        v.append(this.l);
        v.append(", fillColor=");
        v.append(this.m);
        v.append(", strokeColor=");
        v.append(this.n);
        v.append(", strokeWidth=");
        v.append(this.o);
        v.append(", ids=");
        v.append(this.p);
        v.append(", iconId=");
        g8e.D(v, this.q, ", defaultIconId=", this.r, ", iconStyle=");
        v.append(this.s);
        v.append(", defaultIconStyle=");
        v.append(this.t);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
