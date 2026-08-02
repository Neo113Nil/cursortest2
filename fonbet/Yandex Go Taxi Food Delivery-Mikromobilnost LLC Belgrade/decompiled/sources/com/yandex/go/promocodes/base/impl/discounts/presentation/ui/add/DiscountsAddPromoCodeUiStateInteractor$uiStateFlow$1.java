package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add;

import defpackage.a22;
import defpackage.avj0;
import defpackage.bms;
import defpackage.jpj;
import defpackage.kpj;
import defpackage.kyh0;
import defpackage.lpj;
import defpackage.mpj;
import defpackage.mvg;
import defpackage.npj;
import defpackage.ny61;
import defpackage.ppj;
import defpackage.qpj;
import defpackage.rpj;
import defpackage.spj;
import defpackage.w511;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "", "promoCodeValue", "Lqpj;", "activationState", "Llpj;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Ljava/lang/String;Lqpj;)Llpj;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodeUiStateInteractor$uiStateFlow$1", f = "DiscountsAddPromoCodeUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscountsAddPromoCodeUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ rpj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscountsAddPromoCodeUiStateInteractor$uiStateFlow$1(rpj rpjVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = rpjVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        DiscountsAddPromoCodeUiStateInteractor$uiStateFlow$1 discountsAddPromoCodeUiStateInteractor$uiStateFlow$1 = new DiscountsAddPromoCodeUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        discountsAddPromoCodeUiStateInteractor$uiStateFlow$1.L$0 = (String) obj2;
        discountsAddPromoCodeUiStateInteractor$uiStateFlow$1.L$1 = (qpj) obj3;
        return discountsAddPromoCodeUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String h;
        kpj kpjVar;
        String h2;
        DiscountsAddPromoCodeUiState$ButtonType discountsAddPromoCodeUiState$ButtonType;
        String str = (String) this.L$0;
        qpj qpjVar = (qpj) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a22 a22Var = this.this$0.c;
        boolean z = qpjVar instanceof mpj;
        if (z) {
            a22Var.getClass();
            h = ((mpj) qpjVar).b;
        } else {
            h = ((avj0) a22Var.a).h(kyh0.settings_promocode);
        }
        this.this$0.c.getClass();
        if (z) {
            kpjVar = null;
        } else {
            kpjVar = new kpj(!(qpjVar instanceof ppj), qpjVar instanceof npj ? ((npj) qpjVar).a : null);
        }
        zuj0 zuj0Var = this.this$0.c.a;
        if (z) {
            int i = spj.a[((mpj) qpjVar).a.ordinal()];
            if (i == 1) {
                h2 = ((avj0) zuj0Var).h(kyh0.add_credit_card_title);
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                h2 = ((avj0) zuj0Var).h(kyh0.promocode_select_card);
            }
        } else {
            h2 = ((avj0) zuj0Var).h(kyh0.activate_promocode);
        }
        DiscountsAddPromoCodeUiState$ButtonStatus discountsAddPromoCodeUiState$ButtonStatus = qpjVar instanceof ppj ? DiscountsAddPromoCodeUiState$ButtonStatus.LOADING : (str == null || str.length() == 0) ? DiscountsAddPromoCodeUiState$ButtonStatus.DISABLED : DiscountsAddPromoCodeUiState$ButtonStatus.ENABLED;
        if (z) {
            int i2 = spj.a[((mpj) qpjVar).a.ordinal()];
            if (i2 == 1) {
                discountsAddPromoCodeUiState$ButtonType = DiscountsAddPromoCodeUiState$ButtonType.CARD_ADD;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                discountsAddPromoCodeUiState$ButtonType = DiscountsAddPromoCodeUiState$ButtonType.CARD_SELECT;
            }
        } else {
            discountsAddPromoCodeUiState$ButtonType = DiscountsAddPromoCodeUiState$ButtonType.ACTIVATE;
        }
        return new lpj(h, kpjVar, new jpj(h2, discountsAddPromoCodeUiState$ButtonStatus, discountsAddPromoCodeUiState$ButtonType));
    }
}
