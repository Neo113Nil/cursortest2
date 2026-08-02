package com.yandex.go.payments.transport.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import defpackage.ama;
import defpackage.azz;
import defpackage.by90;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sr30;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.transport.navigation.MtPaymentsRouter$onLaunch$1", f = "MtPaymentsRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MtPaymentsRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ sr30 $payload;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtPaymentsRouter$onLaunch$1(c cVar, sr30 sr30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = sr30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtPaymentsRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtPaymentsRouter$onLaunch$1 mtPaymentsRouter$onLaunch$1 = (MtPaymentsRouter$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtPaymentsRouter$onLaunch$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        sr30 sr30Var = this.$payload;
        cVar.A(((by90) cVar.E.b.getValue()).a(), new azz(PaymentsScreen.TRANSPORT_SUMMARY, "transport_card", sr30Var.a, cVar.F.a(), sr30Var.b, false, cVar.D.getString(kyh0.mt_vertical_transport_payment_cards), false, false, null, null, null, null, null, null, null, null, null, 524096), new ama(4, cVar));
        return zy11.a;
    }
}
