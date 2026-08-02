package com.yandex.go.superapp.discovery.map.impl.navigation;

import defpackage.htv0;
import defpackage.kag;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.navigation.SuperAppDiscoveryMapRouterImpl$focusMap$1", f = "SuperAppDiscoveryMapRouterImpl.kt", l = {278}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapRouterImpl$focusMap$1 extends SuspendLambda implements wls {
    final /* synthetic */ htv0 $this_focusMap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapRouterImpl$focusMap$1(htv0 htv0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_focusMap = htv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapRouterImpl$focusMap$1(this.$this_focusMap, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapRouterImpl$focusMap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.superapp.discovery.map.impl.domain.interactors.c cVar = (com.yandex.go.superapp.discovery.map.impl.domain.interactors.c) ((kag) this.$this_focusMap).K.get();
            this.label = 1;
            if (cVar.d(this) == coroutineSingletons) {
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
