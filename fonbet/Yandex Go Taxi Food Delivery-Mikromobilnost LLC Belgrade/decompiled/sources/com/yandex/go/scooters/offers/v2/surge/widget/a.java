package com.yandex.go.scooters.offers.v2.surge.widget;

import android.content.Context;
import android.view.View;
import defpackage.a4p0;
import defpackage.cjm0;
import defpackage.e7g;
import defpackage.fva0;
import defpackage.h55;
import defpackage.hwo0;
import defpackage.krl0;
import defpackage.mdo0;
import defpackage.t9h0;
import defpackage.tt2;
import defpackage.u3p0;
import defpackage.v3p0;
import defpackage.xva0;
import defpackage.xvf0;
import defpackage.xzm0;
import defpackage.yuf0;
import defpackage.yvf0;
import defpackage.z1n0;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final class a extends h55 {
    public final fva0 D;
    public final a4p0 E;
    public final yvf0 F;
    public final xzm0 G;
    public final v3p0 H;
    public ScootersSurgeWidgetView I;

    public a(fva0 fva0Var, a4p0 a4p0Var, yvf0 yvf0Var, xzm0 xzm0Var, v3p0 v3p0Var) {
        super(null);
        this.D = fva0Var;
        this.E = a4p0Var;
        this.F = yvf0Var;
        this.G = xzm0Var;
        this.H = v3p0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ScootersSurgeWidgetView scootersSurgeWidgetView = this.I;
        if (scootersSurgeWidgetView != null) {
            this.I = null;
            this.G.a.detach(scootersSurgeWidgetView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.offers.v2.surge.widget.ScootersSurgeWidgetRouter$provideView$$inlined$wrapJankStats$1] */
    @Override // defpackage.h55
    public final void J(Object obj) {
        final String str = "ScootersSurgeWidget";
        fva0.f(this.D, "ScootersSurgeWidget", PerformanceAnalytics$Type.Inflate, 0L, 4);
        a4p0 a4p0Var = this.E;
        v3p0 v3p0Var = this.H;
        ScootersSurgeWidgetRouter$provideView$1$1 scootersSurgeWidgetRouter$provideView$1$1 = new ScootersSurgeWidgetRouter$provideView$1$1(0, this, a.class, "openSurgeInfo", "openSurgeInfo()V", 0);
        krl0 krl0Var = v3p0Var.a;
        u3p0 u3p0Var = new u3p0((cjm0) ((z1n0) krl0Var.a).get(), (d) ((mdo0) krl0Var.b).get(), scootersSurgeWidgetRouter$provideView$1$1);
        hwo0 hwo0Var = a4p0Var.a;
        final ScootersSurgeWidgetView scootersSurgeWidgetView = new ScootersSurgeWidgetView((Context) ((xvf0) hwo0Var.b).get(), (tt2) ((e7g) hwo0Var.c).get(), (ru.yandex.taxi.design.utils.a) ((xvf0) hwo0Var.w).get(), (ru.yandex.taxi.widget.utils.e) ((xvf0) hwo0Var.x).get(), u3p0Var);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r12 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.offers.v2.surge.widget.ScootersSurgeWidgetRouter$provideView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersSurgeWidgetView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = scootersSurgeWidgetView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r12;
        scootersSurgeWidgetView.addOnAttachStateChangeListener(r12);
        this.G.a.attach(scootersSurgeWidgetView);
        this.I = scootersSurgeWidgetView;
    }
}
