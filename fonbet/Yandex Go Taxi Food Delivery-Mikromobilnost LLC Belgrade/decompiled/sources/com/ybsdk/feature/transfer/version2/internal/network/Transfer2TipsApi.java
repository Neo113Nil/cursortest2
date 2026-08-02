package com.ybsdk.feature.transfer.version2.internal.network;

import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckTransferDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SenderHistoryDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmResponseDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmVersion2Request;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageDto;
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

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\r0\u0003j\u0002`\u000e0\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\bH§@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0003j\u0002`\u00130\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015JJ\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0001\u0010\u000b\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010$\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\"0\u0003j\u0002`#0!0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020&0\u0003j\u0002`'0\u0002H§@¢\u0006\u0004\b(\u0010\u0007¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/Transfer2TipsApi;", "", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageResponse;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idempotencyToken", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetSuggestedTargetsRequest;", "request", StateEntry.COLUMN_PATH, "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetTargetsResponseDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetTargetsResponse;", "e", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetSuggestedTargetsRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferResponse;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "headers", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmVersion2Request;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmResponseDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmResponse;", "d", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmVersion2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultResponse;", "c", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SenderHistoryDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SenderHistoryResponse;", "a", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Transfer2TipsApi {
    @s490("v1/transfers/v1/tips/c2c_by_phone/get_sender_history")
    Object a(Continuation<? super Result<DataWithStatusResponse<SenderHistoryDto>>> continuation);

    @s490("v1/transfers/v1/tips/check")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 TransferRequest transferRequest, Continuation<? super Result<DataWithStatusResponse<CheckTransferDto>>> continuation);

    @s490("v1/transfers/v1/tips/get_result")
    Object c(@q76 TransferGetResultRequest transferGetResultRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<TransferGetResultDto>>>> continuation);

    @s490("v1/transfers/v2/tips/confirm")
    Object d(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 TransferConfirmVersion2Request transferConfirmVersion2Request, Continuation<? super Result<TwoFactorAuthResponse<TransferConfirmResponseDto>>> continuation);

    @s490("v1/transfers/v3/tips/phone/{path}")
    Object e(@z8u("X-Idempotency-Token") String str, @q76 GetSuggestedTargetsRequest getSuggestedTargetsRequest, @pq90("path") String str2, Continuation<? super Result<DataWithStatusResponse<GetTargetsResponseDto>>> continuation);

    @s490("v1/transfers/v1/tips/get_transfers_page")
    Object f(Continuation<? super Result<DataWithStatusResponse<TransfersPageDto>>> continuation);
}
