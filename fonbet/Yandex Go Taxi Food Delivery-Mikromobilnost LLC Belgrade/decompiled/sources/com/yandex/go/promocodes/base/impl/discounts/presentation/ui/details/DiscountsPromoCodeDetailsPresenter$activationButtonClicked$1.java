package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import defpackage.da0;
import defpackage.drj;
import defpackage.frj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qnh;
import defpackage.tse;
import defpackage.wls;
import defpackage.ynv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsPresenter$activationButtonClicked$1", f = "DiscountsPromoCodeDetailsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class DiscountsPromoCodeDetailsPresenter$activationButtonClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ drj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountsPromoCodeDetailsPresenter$activationButtonClicked$1(drj drjVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = drjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscountsPromoCodeDetailsPresenter$activationButtonClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DiscountsPromoCodeDetailsPresenter$activationButtonClicked$1 discountsPromoCodeDetailsPresenter$activationButtonClicked$1 = (DiscountsPromoCodeDetailsPresenter$activationButtonClicked$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        discountsPromoCodeDetailsPresenter$activationButtonClicked$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ynv0 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        drj drjVar = this.this$0;
        qnh qnhVar = drjVar.L;
        b = drjVar.G.b(null, null);
        ((da0) qnhVar.a).r(new frj(b, 0));
        return zy11.a;
    }
}
