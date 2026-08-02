package com.ybsdk.feature.transfer.version2.internal.network;

import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckTransferDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder.CrossBorderSenderHistoryDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder.CrossBorderSuggestedPartnerRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder.CrossBorderSuggestedPartnersDto;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J>\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\bj\u0002`\u000f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\bj\u0002`\u00130\u0007H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/Transfer2CrossBorderApi;", "", "", "idempotencyToken", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSuggestedPartnerRequest;", "request", StateEntry.COLUMN_PATH, "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSuggestedPartnersDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSuggestedPartnersResponse;", "c", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSuggestedPartnerRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferResponse;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSenderHistoryDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSenderHistoryResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Transfer2CrossBorderApi {
    @s490("v1/transfers/v1/cross_border/get_sender_history")
    Object a(Continuation<? super Result<DataWithStatusResponse<CrossBorderSenderHistoryDto>>> continuation);

    @s490("v1/transfers/v1/cross_border/check")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 TransferRequest transferRequest, Continuation<? super Result<DataWithStatusResponse<CheckTransferDto>>> continuation);

    @s490("v1/transfers/v1/cross_border/{path}")
    Object c(@z8u("X-Idempotency-Token") String str, @q76 CrossBorderSuggestedPartnerRequest crossBorderSuggestedPartnerRequest, @pq90("path") String str2, Continuation<? super Result<DataWithStatusResponse<CrossBorderSuggestedPartnersDto>>> continuation);
}
