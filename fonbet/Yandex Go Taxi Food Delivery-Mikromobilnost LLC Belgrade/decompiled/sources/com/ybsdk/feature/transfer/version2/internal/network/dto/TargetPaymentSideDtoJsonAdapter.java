package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TargetPaymentSideDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TargetPaymentSideDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateV3Dto;", "nullableCurrencyRateV3DtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverDto;", "nullableCrossBorderReceiverDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TargetPaymentSideDtoJsonAdapter extends JsonAdapter<TargetPaymentSideDto> {
    private volatile Constructor<TargetPaymentSideDto> constructorRef;
    private final JsonAdapter<CrossBorderReceiverDto> nullableCrossBorderReceiverDtoAdapter;
    private final JsonAdapter<CurrencyRateV3Dto> nullableCurrencyRateV3DtoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "transfer_type", "credit_money", "debit_money", "currency_rate", "receiver", "public_agreement_id", "priority_money_type", "input_source", "check_user_bank_id");
    private final JsonAdapter<String> stringAdapter;

    public TargetPaymentSideDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "transferType");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "creditMoney");
        this.nullableCurrencyRateV3DtoAdapter = moshi.adapter(CurrencyRateV3Dto.class, emptySet, "currencyRate");
        this.nullableCrossBorderReceiverDtoAdapter = moshi.adapter(CrossBorderReceiverDto.class, emptySet, "receiver");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TargetPaymentSideDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        Money money = null;
        Money money2 = null;
        CurrencyRateV3Dto currencyRateV3Dto = null;
        CrossBorderReceiverDto crossBorderReceiverDto = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    money2 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    currencyRateV3Dto = this.nullableCurrencyRateV3DtoAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    crossBorderReceiverDto = this.nullableCrossBorderReceiverDtoAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -513;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -1023) {
            String str7 = str5;
            String str8 = str4;
            String str9 = str3;
            CrossBorderReceiverDto crossBorderReceiverDto2 = crossBorderReceiverDto;
            CurrencyRateV3Dto currencyRateV3Dto2 = currencyRateV3Dto;
            Money money3 = money2;
            Money money4 = money;
            String str10 = str2;
            String str11 = str;
            if (str11 != null) {
                return new TargetPaymentSideDto(str11, str10, money4, money3, currencyRateV3Dto2, crossBorderReceiverDto2, str9, str8, str7, str6);
            }
            throw Util.missingProperty("type", "type", jsonReader);
        }
        String str12 = str5;
        String str13 = str4;
        String str14 = str3;
        CrossBorderReceiverDto crossBorderReceiverDto3 = crossBorderReceiverDto;
        CurrencyRateV3Dto currencyRateV3Dto3 = currencyRateV3Dto;
        Money money5 = money2;
        Money money6 = money;
        String str15 = str2;
        String str16 = str;
        Constructor<TargetPaymentSideDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TargetPaymentSideDto.class.getDeclaredConstructor(String.class, String.class, Money.class, Money.class, CurrencyRateV3Dto.class, CrossBorderReceiverDto.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str16 == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        return constructor.newInstance(str16, str15, money6, money5, currencyRateV3Dto3, crossBorderReceiverDto3, str14, str13, str12, str6, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TargetPaymentSideDto targetPaymentSideDto) {
        TargetPaymentSideDto targetPaymentSideDto2 = targetPaymentSideDto;
        if (targetPaymentSideDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getType());
        jsonWriter.name("transfer_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getTransferType());
        jsonWriter.name("credit_money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getCreditMoney());
        jsonWriter.name("debit_money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getDebitMoney());
        jsonWriter.name("currency_rate");
        this.nullableCurrencyRateV3DtoAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getCurrencyRate());
        jsonWriter.name("receiver");
        this.nullableCrossBorderReceiverDtoAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getReceiver());
        jsonWriter.name("public_agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getPublicAgreementId());
        jsonWriter.name("priority_money_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getPriorityMoneyType());
        jsonWriter.name("input_source");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getInputSource());
        jsonWriter.name("check_user_bank_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) targetPaymentSideDto2.getCheckUserBankId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(TargetPaymentSideDto)");
    }
}
