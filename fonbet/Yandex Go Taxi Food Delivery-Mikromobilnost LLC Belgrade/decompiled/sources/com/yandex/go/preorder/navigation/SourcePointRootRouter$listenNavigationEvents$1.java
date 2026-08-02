package com.yandex.go.preorder.navigation;

import defpackage.aft0;
import defpackage.cc60;
import defpackage.h0g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tht0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.navigation.SourcePointRootRouter$listenNavigationEvents$1", f = "SourcePointRootRouter.kt", l = {824}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SourcePointRootRouter$listenNavigationEvents$1 extends SuspendLambda implements tls {
    final /* synthetic */ aft0 $component;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointRootRouter$listenNavigationEvents$1(aft0 aft0Var, n nVar, Continuation continuation) {
        super(1, continuation);
        this.$component = aft0Var;
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SourcePointRootRouter$listenNavigationEvents$1(this.$component, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SourcePointRootRouter$listenNavigationEvents$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k kVar = new k(((cc60) ((h0g) this.$component).v0.get()).c);
            n nVar = this.this$0;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(kVar, new SourcePointRootRouter$listenNavigationEvents$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            tht0 tht0Var = new tht0(nVar, 0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(tht0Var, this) == coroutineSingletons) {
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
