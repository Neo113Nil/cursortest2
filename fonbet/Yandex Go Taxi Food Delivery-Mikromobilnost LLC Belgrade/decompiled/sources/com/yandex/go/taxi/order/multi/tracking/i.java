package com.yandex.go.taxi.order.multi.tracking;

import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.a850;
import defpackage.ad5;
import defpackage.clk0;
import defpackage.ffx;
import defpackage.grq;
import defpackage.hrq;
import defpackage.jok0;
import defpackage.mjg0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v311;
import defpackage.w0y0;
import defpackage.x6y0;
import defpackage.xu70;
import defpackage.y3y0;
import defpackage.y6y0;
import defpackage.yxx0;
import defpackage.zd80;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class i extends ad5 {
    public final jok0 A;
    public final mjg0 B;
    public final xu70 C;
    public final clk0 D;
    public final w0y0 E;
    public final a850 F;
    public final tt2 G;
    public final zd80 H;
    public final v311 I;
    public final y3y0 J;
    public final com.yandex.go.taxi.order.perf.a K;
    public final yxx0 L;
    public final grq M;
    public final n0 N;
    public pzt0 O;
    public boolean P;
    public final ru.yandex.taxi.multiorder.e x;
    public final com.yandex.go.order.ui.order_list_modal_height.presentation.a y;
    public final f0 z;

    public i(ru.yandex.taxi.multiorder.e eVar, com.yandex.go.order.ui.order_list_modal_height.presentation.a aVar, f0 f0Var, jok0 jok0Var, mjg0 mjg0Var, xu70 xu70Var, clk0 clk0Var, w0y0 w0y0Var, a850 a850Var, tt2 tt2Var, zd80 zd80Var, v311 v311Var, y3y0 y3y0Var, com.yandex.go.taxi.order.perf.a aVar2, yxx0 yxx0Var, grq grqVar) {
        super(x6y0.class);
        this.x = eVar;
        this.y = aVar;
        this.z = f0Var;
        this.A = jok0Var;
        this.B = mjg0Var;
        this.C = xu70Var;
        this.D = clk0Var;
        this.E = w0y0Var;
        this.F = a850Var;
        this.G = tt2Var;
        this.H = zd80Var;
        this.I = v311Var;
        this.J = y3y0Var;
        this.K = aVar2;
        this.L = yxx0Var;
        this.M = grqVar;
        this.N = ffx.b(0, 1, BufferOverflow.DROP_LATEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(i iVar, ContinuationImpl continuationImpl) {
        TaxiOrderTrackingPresenter$subscribePresenceMonitoring$1 taxiOrderTrackingPresenter$subscribePresenceMonitoring$1;
        int i;
        iVar.getClass();
        if (continuationImpl instanceof TaxiOrderTrackingPresenter$subscribePresenceMonitoring$1) {
            taxiOrderTrackingPresenter$subscribePresenceMonitoring$1 = (TaxiOrderTrackingPresenter$subscribePresenceMonitoring$1) continuationImpl;
            int i2 = taxiOrderTrackingPresenter$subscribePresenceMonitoring$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderTrackingPresenter$subscribePresenceMonitoring$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderTrackingPresenter$subscribePresenceMonitoring$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderTrackingPresenter$subscribePresenceMonitoring$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TaxiOrderPerfTweaksExperiment.DelayType delayType = ((com.yandex.go.taxi.order.perf.experiment.d) iVar.J).b().d;
                    int i3 = delayType == null ? -1 : com.yandex.go.taxi.order.perf.experiment.c.a[delayType.ordinal()];
                    TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : TaxiOrderSessionCheckpoint.LCP : TaxiOrderSessionCheckpoint.LCP_DEFAULTS : TaxiOrderSessionCheckpoint.FCP;
                    com.yandex.go.taxi.order.perf.a aVar = iVar.K;
                    y6y0 y6y0Var = new y6y0(0);
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$1.L$0 = null;
                    taxiOrderTrackingPresenter$subscribePresenceMonitoring$1.label = 1;
                    if (aVar.a(taxiOrderSessionCheckpoint, y6y0Var, taxiOrderTrackingPresenter$subscribePresenceMonitoring$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(new mth(iVar.z.q, 6), new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$flatMapLatest$1(3, null));
                kotlinx.coroutines.flow.internal.g X2 = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new d(X), new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$flatMapLatest$2(iVar, null))), new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$flatMapLatest$3(iVar, null));
                iVar.G.getClass();
                tje.N(iVar.Jg(), null, null, new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$collectLatestIn$1(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.F(X2, uyj.a), kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new n(X, new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$3(iVar, null)), new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$flatMapLatest$4(iVar, null))), ((hrq) iVar.M).b, new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$5(iVar, null))), null, (x6y0) iVar.Dg()), 3);
                return zy11.a;
            }
        }
        taxiOrderTrackingPresenter$subscribePresenceMonitoring$1 = new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$1(iVar, continuationImpl);
        Object obj2 = taxiOrderTrackingPresenter$subscribePresenceMonitoring$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderTrackingPresenter$subscribePresenceMonitoring$1.label;
        if (i != 0) {
        }
        kotlinx.coroutines.flow.internal.g X3 = kotlinx.coroutines.flow.e.X(new mth(iVar.z.q, 6), new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$flatMapLatest$1(3, null));
        kotlinx.coroutines.flow.internal.g X22 = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new d(X3), new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$flatMapLatest$2(iVar, null))), new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$flatMapLatest$3(iVar, null));
        iVar.G.getClass();
        tje.N(iVar.Jg(), null, null, new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$collectLatestIn$1(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.F(X22, uyj.a), kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new n(X3, new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$3(iVar, null)), new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$$inlined$flatMapLatest$4(iVar, null))), ((hrq) iVar.M).b, new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$5(iVar, null))), null, (x6y0) iVar.Dg()), 3);
        return zy11.a;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        this.y.d.b();
        r0 r0Var = this.z.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        super.Cg();
    }
}
