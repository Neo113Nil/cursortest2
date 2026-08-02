package com.ybsdk.feature.transfer.version2.internal.screens.budget.data;

import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.StatusInfoDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search.GetStatusChargeSearchResponse;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.entities.BudgetGetStatusEntity$Status;
import defpackage.qp6;
import defpackage.to6;
import defpackage.w511;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BudgetChargesRepository$getStatusSearch$3$1$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BudgetGetStatusEntity$Status budgetGetStatusEntity$Status;
        GetStatusChargeSearchResponse getStatusChargeSearchResponse = (GetStatusChargeSearchResponse) obj;
        ((a) this.receiver).getClass();
        int i = to6.a[getStatusChargeSearchResponse.getStatus().ordinal()];
        if (i == 1) {
            budgetGetStatusEntity$Status = BudgetGetStatusEntity$Status.SUCCESS;
        } else if (i == 2) {
            budgetGetStatusEntity$Status = BudgetGetStatusEntity$Status.IN_PROGRESS;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            budgetGetStatusEntity$Status = BudgetGetStatusEntity$Status.FAILED;
        }
        StatusInfoDto statusInfo = getStatusChargeSearchResponse.getStatusInfo();
        return new qp6(budgetGetStatusEntity$Status, statusInfo != null ? a.g(statusInfo) : null, getStatusChargeSearchResponse.getAction());
    }
}
