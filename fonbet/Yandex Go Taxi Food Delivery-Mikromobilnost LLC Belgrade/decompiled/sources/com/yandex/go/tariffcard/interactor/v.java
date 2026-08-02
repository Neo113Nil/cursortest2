package com.yandex.go.tariffcard.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class v implements vpr {
    public final /* synthetic */ vpr a;

    public v(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1 tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1) {
            tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1 = (TariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TariffCardScrollButtonInteractor$TariffCardExpandState tariffCardScrollButtonInteractor$TariffCardExpandState = TariffCardScrollButtonInteractor$TariffCardExpandState.EXPANDED_AT_LEAST_ONCE;
                    tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(tariffCardScrollButtonInteractor$TariffCardExpandState, tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1 = new TariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardScrollButtonInteractor$getTariffCardStateFlow$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
