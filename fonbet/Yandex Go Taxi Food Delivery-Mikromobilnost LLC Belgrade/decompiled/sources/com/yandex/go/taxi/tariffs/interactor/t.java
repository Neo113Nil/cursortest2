package com.yandex.go.taxi.tariffs.interactor;

import com.yandex.go.taxi.tariffs.models.TariffChangeReason;
import defpackage.c5r;
import defpackage.dwj0;
import defpackage.g7j0;
import defpackage.hb7;
import defpackage.is60;
import defpackage.jl40;
import defpackage.ju60;
import defpackage.ny61;
import defpackage.prx0;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes8.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v b;

    public t(vpr vprVar, v vVar) {
        this.a = vprVar;
        this.b = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0196, code lost:
    
        if (r10.emit(r0, r2) == r3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RefreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1 refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1;
        int i;
        g7j0 g7j0Var;
        g7j0 g7j0Var2;
        vpr vprVar;
        hb7 hb7Var;
        c5r b;
        Triple triple;
        hb7 hb7Var2;
        vpr vprVar2;
        if (continuation instanceof RefreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1) {
            refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1 = (RefreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar3 = this.a;
                    rsn rsnVar = (rsn) obj;
                    g7j0Var = (g7j0) rsnVar.a;
                    g7j0Var2 = (g7j0) rsnVar.b;
                    com.yandex.go.taxi.tariffs.internal.interactor.f fVar = this.b.c;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$0 = null;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$1 = null;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$2 = null;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$3 = vprVar3;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$4 = null;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$5 = g7j0Var;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$6 = g7j0Var2;
                    refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                    Object b2 = fVar.a.b(g7j0Var2.a.k, refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1);
                    if (b2 != coroutineSingletons) {
                        vprVar = vprVar3;
                        obj2 = b2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    hb7Var2 = (hb7) refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$7;
                    vprVar2 = (vpr) refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$3;
                    kotlin.b.b(obj2);
                    com.yandex.go.taxi.tariffs.internal.interactor.f fVar2 = this.b.c;
                    dwj0 dwj0Var = hb7Var2.a;
                    fVar2.d(dwj0Var.a, dwj0Var.c);
                    vprVar = vprVar2;
                    triple = null;
                    if (triple != null) {
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$0 = null;
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$1 = null;
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$2 = null;
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$3 = null;
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$4 = null;
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$5 = null;
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$6 = null;
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$7 = null;
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$8 = null;
                        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.label = 3;
                    }
                    return zy11.a;
                }
                g7j0Var2 = (g7j0) refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$6;
                g7j0Var = (g7j0) refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$5;
                vprVar = (vpr) refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                hb7Var = (hb7) obj2;
                b = this.b.b.b(hb7Var == null ? hb7Var.a : null, g7j0Var2);
                if (!b.a || hb7Var == null) {
                    triple = new Triple(g7j0Var2, hb7Var == null ? hb7Var.a : null, b);
                    if (triple != null) {
                    }
                    return zy11.a;
                }
                if (jl40.l(hb7Var.b, hb7Var.a)) {
                    if (!this.b.n.get()) {
                        this.b.d.a.k(PriceUpdate$PriceLoadingState.LOADED);
                    }
                    triple = null;
                    if (triple != null) {
                    }
                    return zy11.a;
                }
                ju60 ju60Var = prx0.a;
                Set<is60> set = hb7Var.a.c.e;
                ju60Var.getClass();
                for (is60 is60Var : set) {
                    if (is60Var instanceof is60) {
                        is60Var.b = true;
                    }
                }
                synchronized (ju60Var.a) {
                    ju60Var.a.addAll(set);
                }
                ju60Var.b.g(zy11.a);
                com.yandex.go.taxi.tariffs.internal.interactor.f fVar3 = this.b.c;
                dwj0 dwj0Var2 = hb7Var.a;
                TariffChangeReason tariffChangeReason = g7j0Var == null ? TariffChangeReason.DEFAULT : !jl40.l(g7j0Var.a.k, g7j0Var2.a.k) ? TariffChangeReason.TOLL_ROAD_CHANGED : TariffChangeReason.DEFAULT;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$0 = null;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$1 = null;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$2 = null;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$4 = null;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$5 = null;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$6 = null;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$7 = hb7Var;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.L$8 = null;
                refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.label = 2;
                if (fVar3.c(dwj0Var2, false, tariffChangeReason, refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                    hb7Var2 = hb7Var;
                    vprVar2 = vprVar;
                    com.yandex.go.taxi.tariffs.internal.interactor.f fVar22 = this.b.c;
                    dwj0 dwj0Var3 = hb7Var2.a;
                    fVar22.d(dwj0Var3.a, dwj0Var3.c);
                    vprVar = vprVar2;
                    triple = null;
                    if (triple != null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1 = new RefreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = refreshTariffsInfoInteractor$refreshTariffs$lambda$0$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        hb7Var = (hb7) obj22;
        b = this.b.b.b(hb7Var == null ? hb7Var.a : null, g7j0Var2);
        if (b.a) {
        }
        triple = new Triple(g7j0Var2, hb7Var == null ? hb7Var.a : null, b);
        if (triple != null) {
        }
        return zy11.a;
    }
}
