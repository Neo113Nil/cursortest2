package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import defpackage.ny61;
import defpackage.qu40;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ TaxiTransportInfoResponseDto b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ qu40 w;

    public f(tpr tprVar, TaxiTransportInfoResponseDto taxiTransportInfoResponseDto, CharSequence charSequence, qu40 qu40Var) {
        this.a = tprVar;
        this.b = taxiTransportInfoResponseDto;
        this.c = charSequence;
        this.w = qu40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1 multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1;
        int i;
        if (continuation instanceof MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1) {
            multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1 = (MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1) continuation;
            int i2 = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b, this.c, this.w);
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.L$0 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.L$1 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.L$2 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1) == coroutineSingletons) {
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
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1 = new MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1(this, continuation);
        Object obj2 = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
