package com.ybsdk.feature.main.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.main.api.dto.ProductTheme;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/main/api/dto/ProductThemeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/api/dto/ProductTheme;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/main/api/dto/ProductTheme$Background;", "backgroundAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "feature-main-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductThemeJsonAdapter extends JsonAdapter<ProductTheme> {
    private final JsonAdapter<ProductTheme.Background> backgroundAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(C0553n3.g, "title_text_color", "subtitle_text_color", "icon", "button_color", "button_text_color", "border_color", "accessory_icon_color");
    private final JsonAdapter<String> stringAdapter;

    public ProductThemeJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.backgroundAdapter = moshi.adapter(ProductTheme.Background.class, emptySet, C0553n3.g);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "titleTextColor");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "buttonColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductTheme fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ProductTheme.Background background = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (jsonReader.hasNext()) {
            ProductTheme.Background background2 = background;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    background = this.backgroundAdapter.fromJson(jsonReader);
                    if (background == null) {
                        throw Util.unexpectedNull(C0553n3.g, C0553n3.g, jsonReader);
                    }
                    continue;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("titleTextColor", "title_text_color", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("subtitleTextColor", "subtitle_text_color", jsonReader);
                    }
                    break;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("icon", "icon", jsonReader);
                    }
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
            background = background2;
        }
        ProductTheme.Background background3 = background;
        jsonReader.endObject();
        if (background3 == null) {
            throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("titleTextColor", "title_text_color", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("subtitleTextColor", "subtitle_text_color", jsonReader);
        }
        if (str3 != null) {
            return new ProductTheme(background3, str, str2, str3, str4, str5, str6, str7);
        }
        throw Util.missingProperty("icon", "icon", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductTheme productTheme) {
        ProductTheme productTheme2 = productTheme;
        if (productTheme2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(C0553n3.g);
        this.backgroundAdapter.toJson(jsonWriter, (JsonWriter) productTheme2.getBackground());
        jsonWriter.name("title_text_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) productTheme2.getTitleTextColor());
        jsonWriter.name("subtitle_text_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) productTheme2.getSubtitleTextColor());
        jsonWriter.name("icon");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) productTheme2.getIcon());
        jsonWriter.name("button_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) productTheme2.getButtonColor());
        jsonWriter.name("button_text_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) productTheme2.getButtonTextColor());
        jsonWriter.name("border_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) productTheme2.getBorderColor());
        jsonWriter.name("accessory_icon_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) productTheme2.getAccessoryIconColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(ProductTheme)");
    }
}
