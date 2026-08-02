package com.yandex.go.taxi.order.state;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.CancelRules;
import com.yandex.go.taxi.order.t;
import defpackage.a3y0;
import defpackage.bms;
import defpackage.gwk0;
import defpackage.ha2;
import defpackage.ief;
import defpackage.il70;
import defpackage.jl70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ul70;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.OrderCancelPresenter$attachView$1", f = "OrderCancelPresenter.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ il70 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ l this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lcom/yandex/go/taxi/order/t;", "orderCancelProcessing", "", "oldCancelVisible", "Lul70;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lcom/yandex/go/taxi/order/t;Z)Lul70;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.state.OrderCancelPresenter$attachView$1$2", f = "OrderCancelPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.state.OrderCancelPresenter$attachView$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar, Continuation continuation) {
            super(4, continuation);
            this.this$0 = lVar;
        }

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, (Continuation) obj4);
            anonymousClass2.L$0 = (TaxiOrder) obj;
            anonymousClass2.L$1 = (t) obj2;
            anonymousClass2.Z$0 = booleanValue;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
            t tVar = (t) this.L$1;
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            boolean a = tVar.a(this.this$0.x);
            boolean D = taxiOrder.D();
            boolean z2 = a && !D && z;
            boolean z3 = !D && z;
            l lVar = this.this$0;
            CancelRules cancelRules = taxiOrder.h.a;
            ief iefVar = lVar.x.b().V().K;
            CancelRules.Companion.getClass();
            if (cancelRules != null && "paid".equals(cancelRules.b) && (str = cancelRules.a) != null && str.length() != 0 && iefVar != null) {
                r4 = lVar.A.a(gwk0.h(iefVar), cancelRules != null ? cancelRules.a : null, false, false);
            }
            return new ul70(z2, z3, r4);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lul70;", "", "error", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.state.OrderCancelPresenter$attachView$1$3", f = "OrderCancelPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.state.OrderCancelPresenter$attachView$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(l lVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = lVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, (Continuation) obj3);
            anonymousClass3.L$0 = (Throwable) obj2;
            zy11 zy11Var = zy11.a;
            anonymousClass3.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((a3y0) this.this$0.C.getValue()).b("attachView", th, new jl70(4));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelPresenter$attachView$1(l lVar, il70 il70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$mvpView = il70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderCancelPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderCancelPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.internal.g a = this.this$0.x.a();
            l lVar = this.this$0;
            ha2 n = kotlinx.coroutines.flow.e.n(a, lVar.y.a, kotlinx.coroutines.flow.e.t(new j(lVar.z.t)), new AnonymousClass2(this.this$0, null));
            this.this$0.B.getClass();
            tpr t = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.F(n, uyj.a), new AnonymousClass3(this.this$0, null)));
            l lVar2 = this.this$0;
            il70 il70Var = this.$mvpView;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(t, new OrderCancelPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            k kVar = new k(lVar2, il70Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(kVar, this) == coroutineSingletons) {
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
