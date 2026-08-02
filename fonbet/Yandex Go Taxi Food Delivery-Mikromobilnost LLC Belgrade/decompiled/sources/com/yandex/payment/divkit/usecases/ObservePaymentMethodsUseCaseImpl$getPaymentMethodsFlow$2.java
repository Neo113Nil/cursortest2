package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentSettings;
import defpackage.a8a0;
import defpackage.cvf;
import defpackage.fd60;
import defpackage.jl40;
import defpackage.kq4;
import defpackage.kq60;
import defpackage.mq60;
import defpackage.mvg;
import defpackage.nq4;
import defpackage.ny61;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.w511;
import defpackage.y22;
import defpackage.ycc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcvf;", "paymentData", "Lpq4;", "plusCardState", "Lmq60;", "<anonymous>", "(Lcvf;Lpq4;)Lmq60;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2", f = "ObservePaymentMethodsUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ kq60 $params;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2(p pVar, kq60 kq60Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = pVar;
        this.$params = kq60Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2 observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2 = new ObservePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2(this.this$0, this.$params, (Continuation) obj3);
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2.L$0 = (cvf) obj;
        observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2.L$1 = (pq4) obj2;
        return observePaymentMethodsUseCaseImpl$getPaymentMethodsFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        cvf cvfVar = (cvf) this.L$0;
        pq4 pq4Var = (pq4) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p pVar = this.this$0;
        com.yandex.payment.divkit.select.j jVar = this.$params.g;
        pVar.getClass();
        List list = cvfVar.a;
        PaymentSettings paymentSettings = cvfVar.b;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (a8a0.f((PaymentMethod) obj2)) {
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj2;
        rwo rwoVar = pVar.c;
        boolean z = false;
        nq4 nq4Var = nq4.a;
        if (paymentMethod == null) {
            if (jl40.l(pq4Var, nq4Var)) {
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.N());
                z = true;
            } else {
                if (!(pq4Var instanceof oq4)) {
                    w511.b();
                    return null;
                }
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.V());
            }
            Pair pair = new Pair(null, Boolean.valueOf(z));
            return new mq60(arrayList, ((Boolean) pair.f()).booleanValue(), (kq4) pair.c(), paymentSettings);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (jl40.l(pq4Var, nq4Var)) {
            ycc.w(arrayList2, new fd60(10), true);
            qv90.a.getClass();
            ((y22) rwoVar).a(sv90.N());
            z = true;
        } else {
            if (!(pq4Var instanceof oq4)) {
                w511.b();
                return null;
            }
            qv90.a.getClass();
            ((y22) rwoVar).a(sv90.W());
        }
        return new mq60(arrayList2, z, null, paymentSettings);
    }
}
