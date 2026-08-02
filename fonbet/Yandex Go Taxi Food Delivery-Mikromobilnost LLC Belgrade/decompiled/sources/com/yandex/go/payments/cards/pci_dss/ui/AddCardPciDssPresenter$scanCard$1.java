package com.yandex.go.payments.cards.pci_dss.ui;

import defpackage.hn8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ra0;
import defpackage.tse;
import defpackage.wls;
import defpackage.ylm0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.pci_dss.ui.AddCardPciDssPresenter$scanCard$1", f = "AddCardPciDssPresenter.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddCardPciDssPresenter$scanCard$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ra0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCardPciDssPresenter$scanCard$1(ra0 ra0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ra0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddCardPciDssPresenter$scanCard$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddCardPciDssPresenter$scanCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hn8 hn8Var = this.this$0.f;
            this.label = 1;
            n = hn8Var.n(this);
            if (n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            n = ((Result) obj).getValue();
        }
        ra0 ra0Var = this.this$0;
        if (!(n instanceof Result.Failure)) {
            ra0.f(ra0Var, (ylm0) n);
        }
        return zy11.a;
    }
}
