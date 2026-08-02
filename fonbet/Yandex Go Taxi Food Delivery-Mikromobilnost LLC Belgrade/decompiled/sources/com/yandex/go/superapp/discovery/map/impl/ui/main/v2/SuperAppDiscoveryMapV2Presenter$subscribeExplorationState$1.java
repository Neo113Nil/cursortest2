package com.yandex.go.superapp.discovery.map.impl.ui.main.v2;

import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vyv0;
import defpackage.wls;
import defpackage.wyv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2Presenter$subscribeExplorationState$1", f = "SuperAppDiscoveryMapV2Presenter.kt", l = {299}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapV2Presenter$subscribeExplorationState$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wyv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapV2Presenter$subscribeExplorationState$1(wyv0 wyv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wyv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppDiscoveryMapV2Presenter$subscribeExplorationState$1 superAppDiscoveryMapV2Presenter$subscribeExplorationState$1 = new SuperAppDiscoveryMapV2Presenter$subscribeExplorationState$1(this.this$0, continuation);
        superAppDiscoveryMapV2Presenter$subscribeExplorationState$1.L$0 = obj;
        return superAppDiscoveryMapV2Presenter$subscribeExplorationState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapV2Presenter$subscribeExplorationState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gci0 a = this.this$0.Mg().a(tseVar);
            vyv0 vyv0Var = new vyv0(this.this$0, 6);
            this.L$0 = null;
            this.label = 1;
            if (a.a.collect(vyv0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
