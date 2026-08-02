package com.ybsdk.network.dto.simplifiedid;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdWidget;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidgetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Theme;", "themesOfThemeAdapter", "stringAdapter", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget$Button;", "nullableButtonAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SimplifiedIdWidgetJsonAdapter extends JsonAdapter<SimplifiedIdWidget> {
    private final JsonAdapter<SimplifiedIdWidget.Button> nullableButtonAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("action", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "themes", "title", "button");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<SimplifiedIdWidget.Theme>> themesOfThemeAdapter;

    public SimplifiedIdWidgetJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.themesOfThemeAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, SimplifiedIdWidget.Theme.class), emptySet, "themes");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableButtonAdapter = moshi.adapter(SimplifiedIdWidget.Button.class, emptySet, "button");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SimplifiedIdWidget fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Themes<SimplifiedIdWidget.Theme> themes = null;
        String str3 = null;
        SimplifiedIdWidget.Button button = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                themes = this.themesOfThemeAdapter.fromJson(jsonReader);
                if (themes == null) {
                    throw Util.unexpectedNull("themes", "themes", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 4) {
                button = this.nullableButtonAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (themes == null) {
            throw Util.missingProperty("themes", "themes", jsonReader);
        }
        if (str3 != null) {
            return new SimplifiedIdWidget(str, str2, themes, str3, button);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SimplifiedIdWidget simplifiedIdWidget) {
        SimplifiedIdWidget simplifiedIdWidget2 = simplifiedIdWidget;
        if (simplifiedIdWidget2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdWidget2.getAction());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdWidget2.getDescription());
        jsonWriter.name("themes");
        this.themesOfThemeAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdWidget2.getThemes());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdWidget2.getTitle());
        jsonWriter.name("button");
        this.nullableButtonAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdWidget2.getButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(SimplifiedIdWidget)");
    }
}
