package com.ybsdk.feature.card.internal.network.dto;

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
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoPointResponse;", "listOfYbCardPromoPointResponseAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;", "ybCardPromoButtonResponseAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "nullableCardSkinResponseAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YbCardPromoResponseJsonAdapter extends JsonAdapter<YbCardPromoResponse> {
    private final JsonAdapter<List<YbCardPromoPointResponse>> listOfYbCardPromoPointResponseAdapter;
    private final JsonAdapter<CardSkinResponse> nullableCardSkinResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "promo_id", "title", "image_url", "caption", CRLDistributionPointsExtension.POINTS, "acquire_card_button", "claim_card_button", "application_id", "agreement", "card_skin");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<YbCardPromoButtonResponse> ybCardPromoButtonResponseAdapter;

    public YbCardPromoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.listOfYbCardPromoPointResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, YbCardPromoPointResponse.class), emptySet, CRLDistributionPointsExtension.POINTS);
        this.ybCardPromoButtonResponseAdapter = moshi.adapter(YbCardPromoButtonResponse.class, emptySet, "acquireCardButton");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "applicationId");
        this.nullableCardSkinResponseAdapter = moshi.adapter(CardSkinResponse.class, emptySet, "skin");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbCardPromoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List<YbCardPromoPointResponse> list = null;
        YbCardPromoButtonResponse ybCardPromoButtonResponse = null;
        YbCardPromoButtonResponse ybCardPromoButtonResponse2 = null;
        String str6 = null;
        String str7 = null;
        CardSkinResponse cardSkinResponse = null;
        while (true) {
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            List<YbCardPromoPointResponse> list2 = list;
            YbCardPromoButtonResponse ybCardPromoButtonResponse3 = ybCardPromoButtonResponse;
            YbCardPromoButtonResponse ybCardPromoButtonResponse4 = ybCardPromoButtonResponse2;
            String str13 = str6;
            if (!jsonReader.hasNext()) {
                String str14 = str7;
                jsonReader.endObject();
                if (str8 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("groupId", "promo_id", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("imageUrl", "image_url", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("caption", "caption", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty(CRLDistributionPointsExtension.POINTS, CRLDistributionPointsExtension.POINTS, jsonReader);
                }
                if (ybCardPromoButtonResponse3 == null) {
                    throw Util.missingProperty("acquireCardButton", "acquire_card_button", jsonReader);
                }
                if (ybCardPromoButtonResponse4 != null) {
                    return new YbCardPromoResponse(str8, str9, str10, str11, str12, list2, ybCardPromoButtonResponse3, ybCardPromoButtonResponse4, str13, str14, cardSkinResponse);
                }
                throw Util.missingProperty("claimCardButton", "claim_card_button", jsonReader);
            }
            String str15 = str7;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    str7 = str15;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("groupId", "promo_id", jsonReader);
                    }
                    str7 = str15;
                    str = str8;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("imageUrl", "image_url", jsonReader);
                    }
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("caption", "caption", jsonReader);
                    }
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                case 5:
                    list = this.listOfYbCardPromoPointResponseAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull(CRLDistributionPointsExtension.POINTS, CRLDistributionPointsExtension.POINTS, jsonReader);
                    }
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                case 6:
                    ybCardPromoButtonResponse = this.ybCardPromoButtonResponseAdapter.fromJson(jsonReader);
                    if (ybCardPromoButtonResponse == null) {
                        throw Util.unexpectedNull("acquireCardButton", "acquire_card_button", jsonReader);
                    }
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                case 7:
                    ybCardPromoButtonResponse2 = this.ybCardPromoButtonResponseAdapter.fromJson(jsonReader);
                    if (ybCardPromoButtonResponse2 == null) {
                        throw Util.unexpectedNull("claimCardButton", "claim_card_button", jsonReader);
                    }
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    str6 = str13;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                case 9:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                case 10:
                    cardSkinResponse = this.nullableCardSkinResponseAdapter.fromJson(jsonReader);
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
                default:
                    str7 = str15;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                    ybCardPromoButtonResponse2 = ybCardPromoButtonResponse4;
                    str6 = str13;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbCardPromoResponse ybCardPromoResponse) {
        YbCardPromoResponse ybCardPromoResponse2 = ybCardPromoResponse;
        if (ybCardPromoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getId());
        jsonWriter.name("promo_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getGroupId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getTitle());
        jsonWriter.name("image_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getImageUrl());
        jsonWriter.name("caption");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getCaption());
        jsonWriter.name(CRLDistributionPointsExtension.POINTS);
        this.listOfYbCardPromoPointResponseAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getPoints());
        jsonWriter.name("acquire_card_button");
        this.ybCardPromoButtonResponseAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getAcquireCardButton());
        jsonWriter.name("claim_card_button");
        this.ybCardPromoButtonResponseAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getClaimCardButton());
        jsonWriter.name("application_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getApplicationId());
        jsonWriter.name("agreement");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getAgreement());
        jsonWriter.name("card_skin");
        this.nullableCardSkinResponseAdapter.toJson(jsonWriter, (JsonWriter) ybCardPromoResponse2.getSkin());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(YbCardPromoResponse)");
    }
}
