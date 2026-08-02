package com.yandex.go.due_timetable.presentation;

import com.yandex.go.due.api.analytics.model.DueAnalyticOrigin;
import com.yandex.go.due.api.analytics.model.DueAnalyticViewType;
import com.yandex.go.due_timetable.presentation.g;
import com.yandex.go.taxi.tariffs.interactor.r;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.a0n;
import defpackage.ad5;
import defpackage.b0n;
import defpackage.b580;
import defpackage.b8z0;
import defpackage.bvf0;
import defpackage.c0n;
import defpackage.c8z0;
import defpackage.cus0;
import defpackage.cvm;
import defpackage.d0n;
import defpackage.d1n;
import defpackage.d8z0;
import defpackage.dvm;
import defpackage.e1n;
import defpackage.e8z0;
import defpackage.ej1;
import defpackage.f1n;
import defpackage.ffx;
import defpackage.g1n;
import defpackage.gne0;
import defpackage.gym;
import defpackage.hz91;
import defpackage.izm;
import defpackage.j0n;
import defpackage.l0n;
import defpackage.l8x;
import defpackage.n1n;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q0n;
import defpackage.qnm0;
import defpackage.qu;
import defpackage.r0n;
import defpackage.rsg;
import defpackage.rzm;
import defpackage.t8j;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tt2;
import defpackage.tym;
import defpackage.tzm;
import defpackage.uyj;
import defpackage.uym;
import defpackage.uze0;
import defpackage.vym;
import defpackage.w511;
import defpackage.wjm;
import defpackage.wym;
import defpackage.x4e;
import defpackage.x770;
import defpackage.xy40;
import defpackage.xzm;
import defpackage.ye0;
import defpackage.yym;
import defpackage.yzm;
import defpackage.zym;
import defpackage.zzm;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class g extends ad5 {
    public final hz91 A;
    public final izm B;
    public final tt2 C;
    public final com.yandex.go.due_timetable.domain.interactor.a D;
    public final zym E;
    public final q0n F;
    public final r0n G;
    public final ru.yandex.taxi.design.utils.b H;
    public final pwy0 I;
    public final l0n J;
    public final com.yandex.go.due_timetable.domain.interactor.b K;
    public final j0n L;
    public final dvm M;
    public final yym N;
    public final n1n O;
    public final uze0 P;
    public final r Q;
    public final com.yandex.go.due_timetable.domain.interactor.impl.a R;
    public final n0 S;
    public final r0 T;
    public pzt0 U;
    public final String x;
    public final g1n y;
    public final gym z;

    public g(String str, g1n g1nVar, gym gymVar, hz91 hz91Var, izm izmVar, tt2 tt2Var, com.yandex.go.due_timetable.domain.interactor.a aVar, zym zymVar, q0n q0nVar, r0n r0nVar, ru.yandex.taxi.design.utils.b bVar, pwy0 pwy0Var, l0n l0nVar, com.yandex.go.due_timetable.domain.interactor.b bVar2, j0n j0nVar, dvm dvmVar, yym yymVar, n1n n1nVar, uze0 uze0Var, r rVar, com.yandex.go.due_timetable.domain.interactor.impl.a aVar2) {
        super(d1n.class);
        this.x = str;
        this.y = g1nVar;
        this.z = gymVar;
        this.A = hz91Var;
        this.B = izmVar;
        this.C = tt2Var;
        this.D = aVar;
        this.E = zymVar;
        this.F = q0nVar;
        this.G = r0nVar;
        this.H = bVar;
        this.I = pwy0Var;
        this.J = l0nVar;
        this.K = bVar2;
        this.L = j0nVar;
        this.M = dvmVar;
        this.N = yymVar;
        this.O = n1nVar;
        this.P = uze0Var;
        this.Q = rVar;
        this.R = aVar2;
        this.S = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.T = bvf0.c(Boolean.FALSE);
    }

    public static final void Kg(g gVar, qnm0 qnm0Var, gne0 gne0Var) {
        gVar.getClass();
        if (!qnm0Var.a()) {
            gVar.Ng(rzm.a);
            return;
        }
        gVar.Ng(new tzm(qnm0Var, gne0Var, gVar.N.a(gVar.y)));
        cus0 cus0Var = gVar.J.a().d;
        if (cus0Var != null) {
            gVar.Mg(Integer.valueOf((int) (cus0Var.a >> 32)));
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        pzt0 pzt0Var = this.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        com.yandex.go.due_timetable.domain.interactor.b bVar = this.K;
        ConcurrentHashMap concurrentHashMap = bVar.d;
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        concurrentHashMap.clear();
        bvf0.j(bVar.c, null);
        this.M.b(this.x, DueAnalyticViewType.TIMETABLE);
        super.Cg();
    }

    public final void Lg(d0n d0nVar) {
        Ng(d0nVar);
        if (d0nVar instanceof yzm) {
            Mg(Integer.valueOf(((yzm) d0nVar).a));
            return;
        }
        boolean z = d0nVar instanceof b0n;
        l0n l0nVar = this.J;
        if (z) {
            e8z0 c = l0nVar.a().c();
            if (c != null) {
                this.S.g(c);
                return;
            }
            return;
        }
        boolean z2 = d0nVar instanceof xzm;
        int i = 9;
        gym gymVar = this.z;
        if (!z2) {
            if (d0nVar instanceof zzm) {
                pzt0 pzt0Var = this.U;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.U = tje.N(Jg(), null, null, new DueTimetablePresenter$loadAvailability$1(this, null, null), 3);
                return;
            }
            if (d0nVar instanceof a0n) {
                Mg(null);
                return;
            } else {
                if (d0nVar instanceof c0n) {
                    ((ej1) gymVar.a).r(new qu(i));
                    return;
                }
                return;
            }
        }
        final int i2 = 0;
        tls tlsVar = new tls(this) { // from class: i1n
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        zym zymVar = gVar.E;
                        zymVar.getClass();
                        bus0 bus0Var = ((c8z0) obj).a;
                        zts0 zts0Var = bus0Var instanceof zts0 ? (zts0) bus0Var : null;
                        zymVar.f.a.R = zts0Var != null ? zts0Var.a : null;
                        zymVar.b.b(true);
                        zymVar.a.a(msb1.F);
                        zymVar.a(true);
                        break;
                    default:
                        b8z0 b8z0Var = (b8z0) obj;
                        zym zymVar2 = gVar.E;
                        zymVar2.getClass();
                        bus0 bus0Var2 = b8z0Var.a;
                        zts0 zts0Var2 = bus0Var2 instanceof zts0 ? (zts0) bus0Var2 : null;
                        zymVar2.f.a.R = zts0Var2 != null ? zts0Var2.a : null;
                        g0n a = zymVar2.c.a();
                        String str = a.m;
                        Integer num = a.i;
                        if (str != null) {
                            zymVar2.a.a(new xwm(b8z0Var.b, str, num));
                            b580 b = ((jbn) zymVar2.h).b();
                            if (b != null) {
                                if (!b8z0Var.e) {
                                    w3r0.b(zymVar2.g, a.j0(zymVar2.f.a.x, b), null, null, null, 14);
                                } else if (!zymVar2.f.a.x.contains(b)) {
                                    w3r0.b(zymVar2.g, a.o0(zymVar2.f.a.x, b), null, null, null, 14);
                                }
                            }
                            zymVar2.b.b(false);
                            zymVar2.a(false);
                        } else {
                            jst.e.x(new IllegalStateException("No scheduledOrderId"), "Try to set due without scheduledOrderId");
                        }
                        break;
                }
                return zy11.a;
            }
        };
        final int i3 = 1;
        tls tlsVar2 = new tls(this) { // from class: i1n
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i32 = i3;
                g gVar = this.b;
                switch (i32) {
                    case 0:
                        zym zymVar = gVar.E;
                        zymVar.getClass();
                        bus0 bus0Var = ((c8z0) obj).a;
                        zts0 zts0Var = bus0Var instanceof zts0 ? (zts0) bus0Var : null;
                        zymVar.f.a.R = zts0Var != null ? zts0Var.a : null;
                        zymVar.b.b(true);
                        zymVar.a.a(msb1.F);
                        zymVar.a(true);
                        break;
                    default:
                        b8z0 b8z0Var = (b8z0) obj;
                        zym zymVar2 = gVar.E;
                        zymVar2.getClass();
                        bus0 bus0Var2 = b8z0Var.a;
                        zts0 zts0Var2 = bus0Var2 instanceof zts0 ? (zts0) bus0Var2 : null;
                        zymVar2.f.a.R = zts0Var2 != null ? zts0Var2.a : null;
                        g0n a = zymVar2.c.a();
                        String str = a.m;
                        Integer num = a.i;
                        if (str != null) {
                            zymVar2.a.a(new xwm(b8z0Var.b, str, num));
                            b580 b = ((jbn) zymVar2.h).b();
                            if (b != null) {
                                if (!b8z0Var.e) {
                                    w3r0.b(zymVar2.g, a.j0(zymVar2.f.a.x, b), null, null, null, 14);
                                } else if (!zymVar2.f.a.x.contains(b)) {
                                    w3r0.b(zymVar2.g, a.o0(zymVar2.f.a.x, b), null, null, null, 14);
                                }
                            }
                            zymVar2.b.b(false);
                            zymVar2.a(false);
                        } else {
                            jst.e.x(new IllegalStateException("No scheduledOrderId"), "Try to set due without scheduledOrderId");
                        }
                        break;
                }
                return zy11.a;
            }
        };
        e8z0 c2 = l0nVar.a().c();
        if (c2 instanceof c8z0) {
            tlsVar.invoke(c2);
        } else if (c2 instanceof b8z0) {
            tlsVar2.invoke(c2);
        } else if (!(c2 instanceof d8z0) && c2 != null) {
            w511.b();
        }
        wym a = this.N.a(this.y);
        if (a instanceof vym) {
            Og(cvm.c);
            vym vymVar = (vym) a;
            ((ej1) gymVar.a).r(new defpackage.r(vymVar.a, vymVar.b, 13));
            return;
        }
        if (a instanceof uym) {
            tse Jg = Jg();
            this.C.getClass();
            tje.N(Jg, uyj.a, null, new DueTimetablePresenter$confirmOrder$1(this, null), 2);
        } else if (!(a instanceof tym)) {
            w511.b();
        } else {
            Og(cvm.w);
            ((ej1) gymVar.a).r(new qu(i));
        }
    }

    public final void Mg(Integer num) {
        int intValue;
        xy40 xy40Var;
        int i;
        boolean z;
        l0n l0nVar = this.J;
        if (num != null) {
            intValue = num.intValue();
        } else {
            cus0 cus0Var = l0nVar.a().d;
            Integer valueOf = cus0Var != null ? Integer.valueOf((int) (cus0Var.a >> 32)) : null;
            if (valueOf == null) {
                ny61.g("Required value was null.");
                return;
            }
            intValue = valueOf.intValue();
        }
        rsg b = l0nVar.a().b();
        if (b != null) {
            b580 b580Var = null;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                xy40Var = b.c;
                i = xy40Var.b;
                if (i2 >= i || b580Var != null) {
                    break;
                }
                e8z0 e8z0Var = (e8z0) xy40Var.b(i2);
                if (e8z0Var instanceof b8z0) {
                    wjm wjmVar = ((b8z0) e8z0Var).c;
                    b580Var = wjmVar != null ? (b580) wjmVar.b : null;
                    z2 = true;
                }
                i2++;
            }
            if (z2) {
                Object[] objArr = xy40Var.a;
                int i3 = 0;
                while (true) {
                    if (i3 >= i) {
                        z = false;
                        break;
                    } else {
                        if (((e8z0) objArr[i3]) instanceof c8z0) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                }
                this.K.d(b, z || !(l0nVar.a().g != null), b580Var, this.y instanceof e1n);
            }
        }
        DueAnalyticViewType dueAnalyticViewType = DueAnalyticViewType.TIMETABLE;
        dvm dvmVar = this.M;
        x770 x770Var = dvmVar.b;
        String value = dueAnalyticViewType.getValue();
        pex0 m = ((k) dvmVar.a).m();
        String str = m != null ? m.b : null;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        }
        hashMap.put("view_type", value);
        hashMap.put("days_from_today", Integer.valueOf(intValue));
        x770Var.a.a("Preorder.DaySelected", hashMap, 1, new HashMap());
    }

    public final void Ng(d0n d0nVar) {
        Object value;
        t8j t8jVar = new t8j(14, this, d0nVar);
        r0 r0Var = this.J.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, t8jVar.invoke(value)));
    }

    public final void Og(ye0 ye0Var) {
        e8z0 c = this.J.a().c();
        boolean z = c instanceof c8z0;
        DueAnalyticOrigin dueAnalyticOrigin = null;
        dvm dvmVar = this.M;
        if (z) {
            DueAnalyticViewType dueAnalyticViewType = DueAnalyticViewType.TIMETABLE;
            x770 x770Var = dvmVar.b;
            String str = ye0Var.a;
            String value = dueAnalyticViewType.getValue();
            pex0 m = ((k) dvmVar.a).m();
            String str2 = m != null ? m.b : null;
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
            }
            x770Var.a.a("Preorder.DropToOnDemandButtonTapped", hashMap, 1, x4e.q(hashMap, "action", str, "view_type", value));
            return;
        }
        if (!(c instanceof b8z0)) {
            if ((c instanceof d8z0) || c == null) {
                return;
            }
            w511.b();
            return;
        }
        DueAnalyticViewType dueAnalyticViewType2 = DueAnalyticViewType.TIMETABLE;
        Calendar calendar = ((b8z0) c).b;
        g1n g1nVar = this.y;
        if (g1nVar instanceof f1n) {
            dueAnalyticOrigin = DueAnalyticOrigin.SUMMARY;
        } else if (g1nVar instanceof e1n) {
            dueAnalyticOrigin = DueAnalyticOrigin.INTERCITY_DASHBOARD;
        } else {
            w511.b();
        }
        dvmVar.a(this.x, dueAnalyticViewType2, calendar, ye0Var, dueAnalyticOrigin);
    }
}
