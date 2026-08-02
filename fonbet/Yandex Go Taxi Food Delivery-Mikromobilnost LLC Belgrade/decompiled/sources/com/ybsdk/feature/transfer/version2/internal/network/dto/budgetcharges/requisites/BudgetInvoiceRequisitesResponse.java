package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.requisites;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/requisites/BudgetInvoiceRequisitesResponse;", "", "divkitScreen", "Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;)V", "getDivkitScreen", "()Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BudgetInvoiceRequisitesResponse {
    private final DivScreenDto divkitScreen;

    public BudgetInvoiceRequisitesResponse(@Json(name = "divkit_screen") DivScreenDto divScreenDto) {
        this.divkitScreen = divScreenDto;
    }

    public static /* synthetic */ BudgetInvoiceRequisitesResponse copy$default(BudgetInvoiceRequisitesResponse budgetInvoiceRequisitesResponse, DivScreenDto divScreenDto, int i, Object obj) {
        if ((i & 1) != 0) {
            divScreenDto = budgetInvoiceRequisitesResponse.divkitScreen;
        }
        return budgetInvoiceRequisitesResponse.copy(divScreenDto);
    }

    /* renamed from: component1, reason: from getter */
    public final DivScreenDto getDivkitScreen() {
        return this.divkitScreen;
    }

    public final BudgetInvoiceRequisitesResponse copy(@Json(name = "divkit_screen") DivScreenDto divkitScreen) {
        return new BudgetInvoiceRequisitesResponse(divkitScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BudgetInvoiceRequisitesResponse) && jl40.l(this.divkitScreen, ((BudgetInvoiceRequisitesResponse) other).divkitScreen);
    }

    public final DivScreenDto getDivkitScreen() {
        return this.divkitScreen;
    }

    public int hashCode() {
        return this.divkitScreen.hashCode();
    }

    public String toString() {
        return "BudgetInvoiceRequisitesResponse(divkitScreen=" + this.divkitScreen + Extension.C_BRAKE;
    }
}
