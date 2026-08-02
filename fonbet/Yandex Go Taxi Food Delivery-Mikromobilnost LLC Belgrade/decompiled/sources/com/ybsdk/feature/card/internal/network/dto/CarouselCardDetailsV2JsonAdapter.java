package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.card.api.entities.YbCardPaymentSystemEntity;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.settings.api.data.SettingDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardDetailsV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardDetailsV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/YbCardTypeResponse;", "ybCardTypeResponseAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/CardProductType;", "cardProductTypeAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/NfcCarouselCardInfo;", "nfcCarouselCardInfoAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "cardSkinResponseAdapter", "Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "ybCardStatusEntityAdapter", "Lcom/ybsdk/feature/card/api/entities/YbCardPaymentSystemEntity;", "ybCardPaymentSystemEntityAdapter", "", "Lcom/ybsdk/feature/card/internal/network/dto/TokenResponse;", "listOfTokenResponseAdapter", "Lcom/ybsdk/feature/settings/api/data/SettingDto;", "listOfSettingDtoAdapter", "Lcom/ybsdk/feature/card/internal/network/dto/CardButtonsResponse;", "cardButtonsResponseAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarouselCardDetailsV2JsonAdapter extends JsonAdapter<CarouselCardDetailsV2> {
    private final JsonAdapter<CardButtonsResponse> cardButtonsResponseAdapter;
    private final JsonAdapter<CardProductType> cardProductTypeAdapter;
    private final JsonAdapter<CardSkinResponse> cardSkinResponseAdapter;
    private final JsonAdapter<List<SettingDto>> listOfSettingDtoAdapter;
    private final JsonAdapter<List<TokenResponse>> listOfTokenResponseAdapter;
    private final JsonAdapter<NfcCarouselCardInfo> nfcCarouselCardInfoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "card_type", "product_type", "nfc_info", "title", "subtitle", "card_skin", "last_pan_digits", "expiration_date", ACSPConstants.STATUS, "payment_system", "tokens", "block_reason", "support_url", "settings", "buttons");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<YbCardPaymentSystemEntity> ybCardPaymentSystemEntityAdapter;
    private final JsonAdapter<YbCardStatusEntity> ybCardStatusEntityAdapter;
    private final JsonAdapter<YbCardTypeResponse> ybCardTypeResponseAdapter;

    public CarouselCardDetailsV2JsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.ybCardTypeResponseAdapter = moshi.adapter(YbCardTypeResponse.class, emptySet, "cardType");
        this.cardProductTypeAdapter = moshi.adapter(CardProductType.class, emptySet, "productType");
        this.nfcCarouselCardInfoAdapter = moshi.adapter(NfcCarouselCardInfo.class, emptySet, "nfcInfo");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.cardSkinResponseAdapter = moshi.adapter(CardSkinResponse.class, emptySet, "skin");
        this.ybCardStatusEntityAdapter = moshi.adapter(YbCardStatusEntity.class, emptySet, ACSPConstants.STATUS);
        this.ybCardPaymentSystemEntityAdapter = moshi.adapter(YbCardPaymentSystemEntity.class, emptySet, "paymentSystem");
        this.listOfTokenResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, TokenResponse.class), emptySet, "tokens");
        this.listOfSettingDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SettingDto.class), emptySet, "settings");
        this.cardButtonsResponseAdapter = moshi.adapter(CardButtonsResponse.class, emptySet, "buttons");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CarouselCardDetailsV2 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        YbCardTypeResponse ybCardTypeResponse = null;
        CardProductType cardProductType = null;
        NfcCarouselCardInfo nfcCarouselCardInfo = null;
        String str2 = null;
        String str3 = null;
        CardSkinResponse cardSkinResponse = null;
        String str4 = null;
        String str5 = null;
        YbCardStatusEntity ybCardStatusEntity = null;
        YbCardPaymentSystemEntity ybCardPaymentSystemEntity = null;
        List<TokenResponse> list = null;
        String str6 = null;
        String str7 = null;
        List<SettingDto> list2 = null;
        CardButtonsResponse cardButtonsResponse = null;
        while (true) {
            String str8 = str;
            YbCardTypeResponse ybCardTypeResponse2 = ybCardTypeResponse;
            CardProductType cardProductType2 = cardProductType;
            NfcCarouselCardInfo nfcCarouselCardInfo2 = nfcCarouselCardInfo;
            String str9 = str2;
            String str10 = str3;
            CardSkinResponse cardSkinResponse2 = cardSkinResponse;
            String str11 = str4;
            String str12 = str5;
            YbCardStatusEntity ybCardStatusEntity2 = ybCardStatusEntity;
            YbCardPaymentSystemEntity ybCardPaymentSystemEntity2 = ybCardPaymentSystemEntity;
            List<TokenResponse> list3 = list;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str8 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (ybCardTypeResponse2 == null) {
                    throw Util.missingProperty("cardType", "card_type", jsonReader);
                }
                if (cardProductType2 == null) {
                    throw Util.missingProperty("productType", "product_type", jsonReader);
                }
                if (nfcCarouselCardInfo2 == null) {
                    throw Util.missingProperty("nfcInfo", "nfc_info", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (cardSkinResponse2 == null) {
                    throw Util.missingProperty("skin", "card_skin", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("lastPanDigits", "last_pan_digits", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("expirationDate", "expiration_date", jsonReader);
                }
                if (ybCardStatusEntity2 == null) {
                    throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
                if (ybCardPaymentSystemEntity2 == null) {
                    throw Util.missingProperty("paymentSystem", "payment_system", jsonReader);
                }
                if (list3 == null) {
                    throw Util.missingProperty("tokens", "tokens", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty("settings", "settings", jsonReader);
                }
                if (cardButtonsResponse != null) {
                    return new CarouselCardDetailsV2(str8, ybCardTypeResponse2, cardProductType2, nfcCarouselCardInfo2, str9, str10, cardSkinResponse2, str11, str12, ybCardStatusEntity2, ybCardPaymentSystemEntity2, list3, str6, str7, list2, cardButtonsResponse);
                }
                throw Util.missingProperty("buttons", "buttons", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 1:
                    ybCardTypeResponse = this.ybCardTypeResponseAdapter.fromJson(jsonReader);
                    if (ybCardTypeResponse == null) {
                        throw Util.unexpectedNull("cardType", "card_type", jsonReader);
                    }
                    str = str8;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 2:
                    cardProductType = this.cardProductTypeAdapter.fromJson(jsonReader);
                    if (cardProductType == null) {
                        throw Util.unexpectedNull("productType", "product_type", jsonReader);
                    }
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 3:
                    nfcCarouselCardInfo = this.nfcCarouselCardInfoAdapter.fromJson(jsonReader);
                    if (nfcCarouselCardInfo == null) {
                        throw Util.unexpectedNull("nfcInfo", "nfc_info", jsonReader);
                    }
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 4:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 6:
                    cardSkinResponse = this.cardSkinResponseAdapter.fromJson(jsonReader);
                    if (cardSkinResponse == null) {
                        throw Util.unexpectedNull("skin", "card_skin", jsonReader);
                    }
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 7:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("lastPanDigits", "last_pan_digits", jsonReader);
                    }
                    str4 = fromJson;
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 8:
                    String fromJson2 = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("expirationDate", "expiration_date", jsonReader);
                    }
                    str5 = fromJson2;
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 9:
                    ybCardStatusEntity = this.ybCardStatusEntityAdapter.fromJson(jsonReader);
                    if (ybCardStatusEntity == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 10:
                    YbCardPaymentSystemEntity fromJson3 = this.ybCardPaymentSystemEntityAdapter.fromJson(jsonReader);
                    if (fromJson3 == null) {
                        throw Util.unexpectedNull("paymentSystem", "payment_system", jsonReader);
                    }
                    ybCardPaymentSystemEntity = fromJson3;
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    list = list3;
                case 11:
                    list = this.listOfTokenResponseAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("tokens", "tokens", jsonReader);
                    }
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                case 12:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 13:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 14:
                    list2 = this.listOfSettingDtoAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("settings", "settings", jsonReader);
                    }
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                case 15:
                    cardButtonsResponse = this.cardButtonsResponseAdapter.fromJson(jsonReader);
                    if (cardButtonsResponse == null) {
                        throw Util.unexpectedNull("buttons", "buttons", jsonReader);
                    }
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
                default:
                    str = str8;
                    ybCardTypeResponse = ybCardTypeResponse2;
                    cardProductType = cardProductType2;
                    nfcCarouselCardInfo = nfcCarouselCardInfo2;
                    str2 = str9;
                    str3 = str10;
                    cardSkinResponse = cardSkinResponse2;
                    str4 = str11;
                    str5 = str12;
                    ybCardStatusEntity = ybCardStatusEntity2;
                    ybCardPaymentSystemEntity = ybCardPaymentSystemEntity2;
                    list = list3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CarouselCardDetailsV2 carouselCardDetailsV2) {
        CarouselCardDetailsV2 carouselCardDetailsV22 = carouselCardDetailsV2;
        if (carouselCardDetailsV22 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getId());
        jsonWriter.name("card_type");
        this.ybCardTypeResponseAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getCardType());
        jsonWriter.name("product_type");
        this.cardProductTypeAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getProductType());
        jsonWriter.name("nfc_info");
        this.nfcCarouselCardInfoAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getNfcInfo());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getSubtitle());
        jsonWriter.name("card_skin");
        this.cardSkinResponseAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getSkin());
        jsonWriter.name("last_pan_digits");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getLastPanDigits());
        jsonWriter.name("expiration_date");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getExpirationDate());
        jsonWriter.name(ACSPConstants.STATUS);
        this.ybCardStatusEntityAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getStatus());
        jsonWriter.name("payment_system");
        this.ybCardPaymentSystemEntityAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getPaymentSystem());
        jsonWriter.name("tokens");
        this.listOfTokenResponseAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getTokens());
        jsonWriter.name("block_reason");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getBlockReason());
        jsonWriter.name("support_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getSupportUrl());
        jsonWriter.name("settings");
        this.listOfSettingDtoAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getSettings());
        jsonWriter.name("buttons");
        this.cardButtonsResponseAdapter.toJson(jsonWriter, (JsonWriter) carouselCardDetailsV22.getButtons());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(CarouselCardDetailsV2)");
    }
}
