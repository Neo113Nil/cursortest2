package com.ybsdk.feature.card.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.card.api.dto.CardClaimingStatusResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/card/api/dto/CardClaimingStatusResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/api/dto/CardClaimingStatusResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/card/api/dto/CardClaimingStatusResponse$Status;", "statusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardClaimingStatusResponseJsonAdapter extends JsonAdapter<CardClaimingStatusResponse> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "public_card_id");
    private final JsonAdapter<CardClaimingStatusResponse.Status> statusAdapter;

    public CardClaimingStatusResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.statusAdapter = moshi.adapter(CardClaimingStatusResponse.Status.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "cardId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CardClaimingStatusResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CardClaimingStatusResponse.Status status = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                status = this.statusAdapter.fromJson(jsonReader);
                if (status == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (status != null) {
            return new CardClaimingStatusResponse(status, str);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardClaimingStatusResponse cardClaimingStatusResponse) {
        CardClaimingStatusResponse cardClaimingStatusResponse2 = cardClaimingStatusResponse;
        if (cardClaimingStatusResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingStatusResponse2.getStatus());
        jsonWriter.name("public_card_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingStatusResponse2.getCardId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(CardClaimingStatusResponse)");
    }
}
