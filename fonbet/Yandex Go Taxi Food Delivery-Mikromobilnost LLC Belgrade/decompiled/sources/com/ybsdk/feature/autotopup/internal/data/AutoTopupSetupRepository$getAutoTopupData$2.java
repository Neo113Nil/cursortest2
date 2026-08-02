package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupTypeRequestDto;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutoTopupSettingsRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingsSuccessData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$getAutoTopupData$2", f = "AutoTopupSetupRepository.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$getAutoTopupData$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ String $autoTopupId;
    final /* synthetic */ AutoTopupTypeRequestDto $autoTopupType;
    final /* synthetic */ BigDecimal $threshold;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$getAutoTopupData$2(b bVar, AutoTopupTypeRequestDto autoTopupTypeRequestDto, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$autoTopupType = autoTopupTypeRequestDto;
        this.$agreementId = str;
        this.$autoTopupId = str2;
        this.$amount = bigDecimal;
        this.$threshold = bigDecimal2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupSetupRepository$getAutoTopupData$2(this.this$0, this.$autoTopupType, this.$agreementId, this.$autoTopupId, this.$amount, this.$threshold, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupSetupRepository$getAutoTopupData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            AutoTopupApi autoTopupApi = bVar.a;
            GetAutoTopupSettingsRequest getAutoTopupSettingsRequest = new GetAutoTopupSettingsRequest(this.$autoTopupType, this.$agreementId, this.$autoTopupId, this.$amount, this.$threshold, bVar.k.b());
            this.label = 1;
            g = autoTopupApi.g(getAutoTopupSettingsRequest, this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            g = ((Result) obj).getValue();
        }
        return new Result(g);
    }
}
