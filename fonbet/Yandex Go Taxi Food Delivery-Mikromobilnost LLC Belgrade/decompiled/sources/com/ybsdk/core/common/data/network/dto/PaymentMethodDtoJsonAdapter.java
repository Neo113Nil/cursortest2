package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.of91;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/PaymentMethodDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "nullablePaymentMethodTypeDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/CardInfoDto;", "nullableCardInfoDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Me2MeInfo;", "nullableMe2MeInfoAdapter", "Lcom/ybsdk/core/common/data/network/dto/SavingsAccountInfo;", "nullableSavingsAccountInfoAdapter", "Lcom/ybsdk/core/common/data/network/dto/YandexAccountInfo;", "nullableYandexAccountInfoAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaymentMethodDtoJsonAdapter extends JsonAdapter<PaymentMethodDto> {
    private final JsonAdapter<CardInfoDto> nullableCardInfoDtoAdapter;
    private final JsonAdapter<Me2MeInfo> nullableMe2MeInfoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<PaymentMethodTypeDto> nullablePaymentMethodTypeDtoAdapter;
    private final JsonAdapter<SavingsAccountInfo> nullableSavingsAccountInfoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonAdapter<YandexAccountInfo> nullableYandexAccountInfoAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public PaymentMethodDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = of91.d;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ of91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "amount", "selected_method_description", "logo", "second_logo", "themed_logo", "type", new String(bArr2, uza.a), "card_info", "me2me_info", "savings_account_info", "yandex_account_info", "legal_text", "action");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "amount");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "secondLogo");
        this.nullablePaymentMethodTypeDtoAdapter = moshi.adapter(PaymentMethodTypeDto.class, emptySet, "type");
        this.nullableCardInfoDtoAdapter = moshi.adapter(CardInfoDto.class, emptySet, "cardInfo");
        this.nullableMe2MeInfoAdapter = moshi.adapter(Me2MeInfo.class, emptySet, "me2meInfo");
        this.nullableSavingsAccountInfoAdapter = moshi.adapter(SavingsAccountInfo.class, emptySet, "savingsAccountInfo");
        this.nullableYandexAccountInfoAdapter = moshi.adapter(YandexAccountInfo.class, emptySet, "yandexAccountInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentMethodDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Money money = null;
        String str3 = null;
        String str4 = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        PaymentMethodTypeDto paymentMethodTypeDto = null;
        String str5 = null;
        CardInfoDto cardInfoDto = null;
        Me2MeInfo me2MeInfo = null;
        SavingsAccountInfo savingsAccountInfo = null;
        YandexAccountInfo yandexAccountInfo = null;
        String str6 = null;
        String str7 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    paymentMethodTypeDto = this.nullablePaymentMethodTypeDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    cardInfoDto = this.nullableCardInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    me2MeInfo = this.nullableMe2MeInfoAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    savingsAccountInfo = this.nullableSavingsAccountInfoAdapter.fromJson(jsonReader);
                    break;
                case 12:
                    yandexAccountInfo = this.nullableYandexAccountInfoAdapter.fromJson(jsonReader);
                    break;
                case 13:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 14:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new PaymentMethodDto(str, str2, money, str3, str4, themes, themes2, paymentMethodTypeDto, str5, cardInfoDto, me2MeInfo, savingsAccountInfo, yandexAccountInfo, str6, str7);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentMethodDto paymentMethodDto) {
        PaymentMethodDto paymentMethodDto2 = paymentMethodDto;
        if (paymentMethodDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getDescription());
        jsonWriter.name("amount");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getAmount());
        jsonWriter.name("selected_method_description");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getSelectedMethodDescription());
        jsonWriter.name("logo");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getLogo());
        jsonWriter.name("second_logo");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getSecondLogo());
        jsonWriter.name("themed_logo");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getThemedLogo());
        jsonWriter.name("type");
        this.nullablePaymentMethodTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getType());
        byte[] bArr = new byte[15];
        for (int i = 0; i < 15; i++) {
            bArr[i] = (byte) (of91.d[i] ^ of91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getYbSuggestId());
        jsonWriter.name("card_info");
        this.nullableCardInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getCardInfo());
        jsonWriter.name("me2me_info");
        this.nullableMe2MeInfoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getMe2meInfo());
        jsonWriter.name("savings_account_info");
        this.nullableSavingsAccountInfoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getSavingsAccountInfo());
        jsonWriter.name("yandex_account_info");
        this.nullableYandexAccountInfoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getYandexAccountInfo());
        jsonWriter.name("legal_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getLegalText());
        jsonWriter.name("action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodDto2.getAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(PaymentMethodDto)");
    }
}
