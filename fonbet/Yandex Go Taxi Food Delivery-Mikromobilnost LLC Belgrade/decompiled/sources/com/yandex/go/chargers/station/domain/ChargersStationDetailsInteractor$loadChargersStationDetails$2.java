package com.yandex.go.chargers.station.domain;

import com.yandex.go.chargers.analytics.ChargersError;
import defpackage.cy9;
import defpackage.isa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yx9;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Llsa;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.domain.ChargersStationDetailsInteractor$loadChargersStationDetails$2", f = "ChargersStationDetailsInteractor.kt", l = {47, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsInteractor$loadChargersStationDetails$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsInteractor$loadChargersStationDetails$2(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersStationDetailsInteractor$loadChargersStationDetails$2 chargersStationDetailsInteractor$loadChargersStationDetails$2 = new ChargersStationDetailsInteractor$loadChargersStationDetails$2(this.this$0, (Continuation) obj3);
        chargersStationDetailsInteractor$loadChargersStationDetails$2.L$0 = (vpr) obj;
        chargersStationDetailsInteractor$loadChargersStationDetails$2.L$1 = (Throwable) obj2;
        return chargersStationDetailsInteractor$loadChargersStationDetails$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r0.emit(r1, r8) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r9 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.chargers.error.data.a aVar = this.this$0.c;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 1;
            obj = aVar.a(th, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        cy9 cy9Var = (cy9) obj;
        yx9.a(ChargersError.Companion, ChargersError.Station, cy9Var.a, 4);
        isa isaVar = new isa(cy9Var);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
