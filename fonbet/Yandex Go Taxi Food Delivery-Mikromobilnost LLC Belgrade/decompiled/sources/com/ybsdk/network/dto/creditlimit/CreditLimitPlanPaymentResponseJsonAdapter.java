package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "moneyCommonResponseAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentStatus;", "creditLimitPlanPaymentStatusAdapter", "nullableMoneyCommonResponseAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitPlanPaymentResponseJsonAdapter extends JsonAdapter<CreditLimitPlanPaymentResponse> {
    private final JsonAdapter<CreditLimitPlanPaymentStatus> creditLimitPlanPaymentStatusAdapter;
    private final JsonAdapter<MoneyCommonResponse> moneyCommonResponseAdapter;
    private final JsonAdapter<MoneyCommonResponse> nullableMoneyCommonResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("date_time", "amount", ACSPConstants.STATUS, "overpayment_amount");
    private final JsonAdapter<String> stringAdapter;

    public CreditLimitPlanPaymentResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "dateTime");
        this.moneyCommonResponseAdapter = moshi.adapter(MoneyCommonResponse.class, emptySet, "amount");
        this.creditLimitPlanPaymentStatusAdapter = moshi.adapter(CreditLimitPlanPaymentStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableMoneyCommonResponseAdapter = moshi.adapter(MoneyCommonResponse.class, emptySet, "overpaymentAmount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitPlanPaymentResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        MoneyCommonResponse moneyCommonResponse = null;
        CreditLimitPlanPaymentStatus creditLimitPlanPaymentStatus = null;
        MoneyCommonResponse moneyCommonResponse2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("dateTime", "date_time", jsonReader);
                }
            } else if (selectName == 1) {
                moneyCommonResponse = this.moneyCommonResponseAdapter.fromJson(jsonReader);
                if (moneyCommonResponse == null) {
                    throw Util.unexpectedNull("amount", "amount", jsonReader);
                }
            } else if (selectName == 2) {
                creditLimitPlanPaymentStatus = this.creditLimitPlanPaymentStatusAdapter.fromJson(jsonReader);
                if (creditLimitPlanPaymentStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 3) {
                moneyCommonResponse2 = this.nullableMoneyCommonResponseAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("dateTime", "date_time", jsonReader);
        }
        if (moneyCommonResponse == null) {
            throw Util.missingProperty("amount", "amount", jsonReader);
        }
        if (creditLimitPlanPaymentStatus != null) {
            return new CreditLimitPlanPaymentResponse(str, moneyCommonResponse, creditLimitPlanPaymentStatus, moneyCommonResponse2);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitPlanPaymentResponse creditLimitPlanPaymentResponse) {
        CreditLimitPlanPaymentResponse creditLimitPlanPaymentResponse2 = creditLimitPlanPaymentResponse;
        if (creditLimitPlanPaymentResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("date_time");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPaymentResponse2.getDateTime());
        jsonWriter.name("amount");
        this.moneyCommonResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPaymentResponse2.getAmount());
        jsonWriter.name(ACSPConstants.STATUS);
        this.creditLimitPlanPaymentStatusAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPaymentResponse2.getStatus());
        jsonWriter.name("overpayment_amount");
        this.nullableMoneyCommonResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanPaymentResponse2.getOverpaymentAmount());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(CreditLimitPlanPaymentResponse)");
    }
}
