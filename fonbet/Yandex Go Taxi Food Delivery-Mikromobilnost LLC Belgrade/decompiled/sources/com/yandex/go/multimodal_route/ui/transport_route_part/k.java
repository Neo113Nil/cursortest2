package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.network.models.TaxiFeedbackDto;
import com.yandex.go.multimodal_route.network.models.TipsChoicesDto;
import defpackage.nvx0;
import defpackage.ny61;
import defpackage.u611;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ TaxiFeedbackDto b;
    public final /* synthetic */ s c;

    public k(vpr vprVar, TaxiFeedbackDto taxiFeedbackDto, s sVar) {
        this.a = vprVar;
        this.b = taxiFeedbackDto;
        this.c = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:
    
        if (r10.emit(r8, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1 transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        int i2;
        vpr vprVar2;
        u611 u611Var;
        if (continuation instanceof TransportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1) {
            transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1 = (TransportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1) continuation;
            int i3 = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nvx0 nvx0Var = (nvx0) obj;
                    vprVar = this.a;
                    if (nvx0Var != null && !nvx0Var.a) {
                        Pair pair = nvx0Var.c;
                        TaxiFeedbackDto taxiFeedbackDto = this.b;
                        if (pair != null) {
                            i2 = ((Number) pair.c()).intValue();
                        } else {
                            TipsChoicesDto tipsChoicesDto = taxiFeedbackDto.f;
                            i2 = tipsChoicesDto != null ? tipsChoicesDto.c : 0;
                        }
                        com.yandex.go.multimodal_route.mappers.a aVar = this.c.b;
                        Integer num = nvx0Var.b;
                        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$0 = null;
                        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$1 = null;
                        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$2 = null;
                        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$3 = null;
                        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$4 = vprVar;
                        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$5 = null;
                        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$6 = null;
                        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.I$0 = i2;
                        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.label = 1;
                        Object a = aVar.a(taxiFeedbackDto, num, i2, transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1);
                        if (a != coroutineSingletons) {
                            obj2 = a;
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    u611Var = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$0 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$1 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$2 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$3 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$4 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$5 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$6 = null;
                    transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                u611 u611Var2 = (u611) obj2;
                vprVar = vprVar2;
                u611Var = u611Var2;
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$0 = null;
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$1 = null;
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$2 = null;
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$3 = null;
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$4 = null;
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$5 = null;
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$6 = null;
                transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1 = new TransportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        u611 u611Var22 = (u611) obj22;
        vprVar = vprVar2;
        u611Var = u611Var22;
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$0 = null;
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$1 = null;
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$2 = null;
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$3 = null;
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$4 = null;
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$5 = null;
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.L$6 = null;
        transportTrackingCardUiStateInteractor$getFeedbackFlow$$inlined$map$1$2$1.label = 2;
    }
}
