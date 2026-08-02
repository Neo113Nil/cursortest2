package defpackage;

import androidx.compose.animation.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.images.b;
import com.yandex.go.design.compose.images.c;
import com.yandex.go.design.compose.spinner.SpinnerSize;
import com.yandex.go.design.compose.spinner.SpinnerState;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes11.dex */
public abstract class ffb1 {
    public static final void a(SpinnerSize spinnerSize, f530 f530Var, wp2 wp2Var, fid fidVar, int i) {
        f530 f530Var2;
        wp2 wp2Var2;
        au2 au2Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-173380756);
        int i2 = i | (btsVar.c(spinnerSize.ordinal()) ? 4 : 2) | 432;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            AppColor$Palette appColor$Palette = AppColor$Palette.Control;
            int i3 = xpt0.b[spinnerSize.ordinal()];
            if (i3 == 1) {
                au2Var = nk91.c;
                if (au2Var == null) {
                    lgv lgvVar = new lgv("Done24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var = new a6t0(rzo.d(0));
                    a6t0 a6t0Var2 = new a6t0(iq2.g);
                    uq90 g = tse0.g(5.5f, 12.5f, 10.0f, 17.0f);
                    g.h(19.0f, 8.0f);
                    lgvVar.b(1.0f, 1.0f, 2.5f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 1, 0, a6t0Var, a6t0Var2, "", g.a);
                    au2Var = rya1.a(lgvVar.d(), true);
                    nk91.c = au2Var;
                }
            } else if (i3 == 2) {
                au2Var = pk91.e;
                if (au2Var == null) {
                    lgv lgvVar2 = new lgv("Done40", 40.0f, 40.0f, 40.0f, 40.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var3 = new a6t0(rzo.d(0));
                    a6t0 a6t0Var4 = new a6t0(iq2.g);
                    uq90 g2 = tse0.g(9.167f, 20.8333f, 16.667f, 28.3333f);
                    g2.h(31.667f, 13.3333f);
                    lgvVar2.b(1.0f, 1.0f, 2.5f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 1, 0, a6t0Var3, a6t0Var4, "", g2.a);
                    au2Var = rya1.a(lgvVar2.d(), true);
                    pk91.e = au2Var;
                }
            } else {
                if (i3 != 3) {
                    w511.b();
                    return;
                }
                au2Var = rk91.c;
                if (au2Var == null) {
                    lgv lgvVar3 = new lgv("Done64", 64.0f, 64.0f, 64.0f, 64.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var5 = new a6t0(rzo.d(0));
                    a6t0 a6t0Var6 = new a6t0(iq2.g);
                    uq90 g3 = tse0.g(14.667f, 33.3333f, 26.667f, 45.3332f);
                    g3.h(50.667f, 21.3333f);
                    lgvVar3.b(1.0f, 1.0f, 3.5f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 1, 0, a6t0Var5, a6t0Var6, "", g3.a);
                    au2Var = rya1.a(lgvVar3.d(), true);
                    rk91.c = au2Var;
                }
            }
            c530 c530Var = c530.a;
            sya1.a(au2Var, c530Var, null, appColor$Palette, btsVar, 3504, 0);
            f530Var2 = c530Var;
            wp2Var2 = appColor$Palette;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            wp2Var2 = wp2Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wpt0(spinnerSize, f530Var2, wp2Var2, i, 1);
        }
    }

    public static final void b(SpinnerSize spinnerSize, f530 f530Var, wp2 wp2Var, fid fidVar, int i) {
        f530 f530Var2;
        wp2 wp2Var2;
        au2 au2Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1980849730);
        int i2 = i | (btsVar.c(spinnerSize.ordinal()) ? 4 : 2) | 432;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            AppColor$Palette appColor$Palette = AppColor$Palette.Error;
            int i3 = xpt0.b[spinnerSize.ordinal()];
            if (i3 == 1) {
                au2Var = w8a1.b;
                if (au2Var == null) {
                    lgv lgvVar = new lgv("Error24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var = new a6t0(iq2.g);
                    uq90 e = nnm.e(18.6464f, 6.7536f);
                    e.d(18.8417f, 6.5583f, 18.8417f, 6.2417f, 18.6464f, 6.0465f);
                    e.h(17.9536f, 5.3535f);
                    e.d(17.7583f, 5.1583f, 17.4417f, 5.1583f, 17.2464f, 5.3535f);
                    e.h(12.0f, 10.6f);
                    e.h(6.7536f, 5.3535f);
                    e.d(6.5583f, 5.1583f, 6.2417f, 5.1583f, 6.0465f, 5.3535f);
                    e.h(5.3535f, 6.0465f);
                    e.d(5.1583f, 6.2417f, 5.1583f, 6.5583f, 5.3535f, 6.7536f);
                    e.h(10.6f, 12.0f);
                    e.h(5.3535f, 17.2464f);
                    e.d(5.1583f, 17.4417f, 5.1583f, 17.7583f, 5.3535f, 17.9536f);
                    e.h(6.0465f, 18.6464f);
                    e.d(6.2417f, 18.8417f, 6.5583f, 18.8417f, 6.7536f, 18.6464f);
                    e.h(12.0f, 13.4f);
                    e.h(17.2464f, 18.6464f);
                    e.d(17.4417f, 18.8417f, 17.7583f, 18.8417f, 17.9536f, 18.6464f);
                    e.h(18.6464f, 17.9536f);
                    e.d(18.8417f, 17.7583f, 18.8417f, 17.4417f, 18.6464f, 17.2464f);
                    tse0.u(e, 13.4f, 12.0f, 18.6464f, 6.7536f);
                    lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                    au2Var = rya1.a(lgvVar.d(), true);
                    w8a1.b = au2Var;
                }
            } else if (i3 == 2) {
                au2Var = b9a1.a;
                if (au2Var == null) {
                    lgv lgvVar2 = new lgv("Error40", 40.0f, 40.0f, 40.0f, 40.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var2 = new a6t0(iq2.g);
                    uq90 e2 = nnm.e(31.1245f, 8.1465f);
                    e2.d(30.9292f, 7.9512f, 30.6126f, 7.9512f, 30.4174f, 8.1465f);
                    e2.h(19.9999f, 18.5638f);
                    e2.h(9.5826f, 8.1465f);
                    e2.d(9.3873f, 7.9513f, 9.0707f, 7.9513f, 8.8755f, 8.1465f);
                    e2.h(8.1465f, 8.8755f);
                    e2.d(7.9512f, 9.0708f, 7.9512f, 9.3874f, 8.1465f, 9.5826f);
                    e2.h(18.5638f, 20.0f);
                    e2.h(8.1465f, 30.4173f);
                    e2.d(7.9512f, 30.6126f, 7.9512f, 30.9291f, 8.1465f, 31.1244f);
                    e2.h(8.8755f, 31.8534f);
                    e2.d(9.0707f, 32.0487f, 9.3873f, 32.0487f, 9.5826f, 31.8534f);
                    e2.h(19.9999f, 21.4361f);
                    e2.h(30.4174f, 31.8535f);
                    e2.d(30.6126f, 32.0488f, 30.9292f, 32.0488f, 31.1245f, 31.8535f);
                    e2.h(31.8535f, 31.1245f);
                    e2.d(32.0488f, 30.9292f, 32.0488f, 30.6126f, 31.8535f, 30.4174f);
                    e2.h(21.4361f, 20.0f);
                    e2.h(31.8535f, 9.5826f);
                    e2.d(32.0487f, 9.3873f, 32.0487f, 9.0707f, 31.8535f, 8.8755f);
                    e2.h(31.1245f, 8.1465f);
                    e2.c();
                    lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", e2.a);
                    au2Var = rya1.a(lgvVar2.d(), true);
                    b9a1.a = au2Var;
                }
            } else {
                if (i3 != 3) {
                    w511.b();
                    return;
                }
                au2Var = i9a1.f;
                if (au2Var == null) {
                    lgv lgvVar3 = new lgv("Error64", 64.0f, 64.0f, 64.0f, 64.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var3 = new a6t0(iq2.g);
                    uq90 e3 = nnm.e(47.7066f, 47.026f);
                    e3.d(48.0972f, 46.6354f, 48.0972f, 46.0023f, 47.7066f, 45.6117f);
                    e3.h(34.0948f, 31.9999f);
                    e3.h(47.7064f, 18.3884f);
                    e3.d(48.0969f, 17.9979f, 48.0969f, 17.3647f, 47.7064f, 16.9742f);
                    e3.h(47.0252f, 16.2929f);
                    e3.d(46.6346f, 15.9024f, 46.0015f, 15.9024f, 45.6109f, 16.2929f);
                    e3.h(31.9993f, 29.9045f);
                    e3.h(18.3876f, 16.2929f);
                    e3.d(17.9971f, 15.9024f, 17.3639f, 15.9024f, 16.9734f, 16.2929f);
                    e3.h(16.2922f, 16.9741f);
                    e3.d(15.9016f, 17.3646f, 15.9016f, 17.9978f, 16.2922f, 18.3883f);
                    e3.h(29.9039f, 31.9999f);
                    e3.h(16.2919f, 45.6118f);
                    e3.d(15.9014f, 46.0023f, 15.9014f, 46.6355f, 16.2919f, 47.026f);
                    e3.h(16.9731f, 47.7072f);
                    e3.d(17.3637f, 48.0978f, 17.9968f, 48.0978f, 18.3874f, 47.7072f);
                    e3.h(31.9993f, 34.0954f);
                    e3.h(45.6112f, 47.7072f);
                    e3.d(46.0017f, 48.0977f, 46.6349f, 48.0977f, 47.0254f, 47.7072f);
                    e3.h(47.7066f, 47.026f);
                    e3.c();
                    lgvVar3.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var3, null, "", e3.a);
                    au2Var = rya1.a(lgvVar3.d(), true);
                    i9a1.f = au2Var;
                }
            }
            c530 c530Var = c530.a;
            sya1.a(au2Var, c530Var, null, appColor$Palette, btsVar, 3504, 0);
            f530Var2 = c530Var;
            wp2Var2 = appColor$Palette;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            wp2Var2 = wp2Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wpt0(spinnerSize, f530Var2, wp2Var2, i, 0);
        }
    }

    public static final void c(SpinnerSize spinnerSize, f530 f530Var, wp2 wp2Var, f3n f3nVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        bts btsVar;
        wp2 wp2Var2;
        f3n f3nVar2;
        f530 f530Var3;
        f530 f530Var4;
        wp2 wp2Var3;
        f3n K;
        au2 au2Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(501764778);
        if ((i & 6) == 0) {
            i3 = i | (btsVar2.c(spinnerSize.ordinal()) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i4 = i3 | (btsVar2.k(f530Var2) ? 32 : 16);
        }
        int i6 = i4 | 1408;
        if (btsVar2.V(i6 & 1, (i6 & 1171) != 1170)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                f530Var4 = i5 != 0 ? c530.a : f530Var2;
                wp2Var3 = AppColor$Palette.Control;
                K = sb2.K(1000, 0, ubn.d, 2);
            } else {
                btsVar2.Y();
                wp2Var3 = wp2Var;
                K = f3nVar;
                f530Var4 = f530Var2;
            }
            btsVar2.u();
            osv d = z5b1.d(z5b1.g("SpinnerRotationTransition", btsVar2, 0), 0.0f, 360.0f, sb2.w(K, null, 0L, 6), "SpinnerRotation", btsVar2, 29112, 0);
            int i7 = xpt0.b[spinnerSize.ordinal()];
            if (i7 == 1) {
                au2Var = ifb1.a;
                if (au2Var == null) {
                    lgv lgvVar = new lgv("Loading24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var = new a6t0(rzo.d(0));
                    a6t0 a6t0Var2 = new a6t0(iq2.g);
                    uq90 e = nnm.e(23.0f, 12.0f);
                    e.d(23.0f, 18.0751f, 18.0751f, 23.0f, 12.0f, 23.0f);
                    e.d(5.9249f, 23.0f, 1.0f, 18.0751f, 1.0f, 12.0f);
                    e.d(1.0f, 5.9249f, 5.9249f, 1.0f, 12.0f, 1.0f);
                    lgvVar.b(1.0f, 1.0f, 2.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 1, 0, a6t0Var, a6t0Var2, "", e.a);
                    au2Var = rya1.a(lgvVar.d(), true);
                    ifb1.a = au2Var;
                }
            } else if (i7 == 2) {
                au2Var = kfb1.a;
                if (au2Var == null) {
                    lgv lgvVar2 = new lgv("Loading40", 40.0f, 40.0f, 40.0f, 40.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var3 = new a6t0(rzo.d(0));
                    a6t0 a6t0Var4 = new a6t0(iq2.g);
                    uq90 e2 = nnm.e(39.0f, 20.0f);
                    e2.d(39.0f, 30.4934f, 30.4934f, 39.0f, 20.0f, 39.0f);
                    e2.d(9.5066f, 39.0f, 1.0f, 30.4934f, 1.0f, 20.0f);
                    e2.d(1.0f, 9.5066f, 9.5066f, 1.0f, 20.0f, 1.0f);
                    lgvVar2.b(1.0f, 1.0f, 2.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 1, 0, a6t0Var3, a6t0Var4, "", e2.a);
                    au2Var = rya1.a(lgvVar2.d(), true);
                    kfb1.a = au2Var;
                }
            } else {
                if (i7 != 3) {
                    w511.b();
                    return;
                }
                au2Var = lfb1.a;
                if (au2Var == null) {
                    lgv lgvVar3 = new lgv("Loading64", 64.0f, 64.0f, 64.0f, 64.0f, 0L, 0, false, 224);
                    a6t0 a6t0Var5 = new a6t0(rzo.d(0));
                    a6t0 a6t0Var6 = new a6t0(iq2.g);
                    uq90 e3 = nnm.e(62.5f, 32.0f);
                    e3.d(62.5f, 48.8447f, 48.8447f, 62.5f, 32.0f, 62.5f);
                    e3.d(15.1553f, 62.5f, 1.5f, 48.8447f, 1.5f, 32.0f);
                    e3.d(1.5f, 15.1553f, 15.1553f, 1.5f, 32.0f, 1.5f);
                    lgvVar3.b(1.0f, 1.0f, 3.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 1, 0, a6t0Var5, a6t0Var6, "", e3.a);
                    au2Var = rya1.a(lgvVar3.d(), true);
                    lfb1.a = au2Var;
                }
            }
            boolean k = btsVar2.k(d);
            Object Q = btsVar2.Q();
            if (k || Q == did.a) {
                Q = new xo1(d, 19);
                btsVar2.o0(Q);
            }
            f530 a = d.a(f530Var4, (tls) Q);
            wp2 wp2Var4 = wp2Var3;
            sya1.a(au2Var, a, null, wp2Var4, btsVar2, 3456, 0);
            btsVar = btsVar2;
            wp2Var2 = wp2Var4;
            f530Var3 = f530Var4;
            f3nVar2 = K;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            wp2Var2 = wp2Var;
            f3nVar2 = f3nVar;
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p91(spinnerSize, f530Var3, wp2Var2, f3nVar2, i, i2, 12);
        }
    }

    public static final void d(f530 f530Var, SpinnerState spinnerState, SpinnerSize spinnerSize, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        SpinnerState spinnerState2;
        SpinnerSize spinnerSize2;
        int i4;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(598193924);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.c(spinnerState == null ? -1 : spinnerState.ordinal()) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.c(spinnerSize != null ? spinnerSize.ordinal() : -1) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                f530Var3 = c530.a;
                i4 = i7;
            } else {
                i4 = i7;
                f530Var3 = f530Var2;
            }
            SpinnerState spinnerState3 = i6 != 0 ? SpinnerState.LOADING : spinnerState;
            SpinnerSize spinnerSize3 = i4 != 0 ? SpinnerSize.LARGE : spinnerSize;
            a.b(spinnerState3, f530Var3, null, x4c.y, "SpinnerAnimation", null, wwg.S(767643093, true, new alb0(26, spinnerSize3), btsVar), btsVar, ((i3 >> 3) & 14) | 1600512 | ((i3 << 3) & 112), 36);
            spinnerSize2 = spinnerSize3;
            spinnerState2 = spinnerState3;
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
            spinnerState2 = spinnerState;
            spinnerSize2 = spinnerSize;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(f530Var2, (Object) spinnerState2, (Object) spinnerSize2, i, i2, 26);
        }
    }

    public static final m3u0 e(tbv tbvVar, fid fidVar) {
        igd igdVar = (igd) ((i3y) lgd.a.getValue()).getValue();
        bts btsVar = (bts) fidVar;
        oz40 n = f.n(Boolean.valueOf(!((ry2) btsVar.m(uy2.a)).b), fidVar);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = zpn.j(EmptyCoroutineContext.a, btsVar);
            btsVar.o0(Q);
        }
        tse tseVar = (tse) Q;
        boolean k = btsVar.k(tbvVar) | btsVar.k(tseVar);
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = new b(tbvVar, tseVar, igdVar, n);
            btsVar.o0(Q2);
        }
        return ((b) Q2).y;
    }

    public static final m3u0 f(nvi0 nvi0Var, fid fidVar, int i) {
        igd igdVar = (igd) ((i3y) lgd.a.getValue()).getValue();
        bts btsVar = (bts) fidVar;
        boolean z = true;
        oz40 n = f.n(Boolean.valueOf(!((ry2) btsVar.m(uy2.a)).b), fidVar);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = zpn.j(EmptyCoroutineContext.a, btsVar);
            btsVar.o0(Q);
        }
        tse tseVar = (tse) Q;
        if ((((i & 14) ^ 6) <= 4 || !btsVar.k(nvi0Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean k = btsVar.k(tseVar) | z;
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = new c(nvi0Var, tseVar, igdVar, n);
            btsVar.o0(Q2);
        }
        return ((c) Q2).y;
    }
}
