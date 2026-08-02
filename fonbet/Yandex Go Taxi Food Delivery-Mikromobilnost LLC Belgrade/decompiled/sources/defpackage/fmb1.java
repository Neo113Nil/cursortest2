package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.exb;
import defpackage.m6y;
import defpackage.rc0;
import defpackage.u6y;
import defpackage.zwb;
import defpackage.zx8;
import defpackage.zy11;
import java.util.List;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class fmb1 {
    public static mgv a;

    public static final void a(dxb dxbVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-806426443);
        int i2 = (btsVar.k(dxbVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object obj = dxbVar.b;
            String str = dxbVar.d;
            Object obj2 = dxbVar.c;
            boolean k = btsVar.k(obj) | btsVar.k(obj2);
            Object Q = btsVar.Q();
            Object obj3 = did.a;
            if (k || Q == obj3) {
                CharSequence charSequence = dxbVar.b;
                if (charSequence == null) {
                    charSequence = "";
                }
                Q = ((Object) charSequence) + " " + (obj2 != null ? obj2 : "");
                btsVar.o0(Q);
            }
            String str2 = (String) Q;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (z || Q2 == obj3) {
                Q2 = new n8a(21, tlsVar, dxbVar);
                btsVar.o0(Q2);
            }
            f530 c2 = bzk0.c(q791.d(c, false, null, null, (sls) Q2, 15), AppColor$Palette.BgMinor, cyk0.c(16.0f));
            boolean k2 = btsVar.k(str2);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == obj3) {
                Q3 = new wwb(str2, i3);
                btsVar.o0(Q3);
            }
            f530 a2 = fnq0.a(c2, (tls) Q3);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (str != null) {
                btsVar.e0(-2128809450);
                g(str, btsVar, 0);
                btsVar.t(false);
            } else {
                btsVar.e0(-2128754456);
                d(ymb1.l(ljs0.b(ljs0.c(c530Var, 1.0f), 0.0f, 140.0f, 1), cyk0.c(16.0f)), btsVar, 0);
                btsVar.t(false);
            }
            boolean k3 = btsVar.k(obj2);
            Object Q4 = btsVar.Q();
            if (k3 || Q4 == obj3) {
                Q4 = ly3.h(obj2 != null ? 4.0f : 12.0f, btsVar);
            }
            e(dxbVar.b, an91.n(ljs0.c(c530Var, 1.0f), 12.0f, 12.0f, 12.0f, ((y7m) Q4).a), xya1.e(btsVar).g.a, null, null, 0, 0, btsVar, 0, 120);
            e(dxbVar.c, an91.o(c530Var, 12.0f, 0.0f, 12.0f, 12.0f, 2), xya1.e(btsVar).h.a, AppColor$Palette.TextMinor, null, 0, 0, btsVar, 3120, 112);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(dxbVar, tlsVar, i, 17);
        }
    }

    public static final void b(hxb hxbVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1552994962);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(hxbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(-1344490316, true, new u5(3, hxbVar, tlsVar), btsVar), btsVar, 27648, 7);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(hxbVar, tlsVar, i, 26);
        }
    }

    public static final void c(f530 f530Var, final exb exbVar, final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(202344014);
        int i2 = i | (btsVar.k(exbVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.foundation.lazy.b a2 = a7y.a(0, 3, btsVar);
            i43 i43Var = new i43(8.0f, true, new quz(11));
            WeakHashMap weakHashMap = a.w;
            j2w f = w8a1.f(vuz.o(btsVar).e, btsVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new tls() { // from class: com.yandex.go.copter.city_tour.ui.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        List list = exb.this.c;
                        CityTourSelectorModalKt$Content$1$1$1 cityTourSelectorModalKt$Content$1$1$1 = CityTourSelectorModalKt$Content$1$1$1.b;
                        m6y m6yVar = (m6y) ((u6y) obj);
                        m6yVar.f(list.size(), new b(list), new rc0(list, 2, zwb.a), new androidx.compose.runtime.internal.a(802480018, new zx8(list, tlsVar, 2), true));
                        return zy11.a;
                    }
                };
                btsVar.o0(Q);
            }
            adb1.a(f530Var, a2, f, i43Var, null, null, false, null, (tls) Q, btsVar, 24582, 488);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(f530Var, exbVar, tlsVar, i, 10);
        }
    }

    public static final void d(f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-801535345);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 b = m4m0.b(f530Var, ldc.b(tje.n(tp2.a, btsVar), 0.08f, 0.0f, 0.0f, 0.0f, 14), cyk0.c(16.0f));
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            o4b1.b(wya1.a(f1h0.ic_picture_fill, 0, btsVar), null, cj6.a.a(ljs0.n(c530.a, 32.0f, 32.0f), x4c.y), null, null, 0.0f, null, btsVar, 56, 120);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(f530Var, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(CharSequence charSequence, f530 f530Var, ety0 ety0Var, wp2 wp2Var, sjy0 sjy0Var, int i, int i2, fid fidVar, int i3, int i4) {
        int i5;
        f530 f530Var2;
        int i6;
        wp2 wp2Var2;
        int i7;
        sjy0 sjy0Var2;
        int i8;
        int i9;
        int i10;
        bts btsVar;
        int i11;
        f530 f530Var3;
        wp2 wp2Var3;
        sjy0 sjy0Var3;
        int i12;
        aii0 v;
        int i13;
        int i14;
        wp2 wp2Var4;
        sjy0 sjy0Var4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(23469465);
        if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            f530Var2 = f530Var;
            i5 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i5 |= btsVar2.k(ety0Var) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                wp2Var2 = wp2Var;
                i5 |= btsVar2.k(wp2Var2) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    sjy0Var2 = sjy0Var;
                    i5 |= btsVar2.k(sjy0Var2) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ImageMetadata.EDGE_MODE;
                    } else if ((196608 & i3) == 0) {
                        i9 = i;
                        i5 |= btsVar2.c(i9) ? 131072 : 65536;
                        i10 = i5 | 1572864;
                        if (btsVar2.V(i10 & 1, (599187 & i10) != 599186)) {
                            btsVar2.a0();
                            if ((i3 & 1) == 0 || btsVar2.C()) {
                                if (i15 != 0) {
                                    f530Var2 = c530.a;
                                }
                                if (i6 != 0) {
                                    wp2Var2 = tp2.a;
                                }
                                if (i7 != 0) {
                                    sjy0Var2 = null;
                                }
                                if (i8 != 0) {
                                    i9 = 1;
                                }
                                i13 = i9;
                                i14 = 2;
                            } else {
                                btsVar2.Y();
                                i13 = i9;
                                i14 = i2;
                            }
                            btsVar2.u();
                            if (charSequence == null) {
                                btsVar2.e0(-900558556);
                                btsVar2.t(false);
                                btsVar = btsVar2;
                                f530Var3 = f530Var2;
                                wp2Var4 = wp2Var2;
                                sjy0Var4 = sjy0Var2;
                            } else {
                                btsVar2.e0(-900558555);
                                int i16 = (i10 & 14) | ((i10 << 3) & 896) | (i10 & 7168) | ((i10 << 9) & 29360128) | ((i10 << 12) & 1879048192);
                                int i17 = ((i10 >> 18) & 14) | (i10 & 896);
                                f530Var3 = f530Var2;
                                wp2Var4 = wp2Var2;
                                sjy0Var4 = sjy0Var2;
                                qgy.b(charSequence, null, f530Var3, wp2Var4, 0L, 0L, sjy0Var4, 0L, i13, i14, 0, ety0Var, null, btsVar2, i16, i17, 10610);
                                btsVar = btsVar2;
                                btsVar.t(false);
                            }
                            wp2Var3 = wp2Var4;
                            sjy0Var3 = sjy0Var4;
                            i12 = i13;
                            i11 = i14;
                        } else {
                            btsVar = btsVar2;
                            btsVar.Y();
                            i11 = i2;
                            f530Var3 = f530Var2;
                            wp2Var3 = wp2Var2;
                            sjy0Var3 = sjy0Var2;
                            i12 = i9;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new xwb(charSequence, f530Var3, ety0Var, wp2Var3, sjy0Var3, i12, i11, i3, i4);
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i5 | 1572864;
                    if (btsVar2.V(i10 & 1, (599187 & i10) != 599186)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                sjy0Var2 = sjy0Var;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i5 | 1572864;
                if (btsVar2.V(i10 & 1, (599187 & i10) != 599186)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            wp2Var2 = wp2Var;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            sjy0Var2 = sjy0Var;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i5 | 1572864;
            if (btsVar2.V(i10 & 1, (599187 & i10) != 599186)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        if ((i3 & 384) == 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        wp2Var2 = wp2Var;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        sjy0Var2 = sjy0Var;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i5 | 1572864;
        if (btsVar2.V(i10 & 1, (599187 & i10) != 599186)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void f(String str, f530 f530Var, ety0 ety0Var, wp2 wp2Var, sjy0 sjy0Var, int i, int i2, fid fidVar, int i3) {
        bts btsVar;
        wp2 wp2Var2;
        int i4;
        int i5;
        wp2 wp2Var3;
        int i6;
        int i7;
        wp2 wp2Var4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1582550067);
        int i8 = i3 | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(ety0Var) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL | (btsVar2.k(sjy0Var) ? 16384 : 8192) | 1769472;
        if (btsVar2.V(i8 & 1, (599187 & i8) != 599186)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                wp2Var3 = tp2.a;
                i6 = 2;
                i7 = 1;
            } else {
                btsVar2.Y();
                wp2Var3 = wp2Var;
                i7 = i;
                i6 = i2;
            }
            btsVar2.u();
            if (str == null) {
                btsVar2.e0(-106689270);
                btsVar2.t(false);
                btsVar = btsVar2;
                wp2Var4 = wp2Var3;
            } else {
                btsVar2.e0(-106689269);
                int i9 = (i8 & HProv.PP_DELETE_SAVED_PASSWD) | 384 | ((i8 << 9) & 29360128) | 805306368;
                int i10 = 48 | ((i8 << 6) & HProv.ALG_CLASS_ALL);
                wp2Var4 = wp2Var3;
                jeb1.f(str, f530Var, wp2Var4, 0L, 0L, null, sjy0Var, 0L, i7, false, i6, 0, null, ety0Var, btsVar2, i9, i10, 13688);
                btsVar = btsVar2;
                btsVar.t(false);
            }
            wp2Var2 = wp2Var4;
            i4 = i7;
            i5 = i6;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            wp2Var2 = wp2Var;
            i4 = i;
            i5 = i2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg0(str, f530Var, ety0Var, wp2Var2, sjy0Var, i4, i5, i3);
        }
    }

    public static final void g(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1225995216);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 l = ymb1.l(ljs0.c(ljs0.e(c530.a, 140.0f), 1.0f), cyk0.c(16.0f));
            pvi0 b = mja1.b(str, null, 6);
            u5d.a.getClass();
            v0b1.a(b, l, null, u5d.d, u5d.e, null, null, mhe.a, 0.0f, 0, btsVar, 12610560, 868);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 9);
        }
    }

    public static final void h(f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1413315232);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            androidx.compose.foundation.lazy.b a2 = a7y.a(0, 3, btsVar);
            i43 i43Var = new i43(8.0f, true, new quz(11));
            WeakHashMap weakHashMap = a.w;
            j2w f = w8a1.f(vuz.o(btsVar).e, btsVar);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new teb(23);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            f530Var2 = f530Var;
            adb1.a(f530Var2, a2, f, i43Var, null, null, false, null, tlsVar, btsVar, 805330950, 488);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var2, i, 14);
        }
    }

    public static final void i(f530 f530Var, fxb fxbVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-741838269);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(fxbVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ocb1.a(f530Var, false, null, false, false, wwg.S(145792724, true, new ywb(fxbVar, i3), btsVar), 0.0f, 0, wwg.S(-322346528, true, new i9a(18, fxbVar, tlsVar), btsVar), btsVar, (i2 & 14) | 805502976, 478);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(f530Var, fxbVar, tlsVar, i, 11);
        }
    }

    public static final void j(CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1068294025);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.k(charSequence2) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 14;
            boolean z = (i4 == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new vwb(charSequence, charSequence2, 0);
                btsVar.o0(Q);
            }
            f530 a2 = fnq0.a(c530.a, (tls) Q);
            sic a3 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            e(charSequence, null, xya1.e(btsVar).g.b, null, new sjy0(3), 2, 0, btsVar, i4 | ImageMetadata.EDGE_MODE, 74);
            charSequence4 = charSequence2;
            charSequence3 = charSequence;
            e(charSequence4, null, xya1.e(btsVar).h.a, null, new sjy0(3), 2, 0, btsVar, ((i2 >> 3) & 14) | ImageMetadata.EDGE_MODE, 74);
            btsVar.t(true);
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zga(i, i3, charSequence3, charSequence4);
        }
    }

    public static final mgv k() {
        mgv mgvVar = a;
        if (mgvVar != null) {
            return mgvVar;
        }
        lgv lgvVar = new lgv("MinusOutlineSm", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
        uq90 uq90Var = new uq90();
        uq90Var.j(15.0f, 8.75f);
        uq90Var.f(1.0f);
        uq90Var.o(7.25f);
        uq90Var.f(15.0f);
        uq90Var.o(8.75f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
        mgv d = lgvVar.d();
        a = d;
        return d;
    }

    public static final kk2 l(hoy0 hoy0Var) {
        kk2 kk2Var = hoy0Var.a;
        long j = hoy0Var.b;
        kk2Var.getClass();
        return kk2Var.subSequence(asy0.f(j), asy0.e(j));
    }

    public static final kk2 m(hoy0 hoy0Var, int i) {
        kk2 kk2Var = hoy0Var.a;
        kk2 kk2Var2 = hoy0Var.a;
        long j = hoy0Var.b;
        int e = asy0.e(j);
        int e2 = asy0.e(j);
        int i2 = e2 + i;
        if (((i ^ i2) & (e2 ^ i2)) < 0) {
            i2 = kk2Var2.b.length();
        }
        return kk2Var.subSequence(e, Math.min(i2, kk2Var2.b.length()));
    }

    public static final kk2 n(hoy0 hoy0Var, int i) {
        kk2 kk2Var = hoy0Var.a;
        long j = hoy0Var.b;
        int f = asy0.f(j);
        int i2 = f - i;
        if (((f ^ i2) & (i ^ f)) < 0) {
            i2 = 0;
        }
        return kk2Var.subSequence(Math.max(0, i2), asy0.f(j));
    }
}
