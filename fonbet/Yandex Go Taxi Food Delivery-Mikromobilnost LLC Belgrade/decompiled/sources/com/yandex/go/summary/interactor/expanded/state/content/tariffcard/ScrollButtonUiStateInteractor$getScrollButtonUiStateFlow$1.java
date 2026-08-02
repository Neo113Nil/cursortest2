package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.summary.model.LastVisibleTariffCardItemOrigin;
import com.yandex.go.tariffcard.experiment.RequirementsScrollButtonExperiment;
import defpackage.bux;
import defpackage.dms;
import defpackage.hhp0;
import defpackage.jhp0;
import defpackage.kb5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ob5;
import defpackage.odj0;
import defpackage.pb5;
import defpackage.scc;
import defpackage.w511;
import defpackage.wu1;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lodj0;", "firstRequirementOrCarouselIndex", "Lkotlin/Pair;", "Lkb5;", "", "<destruct>", "Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment;", "experiment", "Lbux;", "lastVisibleTariffCardItem", "Ljhp0;", "<anonymous>", "(Lodj0;Lkotlin/Pair;Lcom/yandex/go/tariffcard/experiment/RequirementsScrollButtonExperiment;Lbux;)Ljhp0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1", f = "ScrollButtonUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1 extends SuspendLambda implements dms {
    final /* synthetic */ String $title;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1(String str, Continuation continuation) {
        super(5, continuation);
        this.$title = str;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1 scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1 = new ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1(this.$title, (Continuation) obj5);
        scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1.L$0 = (odj0) obj;
        scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1.L$1 = (Pair) obj2;
        scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1.L$2 = (RequirementsScrollButtonExperiment) obj3;
        scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1.L$3 = (bux) obj4;
        return scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TariffOrderFlow tariffOrderFlow;
        int i;
        odj0 odj0Var = (odj0) this.L$0;
        Pair pair = (Pair) this.L$1;
        RequirementsScrollButtonExperiment requirementsScrollButtonExperiment = (RequirementsScrollButtonExperiment) this.L$2;
        bux buxVar = (bux) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kb5 kb5Var = (kb5) pair.getFirst();
        boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
        kb5 kb5Var2 = odj0Var.b;
        boolean z = booleanValue && kb5Var.a(kb5Var2);
        ob5 ob5Var = buxVar.a;
        LastVisibleTariffCardItemOrigin lastVisibleTariffCardItemOrigin = buxVar.c;
        String str = ob5Var.a;
        String str2 = ob5Var.b;
        wu1 wu1Var = ob5Var.c;
        switch (pb5.b[ob5Var.d.ordinal()]) {
            case 1:
                tariffOrderFlow = TariffOrderFlow.DRIVE_FLOW;
                break;
            case 2:
                tariffOrderFlow = TariffOrderFlow.TAXI_FLOW;
                break;
            case 3:
                tariffOrderFlow = TariffOrderFlow.SHUTTLE_FLOW;
                break;
            case 4:
                tariffOrderFlow = TariffOrderFlow.DELIVERY_FLOW;
                break;
            case 5:
                tariffOrderFlow = TariffOrderFlow.COPTER_FLOW;
                break;
            case 6:
                tariffOrderFlow = TariffOrderFlow.COPTER_CITY_TOUR_FLOW;
                break;
            default:
                w511.b();
                return null;
        }
        List g = scc.g(kb5Var2, new kb5(str, str2, wu1Var, tariffOrderFlow, false, 48), kb5Var);
        kb5 kb5Var3 = (kb5) kotlin.collections.a.S(0, g);
        if (kb5Var3 != null) {
            List list = g;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((kb5) it.next()).a(kb5Var3)) {
                        return new jhp0(null, kb5Var2, z, lastVisibleTariffCardItemOrigin);
                    }
                }
            }
        }
        if (booleanValue && (i = buxVar.b) != -1) {
            if (i >= odj0Var.a) {
                return new jhp0(null, kb5Var2, true, lastVisibleTariffCardItemOrigin);
            }
            String str3 = this.$title;
            RequirementsScrollButtonExperiment.ShowPolicy showPolicy = requirementsScrollButtonExperiment.c;
            return new jhp0(new hhp0(str3, showPolicy.b, showPolicy.c), kb5Var2, z, lastVisibleTariffCardItemOrigin);
        }
        return new jhp0(null, kb5Var2, z, lastVisibleTariffCardItemOrigin);
    }
}
