package com.yandex.go.superapp.discovery.map.impl.ui.main.v2;

import defpackage.bzv0;
import defpackage.czv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qto;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lczv0;", "screenState", "", "areControlsVisible", "Lqto;", "<anonymous>", "(Lczv0;Z)Lqto;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2Presenter$subscribeGamificationState$4", f = "SuperAppDiscoveryMapV2Presenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapV2Presenter$subscribeGamificationState$4 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        SuperAppDiscoveryMapV2Presenter$subscribeGamificationState$4 superAppDiscoveryMapV2Presenter$subscribeGamificationState$4 = new SuperAppDiscoveryMapV2Presenter$subscribeGamificationState$4(3, (Continuation) obj3);
        superAppDiscoveryMapV2Presenter$subscribeGamificationState$4.L$0 = (czv0) obj;
        superAppDiscoveryMapV2Presenter$subscribeGamificationState$4.Z$0 = booleanValue;
        return superAppDiscoveryMapV2Presenter$subscribeGamificationState$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        czv0 czv0Var = (czv0) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        bzv0 bzv0Var = czv0Var instanceof bzv0 ? (bzv0) czv0Var : null;
        qto qtoVar = bzv0Var != null ? bzv0Var.a : null;
        if (z) {
            return qtoVar;
        }
        return null;
    }
}
