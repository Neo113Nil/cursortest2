package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedCategoriesResponse;", "", "maxCategories", "", "categories", "", "Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackSelectorCategoryResponse;", "<init>", "(ILjava/util/List;)V", "getMaxCategories", "()I", "getCategories", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SuggestedCategoriesResponse {
    private final List<CashbackSelectorCategoryResponse> categories;
    private final int maxCategories;

    public SuggestedCategoriesResponse(@Json(name = "max_selected_categories") int i, @Json(name = "categories") List<CashbackSelectorCategoryResponse> list) {
        this.maxCategories = i;
        this.categories = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestedCategoriesResponse copy$default(SuggestedCategoriesResponse suggestedCategoriesResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = suggestedCategoriesResponse.maxCategories;
        }
        if ((i2 & 2) != 0) {
            list = suggestedCategoriesResponse.categories;
        }
        return suggestedCategoriesResponse.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxCategories() {
        return this.maxCategories;
    }

    public final List<CashbackSelectorCategoryResponse> component2() {
        return this.categories;
    }

    public final SuggestedCategoriesResponse copy(@Json(name = "max_selected_categories") int maxCategories, @Json(name = "categories") List<CashbackSelectorCategoryResponse> categories) {
        return new SuggestedCategoriesResponse(maxCategories, categories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedCategoriesResponse)) {
            return false;
        }
        SuggestedCategoriesResponse suggestedCategoriesResponse = (SuggestedCategoriesResponse) other;
        return this.maxCategories == suggestedCategoriesResponse.maxCategories && jl40.l(this.categories, suggestedCategoriesResponse.categories);
    }

    public final List<CashbackSelectorCategoryResponse> getCategories() {
        return this.categories;
    }

    public final int getMaxCategories() {
        return this.maxCategories;
    }

    public int hashCode() {
        return this.categories.hashCode() + (Integer.hashCode(this.maxCategories) * 31);
    }

    public String toString() {
        return "SuggestedCategoriesResponse(maxCategories=" + this.maxCategories + ", categories=" + this.categories + Extension.C_BRAKE;
    }
}
