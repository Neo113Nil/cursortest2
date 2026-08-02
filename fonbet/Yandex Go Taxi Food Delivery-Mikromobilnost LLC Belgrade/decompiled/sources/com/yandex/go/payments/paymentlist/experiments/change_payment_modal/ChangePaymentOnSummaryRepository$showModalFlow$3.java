package com.yandex.go.payments.paymentlist.experiments.change_payment_modal;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.payments.api.model.PaymentsScreen;
import defpackage.d6z;
import defpackage.dms;
import defpackage.evu0;
import defpackage.f731;
import defpackage.lea0;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.pd9;
import defpackage.vez0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/change_payment_modal/ShowChangePaymentMethodOnSummaryExperiment;", "experiment", "Loea0;", "paymentModels", "Lcom/yandex/go/navigation/screen/api/Screen;", MetaDataField.SCREEN_FIELD, "Lcom/yandex/go/payments/api/model/PaymentsScreen;", "paymentsScreen", "Lpd9;", "<anonymous>", "(Lcom/yandex/go/payments/paymentlist/experiments/change_payment_modal/ShowChangePaymentMethodOnSummaryExperiment;Loea0;Lcom/yandex/go/navigation/screen/api/Screen;Lcom/yandex/go/payments/api/model/PaymentsScreen;)Lpd9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.experiments.change_payment_modal.ChangePaymentOnSummaryRepository$showModalFlow$3", f = "ChangePaymentOnSummaryRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ChangePaymentOnSummaryRepository$showModalFlow$3 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePaymentOnSummaryRepository$showModalFlow$3(f fVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ChangePaymentOnSummaryRepository$showModalFlow$3 changePaymentOnSummaryRepository$showModalFlow$3 = new ChangePaymentOnSummaryRepository$showModalFlow$3(this.this$0, (Continuation) obj5);
        changePaymentOnSummaryRepository$showModalFlow$3.L$0 = (ShowChangePaymentMethodOnSummaryExperiment) obj;
        changePaymentOnSummaryRepository$showModalFlow$3.L$1 = (oea0) obj2;
        changePaymentOnSummaryRepository$showModalFlow$3.L$2 = (Screen) obj3;
        changePaymentOnSummaryRepository$showModalFlow$3.L$3 = (PaymentsScreen) obj4;
        return changePaymentOnSummaryRepository$showModalFlow$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PaymentMethod$Type a;
        PaymentMethod$Type paymentMethod$Type;
        Object obj2;
        ShowChangePaymentMethodOnSummaryExperiment showChangePaymentMethodOnSummaryExperiment = (ShowChangePaymentMethodOnSummaryExperiment) this.L$0;
        oea0 oea0Var = (oea0) this.L$1;
        Screen screen = (Screen) this.L$2;
        PaymentsScreen paymentsScreen = (PaymentsScreen) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        fVar.getClass();
        if (showChangePaymentMethodOnSummaryExperiment.b && screen == Screen.SUMMARY && paymentsScreen == null && (a = fVar.a.c().a()) != null && showChangePaymentMethodOnSummaryExperiment.k.contains(a) && (paymentMethod$Type = showChangePaymentMethodOnSummaryExperiment.j) != null) {
            Iterator it = oea0Var.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                lea0 lea0Var = (lea0) obj2;
                if (lea0Var.c() == paymentMethod$Type && lea0Var.e() && (!(lea0Var instanceof f731) || ((f731) lea0Var).a())) {
                    break;
                }
            }
            lea0 lea0Var2 = (lea0) obj2;
            if (lea0Var2 != null) {
                lv90 b0 = vez0.b0(lea0Var2);
                String str = showChangePaymentMethodOnSummaryExperiment.d;
                if (!evu0.J(str)) {
                    Integer num = (Integer) fVar.a().get(str);
                    if ((num != null ? num.intValue() : 0) < showChangePaymentMethodOnSummaryExperiment.i) {
                        String Y = d6z.Y(showChangePaymentMethodOnSummaryExperiment, showChangePaymentMethodOnSummaryExperiment.e);
                        if (Y.length() != 0) {
                            String Y2 = d6z.Y(showChangePaymentMethodOnSummaryExperiment, showChangePaymentMethodOnSummaryExperiment.f);
                            String str2 = Y2.length() == 0 ? null : Y2;
                            String Y3 = d6z.Y(showChangePaymentMethodOnSummaryExperiment, showChangePaymentMethodOnSummaryExperiment.g);
                            if (Y3.length() != 0) {
                                String str3 = showChangePaymentMethodOnSummaryExperiment.h;
                                return new pd9(Y, str2, Y3, evu0.J(str3) ? null : str3, b0, str);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
