package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.core.common.data.network.dto.cache.CacheableResponseDto;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.dashboard.internal.data.dto.Card;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV3ExternalRequest;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV3Request;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV3Response;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV4Response;
import com.ybsdk.feature.dashboard.internal.data.dto.GetCardWidgetInfoRequest;
import com.ybsdk.feature.dashboard.internal.data.dto.GetDashboardRequest;
import com.ybsdk.feature.dashboard.internal.data.dto.GetDashboardResponse;
import defpackage.iyd0;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000e\u0010\u000bJ&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00140\bj\u0002`\u00150\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00190\bj\u0002`\u001a0\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010 \u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00190\bj\u0002`\u001a0\u001f0\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00182\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/DashboardApi;", "", "", "firstInstallTime", "productId", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Request;", "requestBody", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Response;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/core/common/data/network/dto/cache/CacheableResponseDto;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV4Response;", "f", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3ExternalRequest;", "a", "(Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3ExternalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/GetDashboardRequest;", "request", "Lcom/ybsdk/feature/dashboard/internal/data/dto/GetDashboardResponse;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardResponse;", "e", "(Ljava/lang/String;Lcom/ybsdk/feature/dashboard/internal/data/dto/GetDashboardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/GetCardWidgetInfoRequest;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/Card;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardWidgetInfoResponse;", "d", "(Lcom/ybsdk/feature/dashboard/internal/data/dto/GetCardWidgetInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltq11;", "attemptNumber", "Liyd0;", "c", "(Lcom/ybsdk/feature/dashboard/internal/data/dto/GetCardWidgetInfoRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DashboardApi {
    @s490("v1/screens/dashboard/external")
    Object a(@q76 DashboardV3ExternalRequest dashboardV3ExternalRequest, Continuation<? super Result<DataWithStatusResponse<DashboardV3Response>>> continuation);

    @s490("v1/screens/dashboard/{product_id}")
    Object b(@z8u("X-YB-First-Install-Time") String str, @pq90("product_id") String str2, @q76 DashboardV3Request dashboardV3Request, Continuation<? super Result<DataWithStatusResponse<DashboardV3Response>>> continuation);

    @s490("v1/cards/get_card_widget_info")
    Object c(@q76 GetCardWidgetInfoRequest getCardWidgetInfoRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<Card>>>> continuation);

    @s490("v1/cards/get_card_widget_info")
    Object d(@q76 GetCardWidgetInfoRequest getCardWidgetInfoRequest, Continuation<? super Result<DataWithStatusResponse<Card>>> continuation);

    @s490("v1/screens/dashboard")
    Object e(@z8u("X-YB-First-Install-Time") String str, @q76 GetDashboardRequest getDashboardRequest, Continuation<? super Result<DataWithStatusResponse<GetDashboardResponse>>> continuation);

    @s490("v2/screens/dashboard/{product_id}")
    Object f(@z8u("X-YB-First-Install-Time") String str, @pq90("product_id") String str2, @q76 DashboardV3Request dashboardV3Request, Continuation<? super Result<DataWithStatusResponse<CacheableResponseDto<DashboardV4Response>>>> continuation);
}
