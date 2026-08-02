package defpackage;

import android.text.SpannableStringBuilder;
import androidx.compose.foundation.text.selection.e;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.navigator.floating_control_buttons.compose.button.a;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import com.ybsdk.feature.webview.internal.utils.DownloadBlobFileJSInterface;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class jvx0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jvx0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CharSequence charSequence;
        f530 a;
        int i;
        long a2;
        zy11 zy11Var;
        long j;
        int i2 = this.a;
        g43 g43Var = lr20.c;
        o430 o430Var = did.a;
        Pair pair = null;
        c530 c530Var = c530.a;
        zy11 zy11Var2 = zy11.a;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                o611 o611Var = (o611) obj4;
                bj6 bj6Var = (bj6) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(bj6Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(1 & intValue, (intValue & 19) != 18)) {
                    qgy.b((o611Var == null || (charSequence = o611Var.c) == null) ? "" : charSequence, null, bj6Var.a(c530Var, x4c.y), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16250);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 1:
                t611 t611Var = (t611) obj4;
                bj6 bj6Var2 = (bj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(bj6Var2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    f530 a3 = bj6Var2.a(an91.m(c530Var, 8.0f, 0.0f, 2), x4c.y);
                    lhl0 a4 = khl0.a(lr20.a, x4c.D, btsVar2, 0);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = b.d(btsVar2, a3);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
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
                    qje.W(btsVar2, d.f, a4);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d);
                    obm obmVar = t611Var.d;
                    if (obmVar == null) {
                        btsVar2.e0(-370709712);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-370709711);
                        boolean k = btsVar2.k(obmVar.a);
                        Object Q = btsVar2.Q();
                        if (k || Q == o430Var) {
                            Q = new u92(ffx.d0(obmVar.b, 0, 0, 7));
                            btsVar2.o0(Q);
                        }
                        o4b1.b(new a16((l8v) Q), null, null, null, null, 0.0f, null, btsVar2, 56, HProv.PP_SAME_MEDIA);
                        btsVar2.t(false);
                    }
                    qgy.b(t611Var.c, null, an91.m(c530Var, 3.0f, 0.0f, 2).k(new pa31(x4c.E)), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, null, null, btsVar2, 0, 0, 16250);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 2:
                wls wlsVar = (wls) obj4;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(1 & intValue3, (intValue3 & 17) != 16)) {
                    wlsVar.invoke(btsVar3, 0);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 3:
                j jVar = (j) obj4;
                f530 f530Var = (f530) obj;
                ((Integer) obj3).getClass();
                bts btsVar4 = (bts) ((fid) obj2);
                btsVar4.e0(1980580247);
                fwi fwiVar = (fwi) btsVar4.m(androidx.compose.ui.platform.j.h);
                Object Q2 = btsVar4.Q();
                if (Q2 == o430Var) {
                    Q2 = f.j(new k6w(0L));
                    btsVar4.o0(Q2);
                }
                oz40 oz40Var = (oz40) Q2;
                boolean e = btsVar4.e(jVar);
                Object Q3 = btsVar4.Q();
                if (e || Q3 == o430Var) {
                    Q3 = new i5y0(5, jVar, oz40Var);
                    btsVar4.o0(Q3);
                }
                sls slsVar2 = (sls) Q3;
                boolean k2 = btsVar4.k(fwiVar);
                Object Q4 = btsVar4.Q();
                if (k2 || Q4 == o430Var) {
                    Q4 = new ooi(fwiVar, oz40Var, 9);
                    btsVar4.o0(Q4);
                }
                pj2 pj2Var = vkq0.a;
                a = b.a(f530Var, m.a(), new e(slsVar2, (tls) Q4));
                btsVar4.t(false);
                return a;
            case 4:
                t460 t460Var = (t460) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar4;
                if (btsVar5.V(1 & intValue4, (intValue4 & 17) != 16)) {
                    ymb1.f(t460Var.a, an91.m(c530Var, 12.0f, 0.0f, 2), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar5, 48, 0, 65532);
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
            case 5:
                w611 w611Var = (w611) obj4;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar5;
                if (btsVar6.V(1 & intValue5, (intValue5 & 17) != 16)) {
                    jeb1.f(w611Var.a, an91.k(c530Var, 8.0f), AppColor$Palette.TextOnControlMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar6).h.a, btsVar6, 432, 0, 16376);
                } else {
                    btsVar6.Y();
                }
                return zy11Var2;
            case 6:
                s37 s37Var = (s37) obj4;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar6;
                if (btsVar7.V(1 & intValue6, (intValue6 & 17) != 16)) {
                    zgb1.a(s37Var.a, an91.m(c530Var, 14.0f, 0.0f, 2), 0, false, null, null, false, null, btsVar7, 48, 252);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
            case 7:
                ef70 ef70Var = (ef70) obj4;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar8 = (bts) fidVar7;
                if (btsVar8.V(1 & intValue7, (intValue7 & 17) != 16)) {
                    s3b1.f(ef70Var.a, null, null, btsVar8, 0, 6);
                } else {
                    btsVar8.Y();
                }
                return zy11Var2;
            case 8:
                s9z0 s9z0Var = (s9z0) obj4;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar8;
                if (btsVar9.V(1 & intValue8, (intValue8 & 17) != 16)) {
                    String str = s9z0Var.a;
                    f530 m = an91.m(c530Var, 14.0f, 0.0f, 2);
                    ldc ldcVar = s9z0Var.b;
                    ymb1.f(str, m, ldcVar != null ? ldcVar.a : dl51.P, null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar9, 24624, 0, 65512);
                } else {
                    btsVar9.Y();
                }
                return zy11Var2;
            case 9:
                ((v5) obj4).invoke(new wnf0((tls) obj2, (tls) obj3, 7));
                return zy11Var2;
            case 10:
                osz0 osz0Var = (osz0) obj4;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar9;
                if (btsVar10.V(1 & intValue9, (intValue9 & 17) != 16)) {
                    sya1.a(osz0Var.a, null, null, AppColor$Palette.Text, btsVar10, HProv.ALG_TYPE_SECURECHANNEL, 6);
                } else {
                    btsVar10.Y();
                }
                return zy11Var2;
            case 11:
                msz0 msz0Var = (msz0) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar10;
                if (btsVar11.V(1 & intValue10, (intValue10 & 17) != 16)) {
                    boolean k3 = btsVar11.k(msz0Var);
                    Object Q5 = btsVar11.Q();
                    if (k3 || Q5 == o430Var) {
                        Q5 = new pxy0(8, msz0Var);
                        btsVar11.o0(Q5);
                    }
                    erb1.b(0, btsVar11, fnq0.a(c530Var, (tls) Q5), msz0Var.b);
                } else {
                    btsVar11.Y();
                }
                return zy11Var2;
            case 12:
                k kVar = (k) obj;
                o l0 = ((x910) obj2).l0(((n8e) obj3).a);
                int i3 = l0.b;
                ((mvz0) ((nvz0) obj4).b.getValue()).getClass();
                return kVar.w(l0.a, i3 + ((int) kVar.w0(8.0f)), kotlin.collections.b.f(), new q83(l0, 16));
            case 13:
                r901 r901Var = (r901) obj4;
                bj6 bj6Var3 = (bj6) obj;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((bts) fidVar11).k(bj6Var3) ? 4 : 2;
                }
                bts btsVar12 = (bts) fidVar11;
                if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                    btsVar12.Y();
                } else if (jl40.l(r901Var, n901.a)) {
                    btsVar12.e0(-1323542888);
                    a.c(bj6Var3, btsVar12, intValue11 & 14);
                    btsVar12.t(false);
                } else if (r901Var instanceof o901) {
                    btsVar12.e0(-1323541160);
                    o901 o901Var = (o901) r901Var;
                    a.a(bj6Var3, srb1.a(o901Var.a), o901Var.b, btsVar12, intValue11 & 14);
                    btsVar12.t(false);
                } else if (jl40.l(r901Var, p901.a)) {
                    btsVar12.e0(-1323536649);
                    a.d(bj6Var3, btsVar12, intValue11 & 14);
                    btsVar12.t(false);
                } else {
                    if (!jl40.l(r901Var, q901.a)) {
                        throw unr0.y(-1323544276, btsVar12, false);
                    }
                    btsVar12.e0(-1323535013);
                    a.e(bj6Var3, btsVar12, intValue11 & 14);
                    btsVar12.t(false);
                }
                return zy11Var2;
            case 14:
                bj6 bj6Var4 = (bj6) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= fidVar12.a(booleanValue) ? 4 : 2;
                }
                bts btsVar13 = (bts) fidVar12;
                if (btsVar13.V(1 & intValue12, (intValue12 & 19) != 18)) {
                    if (booleanValue) {
                        btsVar13.e0(-2037589148);
                        a2 = hob1.a(btsVar13, vog0.traffic_na);
                        i = 5;
                    } else {
                        i = 5;
                        btsVar13.e0(-2037518623);
                        a2 = hob1.a(btsVar13, vog0.traffic_light);
                    }
                    o4b1.b(mt71.m(v2h0.traffic_light_48, 0, btsVar13), null, tra1.b(bj6Var4.a(ljs0.m(c530Var, 40.0f), x4c.y), 1.0f), null, null, 0.0f, tse0.e(a2, i, btsVar13, false), btsVar13, 56, 56);
                } else {
                    btsVar13.Y();
                }
                return zy11Var2;
            case 15:
                ed01 ed01Var = (ed01) obj4;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar13;
                boolean V = btsVar14.V(intValue13 & 1, (intValue13 & 17) != 16);
                dmw0 dmw0Var = btsVar14.a;
                if (V) {
                    f530 m2 = an91.m(ljs0.c(c530Var, 1.0f), 0.0f, 8.0f, 1);
                    lhl0 a5 = khl0.a(lr20.g, x4c.E, btsVar14, 54);
                    int hashCode2 = Long.hashCode(btsVar14.T);
                    r1b0 o2 = btsVar14.o();
                    f530 d2 = b.d(btsVar14, m2);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar14.i0();
                    if (btsVar14.S) {
                        btsVar14.n(slsVar3);
                    } else {
                        btsVar14.r0();
                    }
                    wls wlsVar2 = d.f;
                    qje.W(btsVar14, wlsVar2, a5);
                    wls wlsVar3 = d.e;
                    qje.W(btsVar14, wlsVar3, o2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    wls wlsVar4 = d.g;
                    qje.W(btsVar14, wlsVar4, valueOf);
                    tls tlsVar = d.h;
                    qje.M(btsVar14, tlsVar);
                    wls wlsVar5 = d.d;
                    x2y d3 = n.d(btsVar14, d2, wlsVar5, 1.0f, true);
                    sic a6 = qic.a(g43Var, x4c.G, btsVar14, 0);
                    int hashCode3 = Long.hashCode(btsVar14.T);
                    r1b0 o3 = btsVar14.o();
                    f530 d4 = b.d(btsVar14, d3);
                    btsVar14.i0();
                    if (btsVar14.S) {
                        btsVar14.n(slsVar3);
                    } else {
                        btsVar14.r0();
                    }
                    qje.W(btsVar14, wlsVar2, a6);
                    qje.W(btsVar14, wlsVar3, o3);
                    vfc.v(hashCode3, btsVar14, wlsVar4, btsVar14, tlsVar);
                    qje.W(btsVar14, wlsVar5, d4);
                    ed01Var.getClass();
                    btsVar14.e0(-207342416);
                    btsVar14.t(false);
                    btsVar14.e0(-207019768);
                    btsVar14.t(false);
                    btsVar14.t(true);
                    f530 b = tra1.b(ljs0.s(c530Var, 72.0f, 0.0f, 2), 0.5f);
                    z910 d5 = pi6.d(x4c.z, false);
                    int hashCode4 = Long.hashCode(btsVar14.T);
                    r1b0 o4 = btsVar14.o();
                    f530 d6 = b.d(btsVar14, b);
                    btsVar14.i0();
                    if (btsVar14.S) {
                        btsVar14.n(slsVar3);
                    } else {
                        btsVar14.r0();
                    }
                    qje.W(btsVar14, wlsVar2, d5);
                    qje.W(btsVar14, wlsVar3, o4);
                    vfc.v(hashCode4, btsVar14, wlsVar4, btsVar14, tlsVar);
                    qje.W(btsVar14, wlsVar5, d6);
                    btsVar14.e0(1169011363);
                    btsVar14.t(false);
                    btsVar14.t(true);
                    btsVar14.t(true);
                } else {
                    btsVar14.Y();
                }
                return zy11Var2;
            case 16:
                id01 id01Var = (id01) obj4;
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar14;
                if (btsVar15.V(1 & intValue14, (intValue14 & 17) != 16)) {
                    id01Var.getClass();
                    throw null;
                }
                btsVar15.Y();
                return zy11Var2;
            case 17:
                ee01 ee01Var = (ee01) obj4;
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar15;
                if (btsVar16.V(1 & intValue15, (intValue15 & 17) != 16)) {
                    qgy.b(ee01Var.a, null, an91.m(c530Var, 12.0f, 0.0f, 2), AppColor$Palette.TextOnControl, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar16).g.a, null, btsVar16, 3456, 0, 12274);
                } else {
                    btsVar16.Y();
                }
                return zy11Var2;
            case 18:
                ge01 ge01Var = (ge01) obj4;
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                bts btsVar17 = (bts) fidVar16;
                if (btsVar17.V(1 & intValue16, (intValue16 & 17) != 16)) {
                    qgy.b(ge01Var.a, null, an91.m(c530Var, 12.0f, 0.0f, 2), AppColor$Palette.TextOnControlMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar17).g.a, null, btsVar17, 3456, 0, 12274);
                } else {
                    btsVar17.Y();
                }
                return zy11Var2;
            case 19:
                c711 c711Var = (c711) obj4;
                fid fidVar17 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                bts btsVar18 = (bts) fidVar17;
                if (btsVar18.V(1 & intValue17, (intValue17 & 17) != 16)) {
                    qgy.b(c711Var.a, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar18).h.b, null, btsVar18, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                } else {
                    btsVar18.Y();
                }
                return zy11Var2;
            case 20:
                com.ybsdk.feature.transfer.internal.screens.targets.presentation.b bVar = (com.ybsdk.feature.transfer.internal.screens.targets.presentation.b) obj4;
                PartnerEntity partnerEntity = (PartnerEntity) obj;
                Throwable th = (Throwable) obj2;
                String str2 = (String) obj3;
                bVar.C.j(str2 == null ? th != null ? th.getMessage() : null : str2, "", null);
                bVar.Z(new ut01(partnerEntity, str2));
                return zy11Var2;
            case 21:
                g711 g711Var = (g711) obj4;
                fid fidVar18 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                bts btsVar19 = (bts) fidVar18;
                if (btsVar19.V(intValue18 & 1, (intValue18 & 17) != 16)) {
                    sic a7 = qic.a(g43Var, x4c.G, btsVar19, 0);
                    int hashCode5 = Long.hashCode(btsVar19.T);
                    r1b0 o5 = btsVar19.o();
                    f530 d7 = b.d(btsVar19, c530Var);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar19.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar19.i0();
                    if (btsVar19.S) {
                        btsVar19.n(slsVar4);
                    } else {
                        btsVar19.r0();
                    }
                    qje.W(btsVar19, d.f, a7);
                    qje.W(btsVar19, d.e, o5);
                    qje.W(btsVar19, d.g, Integer.valueOf(hashCode5));
                    qje.M(btsVar19, d.h);
                    qje.W(btsVar19, d.d, d7);
                    f530 m3 = an91.m(c530Var, 0.0f, 2.0f, 1);
                    SpannableStringBuilder spannableStringBuilder = g711Var.a;
                    CharSequence charSequence2 = g711Var.b;
                    peb1.b(spannableStringBuilder, m3, 3, 0, btsVar19, 3504, 16);
                    if (charSequence2.length() > 0) {
                        btsVar19.e0(2144892250);
                        peb1.b(charSequence2, an91.m(c530Var, 0.0f, 2.0f, 1), 0, xng0.textMinor, btsVar19, 3504, 0);
                        btsVar19.t(false);
                    } else {
                        btsVar19.e0(2145152991);
                        btsVar19.t(false);
                    }
                    btsVar19.t(true);
                } else {
                    btsVar19.Y();
                }
                return zy11Var2;
            case 22:
                u1n u1nVar = (u1n) obj4;
                fid fidVar19 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar20 = (bts) fidVar19;
                if (btsVar20.V(1 & intValue19, (intValue19 & 17) != 16)) {
                    jeb1.f((String) u1nVar.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar20).g.b, btsVar20, 0, 0, 16382);
                } else {
                    btsVar20.Y();
                }
                return zy11Var2;
            case 23:
                hwc hwcVar = (hwc) obj4;
                fid fidVar20 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                bts btsVar21 = (bts) fidVar20;
                if (btsVar21.V(1 & intValue20, (intValue20 & 17) != 16)) {
                    sya1.a(rya1.a(ea91.b(btsVar21, f1h0.ic_compass_24), false), ira1.i(c530Var, 360.0f - hwcVar.b), null, null, btsVar21, 384, 8);
                } else {
                    btsVar21.Y();
                }
                return zy11Var2;
            case 24:
                kt60 kt60Var = (kt60) obj4;
                fid fidVar21 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                bts btsVar22 = (bts) fidVar21;
                if (btsVar22.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    mie mieVar = kt60Var.a;
                    mie mieVar2 = kt60Var.d;
                    mie mieVar3 = kt60Var.c;
                    mie mieVar4 = kt60Var.b;
                    boolean z = (mieVar == null) == (mieVar4 == null);
                    boolean z2 = (mieVar3 == null) == (mieVar2 == null);
                    if (z && z2) {
                        btsVar22.e0(-881309181);
                        mie mieVar5 = kt60Var.a;
                        Pair pair2 = (mieVar5 == null || mieVar4 == null) ? null : new Pair(mieVar5, mieVar4);
                        if (mieVar3 != null && mieVar2 != null) {
                            pair = new Pair(mieVar3, mieVar2);
                        }
                        a8a1.h(new a0x0(pair2, pair), kt60Var.e, btsVar22, 0);
                        btsVar22.t(false);
                    } else {
                        btsVar22.e0(-881208772);
                        a8a1.e(kt60Var, btsVar22, 0);
                        btsVar22.t(false);
                    }
                } else {
                    btsVar22.Y();
                }
                return zy11Var2;
            case 25:
                zaz0 zaz0Var = (zaz0) obj4;
                fid fidVar22 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                bts btsVar23 = (bts) fidVar22;
                if (btsVar23.V(1 & intValue22, (intValue22 & 17) != 16)) {
                    ymb1.e(zaz0Var.a, null, 0L, null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar23, 0, 0, 64510);
                } else {
                    btsVar23.Y();
                }
                return zy11Var2;
            case 26:
                o9z0 o9z0Var = (o9z0) obj4;
                fid fidVar23 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                bts btsVar24 = (bts) fidVar23;
                if (btsVar24.V(1 & intValue23, (intValue23 & 17) != 16)) {
                    ymb1.e(o9z0Var.d.a, null, ((el51) btsVar24.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar24, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 64490);
                } else {
                    btsVar24.Y();
                }
                return zy11Var2;
            case 27:
                h141 h141Var = (h141) obj4;
                fid fidVar24 = (fid) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                bts btsVar25 = (bts) fidVar24;
                if (btsVar25.V(1 & intValue24, (intValue24 & 17) != 16)) {
                    jeb1.f(ohb1.e(btsVar25, h141Var.d), null, AppColor$Palette.TextOnControl, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar25).g.b, btsVar25, 384, 0, 16378);
                } else {
                    btsVar25.Y();
                }
                return zy11Var2;
            case 28:
                zy11Var = WebViewFragment.setupDownloadLogic$lambda$34$lambda$32((DownloadBlobFileJSInterface) obj4, (String) obj, (String) obj2, (String) obj3);
                return zy11Var;
            default:
                tre treVar = (tre) obj4;
                fid fidVar25 = (fid) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                bts btsVar26 = (bts) fidVar25;
                if (btsVar26.V(1 & intValue25, (intValue25 & 17) != 16)) {
                    String str3 = treVar.a;
                    ldc ldcVar2 = treVar.c;
                    if (ldcVar2 == null) {
                        btsVar26.e0(-1106368092);
                        j = ((el51) btsVar26.m(gl51.a)).n();
                        btsVar26.t(false);
                    } else {
                        btsVar26.e0(-1106369270);
                        btsVar26.t(false);
                        j = ldcVar2.a;
                    }
                    ymb1.a(str3, an91.o(c530.a, 0.0f, 0.0f, 0.0f, 2.0f, 7), j, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar26, 48, 65528);
                } else {
                    btsVar26.Y();
                }
                return zy11Var2;
        }
    }
}
