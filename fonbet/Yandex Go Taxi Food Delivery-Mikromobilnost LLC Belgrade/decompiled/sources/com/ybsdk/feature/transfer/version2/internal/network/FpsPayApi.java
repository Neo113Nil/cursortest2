package com.ybsdk.feature.transfer.version2.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.common.NoReply;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay.FpsPayConfirmRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay.FpsPayEnrollDto;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JF\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/FpsPayApi;", "", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/FpsPayEnrollDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/FpsPayEnrollResponse;", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idempotencyToken", "", "headers", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/FpsPayConfirmRequest;", "request", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/core/utils/dto/common/NoReply;", RemoteBioParameters.X, "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/FpsPayConfirmRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FpsPayApi {
    @s490("v1/payments/v1/fps_pay/get_enroll_info")
    Object q(Continuation<? super Result<DataWithStatusResponse<FpsPayEnrollDto>>> continuation);

    @s490("v1/tokens/confirm")
    Object x(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 FpsPayConfirmRequest fpsPayConfirmRequest, Continuation<? super Result<TwoFactorAuthResponse<NoReply>>> continuation);
}
