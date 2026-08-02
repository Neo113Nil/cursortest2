package com.yandex.go.payments.shared.family.viewmodels;

import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/payments/shared/family/experiments/FamilyGroupV2Experiment;", "experiment", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lsap;", "<anonymous>", "(Lcom/yandex/go/payments/shared/family/experiments/FamilyGroupV2Experiment;Lru/yandex/taxi/theme/ThemeType;)Lsap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.viewmodels.FamilyGroupMenuItemInteractorImpl$state$1", f = "FamilyGroupMenuItemInteractorImpl.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class FamilyGroupMenuItemInteractorImpl$state$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyGroupMenuItemInteractorImpl$state$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FamilyGroupMenuItemInteractorImpl$state$1 familyGroupMenuItemInteractorImpl$state$1 = new FamilyGroupMenuItemInteractorImpl$state$1(this.this$0, (Continuation) obj3);
        familyGroupMenuItemInteractorImpl$state$1.L$0 = (FamilyGroupV2Experiment) obj;
        return familyGroupMenuItemInteractorImpl$state$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FamilyGroupV2Experiment familyGroupV2Experiment = (FamilyGroupV2Experiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        this.L$0 = null;
        this.label = 1;
        cVar.getClass();
        Object n = bvf0.n(new FamilyGroupMenuItemInteractorImpl$createState$2(familyGroupV2Experiment, cVar, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
