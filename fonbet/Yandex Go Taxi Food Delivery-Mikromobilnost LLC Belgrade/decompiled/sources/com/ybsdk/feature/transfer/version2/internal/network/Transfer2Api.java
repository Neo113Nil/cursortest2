package com.ybsdk.feature.transfer.version2.internal.network;

import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckAccountBicDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckAccountBicRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckTransferDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.GetPartnersByBicDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.GetYbsByBicRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SenderHistoryDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmResponseDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmVersion2Request;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fund.FundDocsNoticeRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fund.FundDocsNoticeResult;
import com.ybsdk.feature.transfer.version2.internal.network.dto.targets.GetSuggestedTargetsRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.targets.GetTargetsResponseDto;
import defpackage.iyd0;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006J6\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e0\u000b2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0015\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u00140\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u001a\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00180\fj\u0002`\u00190\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJJ\u0010\"\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020 0\u001fj\u0002`!0\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0014\b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001c2\b\b\u0001\u0010\n\u001a\u00020\u001eH§@¢\u0006\u0004\b\"\u0010#J:\u0010*\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020(0\fj\u0002`)0'0\u000b2\b\b\u0001\u0010\n\u001a\u00020$2\b\b\u0001\u0010&\u001a\u00020%H§@¢\u0006\u0004\b*\u0010+J6\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\f0'0\u000b2\b\b\u0001\u0010\n\u001a\u00020,2\b\b\u0001\u0010&\u001a\u00020%H§@¢\u0006\u0004\b.\u0010/J4\u00103\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u0002010\fj\u0002`20\u000b2\b\b\u0001\u0010\n\u001a\u0002002\b\b\u0003\u0010\u0012\u001a\u00020\u0007H§@¢\u0006\u0004\b3\u00104J*\u00108\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u0002060\fj\u0002`70\u000b2\b\b\u0001\u0010\n\u001a\u000205H§@¢\u0006\u0004\b8\u00109J \u0010<\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020:0\fj\u0002`;0\u000bH§@¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/Transfer2Api;", "Lcom/ybsdk/feature/transfer/version2/internal/network/Me2MeDebitApi;", "Lcom/ybsdk/feature/transfer/version2/internal/network/FpsPayApi;", "Lcom/ybsdk/feature/transfer/version2/internal/network/TransfersDashboardApi;", "Lcom/ybsdk/feature/transfer/version2/internal/network/MobilePaymentsApi;", "Lcom/ybsdk/feature/transfer/version2/internal/network/InternetPaymentsApi;", "Lcom/ybsdk/feature/transfer/version2/internal/network/BudgetChargesApi;", "", "idempotencyToken", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageResponse;", "n", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetSuggestedTargetsRequest;", StateEntry.COLUMN_PATH, "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetTargetsResponseDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetTargetsResponse;", "e", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetSuggestedTargetsRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferResponse;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "headers", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmVersion2Request;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmResponseDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmResponse;", "h", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmVersion2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultResponse;", "c", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsNoticeRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsNoticeResult;", "d", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsNoticeRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GetYbsByBicRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GetPartnersByBicDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GetPartnersByBicResponse;", "B", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GetYbsByBicRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckAccountBicRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckAccountBicDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckAccountBicResponse;", "l", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckAccountBicRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SenderHistoryDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SenderHistoryResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Transfer2Api extends Me2MeDebitApi, FpsPayApi, TransfersDashboardApi, MobilePaymentsApi, InternetPaymentsApi, BudgetChargesApi {
    @s490("v1/transfers/v1/{path}")
    Object B(@q76 GetYbsByBicRequest getYbsByBicRequest, @pq90("path") String str, Continuation<? super Result<DataWithStatusResponse<GetPartnersByBicDto>>> continuation);

    @s490("v1/transfers/v1/c2c_by_phone/get_sender_history")
    Object a(Continuation<? super Result<DataWithStatusResponse<SenderHistoryDto>>> continuation);

    @s490("v1/transfers/v1/check")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 TransferRequest transferRequest, Continuation<? super Result<DataWithStatusResponse<CheckTransferDto>>> continuation);

    @s490("v1/transfers/v1/get_result")
    Object c(@q76 TransferGetResultRequest transferGetResultRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<TransferGetResultDto>>>> continuation);

    @s490("v1/fund_docs/notice/get")
    Object d(@q76 FundDocsNoticeRequest fundDocsNoticeRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<FundDocsNoticeResult>>>> continuation);

    @s490("v1/transfers/v3/phone/{path}")
    Object e(@z8u("X-Idempotency-Token") String str, @q76 GetSuggestedTargetsRequest getSuggestedTargetsRequest, @pq90("path") String str2, Continuation<? super Result<DataWithStatusResponse<GetTargetsResponseDto>>> continuation);

    @s490("v1/transfers/v2/confirm")
    Object h(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 TransferConfirmVersion2Request transferConfirmVersion2Request, Continuation<? super Result<TwoFactorAuthResponse<TransferConfirmResponseDto>>> continuation);

    @s490("v1/transfers/v1/check_account_bic")
    Object l(@q76 CheckAccountBicRequest checkAccountBicRequest, Continuation<? super Result<DataWithStatusResponse<CheckAccountBicDto>>> continuation);

    @s490("v1/transfers/v1/get_transfers_page")
    Object n(@z8u("X-Idempotency-Token") String str, @q76 TransfersPageRequest transfersPageRequest, Continuation<? super Result<DataWithStatusResponse<TransfersPageDto>>> continuation);
}
