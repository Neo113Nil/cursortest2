package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoFundDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupParamsDto;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import defpackage.i04;
import defpackage.lr3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.xv3;
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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$saveAutoTopup$4", f = "AutoTopupSetupRepository.kt", l = {351}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$saveAutoTopup$4 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ SaveAutoTopupRequest $saveAutoTopupRequest;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$saveAutoTopup$4(b bVar, SaveAutoTopupRequest saveAutoTopupRequest, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$saveAutoTopupRequest = saveAutoTopupRequest;
        this.$idempotencyToken = str;
        this.$verificationToken = str2;
        this.$operationId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupSetupRepository$saveAutoTopup$4(this.this$0, this.$saveAutoTopupRequest, this.$idempotencyToken, this.$verificationToken, this.$operationId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupSetupRepository$saveAutoTopup$4) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            xv3 xv3Var = this.this$0.b;
            AutoTopupParamsDto params = this.$saveAutoTopupRequest.getParams();
            AutoFundDto autoFundData = this.$saveAutoTopupRequest.getAutoFundData();
            HmacDto a2 = xv3Var.a(i04.a(params, autoFundData != null ? new lr3(autoFundData.getEnabled(), autoFundData.getFundAmountLimit()) : null), this.$saveAutoTopupRequest.getAgreementId(), null, this.$idempotencyToken, this.$verificationToken);
            AutoTopupApi autoTopupApi = this.this$0.a;
            String str = this.$idempotencyToken;
            Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
            SaveAutoTopupRequest copy$default = SaveAutoTopupRequest.copy$default(this.$saveAutoTopupRequest, null, null, null, null, a2, 15, null);
            this.label = 1;
            a = autoTopupApi.a(str, b, copy$default, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
