package defpackage;

import java.util.ArrayList;
import java.util.Map;
import yads.cy2;
import yads.gz;
import yads.po2;
import yads.qp1;
import yads.xz;

/* loaded from: classes7.dex */
public final class d881 {
    public final boolean A;
    public final String B;
    public final boolean C;
    public final int D;
    public final int E;
    public final boolean F;
    public final xz a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final ArrayList h;
    public final no61 i;
    public final String j;
    public final String k;
    public final gz l;
    public final cy2 m;
    public final String n;
    public final qp1 o;
    public final po2 p;
    public final Object q;
    public final Map r;
    public final String s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public d881(xz xzVar, String str, String str2, String str3, String str4, int i, int i2, ArrayList arrayList, no61 no61Var, Long l, String str5, String str6, gz gzVar, cy2 cy2Var, String str7, String str8, qp1 qp1Var, po2 po2Var, Long l2, qb71 qb71Var, Map map, String str9, String str10, boolean z, boolean z2, int i3, int i4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str11, boolean z9) {
        this.a = xzVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
        this.h = arrayList;
        this.i = no61Var;
        this.j = str5;
        this.k = str6;
        this.l = gzVar;
        this.m = cy2Var;
        this.n = str7;
        this.o = qp1Var;
        this.p = po2Var;
        this.q = qb71Var;
        this.r = map;
        this.s = str9;
        this.t = str10;
        this.u = z;
        this.v = z2;
        this.w = z3;
        this.x = z4;
        this.y = z5;
        this.z = z6;
        this.A = z7;
        this.B = str11;
        this.C = z9;
        this.D = i3 * 1000;
        this.E = i4 * 1000;
        this.F = i3 > 0;
    }

    public final jd81 a() {
        cy2 cy2Var = this.m;
        if (cy2Var == null) {
            cy2Var = cy2.c;
        }
        return new jd81(this.f, this.g, cy2Var);
    }
}
