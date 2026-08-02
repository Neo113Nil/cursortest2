package com.yandex.go.navigator.driving;

import com.yandex.go.address.models.Address;
import defpackage.a8l0;
import defpackage.gfl0;
import defpackage.mlm;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingRootRouter$DrivingModalExitListenerImpl$onAltRouteClicked$1", f = "DrivingRootRouter.kt", l = {296}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingRootRouter$DrivingModalExitListenerImpl$onAltRouteClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ mlm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingRootRouter$DrivingModalExitListenerImpl$onAltRouteClicked$1(mlm mlmVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mlmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivingRootRouter$DrivingModalExitListenerImpl$onAltRouteClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrivingRootRouter$DrivingModalExitListenerImpl$onAltRouteClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.navigator.domain.b bVar = this.this$0.M;
            this.label = 1;
            obj = bVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.S(new gfl0(new o8g0(a8l0.a, (Address) obj)));
        return zy11.a;
    }
}
