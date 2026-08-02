package com.yandex.go.masstransit.sdk.ble.impl.fullscreen;

import defpackage.b36;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.fullscreen.BleVehiclesPermissionAnalyticsObserver$bind$1", f = "BleVehiclesPermissionAnalyticsObserver.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BleVehiclesPermissionAnalyticsObserver$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $uiStateFlow;
    int label;
    final /* synthetic */ b36 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleVehiclesPermissionAnalyticsObserver$bind$1(tpr tprVar, b36 b36Var, Continuation continuation) {
        super(2, continuation);
        this.$uiStateFlow = tprVar;
        this.this$0 = b36Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleVehiclesPermissionAnalyticsObserver$bind$1(this.$uiStateFlow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BleVehiclesPermissionAnalyticsObserver$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(new b(this.$uiStateFlow, this.this$0));
            xw4 xw4Var = new xw4(8, this.this$0);
            this.label = 1;
            if (t.collect(xw4Var, this) == coroutineSingletons) {
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
