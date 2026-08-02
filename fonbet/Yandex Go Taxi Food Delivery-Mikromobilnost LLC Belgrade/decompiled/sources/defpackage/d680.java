package defpackage;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.multi.shortcuts.f;
import com.yandex.go.taxi.order.view.l;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.b680;
import defpackage.d680;
import defpackage.f9x;
import defpackage.l8x;
import defpackage.tje;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.sequences.b;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.preorder.source.domain.a;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class d680 implements pzr0 {
    public final y50 a;
    public final l b;
    public final yvf0 c;
    public final n1s0 d;
    public final a e;
    public final f f;
    public final sm40 g;
    public final oh70 h;
    public final oh70 i;
    public final ck31 j;
    public final hwe0 k;
    public final c4r0 l;
    public final mpc m;
    public final h3y n;
    public final i270 o;
    public final o7r p;
    public final t4l0 q;
    public final yvf0 r;
    public final jjv0 s;
    public final ru.yandex.taxi.shortcuts.interactors.a t;
    public final tse u;
    public final oep0 v;
    public final s8x w = new s8x(null);
    public final a3y0 x = new a3y0(TaxiOrderLogGroup.NAVIGATION.getTag(), "OrderShortcutInternalRouter");

    public d680(y50 y50Var, l lVar, yvf0 yvf0Var, n1s0 n1s0Var, a aVar, f fVar, sm40 sm40Var, oh70 oh70Var, oh70 oh70Var2, ck31 ck31Var, hwe0 hwe0Var, c4r0 c4r0Var, mpc mpcVar, h3y h3yVar, i270 i270Var, o7r o7rVar, t4l0 t4l0Var, yvf0 yvf0Var2, jjv0 jjv0Var, ru.yandex.taxi.shortcuts.interactors.a aVar2, tse tseVar, oep0 oep0Var) {
        this.a = y50Var;
        this.b = lVar;
        this.c = yvf0Var;
        this.d = n1s0Var;
        this.e = aVar;
        this.f = fVar;
        this.g = sm40Var;
        this.h = oh70Var;
        this.i = oh70Var2;
        this.j = ck31Var;
        this.k = hwe0Var;
        this.l = c4r0Var;
        this.m = mpcVar;
        this.n = h3yVar;
        this.o = i270Var;
        this.p = o7rVar;
        this.q = t4l0Var;
        this.r = yvf0Var2;
        this.s = jjv0Var;
        this.t = aVar2;
        this.u = tseVar;
        this.v = oep0Var;
    }

    @Override // defpackage.pzr0
    public final String a() {
        return "multiorder";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    @Override // defpackage.pzr0, defpackage.rxr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g18 b(qxr0 qxr0Var) {
        Integer valueOf;
        boolean z = qxr0Var instanceof mwr0;
        zy11 zy11Var = zy11.a;
        l lVar = this.b;
        dai daiVar = g18.u1;
        if (z) {
            String str = ((mwr0) qxr0Var).a;
            lVar.k.g(zy11Var);
            Uri parse = Uri.parse(str);
            if (!parse.isOpaque()) {
                this.q.getClass();
                if (t4l0.a(parse)) {
                    String queryParameter = parse.getQueryParameter("level");
                    if (queryParameter != null) {
                        try {
                            valueOf = Integer.valueOf(Integer.parseInt(queryParameter));
                        } catch (NumberFormatException unused) {
                        }
                        if (valueOf != null) {
                            int intValue = valueOf.intValue();
                            List s = b.s(eja1.d("", ((k) this.j).j().a));
                            this.p.getClass();
                            pex0 a = o7r.a(intValue, s);
                            if (a != null) {
                                this.l.c(SelectionOrigin.ACTION, a, false);
                            }
                            this.f.b(k9s0.f, null, false);
                            return daiVar;
                        }
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                }
            }
            MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2 = MultiTransportChooseStationCardAnalytics$OpenReasonV2.ShortcutsOrder;
            Uri parse2 = Uri.parse(str);
            m000 c = parse2 != null ? lhb1.c(parse2, multiTransportChooseStationCardAnalytics$OpenReasonV2) : null;
            v770 v770Var = v770.j;
            y50 y50Var = this.a;
            if (c == null) {
                ((a60) y50Var).c(str, v770Var);
            } else {
                MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV22 = c.d;
                Uri parse3 = Uri.parse(str);
                if (parse3 != null) {
                    lhb1.c(parse3, multiTransportChooseStationCardAnalytics$OpenReasonV22);
                    if (parse3.getQueryParameter("open_reason") != null) {
                        jst.e.getClass();
                    } else {
                        parse3 = parse3.buildUpon().appendQueryParameter("open_reason", multiTransportChooseStationCardAnalytics$OpenReasonV22.getEventValue()).build();
                    }
                    str = parse3.toString();
                }
                ((a60) y50Var).c(str, v770Var);
            }
            return daiVar;
        }
        boolean z2 = qxr0Var instanceof gxr0;
        mpc mpcVar = this.m;
        if (z2) {
            gxr0 gxr0Var = (gxr0) qxr0Var;
            ((opc) mpcVar).e(gxr0Var.a, false, gxr0Var.b);
            return daiVar;
        }
        boolean z3 = qxr0Var instanceof nxr0;
        oep0 oep0Var = this.v;
        yvf0 yvf0Var = this.c;
        sm40 sm40Var = this.g;
        if (z3) {
            if (sm40Var.b()) {
                this.h.b(SourcePicker.B_FROM_ORDER, PointType.DESTINATION);
                return daiVar;
            }
            ((pep0) oep0Var).f((m950) yvf0Var.get(), new qre0(new vpe0(new Preorder(0))), hxx.a);
            return daiVar;
        }
        boolean z4 = qxr0Var instanceof qwr0;
        a aVar = this.e;
        if (z4) {
            qwr0 qwr0Var = (qwr0) qxr0Var;
            final Action$TaxiExpectedDestination action$TaxiExpectedDestination = qwr0Var.a;
            final o820 o820Var = qwr0Var.b;
            final Runnable runnable = qwr0Var.c;
            final Runnable runnable2 = qwr0Var.w;
            final Consumer consumer = qwr0Var.x;
            final AtomicReference atomicReference = new AtomicReference(null);
            aVar.e(new Consumer() { // from class: com.yandex.go.taxi.order.multi.shortcuts.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    runnable.run();
                    d680 d680Var = this;
                    atomicReference.set(tje.N(d680Var.u, null, null, new OrderShortcutInternalRouter$openExpectedDestination$1$job$1(d680Var, action$TaxiExpectedDestination, o820Var, consumer, runnable2, null), 3));
                }
            });
            return new a680(atomicReference, 0);
        }
        if (qxr0Var instanceof awr0) {
            awr0 awr0Var = (awr0) qxr0Var;
            final SummaryRedirectActionModel summaryRedirectActionModel = awr0Var.a;
            final yyr0 yyr0Var = awr0Var.b;
            final Runnable runnable3 = awr0Var.c;
            this.k.a(summaryRedirectActionModel.b, summaryRedirectActionModel.a);
            final AtomicReference atomicReference2 = new AtomicReference(null);
            aVar.e(new Consumer() { // from class: com.yandex.go.taxi.order.multi.shortcuts.b
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    l8x N;
                    SummaryRedirectActionModel summaryRedirectActionModel2 = summaryRedirectActionModel;
                    SummaryRedirectActionModel.a aVar2 = summaryRedirectActionModel2.e;
                    d680 d680Var = d680.this;
                    if (aVar2 == null) {
                        d680Var.e(summaryRedirectActionModel2, null);
                        N = f9x.a;
                    } else {
                        N = tje.N(d680Var.u, null, null, new OrderShortcutInternalRouter$handleRawSummaryRedirect$1(d680Var, aVar2, yyr0Var, summaryRedirectActionModel2, null), 3);
                    }
                    N.w(new b680(0, runnable3));
                    atomicReference2.set(N);
                }
            });
            return new a680(atomicReference2, 1);
        }
        if (qxr0Var instanceof owr0) {
            ((opc) mpcVar).b(((owr0) qxr0Var).a, yaf0.c);
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
        if (qxr0Var instanceof pxr0) {
            if (sm40Var.b()) {
                this.i.b.d(null, true);
                return daiVar;
            }
            ((pep0) oep0Var).f((m950) yvf0Var.get(), new hre0(new vpe0(new Preorder(0)), yre0.a, "show main screen with dest suggest", true, xpb1.c), hxx.a);
            return daiVar;
        }
        if (qxr0Var instanceof bwr0) {
            opc opcVar = (opc) mpcVar;
            ((pep0) opcVar.f).f((m950) opcVar.g.get(), ((bwr0) qxr0Var).a, hxx.a);
            return daiVar;
        }
        if (!(qxr0Var instanceof nwr0)) {
            super.b(qxr0Var);
            return daiVar;
        }
        lVar.k.g(zy11Var);
        ((pep0) oep0Var).f((m950) this.r.get(), p4i.b, hxx.a);
        return daiVar;
    }

    @Override // defpackage.pzr0
    public final r330 c() {
        return (r330) this.n.get();
    }

    @Override // defpackage.pzr0
    public final void collapse() {
        this.b.k.g(zy11.a);
    }

    @Override // defpackage.pzr0
    public final y700 d() {
        return null;
    }

    public final void e(SummaryRedirectActionModel summaryRedirectActionModel, Address address) {
        this.o.a(summaryRedirectActionModel.f);
        Object obj = null;
        this.w.a(null);
        bhv0 bhv0Var = new bhv0(0);
        ynv0 ynv0Var = summaryRedirectActionModel.h;
        this.s.getClass();
        fcj0 fcj0Var = new fcj0(new bov0(true, (khv0) bhv0Var, jjv0.a(ynv0Var), 8));
        fcj0Var.e = SelectionOrigin.ACTION;
        String str = summaryRedirectActionModel.b;
        fcj0Var.b = str;
        fcj0Var.c = summaryRedirectActionModel.a;
        Iterator it = ((k) this.j).j().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((za31) next).a.a, str)) {
                obj = next;
                break;
            }
        }
        za31 za31Var = (za31) obj;
        if (summaryRedirectActionModel.d && za31Var != null) {
            fcj0Var.d = str;
        }
        this.f.b(new k9s0(fcj0Var), address, true);
    }
}
