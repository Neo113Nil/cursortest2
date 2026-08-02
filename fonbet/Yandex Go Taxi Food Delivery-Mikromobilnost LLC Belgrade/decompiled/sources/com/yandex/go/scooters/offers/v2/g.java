package com.yandex.go.scooters.offers.v2;

import android.content.Context;
import android.view.View;
import com.yandex.go.scooters.data.model.ScootersOffersPresentationState$LaunchContext;
import com.yandex.go.scooters.domain.model.ScootersEmptyParkingException;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsFromScreen;
import com.yandex.go.scooters.offers.v2.components.ScootersComponentsView;
import defpackage.a3v;
import defpackage.cio0;
import defpackage.czn0;
import defpackage.dpb;
import defpackage.ewn0;
import defpackage.fva0;
import defpackage.g3b;
import defpackage.g4p0;
import defpackage.g8n0;
import defpackage.h7n0;
import defpackage.hwn0;
import defpackage.i7n0;
import defpackage.jwf;
import defpackage.l4n0;
import defpackage.l4o0;
import defpackage.l6n0;
import defpackage.lzm0;
import defpackage.m5n0;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.o3o0;
import defpackage.o4o0;
import defpackage.o6n0;
import defpackage.p8k0;
import defpackage.pav;
import defpackage.pz40;
import defpackage.q7g;
import defpackage.s6n0;
import defpackage.scn0;
import defpackage.st0;
import defpackage.sy60;
import defpackage.t9h0;
import defpackage.uan0;
import defpackage.ukn0;
import defpackage.van0;
import defpackage.w030;
import defpackage.w4n0;
import defpackage.wan0;
import defpackage.xva0;
import defpackage.xvf0;
import defpackage.y4c0;
import defpackage.y50;
import defpackage.yuf0;
import defpackage.yvf0;
import defpackage.zmm0;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.common.ui.preview.ScootersVehiclePreviewView;

