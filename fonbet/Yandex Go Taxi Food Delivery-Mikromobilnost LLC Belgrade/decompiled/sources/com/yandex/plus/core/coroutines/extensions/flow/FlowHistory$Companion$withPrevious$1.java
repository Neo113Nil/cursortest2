package com.yandex.plus.core.coroutines.extensions.flow;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lvpr;", "Lhqr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.coroutines.extensions.flow.FlowHistory$Companion$withPrevious$1", f = "FlowHistory.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class FlowHistory$Companion$withPrevious$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_withPrevious;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowHistory$Companion$withPrevious$1(tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.$this_withPrevious = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowHistory$Companion$withPrevious$1 flowHistory$Companion$withPrevious$1 = new FlowHistory$Companion$withPrevious$1(this.$this_withPrevious, continuation);
        flowHistory$Companion$withPrevious$1.L$0 = obj;
        return flowHistory$Companion$withPrevious$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowHistory$Companion$withPrevious$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            tpr tprVar = this.$this_withPrevious;
            a aVar = new a(vprVar, z);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (tprVar.collect(aVar, this) == coroutineSingletons) {
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
