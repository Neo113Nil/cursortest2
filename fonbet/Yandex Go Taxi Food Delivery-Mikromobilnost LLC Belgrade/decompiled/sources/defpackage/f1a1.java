package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.n;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.ybsdk.core.design.theme.ThemeType;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes11.dex */
public abstract class f1a1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(b6n b6nVar, f530 f530Var, tls tlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        tls tlsVar2;
        bts btsVar;
        f530 f530Var3;
        tls tlsVar3;
        aii0 v;
        int i4;
        f530 f530Var4;
        tls tlsVar4;
        tls tlsVar5;
        gv90 gv90Var = b6nVar.f;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1973458905);
        int i5 = (btsVar2.k(b6nVar) ? 4 : 2) | i;
        int i6 = i2 & 2;
        int i7 = 16;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i5 |= btsVar2.k(f530Var2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                tlsVar2 = tlsVar;
                i5 |= btsVar2.e(tlsVar2) ? 256 : 128;
                if (btsVar2.V(i5 & 1, (i5 & 147) != 146)) {
                    if (i6 != 0) {
                        f530Var4 = c530.a;
                        i4 = i3;
                    } else {
                        i4 = i3;
                        f530Var4 = f530Var2;
                    }
                    o430 o430Var = did.a;
                    if (i4 != 0) {
                        Object Q = btsVar2.Q();
                        if (Q == o430Var) {
                            Q = new urm(i7);
                            btsVar2.o0(Q);
                        }
                        tlsVar4 = (tls) Q;
                    } else {
                        tlsVar4 = tlsVar2;
                    }
                    boolean k = btsVar2.k(gv90Var);
                    Object Q2 = btsVar2.Q();
                    if (k || Q2 == o430Var) {
                        Q2 = new y5n(b6nVar, tlsVar4);
                        btsVar2.o0(Q2);
                    }
                    sls slsVar = (sls) Q2;
                    if (gv90Var instanceof mu90) {
                        btsVar2.e0(-1801520755);
                        a.b(slsVar, f530Var4, qke.q, ldc.l, 0L, null, null, null, ((mu90) gv90Var).b, null, null, null, wwg.S(397214446, true, new nfj(3, b6nVar, tlsVar4), btsVar2), btsVar2, (i5 & 112) | 3456, 384, 3824);
                        btsVar2.t(false);
                        tlsVar5 = tlsVar4;
                    } else {
                        btsVar2.e0(-1801136448);
                        int i8 = i5 & 1022;
                        tlsVar5 = tlsVar4;
                        b(b6nVar, f530Var4, tlsVar5, btsVar2, i8, 0);
                        btsVar2.t(false);
                    }
                    btsVar = btsVar2;
                    tlsVar3 = tlsVar5;
                    f530Var3 = f530Var4;
                } else {
                    btsVar2.Y();
                    btsVar = btsVar2;
                    f530Var3 = f530Var2;
                    tlsVar3 = tlsVar2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new x5n(b6nVar, f530Var3, tlsVar3, i, i2, 1);
                    return;
                }
                return;
            }
            tlsVar2 = tlsVar;
            if (btsVar2.V(i5 & 1, (i5 & 147) != 146)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        tlsVar2 = tlsVar;
        if (btsVar2.V(i5 & 1, (i5 & 147) != 146)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final b6n b6nVar, f530 f530Var, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        bts btsVar;
        f530 f530Var3;
        aii0 v;
        f530 f530Var4;
        androidx.compose.runtime.internal.a aVar;
        androidx.compose.runtime.internal.a S;
        androidx.compose.runtime.internal.a aVar2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1365260071);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(b6nVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        int i5 = 16;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar2.e(tlsVar) ? 256 : 128;
            }
            final int i6 = 1;
            final int i7 = 0;
            if (btsVar2.V(i3 & 1, (i3 & 147) == 146)) {
                btsVar = btsVar2;
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                f530 f530Var5 = i4 != 0 ? c530.a : f530Var2;
                String e = ohb1.e(btsVar2, uzh0.delivery_copy_text_button);
                gv90 gv90Var = b6nVar.j;
                gv90 gv90Var2 = b6nVar.f;
                if (gv90Var instanceof mu90) {
                    btsVar2.e0(-877229037);
                    boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256);
                    Object Q = btsVar2.Q();
                    if (z || Q == did.a) {
                        Q = new t8j(i5, tlsVar, b6nVar);
                        btsVar2.o0(Q);
                    }
                    f530Var4 = fnq0.b(f530Var5, true, (tls) Q);
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(-877091645);
                    btsVar2.t(false);
                    f530Var4 = f530Var5;
                }
                f530 f = ocb1.f(f530Var4, b6nVar.k, btsVar2, 0);
                v4v v4vVar = b6nVar.c;
                androidx.compose.runtime.internal.a aVar3 = null;
                if (v4vVar == null) {
                    btsVar2.e0(-876913365);
                    btsVar2.t(false);
                    aVar = null;
                } else {
                    btsVar2.e0(-876913364);
                    androidx.compose.runtime.internal.a S2 = wwg.S(572602736, true, new mb(v4vVar, 10), btsVar2);
                    btsVar2.t(false);
                    aVar = S2;
                }
                androidx.compose.runtime.internal.a S3 = wwg.S(-2093222901, true, new wls() { // from class: z5n
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = i7;
                        zy11 zy11Var = zy11.a;
                        b6n b6nVar2 = b6nVar;
                        fid fidVar2 = (fid) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i8) {
                            case 0:
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    cyu0 cyu0Var = b6nVar2.d;
                                    cyu0 cyu0Var2 = !evu0.J(cyu0Var.a) ? cyu0Var : null;
                                    cyu0 cyu0Var3 = b6nVar2.e;
                                    aib1.c(null, cyu0Var2, (cyu0Var3 == null || evu0.J(cyu0Var3.a)) ? null : cyu0Var3, null, btsVar3, 0, 9);
                                    break;
                                }
                                break;
                            default:
                                bts btsVar4 = (bts) fidVar2;
                                if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    cyu0 cyu0Var4 = b6nVar2.g;
                                    cyu0 cyu0Var5 = (cyu0Var4 == null || evu0.J(cyu0Var4.a)) ? null : cyu0Var4;
                                    cyu0 cyu0Var6 = b6nVar2.h;
                                    aib1.c(null, cyu0Var5, (cyu0Var6 == null || evu0.J(cyu0Var6.a)) ? null : cyu0Var6, x4c.I, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 1);
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }, btsVar2);
                if (b6nVar.g == null && b6nVar.h == null) {
                    btsVar2.e0(-876251297);
                    btsVar2.t(false);
                    S = null;
                } else {
                    btsVar2.e0(-876559871);
                    S = wwg.S(584348327, true, new wls() { // from class: z5n
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i6;
                            zy11 zy11Var = zy11.a;
                            b6n b6nVar2 = b6nVar;
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i8) {
                                case 0:
                                    bts btsVar3 = (bts) fidVar2;
                                    if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        cyu0 cyu0Var = b6nVar2.d;
                                        cyu0 cyu0Var2 = !evu0.J(cyu0Var.a) ? cyu0Var : null;
                                        cyu0 cyu0Var3 = b6nVar2.e;
                                        aib1.c(null, cyu0Var2, (cyu0Var3 == null || evu0.J(cyu0Var3.a)) ? null : cyu0Var3, null, btsVar3, 0, 9);
                                        break;
                                    }
                                    break;
                                default:
                                    bts btsVar4 = (bts) fidVar2;
                                    if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        cyu0 cyu0Var4 = b6nVar2.g;
                                        cyu0 cyu0Var5 = (cyu0Var4 == null || evu0.J(cyu0Var4.a)) ? null : cyu0Var4;
                                        cyu0 cyu0Var6 = b6nVar2.h;
                                        aib1.c(null, cyu0Var5, (cyu0Var6 == null || evu0.J(cyu0Var6.a)) ? null : cyu0Var6, x4c.I, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 1);
                                        break;
                                    }
                                    break;
                            }
                            return zy11Var;
                        }
                    }, btsVar2);
                    btsVar2.t(false);
                }
                if (gv90Var instanceof pu90) {
                    btsVar2.e0(-876121283);
                    aVar2 = wwg.S(1310530054, true, new gxm(i6, e, tlsVar, b6nVar), btsVar2);
                    btsVar2.t(false);
                } else if (gv90Var instanceof mu90) {
                    btsVar2.e0(-875521526);
                    aVar2 = wwg.S(-1419303121, true, new a6n(i7, b6nVar, tlsVar), btsVar2);
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(-875298730);
                    btsVar2.t(false);
                    aVar2 = null;
                }
                if (gv90Var2 != null) {
                    x6d.a.getClass();
                    aVar3 = x6d.b;
                }
                btsVar = btsVar2;
                web1.c(f, 0.0f, false, 0.0f, null, aVar, S3, S, null, aVar2, aVar3, (gv90Var == null || gv90Var2 == null) ? gv90Var2 != null ? oa01.a : oa01.c : oa01.b, false, btsVar, 1573248, 0, 4378);
                f530Var3 = f530Var5;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new x5n(b6nVar, f530Var3, tlsVar, i, i2, 0);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i & 384) == 0) {
        }
        final int i62 = 1;
        final int i72 = 0;
        if (btsVar2.V(i3 & 1, (i3 & 147) == 146)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(String str, boolean z, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        wls wlsVar;
        wp2 wp2Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(173550570);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16) | (btsVar2.k(f530Var) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            f530 m = ljs0.m(f530Var, 96.0f);
            uo5 uo5Var = x4c.y;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar2 = d.f;
            qje.W(btsVar2, wlsVar2, d);
            wls wlsVar3 = d.e;
            qje.W(btsVar2, wlsVar3, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar4 = d.g;
            qje.W(btsVar2, wlsVar4, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar5 = d.d;
            qje.W(btsVar2, wlsVar5, d2);
            com.yandex.go.navigator.compose.speed_group.a.a(ljs0.c, z, btsVar2, ((i2 >> 3) & 14) | 48);
            if (z) {
                wlsVar = wlsVar3;
                wp2Var = new up2(bq2.a);
            } else {
                wlsVar = wlsVar3;
                wp2Var = AppColor$Palette.BgFloating;
            }
            wp2 up2Var = z ? new up2(zp2.a) : AppColor$Palette.Text;
            long K = uh6.K(str.length() > 2 ? 24.0f : 28.0f, 4294967296L);
            f530 c = bzk0.c(hbb1.c(ljs0.m(c530.a, 64.0f), dbb1.b(btsVar2), true, 50.0f, null, 8), wp2Var, cyk0.a);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new x8t0(6);
                btsVar2.o0(Q);
            }
            f530 g = bb1.g(c, (tls) Q);
            z910 d3 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d4 = b.d(btsVar2, g);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar2, d3);
            qje.W(btsVar2, wlsVar, o2);
            vfc.v(hashCode2, btsVar2, wlsVar4, btsVar2, tlsVar);
            qje.W(btsVar2, wlsVar5, d4);
            jeb1.f(str, null, up2Var, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, ety0.a(xya1.e(btsVar2).e.d, 0L, K, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar2, i2 & 14, 0, 16250);
            btsVar = btsVar2;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(str, z, f530Var, i, 27);
        }
    }

    public static final void d(mu90 mu90Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        String str;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-696263119);
        int i2 = (btsVar2.e(mu90Var) ? 4 : 2) | i | (btsVar2.e(tlsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            nr nrVar = mu90Var.a;
            if (nrVar instanceof nn) {
                str = ((nn) nrVar).a;
            } else if (nrVar instanceof pn) {
                str = ((pn) nrVar).a;
            } else if (nrVar instanceof sn) {
                str = ((sn) nrVar).a;
            } else if (!(nrVar instanceof rn) || (str = ((rn) nrVar).a) == null) {
                str = "";
            }
            f530 e = ljs0.e(c530.a, 32.0f);
            byk0 byk0Var = cyk0.a;
            long g = ((el51) btsVar2.m(gl51.a)).g();
            boolean z = mu90Var.b;
            boolean k = btsVar2.k(str);
            Object Q = btsVar2.Q();
            int i3 = 24;
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new wwb(str, i3);
                btsVar2.o0(Q);
            }
            l27 l27Var = new l27((tls) Q);
            boolean e2 = ((i2 & 112) == 32) | btsVar2.e(mu90Var);
            Object Q2 = btsVar2.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new ymj(17, tlsVar, mu90Var);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            a.b((sls) Q2, e, byk0Var, g, 0L, null, null, null, z, null, null, l27Var, wwg.S(1154904176, true, new le(str, i3), btsVar2), btsVar, 0, 384, 1776);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(mu90Var, tlsVar, i, 29);
        }
    }

    public static final void e(androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(193128185);
        int i2 = 0;
        if ((i & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            if (((Boolean) btsVar.m(n.a)).booleanValue()) {
                btsVar.e0(912595566);
                z = cma1.f0(btsVar);
            } else {
                btsVar.e0(912596449);
                z = btsVar.m(dr51.b) == ThemeType.DARK;
            }
            btsVar.t(false);
            cr51 cr51Var = z ? dr51.d : dr51.c;
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new dp51(10);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            i3y a = kotlin.a.a((sls) Q);
            int i3 = z ? l1i0.Theme_YB_Widgets_Common_Dark : l1i0.Theme_YB_Widgets_Common_Light;
            a7u0 a7u0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) btsVar.m(a7u0Var);
            btsVar.e0(-1633490746);
            boolean k = btsVar.k(context) | btsVar.c(i3);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new ContextThemeWrapper(context, i3);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            sb2.c(new vvf0[]{s1z.a.a(Boolean.TRUE), lrv.a.a(new jkf(cr51Var.b.d, new rrk0(1.0f, 1.0f, 1.0f, 0.4f))), dr51.a.a(cr51Var), by51.a.a((ay51) a.getValue()), a7u0Var.a((ContextThemeWrapper) Q2)}, wwg.S(-546358343, true, new jg41(12, aVar), btsVar), btsVar, 56);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ux51(i, i2, aVar);
        }
    }

    public static void f(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void g(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    public static void h(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
