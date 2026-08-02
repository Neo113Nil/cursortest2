package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardButtonsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CardButtonsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/card/internal/network/dto/CardButtonResponse;", "nullableCardButtonResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardButtonsResponseJsonAdapter extends JsonAdapter<CardButtonsResponse> {
    private final JsonAdapter<CardButtonResponse> nullableCardButtonResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("delete", "reissue");

    public CardButtonsResponseJsonAdapter(Moshi moshi) {
        this.nullableCardButtonResponseAdapter = moshi.adapter(CardButtonResponse.class, EmptySet.a, "deleteButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CardButtonsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CardButtonResponse cardButtonResponse = null;
        CardButtonResponse cardButtonResponse2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                cardButtonResponse = this.nullableCardButtonResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                cardButtonResponse2 = this.nullableCardButtonResponseAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new CardButtonsResponse(cardButtonResponse, cardButtonResponse2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardButtonsResponse cardButtonsResponse) {
        CardButtonsResponse cardButtonsResponse2 = cardButtonsResponse;
        if (cardButtonsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("delete");
        this.nullableCardButtonResponseAdapter.toJson(jsonWriter, (JsonWriter) cardButtonsResponse2.getDeleteButton());
        jsonWriter.name("reissue");
        this.nullableCardButtonResponseAdapter.toJson(jsonWriter, (JsonWriter) cardButtonsResponse2.getReissueButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(CardButtonsResponse)");
    }
}
