package com.yandex.go.scooters.offers.v2.surge.info;

import android.content.Context;
import android.view.View;
import defpackage.fva0;
import defpackage.gus;
import defpackage.ivo0;
import defpackage.j3p0;
import defpackage.l3p0;
import defpackage.lg21;
import defpackage.m230;
import defpackage.m3p0;
import defpackage.s6k0;
import defpackage.t9h0;
import defpackage.u45;
import defpackage.w030;
import defpackage.x770;
import defpackage.xva0;
import defpackage.xvf0;
import defpackage.yuf0;
import defpackage.z8n0;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final class f extends m230 {
    public final w030 E;
    public final fva0 F;
    public final j3p0 G;
    public final m3p0 H;
    public final boolean I;

    public f(w030 w030Var, fva0 fva0Var, j3p0 j3p0Var, m3p0 m3p0Var) {
        super(null);
        this.E = w030Var;
        this.F = fva0Var;
        this.G = j3p0Var;
        this.H = m3p0Var;
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
    /* JADX WARN: Type inference failed for: r10v9, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.offers.v2.surge.info.ScootersSurgeInfoRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        final String str = "ScootersSurgeCard";
        fva0.f(this.F, "ScootersSurgeCard", PerformanceAnalytics$Type.Inflate, 0L, 4);
        ScootersSurgeInfoRouter$provideModalView$1$1 scootersSurgeInfoRouter$provideModalView$1$1 = new ScootersSurgeInfoRouter$provideModalView$1$1(0, this, f.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        s6k0 s6k0Var = this.H.a;
        l3p0 l3p0Var = new l3p0((lg21) ((xvf0) s6k0Var.a).get(), (x770) ((ivo0) s6k0Var.b).get(), (i) ((z8n0) s6k0Var.c).get(), scootersSurgeInfoRouter$provideModalView$1$1);
        gus gusVar = this.G.a;
        final ScootersSurgeInfoModalView scootersSurgeInfoModalView = new ScootersSurgeInfoModalView((Context) gusVar.a.get(), (ru.yandex.taxi.widget.utils.e) gusVar.b.get(), l3p0Var);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r10 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.offers.v2.surge.info.ScootersSurgeInfoRouter$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersSurgeInfoModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = scootersSurgeInfoModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r10;
        scootersSurgeInfoModalView.addOnAttachStateChangeListener(r10);
        return scootersSurgeInfoModalView;
    }
}
