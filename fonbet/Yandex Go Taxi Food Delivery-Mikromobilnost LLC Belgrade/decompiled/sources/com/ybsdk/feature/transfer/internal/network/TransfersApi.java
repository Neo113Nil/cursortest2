package com.ybsdk.feature.transfer.internal.network;

import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import com.ybsdk.feature.transfer.internal.network.dto.CheckUserTransferTargetResponse;
import com.ybsdk.feature.transfer.internal.network.dto.CheckUserYbRequest;
import com.ybsdk.feature.transfer.internal.network.dto.info.GetTransferInfoRequest;
import com.ybsdk.feature.transfer.internal.network.dto.info.GetTransferInfoResponse;
import com.ybsdk.feature.transfer.internal.network.dto.partners.GetAllYbsRequest;
import com.ybsdk.feature.transfer.internal.network.dto.partners.GetYbsResponse;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.TransferResultWithId;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.confirm.simplified.ConfirmSimplifiedRequest;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.result.GetResultRequest;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.result.GetResultResponse;
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

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJD\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u000f2\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00162\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0018\u0010\u0019JP\u0010 \u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001e0\u001dj\u0002`\u001f0\u00120\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001a2\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/TransfersApi;", "", "Lcom/ybsdk/feature/transfer/internal/network/dto/info/GetTransferInfoRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/feature/transfer/internal/network/dto/info/GetTransferInfoResponse;", "e", "(Lcom/ybsdk/feature/transfer/internal/network/dto/info/GetTransferInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/internal/network/dto/partners/GetAllYbsRequest;", "", StateEntry.COLUMN_PATH, "Lcom/ybsdk/feature/transfer/internal/network/dto/partners/GetYbsResponse;", "a", "(Lcom/ybsdk/feature/transfer/internal/network/dto/partners/GetAllYbsRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idempotencyToken", "Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserYbRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponse;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserYbRequest;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/result/GetResultRequest;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/result/GetResultResponse;", "c", "(Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/result/GetResultRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "headers", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/confirm/simplified/ConfirmSimplifiedRequest;", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithId;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/confirm/simplified/ConfirmSimplifiedResponse;", "d", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/confirm/simplified/ConfirmSimplifiedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransfersApi {
    @s490("v1/transfers/v1/faster/{path}")
    Object a(@q76 GetAllYbsRequest getAllYbsRequest, @pq90("path") String str, Continuation<? super Result<GetYbsResponse>> continuation);

    @s490("v1/transfers/v2/faster/{path}")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 CheckUserYbRequest checkUserYbRequest, @pq90("path") String str2, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<CheckUserTransferTargetResponse>>> continuation);

    @s490("v1/transfers/v1/transfer/get_result")
    Object c(@q76 GetResultRequest getResultRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<GetResultResponse>>> continuation);

    @s490("v1/transfers/v1/transfer/simplified_confirm")
    Object d(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 ConfirmSimplifiedRequest confirmSimplifiedRequest, Continuation<? super Result<iyd0<SecondAuthorizationResponse<TransferResultWithId>>>> continuation);

    @s490("v1/transfers/v1/phone/get_transfer_info")
    Object e(@q76 GetTransferInfoRequest getTransferInfoRequest, Continuation<? super Result<GetTransferInfoResponse>> continuation);
}
