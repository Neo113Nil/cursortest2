package com.ybsdk.feature.autotopup.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupSettingsSuccessData;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupPaymentStatusSuccessResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupRetryPaymentResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.CreateAutoTopupRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.CreateAutoTopupResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutoTopupSettingsRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutoTopupStatusRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutoTopupStatusSuccessData;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutotopupPaymentStatusRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.RetryAutotopupPaymentRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupSuccessResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.UpdateAutoTopupRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.UpdateAutoTopupResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.ValidateAutoTopupRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.ValidateAutoTopupSuccessData;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutoTopupSaveRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutoTopupSaveResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutoTopupSettingsRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutoTopupSettingsResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutoTopupValidationRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutoTopupValidationResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingSaveRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingSaveResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingSettingsRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingSettingsResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2Request;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2SuccessData;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.SaveAutoTopupV2Request;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.SaveAutoTopupV2SuccessResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.ValidateAutoTopupV2Request;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.ValidateAutoTopupV2SuccessData;
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

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJF\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c2\b\b\u0001\u0010\u000f\u001a\u00020\u001eH§@¢\u0006\u0004\b!\u0010\"J&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020'H§@¢\u0006\u0004\b)\u0010*JF\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c2\b\b\u0001\u0010\u000f\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.J&\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020/H§@¢\u0006\u0004\b1\u00102J&\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u000203H§@¢\u0006\u0004\b5\u00106J6\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00100:0\u00062\b\b\u0001\u0010\u000f\u001a\u0002072\b\b\u0001\u00109\u001a\u000208H§@¢\u0006\u0004\b<\u0010=J6\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00100:0\u00062\b\b\u0001\u0010\u000f\u001a\u0002072\b\b\u0001\u00109\u001a\u000208H§@¢\u0006\u0004\b>\u0010=JF\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u001f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c2\b\b\u0001\u0010\u000f\u001a\u00020?H§@¢\u0006\u0004\bA\u0010BJF\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u001f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c2\b\b\u0001\u0010\u000f\u001a\u00020CH§@¢\u0006\u0004\bE\u0010FJ0\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00100\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020GH§@¢\u0006\u0004\bI\u0010JJ0\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00100\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020GH§@¢\u0006\u0004\bK\u0010JJ6\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\u00100:0\u00062\b\b\u0001\u0010\u000f\u001a\u00020L2\b\b\u0001\u00109\u001a\u000208H§@¢\u0006\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/AutoTopupApi;", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/CreateAutoTopupRequest;", "paymentInfoRequest", "", "idempotencyToken", "Lkotlin/Result;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/CreateAutoTopupResponse;", "l", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/CreateAutoTopupRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/UpdateAutoTopupRequest;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/UpdateAutoTopupResponse;", "b", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/UpdateAutoTopupRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupSettingsRequest;", "request", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingsSuccessData;", "g", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Request;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SuccessData;", "c", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSettingsRequest;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSettingsResponse;", CoreConstants.PushMessage.SERVICE_TYPE, "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "headers", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSaveRequest;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSaveResponse;", "r", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSaveRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationRequest;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationResponse;", "p", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsRequest;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsResponse;", "d", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSaveRequest;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSaveResponse;", "q", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSaveRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupRequest;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupSuccessData;", "h", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/ValidateAutoTopupV2Request;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/ValidateAutoTopupV2SuccessData;", "n", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/ValidateAutoTopupV2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusSuccessData;", "f", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse;", "a", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2Request;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2SuccessResponse;", "k", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/RetryAutotopupPaymentRequest;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupRetryPaymentResponse;", "e", "(Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/RetryAutotopupPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutotopupPaymentStatusRequest;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusSuccessResponse;", "m", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutotopupPaymentStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AutoTopupApi {
    @s490("v1/autotopup/save")
    Object a(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 SaveAutoTopupRequest saveAutoTopupRequest, Continuation<? super Result<TwoFactorAuthResponse<SaveAutoTopupSuccessResponse>>> continuation);

    @s490("v1/topup/v1/update_autotopup")
    Object b(@q76 UpdateAutoTopupRequest updateAutoTopupRequest, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<UpdateAutoTopupResponse>> continuation);

    @s490("/v4/autotopup/settings")
    Object c(@q76 AutoTopupSettingsV2Request autoTopupSettingsV2Request, Continuation<? super Result<DataWithStatusResponse<AutoTopupSettingsV2SuccessData>>> continuation);

    @s490("v1/rounding/settings")
    Object d(@q76 RoundingSettingsRequest roundingSettingsRequest, Continuation<? super Result<DataWithStatusResponse<RoundingSettingsResponse>>> continuation);

    @s490("v1/autotopup/payment/retry")
    Object e(@z8u("X-Idempotency-Token") String str, @q76 RetryAutotopupPaymentRequest retryAutotopupPaymentRequest, Continuation<? super Result<DataWithStatusResponse<AutotopupRetryPaymentResponse>>> continuation);

    @s490("v1/autotopup/request/status")
    Object f(@q76 GetAutoTopupStatusRequest getAutoTopupStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<GetAutoTopupStatusSuccessData>>>> continuation);

    @s490("v3/autotopup/settings")
    Object g(@q76 GetAutoTopupSettingsRequest getAutoTopupSettingsRequest, Continuation<? super Result<DataWithStatusResponse<AutoTopupSettingsSuccessData>>> continuation);

    @s490("v3/autotopup/validate")
    Object h(@q76 ValidateAutoTopupRequest validateAutoTopupRequest, Continuation<? super Result<DataWithStatusResponse<ValidateAutoTopupSuccessData>>> continuation);

    @s490("v1/regular_autotopup/settings")
    Object i(@q76 RegularAutoTopupSettingsRequest regularAutoTopupSettingsRequest, Continuation<? super Result<DataWithStatusResponse<RegularAutoTopupSettingsResponse>>> continuation);

    @s490("v2/autotopup/request/status")
    Object j(@q76 GetAutoTopupStatusRequest getAutoTopupStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<GetAutoTopupStatusSuccessData>>>> continuation);

    @s490("v2/autotopup/save")
    Object k(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 SaveAutoTopupV2Request saveAutoTopupV2Request, Continuation<? super Result<TwoFactorAuthResponse<SaveAutoTopupV2SuccessResponse>>> continuation);

    @s490("v1/topup/v1/create_autotopup")
    Object l(@q76 CreateAutoTopupRequest createAutoTopupRequest, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<CreateAutoTopupResponse>> continuation);

    @s490("v1/autotopup/payment/last")
    Object m(@q76 GetAutotopupPaymentStatusRequest getAutotopupPaymentStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<AutotopupPaymentStatusSuccessResponse>>>> continuation);

    @s490("v4/autotopup/validate")
    Object n(@q76 ValidateAutoTopupV2Request validateAutoTopupV2Request, Continuation<? super Result<DataWithStatusResponse<ValidateAutoTopupV2SuccessData>>> continuation);

    @s490("v2/autotopup/payment/retry")
    Object o(@z8u("X-Idempotency-Token") String str, @q76 RetryAutotopupPaymentRequest retryAutotopupPaymentRequest, Continuation<? super Result<DataWithStatusResponse<AutotopupRetryPaymentResponse>>> continuation);

    @s490("v1/regular_autotopup/validate")
    Object p(@q76 RegularAutoTopupValidationRequest regularAutoTopupValidationRequest, Continuation<? super Result<DataWithStatusResponse<RegularAutoTopupValidationResponse>>> continuation);

    @s490("v1/rounding/save")
    Object q(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 RoundingSaveRequest roundingSaveRequest, Continuation<? super Result<TwoFactorAuthResponse<RoundingSaveResponse>>> continuation);

    @s490("v1/regular_autotopup/save")
    Object r(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 RegularAutoTopupSaveRequest regularAutoTopupSaveRequest, Continuation<? super Result<TwoFactorAuthResponse<RegularAutoTopupSaveResponse>>> continuation);
}
