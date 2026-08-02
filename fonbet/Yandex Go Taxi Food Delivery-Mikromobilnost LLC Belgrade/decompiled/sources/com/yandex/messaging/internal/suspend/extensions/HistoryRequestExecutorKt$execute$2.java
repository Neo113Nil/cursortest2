package com.yandex.messaging.internal.suspend.extensions;

import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.cfu;
import defpackage.dvw;
import defpackage.j18;
import defpackage.jse;
import defpackage.mvg;
import defpackage.n5t0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xlu;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/messaging/core/net/entities/proto/HistoryResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/messaging/core/net/entities/proto/HistoryResponse;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.suspend.extensions.HistoryRequestExecutorKt$execute$2", f = "HistoryRequestExecutor.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class HistoryRequestExecutorKt$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ jse $dispatcher;
    final /* synthetic */ n5t0 $socketConnection;
    final /* synthetic */ HistoryRequest $this_execute;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryRequestExecutorKt$execute$2(n5t0 n5t0Var, HistoryRequest historyRequest, jse jseVar, Continuation continuation) {
        super(2, continuation);
        this.$socketConnection = n5t0Var;
        this.$this_execute = historyRequest;
        this.$dispatcher = jseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HistoryRequestExecutorKt$execute$2(this.$socketConnection, this.$this_execute, this.$dispatcher, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HistoryRequestExecutorKt$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        n5t0 n5t0Var = this.$socketConnection;
        HistoryRequest historyRequest = this.$this_execute;
        jse jseVar = this.$dispatcher;
        this.L$0 = n5t0Var;
        this.L$1 = historyRequest;
        this.L$2 = jseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        j18Var.w(new a(jseVar, n5t0Var.a(new xlu(historyRequest, j18Var), new cfu()), 0));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
