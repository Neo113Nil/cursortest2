package com.yandex.go.taxi.order.controller;

import com.yandex.go.zone.model.Zone;
import defpackage.kq70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.controller.OrderControllerRequests$requestZoneWithOrderData$zoneJob$1", f = "OrderControllerRequests.kt", l = {577}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderControllerRequests$requestZoneWithOrderData$zoneJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $srcPoint;
    final /* synthetic */ tls $zoneCallback;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderControllerRequests$requestZoneWithOrderData$zoneJob$1(a aVar, zzs zzsVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$srcPoint = zzsVar;
        this.$zoneCallback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderControllerRequests$requestZoneWithOrderData$zoneJob$1(this.this$0, this.$srcPoint, this.$zoneCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderControllerRequests$requestZoneWithOrderData$zoneJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        tls tlsVar;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar3 = this.this$0;
                zzs zzsVar = this.$srcPoint;
                tls tlsVar2 = this.$zoneCallback;
                try {
                    com.yandex.go.zone.interactors.b bVar = aVar3.j;
                    this.L$0 = aVar3;
                    this.L$1 = tlsVar2;
                    this.L$2 = aVar3;
                    this.label = 1;
                    Object b = bVar.b(zzsVar, this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = aVar3;
                    tlsVar = tlsVar2;
                    obj = b;
                    aVar2 = aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar3;
                    aVar.G.b("requestZoneWithOrderData", th, new kq70(aVar, 2));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$2;
                tlsVar = (tls) this.L$1;
                aVar2 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    aVar.G.b("requestZoneWithOrderData", th, new kq70(aVar, 2));
                    return zy11.a;
                }
            }
            Zone zone = (Zone) obj;
            aVar2.H = zone;
            tlsVar.invoke(zone);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
