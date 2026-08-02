package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pqj;
import defpackage.tse;
import defpackage.wlf0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsViewPresenter$deletePromoCode$1", f = "DiscountsViewPresenter.kt", l = {227}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscountsViewPresenter$deletePromoCode$1 extends SuspendLambda implements wls {
    final /* synthetic */ wlf0 $promoCode;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountsViewPresenter$deletePromoCode$1(a aVar, wlf0 wlf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$promoCode = wlf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscountsViewPresenter$deletePromoCode$1(this.this$0, this.$promoCode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscountsViewPresenter$deletePromoCode$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar3 = this.this$0;
                wlf0 wlf0Var = this.$promoCode;
                try {
                    com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.b bVar = aVar3.E;
                    String str = wlf0Var.f;
                    List list = aVar3.G;
                    this.L$0 = aVar3;
                    this.L$1 = wlf0Var;
                    this.L$2 = aVar3;
                    this.L$3 = wlf0Var;
                    this.label = 1;
                    if (bVar.a(str, list, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar2 = aVar3;
                    aVar = aVar2;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar3;
                    List list2 = a.L;
                    ((pqj) aVar.Dg()).sg(false);
                    jst.e.k(th, "Deactivate failed");
                    aVar.y.a();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$2;
                aVar2 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    List list22 = a.L;
                    ((pqj) aVar.Dg()).sg(false);
                    jst.e.k(th, "Deactivate failed");
                    aVar.y.a();
                    return zy11.a;
                }
            }
            List list3 = a.L;
            ((pqj) aVar2.Dg()).sg(false);
            aVar2.y.a();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
