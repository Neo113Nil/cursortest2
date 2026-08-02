package com.yandex.go.multimodal_route.ui.transport_route_part;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class n implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ String b;
    public final /* synthetic */ s c;

    public n(kotlinx.coroutines.flow.internal.g gVar, String str, s sVar) {
        this.a = gVar;
        this.b = str;
        this.c = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1 transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1;
        int i;
        if (continuation instanceof TransportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1) {
            transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1 = (TransportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1) continuation;
            int i2 = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar, this.b, this.c);
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.L$0 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.L$1 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.L$2 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.label = 1;
                    if (this.a.collect(mVar, transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1) == coroutineSingletons) {
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
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1 = new TransportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1(this, continuation);
        Object obj2 = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
