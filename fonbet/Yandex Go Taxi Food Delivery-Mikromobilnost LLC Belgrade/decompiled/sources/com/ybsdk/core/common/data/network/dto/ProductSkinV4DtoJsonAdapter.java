package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ProductSkinV4DtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinV4Dto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDto;", "productSkinMiniDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "productBackgroundDtoAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProductSkinV4DtoJsonAdapter extends JsonAdapter<ProductSkinV4Dto> {
    private final JsonReader.Options options = JsonReader.Options.of("id", "mini", C0553n3.g);
    private final JsonAdapter<ProductBackgroundDto> productBackgroundDtoAdapter;
    private final JsonAdapter<ProductSkinMiniDto> productSkinMiniDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public ProductSkinV4DtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.productSkinMiniDtoAdapter = moshi.adapter(ProductSkinMiniDto.class, emptySet, "mini");
        this.productBackgroundDtoAdapter = moshi.adapter(ProductBackgroundDto.class, emptySet, C0553n3.g);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductSkinV4Dto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ProductSkinMiniDto productSkinMiniDto = null;
        ProductBackgroundDto productBackgroundDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1) {
                productSkinMiniDto = this.productSkinMiniDtoAdapter.fromJson(jsonReader);
                if (productSkinMiniDto == null) {
                    throw Util.unexpectedNull("mini", "mini", jsonReader);
                }
            } else if (selectName == 2 && (productBackgroundDto = this.productBackgroundDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(C0553n3.g, C0553n3.g, jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (productSkinMiniDto == null) {
            throw Util.missingProperty("mini", "mini", jsonReader);
        }
        if (productBackgroundDto != null) {
            return new ProductSkinV4Dto(str, productSkinMiniDto, productBackgroundDto);
        }
        throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductSkinV4Dto productSkinV4Dto) {
        ProductSkinV4Dto productSkinV4Dto2 = productSkinV4Dto;
        if (productSkinV4Dto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) productSkinV4Dto2.getId());
        jsonWriter.name("mini");
        this.productSkinMiniDtoAdapter.toJson(jsonWriter, (JsonWriter) productSkinV4Dto2.getMini());
        jsonWriter.name(C0553n3.g);
        this.productBackgroundDtoAdapter.toJson(jsonWriter, (JsonWriter) productSkinV4Dto2.getBackground());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ProductSkinV4Dto)");
    }
}
