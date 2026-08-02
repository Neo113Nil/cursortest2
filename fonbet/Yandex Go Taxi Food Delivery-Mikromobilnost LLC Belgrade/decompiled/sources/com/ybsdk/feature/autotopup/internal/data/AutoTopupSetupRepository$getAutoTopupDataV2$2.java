package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2Request;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2ShowOnly;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SuccessData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$getAutoTopupDataV2$2", f = "AutoTopupSetupRepository.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$getAutoTopupDataV2$2 extends SuspendLambda implements tls {
    final /* synthetic */ Map<String, Object> $additionalData;
    final /* synthetic */ String $agreementId;
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ String $autoTopupId;
    final /* synthetic */ BigDecimal $limit;
    final /* synthetic */ AutoTopupSettingsV2ShowOnly $showOnly;
    final /* synthetic */ String $source;
    final /* synthetic */ BigDecimal $threshold;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$getAutoTopupDataV2$2(b bVar, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly, Map map, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$agreementId = str;
        this.$source = str2;
        this.$autoTopupId = str3;
        this.$amount = bigDecimal;
        this.$threshold = bigDecimal2;
        this.$limit = bigDecimal3;
        this.$showOnly = autoTopupSettingsV2ShowOnly;
        this.$additionalData = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupSetupRepository$getAutoTopupDataV2$2(this.this$0, this.$agreementId, this.$source, this.$autoTopupId, this.$amount, this.$threshold, this.$limit, this.$showOnly, this.$additionalData, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupSetupRepository$getAutoTopupDataV2$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            AutoTopupApi autoTopupApi = bVar.a;
            AutoTopupSettingsV2Request autoTopupSettingsV2Request = new AutoTopupSettingsV2Request(this.$agreementId, this.$source, this.$autoTopupId, this.$amount, this.$threshold, this.$limit, this.$showOnly, bVar.c.b(), com.ybsdk.core.common.data.network.dto.a.a(this.this$0.d.b()), this.this$0.k.b(), this.$additionalData);
            this.label = 1;
            c = autoTopupApi.c(autoTopupSettingsV2Request, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
