package com.yandex.go.payments.addmethod.ui.home;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeRequest;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import defpackage.avj0;
import defpackage.cmt;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.nh0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xh0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.ui.home.AddPaymentHomeUiStateInteractor$updateUiState$2", f = "AddPaymentHomeUiStateInteractor.kt", l = {43, 44, 45, 54}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddPaymentHomeUiStateInteractor$updateUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<Double> $location;
    final /* synthetic */ String $service;
    final /* synthetic */ PaymentMethod$Type $type;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentHomeUiStateInteractor$updateUiState$2(PaymentMethod$Type paymentMethod$Type, List list, String str, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$type = paymentMethod$Type;
        this.$location = list;
        this.$service = str;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddPaymentHomeUiStateInteractor$updateUiState$2(this.$type, this.$location, this.$service, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddPaymentHomeUiStateInteractor$updateUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0106 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PaymentMethod$Type paymentMethod$Type;
        e eVar;
        e eVar2;
        e eVar3;
        PaymentMethod$Type paymentMethod$Type2;
        e eVar4;
        e eVar5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                paymentMethod$Type = this.$type;
                List<Double> list = this.$location;
                String str = this.$service;
                e eVar6 = this.this$0;
                try {
                    cmt<AddPaymentHomeResponse> a = eVar6.d.a(new AddPaymentHomeRequest(paymentMethod$Type.getCode(), list, str));
                    this.L$0 = paymentMethod$Type;
                    this.L$1 = eVar6;
                    this.L$2 = eVar6;
                    this.L$3 = paymentMethod$Type;
                    this.L$4 = null;
                    this.label = 1;
                    obj = ru.yandex.taxi.network.api.a.d(a, this);
                    if (obj != coroutineSingletons) {
                        eVar2 = eVar6;
                        eVar3 = eVar2;
                        paymentMethod$Type2 = paymentMethod$Type;
                    }
                } catch (Throwable unused) {
                    eVar = eVar6;
                    boolean z = eVar.e;
                    zuj0 zuj0Var = eVar.b;
                    nh0 nh0Var = new nh0(z, paymentMethod$Type, ((avj0) zuj0Var).h(kyh0.payment_methods_home_error), ((avj0) zuj0Var).h(kyh0.payment_methods_home_try_again));
                    r0 r0Var = eVar.f;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    r0Var.emit(nh0Var, this);
                    if (zy11Var != coroutineSingletons) {
                    }
                }
            }
            if (i == 1) {
                paymentMethod$Type = (PaymentMethod$Type) this.L$3;
                eVar2 = (e) this.L$2;
                eVar3 = (e) this.L$1;
                paymentMethod$Type2 = (PaymentMethod$Type) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    eVar = eVar2;
                    boolean z2 = eVar.e;
                    zuj0 zuj0Var2 = eVar.b;
                    nh0 nh0Var2 = new nh0(z2, paymentMethod$Type, ((avj0) zuj0Var2).h(kyh0.payment_methods_home_error), ((avj0) zuj0Var2).h(kyh0.payment_methods_home_try_again));
                    r0 r0Var2 = eVar.f;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    r0Var2.emit(nh0Var2, this);
                    if (zy11Var != coroutineSingletons) {
                    }
                }
            } else {
                if (i == 2) {
                    paymentMethod$Type = (PaymentMethod$Type) this.L$2;
                    eVar4 = (e) this.L$1;
                    eVar5 = (e) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        r0 r0Var3 = eVar5.f;
                        this.L$0 = eVar4;
                        this.L$1 = paymentMethod$Type;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        r0Var3.emit((xh0) obj, this);
                    } catch (Throwable unused3) {
                        eVar = eVar4;
                        boolean z22 = eVar.e;
                        zuj0 zuj0Var22 = eVar.b;
                        nh0 nh0Var22 = new nh0(z22, paymentMethod$Type, ((avj0) zuj0Var22).h(kyh0.payment_methods_home_error), ((avj0) zuj0Var22).h(kyh0.payment_methods_home_try_again));
                        r0 r0Var22 = eVar.f;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        r0Var22.emit(nh0Var22, this);
                        if (zy11Var != coroutineSingletons) {
                        }
                    }
                    return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                paymentMethod$Type = (PaymentMethod$Type) this.L$1;
                eVar = (e) this.L$0;
                try {
                    kotlin.b.b(obj);
                    return zy11Var;
                } catch (Throwable unused4) {
                    boolean z222 = eVar.e;
                    zuj0 zuj0Var222 = eVar.b;
                    nh0 nh0Var222 = new nh0(z222, paymentMethod$Type, ((avj0) zuj0Var222).h(kyh0.payment_methods_home_error), ((avj0) zuj0Var222).h(kyh0.payment_methods_home_try_again));
                    r0 r0Var222 = eVar.f;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    r0Var222.emit(nh0Var222, this);
                    if (zy11Var != coroutineSingletons) {
                    }
                }
            }
            this.L$0 = eVar3;
            this.L$1 = eVar2;
            this.L$2 = paymentMethod$Type;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            obj = e.b(eVar3, (AddPaymentHomeResponse) obj, paymentMethod$Type2, this);
            if (obj != coroutineSingletons) {
                eVar4 = eVar2;
                eVar5 = eVar3;
                r0 r0Var32 = eVar5.f;
                this.L$0 = eVar4;
                this.L$1 = paymentMethod$Type;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                r0Var32.emit((xh0) obj, this);
                if (zy11Var != coroutineSingletons) {
                }
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
