package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.network.models.TaxiFeedbackDto;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class l implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ TaxiFeedbackDto b;
    public final /* synthetic */ s c;

    public l(m0 m0Var, TaxiFeedbackDto taxiFeedbackDto, s sVar) {
        this.a = m0Var;
        this.b = taxiFeedbackDto;
        this.c = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1 transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TransportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1) {
            transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1 = (TransportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1) continuation;
            int i2 = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar, this.b, this.c);
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.L$0 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.L$1 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.L$2 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(kVar, transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1 = new TransportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
