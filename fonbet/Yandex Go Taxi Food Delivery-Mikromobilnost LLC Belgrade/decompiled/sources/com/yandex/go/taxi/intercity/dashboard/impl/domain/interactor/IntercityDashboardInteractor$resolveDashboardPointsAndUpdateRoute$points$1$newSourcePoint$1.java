package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.dd61;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rgw;
import defpackage.sgw;
import defpackage.tgw;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltgw;", "<anonymous>", "(Ltse;)Ltgw;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newSourcePoint$1", f = "IntercityDashboardInteractor.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newSourcePoint$1 extends SuspendLambda implements wls {
    final /* synthetic */ tgw $sourcePoint;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newSourcePoint$1(tgw tgwVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$sourcePoint = tgwVar;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newSourcePoint$1(this.$sourcePoint, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardInteractor$resolveDashboardPointsAndUpdateRoute$points$1$newSourcePoint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tgw tgwVar = this.$sourcePoint;
            if (!(tgwVar instanceof rgw)) {
                return tgwVar;
            }
            rgw rgwVar = (rgw) this.$sourcePoint;
            zzs zzsVar2 = new zzs(rgwVar.a, rgwVar.b, 0, null, null, 28);
            ru.yandex.taxi.deeplinks.e eVar = this.this$0.m;
            this.L$0 = zzsVar2;
            this.label = 1;
            obj = eVar.e(zzsVar2, null, false, false, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            zzsVar = zzsVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzsVar = (zzs) this.L$0;
            kotlin.b.b(obj);
        }
        dd61 dd61Var = (dd61) obj;
        this.this$0.i.m(dd61Var.a(), zzsVar);
        return new sgw(dd61Var.a.a);
    }
}
