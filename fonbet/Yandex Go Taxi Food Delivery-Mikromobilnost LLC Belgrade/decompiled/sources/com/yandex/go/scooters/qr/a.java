package com.yandex.go.scooters.qr;

import android.content.Context;
import android.view.View;
import com.yandex.go.scooters.qr.api.ScootersQrNumberInputSource;
import com.yandex.go.scooters.qr.domain.d;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import com.yandex.go.scooters.qr.ui.e;
import defpackage.cjm0;
import defpackage.dpb;
import defpackage.fva0;
import defpackage.g1n0;
import defpackage.ipo0;
import defpackage.jpo0;
import defpackage.jqo0;
import defpackage.jro0;
import defpackage.k8p0;
import defpackage.krl0;
import defpackage.n3w;
import defpackage.n5o0;
import defpackage.n7g;
import defpackage.ney;
import defpackage.ny61;
import defpackage.pxm0;
import defpackage.qoo0;
import defpackage.rx4;
import defpackage.s14;
import defpackage.spo0;
import defpackage.t9h0;
import defpackage.too0;
import defpackage.tse;
import defpackage.ukn0;
import defpackage.uoo0;
import defpackage.upo0;
import defpackage.usn0;
import defpackage.vdm;
import defpackage.vmn0;
import defpackage.vpo0;
import defpackage.w030;
import defpackage.xoo0;
import defpackage.xpo0;
import defpackage.xva0;
import defpackage.xvf0;
import defpackage.y50;
import defpackage.yln0;
import defpackage.yuf0;
import defpackage.yvf0;
import defpackage.z4k0;
import defpackage.zoo0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.domain.o;

