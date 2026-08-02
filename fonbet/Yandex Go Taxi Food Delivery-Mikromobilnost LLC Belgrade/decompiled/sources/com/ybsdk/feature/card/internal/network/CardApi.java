package com.ybsdk.feature.card.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.feature.card.internal.network.dto.CardClaimingStaticInfoRequest;
import com.ybsdk.feature.card.internal.network.dto.CardClaimingStaticInfoResponse;
import com.ybsdk.feature.card.internal.network.dto.CardRenameRequest;
import com.ybsdk.feature.card.internal.network.dto.CardSubmitRequest;
import com.ybsdk.feature.card.internal.network.dto.CreateApplicationRequest;
import com.ybsdk.feature.card.internal.network.dto.CreateApplicationResponse;
import com.ybsdk.feature.card.internal.network.dto.GetApplicationStatusRequest;
import com.ybsdk.feature.card.internal.network.dto.GetApplicationStatusResponse;
import com.ybsdk.feature.card.internal.network.dto.GetCardCarouselRequest;
import com.ybsdk.feature.card.internal.network.dto.GetCardCarouselResponseV2;
import com.ybsdk.feature.card.internal.network.dto.GetPeriodLimitsRequest;
import com.ybsdk.feature.card.internal.network.dto.GetPeriodLimitsResponse;
import com.ybsdk.feature.card.internal.network.dto.SetCardStatusScreenRequest;
import com.ybsdk.feature.card.internal.network.dto.SetPeriodLimitsRequest;
import com.ybsdk.feature.card.internal.network.dto.SetPeriodLimitsResponse;
import com.ybsdk.feature.card.internal.network.dto.SettingsTermRequest;
import com.ybsdk.feature.card.internal.network.dto.SingleCardRequest;
import com.ybsdk.feature.card.internal.network.dto.SingleCardResponse;
import com.ybsdk.feature.card.internal.network.dto.YbCardSetStatusRequest;
import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import defpackage.iyd0;
import defpackage.l2r0;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import defpackage.zy11;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJF\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0\u00190\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00182\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH§@¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u001d2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH§@¢\u0006\u0004\b \u0010!J6\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u00190\u00062\b\b\u0001\u0010\u0003\u001a\u00020\"2\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b'\u0010(J&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0%0\u00062\b\b\u0001\u0010\u0003\u001a\u00020)H§@¢\u0006\u0004\b+\u0010,J&\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0%0\u00062\b\b\u0001\u0010\u0003\u001a\u00020-H§@¢\u0006\u0004\b/\u00100J\u001c\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0%0\u0006H§@¢\u0006\u0004\b1\u00102J&\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0%0\u00062\b\b\u0001\u0010\u0003\u001a\u000203H§@¢\u0006\u0004\b4\u00105J&\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070%0\u00062\b\b\u0001\u0010\u0003\u001a\u000206H§@¢\u0006\u0004\b8\u00109JF\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u001e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020:2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH§@¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/CardApi;", "", "Lcom/ybsdk/feature/card/internal/network/dto/CardSubmitRequest;", "request", "", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "g", "(Lcom/ybsdk/feature/card/internal/network/dto/CardSubmitRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardSetStatusRequest;", "", "headers", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse;", "h", "(Lcom/ybsdk/feature/card/internal/network/dto/YbCardSetStatusRequest;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingStaticInfoRequest;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingStaticInfoResponse;", "l", "(Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingStaticInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/GetPeriodLimitsRequest;", "Lcom/ybsdk/feature/card/internal/network/dto/GetPeriodLimitsResponse;", "a", "(Lcom/ybsdk/feature/card/internal/network/dto/GetPeriodLimitsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/SetPeriodLimitsRequest;", "Liyd0;", "Lcom/ybsdk/feature/card/internal/network/dto/SetPeriodLimitsResponse;", CoreConstants.PushMessage.SERVICE_TYPE, "(Lcom/ybsdk/feature/card/internal/network/dto/SetPeriodLimitsRequest;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/CreateApplicationRequest;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/card/internal/network/dto/CreateApplicationResponse;", "b", "(Lcom/ybsdk/feature/card/internal/network/dto/CreateApplicationRequest;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/GetApplicationStatusRequest;", "Ltq11;", "attemptNumber", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/card/internal/network/dto/GetApplicationStatusResponse;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "(Lcom/ybsdk/feature/card/internal/network/dto/GetApplicationStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/GetCardCarouselRequest;", "Lcom/ybsdk/feature/card/internal/network/dto/GetCardCarouselResponseV2;", "c", "(Lcom/ybsdk/feature/card/internal/network/dto/GetCardCarouselRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/CardRenameRequest;", "Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "f", "(Lcom/ybsdk/feature/card/internal/network/dto/CardRenameRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/SettingsTermRequest;", "e", "(Lcom/ybsdk/feature/card/internal/network/dto/SettingsTermRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardRequest;", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardResponse;", "d", "(Lcom/ybsdk/feature/card/internal/network/dto/SingleCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusScreenRequest;", "Ll2r0;", "k", "(Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusScreenRequest;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CardApi {
    @s490("v1/card/v1/settings/get_period_limits")
    Object a(@q76 GetPeriodLimitsRequest getPeriodLimitsRequest, Continuation<? super Result<GetPeriodLimitsResponse>> continuation);

    @s490("v1/applications/v1/card_reissue/create_application")
    Object b(@q76 CreateApplicationRequest createApplicationRequest, @z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, Continuation<? super Result<TwoFactorAuthResponse<CreateApplicationResponse>>> continuation);

    @s490("/v2/cards/get_cards_carousel")
    Object c(@q76 GetCardCarouselRequest getCardCarouselRequest, Continuation<? super Result<DataWithStatusResponse<GetCardCarouselResponseV2>>> continuation);

    @s490("v1/cards/screens/single_card_details")
    Object d(@q76 SingleCardRequest singleCardRequest, Continuation<? super Result<DataWithStatusResponse<SingleCardResponse>>> continuation);

    @s490("/v2/credit-limit/settings/term")
    Object e(@q76 SettingsTermRequest settingsTermRequest, Continuation<? super Result<DataWithStatusResponse<DivScreenDto>>> continuation);

    @s490("v1/cards/screens/card_renaming")
    Object f(@q76 CardRenameRequest cardRenameRequest, Continuation<? super Result<DataWithStatusResponse<DivScreenDto>>> continuation);

    @s490("v1/applications/v1/card/submit")
    Object g(@q76 CardSubmitRequest cardSubmitRequest, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<zy11>> continuation);

    @s490("v1/card/v1/set_status")
    Object h(@q76 YbCardSetStatusRequest ybCardSetStatusRequest, @z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, Continuation<? super Result<SecondAuthorizationResponse<Object>>> continuation);

    @s490("v1/card/v1/settings/set_period_limits")
    Object i(@q76 SetPeriodLimitsRequest setPeriodLimitsRequest, @z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, Continuation<? super Result<iyd0<SecondAuthorizationResponse<SetPeriodLimitsResponse>>>> continuation);

    @s490("v1/applications/v1/card_reissue/get_application_status")
    Object j(@q76 GetApplicationStatusRequest getApplicationStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<GetApplicationStatusResponse>>>> continuation);

    @s490("v1/cards/screens/set_status")
    Object k(@q76 SetCardStatusScreenRequest setCardStatusScreenRequest, @z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, Continuation<? super Result<TwoFactorAuthResponse<l2r0>>> continuation);

    @s490("v1/card/v1/claim_card_static")
    Object l(@q76 CardClaimingStaticInfoRequest cardClaimingStaticInfoRequest, Continuation<? super Result<CardClaimingStaticInfoResponse>> continuation);

    @s490("v1/credit-limit/settings/term")
    Object m(Continuation<? super Result<DataWithStatusResponse<DivScreenDto>>> continuation);
}
