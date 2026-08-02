package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/core/stories/dto/VideoSettingsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/VideoSettingsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "themedParameterOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoSettingsDtoJsonAdapter extends JsonAdapter<VideoSettingsDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(LaunchBrowserActivity.KEY_URI, "repeat_mode");
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public VideoSettingsDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(ThemedParameter.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themedParameterOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, LaunchBrowserActivity.KEY_URI);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "repeatMode");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final VideoSettingsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedParameter<String> themedParameter = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                if (themedParameter == null) {
                    throw Util.unexpectedNull(LaunchBrowserActivity.KEY_URI, LaunchBrowserActivity.KEY_URI, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (themedParameter != null) {
            return new VideoSettingsDto(themedParameter, str);
        }
        throw Util.missingProperty(LaunchBrowserActivity.KEY_URI, LaunchBrowserActivity.KEY_URI, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, VideoSettingsDto videoSettingsDto) {
        VideoSettingsDto videoSettingsDto2 = videoSettingsDto;
        if (videoSettingsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(LaunchBrowserActivity.KEY_URI);
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) videoSettingsDto2.getUri());
        jsonWriter.name("repeat_mode");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) videoSettingsDto2.getRepeatMode());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(VideoSettingsDto)");
    }
}
