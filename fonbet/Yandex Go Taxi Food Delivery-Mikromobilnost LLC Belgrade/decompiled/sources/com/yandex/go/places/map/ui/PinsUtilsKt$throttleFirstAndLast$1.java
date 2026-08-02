package com.yandex.go.places.map.ui;

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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.ui.PinsUtilsKt$throttleFirstAndLast$1", f = "PinsUtils.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PinsUtilsKt$throttleFirstAndLast$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $durationMillis;
    final /* synthetic */ tpr $this_throttleFirstAndLast;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinsUtilsKt$throttleFirstAndLast$1(tpr tprVar, long j, Continuation continuation) {
        super(2, continuation);
        this.$this_throttleFirstAndLast = tprVar;
        this.$durationMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PinsUtilsKt$throttleFirstAndLast$1 pinsUtilsKt$throttleFirstAndLast$1 = new PinsUtilsKt$throttleFirstAndLast$1(this.$this_throttleFirstAndLast, this.$durationMillis, continuation);
        pinsUtilsKt$throttleFirstAndLast$1.L$0 = obj;
        return pinsUtilsKt$throttleFirstAndLast$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinsUtilsKt$throttleFirstAndLast$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            tpr tprVar = this.$this_throttleFirstAndLast;
            a aVar = new a(ref$LongRef, this.$durationMillis, y6f0Var, ref$ObjectRef, ref$ObjectRef2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
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
