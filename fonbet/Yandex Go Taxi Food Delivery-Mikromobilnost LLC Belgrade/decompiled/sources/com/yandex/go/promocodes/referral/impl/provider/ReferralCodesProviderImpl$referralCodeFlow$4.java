package com.yandex.go.promocodes.referral.impl.provider;

import coil3.request.CachePolicy;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralCode;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralOverrides;
import defpackage.aev;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vac;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.referral.impl.provider.ReferralCodesProviderImpl$referralCodeFlow$4", f = "ReferralCodesProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ReferralCodesProviderImpl$referralCodeFlow$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCodesProviderImpl$referralCodeFlow$4(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReferralCodesProviderImpl$referralCodeFlow$4 referralCodesProviderImpl$referralCodeFlow$4 = new ReferralCodesProviderImpl$referralCodeFlow$4(this.this$0, continuation);
        referralCodesProviderImpl$referralCodeFlow$4.L$0 = obj;
        return referralCodesProviderImpl$referralCodeFlow$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ReferralCodesProviderImpl$referralCodeFlow$4 referralCodesProviderImpl$referralCodeFlow$4 = (ReferralCodesProviderImpl$referralCodeFlow$4) create((ReferralCode) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        referralCodesProviderImpl$referralCodeFlow$4.invokeSuspend(zy11Var);
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
        kotlin.b.b(obj);
        k kVar = this.this$0;
        kVar.getClass();
        if (!referralCode.e) {
            ReferralOverrides.ReferralScreen referralScreen = referralCode.h.a;
            String str = referralScreen != null ? referralScreen.c : null;
            if (str != null) {
                com.yandex.go.image.domain.requests.g gVar = (com.yandex.go.image.domain.requests.g) kVar.b.e();
                gVar.c(((m7x0) ((k7x0) kVar.c.get())).a(str));
                aev aevVar = gVar.f;
                if (gVar.g) {
                    vac.c(aevVar, gVar.e, gVar.d);
                } else {
                    aevVar.h = vac.a;
                    aevVar.i = CachePolicy.DISABLED;
                }
                ((coil3.c) gVar.b).a(aevVar.a());
            }
        }
        return zy11.a;
    }
}
