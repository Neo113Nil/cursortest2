package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/stories/dto/StoriesResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/StoriesResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/core/stories/dto/StoryItem;", "nullableListOfStoryItemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;", "nullableCommunicationFullScreenButtonAdapter", "Lcom/ybsdk/core/stories/dto/LegalAgreement;", "nullableLegalAgreementAdapter", "", "nullableStringAdapter", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoriesResponseJsonAdapter extends JsonAdapter<StoriesResponse> {
    private final JsonAdapter<CommunicationFullScreenButton> nullableCommunicationFullScreenButtonAdapter;
    private final JsonAdapter<LegalAgreement> nullableLegalAgreementAdapter;
    private final JsonAdapter<List<StoryItem>> nullableListOfStoryItemAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("stories", "primary_button", "legal_agreement", "action_after_last_story", "overridden_close_action");

    public StoriesResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, StoryItem.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableListOfStoryItemAdapter = moshi.adapter(newParameterizedType, emptySet, "storyItemsList");
        this.nullableCommunicationFullScreenButtonAdapter = moshi.adapter(CommunicationFullScreenButton.class, emptySet, "primaryButton");
        this.nullableLegalAgreementAdapter = moshi.adapter(LegalAgreement.class, emptySet, "legalAgreement");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "actionAfterLast");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StoriesResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<StoryItem> list = null;
        CommunicationFullScreenButton communicationFullScreenButton = null;
        LegalAgreement legalAgreement = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.nullableListOfStoryItemAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                communicationFullScreenButton = this.nullableCommunicationFullScreenButtonAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                legalAgreement = this.nullableLegalAgreementAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new StoriesResponse(list, communicationFullScreenButton, legalAgreement, str, str2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StoriesResponse storiesResponse) {
        StoriesResponse storiesResponse2 = storiesResponse;
        if (storiesResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("stories");
        this.nullableListOfStoryItemAdapter.toJson(jsonWriter, (JsonWriter) storiesResponse2.getStoryItemsList());
        jsonWriter.name("primary_button");
        this.nullableCommunicationFullScreenButtonAdapter.toJson(jsonWriter, (JsonWriter) storiesResponse2.getPrimaryButton());
        jsonWriter.name("legal_agreement");
        this.nullableLegalAgreementAdapter.toJson(jsonWriter, (JsonWriter) storiesResponse2.getLegalAgreement());
        jsonWriter.name("action_after_last_story");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) storiesResponse2.getActionAfterLast());
        jsonWriter.name("overridden_close_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) storiesResponse2.getOverriddenCloseAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(StoriesResponse)");
    }
}
