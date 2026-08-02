package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$Header;", "headerAdapter", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$PaymentMethod;", "paymentMethodAdapter", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$TransactionStatusScreen;", "transactionStatusScreenAdapter", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData;", "nullableAutoTopupDataAdapter", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetDepositPageResponseJsonAdapter extends JsonAdapter<GetDepositPageResponse> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<GetDepositPageResponse.Header> headerAdapter;
    private final JsonAdapter<GetDepositPageResponse.AutoTopupData> nullableAutoTopupDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("divkit_data", "header", "payment_method", "transaction_status_screen", "auto_topup_data");
    private final JsonAdapter<GetDepositPageResponse.PaymentMethod> paymentMethodAdapter;
    private final JsonAdapter<GetDepositPageResponse.TransactionStatusScreen> transactionStatusScreenAdapter;

    public GetDepositPageResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitData");
        this.headerAdapter = moshi.adapter(GetDepositPageResponse.Header.class, emptySet, "header");
        this.paymentMethodAdapter = moshi.adapter(GetDepositPageResponse.PaymentMethod.class, emptySet, "paymentMethod");
        this.transactionStatusScreenAdapter = moshi.adapter(GetDepositPageResponse.TransactionStatusScreen.class, emptySet, "transactionStatusScreen");
        this.nullableAutoTopupDataAdapter = moshi.adapter(GetDepositPageResponse.AutoTopupData.class, emptySet, "autoTopupData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetDepositPageResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivDataDto divDataDto = null;
        GetDepositPageResponse.Header header = null;
        GetDepositPageResponse.PaymentMethod paymentMethod = null;
        GetDepositPageResponse.TransactionStatusScreen transactionStatusScreen = null;
        GetDepositPageResponse.AutoTopupData autoTopupData = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            DivDataDto divDataDto2 = divDataDto;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                if (divDataDto == null) {
                    throw Util.unexpectedNull("divkitData", "divkit_data", jsonReader);
                }
            } else if (selectName == 1) {
                header = this.headerAdapter.fromJson(jsonReader);
                if (header == null) {
                    throw Util.unexpectedNull("header_", "header", jsonReader);
                }
            } else if (selectName == 2) {
                paymentMethod = this.paymentMethodAdapter.fromJson(jsonReader);
                if (paymentMethod == null) {
                    throw Util.unexpectedNull("paymentMethod", "payment_method", jsonReader);
                }
            } else if (selectName == 3) {
                transactionStatusScreen = this.transactionStatusScreenAdapter.fromJson(jsonReader);
                if (transactionStatusScreen == null) {
                    throw Util.unexpectedNull("transactionStatusScreen", "transaction_status_screen", jsonReader);
                }
            } else if (selectName == 4) {
                autoTopupData = this.nullableAutoTopupDataAdapter.fromJson(jsonReader);
            }
            divDataDto = divDataDto2;
        }
        DivDataDto divDataDto3 = divDataDto;
        jsonReader.endObject();
        if (divDataDto3 == null) {
            throw Util.missingProperty("divkitData", "divkit_data", jsonReader);
        }
        if (header == null) {
            throw Util.missingProperty("header_", "header", jsonReader);
        }
        if (paymentMethod == null) {
            throw Util.missingProperty("paymentMethod", "payment_method", jsonReader);
        }
        if (transactionStatusScreen != null) {
            return new GetDepositPageResponse(divDataDto3, header, paymentMethod, transactionStatusScreen, autoTopupData);
        }
        throw Util.missingProperty("transactionStatusScreen", "transaction_status_screen", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetDepositPageResponse getDepositPageResponse) {
        GetDepositPageResponse getDepositPageResponse2 = getDepositPageResponse;
        if (getDepositPageResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("divkit_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) getDepositPageResponse2.getDivkitData());
        jsonWriter.name("header");
        this.headerAdapter.toJson(jsonWriter, (JsonWriter) getDepositPageResponse2.getHeader());
        jsonWriter.name("payment_method");
        this.paymentMethodAdapter.toJson(jsonWriter, (JsonWriter) getDepositPageResponse2.getPaymentMethod());
        jsonWriter.name("transaction_status_screen");
        this.transactionStatusScreenAdapter.toJson(jsonWriter, (JsonWriter) getDepositPageResponse2.getTransactionStatusScreen());
        jsonWriter.name("auto_topup_data");
        this.nullableAutoTopupDataAdapter.toJson(jsonWriter, (JsonWriter) getDepositPageResponse2.getAutoTopupData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(GetDepositPageResponse)");
    }
}
