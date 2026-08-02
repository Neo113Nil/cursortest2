package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.chargers.domain.b;
import com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderModalView;
import com.yandex.go.chargers.multiorder.ui.f;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.hiredriver.HireDriverModalView;
import ru.yandex.taxi.hiredriver.c;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRouteModalView;
import ru.yandex.taxi.masstransit.mapper.a;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes12.dex */
public final class j4a extends m230 {
    public final /* synthetic */ int E;
    public final w030 F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4a(w030 w030Var, y50 y50Var, h3y h3yVar, xf30 xf30Var, mg30 mg30Var, yvf0 yvf0Var) {
        super(null);
        this.E = 2;
        this.F = w030Var;
        this.G = y50Var;
        this.H = h3yVar;
        this.I = xf30Var;
        this.J = mg30Var;
        this.K = yvf0Var;
    }

    @Override // defpackage.m230, defpackage.h55
    public void G(Object obj) {
        Object value;
        switch (this.E) {
            case 0:
                super.G(new i4a(((i4a) obj).a));
                r0 r0Var = ((vn9) this.H).a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, wn9.a((wn9) value, false, false, false, false, false, 27)));
            default:
                super.G(obj);
                break;
        }
    }

    @Override // defpackage.m230, defpackage.h55
    public void H(Object obj) {
        switch (this.E) {
            case 0:
                ArrayList arrayList = ((i4a) obj).a;
                ((vn9) this.H).c();
                super.H(new i4a(arrayList));
                break;
            default:
                super.H(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.E) {
            case 0:
                ArrayList arrayList = ((i4a) obj).a;
                ((ol9) this.I).a.l(null);
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.chargers.multiorder.ChargersMultiOrderModalRouter$provideModalView-4l4devg$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.E;
        int i2 = 1;
        Object obj2 = this.J;
        Object obj3 = this.K;
        switch (i) {
            case 0:
                ArrayList arrayList = ((i4a) obj).a;
                fva0 fva0Var = (fva0) this.G;
                final String key = ChargersPerfEvent.MULTI_ORDER_CARD.getKey();
                fva0.f(fva0Var, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
                hh5 hh5Var = new hh5(26, this);
                an8 an8Var = ((s4a) obj3).a;
                r4a r4aVar = new r4a((em9) ((xvf0) an8Var.c).get(), (f) ((b1a) an8Var.w).get(), (b) ((xvf0) an8Var.x).get(), (cyx) ((pxf) an8Var.b).get(), arrayList, hh5Var);
                an8 an8Var2 = ((n4a) obj2).a;
                final ChargersMultiOrderModalView chargersMultiOrderModalView = new ChargersMultiOrderModalView((Context) ((xvf0) an8Var2.c).get(), (pav) ((xvf0) an8Var2.w).get(), (a3v) ((pxf) an8Var2.x).get(), (xx9) ((lu9) an8Var2.b).get(), r4aVar);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.multiorder.ChargersMultiOrderModalRouter$provideModalView-4l4devg$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = chargersMultiOrderModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(key);
                        }
                        View view = chargersMultiOrderModalView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r1;
                chargersMultiOrderModalView.addOnAttachStateChangeListener(r1);
                return chargersMultiOrderModalView;
            case 1:
                oku okuVar = (oku) obj;
                bu0 bu0Var = (bu0) obj3;
                i4u i4uVar = new i4u(this);
                h2t h2tVar = new h2t(this);
                bu0Var.getClass();
                okuVar.getClass();
                xvf0 b = i5m.b(new prq(new c2g(bu0Var, 3), new c2g(bu0Var, 0), new c2g(bu0Var, 2), new c2g(bu0Var, i2), new c2g(bu0Var, 4), 13));
                Context context = (Context) bu0Var.a;
                q5z.h(context);
                pho phoVar = (pho) bu0Var.i;
                q5z.h(phoVar);
                b1 b1Var = new b1(phoVar);
                c cVar = (c) b.get();
                uq1 uq1Var = (uq1) bu0Var.b;
                q5z.h(uq1Var);
                lg21 lg21Var = (lg21) bu0Var.c;
                q5z.h(lg21Var);
                return new HireDriverModalView(context, okuVar, new rku(b1Var, cVar, uq1Var, lg21Var, i4uVar, h2tVar, okuVar));
            default:
                yf30 yf30Var = (yf30) obj;
                xf30 xf30Var = (xf30) this.I;
                su30 su30Var = yf30Var.a;
                pf30 pf30Var = new pf30(this, i2);
                MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = yf30Var.b;
                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = yf30Var.c;
                uj30 uj30Var = (uj30) ((yvf0) obj3).get();
                yx1 yx1Var = ((mg30) obj2).a;
                ru.yandex.taxi.masstransit.detailedroute.ui.c cVar2 = new ru.yandex.taxi.masstransit.detailedroute.ui.c(su30Var, pf30Var, mtDetailedRouteAnalyticSource, mtDetailedRouteAnalyticType, uj30Var, (yw30) ((xvf0) yx1Var.a).get(), (zuj0) ((xvf0) yx1Var.b).get(), (a) ((ci3) yx1Var.f).get(), (ru.yandex.taxi.masstransit.domain.c) ((xh) yx1Var.g).get(), (wr30) ((xvf0) yx1Var.c).get(), (ah00) ((xvf0) yx1Var.d).get(), (ru.yandex.taxi.masstransit.userlocation.a) ((sku0) yx1Var.h).get(), (k141) ((xvf0) yx1Var.e).get());
                zh0 zh0Var = xf30Var.a;
                return new MtDetailedRouteModalView((Context) zh0Var.a.get(), cVar2, (dwc) zh0Var.b.get(), (pwy0) zh0Var.c.get(), (k141) zh0Var.d.get());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, w030 w030Var, int i) {
        super(null);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
        this.F = w030Var;
    }
}
