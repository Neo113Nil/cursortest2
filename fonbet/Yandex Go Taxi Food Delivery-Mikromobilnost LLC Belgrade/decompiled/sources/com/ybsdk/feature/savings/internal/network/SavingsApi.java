package com.ybsdk.feature.savings.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.common.NoReply;
import com.ybsdk.feature.savings.internal.network.dto.DashboardDataResponse;
import com.ybsdk.feature.savings.internal.network.dto.DashboardDataResponseV3;
import com.ybsdk.feature.savings.internal.network.dto.DiffRateCalendarResponse;
import com.ybsdk.feature.savings.internal.network.dto.FundOpenRequest;
import com.ybsdk.feature.savings.internal.network.dto.FundOpenSuccessDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundOperationRequest;
import com.ybsdk.feature.savings.internal.network.dto.FundOperationRequestStatusRequest;
import com.ybsdk.feature.savings.internal.network.dto.FundOperationRequestStatusSuccessResponseDto;
import com.ybsdk.feature.savings.internal.network.dto.FundOperationStartSuccessDataDto;
import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusRequest;
import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusSuccessResponseDto;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountClosingRequest;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountClosingResponse;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountInfoRequest;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountInfoResponse;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountOpenRequest;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountOpenResponse;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountOpeningStatusRequest;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountOpeningStatusResponse;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountOrderSetRequest;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountSettingsRequest;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountSettingsResponse;
import com.ybsdk.feature.savings.internal.network.dto.SavingsListRequest;
import com.ybsdk.feature.savings.internal.network.dto.v4.SavingsAccountOrderSetRequestV2;
import com.ybsdk.feature.savings.internal.network.dto.v4.SavingsDashboardV4Response;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u000e0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u000e0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00122\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00062\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u00062\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J6\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00070\u000e0\u00062\b\b\u0001\u0010\u0005\u001a\u00020!2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b#\u0010$J2\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000e0\u00062\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016H§@¢\u0006\u0004\b&\u0010'J<\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u000e0\u00062\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0001\u0010\u0005\u001a\u00020(H§@¢\u0006\u0004\b*\u0010+JB\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00070\u000e0\u00062\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0001\u0010\u0005\u001a\u00020(H§@¢\u0006\u0004\b-\u0010+J&\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020.H§@¢\u0006\u0004\b0\u00101J0\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u000202H§@¢\u0006\u0004\b4\u00105J*\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u000206H§@¢\u0006\u0004\b8\u00109J0\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020:H§@¢\u0006\u0004\b<\u0010=J0\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020>H§@¢\u0006\u0004\b?\u0010@J\u001c\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00070\u0006H§@¢\u0006\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/SavingsApi;", "", "", "idempotencyToken", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpenRequest;", "body", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpenResponse;", "e", "(Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse;", "d", "(Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusRequest;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessResponseDto;", "b", "(Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "headers", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenRequest;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenSuccessDataDto;", "f", "(Ljava/util/Map;Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequest;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationStartSuccessDataDto;", "h", "(Ljava/util/Map;Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusRequest;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusSuccessResponseDto;", "o", "(Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/DashboardDataResponse;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsListRequest;", "Lcom/ybsdk/feature/savings/internal/network/dto/DashboardDataResponseV3;", "k", "(Ljava/util/Map;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsListRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsDashboardV4Response;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountInfoRequest;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountInfoResponse;", "n", "(Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountClosingRequest;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountClosingResponse;", "g", "(Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountClosingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsRequest;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsResponse;", CoreConstants.PushMessage.SERVICE_TYPE, "(Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOrderSetRequest;", "Lcom/ybsdk/core/utils/dto/common/NoReply;", "m", "(Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOrderSetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsAccountOrderSetRequestV2;", "c", "(Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/v4/SavingsAccountOrderSetRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarResponse;", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SavingsApi {
    @s490("v2/savings-account/list")
    Object a(@uau Map<String, String> map, Continuation<? super Result<iyd0<DashboardDataResponse>>> continuation);

    @s490("v1/fund/request/status")
    Object b(@q76 FundRequestStatusRequest fundRequestStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<FundRequestStatusSuccessResponseDto>>>> continuation);

    @s490("/v2/savings-account/order/set")
    Object c(@z8u("X-Idempotency-Token") String str, @q76 SavingsAccountOrderSetRequestV2 savingsAccountOrderSetRequestV2, Continuation<? super Result<DataWithStatusResponse<NoReply>>> continuation);

    @s490("v1/savings-account/request/status")
    Object d(@q76 SavingsAccountOpeningStatusRequest savingsAccountOpeningStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<SavingsAccountOpeningStatusResponse>>>> continuation);

    @s490("v1/savings-account/open")
    Object e(@z8u("X-Idempotency-Token") String str, @q76 SavingsAccountOpenRequest savingsAccountOpenRequest, Continuation<? super Result<DataWithStatusResponse<SavingsAccountOpenResponse>>> continuation);

    @s490("v1/fund/open")
    Object f(@uau Map<String, String> map, @z8u("X-Idempotency-Token") String str, @q76 FundOpenRequest fundOpenRequest, Continuation<? super Result<TwoFactorAuthResponse<FundOpenSuccessDataDto>>> continuation);

    @s490("v1/savings-account/close")
    Object g(@z8u("X-Idempotency-Token") String str, @q76 SavingsAccountClosingRequest savingsAccountClosingRequest, Continuation<? super Result<DataWithStatusResponse<SavingsAccountClosingResponse>>> continuation);

    @s490("v1/fund/operation/start")
    Object h(@uau Map<String, String> map, @z8u("X-Idempotency-Token") String str, @q76 FundOperationRequest fundOperationRequest, Continuation<? super Result<TwoFactorAuthResponse<FundOperationStartSuccessDataDto>>> continuation);

    @s490("v1/savings-account/settings/set")
    Object i(@z8u("X-Idempotency-Token") String str, @q76 SavingsAccountSettingsRequest savingsAccountSettingsRequest, Continuation<? super Result<SavingsAccountSettingsResponse>> continuation);

    @s490("v4/savings-account/list")
    Object j(@uau Map<String, String> map, @q76 SavingsListRequest savingsListRequest, Continuation<? super Result<iyd0<DataWithStatusResponse<SavingsDashboardV4Response>>>> continuation);

    @s490("v3/savings-account/list")
    Object k(@uau Map<String, String> map, @q76 SavingsListRequest savingsListRequest, Continuation<? super Result<iyd0<DashboardDataResponseV3>>> continuation);

    @s490("v1/savings/diff-rate-calendar")
    Object l(Continuation<? super Result<DataWithStatusResponse<DiffRateCalendarResponse>>> continuation);

    @s490("/v1/savings-account/order/set")
    Object m(@z8u("X-Idempotency-Token") String str, @q76 SavingsAccountOrderSetRequest savingsAccountOrderSetRequest, Continuation<? super Result<DataWithStatusResponse<NoReply>>> continuation);

    @s490("v3/savings-account/get")
    Object n(@q76 SavingsAccountInfoRequest savingsAccountInfoRequest, Continuation<? super Result<DataWithStatusResponse<SavingsAccountInfoResponse>>> continuation);

    @s490("v1/fund/operation/status")
    Object o(@q76 FundOperationRequestStatusRequest fundOperationRequestStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<FundOperationRequestStatusSuccessResponseDto>>>> continuation);
}
