package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation;

import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.h791;
import defpackage.it20;
import defpackage.jfb0;
import defpackage.jt20;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactViewModel$getProviderByPhone$1", f = "MobilePaymentSelectContactViewModel.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MobilePaymentSelectContactViewModel$getProviderByPhone$1 extends SuspendLambda implements wls {
    final /* synthetic */ jfb0 $phoneNumber;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilePaymentSelectContactViewModel$getProviderByPhone$1(a aVar, jfb0 jfb0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$phoneNumber = jfb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobilePaymentSelectContactViewModel$getProviderByPhone$1(this.this$0, this.$phoneNumber, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobilePaymentSelectContactViewModel$getProviderByPhone$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        jt20 jt20Var;
        it20 it20Var;
        r0 r0Var2;
        Object value2;
        jt20 jt20Var2;
        it20 it20Var2;
        r0 r0Var3;
        Object value3;
        jt20 jt20Var3;
        it20 it20Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.data.a aVar = this.this$0.F;
            String str = this.$phoneNumber.b;
            this.label = 1;
            b = aVar.b(str, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        jfb0 jfb0Var = this.$phoneNumber;
        Throwable a = Result.a(b);
        if (a == null) {
            dqg dqgVar = (dqg) b;
            if (dqgVar instanceof bqg) {
                pz40 Y = aVar2.Y();
                do {
                    r0Var3 = (r0) Y;
                    value3 = r0Var3.getValue();
                    jt20Var3 = (jt20) value3;
                    it20Var3 = jt20Var3.c;
                } while (!r0Var3.k(value3, jt20.a(jt20Var3, null, null, it20Var3 != null ? it20.a(it20Var3, MobilePaymentSelectContactState$SelectedContact$Status.DEFAULT) : null, null, null, null, 59)));
                a.d0(aVar2);
            } else {
                if (!(dqgVar instanceof cqg)) {
                    w511.b();
                    return null;
                }
                pz40 Y2 = aVar2.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    jt20Var2 = (jt20) value2;
                    it20Var2 = jt20Var2.c;
                } while (!r0Var2.k(value2, jt20.a(jt20Var2, null, null, it20Var2 != null ? it20.a(it20Var2, MobilePaymentSelectContactState$SelectedContact$Status.DEFAULT) : null, null, null, null, 59)));
                PaymentProviderEntity paymentProviderEntity = (PaymentProviderEntity) ((cqg) dqgVar).a;
                if ((paymentProviderEntity != null ? paymentProviderEntity.getAction() : null) != null) {
                    h791.e(aVar2.K, paymentProviderEntity.getAction(), false, null, 14);
                } else if (paymentProviderEntity != null) {
                    aVar2.n0(paymentProviderEntity, jfb0Var.b());
                } else {
                    a.d0(aVar2);
                }
            }
        } else {
            x4c.g("Can't get mobile provider", a, null, Collections.singletonList(lrp0.r), 4);
            pz40 Y3 = aVar2.Y();
            do {
                r0Var = (r0) Y3;
                value = r0Var.getValue();
                jt20Var = (jt20) value;
                it20Var = jt20Var.c;
            } while (!r0Var.k(value, jt20.a(jt20Var, null, null, it20Var != null ? it20.a(it20Var, MobilePaymentSelectContactState$SelectedContact$Status.DEFAULT) : null, null, null, null, 59)));
            a.d0(aVar2);
        }
        return zy11.a;
    }
}
