package com.yandex.go.taxi.order.performer;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wwa0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "performerTag", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.performer.DriverInfoInteractor$requestDriverPhoto$1", f = "DriverInfoInteractor.kt", l = {20, 22}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DriverInfoInteractor$requestDriverPhoto$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriverInfoInteractor$requestDriverPhoto$1(a aVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DriverInfoInteractor$requestDriverPhoto$1 driverInfoInteractor$requestDriverPhoto$1 = new DriverInfoInteractor$requestDriverPhoto$1(this.this$0, this.$order, continuation);
        driverInfoInteractor$requestDriverPhoto$1.L$0 = obj;
        return driverInfoInteractor$requestDriverPhoto$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriverInfoInteractor$requestDriverPhoto$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r7.a(r0, r6) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r7 == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            String str2 = this.$order.a;
            this.L$0 = null;
            this.label = 1;
            obj = a.a(aVar, str2, str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        wwa0 wwa0Var = (wwa0) obj;
        TaxiOrder taxiOrder = this.$order;
        if (jl40.l(taxiOrder.V().g.p, wwa0Var.a)) {
            taxiOrder.j = taxiOrder.b().b(wwa0Var.b);
        }
        com.yandex.go.taxi.order.domain.interactors.c cVar = this.this$0.c;
        String str3 = this.$order.a;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
