package com.yandex.go.payments.paymentlist.data;

import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.SbpToken;
import defpackage.fga0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kjz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pme0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.data.PaymentMethodsRepositoryImpl$removeSbpToken$2", f = "PaymentMethodsRepositoryImpl.kt", l = {299}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsRepositoryImpl$removeSbpToken$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $sbpTokenId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepositoryImpl$removeSbpToken$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$sbpTokenId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsRepositoryImpl$removeSbpToken$2(this.this$0, this.$sbpTokenId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsRepositoryImpl$removeSbpToken$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fga0 fga0Var = this.this$0.g;
            String str = this.$sbpTokenId;
            kjz kjzVar = fga0Var.b;
            PaymentMethods g = kjzVar.g();
            PaymentMethods.SbpTokensPaymentMethods sbpTokensPaymentMethods = g.q;
            List list = sbpTokensPaymentMethods.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!jl40.l(((SbpToken) obj2).a, str)) {
                    arrayList.add(obj2);
                }
            }
            List list2 = sbpTokensPaymentMethods.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (!jl40.l(((SbpToken) obj3).a, str)) {
                    arrayList2.add(obj3);
                }
            }
            PaymentMethods a = PaymentMethods.a(g, null, null, null, new PaymentMethods.SbpTokensPaymentMethods(arrayList, arrayList2, sbpTokensPaymentMethods.c), null, null, 4128767);
            ((pme0) ((i3y) kjzVar.b).getValue()).a(a);
            kjzVar.j(a);
            if (jl40.l(this.$sbpTokenId, this.this$0.g.q(PaymentMethod$Type.SBP_TOKEN))) {
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
