package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/GetBudgetChargesResponse;", "", "header", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderDto;", "searchSection", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetSearchSectionDto;", "foundInvoicesSection", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundInvoicesSectionDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetSearchSectionDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundInvoicesSectionDto;)V", "getHeader", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderDto;", "getSearchSection", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetSearchSectionDto;", "getFoundInvoicesSection", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundInvoicesSectionDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetBudgetChargesResponse {
    private final BudgetFoundInvoicesSectionDto foundInvoicesSection;
    private final BudgetHeaderDto header;
    private final BudgetSearchSectionDto searchSection;

    public GetBudgetChargesResponse(@Json(name = "header") BudgetHeaderDto budgetHeaderDto, @Json(name = "search_section") BudgetSearchSectionDto budgetSearchSectionDto, @Json(name = "found_invoices_section") BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto) {
        this.header = budgetHeaderDto;
        this.searchSection = budgetSearchSectionDto;
        this.foundInvoicesSection = budgetFoundInvoicesSectionDto;
    }

    public static /* synthetic */ GetBudgetChargesResponse copy$default(GetBudgetChargesResponse getBudgetChargesResponse, BudgetHeaderDto budgetHeaderDto, BudgetSearchSectionDto budgetSearchSectionDto, BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            budgetHeaderDto = getBudgetChargesResponse.header;
        }
        if ((i & 2) != 0) {
            budgetSearchSectionDto = getBudgetChargesResponse.searchSection;
        }
        if ((i & 4) != 0) {
            budgetFoundInvoicesSectionDto = getBudgetChargesResponse.foundInvoicesSection;
        }
        return getBudgetChargesResponse.copy(budgetHeaderDto, budgetSearchSectionDto, budgetFoundInvoicesSectionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final BudgetHeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final BudgetSearchSectionDto getSearchSection() {
        return this.searchSection;
    }

    /* renamed from: component3, reason: from getter */
    public final BudgetFoundInvoicesSectionDto getFoundInvoicesSection() {
        return this.foundInvoicesSection;
    }

    public final GetBudgetChargesResponse copy(@Json(name = "header") BudgetHeaderDto header, @Json(name = "search_section") BudgetSearchSectionDto searchSection, @Json(name = "found_invoices_section") BudgetFoundInvoicesSectionDto foundInvoicesSection) {
        return new GetBudgetChargesResponse(header, searchSection, foundInvoicesSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetBudgetChargesResponse)) {
            return false;
        }
        GetBudgetChargesResponse getBudgetChargesResponse = (GetBudgetChargesResponse) other;
        return jl40.l(this.header, getBudgetChargesResponse.header) && jl40.l(this.searchSection, getBudgetChargesResponse.searchSection) && jl40.l(this.foundInvoicesSection, getBudgetChargesResponse.foundInvoicesSection);
    }

    public final BudgetFoundInvoicesSectionDto getFoundInvoicesSection() {
        return this.foundInvoicesSection;
    }

    public final BudgetHeaderDto getHeader() {
        return this.header;
    }

    public final BudgetSearchSectionDto getSearchSection() {
        return this.searchSection;
    }

    public int hashCode() {
        int hashCode = (this.searchSection.hashCode() + (this.header.hashCode() * 31)) * 31;
        BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto = this.foundInvoicesSection;
        return hashCode + (budgetFoundInvoicesSectionDto == null ? 0 : budgetFoundInvoicesSectionDto.hashCode());
    }

    public String toString() {
        return "GetBudgetChargesResponse(header=" + this.header + ", searchSection=" + this.searchSection + ", foundInvoicesSection=" + this.foundInvoicesSection + Extension.C_BRAKE;
    }
}
