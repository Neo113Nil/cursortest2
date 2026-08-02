package com.yandex.go.chargers.station.data;

import defpackage.dms;
import defpackage.fl3;
import defpackage.hfa0;
import defpackage.hl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tsa;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lhfa0;", "paymentOptions", "Lhl3;", "authStatus", "Lzy11;", "<unused var>", "", "activeOrdersCount", "Lkotlin/Pair;", "Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse;", "", "<anonymous>", "(Lru/yandex/taxi/payment_options/model/PaymentOptions;Lru/yandex/taxi/am/AuthStatus;VI)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.data.ChargersStationDetailsRepository$listenToStationDetailsResponse$1", f = "ChargersStationDetailsRepository.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsRepository$listenToStationDetailsResponse$1 extends SuspendLambda implements dms {
    final /* synthetic */ kotlinx.serialization.json.b $additionalState;
    final /* synthetic */ tsa $stationNumber;
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsRepository$listenToStationDetailsResponse$1(c cVar, kotlinx.serialization.json.b bVar, tsa tsaVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = cVar;
        this.$additionalState = bVar;
        this.$stationNumber = tsaVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj4).intValue();
        ChargersStationDetailsRepository$listenToStationDetailsResponse$1 chargersStationDetailsRepository$listenToStationDetailsResponse$1 = new ChargersStationDetailsRepository$listenToStationDetailsResponse$1(this.this$0, this.$additionalState, this.$stationNumber, (Continuation) obj5);
        chargersStationDetailsRepository$listenToStationDetailsResponse$1.L$0 = (hfa0) obj;
        chargersStationDetailsRepository$listenToStationDetailsResponse$1.L$1 = (hl3) obj2;
        chargersStationDetailsRepository$listenToStationDetailsResponse$1.I$0 = intValue;
        return chargersStationDetailsRepository$listenToStationDetailsResponse$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hfa0 hfa0Var = (hfa0) this.L$0;
        hl3 hl3Var = (hl3) this.L$1;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        if (!(hl3Var instanceof fl3)) {
            hfa0Var = hfa0.c;
        }
        hfa0 hfa0Var2 = hfa0Var;
        c cVar = this.this$0;
        kotlinx.serialization.json.b bVar = this.$additionalState;
        tsa tsaVar = this.$stationNumber;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.I$0 = i;
        this.label = 1;
        Serializable a = c.a(cVar, bVar, tsaVar, i, hfa0Var2, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
