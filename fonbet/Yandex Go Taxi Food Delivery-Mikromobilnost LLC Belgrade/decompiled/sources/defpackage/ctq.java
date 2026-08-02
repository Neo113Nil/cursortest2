package defpackage;

import androidx.compose.ui.node.d;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import com.squareup.wire.MessageJsonAdapter;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$PhoneCallFallbackReason;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.smartcamera.arscene.ui.f;
import io.appmetrica.analytics.AppMetrica;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.grid_layout_widget.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class ctq implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ctq(jrv jrvVar, h8w h8wVar) {
        this.a = 14;
        this.b = jrvVar;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        f930 f930Var = (f930) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            jeb1.f((String) f930Var.d.b, an91.l(c530.a, 16.0f, 7.0f), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 48, 0, 16380);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long q;
        long j;
        long j2;
        long j3;
        zy11 json$lambda$0;
        int i = this.a;
        g43 g43Var = lr20.c;
        int i2 = 3;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                mfz0 mfz0Var = (mfz0) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
                    String title = mfz0Var.getTitle();
                    if (mfz0Var.isSelected()) {
                        btsVar.e0(-1811899208);
                        q = ((el51) btsVar.m(gl51.a)).p();
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1811817833);
                        q = ((el51) btsVar.m(gl51.a)).q();
                        btsVar.t(false);
                    }
                    ymb1.f(title, m, q, null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, 2, null, null, btsVar, 48, HProv.ALG_TYPE_SECURECHANNEL, 56312);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                yvt yvtVar = (yvt) obj4;
                adp adpVar = new adp(i2, (tls) obj2);
                if (zvt.g.contains(Integer.valueOf(a.d.d(yvtVar.a, b.a)))) {
                    adpVar.invoke(Boolean.FALSE);
                } else {
                    com.google.android.gms.wallet.b newBuilder = IsReadyToPayRequest.newBuilder();
                    Iterator it = zvt.f.iterator();
                    while (it.hasNext()) {
                        newBuilder.b(((Number) it.next()).intValue());
                    }
                    rma0 rma0Var = yvtVar.b;
                    IsReadyToPayRequest isReadyToPayRequest = newBuilder.a;
                    rma0Var.getClass();
                    ysx0 a = zsx0.a();
                    a.d = 23705;
                    a.a = new va90(isReadyToPayRequest);
                    rma0Var.d(0, a.a()).b(new xen(19, adpVar));
                }
                return zy11Var;
            case 2:
                c cVar = (c) obj4;
                n351 n351Var = (n351) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(n351Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    ((tgg) cVar.b.get()).d(n351Var, null, btsVar2, (intValue2 & 14) | 512, 2);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 3:
                x91 x91Var = (x91) obj4;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.a(ebp0Var, x91Var, null, btsVar3, intValue3 & 14);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 4:
                yex0 yex0Var = (yex0) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    yex0Var.getClass();
                    sya1.a(yex0Var.a, tra1.b(c530Var, 0.5f), null, yex0Var.b, btsVar4, 0, 4);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 5:
                qau qauVar = (qau) obj4;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar5).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    wza1.e(ibp0Var, qauVar, null, btsVar5, intValue5 & 14);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 6:
                f9u f9uVar = (f9u) obj4;
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((bts) fidVar6).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                    wza1.a(ebp0Var2, f9uVar, null, btsVar6, intValue6 & 14);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 7:
                hgx0 hgx0Var = (hgx0) obj4;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    sic a2 = qic.a(g43Var, x4c.G, btsVar7, 0);
                    int hashCode = Long.hashCode(btsVar7.T);
                    r1b0 o = btsVar7.o();
                    f530 d = androidx.compose.ui.b.d(btsVar7, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, a2);
                    qje.W(btsVar7, d.e, o);
                    qje.W(btsVar7, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar7, d.h);
                    qje.W(btsVar7, d.d, d);
                    com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.o(hgx0Var.a, null, btsVar7, 0);
                    com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.l(hgx0Var.b, null, btsVar7, 0);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 8:
                wbu wbuVar = (wbu) obj4;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    ymb1.f(wbuVar.d, an91.l(c530Var, 12.0f, 8.0f), ((el51) btsVar8.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar8, 48, 0, 65528);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 9:
                ja01 ja01Var = (ja01) obj4;
                bj6 bj6Var = (bj6) obj;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((bts) fidVar9).k(bj6Var) ? 4 : 2;
                }
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                    ha91.a(bj6Var, ((fa01) ja01Var).a, btsVar9, intValue9 & 14);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 10:
                piu piuVar = (piu) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    jeb1.f(piuVar.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar10).g.b, btsVar10, 0, 0, 16382);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 11:
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.b bVar = (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.b) obj4;
                n351 n351Var2 = (n351) obj;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((bts) fidVar11).k(n351Var2) ? 4 : 2;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                    ((tgg) bVar.b.get()).d(n351Var2, null, btsVar11, (intValue11 & 14) | 512, 2);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 12:
                ((Integer) obj3).getClass();
                bts btsVar12 = (bts) ((fid) obj2);
                btsVar12.e0(-189257281);
                f530 a3 = aab1.a(e5v.c, tje.n((wp2) obj4, btsVar12), (f530) obj, cyk0.a);
                btsVar12.t(false);
                return a3;
            case 13:
                com.yandex.go.inapp_calls.repository.c cVar2 = (com.yandex.go.inapp_calls.repository.c) obj4;
                bgb0.j(cVar2.e, (String) obj3);
                cVar2.d.j((String) obj, InAppCallsAnalytics$PhoneCallFallbackReason.CallGoPluginTriggered, (String) obj2);
                return zy11Var;
            case 14:
                ((Integer) obj3).getClass();
                bts btsVar13 = (bts) ((fid) obj2);
                btsVar13.e0(-353972293);
                ((jrv) obj4).getClass();
                btsVar13.e0(1257603829);
                h2b1 h2b1Var = h2b1.I;
                btsVar13.t(false);
                boolean k = btsVar13.k(h2b1Var);
                Object Q = btsVar13.Q();
                if (k || Q == did.a) {
                    Q = new mrv();
                    btsVar13.o0(Q);
                }
                mrv mrvVar = (mrv) Q;
                btsVar13.t(false);
                return mrvVar;
            case 15:
                j6 j6Var = (j6) obj4;
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((bts) fidVar12).k(ebp0Var3) ? 4 : 2;
                }
                bts btsVar14 = (bts) fidVar12;
                if (btsVar14.V(intValue12 & 1, (intValue12 & 19) != 18)) {
                    uo5 uo5Var = x4c.y;
                    ebp0Var3.getClass();
                    jeb1.f(j6Var.b, an91.o(cj6.a.a(c530Var, uo5Var), 0.0f, 14.0f, 0.0f, 14.0f, 5), AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar14).h.a, btsVar14, 384, 0, 16248);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 16:
                vuv vuvVar = (vuv) obj4;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar13;
                if (btsVar15.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    boolean z = vuvVar.a;
                    List list = vuvVar.e;
                    String str = vuvVar.c;
                    if (z || ((str == null || evu0.J(str)) && !list.isEmpty())) {
                        tse0.s(btsVar15, -703406388, c530Var, 16.0f, btsVar15);
                        btsVar15.t(false);
                    } else if (str == null || evu0.J(str) || list.isEmpty()) {
                        btsVar15.e0(-330408673);
                        btsVar15.t(false);
                    } else {
                        btsVar15.e0(-330639499);
                        jeb1.f(vuvVar.c, an91.l(c530Var, 16.0f, 13.0f), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar15).h.b, btsVar15, 432, 0, 16376);
                        btsVar15.t(false);
                    }
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 17:
                ((InputTextController) ((com.yandex.messaging.input.bricks.writing.d) obj4).H.get()).onRecreatedMentions(((Integer) obj).intValue(), ((Integer) obj2).intValue(), (String) obj3);
                return zy11Var;
            case 18:
                ((vg3) obj4).run();
                ((tls) obj2).invoke(zy11Var);
                return zy11Var;
            case 19:
                xvy xvyVar = (xvy) obj4;
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar14;
                if (btsVar16.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    f530 c = ljs0.c(c530Var, 1.0f);
                    z910 d2 = pi6.d(x4c.b, false);
                    int hashCode2 = Long.hashCode(btsVar16.T);
                    r1b0 o2 = btsVar16.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar16, c);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar16.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar16.i0();
                    if (btsVar16.S) {
                        btsVar16.n(slsVar2);
                    } else {
                        btsVar16.r0();
                    }
                    qje.W(btsVar16, d.f, d2);
                    qje.W(btsVar16, d.e, o2);
                    wls wlsVar = d.g;
                    if (btsVar16.S || !jl40.l(btsVar16.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar16, hashCode2, wlsVar);
                    }
                    qje.W(btsVar16, d.d, d3);
                    String str2 = xvyVar.a;
                    a7u0 a7u0Var = gl51.a;
                    long p = ((el51) btsVar16.m(a7u0Var)).p();
                    lzr lzrVar = lzr.E;
                    uo5 uo5Var2 = x4c.y;
                    cj6 cj6Var = cj6.a;
                    ymb1.e(str2, cj6Var.a(c530Var, uo5Var2), p, null, lzrVar, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar16, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65512);
                    s3b1.f(new cuj0(vzg0.ic_live_location, null, null, new zez0(((el51) btsVar16.m(a7u0Var)).p()), 22), an91.m(cj6Var.a(c530Var, x4c.z), 16.0f, 0.0f, 2), null, btsVar16, 0, 4);
                    btsVar16.t(true);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 20:
                kxz kxzVar = (kxz) obj4;
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar17 = (bts) fidVar15;
                if (btsVar17.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    jeb1.f(kxzVar.c.a, ofb1.b(c530Var, kxzVar.c.b, null, 14), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar17).g.b, btsVar17, 0, 0, 16380);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 21:
                ((Integer) obj3).getClass();
                f.b((v33) obj4, (fid) obj2, 0);
                return zy11Var;
            case 22:
                mx00 mx00Var = (mx00) obj4;
                fid fidVar16 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                bts btsVar18 = (bts) fidVar16;
                if (btsVar18.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    f530 o3 = an91.o(ljs0.e(ljs0.w(c530Var, 3), 18.0f), 5.0f, 0.0f, 3.0f, 0.0f, 10);
                    lhl0 a4 = khl0.a(lr20.a, x4c.E, btsVar18, 48);
                    int hashCode3 = Long.hashCode(btsVar18.T);
                    r1b0 o4 = btsVar18.o();
                    f530 d4 = androidx.compose.ui.b.d(btsVar18, o3);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar18.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar18.i0();
                    if (btsVar18.S) {
                        btsVar18.n(slsVar3);
                    } else {
                        btsVar18.r0();
                    }
                    qje.W(btsVar18, d.f, a4);
                    qje.W(btsVar18, d.e, o4);
                    wls wlsVar2 = d.g;
                    if (btsVar18.S || !jl40.l(btsVar18.Q(), Integer.valueOf(hashCode3))) {
                        b64.z(hashCode3, btsVar18, hashCode3, wlsVar2);
                    }
                    qje.W(btsVar18, d.d, d4);
                    ldc ldcVar = mx00Var.b;
                    if (ldcVar == null) {
                        btsVar18.e0(721350934);
                        j = ((el51) btsVar18.m(gl51.a)).n();
                        btsVar18.t(false);
                    } else {
                        btsVar18.e0(721349415);
                        btsVar18.t(false);
                        j = ldcVar.a;
                    }
                    ymb1.g(mx00Var.a, null, j, null, 0L, 0L, 0L, 0, false, 0, null, null, btsVar18, 0, 65530);
                    pi6.a(ljs0.q(c530Var, 2.0f), btsVar18, 6);
                    s3b1.f(mx00Var.d, ljs0.n(c530Var, 8.0f, 12.0f), null, btsVar18, 48, 4);
                    btsVar18.t(true);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 23:
                nx00 nx00Var = (nx00) obj4;
                bj6 bj6Var2 = (bj6) obj;
                fid fidVar17 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((bts) fidVar17).k(bj6Var2) ? 4 : 2;
                }
                bts btsVar19 = (bts) fidVar17;
                if (btsVar19.V(intValue17 & 1, (intValue17 & 19) != 18)) {
                    f530 o5 = an91.o(bj6Var2.a(c530Var, x4c.x), 16.0f, 0.0f, 98.0f, 0.0f, 10);
                    sic a5 = qic.a(g43Var, x4c.G, btsVar19, 0);
                    int hashCode4 = Long.hashCode(btsVar19.T);
                    r1b0 o6 = btsVar19.o();
                    f530 d5 = androidx.compose.ui.b.d(btsVar19, o5);
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
                    qje.W(btsVar19, d.f, a5);
                    qje.W(btsVar19, d.e, o6);
                    wls wlsVar3 = d.g;
                    if (btsVar19.S || !jl40.l(btsVar19.Q(), Integer.valueOf(hashCode4))) {
                        b64.z(hashCode4, btsVar19, hashCode4, wlsVar3);
                    }
                    qje.W(btsVar19, d.d, d5);
                    lzr lzrVar2 = lzr.E;
                    ldc ldcVar2 = nx00Var.c;
                    if (ldcVar2 == null) {
                        btsVar19.e0(34194307);
                        j2 = ((el51) btsVar19.m(gl51.a)).n();
                        btsVar19.t(false);
                    } else {
                        btsVar19.e0(34192912);
                        btsVar19.t(false);
                        j2 = ldcVar2.a;
                    }
                    ymb1.e(nx00Var.b, null, j2, null, lzrVar2, null, 0L, 0L, 0L, null, 0, false, 2, null, null, btsVar19, HProv.ALG_CLASS_DATA_ENCRYPT, HProv.ALG_TYPE_SECURECHANNEL, 57322);
                    String str3 = nx00Var.d;
                    if (str3 == null) {
                        btsVar19.e0(1060129135);
                        btsVar19.t(false);
                    } else {
                        btsVar19.e0(1060129136);
                        ldc ldcVar3 = nx00Var.e;
                        if (ldcVar3 == null) {
                            btsVar19.e0(488939590);
                            j3 = ((el51) btsVar19.m(gl51.a)).o();
                            btsVar19.t(false);
                        } else {
                            btsVar19.e0(488938102);
                            btsVar19.t(false);
                            j3 = ldcVar3.a;
                        }
                        ymb1.f(str3, null, j3, null, null, null, 0L, 0L, 0L, null, 0, false, 2, null, null, btsVar19, 0, HProv.ALG_TYPE_SECURECHANNEL, 57338);
                        btsVar19.t(false);
                    }
                    btsVar19.t(true);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 24:
                ibp0 ibp0Var2 = (ibp0) obj4;
                n8v n8vVar = (n8v) obj;
                fid fidVar18 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                f530 k2 = an91.k(ljs0.a(c530Var, (ibp0Var2.c() == SlotSize.M ? SlotSize.L : ibp0Var2.c()).getSize(), ibp0Var2.c().getSize()), 2.0f);
                z910 d6 = pi6.d(x4c.y, false);
                bts btsVar20 = (bts) fidVar18;
                int hashCode5 = Long.hashCode(btsVar20.T);
                r1b0 o7 = btsVar20.o();
                f530 d7 = androidx.compose.ui.b.d(fidVar18, k2);
                ohd.G1.getClass();
                sls slsVar5 = d.b;
                bts btsVar21 = (bts) fidVar18;
                if (btsVar21.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar21.i0();
                if (btsVar21.S) {
                    btsVar21.n(slsVar5);
                } else {
                    btsVar21.r0();
                }
                qje.W(fidVar18, d.f, d6);
                qje.W(fidVar18, d.e, o7);
                qje.W(fidVar18, d.g, Integer.valueOf(hashCode5));
                qje.M(fidVar18, d.h);
                qje.W(fidVar18, d.d, d7);
                j4b1.c(n8vVar, null, null, null, null, null, 0.0f, 0, fidVar18, intValue18 & 14, 254);
                btsVar21.t(true);
                return zy11Var;
            case 25:
                p510 p510Var = (p510) obj4;
                fid fidVar19 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar22 = (bts) fidVar19;
                if (btsVar22.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    qgy.b(p510Var.a, null, an91.l(c530Var, 14.0f, 9.0f), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar22, 384, 0, 16378);
                } else {
                    btsVar22.Y();
                }
                return zy11Var;
            case 26:
                json$lambda$0 = MessageJsonAdapter.toJson$lambda$0((JsonWriter) obj4, (String) obj, obj2, (JsonAdapter) obj3);
                return json$lambda$0;
            case 27:
                ((tls) obj2).invoke(AppMetrica.getUuid(((vr) obj4).a));
                return zy11Var;
            case 28:
                return b(obj, obj2, obj3);
            default:
                gwc gwcVar = (gwc) obj4;
                fid fidVar20 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                bts btsVar23 = (bts) fidVar20;
                if (btsVar23.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    au2 au2Var = xob1.a;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("CompassFillColor", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(rzo.f(4288584600L));
                        uq90 e = nnm.e(12.0f, 14.73f);
                        e.e(1.5f, 0.0f, 2.73f, -1.22f, 2.73f, -2.73f);
                        e.f(18.0f);
                        e.i(-5.5f, 12.0f);
                        e.g(-1.0f);
                        e.h(6.0f, 12.0f);
                        e.g(3.27f);
                        e.e(0.0f, 1.5f, 1.22f, 2.73f, 2.73f, 2.73f);
                        lgvVar.b(0.4f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                        a6t0 a6t0Var2 = new a6t0(rzo.f(4294726192L));
                        uq90 uq90Var = new uq90();
                        uq90Var.j(12.5f, 0.0f);
                        uq90Var.g(-1.0f);
                        uq90Var.h(6.0f, 12.0f);
                        uq90Var.g(3.27f);
                        uq90Var.b(2.73f, 2.73f, false, true, 5.46f, 0.0f);
                        uq90Var.f(18.0f);
                        uq90Var.c();
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", uq90Var.a);
                        au2Var = rya1.a(lgvVar.d(), false);
                        xob1.a = au2Var;
                    }
                    sya1.a(au2Var, ira1.i(c530Var, -gwcVar.b), null, null, btsVar23, 384, 8);
                } else {
                    btsVar23.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ ctq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
