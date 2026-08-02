package com.yandex.go.tariffcard.interactor;

import com.yandex.go.tariffcard.experiment.RequirementsScrollButtonExperiment;
import defpackage.ems;
import defpackage.fnx0;
import defpackage.hdx0;
import defpackage.idx0;
import defpackage.jdx0;
import defpackage.jl40;
import defpackage.kdx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.xtx;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "firstRequirementItemIndex", "Lcom/yandex/go/tariffcard/interactor/TariffCardScrollButtonInteractor$TariffCardExpandState;", "tariffCardState", "Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment;", "experiment", "Lfnx0;", "selectedTariff", "Lxtx;", "lastVisibleItemState", "Lldx0;", "<anonymous>", "(ILcom/yandex/go/tariffcard/interactor/TariffCardScrollButtonInteractor$TariffCardExpandState;Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment;Lfnx0;Lxtx;)Lldx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.interactor.TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1", f = "TariffCardScrollButtonInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1 extends SuspendLambda implements ems {
    final /* synthetic */ String $title;
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1(String str, Continuation continuation) {
        super(6, continuation);
        this.$title = str;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int intValue = ((Number) obj).intValue();
        TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1 tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1 = new TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1(this.$title, (Continuation) obj6);
        tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1.I$0 = intValue;
        tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1.L$0 = (TariffCardScrollButtonInteractor$TariffCardExpandState) obj2;
        tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1.L$1 = (RequirementsScrollButtonExperiment) obj3;
        tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1.L$2 = (fnx0) obj4;
        tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1.L$3 = (xtx) obj5;
        return tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.I$0;
        TariffCardScrollButtonInteractor$TariffCardExpandState tariffCardScrollButtonInteractor$TariffCardExpandState = (TariffCardScrollButtonInteractor$TariffCardExpandState) this.L$0;
        RequirementsScrollButtonExperiment requirementsScrollButtonExperiment = (RequirementsScrollButtonExperiment) this.L$1;
        fnx0 fnx0Var = (fnx0) this.L$2;
        xtx xtxVar = (xtx) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(xtxVar.a, fnx0Var.c.b) && (i = xtxVar.b) != -1) {
            boolean z = i >= i2;
            int i3 = s.a[tariffCardScrollButtonInteractor$TariffCardExpandState.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                String str = this.$title;
                if (z) {
                    return new idx0(str, xtxVar.c);
                }
                RequirementsScrollButtonExperiment.ShowPolicy showPolicy = requirementsScrollButtonExperiment.c;
                return new kdx0(str, showPolicy.b, showPolicy.c);
            }
            if (!z) {
                return new jdx0(this.$title);
            }
        }
        return hdx0.a;
    }
}
