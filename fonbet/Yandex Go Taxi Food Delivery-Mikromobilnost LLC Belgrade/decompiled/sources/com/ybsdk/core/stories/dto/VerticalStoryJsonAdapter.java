package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/stories/dto/VerticalStoryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/VerticalStory;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/core/stories/dto/StoryItem;", "listOfStoryItemAdapter", "Lcom/ybsdk/core/stories/dto/ProgressStyle;", "nullableProgressStyleAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VerticalStoryJsonAdapter extends JsonAdapter<VerticalStory> {
    private final JsonAdapter<List<StoryItem>> listOfStoryItemAdapter;
    private final JsonAdapter<ProgressStyle> nullableProgressStyleAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "story_items", "progress_bar_style", "close_icon_color");
    private final JsonAdapter<String> stringAdapter;

    public VerticalStoryJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.listOfStoryItemAdapter = moshi.adapter(Types.newParameterizedType(List.class, StoryItem.class), emptySet, "storyItems");
        this.nullableProgressStyleAdapter = moshi.adapter(ProgressStyle.class, emptySet, "progressStyle");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "closeIconColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final VerticalStory fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<StoryItem> list = null;
        ProgressStyle progressStyle = null;
        Themes<String> themes = null;
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
                list = this.listOfStoryItemAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("storyItems", "story_items", jsonReader);
                }
            } else if (selectName == 2) {
                progressStyle = this.nullableProgressStyleAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (list != null) {
            return new VerticalStory(str, list, progressStyle, themes);
        }
        throw Util.missingProperty("storyItems", "story_items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, VerticalStory verticalStory) {
        VerticalStory verticalStory2 = verticalStory;
        if (verticalStory2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) verticalStory2.getId());
        jsonWriter.name("story_items");
        this.listOfStoryItemAdapter.toJson(jsonWriter, (JsonWriter) verticalStory2.getStoryItems());
        jsonWriter.name("progress_bar_style");
        this.nullableProgressStyleAdapter.toJson(jsonWriter, (JsonWriter) verticalStory2.getProgressStyle());
        jsonWriter.name("close_icon_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) verticalStory2.getCloseIconColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(VerticalStory)");
    }
}
