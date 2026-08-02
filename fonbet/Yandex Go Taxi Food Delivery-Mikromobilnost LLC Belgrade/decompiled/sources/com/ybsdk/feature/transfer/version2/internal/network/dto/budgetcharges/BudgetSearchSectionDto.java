package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetSearchSectionDto;", "", "tabTitle", "", "searchField", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetUinSearchFieldDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetUinSearchFieldDto;)V", "getTabTitle", "()Ljava/lang/String;", "getSearchField", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetUinSearchFieldDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BudgetSearchSectionDto {
    private final BudgetUinSearchFieldDto searchField;
    private final String tabTitle;

    public BudgetSearchSectionDto(@Json(name = "title") String str, @Json(name = "uin_search_field") BudgetUinSearchFieldDto budgetUinSearchFieldDto) {
        this.tabTitle = str;
        this.searchField = budgetUinSearchFieldDto;
    }

    public static /* synthetic */ BudgetSearchSectionDto copy$default(BudgetSearchSectionDto budgetSearchSectionDto, String str, BudgetUinSearchFieldDto budgetUinSearchFieldDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = budgetSearchSectionDto.tabTitle;
        }
        if ((i & 2) != 0) {
            budgetUinSearchFieldDto = budgetSearchSectionDto.searchField;
        }
        return budgetSearchSectionDto.copy(str, budgetUinSearchFieldDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTabTitle() {
        return this.tabTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final BudgetUinSearchFieldDto getSearchField() {
        return this.searchField;
    }

    public final BudgetSearchSectionDto copy(@Json(name = "title") String tabTitle, @Json(name = "uin_search_field") BudgetUinSearchFieldDto searchField) {
        return new BudgetSearchSectionDto(tabTitle, searchField);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BudgetSearchSectionDto)) {
            return false;
        }
        BudgetSearchSectionDto budgetSearchSectionDto = (BudgetSearchSectionDto) other;
        return jl40.l(this.tabTitle, budgetSearchSectionDto.tabTitle) && jl40.l(this.searchField, budgetSearchSectionDto.searchField);
    }

    public final BudgetUinSearchFieldDto getSearchField() {
        return this.searchField;
    }

    public final String getTabTitle() {
        return this.tabTitle;
    }

    public int hashCode() {
        return this.searchField.hashCode() + (this.tabTitle.hashCode() * 31);
    }

    public String toString() {
        return "BudgetSearchSectionDto(tabTitle=" + this.tabTitle + ", searchField=" + this.searchField + Extension.C_BRAKE;
    }
}
