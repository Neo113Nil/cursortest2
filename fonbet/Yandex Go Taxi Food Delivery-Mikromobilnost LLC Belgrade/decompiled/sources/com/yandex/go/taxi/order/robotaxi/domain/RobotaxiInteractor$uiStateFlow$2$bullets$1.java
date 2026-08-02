package com.yandex.go.taxi.order.robotaxi.domain;

import defpackage.bvf0;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qvk0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lxss0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.robotaxi.domain.RobotaxiInteractor$uiStateFlow$2$bullets$1", f = "RobotaxiInteractor.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RobotaxiInteractor$uiStateFlow$2$bullets$1 extends SuspendLambda implements wls {
    final /* synthetic */ ief $currencyRules;
    final /* synthetic */ qvk0 $model;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotaxiInteractor$uiStateFlow$2$bullets$1(c cVar, qvk0 qvk0Var, ief iefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$model = qvk0Var;
        this.$currencyRules = iefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RobotaxiInteractor$uiStateFlow$2$bullets$1(this.this$0, this.$model, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RobotaxiInteractor$uiStateFlow$2$bullets$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        List list = this.$model.c;
        ief iefVar = this.$currencyRules;
        fef h = iefVar != null ? gwk0.h(iefVar) : null;
        this.label = 1;
        cVar.getClass();
        Object n = bvf0.n(new RobotaxiInteractor$mapBulletSlots$2(list, cVar, h, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
