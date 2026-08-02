package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class p implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ TaxiTransportInfoResponseDto b;
    public final /* synthetic */ Route c;
    public final /* synthetic */ s w;
    public final /* synthetic */ String x;

    public p(tpr tprVar, TaxiTransportInfoResponseDto taxiTransportInfoResponseDto, Route route, s sVar, String str) {
        this.a = tprVar;
        this.b = taxiTransportInfoResponseDto;
        this.c = route;
        this.w = sVar;
        this.x = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1 transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1) {
            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1 = (TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1) continuation;
            int i2 = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar, this.b, this.c, this.w, this.x);
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.L$0 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.L$1 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.L$2 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(oVar, transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1) == coroutineSingletons) {
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
        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1 = new TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1(this, continuation);
        Object obj2 = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
