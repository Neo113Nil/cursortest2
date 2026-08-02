package com.yandex.go.multimodal_route.repositories;

import com.yandex.go.multimodal_route.network.MultimodalRoutesApi;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoRequestDto;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.jst;
import defpackage.lr40;
import defpackage.ny61;
import defpackage.on2;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final i3y a;

    public a(on2 on2Var) {
        this.a = kotlin.a.a(new lr40(on2Var, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        MultimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1 multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1;
        int i;
        try {
            if (continuationImpl instanceof MultimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1) {
                multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1 = (MultimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1) continuationImpl;
                int i2 = multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<TaxiTransportInfoResponseDto> c = ((MultimodalRoutesApi) this.a.getValue()).c(new TaxiTransportInfoRequestDto(str, str2, z));
                        multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.L$0 = null;
                        multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.L$1 = null;
                        multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.L$2 = null;
                        multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.Z$0 = z;
                        multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(c, null, multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (TaxiTransportInfoResponseDto) obj;
                }
            }
            if (i != 0) {
            }
            return (TaxiTransportInfoResponseDto) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Multimodal Cancel request error");
            return new Result.Failure(th);
        }
        multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1 = new MultimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1(this, continuationImpl);
        Object obj2 = multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRoutesCancelTaxiTransportInfoRepository$cancelTaxi$1.label;
    }
}
