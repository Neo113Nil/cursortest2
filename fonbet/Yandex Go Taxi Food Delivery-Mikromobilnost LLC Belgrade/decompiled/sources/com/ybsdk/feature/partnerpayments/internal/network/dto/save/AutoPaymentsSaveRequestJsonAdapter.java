package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentsSaveRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentsSaveRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto;", "paymentPartyDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInputDto;", "listOfAutoPaymentInputDtoAdapter", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoPaymentsSaveRequestJsonAdapter extends JsonAdapter<AutoPaymentsSaveRequest> {
    private final JsonAdapter<List<AutoPaymentInputDto>> listOfAutoPaymentInputDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_source", "payment_target", "auto_payments_settings");
    private final JsonAdapter<PaymentPartyDto> paymentPartyDtoAdapter;

    public AutoPaymentsSaveRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.paymentPartyDtoAdapter = moshi.adapter(PaymentPartyDto.class, emptySet, "paymentSource");
        this.listOfAutoPaymentInputDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoPaymentInputDto.class), emptySet, "autoPaymentsSettings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoPaymentsSaveRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentPartyDto paymentPartyDto = null;
        PaymentPartyDto paymentPartyDto2 = null;
        List<AutoPaymentInputDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentPartyDto = this.paymentPartyDtoAdapter.fromJson(jsonReader);
                if (paymentPartyDto == null) {
                    throw Util.unexpectedNull("paymentSource", "payment_source", jsonReader);
                }
            } else if (selectName == 1) {
                paymentPartyDto2 = this.paymentPartyDtoAdapter.fromJson(jsonReader);
                if (paymentPartyDto2 == null) {
                    throw Util.unexpectedNull("paymentTarget", "payment_target", jsonReader);
                }
            } else if (selectName == 2 && (list = this.listOfAutoPaymentInputDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("autoPaymentsSettings", "auto_payments_settings", jsonReader);
            }
        }
        jsonReader.endObject();
        if (paymentPartyDto == null) {
            throw Util.missingProperty("paymentSource", "payment_source", jsonReader);
        }
        if (paymentPartyDto2 == null) {
            throw Util.missingProperty("paymentTarget", "payment_target", jsonReader);
        }
        if (list != null) {
            return new AutoPaymentsSaveRequest(paymentPartyDto, paymentPartyDto2, list);
        }
        throw Util.missingProperty("autoPaymentsSettings", "auto_payments_settings", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoPaymentsSaveRequest autoPaymentsSaveRequest) {
        AutoPaymentsSaveRequest autoPaymentsSaveRequest2 = autoPaymentsSaveRequest;
        if (autoPaymentsSaveRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_source");
        this.paymentPartyDtoAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentsSaveRequest2.getPaymentSource());
        jsonWriter.name("payment_target");
        this.paymentPartyDtoAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentsSaveRequest2.getPaymentTarget());
        jsonWriter.name("auto_payments_settings");
        this.listOfAutoPaymentInputDtoAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentsSaveRequest2.getAutoPaymentsSettings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(AutoPaymentsSaveRequest)");
    }
}
