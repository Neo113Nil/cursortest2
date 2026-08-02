package com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.uxv0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ywv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.SuperAppDiscoveryMapSearchDebounceRepositories$start$1$1", f = "SuperAppDiscoveryMapSearchDebounceRepositories.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapSearchDebounceRepositories$start$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ywv0 $it;
    final /* synthetic */ tls $render;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchDebounceRepositories$start$1$1(c cVar, ywv0 ywv0Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$it = ywv0Var;
        this.$render = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapSearchDebounceRepositories$start$1$1(this.this$0, this.$it, this.$render, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapSearchDebounceRepositories$start$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.a;
            ywv0 ywv0Var = this.$it;
            this.label = 1;
            obj = dVar.a(ywv0Var, this);
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
        uxv0 uxv0Var = (uxv0) obj;
        this.this$0.d = uxv0Var;
        this.$render.invoke(uxv0Var);
        this.this$0.c = false;
        return zy11.a;
    }
}
