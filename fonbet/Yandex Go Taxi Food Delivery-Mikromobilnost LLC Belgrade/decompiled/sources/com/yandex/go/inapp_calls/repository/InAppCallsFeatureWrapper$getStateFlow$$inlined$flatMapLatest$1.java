package com.yandex.go.inapp_calls.repository;

import com.yandex.go.dynamic.api.DynamicFeature;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1", f = "InAppCallsFeatureWrapper.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class InAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1 inAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1 = new InAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        inAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        inAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return inAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr bVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((Boolean) obj2).booleanValue()) {
                bVar = new g92(2, InAppCallsFeatureWrapper$State.UNAVAILABLE);
            } else if (this.this$0.j != null) {
                bVar = new g92(2, InAppCallsFeatureWrapper$State.READY);
            } else {
                bVar = new b(((com.yandex.go.dynamic.impl.b) this.this$0.c).j(DynamicFeature.INAPP_CALLS), this.this$0);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(bVar, vprVar, this) == coroutineSingletons) {
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
