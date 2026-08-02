package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/rconfig/configs/ProductsV4GradientJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/ProductsV4Gradient;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "floatAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/RadialGradientLayer;", "radialGradientLayerAdapter", "", "listOfRadialGradientLayerAdapter", "", "nullableLongAdapter", "Lcom/ybsdk/rconfig/model/ThemedImage;", "nullableThemedImageAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ProductsV4GradientJsonAdapter extends JsonAdapter<ProductsV4Gradient> {
    private final JsonAdapter<Float> floatAdapter;
    private final JsonAdapter<List<RadialGradientLayer>> listOfRadialGradientLayerAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<ThemedImage> nullableThemedImageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("blur_radius", "translation_y_fraction", "main_gradient", "overlay_gradients", "animation_duration_ms", "fallback_gradient_image");
    private final JsonAdapter<RadialGradientLayer> radialGradientLayerAdapter;

    public ProductsV4GradientJsonAdapter(Moshi moshi) {
        Class cls = Float.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.floatAdapter = moshi.adapter(cls, emptySet, "blurRadius");
        this.radialGradientLayerAdapter = moshi.adapter(RadialGradientLayer.class, emptySet, "mainGradient");
        this.listOfRadialGradientLayerAdapter = moshi.adapter(Types.newParameterizedType(List.class, RadialGradientLayer.class), emptySet, "overlayGradients");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "animationDurationMs");
        this.nullableThemedImageAdapter = moshi.adapter(ThemedImage.class, emptySet, "fallbackGradientImage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductsV4Gradient fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Float f = null;
        Float f2 = null;
        RadialGradientLayer radialGradientLayer = null;
        List<RadialGradientLayer> list = null;
        Long l = null;
        ThemedImage themedImage = null;
        while (true) {
            Float f3 = f;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (f3 == null) {
                    throw Util.missingProperty("blurRadius", "blur_radius", jsonReader);
                }
                float floatValue = f3.floatValue();
                if (f2 == null) {
                    throw Util.missingProperty("translationYFraction", "translation_y_fraction", jsonReader);
                }
                float floatValue2 = f2.floatValue();
                if (radialGradientLayer == null) {
                    throw Util.missingProperty("mainGradient", "main_gradient", jsonReader);
                }
                if (list != null) {
                    return new ProductsV4Gradient(floatValue, floatValue2, radialGradientLayer, list, l, themedImage);
                }
                throw Util.missingProperty("overlayGradients", "overlay_gradients", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    f = this.floatAdapter.fromJson(jsonReader);
                    if (f == null) {
                        throw Util.unexpectedNull("blurRadius", "blur_radius", jsonReader);
                    }
                    continue;
                case 1:
                    f2 = this.floatAdapter.fromJson(jsonReader);
                    if (f2 == null) {
                        throw Util.unexpectedNull("translationYFraction", "translation_y_fraction", jsonReader);
                    }
                    break;
                case 2:
                    radialGradientLayer = this.radialGradientLayerAdapter.fromJson(jsonReader);
                    if (radialGradientLayer == null) {
                        throw Util.unexpectedNull("mainGradient", "main_gradient", jsonReader);
                    }
                    break;
                case 3:
                    list = this.listOfRadialGradientLayerAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("overlayGradients", "overlay_gradients", jsonReader);
                    }
                    break;
                case 4:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    themedImage = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    break;
            }
            f = f3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductsV4Gradient productsV4Gradient) {
        ProductsV4Gradient productsV4Gradient2 = productsV4Gradient;
        if (productsV4Gradient2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("blur_radius");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(productsV4Gradient2.getBlurRadius()));
        jsonWriter.name("translation_y_fraction");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(productsV4Gradient2.getTranslationYFraction()));
        jsonWriter.name("main_gradient");
        this.radialGradientLayerAdapter.toJson(jsonWriter, (JsonWriter) productsV4Gradient2.getMainGradient());
        jsonWriter.name("overlay_gradients");
        this.listOfRadialGradientLayerAdapter.toJson(jsonWriter, (JsonWriter) productsV4Gradient2.getOverlayGradients());
        jsonWriter.name("animation_duration_ms");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) productsV4Gradient2.getAnimationDurationMs());
        jsonWriter.name("fallback_gradient_image");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) productsV4Gradient2.getFallbackGradientImage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ProductsV4Gradient)");
    }
}
