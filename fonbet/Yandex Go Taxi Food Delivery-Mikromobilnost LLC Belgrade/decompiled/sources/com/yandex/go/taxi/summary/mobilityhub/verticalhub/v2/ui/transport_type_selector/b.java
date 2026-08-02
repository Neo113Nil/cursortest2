package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.transport_type_selector;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorPayloadDto;
import defpackage.bb11;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ bb11 b;
    public final /* synthetic */ TransportSelectorPayloadDto c;

    public b(tpr tprVar, bb11 bb11Var, TransportSelectorPayloadDto transportSelectorPayloadDto) {
        this.a = tprVar;
        this.b = bb11Var;
        this.c = transportSelectorPayloadDto;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1 transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1) {
            transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1 = (TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1 = new TransportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTypeSelectorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
