package com.yandex.go.taxi.order.push.handlers;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.fs70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.push.handlers.OrderPushHandler$handleAlternativePointAFoundPush$1", f = "OrderPushHandler.kt", l = {148}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderPushHandler$handleAlternativePointAFoundPush$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $body;
    final /* synthetic */ Map<String, String> $data;
    final /* synthetic */ long $expirationIntervalInMillis;
    final /* synthetic */ TaxiOrder $order;
    final /* synthetic */ String $title;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPushHandler$handleAlternativePointAFoundPush$1(a aVar, TaxiOrder taxiOrder, Map map, String str, String str2, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$order = taxiOrder;
        this.$data = map;
        this.$title = str;
        this.$body = str2;
        this.$expirationIntervalInMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPushHandler$handleAlternativePointAFoundPush$1(this.this$0, this.$order, this.$data, this.$title, this.$body, this.$expirationIntervalInMillis, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPushHandler$handleAlternativePointAFoundPush$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Object x;
        a aVar2;
        String str;
        String str2;
        a aVar3;
        Map<String, String> map;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar4 = this.this$0;
                TaxiOrder taxiOrder = this.$order;
                Map<String, String> map2 = this.$data;
                String str3 = this.$title;
                String str4 = this.$body;
                long j2 = this.$expirationIntervalInMillis;
                try {
                    rol0 p = ((com.yandex.go.taxi.order.provider.a) aVar4.e.get()).p(taxiOrder.a);
                    OrderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1 orderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1 = new OrderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1(2, null);
                    this.L$0 = aVar4;
                    this.L$1 = map2;
                    this.L$2 = str3;
                    this.L$3 = str4;
                    this.L$4 = aVar4;
                    this.J$0 = j2;
                    this.label = 1;
                    x = e.x(p, orderPushHandler$handleAlternativePointAFoundPush$1$1$taxiOrder$1, this);
                    if (x == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar2 = aVar4;
                    str = str3;
                    str2 = str4;
                    aVar3 = aVar2;
                    map = map2;
                    j = j2;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar4;
                    aVar.j.b("handleAlternativePointAFoundPush", th, new fs70(24));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j3 = this.J$0;
                aVar = (a) this.L$4;
                String str5 = (String) this.L$3;
                String str6 = (String) this.L$2;
                Map<String, String> map3 = (Map) this.L$1;
                a aVar5 = (a) this.L$0;
                try {
                    b.b(obj);
                    map = map3;
                    j = j3;
                    str2 = str5;
                    str = str6;
                    aVar2 = aVar5;
                    aVar3 = aVar;
                    x = obj;
                } catch (Throwable th2) {
                    th = th2;
                    aVar.j.b("handleAlternativePointAFoundPush", th, new fs70(24));
                    return zy11.a;
                }
            }
            try {
                aVar2.d(map, (TaxiOrder) x, str, str2, j);
            } catch (Throwable th3) {
                th = th3;
                aVar = aVar3;
                aVar.j.b("handleAlternativePointAFoundPush", th, new fs70(24));
                return zy11.a;
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
