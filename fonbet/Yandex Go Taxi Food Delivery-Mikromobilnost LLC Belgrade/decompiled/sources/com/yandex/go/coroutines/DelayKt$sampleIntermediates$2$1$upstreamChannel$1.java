package com.yandex.go.coroutines;

import defpackage.gph;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.DelayKt$sampleIntermediates$2$1$upstreamChannel$1", f = "Delay.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DelayKt$sampleIntermediates$2$1$upstreamChannel$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_sampleIntermediates;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelayKt$sampleIntermediates$2$1$upstreamChannel$1(tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.$this_sampleIntermediates = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DelayKt$sampleIntermediates$2$1$upstreamChannel$1 delayKt$sampleIntermediates$2$1$upstreamChannel$1 = new DelayKt$sampleIntermediates$2$1$upstreamChannel$1(this.$this_sampleIntermediates, continuation);
        delayKt$sampleIntermediates$2$1$upstreamChannel$1.L$0 = obj;
        return delayKt$sampleIntermediates$2$1$upstreamChannel$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DelayKt$sampleIntermediates$2$1$upstreamChannel$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_sampleIntermediates;
            gph gphVar = new gph(y6f0Var, 0);
            this.L$0 = null;
            this.label = 1;
            if (tprVar.collect(gphVar, this) == coroutineSingletons) {
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
