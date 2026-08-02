package com.yandex.go.payments.addmethod.domain;

import com.yandex.go.payments.AddButtonType;
import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.experiments.AddPaymentMethodButtonInMenuExperiment;
import com.yandex.go.zone.model.Zone;
import defpackage.avj0;
import defpackage.dms;
import defpackage.kyh0;
import defpackage.lw90;
import defpackage.mvg;
import defpackage.n65;
import defpackage.ny61;
import defpackage.syw;
import defpackage.ti0;
import defpackage.v80;
import defpackage.w511;
import defpackage.xw91;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "isUnauthorized", "Lcom/yandex/go/payments/data/model/response/PaymentMethods;", "paymentMethods", "Lcom/yandex/go/zone/model/Zone;", "zone", "Lcom/yandex/go/payments/experiments/AddPaymentMethodButtonInMenuExperiment;", "experiment", "Lv80;", "<anonymous>", "(ZLcom/yandex/go/payments/data/model/response/PaymentMethods;Lcom/yandex/go/zone/model/Zone;Lcom/yandex/go/payments/experiments/AddPaymentMethodButtonInMenuExperiment;)Lv80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.domain.AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5", f = "AddPaymentMethodsButtonStateInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5(e eVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5 addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5 = new AddPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5(this.this$0, (Continuation) obj5);
        addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5.Z$0 = booleanValue;
        addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5.L$0 = (PaymentMethods) obj2;
        addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5.L$1 = (Zone) obj3;
        addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5.L$2 = (AddPaymentMethodButtonInMenuExperiment) obj4;
        return addPaymentMethodsButtonStateInteractorImpl$addButtonStateFlow$5.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (defpackage.lw90.c(r9.this$0.f, r3, new defpackage.n65[0], 2).a(ru.yandex.taxi.gopayments.model.PaymentMethod$Type.CARD).equals(r0) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        if ((r2 != null ? r2.d : null) == com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto.StateType.ENABLED) goto L65;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AddButtonType addButtonType;
        xw91 xw91Var = xw91.C;
        boolean z = this.Z$0;
        PaymentMethods paymentMethods = (PaymentMethods) this.L$0;
        Zone zone = (Zone) this.L$1;
        AddPaymentMethodButtonInMenuExperiment addPaymentMethodButtonInMenuExperiment = (AddPaymentMethodButtonInMenuExperiment) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!z && addPaymentMethodButtonInMenuExperiment.b) {
            this.this$0.getClass();
            int i = 2;
            boolean z2 = true;
            if (addPaymentMethodButtonInMenuExperiment.b) {
                int i2 = ti0.a[addPaymentMethodButtonInMenuExperiment.c.ordinal()];
                if (i2 == 1) {
                    addButtonType = AddButtonType.CARD;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    addButtonType = AddButtonType.SBP_TOKEN;
                }
            } else {
                addButtonType = AddButtonType.CARD;
            }
            if (addButtonType != AddButtonType.CARD) {
                PaymentMethods.SbpTokensPaymentMethods sbpTokensPaymentMethods = paymentMethods.q;
                AddSbpTokenButtonDto addSbpTokenButtonDto = sbpTokensPaymentMethods.c;
                String str = addSbpTokenButtonDto != null ? addSbpTokenButtonDto.a : null;
                if (str == null) {
                    str = "";
                }
                this.this$0.getClass();
                if (sbpTokensPaymentMethods.a.isEmpty() && sbpTokensPaymentMethods.b.isEmpty() && lw90.c(this.this$0.f, zone, new n65[0], 2).a(PaymentMethod$Type.SBP_TOKEN).equals(xw91Var) && str.length() > 0) {
                }
                z2 = false;
                return new v80(z2, AddButtonType.SBP_TOKEN, str);
            }
            e eVar = this.this$0;
            eVar.getClass();
            List list = paymentMethods.a.a;
            syw sywVar = eVar.c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!sywVar.a((Card) it.next())) {
                        break;
                    }
                }
            }
            if (paymentMethods.a.b.isEmpty()) {
            }
            z2 = false;
            return new v80(z2, ((avj0) this.this$0.g).h(kyh0.credit_cards_add), i);
        }
        return v80.d;
    }
}
