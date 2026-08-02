package com.yandex.go.payments.cards.pci_dss.ui;

import com.yandex.go.payments.cards.ui.e;
import defpackage.a90;
import defpackage.dt5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qa0;
import defpackage.ra0;
import defpackage.rb8;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.pci_dss.ui.AddCardPciDssPresenter$onPanChanged$1", f = "AddCardPciDssPresenter.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddCardPciDssPresenter$onPanChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ dt5 $bin;
    int label;
    final /* synthetic */ ra0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCardPciDssPresenter$onPanChanged$1(ra0 ra0Var, dt5 dt5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ra0Var;
        this.$bin = dt5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddCardPciDssPresenter$onPanChanged$1(this.this$0, this.$bin, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddCardPciDssPresenter$onPanChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ra0 ra0Var = this.this$0;
            e eVar = ra0Var.l;
            dt5 dt5Var = this.$bin;
            rb8 rb8Var = ((a90) ra0Var.g).a;
            qa0 qa0Var = new qa0(0, ra0Var);
            this.label = 1;
            if (eVar.b(dt5Var, rb8Var, qa0Var, this) == coroutineSingletons) {
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
