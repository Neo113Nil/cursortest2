package com.ybsdk.feature.partnerselection.internal.network;

import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.CheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.PartnerCheckResultDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerResultDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderPartnersByCountryDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderPartnersByCountryRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.partner.GetAllPartnersRequest;
import com.ybsdk.feature.partnerselection.internal.network.dto.partner.GetPartnersResponseDto;
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

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J@\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\bj\u0002`\u000f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\r2\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011JP\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00160\bj\u0002`\u00170\u00150\u00072\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00142\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001a\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00160\bj\u0002`\u00170\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00142\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001d0\bj\u0002`\u001e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u001c2\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/PartnerSelectionApi;", "", "", "idempotencyToken", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetAllPartnersRequest;", "request", StateEntry.COLUMN_PATH, "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetPartnersResponseDto;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetPartnersResponse;", "d", "(Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetAllPartnersRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderPartnersByCountryRequest;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderPartnersByCountryDto;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderPartnersByCountryResponse;", "a", "(Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderPartnersByCountryRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "headers", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerRequest;", "Liyd0;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/PartnerCheckResultDto;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerResponse;", "b", "(Ljava/util/Map;Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerRequest;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResponse;", "e", "(Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PartnerSelectionApi {
    @s490("v1/transfers/v1/cross_border/{path}")
    Object a(@z8u("X-Idempotency-Token") String str, @q76 CrossBorderPartnersByCountryRequest crossBorderPartnersByCountryRequest, @pq90("path") String str2, Continuation<? super Result<DataWithStatusResponse<CrossBorderPartnersByCountryDto>>> continuation);

    @s490("/v1/transfers/v3/phone/{path}")
    Object b(@uau Map<String, String> map, @q76 CheckUserPartnerRequest checkUserPartnerRequest, @pq90("path") String str, Continuation<? super Result<iyd0<DataWithStatusResponse<PartnerCheckResultDto>>>> continuation);

    @s490("/v1/transfers/v3/phone/{path}")
    Object c(@z8u("X-Idempotency-Token") String str, @q76 CheckUserPartnerRequest checkUserPartnerRequest, @pq90("path") String str2, Continuation<? super Result<DataWithStatusResponse<PartnerCheckResultDto>>> continuation);

    @s490("v1/transfers/v3/phone/{path}")
    Object d(@z8u("X-Idempotency-Token") String str, @q76 GetAllPartnersRequest getAllPartnersRequest, @pq90("path") String str2, Continuation<? super Result<DataWithStatusResponse<GetPartnersResponseDto>>> continuation);

    @s490("v1/transfers/cross_border/{path}")
    Object e(@z8u("X-Idempotency-Token") String str, @q76 CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest, @pq90("path") String str2, Continuation<? super Result<DataWithStatusResponse<CrossBorderCheckUserPartnerResultDto>>> continuation);
}
