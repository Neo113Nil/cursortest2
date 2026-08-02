package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPanResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPanResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleNonEmptyResponse;", "nullableCardClaimingInputRuleNonEmptyResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleRangeResponse;", "nullableCardClaimingInputRuleRangeResponseAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPrefixResponse;", "nullableCardClaimingPrefixResponseAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputCheckSumResponse;", "nullableCardClaimingInputCheckSumResponseAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardClaimingPanResponseJsonAdapter extends JsonAdapter<CardClaimingPanResponse> {
    private final JsonAdapter<CardClaimingInputCheckSumResponse> nullableCardClaimingInputCheckSumResponseAdapter;
    private final JsonAdapter<CardClaimingInputRuleNonEmptyResponse> nullableCardClaimingInputRuleNonEmptyResponseAdapter;
    private final JsonAdapter<CardClaimingInputRuleRangeResponse> nullableCardClaimingInputRuleRangeResponseAdapter;
    private final JsonAdapter<CardClaimingPrefixResponse> nullableCardClaimingPrefixResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("non_empty", "length", AppSettingsContract$Setting.COLUMN_PREFIX, "checksum");

    public CardClaimingPanResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableCardClaimingInputRuleNonEmptyResponseAdapter = moshi.adapter(CardClaimingInputRuleNonEmptyResponse.class, emptySet, "ruleNonEmpty");
        this.nullableCardClaimingInputRuleRangeResponseAdapter = moshi.adapter(CardClaimingInputRuleRangeResponse.class, emptySet, "ruleRange");
        this.nullableCardClaimingPrefixResponseAdapter = moshi.adapter(CardClaimingPrefixResponse.class, emptySet, AppSettingsContract$Setting.COLUMN_PREFIX);
        this.nullableCardClaimingInputCheckSumResponseAdapter = moshi.adapter(CardClaimingInputCheckSumResponse.class, emptySet, "checksum");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CardClaimingPanResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CardClaimingInputRuleNonEmptyResponse cardClaimingInputRuleNonEmptyResponse = null;
        CardClaimingInputRuleRangeResponse cardClaimingInputRuleRangeResponse = null;
        CardClaimingPrefixResponse cardClaimingPrefixResponse = null;
        CardClaimingInputCheckSumResponse cardClaimingInputCheckSumResponse = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                cardClaimingInputRuleNonEmptyResponse = this.nullableCardClaimingInputRuleNonEmptyResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                cardClaimingInputRuleRangeResponse = this.nullableCardClaimingInputRuleRangeResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                cardClaimingPrefixResponse = this.nullableCardClaimingPrefixResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                cardClaimingInputCheckSumResponse = this.nullableCardClaimingInputCheckSumResponseAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new CardClaimingPanResponse(cardClaimingInputRuleNonEmptyResponse, cardClaimingInputRuleRangeResponse, cardClaimingPrefixResponse, cardClaimingInputCheckSumResponse);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardClaimingPanResponse cardClaimingPanResponse) {
        CardClaimingPanResponse cardClaimingPanResponse2 = cardClaimingPanResponse;
        if (cardClaimingPanResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("non_empty");
        this.nullableCardClaimingInputRuleNonEmptyResponseAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingPanResponse2.getRuleNonEmpty());
        jsonWriter.name("length");
        this.nullableCardClaimingInputRuleRangeResponseAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingPanResponse2.getRuleRange());
        jsonWriter.name(AppSettingsContract$Setting.COLUMN_PREFIX);
        this.nullableCardClaimingPrefixResponseAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingPanResponse2.getPrefix());
        jsonWriter.name("checksum");
        this.nullableCardClaimingInputCheckSumResponseAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingPanResponse2.getChecksum());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(CardClaimingPanResponse)");
    }
}
