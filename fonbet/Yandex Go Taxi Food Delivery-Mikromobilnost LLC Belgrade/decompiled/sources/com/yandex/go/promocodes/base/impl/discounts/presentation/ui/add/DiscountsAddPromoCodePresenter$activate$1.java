package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add;

import com.yandex.go.promocodes.base.impl.discounts.domain.entities.activation.DiscountsPromoCodeActivationAction;
import defpackage.hpj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sqj;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodePresenter$activate$1", f = "DiscountsAddPromoCodePresenter.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscountsAddPromoCodePresenter$activate$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promoCodeValue;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountsAddPromoCodePresenter$activate$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$promoCodeValue = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscountsAddPromoCodePresenter$activate$1(this.this$0, this.$promoCodeValue, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscountsAddPromoCodePresenter$activate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        com.yandex.go.promocodes.base.impl.discounts.domain.interactors.a aVar = bVar.A;
        String str = this.$promoCodeValue;
        List list = bVar.C;
        hpj hpjVar = new hpj(bVar);
        this.label = 1;
        aVar.getClass();
        int i2 = sqj.a[(str.length() == 0 ? DiscountsPromoCodeActivationAction.DO_NOTHING : DiscountsPromoCodeActivationAction.ACTIVATE).ordinal()];
        if (i2 == 1) {
            obj2 = zy11Var;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            obj2 = aVar.a(str, list, hpjVar, this);
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
