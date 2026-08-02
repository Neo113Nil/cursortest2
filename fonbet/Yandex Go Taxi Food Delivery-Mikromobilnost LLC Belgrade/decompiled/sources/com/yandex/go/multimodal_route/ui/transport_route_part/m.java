package com.yandex.go.multimodal_route.ui.transport_route_part;

import defpackage.fao;
import defpackage.ia11;
import defpackage.ja11;
import defpackage.la11;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ s c;

    public m(vpr vprVar, String str, s sVar) {
        this.a = vprVar;
        this.b = str;
        this.c = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        if (r9.emit(r8, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1 transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1;
        int i;
        la11 la11Var;
        vpr vprVar;
        String str;
        vpr vprVar2;
        if (continuation instanceof TransportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1) {
            transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1 = (TransportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1) continuation;
            int i2 = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    la11Var = (ia11) obj;
                    vprVar = this.a;
                    if (la11Var == null) {
                        com.yandex.go.multimodal_route.ui.error.a aVar = this.c.k;
                        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$0 = null;
                        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$1 = null;
                        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$2 = null;
                        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$3 = null;
                        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$4 = vprVar;
                        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$5 = null;
                        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$6 = null;
                        str = this.b;
                        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$7 = str;
                        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.label = 1;
                        Object a = aVar.a(transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1);
                        if (a != coroutineSingletons) {
                            obj2 = a;
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$0 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$1 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$2 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$3 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$4 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$5 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$6 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$7 = null;
                    transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    str = (String) transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$7;
                    vprVar2 = (vpr) transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                la11 ja11Var = new ja11(str, (fao) obj2);
                vprVar = vprVar2;
                la11Var = ja11Var;
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$0 = null;
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$1 = null;
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$2 = null;
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$3 = null;
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$4 = null;
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$5 = null;
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$6 = null;
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$7 = null;
                transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.label = 2;
            }
        }
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1 = new TransportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        la11 ja11Var2 = new ja11(str, (fao) obj22);
        vprVar = vprVar2;
        la11Var = ja11Var2;
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$0 = null;
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$1 = null;
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$2 = null;
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$3 = null;
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$4 = null;
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$5 = null;
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$6 = null;
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.L$7 = null;
        transportTrackingCardUiStateInteractor$uiState$$inlined$map$1$2$1.label = 2;
    }
}
