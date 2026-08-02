package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.sb9;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/e;", "change", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/e;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.ChangeTaxiOrderSourcePointInteractorImpl$startPolling$6", f = "ChangeTaxiOrderSourcePointInteractorImpl.kt", l = {157}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeTaxiOrderSourcePointInteractorImpl$startPolling$6 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $orderHolder;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.change.source.interactor.ChangeTaxiOrderSourcePointInteractorImpl$startPolling$6$1", f = "ChangeTaxiOrderSourcePointInteractorImpl.kt", l = {HProv.PP_LICENSE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.change.source.interactor.ChangeTaxiOrderSourcePointInteractorImpl$startPolling$6$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ com.yandex.go.taxi.order.models.api.e $change;
        final /* synthetic */ o2y0 $orderHolder;
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j jVar, o2y0 o2y0Var, com.yandex.go.taxi.order.models.api.e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$orderHolder = o2y0Var;
            this.$change = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$orderHolder, this.$change, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            TaxiOrder taxiOrder;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                sb9 sb9Var = this.this$0.g;
                o2y0 o2y0Var = this.$orderHolder;
                com.yandex.go.taxi.order.models.api.e eVar = this.$change;
                this.label = 1;
                if (sb9Var.a(o2y0Var, eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            j jVar = this.this$0;
            o2y0 o2y0Var2 = this.$orderHolder;
            com.yandex.go.taxi.order.models.api.e eVar2 = this.$change;
            jVar.getClass();
            if ((eVar2 instanceof ChangeOrderState$Success) || (eVar2 instanceof ChangeOrderState$Failure) || (eVar2 instanceof ChangeOrderState$Unavailable)) {
                r0 r0Var = o2y0Var2.a;
                do {
                    value = r0Var.getValue();
                    taxiOrder = (TaxiOrder) value;
                    taxiOrder.L(eVar2);
                } while (!r0Var.k(value, taxiOrder));
                o2y0Var2.f();
            } else if (!(eVar2 instanceof ChangeOrderState$Pending)) {
                w511.b();
                return null;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeTaxiOrderSourcePointInteractorImpl$startPolling$6(j jVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$orderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangeTaxiOrderSourcePointInteractorImpl$startPolling$6 changeTaxiOrderSourcePointInteractorImpl$startPolling$6 = new ChangeTaxiOrderSourcePointInteractorImpl$startPolling$6(this.this$0, this.$orderHolder, continuation);
        changeTaxiOrderSourcePointInteractorImpl$startPolling$6.L$0 = obj;
        return changeTaxiOrderSourcePointInteractorImpl$startPolling$6;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeTaxiOrderSourcePointInteractorImpl$startPolling$6) create((com.yandex.go.taxi.order.models.api.e) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.yandex.go.taxi.order.models.api.e eVar = (com.yandex.go.taxi.order.models.api.e) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (eVar != null) {
                this.this$0.a.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$orderHolder, eVar, null);
                this.L$0 = null;
                this.label = 1;
                if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
