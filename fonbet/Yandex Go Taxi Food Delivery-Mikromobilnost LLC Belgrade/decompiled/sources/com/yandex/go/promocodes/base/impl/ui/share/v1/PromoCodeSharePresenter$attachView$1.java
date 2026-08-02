package com.yandex.go.promocodes.base.impl.ui.share.v1;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wmf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "referralCode", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.ui.share.v1.PromoCodeSharePresenter$attachView$1", f = "PromoCodeSharePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PromoCodeSharePresenter$attachView$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wmf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeSharePresenter$attachView$1(wmf0 wmf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wmf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PromoCodeSharePresenter$attachView$1 promoCodeSharePresenter$attachView$1 = new PromoCodeSharePresenter$attachView$1(this.this$0, continuation);
        promoCodeSharePresenter$attachView$1.L$0 = obj;
        return promoCodeSharePresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PromoCodeSharePresenter$attachView$1 promoCodeSharePresenter$attachView$1 = (PromoCodeSharePresenter$attachView$1) create((ReferralCode) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        promoCodeSharePresenter$attachView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReferralCode referralCode = (ReferralCode) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.Kg(referralCode);
        return zy11.a;
    }
}
