package com.yandex.go.scooters.zones.info;

import android.content.Context;
import android.view.View;
import com.yandex.go.scooters.zones.info.ui.ScootersZonesInfoModalView;
import defpackage.co40;
import defpackage.fva0;
import defpackage.hwo0;
import defpackage.kxa0;
import defpackage.m230;
import defpackage.mc;
import defpackage.n6o0;
import defpackage.nao0;
import defpackage.rbh;
import defpackage.rxm0;
import defpackage.s9p0;
import defpackage.t9h0;
import defpackage.tig0;
import defpackage.u45;
import defpackage.u9p0;
import defpackage.v9p0;
import defpackage.w030;
import defpackage.w9p0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a extends m230 {
    public final w030 E;
    public final fva0 F;
    public final s9p0 G;
    public final w9p0 H;
    public final rxm0 I;
    public final boolean J;

    public a(w030 w030Var, fva0 fva0Var, s9p0 s9p0Var, w9p0 w9p0Var, rxm0 rxm0Var) {
        super(null);
        this.E = w030Var;
        this.F = fva0Var;
        this.G = s9p0Var;
        this.H = w9p0Var;
        this.I = rxm0Var;
        this.J = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.zones.info.ScootersZonesInfoRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        u9p0 u9p0Var = (u9p0) obj;
        final String str = "ScootersZonesInfo";
        fva0.f(this.F, "ScootersZonesInfo", PerformanceAnalytics$Type.Inflate, 0L, 4);
        rbh rbhVar = new rbh(u9p0Var.a, u9p0Var.b, 7);
        ScootersZonesInfoRouter$provideModalView$1$1 scootersZonesInfoRouter$provideModalView$1$1 = new ScootersZonesInfoRouter$provideModalView$1$1(0, this, a.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        nao0 nao0Var = new nao0(12, this, u9p0Var);
        tig0 tig0Var = this.H.a;
        v9p0 v9p0Var = new v9p0((co40) ((n6o0) tig0Var.a).get(), (hwo0) ((kxa0) tig0Var.b).get(), rbhVar, scootersZonesInfoRouter$provideModalView$1$1, nao0Var);
        mc mcVar = this.G.a;
        final ScootersZonesInfoModalView scootersZonesInfoModalView = new ScootersZonesInfoModalView((Context) mcVar.a.get(), (e) mcVar.b.get(), v9p0Var);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r14 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.zones.info.ScootersZonesInfoRouter$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersZonesInfoModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = scootersZonesInfoModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r14;
        scootersZonesInfoModalView.addOnAttachStateChangeListener(r14);
        return scootersZonesInfoModalView;
    }
}
