package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR(\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "themedParameterOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableThemedParameterOfStringAdapter", "", "nullableThemedParameterOfListOfStringAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProductSkinMiniDtoJsonAdapter extends JsonAdapter<ProductSkinMiniDto> {
    private final JsonAdapter<ThemedParameter<List<String>>> nullableThemedParameterOfListOfStringAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("background_image", "background_color", "title_color", "end_icon", "rays_gradient", "selection_color", "top_gradient_color", "balance_shimmer_color", "balance_skeleton_color");
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public ProductSkinMiniDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(ThemedParameter.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themedParameterOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "backgroundImage");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "titleColor");
        this.nullableThemedParameterOfListOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, Types.newParameterizedType(List.class, String.class)), emptySet, "raysGradient");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductSkinMiniDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedParameter<String> themedParameter = null;
        ThemedParameter<String> themedParameter2 = null;
        ThemedParameter<String> themedParameter3 = null;
        ThemedParameter<String> themedParameter4 = null;
        ThemedParameter<List<String>> themedParameter5 = null;
        ThemedParameter<String> themedParameter6 = null;
        ThemedParameter<String> themedParameter7 = null;
        ThemedParameter<String> themedParameter8 = null;
        ThemedParameter<String> themedParameter9 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull("backgroundImage", "background_image", jsonReader);
                    }
                    break;
                case 1:
                    themedParameter2 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter2 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    break;
                case 2:
                    themedParameter3 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    themedParameter4 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    themedParameter5 = this.nullableThemedParameterOfListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    themedParameter6 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    themedParameter7 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    themedParameter8 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    themedParameter9 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (themedParameter == null) {
            throw Util.missingProperty("backgroundImage", "background_image", jsonReader);
        }
        if (themedParameter2 != null) {
            return new ProductSkinMiniDto(themedParameter, themedParameter2, themedParameter3, themedParameter4, themedParameter5, themedParameter6, themedParameter7, themedParameter8, themedParameter9);
        }
        throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductSkinMiniDto productSkinMiniDto) {
        ProductSkinMiniDto productSkinMiniDto2 = productSkinMiniDto;
        if (productSkinMiniDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("background_image");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSkinMiniDto2.getBackgroundImage());
        jsonWriter.name("background_color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSkinMiniDto2.getBackgroundColor());
        jsonWriter.name("title_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSkinMiniDto2.getTitleColor());
        jsonWriter.name("end_icon");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSkinMiniDto2.getEndIconImage());
        jsonWriter.name("rays_gradient");
        this.nullableThemedParameterOfListOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSkinMiniDto2.getRaysGradient());
        jsonWriter.name("selection_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSkinMiniDto2.getSelectionColor());
        jsonWriter.name("top_gradient_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSkinMiniDto2.getTopGradientColor());
        jsonWriter.name("balance_shimmer_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSkinMiniDto2.getBalanceShimmerColor());
        jsonWriter.name("balance_skeleton_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) productSkinMiniDto2.getBalanceSkeletonColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ProductSkinMiniDto)");
    }
}
