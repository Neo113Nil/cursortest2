package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/core/stories/dto/VerticalStoriesResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/VerticalStoriesResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/core/stories/dto/VerticalStory;", "listOfVerticalStoryAdapter", "Lcom/squareup/moshi/JsonAdapter;", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VerticalStoriesResponseJsonAdapter extends JsonAdapter<VerticalStoriesResponse> {
    private final JsonAdapter<List<VerticalStory>> listOfVerticalStoryAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("stories");

    public VerticalStoriesResponseJsonAdapter(Moshi moshi) {
        this.listOfVerticalStoryAdapter = moshi.adapter(Types.newParameterizedType(List.class, VerticalStory.class), EmptySet.a, "stories");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final VerticalStoriesResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<VerticalStory> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = this.listOfVerticalStoryAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("stories", "stories", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new VerticalStoriesResponse(list);
        }
        throw Util.missingProperty("stories", "stories", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, VerticalStoriesResponse verticalStoriesResponse) {
        VerticalStoriesResponse verticalStoriesResponse2 = verticalStoriesResponse;
        if (verticalStoriesResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("stories");
        this.listOfVerticalStoryAdapter.toJson(jsonWriter, (JsonWriter) verticalStoriesResponse2.getStories());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(VerticalStoriesResponse)");
    }
}
