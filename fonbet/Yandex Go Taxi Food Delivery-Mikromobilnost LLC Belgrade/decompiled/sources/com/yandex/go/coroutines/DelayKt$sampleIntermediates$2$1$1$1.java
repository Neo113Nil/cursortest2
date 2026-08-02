package com.yandex.go.coroutines;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.mi9;
import defpackage.mvg;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Loi9;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Loi9;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.DelayKt$sampleIntermediates$2$1$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DelayKt$sampleIntermediates$2$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<Object> $lastKnownValue;
    final /* synthetic */ Ref$BooleanRef $upstreamOpened;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelayKt$sampleIntermediates$2$1$1$1(Ref$ObjectRef ref$ObjectRef, Ref$BooleanRef ref$BooleanRef, Continuation continuation) {
        super(2, continuation);
        this.$lastKnownValue = ref$ObjectRef;
        this.$upstreamOpened = ref$BooleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DelayKt$sampleIntermediates$2$1$1$1 delayKt$sampleIntermediates$2$1$1$1 = new DelayKt$sampleIntermediates$2$1$1$1(this.$lastKnownValue, this.$upstreamOpened, continuation);
        delayKt$sampleIntermediates$2$1$1$1.L$0 = ((oi9) obj).a;
        return delayKt$sampleIntermediates$2$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DelayKt$sampleIntermediates$2$1$1$1 delayKt$sampleIntermediates$2$1$1$1 = (DelayKt$sampleIntermediates$2$1$1$1) create(new oi9(((oi9) obj).a), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        delayKt$sampleIntermediates$2$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r0 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Ref$ObjectRef<Object> ref$ObjectRef = this.$lastKnownValue;
        boolean z = r0 instanceof ni9;
        if (!z && ref$ObjectRef.element != r0) {
            ref$ObjectRef.element = r0;
        }
        Ref$BooleanRef ref$BooleanRef = this.$upstreamOpened;
        if (z) {
            ni9 ni9Var = oi9.b;
            ref$BooleanRef.element = false;
        }
        if (r0 instanceof mi9) {
            ni9 ni9Var2 = oi9.b;
            ref$BooleanRef.element = false;
        }
        return zy11.a;
    }
}
