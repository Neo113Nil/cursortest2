package com.yandex.go.payments.composite.domain;

import com.yandex.go.payments.domain.j0;
import com.yandex.go.zone.model.Zone;
import defpackage.ew90;
import defpackage.hw90;
import defpackage.kw90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.paa0;
import defpackage.s6h;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.composite.domain.PaymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1", f = "PaymentMethodsForCompositeInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PaymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ paa0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1(Continuation continuation, paa0 paa0Var) {
        super(3, continuation);
        this.this$0 = paa0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1 paymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1 = new PaymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        paymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        paymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return paymentMethodsForCompositeInteractor$optionsFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kw90 kw90Var = new kw90(new hw90((Zone) obj2), new ew90(), new s6h());
            b bVar = new b(new m0(((j0) this.this$0.a).a(kw90Var), this.this$0.b.b(), new PaymentMethodsForCompositeInteractor$optionsFlow$1$1(this.this$0, kw90Var, null)), this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(bVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
