package com.yandex.go.chargers.station.data;

import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/go/chargers/station/data/model/ChargersStationDetailsResponse;", "", "response", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lgra;", "<anonymous>", "(Lkotlin/Pair;Lru/yandex/taxi/theme/ThemeType;)Lgra;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.data.ChargersStationDetailsRepository$getStationDetails$1", f = "ChargersStationDetailsRepository.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsRepository$getStationDetails$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsRepository$getStationDetails$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersStationDetailsRepository$getStationDetails$1 chargersStationDetailsRepository$getStationDetails$1 = new ChargersStationDetailsRepository$getStationDetails$1(this.this$0, (Continuation) obj3);
        chargersStationDetailsRepository$getStationDetails$1.L$0 = (Pair) obj;
        return chargersStationDetailsRepository$getStationDetails$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.chargers.station.data.mapper.a aVar = this.this$0.i;
        ChargersStationDetailsResponse chargersStationDetailsResponse = (ChargersStationDetailsResponse) pair.c();
        String str = (String) pair.f();
        this.L$0 = null;
        this.label = 1;
        Object d = aVar.d(chargersStationDetailsResponse, str, this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
