package com.ybsdk.feature.transfer.version2.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.GetBudgetChargesResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.requisites.BudgetInvoiceRequisitesRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.requisites.BudgetInvoiceRequisitesResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search.GetStatusChargeSearchRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search.GetStatusChargeSearchResponse;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search.StartChargeSearchRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search.StartChargeSearchResponse;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00030\u00150\u00022\b\b\u0001\u0010\b\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/BudgetChargesApi;", "", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/GetBudgetChargesResponse;", "z", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/requisites/BudgetInvoiceRequisitesRequest;", "request", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/requisites/BudgetInvoiceRequisitesResponse;", "t", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/requisites/BudgetInvoiceRequisitesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idempotencyToken", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/StartChargeSearchRequest;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/StartChargeSearchResponse;", "f", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/StartChargeSearchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponse;", "m", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BudgetChargesApi {
    @s490("v1/transfers/budget/search_by_uin/start")
    Object f(@z8u("X-Idempotency-Token") String str, @q76 StartChargeSearchRequest startChargeSearchRequest, Continuation<? super Result<DataWithStatusResponse<StartChargeSearchResponse>>> continuation);

    @s490("v1/transfers/budget/search_by_uin/get_status")
    Object m(@q76 GetStatusChargeSearchRequest getStatusChargeSearchRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<GetStatusChargeSearchResponse>>>> continuation);

    @s490("v1/transfers/budget/screen/invoice_requisites")
    Object t(@q76 BudgetInvoiceRequisitesRequest budgetInvoiceRequisitesRequest, Continuation<? super Result<DataWithStatusResponse<BudgetInvoiceRequisitesResponse>>> continuation);

    @s490("v1/transfers/budget/get_invoices_screen")
    Object z(Continuation<? super Result<DataWithStatusResponse<GetBudgetChargesResponse>>> continuation);
}
