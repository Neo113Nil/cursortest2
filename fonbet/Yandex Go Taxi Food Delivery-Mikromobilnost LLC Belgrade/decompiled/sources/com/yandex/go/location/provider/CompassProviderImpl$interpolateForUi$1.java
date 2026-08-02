package com.yandex.go.location.provider;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Liwc;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.location.provider.CompassProviderImpl$interpolateForUi$1", f = "CompassProviderImpl.kt", l = {482}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CompassProviderImpl$interpolateForUi$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_interpolateForUi;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompassProviderImpl$interpolateForUi$1(tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.$this_interpolateForUi = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CompassProviderImpl$interpolateForUi$1 compassProviderImpl$interpolateForUi$1 = new CompassProviderImpl$interpolateForUi$1(this.$this_interpolateForUi, continuation);
        compassProviderImpl$interpolateForUi$1.L$0 = obj;
        return compassProviderImpl$interpolateForUi$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompassProviderImpl$interpolateForUi$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = 0L;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            tpr tprVar = this.$this_interpolateForUi;
            e eVar = new e(ref$ObjectRef, ref$LongRef, y6f0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (tprVar.collect(eVar, this) == coroutineSingletons) {
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
