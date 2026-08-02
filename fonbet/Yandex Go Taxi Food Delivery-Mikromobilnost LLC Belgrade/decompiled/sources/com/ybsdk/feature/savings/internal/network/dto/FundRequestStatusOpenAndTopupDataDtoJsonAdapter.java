package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusOpenAndTopupDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusOpenAndTopupDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "nullableCurrentPaymentMethodDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "paymentMethodsListDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenLimitsDataDto;", "fundOpenLimitsDataDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundRequestStatusOpenAndTopupDataDtoJsonAdapter extends JsonAdapter<FundRequestStatusOpenAndTopupDataDto> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<FundOpenLimitsDataDto> fundOpenLimitsDataDtoAdapter;
    private final JsonAdapter<CurrentPaymentMethodDto> nullableCurrentPaymentMethodDtoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "current_payment_method", "payment_methods_list", "money", "limits_data", "bottom_divkit_widget", "save_button_text", "agreement_id");
    private final JsonAdapter<PaymentMethodsListDto> paymentMethodsListDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public FundRequestStatusOpenAndTopupDataDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableCurrentPaymentMethodDtoAdapter = moshi.adapter(CurrentPaymentMethodDto.class, emptySet, "currentPaymentMethod");
        this.paymentMethodsListDtoAdapter = moshi.adapter(PaymentMethodsListDto.class, emptySet, "paymentMethodsList");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.fundOpenLimitsDataDtoAdapter = moshi.adapter(FundOpenLimitsDataDto.class, emptySet, "limitsData");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "bottomDivkitWidget");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FundRequestStatusOpenAndTopupDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        CurrentPaymentMethodDto currentPaymentMethodDto = null;
        PaymentMethodsListDto paymentMethodsListDto = null;
        Money money = null;
        FundOpenLimitsDataDto fundOpenLimitsDataDto = null;
        DivDataDto divDataDto = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            String str5 = str;
            String str6 = str2;
            CurrentPaymentMethodDto currentPaymentMethodDto2 = currentPaymentMethodDto;
            PaymentMethodsListDto paymentMethodsListDto2 = paymentMethodsListDto;
            Money money2 = money;
            FundOpenLimitsDataDto fundOpenLimitsDataDto2 = fundOpenLimitsDataDto;
            DivDataDto divDataDto2 = divDataDto;
            if (!jsonReader.hasNext()) {
                String str7 = str3;
                jsonReader.endObject();
                if (str5 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("subtitle", "subtitle", jsonReader);
                }
                if (paymentMethodsListDto2 == null) {
                    throw Util.missingProperty("paymentMethodsList", "payment_methods_list", jsonReader);
                }
                if (fundOpenLimitsDataDto2 == null) {
                    throw Util.missingProperty("limitsData", "limits_data", jsonReader);
                }
                if (divDataDto2 == null) {
                    throw Util.missingProperty("bottomDivkitWidget", "bottom_divkit_widget", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("saveButtonText", "save_button_text", jsonReader);
                }
                if (str4 != null) {
                    return new FundRequestStatusOpenAndTopupDataDto(str5, str6, currentPaymentMethodDto2, paymentMethodsListDto2, money2, fundOpenLimitsDataDto2, divDataDto2, str7, str4);
                }
                throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
            }
            String str8 = str3;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    money = money2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                    divDataDto = divDataDto2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str3 = str8;
                    str2 = str6;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    money = money2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                    divDataDto = divDataDto2;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    str3 = str8;
                    str = str5;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    money = money2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                    divDataDto = divDataDto2;
                case 2:
                    currentPaymentMethodDto = this.nullableCurrentPaymentMethodDtoAdapter.fromJson(jsonReader);
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    money = money2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                    divDataDto = divDataDto2;
                case 3:
                    paymentMethodsListDto = this.paymentMethodsListDtoAdapter.fromJson(jsonReader);
                    if (paymentMethodsListDto == null) {
                        throw Util.unexpectedNull("paymentMethodsList", "payment_methods_list", jsonReader);
                    }
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    money = money2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                    divDataDto = divDataDto2;
                case 4:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                    divDataDto = divDataDto2;
                case 5:
                    fundOpenLimitsDataDto = this.fundOpenLimitsDataDtoAdapter.fromJson(jsonReader);
                    if (fundOpenLimitsDataDto == null) {
                        throw Util.unexpectedNull("limitsData", "limits_data", jsonReader);
                    }
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    money = money2;
                    divDataDto = divDataDto2;
                case 6:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("bottomDivkitWidget", "bottom_divkit_widget", jsonReader);
                    }
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    money = money2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                case 7:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("saveButtonText", "save_button_text", jsonReader);
                    }
                    str = str5;
                    str2 = str6;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    money = money2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                    divDataDto = divDataDto2;
                case 8:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    money = money2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                    divDataDto = divDataDto2;
                default:
                    str3 = str8;
                    str = str5;
                    str2 = str6;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    money = money2;
                    fundOpenLimitsDataDto = fundOpenLimitsDataDto2;
                    divDataDto = divDataDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto) {
        FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto2 = fundRequestStatusOpenAndTopupDataDto;
        if (fundRequestStatusOpenAndTopupDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusOpenAndTopupDataDto2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusOpenAndTopupDataDto2.getSubtitle());
        jsonWriter.name("current_payment_method");
        this.nullableCurrentPaymentMethodDtoAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusOpenAndTopupDataDto2.getCurrentPaymentMethod());
        jsonWriter.name("payment_methods_list");
        this.paymentMethodsListDtoAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusOpenAndTopupDataDto2.getPaymentMethodsList());
        jsonWriter.name("money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusOpenAndTopupDataDto2.getMoney());
        jsonWriter.name("limits_data");
        this.fundOpenLimitsDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusOpenAndTopupDataDto2.getLimitsData());
        jsonWriter.name("bottom_divkit_widget");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusOpenAndTopupDataDto2.getBottomDivkitWidget());
        jsonWriter.name("save_button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusOpenAndTopupDataDto2.getSaveButtonText());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusOpenAndTopupDataDto2.getAgreementId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(58, "GeneratedJsonAdapter(FundRequestStatusOpenAndTopupDataDto)");
    }
}
