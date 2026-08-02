package com.ybsdk.network.dto.simplifiedid;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdWidget;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget_ThemeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$Background;", "backgroundAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme$ButtonTheme;", "nullableButtonThemeAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SimplifiedIdWidget_ThemeJsonAdapter extends JsonAdapter<SimplifiedIdWidget.Theme> {
    private final JsonAdapter<SimplifiedIdWidget.Theme.Background> backgroundAdapter;
    private final JsonAdapter<SimplifiedIdWidget.Theme.ButtonTheme> nullableButtonThemeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(C0553n3.g, "title_text_color", "description_text_color", "delimiter_color", "button_theme");
    private final JsonAdapter<String> stringAdapter;

    public SimplifiedIdWidget_ThemeJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.backgroundAdapter = moshi.adapter(SimplifiedIdWidget.Theme.Background.class, emptySet, C0553n3.g);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "titleTextColor");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "descriptionTextColor");
        this.nullableButtonThemeAdapter = moshi.adapter(SimplifiedIdWidget.Theme.ButtonTheme.class, emptySet, "buttonTheme");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SimplifiedIdWidget.Theme fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SimplifiedIdWidget.Theme.Background background = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        SimplifiedIdWidget.Theme.ButtonTheme buttonTheme = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                background = this.backgroundAdapter.fromJson(jsonReader);
                if (background == null) {
                    throw Util.unexpectedNull(C0553n3.g, C0553n3.g, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("titleTextColor", "title_text_color", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                buttonTheme = this.nullableButtonThemeAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (background == null) {
            throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
        }
        if (str != null) {
            return new SimplifiedIdWidget.Theme(background, str, str2, str3, buttonTheme);
        }
        throw Util.missingProperty("titleTextColor", "title_text_color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SimplifiedIdWidget.Theme theme) {
        SimplifiedIdWidget.Theme theme2 = theme;
        if (theme2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(C0553n3.g);
        this.backgroundAdapter.toJson(jsonWriter, (JsonWriter) theme2.getBackground());
        jsonWriter.name("title_text_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) theme2.getTitleTextColor());
        jsonWriter.name("description_text_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) theme2.getDescriptionTextColor());
        jsonWriter.name("delimiter_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) theme2.getDelimiterColor());
        jsonWriter.name("button_theme");
        this.nullableButtonThemeAdapter.toJson(jsonWriter, (JsonWriter) theme2.getButtonTheme());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(SimplifiedIdWidget.Theme)");
    }
}
