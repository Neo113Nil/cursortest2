package com.yandex.plus.core.benchmark;

import defpackage.ll5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rl5;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.benchmark.BaseBenchmarker$trackBenchmark$1", f = "BaseBenchmarker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class BaseBenchmarker$trackBenchmark$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, Object> $additionalParams;
    final /* synthetic */ ll5 $benchmark;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBenchmarker$trackBenchmark$1(a aVar, ll5 ll5Var, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$benchmark = ll5Var;
        this.$additionalParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseBenchmarker$trackBenchmark$1(this.this$0, this.$benchmark, this.$additionalParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseBenchmarker$trackBenchmark$1 baseBenchmarker$trackBenchmark$1 = (BaseBenchmarker$trackBenchmark$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseBenchmarker$trackBenchmark$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = (List) this.this$0.e.getValue();
        ll5 ll5Var = this.$benchmark;
        Map<String, Object> map = this.$additionalParams;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((rl5) it.next()).b(ll5Var, map);
        }
        return zy11.a;
    }
}
