package com.yandex.go.taxi.order.multi.shortcuts;

import com.yandex.go.address.models.Address;
import defpackage.dd61;
import defpackage.e5y0;
import defpackage.k9s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s780;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.multi.shortcuts.OrderSummaryRouter$openSummaryOnOrder$1", f = "OrderSummaryRouter.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderSummaryRouter$openSummaryOnOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $destinationAddress;
    final /* synthetic */ k9s0 $params;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSummaryRouter$openSummaryOnOrder$1(f fVar, k9s0 k9s0Var, Address address, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$params = k9s0Var;
        this.$destinationAddress = address;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderSummaryRouter$openSummaryOnOrder$1(this.this$0, this.$params, this.$destinationAddress, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderSummaryRouter$openSummaryOnOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        k9s0 k9s0Var;
        Address address;
        f fVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar3 = this.this$0;
                k9s0 k9s0Var2 = this.$params;
                Address address2 = this.$destinationAddress;
                try {
                    ru.yandex.taxi.deeplinks.e eVar = fVar3.b;
                    this.L$0 = fVar3;
                    this.L$1 = k9s0Var2;
                    this.L$2 = address2;
                    this.L$3 = fVar3;
                    this.label = 1;
                    Object d = eVar.d(this);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fVar = fVar3;
                    k9s0Var = k9s0Var2;
                    address = address2;
                    obj = d;
                    fVar2 = fVar;
                } catch (Throwable th) {
                    th = th;
                    fVar = fVar3;
                    fVar.o.b("openSummaryOnOrder", th, new s780(17));
                    e5y0.f((e5y0) fVar.c.get(), "failed to open summary form order");
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = (f) this.L$3;
                address = (Address) this.L$2;
                k9s0Var = (k9s0) this.L$1;
                fVar2 = (f) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    fVar.o.b("openSummaryOnOrder", th, new s780(17));
                    e5y0.f((e5y0) fVar.c.get(), "failed to open summary form order");
                    return zy11.a;
                }
            }
            fVar2.c(k9s0Var, ((dd61) obj).a(), address);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
