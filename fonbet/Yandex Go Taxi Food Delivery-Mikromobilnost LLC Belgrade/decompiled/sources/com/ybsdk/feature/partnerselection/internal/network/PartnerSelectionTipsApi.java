package com.ybsdk.feature.partnerselection.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.CheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.PartnerCheckResultDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.partner.GetAllPartnersRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.partner.GetPartnersResponseDto;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJF\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00100\u0007j\u0002`\u00110\u000f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\f2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00100\u0007j\u0002`\u00110\u000f0\u00062\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\fH§@¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00100\u0007j\u0002`\u00110\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\fH§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/PartnerSelectionTipsApi;", "", "", "idempotencyToken", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetAllPartnersRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetPartnersResponseDto;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetPartnersResponse;", "d", "(Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetAllPartnersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerRequest;", "", "headers", "Liyd0;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/PartnerCheckResultDto;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerResponse;", "a", "(Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerRequest;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Ljava/util/Map;Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PartnerSelectionTipsApi {
    @s490("v1/transfers/v3/tips/phone/check_user_bank")
    Object a(@q76 CheckUserPartnerRequest checkUserPartnerRequest, @uau Map<String, String> map, Continuation<? super Result<iyd0<DataWithStatusResponse<PartnerCheckResultDto>>>> continuation);

    @s490("/v1/transfers/v3/tips/phone/check_user_bank_status_start")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 CheckUserPartnerRequest checkUserPartnerRequest, Continuation<? super Result<DataWithStatusResponse<PartnerCheckResultDto>>> continuation);

    @s490("/v1/transfers/v3/tips/phone/check_user_bank_status")
    Object c(@uau Map<String, String> map, @q76 CheckUserPartnerRequest checkUserPartnerRequest, Continuation<? super Result<iyd0<DataWithStatusResponse<PartnerCheckResultDto>>>> continuation);

    @s490("v1/transfers/v3/tips/phone/get_all_banks")
    Object d(@z8u("X-Idempotency-Token") String str, @q76 GetAllPartnersRequest getAllPartnersRequest, Continuation<? super Result<DataWithStatusResponse<GetPartnersResponseDto>>> continuation);
}
