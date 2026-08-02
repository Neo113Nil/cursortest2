package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse_AutoTopupData_PaymentMethodsBottomSheetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$PaymentMethodsBottomSheet;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "nullableCurrentPaymentMethodDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "paymentMethodsListDtoAdapter", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetDepositPageResponse_AutoTopupData_PaymentMethodsBottomSheetJsonAdapter extends JsonAdapter<GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet> {
    private final JsonAdapter<CurrentPaymentMethodDto> nullableCurrentPaymentMethodDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "selected_payment_method", "payment_methods_list");
    private final JsonAdapter<PaymentMethodsListDto> paymentMethodsListDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public GetDepositPageResponse_AutoTopupData_PaymentMethodsBottomSheetJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableCurrentPaymentMethodDtoAdapter = moshi.adapter(CurrentPaymentMethodDto.class, emptySet, "selectedPaymentMethod");
        this.paymentMethodsListDtoAdapter = moshi.adapter(PaymentMethodsListDto.class, emptySet, "paymentMethods");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        CurrentPaymentMethodDto currentPaymentMethodDto = null;
        PaymentMethodsListDto paymentMethodsListDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                currentPaymentMethodDto = this.nullableCurrentPaymentMethodDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (paymentMethodsListDto = this.paymentMethodsListDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentMethods", "payment_methods_list", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (paymentMethodsListDto != null) {
            return new GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet(str, currentPaymentMethodDto, paymentMethodsListDto);
        }
        throw Util.missingProperty("paymentMethods", "payment_methods_list", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet paymentMethodsBottomSheet) {
        GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet paymentMethodsBottomSheet2 = paymentMethodsBottomSheet;
        if (paymentMethodsBottomSheet2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodsBottomSheet2.getTitle());
        jsonWriter.name("selected_payment_method");
        this.nullableCurrentPaymentMethodDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodsBottomSheet2.getSelectedPaymentMethod());
        jsonWriter.name("payment_methods_list");
        this.paymentMethodsListDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodsBottomSheet2.getPaymentMethods());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(84, "GeneratedJsonAdapter(GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet)");
    }
}
