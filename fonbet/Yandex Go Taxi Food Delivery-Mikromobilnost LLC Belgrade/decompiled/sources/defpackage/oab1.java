package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.ghe;
import defpackage.ljs0;
import defpackage.o430;
import defpackage.oab1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rzx;
import defpackage.sls;
import defpackage.tls;
import defpackage.u50;
import defpackage.v8r0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;

/* loaded from: classes11.dex */
public abstract class oab1 {
    public static final void a(wg6 wg6Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(662680862);
        int i2 = (btsVar.k(wg6Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 c = ljs0.c(c530.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new of6(wg6Var, 1);
                btsVar.o0(Q);
            }
            yyf0.a(d.a(c, (tls) Q), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tn1(wg6Var, i, 25);
        }
    }

    public static final void b(s8r0 s8r0Var, f530 f530Var, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(248360563);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(s8r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            s8r0Var.getClass();
            boolean z = s8r0Var.e;
            Object obj = tp2.a;
            Object obj2 = z ? AppColor$Palette.Error : obj;
            if (z) {
                obj = AppColor$Palette.TextMinor;
            }
            ydb1.a(q791.d(tra1.b(ljs0.g(f530Var, 56.0f, 0.0f, 2), z ? 1.0f : 0.5f), s8r0Var.e, null, new awk0(0), slsVar, 10), wwg.S(997301513, true, new y740(26, s8r0Var, obj2), btsVar), wwg.S(-807629244, true, new ls40(19, s8r0Var, obj2, obj), btsVar), null, null, null, null, false, btsVar, 432, 248);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0((Object) s8r0Var, f530Var, (Object) slsVar, i, 10);
        }
    }

    public static final void c(u8r0 u8r0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1799904348);
        int i3 = 4;
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(u8r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i5 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            String e = ohb1.e(btsVar, u8r0Var.d ? kyh0.settings_theme_on : kyh0.settings_theme_off);
            f530 w = r5a1.w(ljs0.g(f530Var, 56.0f, 0.0f, 2), u8r0Var.d, false, new awk0(2), tlsVar, 10);
            boolean k = btsVar.k(e);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new g8r0(e, i5);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.b(w, false, (tls) Q), wwg.S(1842007738, true, new f8r0(u8r0Var, i4), btsVar), wwg.S(-1565412811, true, new f8r0(u8r0Var, 3), btsVar), null, wwg.S(670988399, true, new f8r0(u8r0Var, i3), btsVar), null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e8r0(u8r0Var, f530Var, tlsVar, i, 2);
        }
    }

    public static final void d(u8r0 u8r0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1812916285);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(u8r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean c = btsVar.c(u8r0Var.a.ordinal());
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (c || Q == obj) {
                Q = n.f(u8r0Var.d, btsVar);
            }
            oz40 oz40Var = (oz40) Q;
            boolean k = ((i2 & 896) == 256) | btsVar.k(oz40Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj) {
                Q2 = new d0(tlsVar, oz40Var, 13);
                btsVar.o0(Q2);
            }
            tls tlsVar2 = (tls) Q2;
            String e = ohb1.e(btsVar, ((Boolean) oz40Var.getValue()).booleanValue() ? kyh0.settings_theme_on : kyh0.settings_theme_off);
            f530 w = r5a1.w(ljs0.g(f530Var, 56.0f, 0.0f, 2), ((Boolean) oz40Var.getValue()).booleanValue(), false, new awk0(2), tlsVar2, 10);
            boolean k2 = btsVar.k(e);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == obj) {
                Q3 = new dcc0(e, 29);
                btsVar.o0(Q3);
            }
            ydb1.a(fnq0.b(w, false, (tls) Q3), wwg.S(-158804243, true, new f8r0(u8r0Var, i3), btsVar), wwg.S(955937426, true, new f8r0(u8r0Var, i4), btsVar), null, wwg.S(-2105200616, true, new jhk0(i4, oz40Var), btsVar), null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e8r0(u8r0Var, f530Var, tlsVar, i, 1);
        }
    }