/* loaded from: classes13.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final fva0 G;
    public final ipo0 H;
    public final upo0 I;
    public final MapNotificationsMuteRepository J;
    public final d K;
    public final xpo0 L;
    public final rx4 M;
    public vdm N;

    public a(w030 w030Var, fva0 fva0Var, ipo0 ipo0Var, upo0 upo0Var, MapNotificationsMuteRepository mapNotificationsMuteRepository, d dVar, yvf0 yvf0Var, xpo0 xpo0Var, rx4 rx4Var) {
        super(null);
        this.F = w030Var;
        this.G = fva0Var;
        this.H = ipo0Var;
        this.I = upo0Var;
        this.J = mapNotificationsMuteRepository;
        this.K = dVar;
        this.L = xpo0Var;
        this.M = rx4Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        super.G((spo0) obj);
        this.J.a();
        this.L.a.a("Perf.ScootersQrRouter.Launch");
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((spo0) obj);
        j(dpb.a);
        this.N = null;
        this.J.b();
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.qr.ScootersQrRouterImpl$provideModalView$$inlined$wrapJankStats$1] */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(spo0 spo0Var, ContinuationImpl continuationImpl) {
        ScootersQrRouterImpl$provideModalView$1 scootersQrRouterImpl$provideModalView$1;
        int i;
        pxm0 pxm0Var;
        ipo0 ipo0Var;
        ScootersQrNumberInputSource scootersQrNumberInputSource;
        vpo0 vpo0Var;
        String str;
        upo0 upo0Var;
        spo0 spo0Var2 = spo0Var;
        if (continuationImpl instanceof ScootersQrRouterImpl$provideModalView$1) {
            scootersQrRouterImpl$provideModalView$1 = (ScootersQrRouterImpl$provideModalView$1) continuationImpl;
            int i2 = scootersQrRouterImpl$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersQrRouterImpl$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersQrRouterImpl$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersQrRouterImpl$provideModalView$1.label;
                if (i != 0) {
                    b.b(obj);
                    fva0.f(this.G, "ScootersQrView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                    pxm0Var = spo0Var2.a;
                    ScootersQrNumberInputSource scootersQrNumberInputSource2 = ScootersQrNumberInputSource.QR_AND_MANUAL;
                    vpo0 vpo0Var2 = new vpo0(this);
                    jqo0 jqo0Var = spo0Var2.b;
                    scootersQrRouterImpl$provideModalView$1.L$0 = spo0Var2;
                    scootersQrRouterImpl$provideModalView$1.L$1 = null;
                    scootersQrRouterImpl$provideModalView$1.L$2 = "ScootersQrView";
                    ipo0Var = this.H;
                    scootersQrRouterImpl$provideModalView$1.L$3 = ipo0Var;
                    scootersQrRouterImpl$provideModalView$1.L$4 = pxm0Var;
                    scootersQrRouterImpl$provideModalView$1.L$5 = scootersQrNumberInputSource2;
                    scootersQrRouterImpl$provideModalView$1.L$6 = vpo0Var2;
                    upo0 upo0Var2 = this.I;
                    scootersQrRouterImpl$provideModalView$1.L$7 = upo0Var2;
                    scootersQrRouterImpl$provideModalView$1.label = 1;
                    Object a = this.K.a(jqo0Var, scootersQrRouterImpl$provideModalView$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    scootersQrNumberInputSource = scootersQrNumberInputSource2;
                    vpo0Var = vpo0Var2;
                    str = "ScootersQrView";
                    obj = a;
                    upo0Var = upo0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    upo0Var = (upo0) scootersQrRouterImpl$provideModalView$1.L$7;
                    vpo0 vpo0Var3 = (vpo0) scootersQrRouterImpl$provideModalView$1.L$6;
                    ScootersQrNumberInputSource scootersQrNumberInputSource3 = (ScootersQrNumberInputSource) scootersQrRouterImpl$provideModalView$1.L$5;
                    pxm0Var = (pxm0) scootersQrRouterImpl$provideModalView$1.L$4;
                    ipo0Var = (ipo0) scootersQrRouterImpl$provideModalView$1.L$3;
                    str = (String) scootersQrRouterImpl$provideModalView$1.L$2;
                    spo0 spo0Var3 = (spo0) scootersQrRouterImpl$provideModalView$1.L$0;
                    b.b(obj);
                    vpo0Var = vpo0Var3;
                    spo0Var2 = spo0Var3;
                    scootersQrNumberInputSource = scootersQrNumberInputSource3;
                }
                pxm0 pxm0Var2 = pxm0Var;
                yln0 yln0Var = (yln0) obj;
                s14 s14Var = upo0Var.a;
                final String str2 = str;
                e eVar = new e((Context) ((xvf0) s14Var.a).get(), (y50) ((xvf0) s14Var.c).get(), (ney) ((xvf0) s14Var.d).get(), (too0) ((xvf0) s14Var.e).get(), (ru.yandex.taxi.scooters.presentation.analytics.a) ((z4k0) s14Var.f).get(), (jpo0) ((n7g) s14Var.g).get(), (ukn0) ((xvf0) s14Var.h).get(), (jro0) ((xvf0) s14Var.i).get(), (krl0) ((xoo0) s14Var.j).get(), (o) ((g1n0) s14Var.k).get(), (qoo0) ((xvf0) s14Var.l).get(), (uoo0) ((xvf0) s14Var.m).get(), (usn0) ((xvf0) s14Var.n).get(), (cjm0) ((xoo0) s14Var.b).get(), (k8p0) ((xvf0) s14Var.o).get(), vpo0Var, yln0Var);
                jqo0 jqo0Var2 = spo0Var2.b;
                vmn0 vmn0Var = ipo0Var.a;
                final ScootersQrModalView scootersQrModalView = new ScootersQrModalView((Context) ((xvf0) vmn0Var.a).get(), (xvf0) vmn0Var.b, (tse) ((xvf0) vmn0Var.c).get(), (too0) ((xvf0) vmn0Var.w).get(), (zoo0) ((n3w) vmn0Var.y).a, (n5o0) ((xvf0) vmn0Var.x).get(), eVar, pxm0Var2, jqo0Var2, scootersQrNumberInputSource);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.qr.ScootersQrRouterImpl$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersQrModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str2);
                        }
                        View view = scootersQrModalView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r1;
                scootersQrModalView.addOnAttachStateChangeListener(r1);
                return scootersQrModalView;
            }
        }
        scootersQrRouterImpl$provideModalView$1 = new ScootersQrRouterImpl$provideModalView$1(this, continuationImpl);
        Object obj2 = scootersQrRouterImpl$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrRouterImpl$provideModalView$1.label;
        if (i != 0) {
        }
        pxm0 pxm0Var22 = pxm0Var;
        yln0 yln0Var2 = (yln0) obj2;
        s14 s14Var2 = upo0Var.a;
        final String str22 = str;
        e eVar2 = new e((Context) ((xvf0) s14Var2.a).get(), (y50) ((xvf0) s14Var2.c).get(), (ney) ((xvf0) s14Var2.d).get(), (too0) ((xvf0) s14Var2.e).get(), (ru.yandex.taxi.scooters.presentation.analytics.a) ((z4k0) s14Var2.f).get(), (jpo0) ((n7g) s14Var2.g).get(), (ukn0) ((xvf0) s14Var2.h).get(), (jro0) ((xvf0) s14Var2.i).get(), (krl0) ((xoo0) s14Var2.j).get(), (o) ((g1n0) s14Var2.k).get(), (qoo0) ((xvf0) s14Var2.l).get(), (uoo0) ((xvf0) s14Var2.m).get(), (usn0) ((xvf0) s14Var2.n).get(), (cjm0) ((xoo0) s14Var2.b).get(), (k8p0) ((xvf0) s14Var2.o).get(), vpo0Var, yln0Var2);
        jqo0 jqo0Var22 = spo0Var2.b;
        vmn0 vmn0Var2 = ipo0Var.a;
        final View scootersQrModalView2 = new ScootersQrModalView((Context) ((xvf0) vmn0Var2.a).get(), (xvf0) vmn0Var2.b, (tse) ((xvf0) vmn0Var2.c).get(), (too0) ((xvf0) vmn0Var2.w).get(), (zoo0) ((n3w) vmn0Var2.y).a, (n5o0) ((xvf0) vmn0Var2.x).get(), eVar2, pxm0Var22, jqo0Var22, scootersQrNumberInputSource);
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? r12 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.qr.ScootersQrRouterImpl$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersQrModalView2.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str22);
                }
                View view = scootersQrModalView2;
                T t = ref$ObjectRef2.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef2.element = r12;
        scootersQrModalView2.addOnAttachStateChangeListener(r12);
        return scootersQrModalView2;
    }
}
