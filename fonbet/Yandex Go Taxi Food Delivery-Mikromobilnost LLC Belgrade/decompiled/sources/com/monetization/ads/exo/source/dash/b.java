package com.monetization.ads.exo.source.dash;

import defpackage.cha1;
import defpackage.dh81;
import defpackage.ey71;
import defpackage.ie81;
import defpackage.k881;
import defpackage.ng61;
import defpackage.ny61;
import defpackage.op81;
import defpackage.q581;
import defpackage.rf71;
import defpackage.uk81;
import defpackage.uu71;
import defpackage.x281;
import defpackage.yn81;
import java.util.List;

/* loaded from: classes7.dex */
public final class b extends yn81 {
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final dh81 j;
    public final op81 k;
    public final q581 l;

    public b(long j, long j2, long j3, int i, long j4, long j5, long j6, dh81 dh81Var, op81 op81Var, q581 q581Var) {
        if (dh81Var.d != (q581Var != null)) {
            ny61.k();
            throw null;
        }
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = dh81Var;
        this.k = op81Var;
        this.l = q581Var;
    }

    @Override // defpackage.yn81
    public final uk81 a(int i, uk81 uk81Var, long j) {
        boolean z;
        long j2;
        long j3;
        ng61 e;
        cha1.a(i, 1);
        long j4 = this.i;
        dh81 dh81Var = this.j;
        long j5 = -9223372036854775807L;
        if (dh81Var.d && dh81Var.e != -9223372036854775807L && dh81Var.b == -9223372036854775807L) {
            if (j > 0) {
                j4 += j;
                if (j4 > this.h) {
                    z = true;
                    j2 = -9223372036854775807L;
                    j3 = -9223372036854775807L;
                    Object obj = uk81.J;
                    op81 op81Var = this.k;
                    dh81 dh81Var2 = this.j;
                    uk81Var.a(obj, op81Var, dh81Var2, this.c, this.d, this.e, true, (dh81Var2.d || dh81Var2.e == j2 || dh81Var2.b != j2) ? false : z, this.l, j3, this.h, 0, a() - 1, this.g);
                    return uk81Var;
                }
            }
            long j6 = this.g + j4;
            long g = rf71.g(dh81Var.a(0));
            int i2 = 0;
            while (i2 < this.j.m.size() - 1 && j6 >= g) {
                j6 -= g;
                i2++;
                g = rf71.g(this.j.a(i2));
            }
            List list = ((ey71) this.j.m.get(i2)).c;
            int size = list.size();
            z = true;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    j2 = j5;
                    i3 = -1;
                    break;
                }
                j2 = j5;
                if (((k881) list.get(i3)).b == 2) {
                    break;
                }
                i3++;
                j5 = j2;
            }
            if (i3 != -1 && (e = ((x281) ((k881) list.get(i3)).c.get(0)).e()) != null && e.k(g) != 0) {
                j4 = (e.a(e.c(j6, g)) + j4) - j6;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        j3 = j4;
        Object obj2 = uk81.J;
        op81 op81Var2 = this.k;
        dh81 dh81Var22 = this.j;
        uk81Var.a(obj2, op81Var2, dh81Var22, this.c, this.d, this.e, true, (dh81Var22.d || dh81Var22.e == j2 || dh81Var22.b != j2) ? false : z, this.l, j3, this.h, 0, a() - 1, this.g);
        return uk81Var;
    }

    @Override // defpackage.yn81
    public final int b() {
        return 1;
    }

    @Override // defpackage.yn81
    public final ie81 a(int i, ie81 ie81Var, boolean z) {
        cha1.a(i, a());
        String str = z ? ((ey71) this.j.m.get(i)).a : null;
        Integer valueOf = z ? Integer.valueOf(this.f + i) : null;
        long g = rf71.g(this.j.a(i));
        long g2 = rf71.g(((ey71) this.j.m.get(i)).b - ((ey71) this.j.m.get(0)).b) - this.g;
        ie81Var.getClass();
        ie81Var.d(str, valueOf, 0, g, g2, uu71.y, false);
        return ie81Var;
    }

    @Override // defpackage.yn81
    public final int a() {
        return this.j.m.size();
    }

    @Override // defpackage.yn81
    public final int a(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f) >= 0 && intValue < a()) {
            return intValue;
        }
        return -1;
    }

    @Override // defpackage.yn81
    public final Object a(int i) {
        cha1.a(i, a());
        return Integer.valueOf(this.f + i);
    }
}
