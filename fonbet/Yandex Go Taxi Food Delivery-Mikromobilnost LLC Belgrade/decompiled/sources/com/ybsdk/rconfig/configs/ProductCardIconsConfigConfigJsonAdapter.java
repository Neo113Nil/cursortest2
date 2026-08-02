package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/ProductCardIconsConfigConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/ProductCardIconsConfigConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/ProductImages;", "nullableProductImagesAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ProductCardIconsConfigConfigJsonAdapter extends JsonAdapter<ProductCardIconsConfigConfig> {
    private volatile Constructor<ProductCardIconsConfigConfig> constructorRef;
    private final JsonAdapter<ProductImages> nullableProductImagesAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("card_icons");

    public ProductCardIconsConfigConfigJsonAdapter(Moshi moshi) {
        this.nullableProductImagesAdapter = moshi.adapter(ProductImages.class, EmptySet.a, "cardIcons");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductCardIconsConfigConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ProductImages productImages = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                productImages = this.nullableProductImagesAdapter.fromJson(jsonReader);
                i = -2;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            return new ProductCardIconsConfigConfig(productImages);
        }
        Constructor<ProductCardIconsConfigConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProductCardIconsConfigConfig.class.getDeclaredConstructor(ProductImages.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(productImages, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductCardIconsConfigConfig productCardIconsConfigConfig) {
        ProductCardIconsConfigConfig productCardIconsConfigConfig2 = productCardIconsConfigConfig;
        if (productCardIconsConfigConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("card_icons");
        this.nullableProductImagesAdapter.toJson(jsonWriter, (JsonWriter) productCardIconsConfigConfig2.getCardIcons());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(ProductCardIconsConfigConfig)");
    }
}
