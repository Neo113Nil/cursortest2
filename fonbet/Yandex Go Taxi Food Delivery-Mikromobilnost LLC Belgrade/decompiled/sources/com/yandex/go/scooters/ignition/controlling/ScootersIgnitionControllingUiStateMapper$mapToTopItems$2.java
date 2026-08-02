package com.yandex.go.scooters.ignition.controlling;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uqn0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lqqn0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiStateMapper$mapToTopItems$2", f = "ScootersIgnitionControllingUiStateMapper.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingUiStateMapper$mapToTopItems$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment $experiment;
    final /* synthetic */ boolean $firstShowing;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ uqn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingUiStateMapper$mapToTopItems$2(uqn0 uqn0Var, ScootersIgnitionExperiment scootersIgnitionExperiment, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$firstShowing = z;
        this.$experiment = scootersIgnitionExperiment;
        this.this$0 = uqn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        boolean z = this.$firstShowing;
        ScootersIgnitionControllingUiStateMapper$mapToTopItems$2 scootersIgnitionControllingUiStateMapper$mapToTopItems$2 = new ScootersIgnitionControllingUiStateMapper$mapToTopItems$2(this.this$0, this.$experiment, continuation, z);
        scootersIgnitionControllingUiStateMapper$mapToTopItems$2.L$0 = obj;
        return scootersIgnitionControllingUiStateMapper$mapToTopItems$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingUiStateMapper$mapToTopItems$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.$firstShowing;
            ScootersIgnitionExperiment scootersIgnitionExperiment = this.$experiment;
            if (z) {
                List list = scootersIgnitionExperiment.r.e;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (scootersIgnitionExperiment.r.a.b.contains(((ScootersIgnitionExperiment.Ui.InfoItem) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                List list2 = scootersIgnitionExperiment.r.e;
                arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (scootersIgnitionExperiment.r.b.b.contains(((ScootersIgnitionExperiment.Ui.InfoItem) obj3).a)) {
                        arrayList.add(obj3);
                    }
                }
            }
            uqn0 uqn0Var = this.this$0;
            ScootersIgnitionExperiment scootersIgnitionExperiment2 = this.$experiment;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(tje.h(tseVar, null, null, new ScootersIgnitionControllingUiStateMapper$mapToTopItems$2$1$1(uqn0Var, (ScootersIgnitionExperiment.Ui.InfoItem) it.next(), scootersIgnitionExperiment2, null), 3));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return kotlin.collections.a.M((Iterable) obj);
    }
}
