package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitSplitMatchingDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitSplitMatchingData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "nullableStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitSplitMatchingDataJsonAdapter extends JsonAdapter<CreditLimitSplitMatchingData> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("purchase_timestamp", "purchase_sum", "card_id", "merchant_id", "external_id", "order_id", "split_id");
    private final JsonAdapter<String> stringAdapter;

    public CreditLimitSplitMatchingDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "purchaseTimestamp");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "purchaseSum");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, FinishFlowStatus.ORDER_ID_FIELD_NAME);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitSplitMatchingData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Money money = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            String str7 = str;
            Money money2 = money;
            String str8 = str2;
            if (!jsonReader.hasNext()) {
                String str9 = str3;
                jsonReader.endObject();
                if (str7 == null) {
                    throw Util.missingProperty("purchaseTimestamp", "purchase_timestamp", jsonReader);
                }
                if (money2 == null) {
                    throw Util.missingProperty("purchaseSum", "purchase_sum", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("cardId", "card_id", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("merchantId", "merchant_id", jsonReader);
                }
                if (str4 != null) {
                    return new CreditLimitSplitMatchingData(str7, money2, str8, str9, str4, str5, str6);
                }
                throw Util.missingProperty("externalId", "external_id", jsonReader);
            }
            String str10 = str3;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str3 = str10;
                    str = str7;
                    money = money2;
                    str2 = str8;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("purchaseTimestamp", "purchase_timestamp", jsonReader);
                    }
                    str3 = str10;
                    money = money2;
                    str2 = str8;
                case 1:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("purchaseSum", "purchase_sum", jsonReader);
                    }
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("cardId", "card_id", jsonReader);
                    }
                    str3 = str10;
                    str = str7;
                    money = money2;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("merchantId", "merchant_id", jsonReader);
                    }
                    str = str7;
                    money = money2;
                    str2 = str8;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("externalId", "external_id", jsonReader);
                    }
                    str3 = str10;
                    str = str7;
                    money = money2;
                    str2 = str8;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str10;
                    str = str7;
                    money = money2;
                    str2 = str8;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str10;
                    str = str7;
                    money = money2;
                    str2 = str8;
                default:
                    str3 = str10;
                    str = str7;
                    money = money2;
                    str2 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitSplitMatchingData creditLimitSplitMatchingData) {
        CreditLimitSplitMatchingData creditLimitSplitMatchingData2 = creditLimitSplitMatchingData;
        if (creditLimitSplitMatchingData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("purchase_timestamp");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitSplitMatchingData2.getPurchaseTimestamp());
        jsonWriter.name("purchase_sum");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) creditLimitSplitMatchingData2.getPurchaseSum());
        jsonWriter.name("card_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitSplitMatchingData2.getCardId());
        jsonWriter.name("merchant_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitSplitMatchingData2.getMerchantId());
        jsonWriter.name("external_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitSplitMatchingData2.getExternalId());
        jsonWriter.name("order_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitSplitMatchingData2.getOrderId());
        jsonWriter.name("split_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitSplitMatchingData2.getSplitId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(CreditLimitSplitMatchingData)");
    }
}
