package com.yandex.go.taxi.order.analytics;

import defpackage.mux;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.analytics.OrderStatusAnalytics$doIfEnabled$1", f = "OrderStatusAnalytics.kt", l = {HProv.PP_DHOID, HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderStatusAnalytics$doIfEnabled$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusAnalytics$doIfEnabled$1(a aVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStatusAnalytics$doIfEnabled$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStatusAnalytics$doIfEnabled$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r5.invoke(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            mux muxVar = this.this$0.a;
            this.label = 1;
            obj = ((t1b0) muxVar.a.getValue()).b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            tls tlsVar = this.$action;
            this.label = 2;
        }
        return zy11.a;
    }
}
