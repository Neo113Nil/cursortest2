package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SingleCarDetailsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCarDetailsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "ybCardStatusEntityAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/CardProductType;", "cardProductTypeAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;", "ybCardTypeResponseAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingleCarDetailsResponseJsonAdapter extends JsonAdapter<SingleCarDetailsResponse> {
    private final JsonAdapter<CardProductType> cardProductTypeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("last_pan_digits", "expiration_date", ACSPConstants.STATUS, "product_type", "card_type");
    private final JsonAdapter<YbCardStatusEntity> ybCardStatusEntityAdapter;
    private final JsonAdapter<YbCardTypeResponse> ybCardTypeResponseAdapter;

    public SingleCarDetailsResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "lastPanDigits");
        this.ybCardStatusEntityAdapter = moshi.adapter(YbCardStatusEntity.class, emptySet, ACSPConstants.STATUS);
        this.cardProductTypeAdapter = moshi.adapter(CardProductType.class, emptySet, "productType");
        this.ybCardTypeResponseAdapter = moshi.adapter(YbCardTypeResponse.class, emptySet, "cardType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SingleCarDetailsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        YbCardStatusEntity ybCardStatusEntity = null;
        CardProductType cardProductType = null;
        YbCardTypeResponse ybCardTypeResponse = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                ybCardStatusEntity = this.ybCardStatusEntityAdapter.fromJson(jsonReader);
                if (ybCardStatusEntity == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 3) {
                cardProductType = this.cardProductTypeAdapter.fromJson(jsonReader);
                if (cardProductType == null) {
                    throw Util.unexpectedNull("productType", "product_type", jsonReader);
                }
            } else if (selectName == 4 && (ybCardTypeResponse = this.ybCardTypeResponseAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("cardType", "card_type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (ybCardStatusEntity == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (cardProductType == null) {
            throw Util.missingProperty("productType", "product_type", jsonReader);
        }
        if (ybCardTypeResponse != null) {
            return new SingleCarDetailsResponse(str, str2, ybCardStatusEntity, cardProductType, ybCardTypeResponse);
        }
        throw Util.missingProperty("cardType", "card_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SingleCarDetailsResponse singleCarDetailsResponse) {
        SingleCarDetailsResponse singleCarDetailsResponse2 = singleCarDetailsResponse;
        if (singleCarDetailsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("last_pan_digits");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) singleCarDetailsResponse2.getLastPanDigits());
        jsonWriter.name("expiration_date");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) singleCarDetailsResponse2.getExpirationDate());
        jsonWriter.name(ACSPConstants.STATUS);
        this.ybCardStatusEntityAdapter.toJson(jsonWriter, (JsonWriter) singleCarDetailsResponse2.getStatus());
        jsonWriter.name("product_type");
        this.cardProductTypeAdapter.toJson(jsonWriter, (JsonWriter) singleCarDetailsResponse2.getProductType());
        jsonWriter.name("card_type");
        this.ybCardTypeResponseAdapter.toJson(jsonWriter, (JsonWriter) singleCarDetailsResponse2.getCardType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(SingleCarDetailsResponse)");
    }
}
