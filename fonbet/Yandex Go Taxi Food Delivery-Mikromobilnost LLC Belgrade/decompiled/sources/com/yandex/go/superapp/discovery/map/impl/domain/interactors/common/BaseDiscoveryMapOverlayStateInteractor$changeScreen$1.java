package com.yandex.go.superapp.discovery.map.impl.domain.interactors.common;

import defpackage.c0d;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yz4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.domain.interactors.common.BaseDiscoveryMapOverlayStateInteractor$changeScreen$1", f = "BaseDiscoveryMapOverlayStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BaseDiscoveryMapOverlayStateInteractor$changeScreen$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDiscoveryMapOverlayStateInteractor$changeScreen$1(a aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseDiscoveryMapOverlayStateInteractor$changeScreen$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseDiscoveryMapOverlayStateInteractor$changeScreen$1 baseDiscoveryMapOverlayStateInteractor$changeScreen$1 = (BaseDiscoveryMapOverlayStateInteractor$changeScreen$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseDiscoveryMapOverlayStateInteractor$changeScreen$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        yz4 yz4Var = this.this$0.b;
        Object obj2 = this.$payload;
        r0 r0Var = yz4Var.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, c0d.a((c0d) value, obj2, null, null, 6)));
        return zy11.a;
    }
}
