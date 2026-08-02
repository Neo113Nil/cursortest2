package com.yandex.go.promocodes.referral.impl.provider;

import com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodes;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.referral.impl.provider.ReferralCodesProviderImpl$ReferralCodesCache$update$2", f = "ReferralCodesProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ReferralCodesProviderImpl$ReferralCodesCache$update$2 extends SuspendLambda implements wls {
    final /* synthetic */ ReferralCodes $value;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCodesProviderImpl$ReferralCodesCache$update$2(f fVar, ReferralCodes referralCodes, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$value = referralCodes;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReferralCodesProviderImpl$ReferralCodesCache$update$2(this.this$0, this.$value, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ReferralCodesProviderImpl$ReferralCodesCache$update$2 referralCodesProviderImpl$ReferralCodesCache$update$2 = (ReferralCodesProviderImpl$ReferralCodesCache$update$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        referralCodesProviderImpl$ReferralCodesCache$update$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.a.h("LAST_KNOWN_REFERRAL_CODES", ReferralCodes.Companion.serializer(), this.$value);
        return zy11.a;
    }
}
