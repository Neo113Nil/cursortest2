package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "themedParameterOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableThemedParameterOfStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/GradientDto;", "nullableGradientDtoAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProductBackgroundDtoJsonAdapter extends JsonAdapter<ProductBackgroundDto> {
    private final JsonAdapter<GradientDto> nullableGradientDtoAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("color", "image", "gradient");
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public ProductBackgroundDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(ThemedParameter.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themedParameterOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "color");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "image");
        this.nullableGradientDtoAdapter = moshi.adapter(GradientDto.class, emptySet, "gradient");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductBackgroundDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedParameter<String> themedParameter = null;
        ThemedParameter<String> themedParameter2 = null;
        GradientDto gradientDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                if (themedParameter == null) {
                    throw Util.unexpectedNull("color", "color", jsonReader);
                }
            } else if (selectName == 1) {
                themedParameter2 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                gradientDto = this.nullableGradientDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (themedParameter != null) {
            return new ProductBackgroundDto(themedParameter, themedParameter2, gradientDto);
        }
        throw Util.missingProperty("color", "color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductBackgroundDto productBackgroundDto) {
        ProductBackgroundDto productBackgroundDto2 = productBackgroundDto;
        if (productBackgroundDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productBackgroundDto2.getColor());
        jsonWriter.name("image");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productBackgroundDto2.getImage());
        jsonWriter.name("gradient");
        this.nullableGradientDtoAdapter.toJson(jsonWriter, (JsonWriter) productBackgroundDto2.getGradient());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(ProductBackgroundDto)");
    }
}
