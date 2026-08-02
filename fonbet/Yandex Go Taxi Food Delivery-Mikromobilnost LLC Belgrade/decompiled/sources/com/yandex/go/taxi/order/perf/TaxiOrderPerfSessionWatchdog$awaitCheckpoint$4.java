package com.yandex.go.taxi.order.perf;

import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.c6y0;
import defpackage.h6y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh6y0;", "it", "", "<anonymous>", "(Lh6y0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.perf.TaxiOrderPerfSessionWatchdog$awaitCheckpoint$4", f = "TaxiOrderPerfSessionWatchdog.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderPerfSessionWatchdog$awaitCheckpoint$4 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrderSessionCheckpoint $checkpoint;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderPerfSessionWatchdog$awaitCheckpoint$4(TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint, Continuation continuation) {
        super(2, continuation);
        this.$checkpoint = taxiOrderSessionCheckpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOrderPerfSessionWatchdog$awaitCheckpoint$4 taxiOrderPerfSessionWatchdog$awaitCheckpoint$4 = new TaxiOrderPerfSessionWatchdog$awaitCheckpoint$4(this.$checkpoint, continuation);
        taxiOrderPerfSessionWatchdog$awaitCheckpoint$4.L$0 = obj;
        return taxiOrderPerfSessionWatchdog$awaitCheckpoint$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderPerfSessionWatchdog$awaitCheckpoint$4) create((h6y0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        c6y0 c6y0Var;
        h6y0 h6y0Var = (h6y0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (h6y0Var != null && (list = h6y0Var.d) != null && (c6y0Var = (c6y0) kotlin.collections.a.b0(list)) != null) {
            taxiOrderSessionCheckpoint = c6y0Var.a();
        }
        return Boolean.valueOf(h6y0Var == null || h6y0Var.c() || (taxiOrderSessionCheckpoint != null && taxiOrderSessionCheckpoint.compareTo(this.$checkpoint) >= 0));
    }
}
