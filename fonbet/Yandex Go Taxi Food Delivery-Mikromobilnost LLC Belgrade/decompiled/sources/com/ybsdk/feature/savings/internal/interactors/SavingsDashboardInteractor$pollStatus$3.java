package com.ybsdk.feature.savings.internal.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attempNumber", "Lkotlin/Result;", "Liyd0;", "Liam0;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.SavingsDashboardInteractor$pollStatus$3", f = "SavingsDashboardInteractor.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsDashboardInteractor$pollStatus$3 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $additionalData;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardInteractor$pollStatus$3(f fVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$additionalData = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsDashboardInteractor$pollStatus$3 savingsDashboardInteractor$pollStatus$3 = new SavingsDashboardInteractor$pollStatus$3(this.this$0, this.$additionalData, continuation);
        savingsDashboardInteractor$pollStatus$3.I$0 = ((tq11) obj).a;
        return savingsDashboardInteractor$pollStatus$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        SavingsDashboardInteractor$pollStatus$3 savingsDashboardInteractor$pollStatus$3 = new SavingsDashboardInteractor$pollStatus$3(this.this$0, this.$additionalData, (Continuation) obj2);
        savingsDashboardInteractor$pollStatus$3.I$0 = i;
        return savingsDashboardInteractor$pollStatus$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            f fVar = this.this$0;
            tq11 tq11Var = new tq11(i2);
            Map<String, String> map = this.$additionalData;
            this.label = 1;
            a = fVar.a(tq11Var, map, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
