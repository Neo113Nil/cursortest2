package com.yandex.go.platform.navigation.impl;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.navigation.impl.NavigatorViewHolderImpl$setBarVisibility$1", f = "NavigatorViewHolderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class NavigatorViewHolderImpl$setBarVisibility$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isVisible;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorViewHolderImpl$setBarVisibility$1(d dVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$isVisible = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorViewHolderImpl$setBarVisibility$1(this.this$0, this.$isVisible, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NavigatorViewHolderImpl$setBarVisibility$1 navigatorViewHolderImpl$setBarVisibility$1 = (NavigatorViewHolderImpl$setBarVisibility$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        navigatorViewHolderImpl$setBarVisibility$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.c().setVisibility(this.$isVisible ? 0 : 8);
        return zy11.a;
    }
}
