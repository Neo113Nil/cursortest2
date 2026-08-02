package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.u510;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$2$1", f = "MtTicketsContentScreenBody.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onCurrentTicketIdChanged;
    final /* synthetic */ androidx.compose.foundation.pager.d $pagerState;
    final /* synthetic */ List<u510> $tickets;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$2$1(tls tlsVar, List list, androidx.compose.foundation.pager.d dVar, Continuation continuation) {
        super(2, continuation);
        this.$onCurrentTicketIdChanged = tlsVar;
        this.$tickets = list;
        this.$pagerState = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$2$1(this.$onCurrentTicketIdChanged, this.$tickets, this.$pagerState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$2$1 mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$2$1 = (MtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtTicketsContentScreenBodyKt$MtTicketsContentScreenBody$2$1.invokeSuspend(zy11Var);
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
        tls tlsVar = this.$onCurrentTicketIdChanged;
        u510 u510Var = (u510) kotlin.collections.a.S(this.$pagerState.k(), this.$tickets);
        tlsVar.invoke(u510Var != null ? u510Var.b : null);
        return zy11.a;
    }
}
