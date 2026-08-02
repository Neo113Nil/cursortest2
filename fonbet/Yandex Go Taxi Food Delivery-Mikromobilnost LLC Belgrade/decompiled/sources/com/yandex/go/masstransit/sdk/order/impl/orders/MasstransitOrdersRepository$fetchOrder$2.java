package com.yandex.go.masstransit.sdk.order.impl.orders;

import com.yandex.go.masstransit.sdk.order.api.orders.OrderRequestException;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.GetMasstransitOrderParams;
import defpackage.bwq;
import defpackage.cwq;
import defpackage.gtq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.s8o;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcwq;", "<anonymous>", "(Ltse;)Lcwq;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrdersRepository$fetchOrder$2", f = "MasstransitOrdersRepository.kt", l = {HProv.PP_DELETE_KEYSET, HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MasstransitOrdersRepository$fetchOrder$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitOrdersRepository$fetchOrder$2(k kVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$id = str;
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MasstransitOrdersRepository$fetchOrder$2(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitOrdersRepository$fetchOrder$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef z;
        String str;
        k kVar;
        Object a;
        OrderRequestException th;
        Ref$ObjectRef ref$ObjectRef;
        bwq bwqVar;
        T t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MasstransitOrderDto masstransitOrderDto = null;
        try {
            if (i == 0) {
                z = qv10.z(obj);
                str = this.$id;
                kVar = this.this$0;
                try {
                    GetMasstransitOrderParams getMasstransitOrderParams = new GetMasstransitOrderParams(str);
                    h hVar = kVar.a;
                    this.L$0 = z;
                    this.L$1 = kVar;
                    this.L$2 = str;
                    this.L$3 = null;
                    this.label = 1;
                    a = hVar.a(getMasstransitOrderParams, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    Ref$ObjectRef ref$ObjectRef2 = z;
                    th = th2;
                    ref$ObjectRef = ref$ObjectRef2;
                    xby.d.k(th, "Error while retrieve order with id = " + str);
                    if (ref$ObjectRef.element == 0) {
                    }
                    return new cwq(masstransitOrderDto, (String) ref$ObjectRef.element);
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bwqVar = (bwq) this.L$3;
                    str = (String) this.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        masstransitOrderDto = bwqVar.a;
                    } catch (Throwable th3) {
                        th = th3;
                        xby.d.k(th, "Error while retrieve order with id = " + str);
                        if (ref$ObjectRef.element == 0) {
                            OrderRequestException orderRequestException = th instanceof OrderRequestException ? th : null;
                            if (orderRequestException != null) {
                                String requestId = orderRequestException.getRequestId();
                                t = requestId;
                            }
                            t = gtq0.y(s8o.O(th));
                            ref$ObjectRef.element = t;
                        }
                        return new cwq(masstransitOrderDto, (String) ref$ObjectRef.element);
                    }
                    return new cwq(masstransitOrderDto, (String) ref$ObjectRef.element);
                }
                str = (String) this.L$2;
                k kVar2 = (k) this.L$1;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$0;
                try {
                    kotlin.b.b(obj);
                    a = obj;
                    z = ref$ObjectRef3;
                    kVar = kVar2;
                } catch (Throwable th4) {
                    th = th4;
                    ref$ObjectRef = ref$ObjectRef3;
                    xby.d.k(th, "Error while retrieve order with id = " + str);
                    if (ref$ObjectRef.element == 0) {
                    }
                    return new cwq(masstransitOrderDto, (String) ref$ObjectRef.element);
                }
            }
            bwq bwqVar2 = (bwq) a;
            ?? r6 = bwqVar2.b;
            z.element = r6;
            MasstransitOrderDto masstransitOrderDto2 = bwqVar2.a;
            this.L$0 = z;
            this.L$1 = str;
            this.L$2 = null;
            this.L$3 = bwqVar2;
            this.label = 2;
            if (k.c(kVar, masstransitOrderDto2, r6, this) != coroutineSingletons) {
                ref$ObjectRef = z;
                bwqVar = bwqVar2;
                masstransitOrderDto = bwqVar.a;
                return new cwq(masstransitOrderDto, (String) ref$ObjectRef.element);
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
