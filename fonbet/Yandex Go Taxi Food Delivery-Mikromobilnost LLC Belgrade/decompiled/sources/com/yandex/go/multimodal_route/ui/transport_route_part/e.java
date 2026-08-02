package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import defpackage.g811;
import defpackage.ny61;
import defpackage.qu40;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ TaxiTransportInfoResponseDto b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ qu40 w;

    public e(vpr vprVar, TaxiTransportInfoResponseDto taxiTransportInfoResponseDto, CharSequence charSequence, qu40 qu40Var) {
        this.a = vprVar;
        this.b = taxiTransportInfoResponseDto;
        this.c = charSequence;
        this.w = qu40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1 multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1) {
            multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1 = (MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1) continuation;
            int i2 = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = this.b.a;
                    boolean isEnabled = this.w.i.a.isEnabled();
                    g811 g811Var = new g811(str, this.c, (List) obj, isEnabled);
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.L$0 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.L$1 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.L$2 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.L$3 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g811Var, multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1) == coroutineSingletons) {
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
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1 = new MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1(this, continuation);
        Object obj22 = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$lambda$2$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
