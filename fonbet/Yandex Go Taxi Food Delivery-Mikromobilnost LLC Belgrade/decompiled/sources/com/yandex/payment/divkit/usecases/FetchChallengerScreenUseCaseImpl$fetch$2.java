package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltmk;", "<anonymous>", "()Ltmk;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.FetchChallengerScreenUseCaseImpl$fetch$2", f = "FetchChallengerScreenUseCase.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FetchChallengerScreenUseCaseImpl$fetch$2 extends SuspendLambda implements tls {
    final /* synthetic */ SbpChallengeInfo $info;
    final /* synthetic */ PaymentMethod.SbpToken $token;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchChallengerScreenUseCaseImpl$fetch$2(e eVar, SbpChallengeInfo sbpChallengeInfo, PaymentMethod.SbpToken sbpToken, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$info = sbpChallengeInfo;
        this.$token = sbpToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FetchChallengerScreenUseCaseImpl$fetch$2(this.this$0, this.$info, this.$token, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FetchChallengerScreenUseCaseImpl$fetch$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        SbpChallengeInfo sbpChallengeInfo = this.$info;
        PaymentMethod.SbpToken sbpToken = this.$token;
        this.label = 1;
        Object a = e.a(eVar, sbpChallengeInfo, sbpToken, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
