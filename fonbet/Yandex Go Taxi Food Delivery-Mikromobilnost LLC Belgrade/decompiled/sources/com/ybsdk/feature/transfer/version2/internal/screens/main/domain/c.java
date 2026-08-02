package com.ybsdk.feature.transfer.version2.internal.screens.main.domain;

import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.kj01;
import defpackage.ny61;
import defpackage.tm60;
import defpackage.vpr;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1 transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TransferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1) {
            transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1 = (TransferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1) continuation;
            int i2 = transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kj01 kj01Var = (kj01) obj;
                    Locale locale = tm60.a;
                    BigDecimal g = tm60.g(kj01Var.a);
                    if (g == null) {
                        g = BigDecimal.ZERO;
                    }
                    Pair pair = new Pair(g.compareTo(BigDecimal.valueOf(0L)) <= 0 ? "0" : g.compareTo(BigDecimal.valueOf(100L)) <= 0 ? "100" : g.compareTo(BigDecimal.valueOf(200L)) <= 0 ? "200" : g.compareTo(BigDecimal.valueOf(500L)) <= 0 ? "500" : g.compareTo(BigDecimal.valueOf(1000L)) <= 0 ? "1000" : g.compareTo(BigDecimal.valueOf(2000L)) <= 0 ? "2000" : g.compareTo(BigDecimal.valueOf(5000L)) <= 0 ? "5000" : g.compareTo(BigDecimal.valueOf(10000L)) <= 0 ? "10000" : g.compareTo(BigDecimal.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT)) <= 0 ? "20000" : "20000+", kj01Var);
                    transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1) == coroutineSingletons) {
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
        transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1 = new TransferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1(this, continuation);
        Object obj22 = transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferMainAnalyticsInteractor$logAmountEdited$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
