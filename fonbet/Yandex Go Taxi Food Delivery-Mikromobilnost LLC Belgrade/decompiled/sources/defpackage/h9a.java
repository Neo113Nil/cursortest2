package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import com.yandex.go.chargers.offer.domain.b;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import com.yandex.go.chargers.offer.ui.mvp.c;
import com.yandex.go.chargers.surge.domain.ChargersScreenWithSurge;
import com.yandex.go.navigation.modals.coroutines.a;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes12.dex */
public final class h9a extends a {
    public final fva0 F;
    public final w030 G;
    public final vxf H;
    public final iwa I;
    public final vn9 J;
    public final uxf K;
    public final xma L;
    public final w8a M;
    public final q8a N;
    public final awa O;
    public final r9a P;
    public final yvf0 Q;
    public final yvf0 R;
    public final yvf0 S;
    public final yvf0 T;
    public final yvf0 U;
    public final yvf0 V;

    public h9a(fva0 fva0Var, w030 w030Var, vxf vxfVar, iwa iwaVar, vn9 vn9Var, uxf uxfVar, xma xmaVar, w8a w8aVar, q8a q8aVar, awa awaVar, r9a r9aVar, uxf uxfVar2, uxf uxfVar3, uxf uxfVar4, uxf uxfVar5, uxf uxfVar6, uxf uxfVar7) {
        super(null);
        this.F = fva0Var;
        this.G = w030Var;
        this.H = vxfVar;
        this.I = iwaVar;
        this.J = vn9Var;
        this.K = uxfVar;
        this.L = xmaVar;
        this.M = w8aVar;
        this.N = q8aVar;
        this.O = awaVar;
        this.P = r9aVar;
        this.Q = uxfVar2;
        this.R = uxfVar3;
        this.S = uxfVar4;
        this.T = uxfVar5;
        this.U = uxfVar6;
        this.V = uxfVar7;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        super.G((g9a) obj);
        this.J.d();
        this.I.a(ChargersScreenWithSurge.OFFER);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        this.J.a();
        iwa iwaVar = this.I;
        iwaVar.a.l(null);
        iwaVar.a(null);
        super.H((g9a) obj);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.chargers.offer.navigation.ChargersOfferRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        g9a g9aVar = (g9a) obj;
        final String key = ChargersPerfEvent.OFFER_CARD.getKey();
        fva0.f(this.F, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
        io9 io9Var = new io9(this);
        tsa tsaVar = g9aVar.a;
        ChargersOfferOpenReason chargersOfferOpenReason = g9aVar.b;
        String str = g9aVar.c;
        j4n j4nVar = this.M.a;
        c cVar = new c((em9) ((uxf) j4nVar.a).get(), (g6a) ((xvf0) j4nVar.b).get(), (b) ((xvf0) j4nVar.c).get(), (com.yandex.go.chargers.offer.domain.c) ((xvf0) j4nVar.x).get(), (vn9) ((xvf0) j4nVar.y).get(), (o9a) ((xvf0) j4nVar.z).get(), (saa) ((uxf) j4nVar.w).get(), str, chargersOfferOpenReason, tsaVar, io9Var);
        w3i w3iVar = this.N.a;
        final ChargersOfferModalView chargersOfferModalView = new ChargersOfferModalView((Context) ((uxf) w3iVar.b).get(), (rea0) ((vxf) w3iVar.c).get(), (tla) ((uxf) w3iVar.w).get(), (pav) ((xvf0) w3iVar.x).get(), (em9) ((uxf) w3iVar.y).get(), (pwy0) ((vxf) w3iVar.z).get(), (com.yandex.go.chargers.domain.a) ((xvf0) w3iVar.A).get(), (ku9) ((lu9) w3iVar.B).get(), cVar);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.offer.navigation.ChargersOfferRouter$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = chargersOfferModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(key);
                }
                View view = chargersOfferModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r2;
        chargersOfferModalView.addOnAttachStateChangeListener(r2);
        return chargersOfferModalView;
    }
}
