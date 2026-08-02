package com.yandex.go.platform.navigation.impl;

import defpackage.g050;
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
@mvg(c = "com.yandex.go.platform.navigation.impl.NavigatorViewHolderImpl$navigateTo$1", f = "NavigatorViewHolderImpl.kt", l = {343}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class NavigatorViewHolderImpl$navigateTo$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.go.platform.navigation.model.a $feature;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorViewHolderImpl$navigateTo$1(d dVar, com.yandex.go.platform.navigation.model.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$feature = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorViewHolderImpl$navigateTo$1(this.this$0, this.$feature, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorViewHolderImpl$navigateTo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        g050 g050Var;
        com.yandex.go.platform.navigation.model.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dVar = this.this$0;
            kotlinx.coroutines.sync.a aVar2 = dVar.m;
            com.yandex.go.platform.navigation.model.a aVar3 = this.$feature;
            this.L$0 = aVar2;
            this.L$1 = dVar;
            this.L$2 = aVar3;
            this.label = 1;
            if (aVar2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar2;
            aVar = aVar3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (com.yandex.go.platform.navigation.model.a) this.L$2;
            dVar = (d) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            d.a(dVar, aVar);
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
