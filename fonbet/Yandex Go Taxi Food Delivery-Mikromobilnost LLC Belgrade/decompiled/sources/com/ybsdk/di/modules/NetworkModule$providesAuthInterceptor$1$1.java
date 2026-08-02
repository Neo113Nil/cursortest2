package com.ybsdk.di.modules;

import com.ybsdk.common.StartSessionCallSource;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vrp0;
import defpackage.wls;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.di.modules.NetworkModule$providesAuthInterceptor$1$1", f = "NetworkModule.kt", l = {210}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class NetworkModule$providesAuthInterceptor$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yvf0 $sdkStateDispatcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkModule$providesAuthInterceptor$1$1(yvf0 yvf0Var, Continuation continuation) {
        super(2, continuation);
        this.$sdkStateDispatcher = yvf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NetworkModule$providesAuthInterceptor$1$1(this.$sdkStateDispatcher, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkModule$providesAuthInterceptor$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vrp0 b = ((com.ybsdk.common.e) this.$sdkStateDispatcher.get()).b(null, StartSessionCallSource.AuthInterceptor.INSTANCE, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.A(b, this) == coroutineSingletons) {
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
