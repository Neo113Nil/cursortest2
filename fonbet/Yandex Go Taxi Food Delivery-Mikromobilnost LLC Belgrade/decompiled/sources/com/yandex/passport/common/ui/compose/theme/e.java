package com.yandex.passport.common.ui.compose.theme;

import com.yandex.passport.internal.ui.challenge.changecurrent.j;
import defpackage.a7u0;
import defpackage.agc;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dgc;
import defpackage.fid;
import defpackage.rdc;
import defpackage.sb2;
import defpackage.vng;
import defpackage.vvf0;
import defpackage.wir0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes8.dex */
public abstract class e {
    public static final agc a;
    public static final agc b;
    public static final wir0 c;
    public static final a7u0 d;
    public static final a7u0 e;

    static {
        long j = a.a;
        long j2 = a.b;
        long j3 = a.c;
        long j4 = a.d;
        long j5 = a.e;
        long j6 = a.f;
        long j7 = a.g;
        long j8 = a.h;
        long j9 = a.i;
        long j10 = a.j;
        long j11 = a.k;
        long j12 = a.l;
        long j13 = a.m;
        long j14 = a.n;
        long j15 = a.o;
        long j16 = a.p;
        long j17 = a.q;
        long j18 = a.r;
        long j19 = a.s;
        long j20 = a.t;
        long j21 = a.u;
        long j22 = a.v;
        long j23 = a.w;
        long j24 = a.x;
        long j25 = a.y;
        long j26 = a.z;
        long j27 = a.A;
        long j28 = a.B;
        long j29 = a.C;
        long j30 = a.D;
        long j31 = a.E;
        a = dgc.e(j, j2, j3, j4, j28, j5, j6, j7, j8, j9, j10, j11, j12, j17, j18, j19, j20, j21, j22, j26, j27, j13, j14, j15, j16, j23, j24, j25, j30, a.G, a.H, a.I, a.F, j31, j29, 524288, 65520);
        long j32 = a.J;
        long j33 = a.K;
        long j34 = a.L;
        long j35 = a.M;
        long j36 = a.N;
        long j37 = a.O;
        long j38 = a.P;
        long j39 = a.Q;
        long j40 = a.R;
        long j41 = a.S;
        long j42 = a.T;
        long j43 = a.U;
        long j44 = a.V;
        long j45 = a.W;
        long j46 = a.X;
        long j47 = a.Y;
        long j48 = a.Z;
        long j49 = a.a0;
        long j50 = a.b0;
        long j51 = a.c0;
        long j52 = a.d0;
        long j53 = a.e0;
        long j54 = a.f0;
        long j55 = a.g0;
        long j56 = a.h0;
        long j57 = a.i0;
        long j58 = a.j0;
        long j59 = a.k0;
        long j60 = a.l0;
        long j61 = a.m0;
        long j62 = a.n0;
        b = new agc(j32, j33, j34, j35, j59, j36, j37, j38, j39, j40, j41, j42, j43, j48, j49, j50, j51, j52, j53, j32, j57, j58, j44, j45, j46, j47, j54, j55, j56, j61, j60, a.p0, a.q0, a.r0, a.o0, j62, rdc.g, rdc.h, rdc.a, rdc.b, rdc.i, rdc.j, rdc.c, rdc.d, rdc.k, rdc.l, rdc.e, rdc.f);
        c = new wir0(cyk0.c(4.0f), cyk0.c(8.0f), cyk0.c(20.0f), cyk0.c(24.0f), cyk0.c(32.0f));
        d = new a7u0(new com.yandex.passport.common.network.a(1));
        e = new a7u0(new com.yandex.passport.common.network.a(2));
    }

    public static final void a(boolean z, boolean z2, final wls wlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1853475067);
        int i5 = 2;
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && btsVar.a(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (btsVar.a(z2) ? 32 : 16);
        }
        if ((i4 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                if ((i2 & 1) != 0) {
                    z = cma1.f0(btsVar);
                }
                if (i6 != 0) {
                    z2 = false;
                }
            } else {
                btsVar.Y();
            }
            btsVar.u();
            sb2.c(new vvf0[]{d.a(new b(z)), e.a(new f(z2))}, wwg.S(-973313467, true, new j(i5, !z ? a : b, wlsVar), btsVar), btsVar, 56);
        }
        final boolean z3 = z;
        final boolean z4 = z2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: com.yandex.passport.common.ui.compose.theme.d
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e.a(z3, z4, wlsVar, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }
}
