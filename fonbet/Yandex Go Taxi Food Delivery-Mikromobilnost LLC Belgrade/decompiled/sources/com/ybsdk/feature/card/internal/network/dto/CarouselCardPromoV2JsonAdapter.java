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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardPromoV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardPromoV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;", "ybCardTypeResponseAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "cardSkinResponseAdapter", "", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoPointV2Response;", "listOfYbCardPromoPointV2ResponseAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;", "ybCardPromoButtonResponseAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarouselCardPromoV2JsonAdapter extends JsonAdapter<CarouselCardPromoV2> {
    private final JsonAdapter<CardSkinResponse> cardSkinResponseAdapter;
    private final JsonAdapter<List<YbCardPromoPointV2Response>> listOfYbCardPromoPointV2ResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "group_id", "agreement_id", "card_type", "application_id", "title", "subtitle", "agreement", "card_skin", "caption", CRLDistributionPointsExtension.POINTS, "acquire_card_button", "claim_card_button");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<YbCardPromoButtonResponse> ybCardPromoButtonResponseAdapter;
    private final JsonAdapter<YbCardTypeResponse> ybCardTypeResponseAdapter;

    public CarouselCardPromoV2JsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.ybCardTypeResponseAdapter = moshi.adapter(YbCardTypeResponse.class, emptySet, "cardType");
        this.cardSkinResponseAdapter = moshi.adapter(CardSkinResponse.class, emptySet, "skin");
        this.listOfYbCardPromoPointV2ResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, YbCardPromoPointV2Response.class), emptySet, CRLDistributionPointsExtension.POINTS);
        this.ybCardPromoButtonResponseAdapter = moshi.adapter(YbCardPromoButtonResponse.class, emptySet, "acquireCardButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CarouselCardPromoV2 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        YbCardTypeResponse ybCardTypeResponse = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        CardSkinResponse cardSkinResponse = null;
        String str8 = null;
        List<YbCardPromoPointV2Response> list = null;
        YbCardPromoButtonResponse ybCardPromoButtonResponse = null;
        YbCardPromoButtonResponse ybCardPromoButtonResponse2 = null;
        while (true) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            YbCardTypeResponse ybCardTypeResponse2 = ybCardTypeResponse;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            CardSkinResponse cardSkinResponse2 = cardSkinResponse;
            String str16 = str8;
            List<YbCardPromoPointV2Response> list2 = list;
            YbCardPromoButtonResponse ybCardPromoButtonResponse3 = ybCardPromoButtonResponse;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str9 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("groupId", "group_id", jsonReader);
                }
                if (ybCardTypeResponse2 == null) {
                    throw Util.missingProperty("cardType", "card_type", jsonReader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (cardSkinResponse2 == null) {
                    throw Util.missingProperty("skin", "card_skin", jsonReader);
                }
                if (str16 == null) {
                    throw Util.missingProperty("caption", "caption", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty(CRLDistributionPointsExtension.POINTS, CRLDistributionPointsExtension.POINTS, jsonReader);
                }
                if (ybCardPromoButtonResponse3 == null) {
                    throw Util.missingProperty("acquireCardButton", "acquire_card_button", jsonReader);
                }
                if (ybCardPromoButtonResponse2 != null) {
                    return new CarouselCardPromoV2(str9, str10, str11, ybCardTypeResponse2, str12, str13, str14, str15, cardSkinResponse2, str16, list2, ybCardPromoButtonResponse3, ybCardPromoButtonResponse2);
                }
                throw Util.missingProperty("claimCardButton", "claim_card_button", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("groupId", "group_id", jsonReader);
                    }
                    str = str9;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str9;
                    str2 = str10;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 3:
                    ybCardTypeResponse = this.ybCardTypeResponseAdapter.fromJson(jsonReader);
                    if (ybCardTypeResponse == null) {
                        throw Util.unexpectedNull("cardType", "card_type", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 5:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 7:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 8:
                    cardSkinResponse = this.cardSkinResponseAdapter.fromJson(jsonReader);
                    if (cardSkinResponse == null) {
                        throw Util.unexpectedNull("skin", "card_skin", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 9:
                    str8 = this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("caption", "caption", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 10:
                    list = this.listOfYbCardPromoPointV2ResponseAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull(CRLDistributionPointsExtension.POINTS, CRLDistributionPointsExtension.POINTS, jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                case 11:
                    ybCardPromoButtonResponse = this.ybCardPromoButtonResponseAdapter.fromJson(jsonReader);
                    if (ybCardPromoButtonResponse == null) {
                        throw Util.unexpectedNull("acquireCardButton", "acquire_card_button", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                case 12:
                    ybCardPromoButtonResponse2 = this.ybCardPromoButtonResponseAdapter.fromJson(jsonReader);
                    if (ybCardPromoButtonResponse2 == null) {
                        throw Util.unexpectedNull("claimCardButton", "claim_card_button", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
                default:
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    cardSkinResponse = cardSkinResponse2;
                    str8 = str16;
                    list = list2;
                    ybCardPromoButtonResponse = ybCardPromoButtonResponse3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CarouselCardPromoV2 carouselCardPromoV2) {
        CarouselCardPromoV2 carouselCardPromoV22 = carouselCardPromoV2;
        if (carouselCardPromoV22 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getId());
        jsonWriter.name("group_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getGroupId());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getAgreementId());
        jsonWriter.name("card_type");
        this.ybCardTypeResponseAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getCardType());
        jsonWriter.name("application_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getApplicationId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getSubtitle());
        jsonWriter.name("agreement");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getAgreement());
        jsonWriter.name("card_skin");
        this.cardSkinResponseAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getSkin());
        jsonWriter.name("caption");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getCaption());
        jsonWriter.name(CRLDistributionPointsExtension.POINTS);
        this.listOfYbCardPromoPointV2ResponseAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getPoints());
        jsonWriter.name("acquire_card_button");
        this.ybCardPromoButtonResponseAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getAcquireCardButton());
        jsonWriter.name("claim_card_button");
        this.ybCardPromoButtonResponseAdapter.toJson(jsonWriter, (JsonWriter) carouselCardPromoV22.getClaimCardButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(CarouselCardPromoV2)");
    }
}
