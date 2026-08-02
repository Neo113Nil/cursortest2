package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.cashback.impl.entities.types.CashbackSelectionType;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackCategoryResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/cashback/impl/dto/responses/CashbackCategoryResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;", "cashbackSelectionTypeAdapter", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CashbackCategoryResponseJsonAdapter extends JsonAdapter<CashbackCategoryResponse> {
    private final JsonAdapter<CashbackSelectionType> cashbackSelectionTypeAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("category_id", "title", "subtitle", "image", "themed_image", "percent", "type");
    private final JsonAdapter<String> stringAdapter;

    public CashbackCategoryResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "categoryId");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "themedImage");
        this.cashbackSelectionTypeAdapter = moshi.adapter(CashbackSelectionType.class, emptySet, "selectionType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CashbackCategoryResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Themes<String> themes = null;
        String str5 = null;
        CashbackSelectionType cashbackSelectionType = null;
        while (true) {
            String str6 = str;
            if (!jsonReader.hasNext()) {
                String str7 = str2;
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("categoryId", "category_id", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("subtitle", "subtitle", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("image", "image", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("percent", "percent", jsonReader);
                }
                if (cashbackSelectionType != null) {
                    return new CashbackCategoryResponse(str6, str7, str3, str4, themes, str5, cashbackSelectionType);
                }
                throw Util.missingProperty("selectionType", "type", jsonReader);
            }
            String str8 = str2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str2 = str8;
                    str = str6;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("categoryId", "category_id", jsonReader);
                    }
                    str2 = str8;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str = str6;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    str2 = str8;
                    str = str6;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    str2 = str8;
                    str = str6;
                case 4:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                case 5:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("percent", "percent", jsonReader);
                    }
                    str2 = str8;
                    str = str6;
                case 6:
                    cashbackSelectionType = this.cashbackSelectionTypeAdapter.fromJson(jsonReader);
                    if (cashbackSelectionType == null) {
                        throw Util.unexpectedNull("selectionType", "type", jsonReader);
                    }
                    str2 = str8;
                    str = str6;
                default:
                    str2 = str8;
                    str = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CashbackCategoryResponse cashbackCategoryResponse) {
        CashbackCategoryResponse cashbackCategoryResponse2 = cashbackCategoryResponse;
        if (cashbackCategoryResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("category_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cashbackCategoryResponse2.getCategoryId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cashbackCategoryResponse2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cashbackCategoryResponse2.getSubtitle());
        jsonWriter.name("image");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cashbackCategoryResponse2.getImage());
        jsonWriter.name("themed_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) cashbackCategoryResponse2.getThemedImage());
        jsonWriter.name("percent");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cashbackCategoryResponse2.getPercent());
        jsonWriter.name("type");
        this.cashbackSelectionTypeAdapter.toJson(jsonWriter, (JsonWriter) cashbackCategoryResponse2.getSelectionType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(CashbackCategoryResponse)");
    }
}
