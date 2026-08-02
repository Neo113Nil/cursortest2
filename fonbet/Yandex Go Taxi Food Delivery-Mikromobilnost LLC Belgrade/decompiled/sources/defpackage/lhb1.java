package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.deeplink.MaasMode;

/* loaded from: classes5.dex */
public abstract class lhb1 {
    public static final void a(su9 su9Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        int i3;
        wls wlsVar;
        long j;
        f530 b;
        su9 su9Var2 = su9Var;
        gji0 gji0Var = qke.q;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-332567684);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(su9Var2) : btsVar2.e(su9Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            kdc kdcVar = su9Var2.j;
            if (kdcVar == null) {
                btsVar2.e0(965955527);
                btsVar2.t(false);
                valueOf = null;
            } else {
                btsVar2.e0(-1769955462);
                int m = s8o.m(kdcVar, (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b));
                btsVar2.t(false);
                valueOf = Integer.valueOf(m);
            }
            up2 up2Var = new up2(eq2.c);
            if (valueOf != null) {
                up2Var = new up2(rzo.d(valueOf.intValue()));
            }
            long n = tje.n(up2Var, btsVar2);
            kdc kdcVar2 = su9Var2.k;
            if (kdcVar2 == null) {
                btsVar2.e0(966141031);
                btsVar2.t(false);
                valueOf2 = null;
            } else {
                btsVar2.e0(-1769949478);
                int m2 = s8o.m(kdcVar2, (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b));
                btsVar2.t(false);
                valueOf2 = Integer.valueOf(m2);
            }
            wp2 wp2Var = AppColor$Palette.Line;
            if (valueOf2 != null) {
                wp2Var = new up2(rzo.d(valueOf2.intValue()));
            }
            long n2 = tje.n(wp2Var, btsVar2);
            kdc kdcVar3 = su9Var2.g;
            if (kdcVar3 == null) {
                btsVar2.e0(966322567);
                btsVar2.t(false);
                valueOf3 = null;
            } else {
                btsVar2.e0(-1769943622);
                int m3 = s8o.m(kdcVar3, (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b));
                btsVar2.t(false);
                valueOf3 = Integer.valueOf(m3);
            }
            wp2 wp2Var2 = AppColor$Palette.BgMinor;
            if (valueOf3 != null) {
                wp2Var2 = new up2(rzo.d(valueOf3.intValue()));
            }
            long n3 = tje.n(wp2Var2, btsVar2);
            float f = ((ry2) btsVar2.m(uy2.a)).b ? 0.15f : 0.25f;
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, f530Var);
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
            qje.W(btsVar2, wlsVar2, a);
            wls wlsVar3 = d.e;
            qje.W(btsVar2, wlsVar3, o);
            Integer valueOf4 = Integer.valueOf(hashCode);
            wls wlsVar4 = d.g;
            qje.W(btsVar2, wlsVar4, valueOf4);
            tls tlsVar2 = d.h;
            qje.M(btsVar2, tlsVar2);
            wls wlsVar5 = d.d;
            qje.W(btsVar2, wlsVar5, d);
            boolean z = su9Var2.d == su9Var2.f;
            byk0 c = cyk0.c(20.0f);
            boolean z2 = z;
            c530 c530Var = c530.a;
            f530 l = ymb1.l(c530Var, c);
            if (z2) {
                i3 = i2;
                wlsVar = wlsVar4;
                j = n;
                b = bb1.g(m4m0.b(c530Var, ldc.b(n, f, 0.0f, 0.0f, 0.0f, 14), gji0Var), new cs0(n3, 12));
            } else {
                i3 = i2;
                wlsVar = wlsVar4;
                j = n;
                b = m4m0.b(c530Var, n3, gji0Var);
            }
            f530 k = l.k(b);
            boolean z3 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && btsVar2.e(su9Var2))) | ((i3 & 112) == 32);
            Object Q = btsVar2.Q();
            if (z3 || Q == did.a) {
                Q = new u08(22, su9Var2, tlsVar);
                btsVar2.o0(Q);
            }
            f530 d2 = q791.d(k, false, null, null, (sls) Q, 15);
            sic a2 = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d3 = b.d(btsVar2, d2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar2, a2);
            qje.W(btsVar2, wlsVar3, o2);
            wls wlsVar6 = wlsVar;
            vfc.v(hashCode2, btsVar2, wlsVar6, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar5, d3);
            f530 o3 = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11);
            to5 to5Var = x4c.D;
            lhl0 a3 = khl0.a(lr20.a, to5Var, btsVar2, 0);
            int hashCode3 = Long.hashCode(btsVar2.T);
            r1b0 o4 = btsVar2.o();
            f530 d4 = b.d(btsVar2, o3);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar2, a3);
            qje.W(btsVar2, wlsVar3, o4);
            vfc.v(hashCode3, btsVar2, wlsVar6, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar5, d4);
            ovi0 a4 = mja1.a(su9Var.e, null, 6);
            f530 m4 = ljs0.m(c530Var, 64.0f);
            n4d.a.getClass();
            v0b1.a(a4, m4, null, null, n4d.b, null, null, null, 0.0f, 0, btsVar2, 24624, 1004);
            f530 o5 = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            sic a5 = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode4 = Long.hashCode(btsVar2.T);
            r1b0 o6 = btsVar2.o();
            f530 d5 = b.d(btsVar2, o5);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar2, a5);
            qje.W(btsVar2, wlsVar3, o6);
            vfc.v(hashCode4, btsVar2, wlsVar6, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar5, d5);
            f530 c2 = ljs0.c(c530Var, 1.0f);
            lhl0 a6 = khl0.a(new i43(12.0f, true, new quz(11)), to5Var, btsVar2, 6);
            int hashCode5 = Long.hashCode(btsVar2.T);
            r1b0 o7 = btsVar2.o();
            f530 d6 = b.d(btsVar2, c2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar2, a6);
            qje.W(btsVar2, wlsVar3, o7);
            vfc.v(hashCode5, btsVar2, wlsVar6, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar5, d6);
            su9Var2 = su9Var;
            CharSequence charSequence = su9Var2.b;
            ety0 ety0Var = xya1.e(btsVar2).g.b;
            x2y x2yVar = new x2y(0.75f, true);
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            qgy.b(charSequence, null, x2yVar, appColor$Palette, 0L, 0L, null, 0L, 2, 1, 0, ety0Var, null, btsVar2, 805309440, 6, 10738);
            bts btsVar3 = btsVar2;
            CharSequence charSequence2 = su9Var2.h;
            if (charSequence2 == null) {
                btsVar3.e0(-1096694097);
                btsVar3.t(false);
            } else {
                btsVar3.e0(-1096694096);
                qgy.b(charSequence2, null, ljs0.w(c530Var, 2), AppColor$Palette.TextMinor, 0L, 0L, new sjy0(6), 0L, 2, 1, 0, xya1.e(btsVar3).h.a, null, btsVar3, 805309824, 6, 10610);
                btsVar3 = btsVar3;
                btsVar3.t(false);
            }
            btsVar3.t(true);
            bts btsVar4 = btsVar3;
            qgy.b(su9Var2.c, null, null, appColor$Palette, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar3).h.a, null, btsVar4, 805309440, 6, 10742);
            btsVar = btsVar4;
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            b(su9Var2.d, su9Var2.f, an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 12.0f, 8.0f, 0.0f, 9), j, n2, btsVar, 384);
            CharSequence charSequence3 = su9Var2.i;
            if (charSequence3 == null) {
                btsVar.e0(1457391285);
                btsVar.t(false);
            } else {
                tse0.s(btsVar, 1457391286, c530Var, 12.0f, btsVar);
                qgy.b(charSequence3, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).h.a, null, btsVar, 805309440, 6, 10742);
                btsVar = btsVar;
                ly3.B(c530Var, 12.0f, btsVar, false);
            }
            ly3.A(btsVar, true, true, true, true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(su9Var2, tlsVar, f530Var, i, 4);
        }
    }

    public static final void b(int i, int i2, f530 f530Var, long j, long j2, fid fidVar, int i3) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(148416097);
        dmw0 dmw0Var = btsVar.a;
        int i4 = i3 | (btsVar.c(i) ? 4 : 2) | (btsVar.c(i2) ? 32 : 16) | (btsVar.d(j) ? 2048 : 1024) | (btsVar.d(j2) ? 16384 : 8192);
        boolean z = false;
        boolean z2 = true;
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530Var2 = f530Var;
            f530 d = b.d(btsVar, f530Var2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(806299388);
            int i5 = 0;
            while (i5 < i) {
                uo5 uo5Var = x4c.y;
                x2y x2yVar = new x2y(1.0f, z2);
                z910 d2 = pi6.d(uo5Var, z);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d3 = b.d(btsVar, x2yVar);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, d2);
                qje.W(btsVar, d.e, o2);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode2));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d3);
                oeb1.c(btsVar, m4m0.b(ljs0.e(ljs0.c(c530.a, 1.0f), 4.0f), i5 < i2 ? j : j2, cyk0.c(4.0f)));
                btsVar.t(true);
                i5++;
                z2 = true;
                z = false;
            }
            btsVar.t(z);
            btsVar.t(z2);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new is9(i, i2, f530Var2, j, j2, i3);
        }
    }

    public static final m000 c(Uri uri, MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2) {
        Object obj;
        if (!"maas-ride".equalsIgnoreCase(uri.getAuthority())) {
            return null;
        }
        v100 v100Var = MaasMode.Companion;
        String queryParameter = uri.getQueryParameter("mode");
        if (queryParameter == null) {
            queryParameter = "";
        }
        v100Var.getClass();
        MaasMode a = v100.a(queryParameter);
        k4o a2 = MaasMode.a();
        if (a == null) {
            jst.e.x(new IllegalArgumentException(), "'maas-ride' deeplink must have 'mode' parameter with " + a2.size() + " possible values " + a2);
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("coupon");
        String str = queryParameter2 == null ? "" : queryParameter2;
        String queryParameter3 = uri.getQueryParameter("vertical_id");
        String str2 = queryParameter3 == null ? "" : queryParameter3;
        Iterator<E> it = MultiTransportChooseStationCardAnalytics$OpenReasonV2.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String eventValue = ((MultiTransportChooseStationCardAnalytics$OpenReasonV2) obj).getEventValue();
            String queryParameter4 = uri.getQueryParameter("open_reason");
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            if (jl40.l(eventValue, queryParameter4)) {
                break;
            }
        }
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV22 = (MultiTransportChooseStationCardAnalytics$OpenReasonV2) obj;
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV23 = multiTransportChooseStationCardAnalytics$OpenReasonV22 == null ? multiTransportChooseStationCardAnalytics$OpenReasonV2 : multiTransportChooseStationCardAnalytics$OpenReasonV22;
        List<u000> g = scc.g(v000.a, v000.b);
        ArrayList arrayList = new ArrayList();
        for (u000 u000Var : g) {
            String queryParameter5 = uri.getQueryParameter(u000Var.a);
            Double i = queryParameter5 != null ? avu0.i(queryParameter5) : null;
            String queryParameter6 = uri.getQueryParameter(u000Var.b);
            Double i2 = queryParameter6 != null ? avu0.i(queryParameter6) : null;
            zzs zzsVar = (i == null || i2 == null) ? null : new zzs(i.doubleValue(), i2.doubleValue(), 0, null, null, 28);
            if (zzsVar != null) {
                arrayList.add(zzsVar);
            }
        }
        c0l0 c0l0Var = arrayList.size() == 2 ? new c0l0((zzs) a.P(arrayList), (zzs) a.Z(arrayList)) : null;
        m000 m000Var = new m000(a, str2, str, multiTransportChooseStationCardAnalytics$OpenReasonV23, c0l0Var);
        if (a != MaasMode.ACCOUNT && str2.length() == 0) {
            jst.e.x(new IllegalArgumentException(), "maas-ride deeplink must contain vertical ID");
            return null;
        }
        MaasMode maasMode = MaasMode.ROUTE;
        if (a != maasMode || c0l0Var != null) {
            return m000Var;
        }
        jst.e.x(new IllegalArgumentException(), "'" + maasMode + "' maas-ride deeplink must contain route points coordinates");
        return null;
    }

    public static final int d(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int e(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }
}
