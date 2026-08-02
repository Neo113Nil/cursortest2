package com.yandex.go.taxi.order.cache.domain;

import com.yandex.go.taxi.order.cache.api.data.model.OrderCacheParams;
import com.yandex.go.taxi.order.cache.data.model.OrderDetailsPresentationInfoSerializable;
import defpackage.at70;
import defpackage.bt70;
import defpackage.ct70;
import defpackage.dt70;
import defpackage.et70;
import defpackage.ft70;
import defpackage.hk20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zs70;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cache.domain.CachedOrdersOnStartInteractorImpl$cacheOrders$1", f = "CachedOrdersOnStartInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class CachedOrdersOnStartInteractorImpl$cacheOrders$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<OrderCacheParams.Service, OrderCacheParams> $cacheParams;
    final /* synthetic */ sls $ordersProvider;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedOrdersOnStartInteractorImpl$cacheOrders$1(sls slsVar, a aVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.$ordersProvider = slsVar;
        this.this$0 = aVar;
        this.$cacheParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CachedOrdersOnStartInteractorImpl$cacheOrders$1(this.$ordersProvider, this.this$0, this.$cacheParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CachedOrdersOnStartInteractorImpl$cacheOrders$1 cachedOrdersOnStartInteractorImpl$cacheOrders$1 = (CachedOrdersOnStartInteractorImpl$cacheOrders$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cachedOrdersOnStartInteractorImpl$cacheOrders$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OrderDetailsPresentationInfoSerializable orderDetailsPresentationInfoSerializable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        long currentTimeMillis = System.currentTimeMillis();
        Iterable<ft70> iterable = (Iterable) this.$ordersProvider.invoke();
        Map<OrderCacheParams.Service, OrderCacheParams> map = this.$cacheParams;
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        for (ft70 ft70Var : iterable) {
            if (ft70Var instanceof et70) {
                orderDetailsPresentationInfoSerializable = new OrderDetailsPresentationInfoSerializable(((et70) ft70Var).a(), OrderCacheParams.Service.TAXI, null, null, null, HProv.PP_INFO);
            } else if (ft70Var instanceof bt70) {
                bt70 bt70Var = (bt70) ft70Var;
                orderDetailsPresentationInfoSerializable = new OrderDetailsPresentationInfoSerializable(bt70Var.a(), OrderCacheParams.Service.LINKED, null, null, bt70Var.b(), 54);
            } else if (ft70Var instanceof dt70) {
                dt70 dt70Var = (dt70) ft70Var;
                orderDetailsPresentationInfoSerializable = new OrderDetailsPresentationInfoSerializable(dt70Var.c(), OrderCacheParams.Service.SCOOTERS, dt70Var.b(), dt70Var.a(), null, 70);
            } else if (ft70Var instanceof zs70) {
                orderDetailsPresentationInfoSerializable = new OrderDetailsPresentationInfoSerializable(((zs70) ft70Var).a(), OrderCacheParams.Service.DRIVE, null, null, null, HProv.PP_INFO);
            } else if (ft70Var instanceof ct70) {
                orderDetailsPresentationInfoSerializable = new OrderDetailsPresentationInfoSerializable(((ct70) ft70Var).a(), OrderCacheParams.Service.LOGISTICS, null, null, null, HProv.PP_INFO);
            } else {
                if (!(ft70Var instanceof at70)) {
                    w511.b();
                    return null;
                }
                orderDetailsPresentationInfoSerializable = new OrderDetailsPresentationInfoSerializable(((at70) ft70Var).a(), OrderCacheParams.Service.EATS, null, null, null, HProv.PP_INFO);
            }
            OrderCacheParams.Companion.getClass();
            OrderCacheParams orDefault = map.getOrDefault(orderDetailsPresentationInfoSerializable.d, OrderCacheParams.c);
            arrayList.add(new OrderDetailsPresentationInfoSerializable(orderDetailsPresentationInfoSerializable.a, TimeUnit.SECONDS.toMillis(orDefault.getA()) + currentTimeMillis, orDefault.getB(), orderDetailsPresentationInfoSerializable.d, orderDetailsPresentationInfoSerializable.e, orderDetailsPresentationInfoSerializable.f, orderDetailsPresentationInfoSerializable.g));
        }
        ((hk20) this.this$0.a.b.getValue()).b(arrayList);
        return zy11.a;
    }
}
