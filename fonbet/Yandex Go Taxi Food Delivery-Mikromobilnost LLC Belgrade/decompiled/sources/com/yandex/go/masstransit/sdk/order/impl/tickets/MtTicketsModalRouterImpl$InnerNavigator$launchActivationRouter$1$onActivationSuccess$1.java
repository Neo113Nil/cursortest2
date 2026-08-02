package com.yandex.go.masstransit.sdk.order.impl.tickets;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.MtTicketsModalRouterImpl$InnerNavigator$launchActivationRouter$1$onActivationSuccess$1", f = "MtTicketsModalRouterImpl.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsModalRouterImpl$InnerNavigator$launchActivationRouter$1$onActivationSuccess$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $result;
    final /* synthetic */ String $ticketId;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsModalRouterImpl$InnerNavigator$launchActivationRouter$1$onActivationSuccess$1(g gVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$orderId = str;
        this.$ticketId = str2;
        this.$result = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketsModalRouterImpl$InnerNavigator$launchActivationRouter$1$onActivationSuccess$1(this.this$0, this.$orderId, this.$ticketId, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketsModalRouterImpl$InnerNavigator$launchActivationRouter$1$onActivationSuccess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0.H;
            String str = this.$orderId;
            String str2 = this.$ticketId;
            String str3 = this.$result;
            this.label = 1;
            com.yandex.go.masstransit.sdk.order.impl.orders.k kVar = iVar.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) kVar.j.getValue());
            linkedHashMap.put(str + "_" + str2, str3);
            r0 r0Var = kVar.j;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, linkedHashMap));
            if (kVar.h.a.d(linkedHashMap, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
