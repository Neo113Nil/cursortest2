package com.yandex.go.tariffcard.interactor;

import com.yandex.go.tariffcard.ui.n0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class r implements tpr {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ x b;

    public r(n0 n0Var, x xVar) {
        this.a = n0Var;
        this.b = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1 tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1) {
            tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1 = (TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1) continuation;
            int i2 = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q qVar = new q(vprVar, this.b);
                    tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.L$0 = null;
                    tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.L$1 = null;
                    tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.L$2 = null;
                    tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(qVar, tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1 = new TariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardScrollButtonInteractor$getEnabledButtonStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
