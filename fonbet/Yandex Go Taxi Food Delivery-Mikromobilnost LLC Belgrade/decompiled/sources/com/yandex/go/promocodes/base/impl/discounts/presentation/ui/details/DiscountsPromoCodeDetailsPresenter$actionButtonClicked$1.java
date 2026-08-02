package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import defpackage.drj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsPresenter$actionButtonClicked$1", f = "DiscountsPromoCodeDetailsPresenter.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class DiscountsPromoCodeDetailsPresenter$actionButtonClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ drj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountsPromoCodeDetailsPresenter$actionButtonClicked$1(drj drjVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = drjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscountsPromoCodeDetailsPresenter$actionButtonClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscountsPromoCodeDetailsPresenter$actionButtonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.M;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            this.label = 1;
            if (kotlinx.coroutines.a.i(3000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        r0 r0Var2 = this.this$0.M;
        Boolean bool2 = Boolean.FALSE;
        r0Var2.getClass();
        r0Var2.m(null, bool2);
        return zy11.a;
    }
}
