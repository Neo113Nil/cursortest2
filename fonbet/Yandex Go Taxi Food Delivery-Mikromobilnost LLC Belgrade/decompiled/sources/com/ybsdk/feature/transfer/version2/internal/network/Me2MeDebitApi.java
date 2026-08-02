package com.ybsdk.feature.transfer.version2.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitAutoPullRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitAutoPullResultDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitAutoPullScreenRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitAutoPullScreenStatusSuccessDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitConfirmRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitGetAutoPullResultDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitGetResultRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitPageInfoDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitResultDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitTransferIdDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.TransferInfoMe2MeRequest;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJJ\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u00110\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00180\u0005j\u0002`\u00190\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u001a\u0010\u001bJJ\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001d0\u000fj\u0002`\u001e0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001f\u0010 J*\u0010\"\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001d0\u0005j\u0002`!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\"\u0010#J \u0010&\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020$0\u0005j\u0002`%0\u0004H§@¢\u0006\u0004\b&\u0010'J*\u0010+\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0\u0005j\u0002`*0\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/Me2MeDebitApi;", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/TransferInfoMe2MeRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitPageInfoDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/TransferInfoMe2MeResponse;", "k", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/TransferInfoMe2MeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idempotencyToken", "", "headers", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitConfirmRequest;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitTransferIdDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitConfirmResponse;", "s", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitConfirmRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitGetResultRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitGetResultResponse;", "g", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitGetResultRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullResultDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullConfirmResponse;", "o", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullDeleteResponse;", "v", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitGetAutoPullResultDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/AutoPullPermissionsGetResponse;", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenStatusSuccessDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenResponse;", "p", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Me2MeDebitApi {
    @s490("v1/transfers/v1/me2me_debit/get_result")
    Object g(@q76 Me2MeDebitGetResultRequest me2MeDebitGetResultRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<Me2MeDebitResultDto>>>> continuation);

    @s490("v1/transfers/v1/me2me_debit/get_transfer_info")
    Object k(@q76 TransferInfoMe2MeRequest transferInfoMe2MeRequest, Continuation<? super Result<DataWithStatusResponse<Me2MeDebitPageInfoDto>>> continuation);

    @s490("v1/transfers/v1/me2me_debit/auto_pull_permission/confirm")
    Object o(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 Me2MeDebitAutoPullRequest me2MeDebitAutoPullRequest, Continuation<? super Result<TwoFactorAuthResponse<Me2MeDebitAutoPullResultDto>>> continuation);

    @s490("/v1/transfers/v1/me2me_debit/auto_pull_screen")
    Object p(@q76 Me2MeDebitAutoPullScreenRequest me2MeDebitAutoPullScreenRequest, Continuation<? super Result<DataWithStatusResponse<Me2MeDebitAutoPullScreenStatusSuccessDto>>> continuation);

    @s490("v1/transfers/v1/me2me_debit/auto_pull_permission/get")
    Object r(Continuation<? super Result<DataWithStatusResponse<Me2MeDebitGetAutoPullResultDto>>> continuation);

    @s490("v1/transfers/v1/me2me_debit/confirm")
    Object s(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 Me2MeDebitConfirmRequest me2MeDebitConfirmRequest, Continuation<? super Result<TwoFactorAuthResponse<Me2MeDebitTransferIdDto>>> continuation);

    @s490("v1/transfers/v1/me2me_debit/auto_pull_permission/delete")
    Object v(@q76 Me2MeDebitAutoPullRequest me2MeDebitAutoPullRequest, Continuation<? super Result<DataWithStatusResponse<Me2MeDebitAutoPullResultDto>>> continuation);
}
