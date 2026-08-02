package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackSelectorCategoryResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackSelectorCategoryResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackCategoryResponse;", "cashbackCategoryResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CashbackSelectorCategoryResponseJsonAdapter extends JsonAdapter<CashbackSelectorCategoryResponse> {
    private final JsonAdapter<CashbackCategoryResponse> cashbackCategoryResponseAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("category_info", "is_selected");

    public CashbackSelectorCategoryResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.cashbackCategoryResponseAdapter = moshi.adapter(CashbackCategoryResponse.class, emptySet, "categoryInfo");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isSelected");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CashbackSelectorCategoryResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CashbackCategoryResponse cashbackCategoryResponse = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                cashbackCategoryResponse = this.cashbackCategoryResponseAdapter.fromJson(jsonReader);
                if (cashbackCategoryResponse == null) {
                    throw Util.unexpectedNull("categoryInfo", "category_info", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (cashbackCategoryResponse != null) {
            return new CashbackSelectorCategoryResponse(cashbackCategoryResponse, bool);
        }
        throw Util.missingProperty("categoryInfo", "category_info", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CashbackSelectorCategoryResponse cashbackSelectorCategoryResponse) {
        CashbackSelectorCategoryResponse cashbackSelectorCategoryResponse2 = cashbackSelectorCategoryResponse;
        if (cashbackSelectorCategoryResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("category_info");
        this.cashbackCategoryResponseAdapter.toJson(jsonWriter, (JsonWriter) cashbackSelectorCategoryResponse2.getCategoryInfo());
        jsonWriter.name("is_selected");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) cashbackSelectorCategoryResponse2.isSelected());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(CashbackSelectorCategoryResponse)");
    }
}
