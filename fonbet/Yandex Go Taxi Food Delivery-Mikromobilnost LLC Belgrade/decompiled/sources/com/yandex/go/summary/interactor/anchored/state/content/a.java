package com.yandex.go.summary.interactor.anchored.state.content;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements tpr {
    public final /* synthetic */ tpr[] a;

    public a(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AnchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1 anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1;
        int i;
        if (continuation instanceof AnchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1) {
            anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1 = (AnchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1) continuation;
            int i2 = anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 3);
                    AnchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$3 anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$3 = new AnchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$3(3, null);
                    anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.L$0 = null;
                    anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.L$1 = null;
                    anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.L$2 = null;
                    anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, v10Var, anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$3, anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1 = new AnchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1(this, continuation);
        Object obj2 = anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredSummaryContentUiStateInteractor$special$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
