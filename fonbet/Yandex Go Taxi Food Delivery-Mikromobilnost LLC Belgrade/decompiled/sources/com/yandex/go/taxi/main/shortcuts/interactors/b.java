package com.yandex.go.taxi.main.shortcuts.interactors;

import android.net.Uri;
import com.yandex.go.clarify_address.before_order.ClarifyAddressBeforeOrderOrigin;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a60;
import defpackage.a680;
import defpackage.a7t0;
import defpackage.arv0;
import defpackage.awr0;
import defpackage.b680;
import defpackage.bwr0;
import defpackage.c4r0;
import defpackage.ck31;
import defpackage.dai;
import defpackage.dxr0;
import defpackage.g18;
import defpackage.g8e;
import defpackage.gxr0;
import defpackage.hc00;
import defpackage.hwe0;
import defpackage.hxx;
import defpackage.i130;
import defpackage.i270;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.jst;
import defpackage.k9s0;
import defpackage.kc00;
import defpackage.lwr0;
import defpackage.m950;
import defpackage.mlp0;
import defpackage.mpc;
import defpackage.mwr0;
import defpackage.mxb;
import defpackage.nwr0;
import defpackage.nxr0;
import defpackage.o7r;
import defpackage.o820;
import defpackage.oep0;
import defpackage.opc;
import defpackage.owr0;
import defpackage.oxr0;
import defpackage.p4i;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.pwr0;
import defpackage.pxr0;
import defpackage.pzr0;
import defpackage.pzt0;
import defpackage.qa0;
import defpackage.qwr0;
import defpackage.qxr0;
import defpackage.r0s0;
import defpackage.r330;
import defpackage.rsi;
import defpackage.rwr0;
import defpackage.s9g;
import defpackage.t4l0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvn0;
import defpackage.v770;
import defpackage.w0b1;
import defpackage.x7k0;
import defpackage.y50;
import defpackage.y700;
import defpackage.yb00;
import defpackage.yqv0;
import defpackage.yvf0;
import defpackage.yyr0;
import defpackage.za31;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import ru.yandex.taxi.sdc.router.e;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class b implements pzr0 {
    public final tse a;
    public final i130 b;
    public final y50 c;
    public final hwe0 d;
    public final c4r0 e;
    public final ru.yandex.taxi.preorder.source.domain.a f;
    public final arv0 g;
    public final yb00 h;
    public final c i;
    public final ck31 j;
    public final i270 k;
    public final o7r l;
    public final yvf0 m;
    public final e n;
    public final mpc o;
    public final jc00 p;
    public final mxb q;
    public final oep0 r;
    public final r0s0 s;
    public final t4l0 t;
    public final x7k0 u;

    public b(tse tseVar, i130 i130Var, y50 y50Var, hwe0 hwe0Var, c4r0 c4r0Var, ru.yandex.taxi.preorder.source.domain.a aVar, arv0 arv0Var, yb00 yb00Var, c cVar, ck31 ck31Var, i270 i270Var, o7r o7rVar, yvf0 yvf0Var, e eVar, mpc mpcVar, jc00 jc00Var, mxb mxbVar, oep0 oep0Var, r0s0 r0s0Var, t4l0 t4l0Var, x7k0 x7k0Var, s9g s9gVar) {
        this.a = tseVar;
        this.b = i130Var;
        this.c = y50Var;
        this.d = hwe0Var;
        this.e = c4r0Var;
        this.f = aVar;
        this.g = arv0Var;
        this.h = yb00Var;
        this.i = cVar;
        this.j = ck31Var;
        this.k = i270Var;
        this.l = o7rVar;
        this.m = yvf0Var;
        this.n = eVar;
        this.o = mpcVar;
        this.p = jc00Var;
        this.q = mxbVar;
        this.r = oep0Var;
        this.s = r0s0Var;
        this.t = t4l0Var;
        this.u = x7k0Var;
    }

    @Override // defpackage.pzr0
    public final String a() {
        ic00 ic00Var = ((kc00) this.p).a;
        ic00Var.getClass();
        return ic00Var instanceof hc00 ? "taxi_main" : "pickup_location";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    @Override // defpackage.pzr0, defpackage.rxr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g18 b(qxr0 qxr0Var) {
        Integer valueOf;
        boolean z = qxr0Var instanceof qwr0;
        x7k0 x7k0Var = this.u;
        if (z) {
            qwr0 qwr0Var = (qwr0) qxr0Var;
            Action$TaxiExpectedDestination action$TaxiExpectedDestination = qwr0Var.a;
            o820 o820Var = qwr0Var.b;
            Runnable runnable = qwr0Var.w;
            Consumer consumer = qwr0Var.x;
            x7k0Var.a.getClass();
            return new rsi(tje.N(this.a, null, null, new ShortcutRootRouter$openExpectedDestination$job$1(this, action$TaxiExpectedDestination, o820Var, consumer, runnable, null), 3), 2);
        }
        boolean z2 = qxr0Var instanceof awr0;
        ru.yandex.taxi.preorder.source.domain.a aVar = this.f;
        if (z2) {
            awr0 awr0Var = (awr0) qxr0Var;
            final SummaryRedirectActionModel summaryRedirectActionModel = awr0Var.a;
            final yyr0 yyr0Var = awr0Var.b;
            final Runnable runnable2 = awr0Var.c;
            this.d.a(summaryRedirectActionModel.b, summaryRedirectActionModel.a);
            final AtomicReference atomicReference = new AtomicReference(null);
            aVar.e(new Consumer() { // from class: com.yandex.go.taxi.main.shortcuts.interactors.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    b bVar = b.this;
                    i270 i270Var = bVar.k;
                    SummaryRedirectActionModel summaryRedirectActionModel2 = summaryRedirectActionModel;
                    i270Var.a(summaryRedirectActionModel2.f);
                    pzt0 g = com.yandex.go.coroutines.b.g(bVar.a, null, null, new ShortcutRootRouter$handleHeaderSummaryRedirect$1$job$1(bVar, summaryRedirectActionModel2, yyr0Var, null), 3);
                    g.w(new b680(1, runnable2));
                    atomicReference.set(g);
                }
            });
            return new a680(atomicReference, 2);
        }
        boolean z3 = qxr0Var instanceof mwr0;
        dai daiVar = g18.u1;
        if (z3) {
            String str = ((mwr0) qxr0Var).a;
            y700 d = d();
            if (d != null) {
                d.collapse();
            }
            Uri parse = Uri.parse(str);
            if (!parse.isOpaque()) {
                this.t.getClass();
                if (t4l0.a(parse)) {
                    String queryParameter = parse.getQueryParameter("level");
                    if (queryParameter != null) {
                        try {
                            valueOf = Integer.valueOf(Integer.parseInt(queryParameter));
                        } catch (NumberFormatException unused) {
                        }
                        if (valueOf != null) {
                            int intValue = valueOf.intValue();
                            List list = ((k) this.j).j().a;
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                linkedHashSet.addAll(((za31) it.next()).b);
                            }
                            this.l.getClass();
                            pex0 a = o7r.a(intValue, linkedHashSet);
                            if (a != null) {
                                this.e.c(SelectionOrigin.ACTION, a, false);
                            }
                            this.h.b(k9s0.f);
                            jst.e.a(15, "DEEPLINK:ERROR", null, g8e.o("Deeplink not route. Deeplink = ", str));
                        }
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                }
            }
            ((a60) this.c).c(str, v770.j);
        } else {
            boolean z4 = qxr0Var instanceof gxr0;
            mpc mpcVar = this.o;
            if (z4) {
                gxr0 gxr0Var = (gxr0) qxr0Var;
                ((opc) mpcVar).e(gxr0Var.a, true, gxr0Var.b);
                return daiVar;
            }
            boolean z5 = qxr0Var instanceof nxr0;
            arv0 arv0Var = this.g;
            if (z5) {
                x7k0Var.a.getClass();
                ((a7t0) arv0Var).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
                aVar.e(new qa0(28, this));
                return daiVar;
            }
            if (qxr0Var instanceof owr0) {
                owr0 owr0Var = (owr0) qxr0Var;
                ((opc) mpcVar).b(owr0Var.a, owr0Var.b);
                return daiVar;
            }
            if (qxr0Var instanceof dxr0) {
                opc opcVar = (opc) mpcVar;
                ((pep0) opcVar.f).f((m950) opcVar.c.get(), new tvn0(w0b1.c()), hxx.a);
                return daiVar;
            }
            if (qxr0Var instanceof lwr0) {
                ((opc) mpcVar).a(((lwr0) qxr0Var).a);
                return daiVar;
            }
            if (qxr0Var instanceof rwr0) {
                ((opc) mpcVar).d(((rwr0) qxr0Var).a);
                return daiVar;
            }
            if (!(qxr0Var instanceof pxr0)) {
                if (qxr0Var instanceof pwr0) {
                    ((opc) mpcVar).c();
                    return daiVar;
                }
                if (qxr0Var instanceof bwr0) {
                    opc opcVar2 = (opc) mpcVar;
                    ((pep0) opcVar2.f).f((m950) opcVar2.g.get(), ((bwr0) qxr0Var).a, hxx.a);
                    return daiVar;
                }
                if (qxr0Var instanceof nwr0) {
                    y700 d2 = d();
                    if (d2 != null) {
                        d2.collapse();
                    }
                    ((pep0) this.r).f((m950) this.m.get(), p4i.b, hxx.a);
                    return daiVar;
                }
                if (!(qxr0Var instanceof oxr0)) {
                    super.b(qxr0Var);
                    return daiVar;
                }
                oxr0 oxr0Var = (oxr0) qxr0Var;
                this.n.c(oxr0Var.a, oxr0Var.b, mlp0.a(oxr0Var.c), null);
                return daiVar;
            }
            this.q.a(ClarifyAddressBeforeOrderOrigin.TAXI_NEXT_CHEVRON);
            ((a7t0) arv0Var).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
            y700 d3 = d();
            if (d3 != null) {
                d3.proceed();
            }
        }
        return daiVar;
    }

    @Override // defpackage.pzr0
    public final r330 c() {
        return d();
    }

    @Override // defpackage.pzr0
    public final y700 d() {
        return (y700) this.b.a().i(ShortcutsModalView.class);
    }
}
