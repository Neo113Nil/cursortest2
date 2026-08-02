package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.tariffcard.experiment.RequirementsScrollButtonExperiment;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "experiment", "Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment;", "usageCount", "", "isUsedInSession"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.ScrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1", f = "ScrollButtonUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ScrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ScrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1 scrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1 = new ScrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1(4, (Continuation) obj4);
        scrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1.L$0 = (RequirementsScrollButtonExperiment) obj;
        scrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1.I$0 = intValue;
        scrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1.Z$0 = booleanValue;
        return scrollButtonUiStateInteractor$isScrollButtonEnabledFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RequirementsScrollButtonExperiment requirementsScrollButtonExperiment = (RequirementsScrollButtonExperiment) this.L$0;
        int i = this.I$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(requirementsScrollButtonExperiment.getB() && i < requirementsScrollButtonExperiment.c.a && !z);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
