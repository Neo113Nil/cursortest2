package com.ybsdk.feature.dashboard.internal.data.dto;

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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CardInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "stringAdapter", "", "booleanAdapter", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardInfoJsonAdapter extends JsonAdapter<CardInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("card_count", "promo_count", "action", "image", ACSPConstants.STATUS, "has_plastic_card");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public CardInfoJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "cardCount");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
        this.stringAdapter = moshi.adapter(String.class, emptySet, ACSPConstants.STATUS);
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "hasPlasticCard");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CardInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        String str = null;
        Themes<String> themes = null;
        String str2 = null;
        while (true) {
            Integer num3 = num;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                Boolean bool2 = bool;
                if (num3 == null) {
                    throw Util.missingProperty("cardCount", "card_count", jsonReader);
                }
                int intValue = num3.intValue();
                if (num2 == null) {
                    throw Util.missingProperty("promoCount", "promo_count", jsonReader);
                }
                int intValue2 = num2.intValue();
                if (themes == null) {
                    throw Util.missingProperty("image", "image", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
                if (bool2 != null) {
                    return new CardInfo(intValue, intValue2, str, themes, str2, bool2.booleanValue());
                }
                throw Util.missingProperty("hasPlasticCard", "has_plastic_card", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("cardCount", "card_count", jsonReader);
                    }
                    continue;
                case 1:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("promoCount", "promo_count", jsonReader);
                    }
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    break;
                case 4:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    break;
                case 5:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("hasPlasticCard", "has_plastic_card", jsonReader);
                    }
                    break;
            }
            num = num3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CardInfo cardInfo) {
        CardInfo cardInfo2 = cardInfo;
        if (cardInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("card_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(cardInfo2.getCardCount()));
        jsonWriter.name("promo_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(cardInfo2.getPromoCount()));
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) cardInfo2.getAction());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) cardInfo2.getImage());
        jsonWriter.name(ACSPConstants.STATUS);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cardInfo2.getStatus());
        jsonWriter.name("has_plastic_card");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(cardInfo2.getHasPlasticCard()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(30, "GeneratedJsonAdapter(CardInfo)");
    }
}
