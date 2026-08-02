package com.yandex.go.payments_widgets.section.payments;

import com.yandex.go.payments_widgets.yandex_bank.update.balance.UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$withPreviousEmit$1;
import com.yandex.go.payments_widgets.yandex_bank.update.balance.f;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.yb.data.p;
import defpackage.b921;
import defpackage.cc20;
import defpackage.g721;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rqd0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.section.payments.PaymentWidgetsSectionController$onActivate$4", f = "PaymentWidgetsSectionController.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentWidgetsSectionController$onActivate$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentWidgetsSectionController$onActivate$4(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentWidgetsSectionController$onActivate$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentWidgetsSectionController$onActivate$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b921 b921Var = this.this$0.n;
            this.label = 1;
            cc20 cc20Var = b921Var.a;
            tpr p = e.p(e.K((tpr[]) Arrays.copyOf(new tpr[]{new com.yandex.go.payments_widgets.yandex_bank.update.balance.d(((g) cc20Var.a).h(), cc20Var), new com.yandex.go.payments_widgets.yandex_bank.update.balance.b(new mth(new j0(null, new mth(((rqd0) b921Var.b.a).b, 4), new UpdateYandexCardBalanceByPlusPurchaseInteractor$updateBalanceFlow$$inlined$withPreviousEmit$1(3, null)), 6)), new f(new p(b921Var.e.c().v))}, 3)), 100L);
            b921Var.d.getClass();
            sjh sjhVar = uyj.a;
            if (e.F(p, mdh.b).collect(new g721(4, b921Var), this) == coroutineSingletons) {
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
