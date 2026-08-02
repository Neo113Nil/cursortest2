package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.ai_widget.ui.a;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.rida.bids.state.MapDecorationUiState$PulsarType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$IconBodyAlignment;
import com.yandex.messaging.telemost.domain.entities.CallHistoryData;
import com.yandex.smartcamera.arscene.ArFragment;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.preorder.summary.selector.verticals.bold.BoldVerticalsView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final /* synthetic */ class q0v implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0v(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        f530 f530Var;
        String str;
        ?? r7;
        DefaultOfferBodyDtoV2$IconBodyAlignment defaultOfferBodyDtoV2$IconBodyAlignment;
        uo5 uo5Var;
        ?? r2;
        zy11 onCreateView$lambda$12$lambda$11;
        zy11 verticalsAdapter$lambda$0;
        int i = this.a;
        cj6 cj6Var = cj6.a;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                wzu wzuVar = (wzu) obj4;
                sls slsVar = (sls) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                boolean V = btsVar.V(intValue & 1, (intValue & 3) != 2);
                dmw0 dmw0Var = btsVar.a;
                if (V) {
                    k3r k3rVar = ljs0.c;
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, k3rVar);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar2);
                    } else {
                        btsVar.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar, wlsVar, d);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar, wlsVar3, valueOf);
                    tls tlsVar = d.h;
                    qje.M(btsVar, tlsVar);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar, wlsVar4, d2);
                    e4v e4vVar = wzuVar.c;
                    if (e4vVar == null || (defaultOfferBodyDtoV2$IconBodyAlignment = e4vVar.c) == null) {
                        f530Var = c530Var;
                    } else {
                        int i2 = r0v.a[defaultOfferBodyDtoV2$IconBodyAlignment.ordinal()];
                        if (i2 == 1) {
                            uo5Var = x4c.A;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            uo5Var = x4c.y;
                        }
                        f530Var = cj6Var.a(c530Var, uo5Var);
                    }
                    if (e4vVar == null || (str = e4vVar.a) == null || str.length() <= 0) {
                        str = null;
                    }
                    Integer num = e4vVar != null ? e4vVar.d : null;
                    kxu kxuVar = wzuVar.l;
                    Integer num2 = num;
                    lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.F, btsVar, 54);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d3 = b.d(btsVar, f530Var);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar2);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, a);
                    qje.W(btsVar, wlsVar2, o2);
                    vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                    qje.W(btsVar, wlsVar4, d3);
                    if (str != null) {
                        btsVar.e0(697157424);
                        pvi0 b = mja1.b(str, null, 6);
                        t7d.a.getClass();
                        v0b1.a(b, null, null, t7d.b, null, null, null, null, 0.0f, 0, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 1014);
                        r7 = 0;
                        btsVar.t(false);
                    } else {
                        r7 = 0;
                        btsVar.e0(697522604);
                        btsVar.t(false);
                    }
                    if (num2 == null || kxuVar == null) {
                        btsVar.e0(697711084);
                        btsVar.t(r7);
                    } else {
                        btsVar.e0(697585193);
                        i2b1.a(null, num2.intValue(), kxuVar, btsVar, r7);
                        btsVar.t(r7);
                    }
                    btsVar.t(true);
                    va01 va01Var = e4vVar != null ? e4vVar.b : null;
                    if (va01Var == null) {
                        btsVar.e0(1143078894);
                        btsVar.t(r7);
                    } else {
                        btsVar.e0(1143078895);
                        asb1.b(an91.o(cj6Var.a(c530Var, x4c.C), 0.0f, 0.0f, 0.0f, 8.0f, 7), va01Var, slsVar, btsVar, 0);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                yzu yzuVar = (yzu) obj4;
                sls slsVar3 = (sls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                boolean V2 = btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2);
                dmw0 dmw0Var2 = btsVar2.a;
                if (V2) {
                    k3r k3rVar2 = ljs0.c;
                    z910 d4 = pi6.d(x4c.b, false);
                    int hashCode3 = Long.hashCode(btsVar2.T);
                    r1b0 o3 = btsVar2.o();
                    f530 d5 = b.d(btsVar2, k3rVar2);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar4);
                    } else {
                        btsVar2.r0();
                    }
                    wls wlsVar5 = d.f;
                    qje.W(btsVar2, wlsVar5, d4);
                    wls wlsVar6 = d.e;
                    qje.W(btsVar2, wlsVar6, o3);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    wls wlsVar7 = d.g;
                    qje.W(btsVar2, wlsVar7, valueOf2);
                    tls tlsVar2 = d.h;
                    qje.M(btsVar2, tlsVar2);
                    wls wlsVar8 = d.d;
                    qje.W(btsVar2, wlsVar8, d5);
                    Integer num3 = yzuVar.m;
                    kxu kxuVar2 = yzuVar.n;
                    f530 m = an91.m(cj6Var.a(c530Var, x4c.x), 8.0f, 0.0f, 2);
                    lhl0 a2 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.F, btsVar2, 54);
                    int hashCode4 = Long.hashCode(btsVar2.T);
                    r1b0 o4 = btsVar2.o();
                    f530 d6 = b.d(btsVar2, m);
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar4);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, wlsVar5, a2);
                    qje.W(btsVar2, wlsVar6, o4);
                    vfc.v(hashCode4, btsVar2, wlsVar7, btsVar2, tlsVar2);
                    qje.W(btsVar2, wlsVar8, d6);
                    CharSequence charSequence = yzuVar.c;
                    if (charSequence == null) {
                        btsVar2.e0(57494979);
                        r2 = 0;
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(57494980);
                        qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 0, 16374);
                        r2 = 0;
                        btsVar2.t(false);
                    }
                    if (num3 == null || kxuVar2 == null) {
                        btsVar2.e0(57804546);
                        btsVar2.t(r2);
                    } else {
                        btsVar2.e0(57678655);
                        i2b1.a(null, num3.intValue(), kxuVar2, btsVar2, r2);
                        btsVar2.t(r2);
                    }
                    btsVar2.t(true);
                    va01 va01Var2 = yzuVar.d;
                    if (va01Var2 == null) {
                        btsVar2.e0(1664160292);
                        btsVar2.t(r2);
                    } else {
                        btsVar2.e0(1664160293);
                        asb1.b(an91.o(cj6Var.a(c530Var, x4c.C), 0.0f, 0.0f, 0.0f, 8.0f, 7), va01Var2, slsVar3, btsVar2, r2);
                        btsVar2.t(r2);
                    }
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                a0v a0vVar = (a0v) obj4;
                va01 va01Var3 = a0vVar.e;
                sls slsVar5 = (sls) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                boolean V3 = btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2);
                dmw0 dmw0Var3 = btsVar3.a;
                if (!V3) {
                    btsVar3.Y();
                    return zy11Var;
                }
                k3r k3rVar3 = ljs0.c;
                f530 o5 = an91.o(k3rVar3, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                uo5 uo5Var2 = x4c.b;
                z910 d7 = pi6.d(uo5Var2, false);
                int hashCode5 = Long.hashCode(btsVar3.T);
                r1b0 o6 = btsVar3.o();
                f530 d8 = b.d(btsVar3, o5);
                ohd.G1.getClass();
                sls slsVar6 = d.b;
                if (dmw0Var3 == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar6);
                } else {
                    btsVar3.r0();
                }
                wls wlsVar9 = d.f;
                qje.W(btsVar3, wlsVar9, d7);
                wls wlsVar10 = d.e;
                qje.W(btsVar3, wlsVar10, o6);
                Integer valueOf3 = Integer.valueOf(hashCode5);
                wls wlsVar11 = d.g;
                qje.W(btsVar3, wlsVar11, valueOf3);
                tls tlsVar3 = d.h;
                qje.M(btsVar3, tlsVar3);
                wls wlsVar12 = d.d;
                qje.W(btsVar3, wlsVar12, d8);
                List list = a0vVar.c;
                float f = va01Var3 != null ? 48.0f : 0.0f;
                z910 d9 = pi6.d(uo5Var2, false);
                int hashCode6 = Long.hashCode(btsVar3.T);
                r1b0 o7 = btsVar3.o();
                f530 d10 = b.d(btsVar3, k3rVar3);
                btsVar3.i0();
                List list2 = list;
                if (btsVar3.S) {
                    btsVar3.n(slsVar6);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, wlsVar9, d9);
                qje.W(btsVar3, wlsVar10, o7);
                vfc.v(hashCode6, btsVar3, wlsVar11, btsVar3, tlsVar3);
                qje.W(btsVar3, wlsVar12, d10);
                f530 a3 = cj6Var.a(an91.o(ljs0.u(ljs0.c(c530Var, 1.0f), null, 3), 0.0f, 0.0f, f, 0.0f, 11), x4c.x);
                boolean k = btsVar3.k(a0vVar);
                Object Q = btsVar3.Q();
                if (k || Q == o430Var) {
                    Q = new gau(9, a0vVar);
                    btsVar3.o0(Q);
                }
                f530 a4 = fnq0.a(a3, (tls) Q);
                lhl0 a5 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.E, btsVar3, 54);
                int hashCode7 = Long.hashCode(btsVar3.T);
                r1b0 o8 = btsVar3.o();
                f530 d11 = b.d(btsVar3, a4);
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar6);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, wlsVar9, a5);
                qje.W(btsVar3, wlsVar10, o8);
                vfc.v(hashCode7, btsVar3, wlsVar11, btsVar3, tlsVar3);
                qje.W(btsVar3, wlsVar12, d11);
                btsVar3.e0(-1996382804);
                int size = list2.size();
                int i3 = 0;
                while (i3 < size) {
                    List list3 = list2;
                    o2b1.c((b911) list3.get(i3), a0vVar.o, btsVar3, 0);
                    if (i3 < scc.f(list3)) {
                        btsVar3.e0(-34548123);
                        o2b1.d(a0vVar.d, btsVar3, 0);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-34476048);
                        btsVar3.t(false);
                    }
                    i3++;
                    list2 = list3;
                }
                btsVar3.t(false);
                btsVar3.t(true);
                long n = tje.n(a0vVar.i, btsVar3);
                pi6.a(m4m0.a(ljs0.q(an91.o(cj6Var.a(c530Var, x4c.z), 0.0f, 0.0f, f, 0.0f, 11), 32.0f).k(ljs0.b), zoy0.A(scc.g(new ldc(ldc.b(n, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new ldc(ldc.b(n, 0.88f, 0.0f, 0.0f, 0.0f, 14)), new ldc(n)), 0.0f, Float.POSITIVE_INFINITY, 8), null, 6), btsVar3, 0);
                btsVar3.t(true);
                if (va01Var3 == null) {
                    btsVar3.e0(644368949);
                    btsVar3.t(false);
                } else {
                    btsVar3.e0(644368950);
                    asb1.b(an91.o(cj6Var.a(c530Var, x4c.C), 0.0f, 0.0f, 0.0f, 8.0f, 7), va01Var3, slsVar5, btsVar3, 0);
                    btsVar3.t(false);
                }
                btsVar3.t(true);
                return zy11Var;
            case 3:
                qh0 qh0Var = (qh0) obj4;
                tls tlsVar4 = (tls) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    vh0 vh0Var = qh0Var.d;
                    wh0 wh0Var = vh0Var != null ? vh0Var.b : null;
                    if (wh0Var == null) {
                        btsVar4.e0(878940508);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(878940509);
                        boolean k2 = btsVar4.k(tlsVar4) | btsVar4.k(wh0Var);
                        Object Q2 = btsVar4.Q();
                        if (k2 || Q2 == o430Var) {
                            Q2 = new tg0(tlsVar4, wh0Var, 1);
                            btsVar4.o0(Q2);
                        }
                        jeb1.f(wh0Var.a, an91.m(q791.d(c530.a, false, null, null, (sls) Q2, 15), 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).g.b, btsVar4, 0, 0, 16380);
                        btsVar4.t(false);
                    }
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                l9e.c((String) obj4, (wp2) obj3, (fid) obj, vng.O(49));
                return zy11Var;
            case 5:
                b31 b31Var = (b31) obj4;
                tls tlsVar5 = (tls) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                boolean V4 = btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2);
                dmw0 dmw0Var4 = btsVar5.a;
                if (V4) {
                    lhl0 a6 = khl0.a(lr20.a, x4c.E, btsVar5, 48);
                    int hashCode8 = Long.hashCode(btsVar5.T);
                    r1b0 o9 = btsVar5.o();
                    c530 c530Var2 = c530.a;
                    f530 d12 = b.d(btsVar5, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar7 = d.b;
                    if (dmw0Var4 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar7);
                    } else {
                        btsVar5.r0();
                    }
                    wls wlsVar13 = d.f;
                    qje.W(btsVar5, wlsVar13, a6);
                    wls wlsVar14 = d.e;
                    qje.W(btsVar5, wlsVar14, o9);
                    Integer valueOf4 = Integer.valueOf(hashCode8);
                    wls wlsVar15 = d.g;
                    qje.W(btsVar5, wlsVar15, valueOf4);
                    tls tlsVar6 = d.h;
                    qje.M(btsVar5, tlsVar6);
                    wls wlsVar16 = d.d;
                    qje.W(btsVar5, wlsVar16, d12);
                    qb90 qb90Var = b31Var.h;
                    boolean k3 = btsVar5.k(tlsVar5);
                    Object Q3 = btsVar5.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new o0(16, tlsVar5);
                        btsVar5.o0(Q3);
                    }
                    cn91.b(qb90Var, (sls) Q3, b31Var.i, an91.o(c530Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), btsVar5, HProv.ALG_TYPE_SECURECHANNEL);
                    Object Q4 = btsVar5.Q();
                    if (Q4 == o430Var) {
                        Q4 = new j01(5);
                        btsVar5.o0(Q4);
                    }
                    f530 b2 = fnq0.b(c530Var2, false, (tls) Q4);
                    z910 d13 = pi6.d(x4c.b, false);
                    int hashCode9 = Long.hashCode(btsVar5.T);
                    r1b0 o10 = btsVar5.o();
                    f530 d14 = b.d(btsVar5, b2);
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar7);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, wlsVar13, d13);
                    qje.W(btsVar5, wlsVar14, o10);
                    vfc.v(hashCode9, btsVar5, wlsVar15, btsVar5, tlsVar6);
                    qje.W(btsVar5, wlsVar16, d14);
                    au2 b3 = hgb1.b();
                    String e = ohb1.e(btsVar5, kyh0.select_current_geolocation_description);
                    boolean k4 = btsVar5.k(tlsVar5);
                    Object Q5 = btsVar5.Q();
                    if (k4 || Q5 == o430Var) {
                        Q5 = new o0(17, tlsVar5);
                        btsVar5.o0(Q5);
                    }
                    nab1.a(b3, e, (sls) Q5, null, btsVar5, 0, 8);
                    btsVar5.t(true);
                    btsVar5.t(true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                qpa1.a((xc1) obj4, (com.yandex.go.urbanads.b) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                qpa1.b((wc1) obj4, (com.yandex.go.urbanads.b) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                xqa1.a((com.yandex.go.ai_widget.ui.component.b) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                a.g((vp1) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                a.f((up1) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                msa1.a((vo70) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                msa1.e((wo70) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 13:
                float floatValue = ((Float) obj).floatValue();
                ((o62) obj4).a(floatValue, ((Float) obj2).floatValue());
                ((Ref$FloatRef) obj3).element = floatValue;
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                dya1.a((tb61) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(49));
                return zy11Var;
            case 15:
                onCreateView$lambda$12$lambda$11 = ArFragment.onCreateView$lambda$12$lambda$11((t33) obj4, (q33) obj3, (fid) obj, ((Integer) obj2).intValue());
                return onCreateView$lambda$12$lambda$11;
            case 16:
                ((Integer) obj2).getClass();
                h1b1.a((wd3) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                ((ru.yandex.taxi.logistics.sdk.promotions.api.a) obj4).a((or4) obj3, (fid) obj, vng.O(73));
                return zy11Var;
            case 18:
                h611 h611Var = (h611) obj4;
                ety0 ety0Var = (ety0) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    jeb1.f(h611Var.a, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar6, 384, 0, 16378);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 19:
                j611 j611Var = (j611) obj4;
                ety0 ety0Var2 = (ety0) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    c530 c530Var3 = c530.a;
                    f530 o11 = an91.o(c530Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                    sic a7 = qic.a(lr20.c, x4c.G, btsVar7, 0);
                    int hashCode10 = Long.hashCode(btsVar7.T);
                    r1b0 o12 = btsVar7.o();
                    f530 d15 = b.d(btsVar7, o11);
                    ohd.G1.getClass();
                    sls slsVar8 = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar8);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, a7);
                    qje.W(btsVar7, d.e, o12);
                    qje.W(btsVar7, d.g, Integer.valueOf(hashCode10));
                    qje.M(btsVar7, d.h);
                    qje.W(btsVar7, d.d, d15);
                    qgy.b(j611Var.a, null, null, tp2.a, 0L, 0L, null, 0L, 2, 0, 0, ety0Var2, null, btsVar7, 805309440, 0, 11766);
                    qgy.b(j611Var.b, null, an91.o(c530Var3, 0.0f, 3.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 0, 0, xya1.e(btsVar7).h.a, null, btsVar7, 805309824, 0, 11762);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                jp5.e((MapDecorationUiState$PulsarType) obj4, (m3u0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((efm0) obj4).b((anh) obj, (String) obj2);
                ((y22) ((bt5) obj3).g).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Обработка СБП-url", "process_sbp_form_url"));
                return zy11Var;
            case 22:
                verticalsAdapter$lambda$0 = BoldVerticalsView.verticalsAdapter$lambda$0((wls) obj4, (BoldVerticalsView) obj3, ((Integer) obj).intValue(), (ob31) obj2);
                return verticalsAdapter$lambda$0;
            case 23:
                tyu0 tyu0Var = (tyu0) obj;
                n8e n8eVar = (n8e) obj2;
                return ((z910) obj4).b(tyu0Var, tyu0Var.h0(zy11Var, new androidx.compose.runtime.internal.a(-431986394, new q0v(24, (zls) obj3, new dj6(tyu0Var, n8eVar.a)), true)), n8eVar.a);
            case 24:
                zls zlsVar = (zls) obj4;
                dj6 dj6Var = (dj6) obj3;
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(1 & intValue8, (intValue8 & 3) != 2)) {
                    zlsVar.invoke(dj6Var, btsVar8, 0);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 25:
                ibp0 ibp0Var = (ibp0) obj4;
                lj6 lj6Var = (lj6) obj3;
                fid fidVar9 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(1 & intValue9, (intValue9 & 3) != 2)) {
                    to5 to5Var = x4c.E;
                    ibp0Var.getClass();
                    udb1.b(ibp0Var, lj6Var.a.b, ljs0.m(an91.l(new pa31(to5Var), 8.0f, 16.0f), SlotSize.S.getSize()), null, btsVar9, 0, 12);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                xbb1.a((ms6) obj4, (tls) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 27:
                zls zlsVar2 = (zls) obj4;
                ebp0 ebp0Var = (ebp0) obj3;
                fid fidVar10 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(1 & intValue10, (intValue10 & 3) != 2)) {
                    zlsVar2.invoke(ebp0Var, btsVar10, 0);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 28:
                ((Integer) obj2).getClass();
                rh7.a((CallHistoryData) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                com.yandex.go.taxi.order.cancel.v3.ui.a.f((bz7) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ q0v(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
    }
}
