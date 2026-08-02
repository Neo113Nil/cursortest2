package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundInvoicesSectionDto;", "", "tabTitle", "", "emptyDivState", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "items", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetFoundChargeItemDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;)V", "getTabTitle", "()Ljava/lang/String;", "getEmptyDivState", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BudgetFoundInvoicesSectionDto {
    private final DivDataDto emptyDivState;
    private final List<BudgetFoundChargeItemDto> items;
    private final String tabTitle;

    public BudgetFoundInvoicesSectionDto(@Json(name = "title") String str, @Json(name = "empty_state_divkit") DivDataDto divDataDto, @Json(name = "items") List<BudgetFoundChargeItemDto> list) {
        this.tabTitle = str;
        this.emptyDivState = divDataDto;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BudgetFoundInvoicesSectionDto copy$default(BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto, String str, DivDataDto divDataDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = budgetFoundInvoicesSectionDto.tabTitle;
        }
        if ((i & 2) != 0) {
            divDataDto = budgetFoundInvoicesSectionDto.emptyDivState;
        }
        if ((i & 4) != 0) {
            list = budgetFoundInvoicesSectionDto.items;
        }
        return budgetFoundInvoicesSectionDto.copy(str, divDataDto, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTabTitle() {
        return this.tabTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getEmptyDivState() {
        return this.emptyDivState;
    }

    public final List<BudgetFoundChargeItemDto> component3() {
        return this.items;
    }

    public final BudgetFoundInvoicesSectionDto copy(@Json(name = "title") String tabTitle, @Json(name = "empty_state_divkit") DivDataDto emptyDivState, @Json(name = "items") List<BudgetFoundChargeItemDto> items) {
        return new BudgetFoundInvoicesSectionDto(tabTitle, emptyDivState, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BudgetFoundInvoicesSectionDto)) {
            return false;
        }
        BudgetFoundInvoicesSectionDto budgetFoundInvoicesSectionDto = (BudgetFoundInvoicesSectionDto) other;
        return jl40.l(this.tabTitle, budgetFoundInvoicesSectionDto.tabTitle) && jl40.l(this.emptyDivState, budgetFoundInvoicesSectionDto.emptyDivState) && jl40.l(this.items, budgetFoundInvoicesSectionDto.items);
    }

    public final DivDataDto getEmptyDivState() {
        return this.emptyDivState;
    }

    public final List<BudgetFoundChargeItemDto> getItems() {
        return this.items;
    }

    public final String getTabTitle() {
        return this.tabTitle;
    }

    public int hashCode() {
        int hashCode = this.tabTitle.hashCode() * 31;
        DivDataDto divDataDto = this.emptyDivState;
        return this.items.hashCode() + ((hashCode + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31);
    }

    public String toString() {
        String str = this.tabTitle;
        DivDataDto divDataDto = this.emptyDivState;
        List<BudgetFoundChargeItemDto> list = this.items;
        StringBuilder sb = new StringBuilder("BudgetFoundInvoicesSectionDto(tabTitle=");
        sb.append(str);
        sb.append(", emptyDivState=");
        sb.append(divDataDto);
        sb.append(", items=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
