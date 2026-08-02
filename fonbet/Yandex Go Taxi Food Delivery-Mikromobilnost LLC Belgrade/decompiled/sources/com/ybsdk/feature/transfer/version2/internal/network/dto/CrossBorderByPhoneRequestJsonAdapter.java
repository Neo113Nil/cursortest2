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

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhoneRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhoneRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CurrencyRateDto;", "currencyRateDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverInfoDto;", "crossBorderReceiverInfoDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossBorderByPhoneRequestJsonAdapter extends JsonAdapter<CrossBorderByPhoneRequest> {
    private volatile Constructor<CrossBorderByPhoneRequest> constructorRef;
    private final JsonAdapter<CrossBorderReceiverInfoDto> crossBorderReceiverInfoDtoAdapter;
    private final JsonAdapter<CurrencyRateDto> currencyRateDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "version", "debit_money", "credit_money", "currency_rate", "receiver_info", "priority_money_type", "input_source");
    private final JsonAdapter<String> stringAdapter;

    public CrossBorderByPhoneRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "version");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "debitMoney");
        this.currencyRateDtoAdapter = moshi.adapter(CurrencyRateDto.class, emptySet, "currencyRate");
        this.crossBorderReceiverInfoDtoAdapter = moshi.adapter(CrossBorderReceiverInfoDto.class, emptySet, "receiverInfo");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "inputSource");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CrossBorderByPhoneRequest fromJson(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        int i = -1;
        String str2 = null;
        Integer num = null;
        Money money = null;
        Money money2 = null;
        CurrencyRateDto currencyRateDto = null;
        CrossBorderReceiverInfoDto crossBorderReceiverInfoDto = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            String str5 = str2;
            Integer num2 = num;
            Money money3 = money;
            Money money4 = money2;
            CurrencyRateDto currencyRateDto2 = currencyRateDto;
            CrossBorderReceiverInfoDto crossBorderReceiverInfoDto2 = crossBorderReceiverInfoDto;
            String str6 = str3;
            String str7 = str4;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i == -129) {
                    if (str5 == null) {
                        throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                    }
                    if (num2 == null) {
                        throw Util.missingProperty("version", "version", jsonReader);
                    }
                    int intValue = num2.intValue();
                    if (money3 == null) {
                        throw Util.missingProperty("debitMoney", "debit_money", jsonReader);
                    }
                    if (money4 == null) {
                        throw Util.missingProperty("creditMoney", "credit_money", jsonReader);
                    }
                    if (currencyRateDto2 == null) {
                        throw Util.missingProperty("currencyRate", "currency_rate", jsonReader);
                    }
                    if (crossBorderReceiverInfoDto2 == null) {
                        throw Util.missingProperty("receiverInfo", "receiver_info", jsonReader);
                    }
                    if (str6 != null) {
                        return new CrossBorderByPhoneRequest(str5, intValue, money3, money4, currencyRateDto2, crossBorderReceiverInfoDto2, str6, str7);
                    }
                    throw Util.missingProperty("priorityMoneyType", "priority_money_type", jsonReader);
                }
                int i2 = i;
                Constructor<CrossBorderByPhoneRequest> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Integer.TYPE;
                    str = "agreement_id";
                    constructor = CrossBorderByPhoneRequest.class.getDeclaredConstructor(String.class, cls2, Money.class, Money.class, CurrencyRateDto.class, CrossBorderReceiverInfoDto.class, String.class, String.class, cls2, cls);
                    this.constructorRef = constructor;
                } else {
                    str = "agreement_id";
                }
                if (str5 == null) {
                    throw Util.missingProperty("agreementId", str, jsonReader);
                }
                if (num2 == null) {
                    throw Util.missingProperty("version", "version", jsonReader);
                }
                if (money3 == null) {
                    throw Util.missingProperty("debitMoney", "debit_money", jsonReader);
                }
                if (money4 == null) {
                    throw Util.missingProperty("creditMoney", "credit_money", jsonReader);
                }
                if (currencyRateDto2 == null) {
                    throw Util.missingProperty("currencyRate", "currency_rate", jsonReader);
                }
                if (crossBorderReceiverInfoDto2 == null) {
                    throw Util.missingProperty("receiverInfo", "receiver_info", jsonReader);
                }
                if (str6 != null) {
                    return constructor.newInstance(str5, num2, money3, money4, currencyRateDto2, crossBorderReceiverInfoDto2, str6, str7, Integer.valueOf(i2), null);
                }
                throw Util.missingProperty("priorityMoneyType", "priority_money_type", jsonReader);
            }
            int i3 = i;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    i = i3;
                    str2 = str5;
                    num = num2;
                    money = money3;
                    money2 = money4;
                    currencyRateDto = currencyRateDto2;
                    crossBorderReceiverInfoDto = crossBorderReceiverInfoDto2;
                    str3 = str6;
                    str4 = str7;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    i = i3;
                    num = num2;
                    money = money3;
                    money2 = money4;
                    currencyRateDto = currencyRateDto2;
                    crossBorderReceiverInfoDto = crossBorderReceiverInfoDto2;
                    str3 = str6;
                    str4 = str7;
                case 1:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("version", "version", jsonReader);
                    }
                    i = i3;
                    str2 = str5;
                    money = money3;
                    money2 = money4;
                    currencyRateDto = currencyRateDto2;
                    crossBorderReceiverInfoDto = crossBorderReceiverInfoDto2;
                    str3 = str6;
                    str4 = str7;
                case 2:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("debitMoney", "debit_money", jsonReader);
                    }
                    i = i3;
                    str2 = str5;
                    num = num2;
                    money2 = money4;
                    currencyRateDto = currencyRateDto2;
                    crossBorderReceiverInfoDto = crossBorderReceiverInfoDto2;
                    str3 = str6;
                    str4 = str7;
                case 3:
                    money2 = this.moneyAdapter.fromJson(jsonReader);
                    if (money2 == null) {
                        throw Util.unexpectedNull("creditMoney", "credit_money", jsonReader);
                    }
                    i = i3;
                    str2 = str5;
                    num = num2;
                    money = money3;
                    currencyRateDto = currencyRateDto2;
                    crossBorderReceiverInfoDto = crossBorderReceiverInfoDto2;
                    str3 = str6;
                    str4 = str7;
                case 4:
                    currencyRateDto = this.currencyRateDtoAdapter.fromJson(jsonReader);
                    if (currencyRateDto == null) {
                        throw Util.unexpectedNull("currencyRate", "currency_rate", jsonReader);
                    }
                    i = i3;
                    str2 = str5;
                    num = num2;
                    money = money3;
                    money2 = money4;
                    crossBorderReceiverInfoDto = crossBorderReceiverInfoDto2;
                    str3 = str6;
                    str4 = str7;
                case 5:
                    crossBorderReceiverInfoDto = this.crossBorderReceiverInfoDtoAdapter.fromJson(jsonReader);
                    if (crossBorderReceiverInfoDto == null) {
                        throw Util.unexpectedNull("receiverInfo", "receiver_info", jsonReader);
                    }
                    i = i3;
                    str2 = str5;
                    num = num2;
                    money = money3;
                    money2 = money4;
                    currencyRateDto = currencyRateDto2;
                    str3 = str6;
                    str4 = str7;
                case 6:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("priorityMoneyType", "priority_money_type", jsonReader);
                    }
                    str3 = fromJson;
                    i = i3;
                    str2 = str5;
                    num = num2;
                    money = money3;
                    money2 = money4;
                    currencyRateDto = currencyRateDto2;
                    crossBorderReceiverInfoDto = crossBorderReceiverInfoDto2;
                    str4 = str7;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str5;
                    num = num2;
                    money = money3;
                    money2 = money4;
                    currencyRateDto = currencyRateDto2;
                    crossBorderReceiverInfoDto = crossBorderReceiverInfoDto2;
                    str3 = str6;
                    i = -129;
                default:
                    i = i3;
                    str2 = str5;
                    num = num2;
                    money = money3;
                    money2 = money4;
                    currencyRateDto = currencyRateDto2;
                    crossBorderReceiverInfoDto = crossBorderReceiverInfoDto2;
                    str3 = str6;
                    str4 = str7;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CrossBorderByPhoneRequest crossBorderByPhoneRequest) {
        CrossBorderByPhoneRequest crossBorderByPhoneRequest2 = crossBorderByPhoneRequest;
        if (crossBorderByPhoneRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhoneRequest2.getAgreementId());
        jsonWriter.name("version");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(crossBorderByPhoneRequest2.getVersion()));
        jsonWriter.name("debit_money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhoneRequest2.getDebitMoney());
        jsonWriter.name("credit_money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhoneRequest2.getCreditMoney());
        jsonWriter.name("currency_rate");
        this.currencyRateDtoAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhoneRequest2.getCurrencyRate());
        jsonWriter.name("receiver_info");
        this.crossBorderReceiverInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhoneRequest2.getReceiverInfo());
        jsonWriter.name("priority_money_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhoneRequest2.getPriorityMoneyType());
        jsonWriter.name("input_source");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhoneRequest2.getInputSource());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(CrossBorderByPhoneRequest)");
    }
}
