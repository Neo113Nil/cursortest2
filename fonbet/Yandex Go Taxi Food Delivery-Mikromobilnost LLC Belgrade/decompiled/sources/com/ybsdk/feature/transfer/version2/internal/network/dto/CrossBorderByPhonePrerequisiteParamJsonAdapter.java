package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhonePrerequisiteParamJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhonePrerequisiteParam;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderCurrencyRateParam;", "crossBorderCurrencyRateParamAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossBorderByPhonePrerequisiteParamJsonAdapter extends JsonAdapter<CrossBorderByPhonePrerequisiteParam> {
    private final JsonAdapter<CrossBorderCurrencyRateParam> crossBorderCurrencyRateParamAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("receiver_phone", "receiver_bank_id", "receiver_full_name", "debit_money", "credit_money", "priority_money_type", "currency_rate", "check_user_bank_id");
    private final JsonAdapter<String> stringAdapter;

    public CrossBorderByPhonePrerequisiteParamJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "receiverPhone");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "receiverFullName");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "debitMoney");
        this.crossBorderCurrencyRateParamAdapter = moshi.adapter(CrossBorderCurrencyRateParam.class, emptySet, "currencyRate");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CrossBorderByPhonePrerequisiteParam fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Money money = null;
        Money money2 = null;
        String str4 = null;
        CrossBorderCurrencyRateParam crossBorderCurrencyRateParam = null;
        String str5 = null;
        while (true) {
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            Money money3 = money;
            Money money4 = money2;
            String str9 = str4;
            if (!jsonReader.hasNext()) {
                CrossBorderCurrencyRateParam crossBorderCurrencyRateParam2 = crossBorderCurrencyRateParam;
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("receiverPhone", "receiver_phone", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("receiverBankId", "receiver_bank_id", jsonReader);
                }
                if (money3 == null) {
                    throw Util.missingProperty("debitMoney", "debit_money", jsonReader);
                }
                if (money4 == null) {
                    throw Util.missingProperty("creditMoney", "credit_money", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("priorityMoneyType", "priority_money_type", jsonReader);
                }
                if (crossBorderCurrencyRateParam2 != null) {
                    return new CrossBorderByPhonePrerequisiteParam(str6, str7, str8, money3, money4, str9, crossBorderCurrencyRateParam2, str5);
                }
                throw Util.missingProperty("currencyRate", "currency_rate", jsonReader);
            }
            CrossBorderCurrencyRateParam crossBorderCurrencyRateParam3 = crossBorderCurrencyRateParam;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    crossBorderCurrencyRateParam = crossBorderCurrencyRateParam3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money3;
                    money2 = money4;
                    str4 = str9;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("receiverPhone", "receiver_phone", jsonReader);
                    }
                    crossBorderCurrencyRateParam = crossBorderCurrencyRateParam3;
                    str2 = str7;
                    str3 = str8;
                    money = money3;
                    money2 = money4;
                    str4 = str9;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("receiverBankId", "receiver_bank_id", jsonReader);
                    }
                    crossBorderCurrencyRateParam = crossBorderCurrencyRateParam3;
                    str = str6;
                    str3 = str8;
                    money = money3;
                    money2 = money4;
                    str4 = str9;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    crossBorderCurrencyRateParam = crossBorderCurrencyRateParam3;
                    str = str6;
                    str2 = str7;
                    money = money3;
                    money2 = money4;
                    str4 = str9;
                case 3:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("debitMoney", "debit_money", jsonReader);
                    }
                    crossBorderCurrencyRateParam = crossBorderCurrencyRateParam3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money2 = money4;
                    str4 = str9;
                case 4:
                    money2 = this.moneyAdapter.fromJson(jsonReader);
                    if (money2 == null) {
                        throw Util.unexpectedNull("creditMoney", "credit_money", jsonReader);
                    }
                    crossBorderCurrencyRateParam = crossBorderCurrencyRateParam3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money3;
                    str4 = str9;
                case 5:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("priorityMoneyType", "priority_money_type", jsonReader);
                    }
                    crossBorderCurrencyRateParam = crossBorderCurrencyRateParam3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money3;
                    money2 = money4;
                case 6:
                    crossBorderCurrencyRateParam = this.crossBorderCurrencyRateParamAdapter.fromJson(jsonReader);
                    if (crossBorderCurrencyRateParam == null) {
                        throw Util.unexpectedNull("currencyRate", "currency_rate", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money3;
                    money2 = money4;
                    str4 = str9;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    crossBorderCurrencyRateParam = crossBorderCurrencyRateParam3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money3;
                    money2 = money4;
                    str4 = str9;
                default:
                    crossBorderCurrencyRateParam = crossBorderCurrencyRateParam3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    money = money3;
                    money2 = money4;
                    str4 = str9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam) {
        CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam2 = crossBorderByPhonePrerequisiteParam;
        if (crossBorderByPhonePrerequisiteParam2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("receiver_phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhonePrerequisiteParam2.getReceiverPhone());
        jsonWriter.name("receiver_bank_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhonePrerequisiteParam2.getReceiverBankId());
        jsonWriter.name("receiver_full_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhonePrerequisiteParam2.getReceiverFullName());
        jsonWriter.name("debit_money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhonePrerequisiteParam2.getDebitMoney());
        jsonWriter.name("credit_money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhonePrerequisiteParam2.getCreditMoney());
        jsonWriter.name("priority_money_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhonePrerequisiteParam2.getPriorityMoneyType());
        jsonWriter.name("currency_rate");
        this.crossBorderCurrencyRateParamAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhonePrerequisiteParam2.getCurrencyRate());
        jsonWriter.name("check_user_bank_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderByPhonePrerequisiteParam2.getCheckUserBankId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(57, "GeneratedJsonAdapter(CrossBorderByPhonePrerequisiteParam)");
    }
}
