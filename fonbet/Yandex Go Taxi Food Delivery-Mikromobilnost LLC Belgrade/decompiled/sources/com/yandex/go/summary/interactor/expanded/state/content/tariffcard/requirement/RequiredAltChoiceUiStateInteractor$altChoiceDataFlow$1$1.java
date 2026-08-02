package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.bms;
import defpackage.fnx0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.paj0;
import defpackage.pu1;
import defpackage.vfx0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lpaj0;", "altChoiceSections", "", "selectedKey", "selectedDeliverySlot", "Lf6v;", "Lufx0;", "Lpu1;", "<anonymous>", "(Lpaj0;Ljava/lang/String;Ljava/lang/String;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1", f = "RequiredAltChoiceUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1 extends SuspendLambda implements bms {
    final /* synthetic */ fnx0 $tariffSelection;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1(b0 b0Var, fnx0 fnx0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = b0Var;
        this.$tariffSelection = fnx0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1 requiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1 = new RequiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1(this.this$0, this.$tariffSelection, (Continuation) obj4);
        requiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1.L$0 = (paj0) obj;
        requiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1.L$1 = (String) obj2;
        requiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1.L$2 = (String) obj3;
        return requiredAltChoiceUiStateInteractor$altChoiceDataFlow$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        paj0 paj0Var = (paj0) this.L$0;
        String str = (String) this.L$1;
        String str2 = (String) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pu1 pu1Var = new pu1(paj0Var, str, str2);
        vfx0 vfx0Var = this.this$0.a;
        mi31 mi31Var = this.$tariffSelection.a;
        vfx0Var.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(pu1Var, vfx0.a(mi31Var));
    }
}
