package com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tls;
import defpackage.vpr;
import defpackage.ywv0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.SuperAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1", f = "SuperAppDiscoveryMapSearchDebounceRepositories.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tls $render$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1(tls tlsVar, c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
        this.$render$inlined = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = this.this$0;
        SuperAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1 superAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1 = new SuperAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1(this.$render$inlined, cVar, (Continuation) obj3);
        superAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        superAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1.L$1 = obj2;
        return superAppDiscoveryMapSearchDebounceRepositories$start$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 rol0Var = new rol0(new SuperAppDiscoveryMapSearchDebounceRepositories$start$1$1(this.this$0, (ywv0) obj2, this.$render$inlined, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(rol0Var, vprVar, this) == coroutineSingletons) {
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
