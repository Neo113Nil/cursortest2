package com.yandex.go.fallback_experiment;

import com.yandex.go.address.models.Address;
import com.yandex.go.fallback_experiment.network.FallbackExperimentParam;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.d0l0;
import defpackage.ep21;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/fallback_experiment/network/FallbackExperimentParam;", "<anonymous>", "(Ltse;)Lcom/yandex/go/fallback_experiment/network/FallbackExperimentParam;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.fallback_experiment.FallbackExperimentInteractorImpl$requestExperiment$param$1", f = "FallbackExperimentInteractorImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 52}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FallbackExperimentInteractorImpl$requestExperiment$param$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $scenarioName;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallbackExperimentInteractorImpl$requestExperiment$param$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$scenarioName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FallbackExperimentInteractorImpl$requestExperiment$param$1 fallbackExperimentInteractorImpl$requestExperiment$param$1 = new FallbackExperimentInteractorImpl$requestExperiment$param$1(this.this$0, this.$scenarioName, continuation);
        fallbackExperimentInteractorImpl$requestExperiment$param$1.L$0 = obj;
        return fallbackExperimentInteractorImpl$requestExperiment$param$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FallbackExperimentInteractorImpl$requestExperiment$param$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r11 == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        a aVar;
        FallbackExperimentParam.Point point;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        FallbackExperimentParam.Point point2 = null;
        if (i == 0) {
            b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new FallbackExperimentInteractorImpl$requestExperiment$param$1$routeDeferred$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new FallbackExperimentInteractorImpl$requestExperiment$param$1$userLocationDeferred$1(this.this$0, null), 3);
            aVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = aVar;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                point = (FallbackExperimentParam.Point) this.L$3;
                b.b(obj);
                mo21 A = vng.A((ep21) obj);
                if (A != null) {
                    this.this$0.getClass();
                    point2 = new FallbackExperimentParam.Point(A.a, A.b);
                }
                return new FallbackExperimentParam(point, point2, this.$scenarioName);
            }
            aVar = (a) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        }
        Address h3 = ((d0l0) obj).h();
        zzs B = h3 != null ? h3.B() : null;
        aVar.getClass();
        point = B == null ? null : new FallbackExperimentParam.Point(B.a, B.b);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = point;
        this.label = 2;
        obj = h.k(this);
    }
}
