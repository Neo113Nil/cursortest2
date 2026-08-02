package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tgw;
import defpackage.tje;
import defpackage.tse;
import defpackage.ugw;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lugw;", "<anonymous>", "(Ltse;)Lugw;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1", f = "IntercityDashboardInteractor.kt", l = {217, 217}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1 extends SuspendLambda implements wls {
    final /* synthetic */ ugw $points;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1(ugw ugwVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$points = ugwVar;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1 intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1 = new IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1(this.$points, this.this$0, continuation);
        intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1.L$0 = obj;
        return intercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r10 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        tgw tgwVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newSourcePoint$1(this.$points.a, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newDestinationPoint$1(this.$points, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tgwVar = (tgw) this.L$4;
                kotlin.b.b(obj);
                return new ugw(tgwVar, (tgw) obj);
            }
            h = (noh) this.L$3;
            kotlin.b.b(obj);
        }
        tgw tgwVar2 = (tgw) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = tgwVar2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            tgwVar = tgwVar2;
            obj = k;
            return new ugw(tgwVar, (tgw) obj);
        }
        return coroutineSingletons;
    }
}
