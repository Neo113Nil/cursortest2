package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitOrderDto;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrdersRepository$preloadAllMedia$2", f = "MasstransitOrdersRepository.kt", l = {251, 252}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MasstransitOrdersRepository$preloadAllMedia$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<MasstransitOrderDto> $orders;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitOrdersRepository$preloadAllMedia$2(k kVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$orders = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MasstransitOrdersRepository$preloadAllMedia$2(this.this$0, this.$orders, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitOrdersRepository$preloadAllMedia$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r7 == r0) goto L19;
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
            k kVar = this.this$0;
            List<MasstransitOrderDto> list = this.$orders;
            this.label = 1;
            obj = k.a(kVar, list, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list2 = (List) this.L$0;
                kotlin.b.b(obj);
                return list2;
            }
            kotlin.b.b(obj);
        }
        Pair pair = (Pair) obj;
        List list3 = (List) pair.getFirst();
        List list4 = (List) pair.getSecond();
        k kVar2 = this.this$0;
        this.L$0 = list3;
        this.L$1 = null;
        this.label = 2;
        tt2 tt2Var = kVar2.f;
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new MasstransitOrdersRepository$preloadAllMedia$4(kVar2, list3, list4, null), this);
        if (k0 != coroutineSingletons) {
            k0 = zy11.a;
        }
        return k0 == coroutineSingletons ? coroutineSingletons : list3;
    }
}
