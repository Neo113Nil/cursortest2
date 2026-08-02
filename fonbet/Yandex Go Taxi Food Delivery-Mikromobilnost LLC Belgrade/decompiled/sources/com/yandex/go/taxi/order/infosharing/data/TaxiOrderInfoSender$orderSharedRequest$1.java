package com.yandex.go.taxi.order.infosharing.data;

import com.yandex.go.taxi.order.infosharing.data.model.TaxiOrderSharingParams;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a3y0;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xc8;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.infosharing.data.TaxiOrderInfoSender$orderSharedRequest$1", f = "TaxiOrderInfoSender.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderInfoSender$orderSharedRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderInfoSender$orderSharedRequest$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderInfoSender$orderSharedRequest$1(this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderInfoSender$orderSharedRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar2 = this.this$0;
                String str2 = this.$orderId;
                try {
                    cmt<zy11> a = aVar2.d.a(new TaxiOrderSharingParams(str2));
                    this.L$0 = aVar2;
                    this.L$1 = str2;
                    this.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(a, null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable unused) {
                    aVar = aVar2;
                    str = str2;
                    a3y0.d(aVar.e, "orderSharedRequest", null, new xc8(str, 20), 2);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$1;
                aVar = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable unused2) {
                    a3y0.d(aVar.e, "orderSharedRequest", null, new xc8(str, 20), 2);
                    return zy11.a;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
