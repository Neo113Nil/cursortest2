package com.yandex.go.chargers.station.domain;

import defpackage.ksa;
import defpackage.lsa;
import defpackage.ny61;
import defpackage.oma;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1 chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1) {
            chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1 = (ChargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lsa lsaVar = (lsa) obj;
                    if (lsaVar instanceof ksa) {
                        ksa ksaVar = (ksa) lsaVar;
                        oma omaVar = ksaVar.b;
                        c cVar = this.b;
                        if (omaVar == null || !cVar.e) {
                            omaVar = null;
                        }
                        if (omaVar != null) {
                            cVar.e = false;
                        }
                        lsaVar = new ksa(ksaVar.a, omaVar);
                    }
                    chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lsaVar, chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1 = new ChargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationDetailsInteractor$listenToChargersStationDetailsUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
