package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanVisualPropertiesResponse;", "creditLimitPlanVisualPropertiesResponseAdapter", "", "stringAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalResponse;", "creditLimitPlanPaymentIntervalResponseAdapter", "", "intAdapter", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "moneyCommonResponseAdapter", "nullableMoneyCommonResponseAdapter", "", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentResponse;", "listOfCreditLimitPlanPaymentResponseAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanDisclaimerResponse;", "nullableCreditLimitPlanDisclaimerResponseAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPromoResponse;", "nullableCreditLimitPlanPromoResponseAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanAdditionalProperties;", "nullableCreditLimitPlanAdditionalPropertiesAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitPlanResponseJsonAdapter extends JsonAdapter<CreditLimitPlanResponse> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<CreditLimitPlanPaymentIntervalResponse> creditLimitPlanPaymentIntervalResponseAdapter;
    private final JsonAdapter<CreditLimitPlanVisualPropertiesResponse> creditLimitPlanVisualPropertiesResponseAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<CreditLimitPlanPaymentResponse>> listOfCreditLimitPlanPaymentResponseAdapter;
    private final JsonAdapter<MoneyCommonResponse> moneyCommonResponseAdapter;
    private final JsonAdapter<CreditLimitPlanAdditionalProperties> nullableCreditLimitPlanAdditionalPropertiesAdapter;
    private final JsonAdapter<CreditLimitPlanDisclaimerResponse> nullableCreditLimitPlanDisclaimerResponseAdapter;
    private final JsonAdapter<CreditLimitPlanPromoResponse> nullableCreditLimitPlanPromoResponseAdapter;
    private final JsonAdapter<MoneyCommonResponse> nullableMoneyCommonResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("need_upgrade", "visual_properties", "constructor", "payment_interval", "credit_length_in_months", "deposit", "fee", "payment", "loan", "payments", "actual_payments_count", "disclaimer", "promo", "plan_additional_properties");
    private final JsonAdapter<String> stringAdapter;

    public CreditLimitPlanResponseJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "needUpgrade");
        this.creditLimitPlanVisualPropertiesResponseAdapter = moshi.adapter(CreditLimitPlanVisualPropertiesResponse.class, emptySet, "visualProperties");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "constructor");
        this.creditLimitPlanPaymentIntervalResponseAdapter = moshi.adapter(CreditLimitPlanPaymentIntervalResponse.class, emptySet, "paymentInterval");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "creditLimitInMonths");
        this.moneyCommonResponseAdapter = moshi.adapter(MoneyCommonResponse.class, emptySet, "deposit");
        this.nullableMoneyCommonResponseAdapter = moshi.adapter(MoneyCommonResponse.class, emptySet, "fee");
        this.listOfCreditLimitPlanPaymentResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, CreditLimitPlanPaymentResponse.class), emptySet, "payments");
        this.nullableCreditLimitPlanDisclaimerResponseAdapter = moshi.adapter(CreditLimitPlanDisclaimerResponse.class, emptySet, "disclaimer");
        this.nullableCreditLimitPlanPromoResponseAdapter = moshi.adapter(CreditLimitPlanPromoResponse.class, emptySet, "promo");
        this.nullableCreditLimitPlanAdditionalPropertiesAdapter = moshi.adapter(CreditLimitPlanAdditionalProperties.class, emptySet, "planAdditionalProperties");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitPlanResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        CreditLimitPlanVisualPropertiesResponse creditLimitPlanVisualPropertiesResponse = null;
        String str = null;
        CreditLimitPlanPaymentIntervalResponse creditLimitPlanPaymentIntervalResponse = null;
        MoneyCommonResponse moneyCommonResponse = null;
        MoneyCommonResponse moneyCommonResponse2 = null;
        MoneyCommonResponse moneyCommonResponse3 = null;
        MoneyCommonResponse moneyCommonResponse4 = null;
        List<CreditLimitPlanPaymentResponse> list = null;
        CreditLimitPlanDisclaimerResponse creditLimitPlanDisclaimerResponse = null;
        CreditLimitPlanPromoResponse creditLimitPlanPromoResponse = null;
        CreditLimitPlanAdditionalProperties creditLimitPlanAdditionalProperties = null;
        while (true) {
            Boolean bool2 = bool;
            Integer num3 = num;
            Integer num4 = num2;
            CreditLimitPlanVisualPropertiesResponse creditLimitPlanVisualPropertiesResponse2 = creditLimitPlanVisualPropertiesResponse;
            String str2 = str;
            CreditLimitPlanPaymentIntervalResponse creditLimitPlanPaymentIntervalResponse2 = creditLimitPlanPaymentIntervalResponse;
            MoneyCommonResponse moneyCommonResponse5 = moneyCommonResponse;
            MoneyCommonResponse moneyCommonResponse6 = moneyCommonResponse2;
            MoneyCommonResponse moneyCommonResponse7 = moneyCommonResponse3;
            MoneyCommonResponse moneyCommonResponse8 = moneyCommonResponse4;
            List<CreditLimitPlanPaymentResponse> list2 = list;
            CreditLimitPlanDisclaimerResponse creditLimitPlanDisclaimerResponse2 = creditLimitPlanDisclaimerResponse;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (bool2 == null) {
                    throw Util.missingProperty("needUpgrade", "need_upgrade", jsonReader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (creditLimitPlanVisualPropertiesResponse2 == null) {
                    throw Util.missingProperty("visualProperties", "visual_properties", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("constructor_", "constructor", jsonReader);
                }
                if (creditLimitPlanPaymentIntervalResponse2 == null) {
                    throw Util.missingProperty("paymentInterval", "payment_interval", jsonReader);
                }
                if (num3 == null) {
                    throw Util.missingProperty("creditLimitInMonths", "credit_length_in_months", jsonReader);
                }
                int intValue = num3.intValue();
                if (moneyCommonResponse5 == null) {
                    throw Util.missingProperty("deposit", "deposit", jsonReader);
                }
                if (moneyCommonResponse8 == null) {
                    throw Util.missingProperty("loan", "loan", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty("payments", "payments", jsonReader);
                }
                if (num4 != null) {
                    return new CreditLimitPlanResponse(booleanValue, creditLimitPlanVisualPropertiesResponse2, str2, creditLimitPlanPaymentIntervalResponse2, intValue, moneyCommonResponse5, moneyCommonResponse6, moneyCommonResponse7, moneyCommonResponse8, list2, num4.intValue(), creditLimitPlanDisclaimerResponse2, creditLimitPlanPromoResponse, creditLimitPlanAdditionalProperties);
                }
                throw Util.missingProperty("actualPaymentsCount", "actual_payments_count", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("needUpgrade", "need_upgrade", jsonReader);
                    }
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 1:
                    creditLimitPlanVisualPropertiesResponse = this.creditLimitPlanVisualPropertiesResponseAdapter.fromJson(jsonReader);
                    if (creditLimitPlanVisualPropertiesResponse == null) {
                        throw Util.unexpectedNull("visualProperties", "visual_properties", jsonReader);
                    }
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 2:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("constructor_", "constructor", jsonReader);
                    }
                    str = fromJson;
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 3:
                    CreditLimitPlanPaymentIntervalResponse fromJson2 = this.creditLimitPlanPaymentIntervalResponseAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("paymentInterval", "payment_interval", jsonReader);
                    }
                    creditLimitPlanPaymentIntervalResponse = fromJson2;
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 4:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("creditLimitInMonths", "credit_length_in_months", jsonReader);
                    }
                    bool = bool2;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 5:
                    moneyCommonResponse = this.moneyCommonResponseAdapter.fromJson(jsonReader);
                    if (moneyCommonResponse == null) {
                        throw Util.unexpectedNull("deposit", "deposit", jsonReader);
                    }
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 6:
                    moneyCommonResponse2 = this.nullableMoneyCommonResponseAdapter.fromJson(jsonReader);
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 7:
                    moneyCommonResponse3 = this.nullableMoneyCommonResponseAdapter.fromJson(jsonReader);
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 8:
                    moneyCommonResponse4 = this.moneyCommonResponseAdapter.fromJson(jsonReader);
                    if (moneyCommonResponse4 == null) {
                        throw Util.unexpectedNull("loan", "loan", jsonReader);
                    }
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 9:
                    list = this.listOfCreditLimitPlanPaymentResponseAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("payments", "payments", jsonReader);
                    }
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 10:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("actualPaymentsCount", "actual_payments_count", jsonReader);
                    }
                    bool = bool2;
                    num = num3;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 11:
                    creditLimitPlanDisclaimerResponse = this.nullableCreditLimitPlanDisclaimerResponseAdapter.fromJson(jsonReader);
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                case 12:
                    creditLimitPlanPromoResponse = this.nullableCreditLimitPlanPromoResponseAdapter.fromJson(jsonReader);
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                case 13:
                    creditLimitPlanAdditionalProperties = this.nullableCreditLimitPlanAdditionalPropertiesAdapter.fromJson(jsonReader);
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
                default:
                    bool = bool2;
                    num = num3;
                    num2 = num4;
                    creditLimitPlanVisualPropertiesResponse = creditLimitPlanVisualPropertiesResponse2;
                    str = str2;
                    creditLimitPlanPaymentIntervalResponse = creditLimitPlanPaymentIntervalResponse2;
                    moneyCommonResponse = moneyCommonResponse5;
                    moneyCommonResponse2 = moneyCommonResponse6;
                    moneyCommonResponse3 = moneyCommonResponse7;
                    moneyCommonResponse4 = moneyCommonResponse8;
                    list = list2;
                    creditLimitPlanDisclaimerResponse = creditLimitPlanDisclaimerResponse2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitPlanResponse creditLimitPlanResponse) {
        CreditLimitPlanResponse creditLimitPlanResponse2 = creditLimitPlanResponse;
        if (creditLimitPlanResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("need_upgrade");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(creditLimitPlanResponse2.getNeedUpgrade()));
        jsonWriter.name("visual_properties");
        this.creditLimitPlanVisualPropertiesResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getVisualProperties());
        jsonWriter.name("constructor");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getConstructor());
        jsonWriter.name("payment_interval");
        this.creditLimitPlanPaymentIntervalResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getPaymentInterval());
        jsonWriter.name("credit_length_in_months");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(creditLimitPlanResponse2.getCreditLimitInMonths()));
        jsonWriter.name("deposit");
        this.moneyCommonResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getDeposit());
        jsonWriter.name("fee");
        this.nullableMoneyCommonResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getFee());
        jsonWriter.name("payment");
        this.nullableMoneyCommonResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getPayment());
        jsonWriter.name("loan");
        this.moneyCommonResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getLoan());
        jsonWriter.name("payments");
        this.listOfCreditLimitPlanPaymentResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getPayments());
        jsonWriter.name("actual_payments_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(creditLimitPlanResponse2.getActualPaymentsCount()));
        jsonWriter.name("disclaimer");
        this.nullableCreditLimitPlanDisclaimerResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getDisclaimer());
        jsonWriter.name("promo");
        this.nullableCreditLimitPlanPromoResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getPromo());
        jsonWriter.name("plan_additional_properties");
        this.nullableCreditLimitPlanAdditionalPropertiesAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlanResponse2.getPlanAdditionalProperties());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(CreditLimitPlanResponse)");
    }
}
