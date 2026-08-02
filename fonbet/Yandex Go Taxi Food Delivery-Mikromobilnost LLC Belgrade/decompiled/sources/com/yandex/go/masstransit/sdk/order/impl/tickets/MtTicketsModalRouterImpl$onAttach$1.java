package com.yandex.go.masstransit.sdk.order.impl.tickets;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.m840;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.MtTicketsModalRouterImpl$onAttach$1", f = "MtTicketsModalRouterImpl.kt", l = {66, 67, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsModalRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ m840 $payload;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsModalRouterImpl$onAttach$1(g gVar, m840 m840Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$payload = m840Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketsModalRouterImpl$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketsModalRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (kotlinx.coroutines.flow.e.t(new com.yandex.go.masstransit.sdk.order.impl.orders.j(r6.a.k, r1)).collect(new com.yandex.go.masstransit.sdk.order.impl.tickets.h(r6, r1), r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r6.b(r1, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r6.c(r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0.H;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            i iVar2 = this.this$0.H;
            String str = this.$payload.a;
            this.label = 3;
        }
        i iVar3 = this.this$0.H;
        String str2 = this.$payload.a;
        this.label = 2;
    }
}
