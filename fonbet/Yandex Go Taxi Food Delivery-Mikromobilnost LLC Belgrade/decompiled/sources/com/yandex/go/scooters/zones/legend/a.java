package com.yandex.go.scooters.zones.legend;

import android.content.Context;
import android.view.View;
import com.yandex.go.scooters.zones.legend.ui.ScootersZonesLegendModalView;
import defpackage.fva0;
import defpackage.hwo0;
import defpackage.kxa0;
import defpackage.m230;
import defpackage.map0;
import defpackage.mc;
import defpackage.oap0;
import defpackage.pap0;
import defpackage.pgk0;
import defpackage.qap0;
import defpackage.sxn0;
import defpackage.t9h0;
import defpackage.tig0;
import defpackage.u45;
import defpackage.w030;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a extends m230 {
    public final w030 E;
    public final fva0 F;
    public final map0 G;
    public final qap0 H;
    public final boolean I;

    public a(w030 w030Var, fva0 fva0Var, map0 map0Var, qap0 qap0Var) {
        super(null);
        this.E = w030Var;
        this.F = fva0Var;
        this.G = map0Var;
        this.H = qap0Var;
        this.I = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.zones.legend.ScootersZonesLegendRouter$provideModalView-luNC3F4$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        String str = ((oap0) obj).a;
        final String str2 = "ScootersZonesLegend";
        fva0.f(this.F, "ScootersZonesLegend", PerformanceAnalytics$Type.Inflate, 0L, 4);
        ScootersZonesLegendRouter$provideModalView$1$1 scootersZonesLegendRouter$provideModalView$1$1 = new ScootersZonesLegendRouter$provideModalView$1$1(0, this, a.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        tig0 tig0Var = this.H.a;
        pap0 pap0Var = new pap0((pgk0) ((sxn0) tig0Var.a).get(), (hwo0) ((kxa0) tig0Var.b).get(), str, scootersZonesLegendRouter$provideModalView$1$1);
        mc mcVar = this.G.a;
        final ScootersZonesLegendModalView scootersZonesLegendModalView = new ScootersZonesLegendModalView((Context) mcVar.a.get(), (e) mcVar.b.get(), pap0Var);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r10 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.zones.legend.ScootersZonesLegendRouter$provideModalView-luNC3F4$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersZonesLegendModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str2);
                }
                View view = scootersZonesLegendModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r10;
        scootersZonesLegendModalView.addOnAttachStateChangeListener(r10);
        return scootersZonesLegendModalView;
    }
}
