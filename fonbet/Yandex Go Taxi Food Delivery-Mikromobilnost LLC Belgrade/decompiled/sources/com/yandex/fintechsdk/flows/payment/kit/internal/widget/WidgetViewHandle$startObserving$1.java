package com.yandex.fintechsdk.flows.payment.kit.internal.widget;

import defpackage.ey4;
import defpackage.g801;
import defpackage.mvg;
import defpackage.nc31;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.widget.WidgetViewHandle$startObserving$1", f = "WidgetViewHandle.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WidgetViewHandle$startObserving$1 extends SuspendLambda implements wls {
    final /* synthetic */ tse $scope;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetViewHandle$startObserving$1(e eVar, tse tseVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$scope = tseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WidgetViewHandle$startObserving$1(this.this$0, this.$scope, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WidgetViewHandle$startObserving$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0.d;
            tpr F = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.c(aVar.e.b.a), aVar.b);
            e eVar = this.this$0;
            h K = kotlinx.coroutines.flow.e.K(new ey4(new g801(8, F, eVar), 28), eVar.a.getExternalReloadTrigger());
            nc31 nc31Var = new nc31(2, this.this$0, this.$scope);
            this.label = 1;
            if (K.collect(nc31Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
