package defpackage;

import androidx.compose.material3.y;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.masstransit.sdk.order.impl.activation.c;
import com.yandex.go.summary.ui.compose.common.bottomsheet.i;
import java.util.Calendar;
import java.util.Map;
import kotlin.collections.b;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes14.dex */
public final /* synthetic */ class nvs0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ nvs0(tls tlsVar, e541 e541Var, tls tlsVar2) {
        this.a = 29;
        this.c = tlsVar;
        this.b = e541Var;
        this.w = tlsVar2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        float f;
        int i = this.a;
        int i2 = 26;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        final int i3 = 2;
        zy11 zy11Var = zy11.a;
        final int i4 = 1;
        Object obj3 = this.w;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.j((dvs0) obj4, (tls) obj5, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.material3.a.e((y) obj4, (f530) obj5, (zls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                s611 s611Var = (s611) obj4;
                sls slsVar = (sls) obj5;
                ety0 ety0Var = (ety0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    Object Q = btsVar.Q();
                    if (Q == o430Var) {
                        Q = new teb(20);
                        btsVar.o0(Q);
                    }
                    f530 a = fnq0.a(c530Var, (tls) Q);
                    ButtonSize buttonSize = ButtonSize.XS;
                    boolean e = btsVar.e(s611Var) | btsVar.k(slsVar);
                    Object Q2 = btsVar.Q();
                    if (e || Q2 == o430Var) {
                        Q2 = new oiu0(s611Var, slsVar, 2);
                        btsVar.o0(Q2);
                    }
                    ulb1.b(a, false, buttonSize, (sls) Q2, wwg.S(-1038947451, true, new ays0(4, s611Var, ety0Var), btsVar), btsVar, 24960);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                i.i((m8u0) obj4, (m8u0) obj5, (m3u0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.mapcontent.surge.a.d((yvw0) obj4, (m3u0) obj5, (m3u0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                Map map = (Map) obj4;
                Float f2 = (Float) obj;
                float floatValue = f2.floatValue();
                Float f3 = (Float) obj2;
                float floatValue2 = f3.floatValue();
                ((jbs) ((wls) obj5).invoke(b.g(f2, map), b.g(f3, map))).getClass();
                return Float.valueOf(cjb1.d(floatValue, floatValue2, 0.5f));
            case 6:
                ((Integer) obj2).getClass();
                lkb1.c((l6x0) obj4, (tls) obj5, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                okb1.a((mdx0) obj4, (f530) obj3, (tls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.common.tariffcell.a.a((String) obj4, (qm4) obj5, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                wkb1.c((u611) obj4, (sls) obj5, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                wkb1.d((u611) obj4, (tls) obj5, (f530) obj3, (fid) obj, vng.O(385));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                rmb1.e((l9e0) obj4, (zii0) obj5, (zii0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                vnb1.a((f530) obj4, (wp2) obj5, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(385));
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                c.i(vng.O(1), (fid) obj, (sls) obj3, (f530) obj5, (String) obj4);
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.communications.ticket.ui.component.b.g((f530) obj4, (f4z0) obj5, (Calendar) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                lpb1.c((v0f) obj4, (sls) obj5, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 16:
                wls wlsVar = (wls) obj4;
                to5 to5Var = x4c.E;
                wls wlsVar2 = (wls) obj5;
                wls wlsVar3 = (wls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    crb1.a(m4m0.b(c530Var, ((ldc) btsVar2.m(k2z.b)).a, qke.q), wlsVar, to5Var, wlsVar2, to5Var, wlsVar3, to5Var, btsVar2, 0, 0);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 17:
                msz0 msz0Var = (msz0) obj4;
                yur yurVar = (yur) obj3;
                tls tlsVar = (tls) obj5;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    erb1.c(msz0Var, null, yurVar, tlsVar, btsVar3, 0);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                erb1.a((psz0) obj4, (f530) obj3, (tls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            case 19:
                pvs0 pvs0Var = (pvs0) obj4;
                wls wlsVar4 = (wls) obj5;
                wts0 wts0Var = (wts0) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    qrb1.b(pvs0Var, wlsVar4, wts0Var.j, btsVar4, 0);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                asb1.b((f530) obj4, (va01) obj5, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                csb1.c((bb01) obj4, (sls) obj5, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.masstransit.trains.search.b.a((nc01) obj4, (tpr) obj3, (tls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                final flq0 flq0Var = (flq0) obj4;
                final tls tlsVar2 = (tls) obj5;
                final bpl0 bpl0Var = (bpl0) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar5.Y();
                } else if (flq0Var instanceof elq0) {
                    btsVar5.e0(-65593416);
                    f530 c = ljs0.c(c530Var, 1.0f);
                    boolean k = btsVar5.k(tlsVar2) | btsVar5.k(bpl0Var);
                    Object Q3 = btsVar5.Q();
                    if (k || Q3 == o430Var) {
                        final int i5 = r7 ? 1 : 0;
                        Q3 = new sls() { // from class: sa11
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i6 = i5;
                                zy11 zy11Var2 = zy11.a;
                                bpl0 bpl0Var2 = bpl0Var;
                                tls tlsVar3 = tlsVar2;
                                switch (i6) {
                                    case 0:
                                        tlsVar3.invoke(new wa11(bpl0Var2.a));
                                        break;
                                    default:
                                        tlsVar3.invoke(new ua11(bpl0Var2.a));
                                        break;
                                }
                                return zy11Var2;
                            }
                        };
                        btsVar5.o0(Q3);
                    }
                    final int i6 = r7 ? 1 : 0;
                    ulb1.a(c, false, null, (sls) Q3, wwg.S(1490846811, true, new zls() { // from class: ta11
                        @Override // defpackage.zls
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i7 = i6;
                            zy11 zy11Var2 = zy11.a;
                            flq0 flq0Var2 = flq0Var;
                            switch (i7) {
                                case 0:
                                    fid fidVar6 = (fid) obj7;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    bts btsVar6 = (bts) fidVar6;
                                    if (!btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                                        btsVar6.Y();
                                        break;
                                    } else {
                                        qgy.b(((elq0) flq0Var2).b, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar6, 0, 0, 16382);
                                        break;
                                    }
                                case 1:
                                    fid fidVar7 = (fid) obj7;
                                    int intValue7 = ((Integer) obj8).intValue();
                                    bts btsVar7 = (bts) fidVar7;
                                    if (!btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                                        btsVar7.Y();
                                        break;
                                    } else {
                                        qgy.b(((elq0) flq0Var2).a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar7, 0, 0, 16382);
                                        break;
                                    }
                                default:
                                    fid fidVar8 = (fid) obj7;
                                    int intValue8 = ((Integer) obj8).intValue();
                                    bts btsVar8 = (bts) fidVar8;
                                    if (!btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                                        btsVar8.Y();
                                        break;
                                    } else {
                                        qgy.b(((dlq0) flq0Var2).a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar8, 0, 0, 16382);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar5), btsVar5, 24582, 6);
                    f530 c2 = ljs0.c(c530Var, 1.0f);
                    boolean k2 = btsVar5.k(tlsVar2) | btsVar5.k(bpl0Var);
                    Object Q4 = btsVar5.Q();
                    if (k2 || Q4 == o430Var) {
                        Q4 = new sls() { // from class: sa11
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i62 = i4;
                                zy11 zy11Var2 = zy11.a;
                                bpl0 bpl0Var2 = bpl0Var;
                                tls tlsVar3 = tlsVar2;
                                switch (i62) {
                                    case 0:
                                        tlsVar3.invoke(new wa11(bpl0Var2.a));
                                        break;
                                    default:
                                        tlsVar3.invoke(new ua11(bpl0Var2.a));
                                        break;
                                }
                                return zy11Var2;
                            }
                        };
                        btsVar5.o0(Q4);
                    }
                    ohb1.b(c2, false, null, (sls) Q4, wwg.S(-217810423, true, new zls() { // from class: ta11
                        @Override // defpackage.zls
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i7 = i4;
                            zy11 zy11Var2 = zy11.a;
                            flq0 flq0Var2 = flq0Var;
                            switch (i7) {
                                case 0:
                                    fid fidVar6 = (fid) obj7;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    bts btsVar6 = (bts) fidVar6;
                                    if (!btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                                        btsVar6.Y();
                                        break;
                                    } else {
                                        qgy.b(((elq0) flq0Var2).b, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar6, 0, 0, 16382);
                                        break;
                                    }
                                case 1:
                                    fid fidVar7 = (fid) obj7;
                                    int intValue7 = ((Integer) obj8).intValue();
                                    bts btsVar7 = (bts) fidVar7;
                                    if (!btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                                        btsVar7.Y();
                                        break;
                                    } else {
                                        qgy.b(((elq0) flq0Var2).a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar7, 0, 0, 16382);
                                        break;
                                    }
                                default:
                                    fid fidVar8 = (fid) obj7;
                                    int intValue8 = ((Integer) obj8).intValue();
                                    bts btsVar8 = (bts) fidVar8;
                                    if (!btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                                        btsVar8.Y();
                                        break;
                                    } else {
                                        qgy.b(((dlq0) flq0Var2).a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar8, 0, 0, 16382);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar5), btsVar5, 24582, 6);
                    btsVar5.t(false);
                } else {
                    if (!(flq0Var instanceof dlq0)) {
                        throw unr0.y(-1387591219, btsVar5, false);
                    }
                    btsVar5.e0(-65113009);
                    f530 c3 = ljs0.c(c530Var, 1.0f);
                    Object Q5 = btsVar5.Q();
                    if (Q5 == o430Var) {
                        Q5 = new bgc(12);
                        btsVar5.o0(Q5);
                    }
                    ulb1.a(c3, false, null, (sls) Q5, wwg.S(-1051197870, true, new zls() { // from class: ta11
                        @Override // defpackage.zls
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i7 = i3;
                            zy11 zy11Var2 = zy11.a;
                            flq0 flq0Var2 = flq0Var;
                            switch (i7) {
                                case 0:
                                    fid fidVar6 = (fid) obj7;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    bts btsVar6 = (bts) fidVar6;
                                    if (!btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                                        btsVar6.Y();
                                        break;
                                    } else {
                                        qgy.b(((elq0) flq0Var2).b, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar6, 0, 0, 16382);
                                        break;
                                    }
                                case 1:
                                    fid fidVar7 = (fid) obj7;
                                    int intValue7 = ((Integer) obj8).intValue();
                                    bts btsVar7 = (bts) fidVar7;
                                    if (!btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                                        btsVar7.Y();
                                        break;
                                    } else {
                                        qgy.b(((elq0) flq0Var2).a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar7, 0, 0, 16382);
                                        break;
                                    }
                                default:
                                    fid fidVar8 = (fid) obj7;
                                    int intValue8 = ((Integer) obj8).intValue();
                                    bts btsVar8 = (bts) fidVar8;
                                    if (!btsVar8.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                                        btsVar8.Y();
                                        break;
                                    } else {
                                        qgy.b(((dlq0) flq0Var2).a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar8, 0, 0, 16382);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar5), btsVar5, 27654, 6);
                    btsVar5.t(false);
                }
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                a8a1.i((vzu) obj4, (tls) obj5, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                a8a1.g((f530) obj4, (kt60) obj5, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.common.selector.a.a((vj31) obj4, (f530) obj3, (tls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.common.selector.a.e((wj31) obj4, (f530) obj3, (tls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            case 28:
                o9z0 o9z0Var = (o9z0) obj4;
                sls slsVar2 = (sls) obj3;
                tls tlsVar3 = (tls) obj5;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    f530 k3 = an91.k(c530Var, 8.0f);
                    lhl0 a2 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar6, 6);
                    int hashCode = Long.hashCode(btsVar6.T);
                    r1b0 o = btsVar6.o();
                    f530 d = androidx.compose.ui.b.d(btsVar6, k3);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar3);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, a2);
                    qje.W(btsVar6, d.e, o);
                    wls wlsVar5 = d.g;
                    if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar6, hashCode, wlsVar5);
                    }
                    qje.W(btsVar6, d.d, d);
                    zaz0 zaz0Var = o9z0Var.e;
                    if (zaz0Var == null) {
                        btsVar6.e0(-1967154997);
                        btsVar6.t(false);
                        f = Float.MAX_VALUE;
                    } else {
                        btsVar6.e0(-1967154996);
                        if (1.0f <= 0.0d) {
                            gxv.a("invalid weight; must be greater than zero");
                        }
                        f530 e2 = ljs0.e(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 56.0f);
                        byk0 b = ((YandexShapes) btsVar6.m(qm51.a)).b();
                        long g = ((el51) btsVar6.m(gl51.a)).g();
                        boolean k4 = btsVar6.k(tlsVar3) | btsVar6.k(zaz0Var);
                        f = Float.MAX_VALUE;
                        Object Q6 = btsVar6.Q();
                        if (k4 || Q6 == o430Var) {
                            Q6 = new hh31(i3, tlsVar3, zaz0Var);
                            btsVar6.o0(Q6);
                        }
                        ru.yandex.taxi.logistics.sdk.ui.component.control.a.a((sls) Q6, e2, b, g, 0L, null, false, null, null, null, wwg.S(-616615366, true, new jvx0(25, zaz0Var), btsVar6), btsVar6, 0, 4080);
                        btsVar6.t(false);
                    }
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    f530 e3 = ljs0.e(new x2y(1.0f > f ? f : 1.0f, true), 56.0f);
                    byk0 b2 = ((YandexShapes) btsVar6.m(qm51.a)).b();
                    long f4 = ((el51) btsVar6.m(gl51.a)).f();
                    boolean k5 = btsVar6.k(slsVar2);
                    Object Q7 = btsVar6.Q();
                    if (k5 || Q7 == o430Var) {
                        Q7 = new n7l0(22, slsVar2);
                        btsVar6.o0(Q7);
                    }
                    ru.yandex.taxi.logistics.sdk.ui.component.control.a.a((sls) Q7, e3, b2, f4, 0L, null, false, null, null, null, wwg.S(-2112883242, true, new jvx0(26, o9z0Var), btsVar6), btsVar6, 0, 4080);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            default:
                tls tlsVar4 = (tls) obj5;
                e541 e541Var = (e541) obj4;
                tls tlsVar5 = (tls) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    wg6 a3 = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, sb2.K(300, 0, ubn.a, 2), false, null, null, null, null, btsVar7, 48, 0, 8157);
                    lg6 c4 = qab1.c(a3, new up2(ldc.l), null, btsVar7, 432, 0);
                    androidx.compose.runtime.internal.a S = wwg.S(-1832805830, true, new ays0(i2, tlsVar4, e541Var), btsVar7);
                    nfd.a.getClass();
                    com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a3, c4, false, false, null, null, S, null, nfd.b, null, wwg.S(-1899795508, true, new dhj0(tlsVar5, (Object) e541Var, (Object) tlsVar4, 21), btsVar7), btsVar7, 817889280, 48, 1401);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ nvs0(int i, cms cmsVar, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = cmsVar;
        this.w = obj2;
    }

    public /* synthetic */ nvs0(wls wlsVar, wls wlsVar2, wls wlsVar3) {
        this.a = 16;
        this.b = wlsVar;
        this.c = wlsVar2;
        this.w = wlsVar3;
    }

    public /* synthetic */ nvs0(Object obj, Object obj2, tls tlsVar, int i) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.c = tlsVar;
    }

    public /* synthetic */ nvs0(Object obj, Object obj2, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.w = obj2;
        this.c = tlsVar;
    }

    public /* synthetic */ nvs0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
