package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingStaticInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingStaticInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPanResponse;", "cardClaimingPanResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingCvvResponse;", "cardClaimingCvvResponseAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingTheme;", "nullableThemesOfCardClaimingThemeAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardClaimingStaticInfoResponseJsonAdapter extends JsonAdapter<CardClaimingStaticInfoResponse> {
    private final JsonAdapter<CardClaimingCvvResponse> cardClaimingCvvResponseAdapter;
    private final JsonAdapter<CardClaimingPanResponse> cardClaimingPanResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<CardClaimingTheme>> nullableThemesOfCardClaimingThemeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("pan", "cvv", "promo_hint_pan", "promo_hint_cvv", "themes");

    public CardClaimingStaticInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.cardClaimingPanResponseAdapter = moshi.adapter(CardClaimingPanResponse.class, emptySet, "pan");
        this.cardClaimingCvvResponseAdapter = moshi.adapter(CardClaimingCvvResponse.class, emptySet, "cvv");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "hintPan");
        this.nullableThemesOfCardClaimingThemeAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, CardClaimingTheme.class), emptySet, "themes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CardClaimingStaticInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CardClaimingPanResponse cardClaimingPanResponse = null;
        CardClaimingCvvResponse cardClaimingCvvResponse = null;
        String str = null;
        String str2 = null;
        Themes<CardClaimingTheme> themes = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                cardClaimingPanResponse = this.cardClaimingPanResponseAdapter.fromJson(jsonReader);
                if (cardClaimingPanResponse == null) {
                    throw Util.unexpectedNull("pan", "pan", jsonReader);
                }
            } else if (selectName == 1) {
                cardClaimingCvvResponse = this.cardClaimingCvvResponseAdapter.fromJson(jsonReader);
                if (cardClaimingCvvResponse == null) {
                    throw Util.unexpectedNull("cvv", "cvv", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                themes = this.nullableThemesOfCardClaimingThemeAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (cardClaimingPanResponse == null) {
            throw Util.missingProperty("pan", "pan", jsonReader);
        }
        if (cardClaimingCvvResponse != null) {
            return new CardClaimingStaticInfoResponse(cardClaimingPanResponse, cardClaimingCvvResponse, str, str2, themes);
        }
        throw Util.missingProperty("cvv", "cvv", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardClaimingStaticInfoResponse cardClaimingStaticInfoResponse) {
        CardClaimingStaticInfoResponse cardClaimingStaticInfoResponse2 = cardClaimingStaticInfoResponse;
        if (cardClaimingStaticInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("pan");
        this.cardClaimingPanResponseAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingStaticInfoResponse2.getPan());
        jsonWriter.name("cvv");
        this.cardClaimingCvvResponseAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingStaticInfoResponse2.getCvv());
        jsonWriter.name("promo_hint_pan");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingStaticInfoResponse2.getHintPan());
        jsonWriter.name("promo_hint_cvv");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingStaticInfoResponse2.getHintCvv());
        jsonWriter.name("themes");
        this.nullableThemesOfCardClaimingThemeAdapter.toJson(jsonWriter, (JsonWriter) cardClaimingStaticInfoResponse2.getThemes());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(CardClaimingStaticInfoResponse)");
    }
}