/* loaded from: classes13.dex */
public final class g extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final y50 G;
    public final fva0 H;
    public final yvf0 I;
    public final ukn0 J;
    public final yvf0 K;
    public final cio0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final scn0 O;
    public final yvf0 P;
    public final yvf0 Q;
    public final yvf0 R;
    public final czn0 S;
    public final yvf0 T;
    public final q7g U;
    public final yvf0 V;
    public final yvf0 W;
    public final yvf0 Z;
    public final yvf0 a0;
    public final yvf0 b0;
    public final yvf0 c0;
    public final yvf0 d0;
    public final yvf0 e0;
    public final yvf0 f0;
    public final com.yandex.go.scooters.offers.v2.analytics.c g0;
    public final com.yandex.go.scooters.payments.domain.a h0;
    public final i7n0 i0;
    public final yvf0 j0;
    public final yvf0 k0;
    public final yvf0 l0;
    public final yvf0 m0;
    public final zmm0 n0;
    public final p8k0 o0;
    public jwf p0;
    public com.yandex.go.scooters.offers.v2.details.d q0;
    public y4c0 r0;

    public g(w030 w030Var, y50 y50Var, fva0 fva0Var, yvf0 yvf0Var, ukn0 ukn0Var, yvf0 yvf0Var2, cio0 cio0Var, yvf0 yvf0Var3, yvf0 yvf0Var4, scn0 scn0Var, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, czn0 czn0Var, yvf0 yvf0Var8, q7g q7gVar, yvf0 yvf0Var9, yvf0 yvf0Var10, yvf0 yvf0Var11, yvf0 yvf0Var12, yvf0 yvf0Var13, yvf0 yvf0Var14, yvf0 yvf0Var15, yvf0 yvf0Var16, yvf0 yvf0Var17, com.yandex.go.scooters.offers.v2.analytics.c cVar, com.yandex.go.scooters.payments.domain.a aVar, i7n0 i7n0Var, yvf0 yvf0Var18, yvf0 yvf0Var19, yvf0 yvf0Var20, yvf0 yvf0Var21, zmm0 zmm0Var, p8k0 p8k0Var) {
        super(null);
        this.F = w030Var;
        this.G = y50Var;
        this.H = fva0Var;
        this.I = yvf0Var;
        this.J = ukn0Var;
        this.K = yvf0Var2;
        this.L = cio0Var;
        this.M = yvf0Var3;
        this.N = yvf0Var4;
        this.O = scn0Var;
        this.P = yvf0Var5;
        this.Q = yvf0Var6;
        this.R = yvf0Var7;
        this.S = czn0Var;
        this.T = yvf0Var8;
        this.U = q7gVar;
        this.V = yvf0Var9;
        this.W = yvf0Var10;
        this.Z = yvf0Var11;
        this.a0 = yvf0Var12;
        this.b0 = yvf0Var13;
        this.c0 = yvf0Var14;
        this.d0 = yvf0Var15;
        this.e0 = yvf0Var16;
        this.f0 = yvf0Var17;
        this.g0 = cVar;
        this.h0 = aVar;
        this.i0 = i7n0Var;
        this.j0 = yvf0Var18;
        this.k0 = yvf0Var19;
        this.l0 = yvf0Var20;
        this.m0 = yvf0Var21;
        this.n0 = zmm0Var;
        this.o0 = p8k0Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        o6n0 o6n0Var = (o6n0) obj;
        this.S.b.add(ScootersMosRuAnalyticsFromScreen.OFFER);
        o4o0 o4o0Var = (o4o0) ((r0) o6n0Var.a).getValue();
        l4o0 l4o0Var = o4o0Var instanceof l4o0 ? (l4o0) o4o0Var : null;
        i7n0 i7n0Var = this.i0;
        if (l4o0Var != null && l4o0Var.g == 0) {
            new h7n0(this, o6n0Var).f(new ScootersEmptyParkingException(), EmptyList.a, true);
            i7n0Var.a.a("Perf.ScootersCardV2Router.Launch");
            return;
        }
        super.G(o6n0Var);
        ((ewn0) ((xvf0) T(o6n0Var).P).get()).c();
        if (((o4o0) ((r0) o6n0Var.a).getValue()).b != ScootersOffersPresentationState$LaunchContext.ON_CAMERA) {
            z((com.yandex.go.scooters.offers.v2.surge.widget.a) ((xvf0) T(o6n0Var).N).get(), sy60.Q2);
        }
        i7n0Var.a.a("Perf.ScootersCardV2Router.Launch");
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        ewn0 ewn0Var;
        super.H((o6n0) obj);
        j(dpb.a);
        this.S.a();
        jwf jwfVar = this.p0;
        if (jwfVar != null && (ewn0Var = (ewn0) ((xvf0) jwfVar.P).get()) != null) {
            ewn0Var.b();
        }
        this.q0 = null;
        this.r0 = null;
        this.p0 = null;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    public final jwf T(o6n0 o6n0Var) {
        jwf jwfVar = this.p0;
        if (jwfVar != null) {
            return jwfVar;
        }
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Creating;
        fva0.f(this.H, "ScootersOffersComponent", performanceAnalytics$Type, 0L, 4);
        h7n0 h7n0Var = new h7n0(this, o6n0Var);
        pz40 pz40Var = o6n0Var.a;
        q7g q7gVar = this.U;
        q7gVar.getClass();
        pz40Var.getClass();
        jwf jwfVar2 = new jwf(q7gVar.a, new o3o0(), h7n0Var, pz40Var);
        fva0.b(this.H, "ScootersOffersComponent", performanceAnalytics$Type, null, 4);
        this.p0 = jwfVar2;
        return jwfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r2v37, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.offers.v2.ScootersCardV2Router$provideModalView$$inlined$wrapJankStats$1] */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(o6n0 o6n0Var, ContinuationImpl continuationImpl) {
        ScootersCardV2Router$provideModalView$1 scootersCardV2Router$provideModalView$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        uan0 uan0Var;
        o6n0 o6n0Var2;
        l6n0 l6n0Var;
        Object b;
        ScootersCardV2.ChargeConfig chargeConfig;
        l6n0 l6n0Var2;
        o6n0 o6n0Var3;
        final String str2;
        com.yandex.go.scooters.offers.v2.analytics.a aVar;
        if (continuationImpl instanceof ScootersCardV2Router$provideModalView$1) {
            scootersCardV2Router$provideModalView$1 = (ScootersCardV2Router$provideModalView$1) continuationImpl;
            int i2 = scootersCardV2Router$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCardV2Router$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCardV2Router$provideModalView$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCardV2Router$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.scooters.offers.v2.analytics.c cVar = this.g0;
                    cVar.getClass();
                    cVar.c = new com.yandex.go.scooters.offers.v2.analytics.a(null, 0L, 0L, 0L, 0L, 0L, System.currentTimeMillis());
                    str = "ScootersCardV2ModalView";
                    fva0.f(this.H, "ScootersCardV2ModalView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                    l6n0 l6n0Var3 = (l6n0) ((n3w) T(o6n0Var).g).a;
                    uan0Var = (uan0) ((n3w) T(o6n0Var).j).a;
                    ukn0 ukn0Var = this.J;
                    o6n0Var2 = o6n0Var;
                    scootersCardV2Router$provideModalView$1.L$0 = o6n0Var2;
                    scootersCardV2Router$provideModalView$1.L$1 = null;
                    scootersCardV2Router$provideModalView$1.L$2 = "ScootersCardV2ModalView";
                    scootersCardV2Router$provideModalView$1.L$3 = l6n0Var3;
                    scootersCardV2Router$provideModalView$1.L$4 = uan0Var;
                    scootersCardV2Router$provideModalView$1.label = 1;
                    Object b2 = ukn0Var.a.b(scootersCardV2Router$provideModalView$1);
                    if (b2 != coroutineSingletons) {
                        l6n0Var = l6n0Var3;
                        obj = b2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ScootersCardV2.ChargeConfig chargeConfig2 = (ScootersCardV2.ChargeConfig) scootersCardV2Router$provideModalView$1.L$5;
                    uan0Var = (uan0) scootersCardV2Router$provideModalView$1.L$4;
                    l6n0Var2 = (l6n0) scootersCardV2Router$provideModalView$1.L$3;
                    str2 = (String) scootersCardV2Router$provideModalView$1.L$2;
                    o6n0Var3 = (o6n0) scootersCardV2Router$provideModalView$1.L$0;
                    kotlin.b.b(obj);
                    chargeConfig = chargeConfig2;
                    ScootersCardV2.a aVar2 = ((g0) obj).k.a;
                    van0 van0Var = ((wan0) uan0Var).a;
                    ScootersComponentsView scootersComponentsView = new ScootersComponentsView((Context) van0Var.a.get(), (hwn0) van0Var.b.get(), (com.yandex.go.scooters.offers.v2.components.tariffs.a) van0Var.c.get(), (m5n0) van0Var.d.get(), (w4n0) van0Var.e.a, chargeConfig, aVar2);
                    boolean z = ((o4o0) ((r0) o6n0Var3.a).getValue()).b == ScootersOffersPresentationState$LaunchContext.ON_CAMERA;
                    st0 st0Var = l6n0Var2.a;
                    final ScootersCardV2ModalView scootersCardV2ModalView = new ScootersCardV2ModalView((Context) ((xvf0) st0Var.a).get(), (ScootersVehiclePreviewView) ((xvf0) st0Var.b).get(), (l4n0) ((n3w) st0Var.B).a, (g8n0) ((xvf0) st0Var.c).get(), (pav) ((xvf0) st0Var.w).get(), (a3v) ((xvf0) st0Var.x).get(), (f) ((g3b) st0Var.C).get(), (s6n0) ((xvf0) st0Var.y).get(), (lzm0) ((xvf0) st0Var.z).get(), (g4p0) ((xvf0) st0Var.A).get(), (com.yandex.go.scooters.offers.v2.analytics.c) ((xvf0) st0Var.D).get(), z, scootersComponentsView);
                    com.yandex.go.scooters.offers.v2.analytics.c cVar2 = this.g0;
                    aVar = cVar2.c;
                    if (aVar != null) {
                        cVar2.c = com.yandex.go.scooters.offers.v2.analytics.a.a(aVar, null, System.currentTimeMillis(), 0L, 0L, 0L, 0L, HProv.PP_DELETE_KEYSET);
                    }
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.offers.v2.ScootersCardV2Router$provideModalView$$inlined$wrapJankStats$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v) {
                            View rootView = scootersCardV2ModalView.getRootView();
                            Object tag = rootView.getTag(t9h0.metricsStateHolder);
                            if (tag == null) {
                                tag = new xva0();
                                rootView.setTag(t9h0.metricsStateHolder, tag);
                            }
                            yuf0 yuf0Var = ((xva0) tag).a;
                            if (yuf0Var != null) {
                                yuf0Var.I(str2);
                            }
                            View view = scootersCardV2ModalView;
                            T t = ref$ObjectRef.element;
                            view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v) {
                        }
                    };
                    ref$ObjectRef.element = r2;
                    scootersCardV2ModalView.addOnAttachStateChangeListener(r2);
                    return scootersCardV2ModalView;
                }
                uan0Var = (uan0) scootersCardV2Router$provideModalView$1.L$4;
                l6n0Var = (l6n0) scootersCardV2Router$provideModalView$1.L$3;
                String str3 = (String) scootersCardV2Router$provideModalView$1.L$2;
                o6n0 o6n0Var4 = (o6n0) scootersCardV2Router$provideModalView$1.L$0;
                kotlin.b.b(obj);
                str = str3;
                o6n0Var2 = o6n0Var4;
                ScootersCardV2.ChargeConfig chargeConfig3 = ((g0) obj).k.b;
                ukn0 ukn0Var2 = this.J;
                scootersCardV2Router$provideModalView$1.L$0 = o6n0Var2;
                scootersCardV2Router$provideModalView$1.L$1 = null;
                scootersCardV2Router$provideModalView$1.L$2 = str;
                scootersCardV2Router$provideModalView$1.L$3 = l6n0Var;
                scootersCardV2Router$provideModalView$1.L$4 = uan0Var;
                scootersCardV2Router$provideModalView$1.L$5 = chargeConfig3;
                scootersCardV2Router$provideModalView$1.label = 2;
                b = ukn0Var2.a.b(scootersCardV2Router$provideModalView$1);
                if (b != coroutineSingletons) {
                    chargeConfig = chargeConfig3;
                    obj = b;
                    l6n0Var2 = l6n0Var;
                    o6n0Var3 = o6n0Var2;
                    str2 = str;
                    ScootersCardV2.a aVar22 = ((g0) obj).k.a;
                    van0 van0Var2 = ((wan0) uan0Var).a;
                    ScootersComponentsView scootersComponentsView2 = new ScootersComponentsView((Context) van0Var2.a.get(), (hwn0) van0Var2.b.get(), (com.yandex.go.scooters.offers.v2.components.tariffs.a) van0Var2.c.get(), (m5n0) van0Var2.d.get(), (w4n0) van0Var2.e.a, chargeConfig, aVar22);
                    boolean z2 = ((o4o0) ((r0) o6n0Var3.a).getValue()).b == ScootersOffersPresentationState$LaunchContext.ON_CAMERA;
                    st0 st0Var2 = l6n0Var2.a;
                    final View scootersCardV2ModalView2 = new ScootersCardV2ModalView((Context) ((xvf0) st0Var2.a).get(), (ScootersVehiclePreviewView) ((xvf0) st0Var2.b).get(), (l4n0) ((n3w) st0Var2.B).a, (g8n0) ((xvf0) st0Var2.c).get(), (pav) ((xvf0) st0Var2.w).get(), (a3v) ((xvf0) st0Var2.x).get(), (f) ((g3b) st0Var2.C).get(), (s6n0) ((xvf0) st0Var2.y).get(), (lzm0) ((xvf0) st0Var2.z).get(), (g4p0) ((xvf0) st0Var2.A).get(), (com.yandex.go.scooters.offers.v2.analytics.c) ((xvf0) st0Var2.D).get(), z2, scootersComponentsView2);
                    com.yandex.go.scooters.offers.v2.analytics.c cVar22 = this.g0;
                    aVar = cVar22.c;
                    if (aVar != null) {
                    }
                    final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ?? r22 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.offers.v2.ScootersCardV2Router$provideModalView$$inlined$wrapJankStats$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v) {
                            View rootView = scootersCardV2ModalView2.getRootView();
                            Object tag = rootView.getTag(t9h0.metricsStateHolder);
                            if (tag == null) {
                                tag = new xva0();
                                rootView.setTag(t9h0.metricsStateHolder, tag);
                            }
                            yuf0 yuf0Var = ((xva0) tag).a;
                            if (yuf0Var != null) {
                                yuf0Var.I(str2);
                            }
                            View view = scootersCardV2ModalView2;
                            T t = ref$ObjectRef2.element;
                            view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v) {
                        }
                    };
                    ref$ObjectRef2.element = r22;
                    scootersCardV2ModalView2.addOnAttachStateChangeListener(r22);
                    return scootersCardV2ModalView2;
                }
                return coroutineSingletons;
            }
        }
        scootersCardV2Router$provideModalView$1 = new ScootersCardV2Router$provideModalView$1(this, continuationImpl);
        Object obj2 = scootersCardV2Router$provideModalView$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCardV2Router$provideModalView$1.label;
        if (i != 0) {
        }
        ScootersCardV2.ChargeConfig chargeConfig32 = ((g0) obj2).k.b;
        ukn0 ukn0Var22 = this.J;
        scootersCardV2Router$provideModalView$1.L$0 = o6n0Var2;
        scootersCardV2Router$provideModalView$1.L$1 = null;
        scootersCardV2Router$provideModalView$1.L$2 = str;
        scootersCardV2Router$provideModalView$1.L$3 = l6n0Var;
        scootersCardV2Router$provideModalView$1.L$4 = uan0Var;
        scootersCardV2Router$provideModalView$1.L$5 = chargeConfig32;
        scootersCardV2Router$provideModalView$1.label = 2;
        b = ukn0Var22.a.b(scootersCardV2Router$provideModalView$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
