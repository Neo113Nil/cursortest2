package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/core/stories/dto/StoryItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/StoryItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/ybsdk/core/stories/dto/StoryItemMode;", "nullableStoryItemModeAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/core/stories/dto/FullScreenDto;", "nullableFullScreenDtoAdapter", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryItemJsonAdapter extends JsonAdapter<StoryItem> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<FullScreenDto> nullableFullScreenDtoAdapter;
    private final JsonAdapter<StoryItemMode> nullableStoryItemModeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "duration_ms", "mode", "divkit_data", "full_screen");
    private final JsonAdapter<String> stringAdapter;

    public StoryItemJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "maxProgressValueMs");
        this.nullableStoryItemModeAdapter = moshi.adapter(StoryItemMode.class, emptySet, "storyItemMode");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitData");
        this.nullableFullScreenDtoAdapter = moshi.adapter(FullScreenDto.class, emptySet, "fullScreen");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StoryItem fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        StoryItemMode storyItemMode = null;
        DivDataDto divDataDto = null;
        FullScreenDto fullScreenDto = null;
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
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("maxProgressValueMs", "duration_ms", jsonReader);
                }
            } else if (selectName == 2) {
                storyItemMode = this.nullableStoryItemModeAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                fullScreenDto = this.nullableFullScreenDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (num != null) {
            return new StoryItem(str, num.intValue(), storyItemMode, divDataDto, fullScreenDto);
        }
        throw Util.missingProperty("maxProgressValueMs", "duration_ms", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StoryItem storyItem) {
        StoryItem storyItem2 = storyItem;
        if (storyItem2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) storyItem2.getId());
        jsonWriter.name("duration_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(storyItem2.getMaxProgressValueMs()));
        jsonWriter.name("mode");
        this.nullableStoryItemModeAdapter.toJson(jsonWriter, (JsonWriter) storyItem2.getStoryItemMode());
        jsonWriter.name("divkit_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) storyItem2.getDivkitData());
        jsonWriter.name("full_screen");
        this.nullableFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) storyItem2.getFullScreen());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(StoryItem)");
    }
}
