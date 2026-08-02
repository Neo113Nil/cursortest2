package com.yandex.go.tariffcard.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.y7r;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ x b;

    public q(vpr vprVar, x xVar) {
        this.a = vprVar;
        this.b = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1 tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1) {
            tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1 = (TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.g.getClass();
                    Integer num = new Integer(y7r.a((List) obj));
                    tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(num, tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1 = new TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
