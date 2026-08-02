package com.yandex.messaging.domain.experiments;

import com.yandex.messaging.core.net.entities.GetExperimentsResponse;
import com.yandex.messaging.core.net.entities.TestIdData;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tgy0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.experiments.ExperimentsController$applyExperiments$1", f = "ExperimentsController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ExperimentsController$applyExperiments$1 extends SuspendLambda implements wls {
    final /* synthetic */ GetExperimentsResponse $response;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsController$applyExperiments$1(a aVar, GetExperimentsResponse getExperimentsResponse, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = getExperimentsResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExperimentsController$applyExperiments$1(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ExperimentsController$applyExperiments$1 experimentsController$applyExperiments$1 = (ExperimentsController$applyExperiments$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        experimentsController$applyExperiments$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.d.a.reportEvent("ab_experiments_received", gw00.e(new Pair("names", kotlin.collections.a.J0(this.$response.getFlags().a.keySet()))));
        this.this$0.g(this.$response.getFlags());
        tgy0 tgy0Var = this.this$0.e;
        List<TestIdData> testIds = this.$response.getTestIds();
        ArrayList arrayList = new ArrayList(tcc.n(testIds, 10));
        Iterator<T> it = testIds.iterator();
        while (it.hasNext()) {
            arrayList.add(((TestIdData) it.next()).getTestId());
        }
        tgy0Var.a(kotlin.collections.a.N0(arrayList));
        return zy11.a;
    }
}
