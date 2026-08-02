package com.yandex.go.mainscreen.superapp.orders.domain;

import defpackage.akt0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes12.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr[] a;

    public e(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1 superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1;
        int i;
        if (continuation instanceof SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1) {
            superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1 = (SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1) continuation;
            int i2 = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    akt0 akt0Var = new akt0(tprVarArr, 2);
                    SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$3 superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$3 = new SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$3(3, null);
                    superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.L$0 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.L$1 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.L$2 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, akt0Var, superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$3, superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1 = new SuperAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1(this, continuation);
        Object obj2 = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenOrdersUiStateInteractor$observeTrackingsUiState$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