    public static final void e(final t8r0 t8r0Var, f530 f530Var, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(950211251);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(t8r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ydb1.a(q791.d(ljs0.g(f530Var, 56.0f, 0.0f, 2), false, null, new awk0(0), slsVar, 11), wwg.S(-1852699831, true, new zls() { // from class: h8r0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    t8r0 t8r0Var2 = t8r0Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                udb1.c(ibp0Var, t8r0Var2.c, null, null, btsVar2, intValue & 14, 14);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, t8r0Var2.b, an91.m(c530.a, 0.0f, 8.0f, 1), null, null, 0, 0, t8r0Var2.d, null, null, 0, 0, null, btsVar3, (intValue2 & 14) | 384, 0, 8124);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-1270771324, true, new zls() { // from class: h8r0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    t8r0 t8r0Var2 = t8r0Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                udb1.c(ibp0Var, t8r0Var2.c, null, null, btsVar2, intValue & 14, 14);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, t8r0Var2.b, an91.m(c530.a, 0.0f, 8.0f, 1), null, null, 0, 0, t8r0Var2.d, null, null, 0, 0, null, btsVar3, (intValue2 & 14) | 384, 0, 8124);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, na01.a, null, null, false, btsVar, 432, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0((Object) t8r0Var, f530Var, (Object) slsVar, i, 11);
        }
    }

    public static final void f(List list, final tls tlsVar, fid fidVar, int i) {
        aii0 v;
        l71 l71Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1418465732);
        int i2 = (btsVar.k(list) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (list.isEmpty()) {
                v = btsVar.v();
                if (v != null) {
                    l71Var = new l71(list, tlsVar, i, 1);
                    v.d = l71Var;
                }
                return;
            }
            c530 c530Var = c530.a;
            f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
            ifs ifsVar = new ifs(list);
            ddd.a.getClass();
            mua1.a(m, ifsVar, ddd.b, wwg.S(489644284, true, new bms() { // from class: com.yandex.go.settings.presentation.b
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Object settingsVisibilityTrackingKt$trackVisibilityIn$1$1;
                    Integer num;
                    rzx rzxVar;
                    o430 o430Var;
                    float f;
                    oz40 oz40Var;
                    v8r0 v8r0Var = (v8r0) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(v8r0Var) ? 32 : 16;
                    }
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 145) != 144)) {
                        c530 c530Var2 = c530.a;
                        f530 c = ljs0.c(c530Var2, 1.0f);
                        tls tlsVar2 = (tls) btsVar2.m(c.d);
                        oz40 n = f.n(v8r0Var, btsVar2);
                        rzx rzxVar2 = (rzx) btsVar2.m(c.a);
                        int intValue2 = ((Number) btsVar2.m(c.b)).intValue();
                        ghe gheVar = (ghe) btsVar2.m(c.c);
                        Object Q = btsVar2.Q();
                        o430 o430Var2 = did.a;
                        if (Q == o430Var2) {
                            Q = f.j(null);
                            btsVar2.o0(Q);
                        }
                        oz40 oz40Var2 = (oz40) Q;
                        oz40 n2 = f.n(tlsVar2, btsVar2);
                        rzx rzxVar3 = (rzx) oz40Var2.getValue();
                        Integer valueOf = Integer.valueOf(intValue2);
                        boolean e = btsVar2.e(rzxVar2) | btsVar2.k(gheVar) | btsVar2.b(0.5f) | btsVar2.k(n2) | btsVar2.k(n);
                        Object Q2 = btsVar2.Q();
                        if (e || Q2 == o430Var2) {
                            num = valueOf;
                            rzxVar = rzxVar3;
                            o430Var = o430Var2;
                            settingsVisibilityTrackingKt$trackVisibilityIn$1$1 = new SettingsVisibilityTrackingKt$trackVisibilityIn$1$1(oz40Var2, rzxVar2, gheVar, 0.5f, n2, n, null);
                            f = 0.5f;
                            oz40Var = n2;
                            n = n;
                            btsVar2.o0(settingsVisibilityTrackingKt$trackVisibilityIn$1$1);
                        } else {
                            o430Var = o430Var2;
                            oz40Var = n2;
                            num = valueOf;
                            settingsVisibilityTrackingKt$trackVisibilityIn$1$1 = Q2;
                            rzxVar = rzxVar3;
                            f = 0.5f;
                        }
                        zpn.g(rzxVar, rzxVar2, num, (wls) settingsVisibilityTrackingKt$trackVisibilityIn$1$1, btsVar2);
                        boolean e2 = btsVar2.e(rzxVar2) | btsVar2.k(gheVar) | btsVar2.b(f) | btsVar2.k(oz40Var) | btsVar2.k(n);
                        Object Q3 = btsVar2.Q();
                        if (e2 || Q3 == o430Var) {
                            u50 u50Var = new u50(oz40Var2, rzxVar2, gheVar, oz40Var, n);
                            btsVar2.o0(u50Var);
                            Q3 = u50Var;
                        }
                        f530 y = eja1.y(c, (tls) Q3);
                        z910 d = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar2, y);
                        ohd.G1.getClass();
                        sls slsVar = androidx.compose.ui.node.d.b;
                        if (btsVar2.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
                        qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                        qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, androidx.compose.ui.node.d.h);
                        qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
                        oab1.g(v8r0Var, tls.this, ljs0.c(c530Var2, 1.0f), btsVar2, ((intValue >> 3) & 14) | 384);
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 3462, 0);
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
        }
        v = btsVar.v();
        if (v != null) {
            l71Var = new l71(list, tlsVar, i, 2);
            v.d = l71Var;
        }
    }

