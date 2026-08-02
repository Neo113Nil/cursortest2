package com.ybsdk.feature.main.internal.data.network;

import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.common.NoReply;
import com.ybsdk.feature.main.internal.data.network.dto.BindSbpAccountRequest;
import com.ybsdk.feature.main.internal.data.network.dto.BindSbpAccountResponse;
import com.ybsdk.feature.main.internal.data.network.dto.SbpAccountDetailsRequest;
import com.ybsdk.feature.main.internal.data.network.dto.SbpAccountDetailsResponse;
import com.ybsdk.feature.main.internal.data.network.dto.SbpAccountsYbsSuccessDataDto;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0003\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/SbpAccountApi;", "", "Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountDetailsRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountDetailsResponse;", "b", "(Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/core/utils/dto/common/NoReply;", "d", "Lcom/ybsdk/feature/main/internal/data/network/dto/BindSbpAccountRequest;", "Lcom/ybsdk/feature/main/internal/data/network/dto/BindSbpAccountResponse;", "a", "(Lcom/ybsdk/feature/main/internal/data/network/dto/BindSbpAccountRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", StateEntry.COLUMN_PATH, "Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountsYbsSuccessDataDto;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SbpAccountApi {
    @s490("v1/sbp_accounts/bind_account")
    Object a(@q76 BindSbpAccountRequest bindSbpAccountRequest, Continuation<? super Result<DataWithStatusResponse<BindSbpAccountResponse>>> continuation);

    @s490("v1/sbp_accounts/account_details")
    Object b(@q76 SbpAccountDetailsRequest sbpAccountDetailsRequest, Continuation<? super Result<DataWithStatusResponse<SbpAccountDetailsResponse>>> continuation);

    @s490("v1/sbp_accounts/{path}")
    Object c(@pq90("path") String str, Continuation<? super Result<DataWithStatusResponse<SbpAccountsYbsSuccessDataDto>>> continuation);

    @s490("v1/sbp_accounts/unbind_account")
    Object d(@q76 SbpAccountDetailsRequest sbpAccountDetailsRequest, Continuation<? super Result<DataWithStatusResponse<NoReply>>> continuation);
}
