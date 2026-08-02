package com.yandex.go.chargers.station.data;

import defpackage.gra;
import defpackage.gxa;
import defpackage.iwa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgra;", "it", "Lzy11;", "<anonymous>", "(Lgra;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.data.ChargersStationDetailsRepository$getStationDetails$2", f = "ChargersStationDetailsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsRepository$getStationDetails$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsRepository$getStationDetails$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersStationDetailsRepository$getStationDetails$2 chargersStationDetailsRepository$getStationDetails$2 = new ChargersStationDetailsRepository$getStationDetails$2(this.this$0, continuation);
        chargersStationDetailsRepository$getStationDetails$2.L$0 = obj;
        return chargersStationDetailsRepository$getStationDetails$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersStationDetailsRepository$getStationDetails$2 chargersStationDetailsRepository$getStationDetails$2 = (ChargersStationDetailsRepository$getStationDetails$2) create((gra) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersStationDetailsRepository$getStationDetails$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gra graVar = (gra) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        iwa iwaVar = this.this$0.f;
        iwaVar.a.l(graVar.l);
        gxa gxaVar = this.this$0.g;
        gxaVar.a.l(graVar.k);
        return zy11.a;
    }
}
