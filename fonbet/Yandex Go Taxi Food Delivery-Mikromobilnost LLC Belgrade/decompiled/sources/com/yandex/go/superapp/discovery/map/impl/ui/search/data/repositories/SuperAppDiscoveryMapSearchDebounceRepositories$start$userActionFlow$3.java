package com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.txv0;
import defpackage.wls;
import defpackage.ywv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lywv0;", "it", "Lzy11;", "<anonymous>", "(Lywv0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3", f = "SuperAppDiscoveryMapSearchDebounceRepositories.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ tls $render;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3(tls tlsVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$render = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3 superAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3 = new SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3(this.$render, this.this$0, continuation);
        superAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3.L$0 = obj;
        return superAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3 superAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3 = (SuperAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3) create((ywv0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppDiscoveryMapSearchDebounceRepositories$start$userActionFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ywv0 ywv0Var = (ywv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.this$0.c) {
            this.$render.invoke(new txv0(ywv0Var.a()));
        }
        this.this$0.c = true;
        return zy11.a;
    }
}
