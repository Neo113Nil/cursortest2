package com.yandex.go.scooters.ignition.domain;

import defpackage.arn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qwo0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.tsn0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$5$needRefreshBeacons$1", f = "ScootersIgnitionExperimentListenerInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$5$needRefreshBeacons$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<List<String>> $groups;
    int label;
    final /* synthetic */ arn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$5$needRefreshBeacons$1(arn0 arn0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = arn0Var;
        this.$groups = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$5$needRefreshBeacons$1(this.this$0, this.$groups, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionExperimentListenerInteractor$onFirstContentfulPaint$5$needRefreshBeacons$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tsn0 tsn0Var = (tsn0) this.this$0.d.get();
        List<List<String>> list = this.$groups;
        qwo0 qwo0Var = tsn0Var.a;
        List w0 = kotlin.collections.a.w0((Set) qwo0Var.o.getValue(qwo0Var, qwo0.B[13]));
        List<List<String>> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.collections.a.X(kotlin.collections.a.w0((List) it.next()), ";", null, null, null, 62));
        }
        List w02 = kotlin.collections.a.w0(arrayList);
        if (w0.equals(w02)) {
            z = false;
        } else {
            qwo0Var.o.setValue(qwo0Var, qwo0.B[13], kotlin.collections.a.N0(w02));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
