package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.feature.savings.internal.network.SavingsApi;
import com.ybsdk.feature.savings.internal.network.dto.FundOpenRequest;
import com.ybsdk.feature.savings.internal.network.dto.FundTopupInfoDto;
import defpackage.bob1;
import defpackage.bqs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenSuccessDataDto;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$openFund$2", f = "SavingsRepository.kt", l = {279}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$openFund$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $fundId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ Pair<bqs, HmacDto> $topupInfo;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$openFund$2(b bVar, String str, String str2, String str3, String str4, Pair pair, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$verificationToken = str;
        this.$operationId = str2;
        this.$idempotencyToken = str3;
        this.$fundId = str4;
        this.$topupInfo = pair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SavingsRepository$openFund$2(this.this$0, this.$verificationToken, this.$operationId, this.$idempotencyToken, this.$fundId, this.$topupInfo, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SavingsRepository$openFund$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SavingsApi savingsApi = this.this$0.a;
            String str = yu50.a;
            Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
            String str2 = this.$idempotencyToken;
            String str3 = this.$fundId;
            Pair<bqs, HmacDto> pair = this.$topupInfo;
            FundOpenRequest fundOpenRequest = new FundOpenRequest(str3, pair != null ? new FundTopupInfoDto(bob1.f(((bqs) pair.c()).a), ((bqs) pair.c()).b, (HmacDto) pair.f()) : null);
            this.label = 1;
            f = savingsApi.f(b, str2, fundOpenRequest, this);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f = ((Result) obj).getValue();
        }
        return new Result(f);
    }
}
