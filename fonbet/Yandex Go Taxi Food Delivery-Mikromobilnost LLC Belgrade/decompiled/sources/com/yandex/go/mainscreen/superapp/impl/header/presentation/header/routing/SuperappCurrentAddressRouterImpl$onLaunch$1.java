package com.yandex.go.mainscreen.superapp.impl.header.presentation.header.routing;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u9w0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.header.presentation.header.routing.SuperappCurrentAddressRouterImpl$onLaunch$1", f = "SuperappCurrentAddressRouterImpl.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperappCurrentAddressRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ u9w0 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappCurrentAddressRouterImpl$onLaunch$1(a aVar, u9w0 u9w0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = u9w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappCurrentAddressRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappCurrentAddressRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            u9w0 u9w0Var = this.$payload;
            this.label = 1;
            if (a.P(aVar, u9w0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
