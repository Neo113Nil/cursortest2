package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public abstract class asb1 {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1395484744);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = hbb1.c(ljs0.m(f530Var, 32.0f), dbb1.a(btsVar), false, 16.0f, null, 10);
            long n = tje.n(AppColor$Palette.BgFloating, btsVar);
            byk0 byk0Var = cyk0.a;
            f530 d = q791.d(ymb1.l(m4m0.b(c, n, byk0Var), byk0Var), false, null, null, slsVar, 15);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new teb(20);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(d, (tls) Q);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            c36 c36Var = null;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            int i3 = f1h0.ic_chevron_right_24;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            pa90 a2 = wya1.a(i3, 0, btsVar);
            if (appColor$Palette == null) {
                btsVar.e0(-1411607277);
                btsVar.t(false);
            } else {
                btsVar.e0(-1411607276);
                c36Var = tse0.e(tje.n(appColor$Palette, btsVar), 5, btsVar, false);
            }
            o4b1.b(a2, null, c530.a, null, null, 0.0f, c36Var, btsVar, 56, 56);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ve6(f530Var, slsVar, i, 8);
        }
    }

    public static final void b(f530 f530Var, va01 va01Var, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(411880143);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(va01Var) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = va01Var instanceof sa01;
            int i3 = 20;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(-400024855);
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new teb(i3);
                    btsVar.o0(Q);
                }
                sa01 sa01Var = (sa01) va01Var;
                gub1.a(fnq0.a(f530Var, (tls) Q), new sa01(sa01Var.a, sa01Var.b, sa01Var.c, sa01Var.d, sa01Var.e, sa01Var.f), slsVar, btsVar, i2 & 896);
                btsVar.t(false);
            } else if (va01Var instanceof ta01) {
                btsVar.e0(-399570674);
                boolean z2 = ((ta01) va01Var).a;
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new teb(i3);
                    btsVar.o0(Q2);
                }
                f530 a = fnq0.a(f530Var, (tls) Q2);
                boolean z3 = (i2 & 896) == 256;
                Object Q3 = btsVar.Q();
                if (z3 || Q3 == o430Var) {
                    Q3 = new e350(21, slsVar);
                    btsVar.o0(Q3);
                }
                wfa1.a(z2, a, null, (tls) Q3, false, btsVar, 0, 20);
                btsVar.t(false);
            } else {
                if (!(va01Var instanceof ua01)) {
                    throw unr0.y(679831152, btsVar, false);
                }
                btsVar.e0(-399370321);
                a(((i2 >> 3) & 112) | (i2 & 14), btsVar, slsVar, f530Var);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(f530Var, va01Var, slsVar, i, 20);
        }
    }

    public static boolean c(NestedScrollView nestedScrollView) {
        return nestedScrollView.getClipToPadding();
    }

    public static final ike d(tse tseVar) {
        return bvf0.a(tseVar.getCoroutineContext().plus(new qhw0((l8x) tseVar.getCoroutineContext().get(seu.C))));
    }
}
