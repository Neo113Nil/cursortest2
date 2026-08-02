package com.yandex.go.taxi.tariffs.interactor;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class u implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ v b;

    public u(mth mthVar, v vVar) {
        this.a = mthVar;
        this.b = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RefreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1 refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof RefreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1) {
            refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1 = (RefreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1) continuation;
            int i2 = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(vprVar, this.b);
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.L$0 = null;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.L$1 = null;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.L$2 = null;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(tVar, refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1 = new RefreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
