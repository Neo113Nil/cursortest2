package defpackage;

import android.content.res.Configuration;
import android.graphics.Color;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.an91;
import defpackage.bts;
import defpackage.c0m;
import defpackage.c31;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dv9;
import defpackage.e31;
import defpackage.eja1;
import defpackage.f31;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g43;
import defpackage.jeb1;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.mjf;
import defpackage.o430;
import defpackage.ocb1;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.t8j;
import defpackage.tls;
import defpackage.tx40;
import defpackage.vfc;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.ymb1;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$IntRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;

/* loaded from: classes12.dex */
public abstract class pnm {
    public static final void a(final c31 c31Var, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(596392341);
        int i2 = (btsVar2.e(c31Var) ? 4 : 2) | i | (btsVar2.e(slsVar) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Pair d = d(c31Var.a);
            final kk2 kk2Var = (kk2) d.getFirst();
            final Map map = (Map) d.getSecond();
            FormattedText formattedText = c31Var.b;
            Pair d2 = formattedText != null ? d(formattedText) : new Pair(new kk2(""), b.f());
            final kk2 kk2Var2 = (kk2) d2.getFirst();
            final Map map2 = (Map) d2.getSecond();
            FormattedText formattedText2 = c31Var.c;
            Pair d3 = formattedText2 != null ? d(formattedText2) : new Pair(new kk2(""), b.f());
            final kk2 kk2Var3 = (kk2) d3.getFirst();
            final Map map3 = (Map) d3.getSecond();
            FormattedText formattedText3 = c31Var.d;
            Pair d4 = formattedText3 != null ? d(formattedText3) : new Pair(new kk2(""), b.f());
            final kk2 kk2Var4 = (kk2) d4.getFirst();
            final Map map4 = (Map) d4.getSecond();
            btsVar = btsVar2;
            ydb1.a(new cfq0(c31Var.f, null, null, true, true, new awk0(0), slsVar), wwg.S(2088448555, true, new zls() { // from class: lnm
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    c31 c31Var2 = c31Var;
                    switch (i5) {
                        case 0:
                            String str = c31Var2.e;
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else if (str == null) {
                                btsVar3.e0(74768122);
                                nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar3, false);
                                break;
                            } else {
                                btsVar3.e0(74692079);
                                tdb1.d(ibp0Var, mja1.a(str, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                btsVar3.t(false);
                                break;
                            }
                        default:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                wfa1.a(c31Var2.f, an91.o(c530.a, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, true, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 4);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), wwg.S(-1624590234, true, new zls() { // from class: mnm
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    mnm mnmVar;
                    boolean z;
                    ebp0 ebp0Var = (ebp0) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    boolean V = btsVar3.V(intValue & 1, (intValue & 19) != 18);
                    dmw0 dmw0Var = btsVar3.a;
                    if (V) {
                        kk2 kk2Var5 = kk2.this;
                        int length = kk2Var5.b.length();
                        kk2 kk2Var6 = kk2Var4;
                        kk2 kk2Var7 = kk2Var;
                        Map map5 = map;
                        kk2 kk2Var8 = kk2Var2;
                        Map map6 = map2;
                        if (length <= 0 && kk2Var6.b.length() <= 0) {
                            btsVar3.e0(1819917345);
                            p9b1.b(ebp0Var, kk2Var7, map5, null, null, null, 0, 0, kk2Var8, map6, null, null, 0, 0, btsVar3, intValue & 14, 0, 32380);
                            btsVar3.t(false);
                        } else {
                            btsVar3.e0(1818919579);
                            f530 c = ljs0.c(c530.a, 1.0f);
                            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar3, 0);
                            int hashCode = Long.hashCode(btsVar3.T);
                            r1b0 o = btsVar3.o();
                            f530 d5 = androidx.compose.ui.b.d(btsVar3, c);
                            ohd.G1.getClass();
                            sls slsVar2 = d.b;
                            if (dmw0Var == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar2);
                            } else {
                                btsVar3.r0();
                            }
                            wls wlsVar = d.f;
                            qje.W(btsVar3, wlsVar, a);
                            wls wlsVar2 = d.e;
                            qje.W(btsVar3, wlsVar2, o);
                            Integer valueOf = Integer.valueOf(hashCode);
                            wls wlsVar3 = d.g;
                            qje.W(btsVar3, wlsVar3, valueOf);
                            tls tlsVar = d.h;
                            qje.M(btsVar3, tlsVar);
                            wls wlsVar4 = d.d;
                            qje.W(btsVar3, wlsVar4, d5);
                            if (2.0f <= 0.0d) {
                                gxv.a("invalid weight; must be greater than zero");
                            }
                            x2y x2yVar = new x2y(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                            so5 so5Var = x4c.G;
                            g43 g43Var = lr20.c;
                            sic a2 = qic.a(g43Var, so5Var, btsVar3, 0);
                            int hashCode2 = Long.hashCode(btsVar3.T);
                            r1b0 o2 = btsVar3.o();
                            f530 d6 = androidx.compose.ui.b.d(btsVar3, x2yVar);
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar2);
                            } else {
                                btsVar3.r0();
                            }
                            qje.W(btsVar3, wlsVar, a2);
                            qje.W(btsVar3, wlsVar2, o2);
                            vfc.v(hashCode2, btsVar3, wlsVar3, btsVar3, tlsVar);
                            qje.W(btsVar3, wlsVar4, d6);
                            jeb1.d(kk2Var7, null, null, 0L, 0L, null, 0L, 0, false, 0, 0, map5, null, xya1.e(btsVar3).g.a, btsVar3, 0, 0, 24574);
                            bts btsVar4 = btsVar3;
                            if (kk2Var8.b.length() > 0) {
                                btsVar4.e0(879761780);
                                jeb1.d(kk2Var8, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, false, 0, 0, map6, null, xya1.e(btsVar4).h.a, btsVar4, 384, 0, 24570);
                                btsVar4 = btsVar4;
                                btsVar4.t(false);
                            } else {
                                btsVar4.e0(879916935);
                                btsVar4.t(false);
                            }
                            btsVar4.t(true);
                            if (1.0f <= 0.0d) {
                                gxv.a("invalid weight; must be greater than zero");
                            }
                            x2y x2yVar2 = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            sic a3 = qic.a(g43Var, x4c.I, btsVar4, 48);
                            int hashCode3 = Long.hashCode(btsVar4.T);
                            r1b0 o3 = btsVar4.o();
                            f530 d7 = androidx.compose.ui.b.d(btsVar4, x2yVar2);
                            btsVar4.i0();
                            if (btsVar4.S) {
                                btsVar4.n(slsVar2);
                            } else {
                                btsVar4.r0();
                            }
                            qje.W(btsVar4, wlsVar, a3);
                            qje.W(btsVar4, wlsVar2, o3);
                            vfc.v(hashCode3, btsVar4, wlsVar3, btsVar4, tlsVar);
                            qje.W(btsVar4, wlsVar4, d7);
                            if (kk2Var5.b.length() > 0) {
                                btsVar4.e0(880017532);
                                bts btsVar5 = btsVar4;
                                mnmVar = this;
                                jeb1.d(kk2Var5, null, null, 0L, 0L, null, 0L, 0, false, 0, 0, map3, null, xya1.e(btsVar4).g.a, btsVar5, 0, 0, 24574);
                                btsVar4 = btsVar5;
                                btsVar4.t(false);
                            } else {
                                mnmVar = this;
                                btsVar4.e0(880159760);
                                btsVar4.t(false);
                            }
                            if (kk2Var6.b.length() > 0) {
                                btsVar4.e0(880237229);
                                bts btsVar6 = btsVar4;
                                jeb1.d(kk2Var6, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, false, 0, 0, map4, null, xya1.e(btsVar4).h.a, btsVar6, 384, 0, 24570);
                                btsVar4 = btsVar6;
                                z = false;
                                btsVar4.t(false);
                            } else {
                                z = false;
                                btsVar4.e0(880407760);
                                btsVar4.t(false);
                            }
                            tse0.t(btsVar4, true, true, z);
                        }
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), null, wwg.S(-947403488, true, new zls() { // from class: lnm
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    c31 c31Var2 = c31Var;
                    switch (i5) {
                        case 0:
                            String str = c31Var2.e;
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else if (str == null) {
                                btsVar3.e0(74768122);
                                nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar3, false);
                                break;
                            } else {
                                btsVar3.e0(74692079);
                                tdb1.d(ibp0Var, mja1.a(str, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                btsVar3.t(false);
                                break;
                            }
                        default:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                wfa1.a(c31Var2.f, an91.o(c530.a, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, true, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 4);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), null, null, false, btsVar, 25008, 232);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(c31Var, slsVar, i, 23);
        }
    }

    public static final void b(d31 d31Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1217892674);
        int i2 = (btsVar.k(d31Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 l = an91.l(bzk0.c(an91.m(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 2), AppColor$Palette.BgMinor, cyk0.c(6.0f)), 8.0f, 4.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, l);
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
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new c0m(17);
                btsVar.o0(Q);
            }
            jeb1.f(d31Var.a, fnq0.b(c530Var, false, (tls) Q), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.c, btsVar, 384, 0, 16376);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new loj(d31Var, i, 4);
        }
    }

    public static final void c(final f31 f31Var, final tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1454310946);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(f31Var) : btsVar.e(f31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, tnb1.e(new up2(ldc.l), null, btsVar, 4), null, null, false, false, wwg.S(-2044067828, true, new nfj(i3, f31Var, tlsVar), btsVar), wwg.S(816450004, true, new zls() { // from class: com.yandex.go.address.address_map_picker.ui.b
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    boolean V = btsVar2.V(intValue & 1, (intValue & 17) != 16);
                    dmw0 dmw0Var = btsVar2.a;
                    if (V) {
                        float f = ((Configuration) btsVar2.m(AndroidCompositionLocals_androidKt.a)).screenHeightDp / 3.0f;
                        androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar2);
                        f31 f31Var2 = f31.this;
                        Iterator it = f31Var2.e.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i4 = -1;
                                break;
                            }
                            e31 e31Var = (e31) it.next();
                            if ((e31Var instanceof c31) && ((c31) e31Var).f) {
                                break;
                            }
                            i4++;
                        }
                        Integer valueOf = Integer.valueOf(i4);
                        boolean c = btsVar2.c(i4) | btsVar2.k(a);
                        Object Q = btsVar2.Q();
                        o430 o430Var = did.a;
                        if (c || Q == o430Var) {
                            Q = new DrumsModalViewKt$DrumsModalView$2$1$1(i4, a, null);
                            btsVar2.o0(Q);
                        }
                        zpn.e(btsVar2, (wls) Q, valueOf);
                        c530 c530Var = c530.a;
                        f530 m = ymb1.m(ljs0.c(c530Var, 1.0f));
                        tls tlsVar2 = tlsVar;
                        boolean k = btsVar2.k(tlsVar2);
                        Object Q2 = btsVar2.Q();
                        if (k || Q2 == o430Var) {
                            Q2 = new dv9(26, tlsVar2);
                            btsVar2.o0(Q2);
                        }
                        f530 y = eja1.y(m, (tls) Q2);
                        so5 so5Var = x4c.G;
                        g43 g43Var = lr20.c;
                        sic a2 = qic.a(g43Var, so5Var, btsVar2, 0);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d = androidx.compose.ui.b.d(btsVar2, y);
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
                        wls wlsVar = d.f;
                        qje.W(btsVar2, wlsVar, a2);
                        wls wlsVar2 = d.e;
                        qje.W(btsVar2, wlsVar2, o);
                        Integer valueOf2 = Integer.valueOf(hashCode);
                        wls wlsVar3 = d.g;
                        qje.W(btsVar2, wlsVar3, valueOf2);
                        tls tlsVar3 = d.h;
                        qje.M(btsVar2, tlsVar3);
                        wls wlsVar4 = d.d;
                        qje.W(btsVar2, wlsVar4, d);
                        f530 g = ljs0.g(ljs0.c(c530Var, 1.0f), 0.0f, f, 1);
                        sic a3 = qic.a(g43Var, so5Var, btsVar2, 0);
                        int hashCode2 = Long.hashCode(btsVar2.T);
                        r1b0 o2 = btsVar2.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar2, g);
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, wlsVar, a3);
                        qje.W(btsVar2, wlsVar2, o2);
                        vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar3);
                        qje.W(btsVar2, wlsVar4, d2);
                        f530 n = an91.n(c530Var, 16.0f, 20.0f, 16.0f, 12.0f);
                        Object Q3 = btsVar2.Q();
                        if (Q3 == o430Var) {
                            Q3 = new c0m(14);
                            btsVar2.o0(Q3);
                        }
                        jeb1.f(f31Var2.b, fnq0.b(n, false, (tls) Q3), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).e.d, btsVar2, 0, 0, 16380);
                        bts btsVar3 = btsVar2;
                        String str = f31Var2.c;
                        if (str == null) {
                            btsVar3.e0(-844649219);
                            z = false;
                            btsVar3.t(false);
                        } else {
                            btsVar3.e0(-844649218);
                            jeb1.f(str, an91.o(c530Var, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.a, btsVar3, 48, 0, 16380);
                            btsVar3 = btsVar3;
                            z = false;
                            btsVar3.t(false);
                        }
                        x2y x2yVar = new x2y(1.0f, z);
                        boolean e = btsVar3.e(f31Var2) | btsVar3.k(tlsVar2);
                        Object Q4 = btsVar3.Q();
                        if (e || Q4 == o430Var) {
                            Q4 = new t8j(11, f31Var2, tlsVar2);
                            btsVar3.o0(Q4);
                        }
                        bts btsVar4 = btsVar3;
                        adb1.a(x2yVar, a, null, null, null, null, false, null, (tls) Q4, btsVar4, 0, 508);
                        btsVar4.t(true);
                        Object Q5 = btsVar4.Q();
                        if (Q5 == o430Var) {
                            Q5 = f.f(0.5f);
                            btsVar4.o0(Q5);
                        }
                        ocb1.a(null, false, (tx40) Q5, false, false, null, 0.0f, 0, wwg.S(1296272187, true, new mjf(22, tlsVar2, f31Var2), btsVar4), btsVar4, 805334400, 483);
                        btsVar4.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(f31Var, tlsVar, i, 14);
        }
    }

    public static final Pair d(FormattedText formattedText) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        hk2 hk2Var = new hk2(0);
        e(hk2Var, ref$IntRef, linkedHashMap, formattedText.a);
        return new Pair(hk2Var.i(), linkedHashMap);
    }

    public static final void e(hk2 hk2Var, Ref$IntRef ref$IntRef, LinkedHashMap linkedHashMap, List list) {
        int h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            ldc ldcVar = null;
            if (oVar instanceof FormattedText.h) {
                FormattedText.h hVar = (FormattedText.h) oVar;
                String str = hVar.g;
                if (str.length() != 0) {
                    try {
                        ldcVar = new ldc(rzo.d(Color.parseColor(str)));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (ldcVar != null) {
                    h = hk2Var.h(new bmt0(ldcVar.a, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65534));
                    try {
                        hk2Var.d(((FormattedText.h) oVar).a);
                        hk2Var.g(h);
                    } finally {
                    }
                } else {
                    hk2Var.d(hVar.a);
                }
            } else {
                if (oVar instanceof FormattedText.d) {
                    String i = oyr.i(ref$IntRef.element, "img_");
                    ref$IntRef.element++;
                    FormattedText.d dVar = (FormattedText.d) oVar;
                    int i2 = dVar.e;
                    int i3 = dVar.d;
                    String str2 = dVar.a;
                    if (i3 <= 0) {
                        i3 = 14;
                    }
                    long E = uh6.E(i3);
                    long E2 = uh6.E(i2 > 0 ? i2 : 14);
                    n6b1.a(hk2Var, i, "�");
                    linkedHashMap.put(i, new oxv(new r3c0(7, E, E2), new a(377052763, new le(str2, 22), true)));
                } else if (oVar instanceof FormattedText.e) {
                    String i4 = oyr.i(ref$IntRef.element, "img_");
                    ref$IntRef.element++;
                    String str3 = ((FormattedText.e) oVar).a;
                    n6b1.a(hk2Var, i4, "�");
                    linkedHashMap.put(i4, new oxv(new r3c0(7, uh6.E(14), uh6.E(14)), new a(-1857992036, new le(str3, 23), true)));
                } else if (oVar instanceof FormattedText.a) {
                    e(hk2Var, ref$IntRef, linkedHashMap, ((FormattedText.a) oVar).b);
                } else if (oVar instanceof FormattedText.g) {
                    FormattedText.h hVar2 = ((FormattedText.g) oVar).b;
                    String str4 = hVar2.g;
                    if (str4.length() != 0) {
                        try {
                            ldcVar = new ldc(rzo.d(Color.parseColor(str4)));
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    if (ldcVar != null) {
                        h = hk2Var.h(new bmt0(ldcVar.a, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65534));
                        try {
                            hk2Var.d(((FormattedText.g) oVar).b.a);
                        } finally {
                        }
                    } else {
                        hk2Var.d(hVar2.a);
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
