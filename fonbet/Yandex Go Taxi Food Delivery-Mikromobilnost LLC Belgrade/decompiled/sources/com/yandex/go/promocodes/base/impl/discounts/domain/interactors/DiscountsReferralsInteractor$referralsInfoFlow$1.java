package com.yandex.go.promocodes.base.impl.discounts.domain.interactors;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.mvg;
import defpackage.nrj;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", AuthSdkActivity.RESPONSE_TYPE_CODE, "", "canShow", "Lnrj;", "<anonymous>", "(Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;Z)Lnrj;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.domain.interactors.DiscountsReferralsInteractor$referralsInfoFlow$1", f = "DiscountsReferralsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscountsReferralsInteractor$referralsInfoFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DiscountsReferralsInteractor$referralsInfoFlow$1 discountsReferralsInteractor$referralsInfoFlow$1 = new DiscountsReferralsInteractor$referralsInfoFlow$1(3, (Continuation) obj3);
        discountsReferralsInteractor$referralsInfoFlow$1.L$0 = (ReferralCode) obj;
        discountsReferralsInteractor$referralsInfoFlow$1.Z$0 = booleanValue;
        return discountsReferralsInteractor$referralsInfoFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReferralCode referralCode = (ReferralCode) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new nrj(z, referralCode.h, referralCode.i);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
