package com.yandex.go.superapp.discovery.map.impl.ui.main;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qto;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "areControlsVisible", "Lqto;", "districtState", "<anonymous>", "(ZLqto;)Lqto;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapPresenter$subscribeToExplorerState$3", f = "SuperAppDiscoveryMapPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapPresenter$subscribeToExplorerState$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SuperAppDiscoveryMapPresenter$subscribeToExplorerState$3 superAppDiscoveryMapPresenter$subscribeToExplorerState$3 = new SuperAppDiscoveryMapPresenter$subscribeToExplorerState$3(3, (Continuation) obj3);
        superAppDiscoveryMapPresenter$subscribeToExplorerState$3.Z$0 = booleanValue;
        superAppDiscoveryMapPresenter$subscribeToExplorerState$3.L$0 = (qto) obj2;
        return superAppDiscoveryMapPresenter$subscribeToExplorerState$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        qto qtoVar = (qto) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            return qtoVar;
        }
        return null;
    }
}
