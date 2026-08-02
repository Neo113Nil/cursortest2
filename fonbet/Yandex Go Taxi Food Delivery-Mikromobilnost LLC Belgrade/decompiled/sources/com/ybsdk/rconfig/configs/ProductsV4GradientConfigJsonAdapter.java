package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/configs/ProductsV4GradientConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/ProductsV4GradientConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/ProductsV4Gradient;", "productsV4GradientAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableProductsV4GradientAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ProductsV4GradientConfigJsonAdapter extends JsonAdapter<ProductsV4GradientConfig> {
    private final JsonAdapter<ProductsV4Gradient> nullableProductsV4GradientAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header_gradient", "footer_gradient");
    private final JsonAdapter<ProductsV4Gradient> productsV4GradientAdapter;

    public ProductsV4GradientConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.productsV4GradientAdapter = moshi.adapter(ProductsV4Gradient.class, emptySet, "headerGradient");
        this.nullableProductsV4GradientAdapter = moshi.adapter(ProductsV4Gradient.class, emptySet, "footerGradient");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductsV4GradientConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ProductsV4Gradient productsV4Gradient = null;
        ProductsV4Gradient productsV4Gradient2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                productsV4Gradient = this.productsV4GradientAdapter.fromJson(jsonReader);
                if (productsV4Gradient == null) {
                    throw Util.unexpectedNull("headerGradient", "header_gradient", jsonReader);
                }
            } else if (selectName == 1) {
                productsV4Gradient2 = this.nullableProductsV4GradientAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (productsV4Gradient != null) {
            return new ProductsV4GradientConfig(productsV4Gradient, productsV4Gradient2);
        }
        throw Util.missingProperty("headerGradient", "header_gradient", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductsV4GradientConfig productsV4GradientConfig) {
        ProductsV4GradientConfig productsV4GradientConfig2 = productsV4GradientConfig;
        if (productsV4GradientConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header_gradient");
        this.productsV4GradientAdapter.toJson(jsonWriter, (JsonWriter) productsV4GradientConfig2.getHeaderGradient());
        jsonWriter.name("footer_gradient");
        this.nullableProductsV4GradientAdapter.toJson(jsonWriter, (JsonWriter) productsV4GradientConfig2.getFooterGradient());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(ProductsV4GradientConfig)");
    }
}
