package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedCategoriesResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedCategoriesResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackSelectorCategoryResponse;", "listOfCashbackSelectorCategoryResponseAdapter", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SuggestedCategoriesResponseJsonAdapter extends JsonAdapter<SuggestedCategoriesResponse> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<CashbackSelectorCategoryResponse>> listOfCashbackSelectorCategoryResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("max_selected_categories", "categories");

    public SuggestedCategoriesResponseJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "maxCategories");
        this.listOfCashbackSelectorCategoryResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, CashbackSelectorCategoryResponse.class), emptySet, "categories");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SuggestedCategoriesResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        List<CashbackSelectorCategoryResponse> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("maxCategories", "max_selected_categories", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfCashbackSelectorCategoryResponseAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("categories", "categories", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("maxCategories", "max_selected_categories", jsonReader);
        }
        int intValue = num.intValue();
        if (list != null) {
            return new SuggestedCategoriesResponse(intValue, list);
        }
        throw Util.missingProperty("categories", "categories", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SuggestedCategoriesResponse suggestedCategoriesResponse) {
        SuggestedCategoriesResponse suggestedCategoriesResponse2 = suggestedCategoriesResponse;
        if (suggestedCategoriesResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("max_selected_categories");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(suggestedCategoriesResponse2.getMaxCategories()));
        jsonWriter.name("categories");
        this.listOfCashbackSelectorCategoryResponseAdapter.toJson(jsonWriter, (JsonWriter) suggestedCategoriesResponse2.getCategories());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(SuggestedCategoriesResponse)");
    }
}
