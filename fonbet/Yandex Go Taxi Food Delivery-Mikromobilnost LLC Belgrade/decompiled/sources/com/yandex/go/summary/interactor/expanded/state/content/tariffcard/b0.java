package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.i6v;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b0 implements vpr {
    public final /* synthetic */ vpr a;

    public b0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1 tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1;
        int i;
        if (continuation instanceof TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1) {
            tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1 = (TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1) continuation;
            int i2 = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((i6v) obj).b) {
                        tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.L$0 = null;
                        tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.L$1 = null;
                        tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.L$2 = null;
                        tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.L$3 = null;
                        tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.label = 1;
                        if (this.a.emit(obj, tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1 = new TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1(this, continuation);
        Object obj22 = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
