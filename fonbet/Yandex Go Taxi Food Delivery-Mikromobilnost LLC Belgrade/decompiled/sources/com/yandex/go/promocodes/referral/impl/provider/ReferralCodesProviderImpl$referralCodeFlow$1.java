package com.yandex.go.promocodes.referral.impl.provider;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/promocodes/referral/impl/net/dto/ReferralCodes;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.referral.impl.provider.ReferralCodesProviderImpl$referralCodeFlow$1", f = "ReferralCodesProviderImpl.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ReferralCodesProviderImpl$referralCodeFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCodesProviderImpl$referralCodeFlow$1(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReferralCodesProviderImpl$referralCodeFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReferralCodesProviderImpl$referralCodeFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        k kVar = this.this$0;
        this.label = 1;
        String Hg = kVar.a.Hg();
        return (Hg != null ? kVar.b(Hg, this) : zy11Var) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
