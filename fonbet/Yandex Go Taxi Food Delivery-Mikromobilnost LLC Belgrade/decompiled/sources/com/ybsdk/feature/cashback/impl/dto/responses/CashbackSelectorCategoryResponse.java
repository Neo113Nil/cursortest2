package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackSelectorCategoryResponse;", "", "categoryInfo", "Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackCategoryResponse;", "isSelected", "", "<init>", "(Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackCategoryResponse;Ljava/lang/Boolean;)V", "getCategoryInfo", "()Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackCategoryResponse;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackCategoryResponse;Ljava/lang/Boolean;)Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackSelectorCategoryResponse;", "equals", "other", "hashCode", "", "toString", "", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CashbackSelectorCategoryResponse {
    private final CashbackCategoryResponse categoryInfo;
    private final Boolean isSelected;

    public CashbackSelectorCategoryResponse(@Json(name = "category_info") CashbackCategoryResponse cashbackCategoryResponse, @Json(name = "is_selected") Boolean bool) {
        this.categoryInfo = cashbackCategoryResponse;
        this.isSelected = bool;
    }

    public static /* synthetic */ CashbackSelectorCategoryResponse copy$default(CashbackSelectorCategoryResponse cashbackSelectorCategoryResponse, CashbackCategoryResponse cashbackCategoryResponse, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            cashbackCategoryResponse = cashbackSelectorCategoryResponse.categoryInfo;
        }
        if ((i & 2) != 0) {
            bool = cashbackSelectorCategoryResponse.isSelected;
        }
        return cashbackSelectorCategoryResponse.copy(cashbackCategoryResponse, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final CashbackCategoryResponse getCategoryInfo() {
        return this.categoryInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    public final CashbackSelectorCategoryResponse copy(@Json(name = "category_info") CashbackCategoryResponse categoryInfo, @Json(name = "is_selected") Boolean isSelected) {
        return new CashbackSelectorCategoryResponse(categoryInfo, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashbackSelectorCategoryResponse)) {
            return false;
        }
        CashbackSelectorCategoryResponse cashbackSelectorCategoryResponse = (CashbackSelectorCategoryResponse) other;
        return jl40.l(this.categoryInfo, cashbackSelectorCategoryResponse.categoryInfo) && jl40.l(this.isSelected, cashbackSelectorCategoryResponse.isSelected);
    }

    public final CashbackCategoryResponse getCategoryInfo() {
        return this.categoryInfo;
    }

    public int hashCode() {
        int hashCode = this.categoryInfo.hashCode() * 31;
        Boolean bool = this.isSelected;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "CashbackSelectorCategoryResponse(categoryInfo=" + this.categoryInfo + ", isSelected=" + this.isSelected + Extension.C_BRAKE;
    }
}
