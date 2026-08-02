package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.text.Text;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/AppUpdateUiDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/AppUpdateUiDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/utils/text/Text;", "textAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppUpdateUiDataDtoJsonAdapter extends JsonAdapter<AppUpdateUiDataDto> {
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "button_title");
    private final JsonAdapter<Text> textAdapter;

    public AppUpdateUiDataDtoJsonAdapter(Moshi moshi) {
        this.textAdapter = moshi.adapter(Text.class, EmptySet.a, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AppUpdateUiDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Text text = null;
        Text text2 = null;
        Text text3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                text = this.textAdapter.fromJson(jsonReader);
                if (text == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                text2 = this.textAdapter.fromJson(jsonReader);
                if (text2 == null) {
                    throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                }
            } else if (selectName == 2 && (text3 = this.textAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("buttonTitle", "button_title", jsonReader);
            }
        }
        jsonReader.endObject();
        if (text == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (text2 == null) {
            throw Util.missingProperty("subtitle", "subtitle", jsonReader);
        }
        if (text3 != null) {
            return new AppUpdateUiDataDto(text, text2, text3);
        }
        throw Util.missingProperty("buttonTitle", "button_title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AppUpdateUiDataDto appUpdateUiDataDto) {
        AppUpdateUiDataDto appUpdateUiDataDto2 = appUpdateUiDataDto;
        if (appUpdateUiDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) appUpdateUiDataDto2.getTitle());
        jsonWriter.name("subtitle");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) appUpdateUiDataDto2.getSubtitle());
        jsonWriter.name("button_title");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) appUpdateUiDataDto2.getButtonTitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(AppUpdateUiDataDto)");
    }
}
