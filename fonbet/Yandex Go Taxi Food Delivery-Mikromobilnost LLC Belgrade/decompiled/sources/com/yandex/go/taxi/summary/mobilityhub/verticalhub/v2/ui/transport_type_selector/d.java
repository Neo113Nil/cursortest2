package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.transport_type_selector;

import defpackage.dlq0;
import defpackage.elq0;
import defpackage.gci0;
import defpackage.ny61;
import defpackage.ra11;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ra11 b;
    public final /* synthetic */ elq0 c;
    public final /* synthetic */ dlq0 w;

    public d(gci0 gci0Var, ra11 ra11Var, elq0 elq0Var, dlq0 dlq0Var) {
        this.a = gci0Var;
        this.b = ra11Var;
        this.c = elq0Var;
        this.w = dlq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1 transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1;
        int i;
        if (continuation instanceof TransportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1) {
            transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1 = (TransportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1) continuation;
            int i2 = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c, this.w);
                    transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.L$0 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.L$1 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.L$2 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1) == coroutineSingletons) {
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
        transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1 = new TransportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1(this, continuation);
        Object obj2 = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTypeSelectorUiStateInteractor$uiStateFlowInternal$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
