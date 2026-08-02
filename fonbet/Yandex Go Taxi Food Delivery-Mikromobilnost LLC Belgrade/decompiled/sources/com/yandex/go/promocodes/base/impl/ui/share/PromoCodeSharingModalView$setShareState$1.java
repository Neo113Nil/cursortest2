package com.yandex.go.promocodes.base.impl.ui.share;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import defpackage.cnf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "referralCode", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.ui.share.PromoCodeSharingModalView$setShareState$1", f = "PromoCodeSharingModalView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PromoCodeSharingModalView$setShareState$1 extends SuspendLambda implements wls {
    final /* synthetic */ cnf0 $shareComponent;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PromoCodeSharingModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeSharingModalView$setShareState$1(PromoCodeSharingModalView promoCodeSharingModalView, cnf0 cnf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = promoCodeSharingModalView;
        this.$shareComponent = cnf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PromoCodeSharingModalView$setShareState$1 promoCodeSharingModalView$setShareState$1 = new PromoCodeSharingModalView$setShareState$1(this.this$0, this.$shareComponent, continuation);
        promoCodeSharingModalView$setShareState$1.L$0 = obj;
        return promoCodeSharingModalView$setShareState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PromoCodeSharingModalView$setShareState$1 promoCodeSharingModalView$setShareState$1 = (PromoCodeSharingModalView$setShareState$1) create((ReferralCode) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        promoCodeSharingModalView$setShareState$1.invokeSuspend(zy11Var);
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
        ReferralService referralService = referralCode.i;
        ReferralService referralService2 = ReferralService.TAXI;
        PromoCodeSharingModalView promoCodeSharingModalView = this.this$0;
        if (referralService == referralService2) {
            promoCodeSharingModalView.setupContentViewV2(this.$shareComponent, referralCode);
        } else {
            promoCodeSharingModalView.setupContentView(this.$shareComponent, referralCode);
        }
        return zy11.a;
    }
}