    public static final void g(final v8r0 v8r0Var, final tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1128764480);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(v8r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        final int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = v8r0Var instanceof t8r0;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(1884066516);
                t8r0 t8r0Var = (t8r0) v8r0Var;
                int i4 = i2 & 14;
                int i5 = ((i2 & 112) == 32 ? 1 : 0) | (i4 != 4 ? 0 : 1);
                Object Q = btsVar.Q();
                if (i5 != 0 || Q == o430Var) {
                    Q = new sls() { // from class: d8r0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i6 = i3;
                            zy11 zy11Var = zy11.a;
                            v8r0 v8r0Var2 = v8r0Var;
                            tls tlsVar2 = tlsVar;
                            switch (i6) {
                                case 0:
                                    tlsVar2.invoke(new fx2(v8r0Var2));
                                    break;
                                default:
                                    tlsVar2.invoke(new fx2(v8r0Var2));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q);
                }
                e(t8r0Var, f530Var, (sls) Q, btsVar, ((i2 >> 3) & 112) | i4);
                btsVar.t(false);
            } else if (v8r0Var instanceof u8r0) {
                btsVar.e0(1884070469);
                u8r0 u8r0Var = (u8r0) v8r0Var;
                int i6 = i2 & 14;
                int i7 = ((i2 & 112) == 32 ? 1 : 0) | (i6 != 4 ? 0 : 1);
                Object Q2 = btsVar.Q();
                if (i7 != 0 || Q2 == o430Var) {
                    Q2 = new a5p0(22, tlsVar, v8r0Var);
                    btsVar.o0(Q2);
                }
                h(u8r0Var, f530Var, (tls) Q2, btsVar, ((i2 >> 3) & 112) | i6);
                btsVar.t(false);
            } else {
                if (!(v8r0Var instanceof s8r0)) {
                    throw unr0.y(1884065074, btsVar, false);
                }
                btsVar.e0(1884074928);
                s8r0 s8r0Var = (s8r0) v8r0Var;
                int i8 = i2 & 14;
                boolean z2 = (i8 == 4) | ((i2 & 112) == 32);
                Object Q3 = btsVar.Q();
                if (z2 || Q3 == o430Var) {
                    Q3 = new sls() { // from class: d8r0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i62 = r3;
                            zy11 zy11Var = zy11.a;
                            v8r0 v8r0Var2 = v8r0Var;
                            tls tlsVar2 = tlsVar;
                            switch (i62) {
                                case 0:
                                    tlsVar2.invoke(new fx2(v8r0Var2));
                                    break;
                                default:
                                    tlsVar2.invoke(new fx2(v8r0Var2));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q3);
                }
                b(s8r0Var, f530Var, (sls) Q3, btsVar, ((i2 >> 3) & 112) | i8);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(v8r0Var, tlsVar, f530Var, i, 9);
        }
    }

    public static final void h(u8r0 u8r0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(166695314);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(u8r0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (u8r0Var.f) {
            btsVar.e0(1038045041);
            c(u8r0Var, f530Var, tlsVar, btsVar, i2 & 1022);
            btsVar.t(false);
        } else {
            btsVar.e0(1038113334);
            d(u8r0Var, f530Var, tlsVar, btsVar, i2 & 1022);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e8r0(u8r0Var, f530Var, tlsVar, i, 0);
        }
    }

    public static final a i(r5x r5xVar) {
        kotlinx.serialization.json.d b;
        ArrayList<o5x> arrayList = r5xVar.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (o5x o5xVar : arrayList) {
            if (o5xVar instanceof q5x) {
                b = qcx.c(((q5x) o5xVar).a);
            } else {
                if (!(o5xVar instanceof p5x)) {
                    w511.b();
                    return null;
                }
                b = qcx.b(Integer.valueOf(((p5x) o5xVar).a));
            }
            arrayList2.add(b);
        }
        return new a(arrayList2);
    }

    public static final r5x j(a aVar) {
        o5x p5xVar;
        ArrayList arrayList = new ArrayList(tcc.n(aVar, 10));
        for (b bVar : aVar.a) {
            if (!(bVar instanceof kotlinx.serialization.json.d)) {
                kbs.e(qoi0.a(r5x.class).d(), " fragments should be primitives, but actual value is ", bVar);
                return null;
            }
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVar;
            if (dVar.b()) {
                p5xVar = new q5x(dVar.a());
            } else {
                Integer k = qcx.k(dVar);
                if (k == null) {
                    kbs.e(qoi0.a(r5x.class).d(), " fragment should be string or int, but actual value is ", bVar);
                    return null;
                }
                p5xVar = new p5x(k.intValue());
            }
            arrayList.add(p5xVar);
        }
        return new r5x(arrayList);
    }
}
