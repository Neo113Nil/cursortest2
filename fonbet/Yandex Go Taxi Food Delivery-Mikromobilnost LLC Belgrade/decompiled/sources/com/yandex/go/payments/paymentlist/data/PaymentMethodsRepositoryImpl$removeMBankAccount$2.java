package com.yandex.go.payments.paymentlist.data;

import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kjz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pme0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.data.PaymentMethodsRepositoryImpl$removeMBankAccount$2", f = "PaymentMethodsRepositoryImpl.kt", l = {309}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsRepositoryImpl$removeMBankAccount$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $mBankAccountId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepositoryImpl$removeMBankAccount$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$mBankAccountId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsRepositoryImpl$removeMBankAccount$2(this.this$0, this.$mBankAccountId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsRepositoryImpl$removeMBankAccount$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kjz kjzVar = this.this$0.g.b;
            PaymentMethods g = kjzVar.g();
            PaymentMethods a = PaymentMethods.a(g, null, null, null, null, new PaymentMethods.MBankAccountPaymentMethod(null, g.r.b), null, 4063231);
            ((pme0) ((i3y) kjzVar.b).getValue()).a(a);
            kjzVar.j(a);
            if (jl40.l(this.$mBankAccountId, this.this$0.g.q(PaymentMethod$Type.MBANK_ACCOUNT))) {
                this.this$0.g.A();
            }
            c cVar = this.this$0;
            this.label = 1;
            if (cVar.q(this) == coroutineSingletons) {
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
