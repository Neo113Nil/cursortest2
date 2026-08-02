package com.yandex.go.chargers;

import com.yandex.go.chargers.order.ChargersOrderStationOpenReason;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import defpackage.hpa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s2a;
import defpackage.tsa;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.ChargersRouterImpl$startOrderRouter$1$onOpenStationDetails$1", f = "ChargersRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersRouterImpl$startOrderRouter$1$onOpenStationDetails$1 extends SuspendLambda implements wls {
    final /* synthetic */ s2a $chargersPayload;
    final /* synthetic */ ChargersOrderStationOpenReason $openReason;
    final /* synthetic */ tsa $stationNumber;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersRouterImpl$startOrderRouter$1$onOpenStationDetails$1(e eVar, s2a s2aVar, tsa tsaVar, ChargersOrderStationOpenReason chargersOrderStationOpenReason, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$chargersPayload = s2aVar;
        this.$stationNumber = tsaVar;
        this.$openReason = chargersOrderStationOpenReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersRouterImpl$startOrderRouter$1$onOpenStationDetails$1(this.this$0, this.$chargersPayload, this.$stationNumber, this.$openReason, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersRouterImpl$startOrderRouter$1$onOpenStationDetails$1 chargersRouterImpl$startOrderRouter$1$onOpenStationDetails$1 = (ChargersRouterImpl$startOrderRouter$1$onOpenStationDetails$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersRouterImpl$startOrderRouter$1$onOpenStationDetails$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargersStationOpenReason chargersStationOpenReason;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        s2a s2aVar = this.$chargersPayload;
        tsa tsaVar = this.$stationNumber;
        int i = hpa.a[this.$openReason.ordinal()];
        if (i == 1) {
            chargersStationOpenReason = ChargersStationOpenReason.Map;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            chargersStationOpenReason = ChargersStationOpenReason.DiscountsAndPromocodes;
        }
        eVar.Z(s2aVar, tsaVar, chargersStationOpenReason);
        return zy11.a;
    }
}
