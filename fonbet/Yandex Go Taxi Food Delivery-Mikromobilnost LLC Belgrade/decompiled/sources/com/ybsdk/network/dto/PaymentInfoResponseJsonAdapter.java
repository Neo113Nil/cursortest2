package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.network.dto.PaymentInfoResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/PaymentInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/PaymentInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/PaymentInfoDetails;", "paymentInfoDetailsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/PaymentInfoResponse$Status;", "statusAdapter", "", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "nullableListOfAutoTopupWidgetDtoAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentInfoResponseJsonAdapter extends JsonAdapter<PaymentInfoResponse> {
    private final JsonAdapter<List<AutoTopupWidgetDto>> nullableListOfAutoTopupWidgetDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_info", ACSPConstants.STATUS, "widgets");
    private final JsonAdapter<PaymentInfoDetails> paymentInfoDetailsAdapter;
    private final JsonAdapter<PaymentInfoResponse.Status> statusAdapter;

    public PaymentInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.paymentInfoDetailsAdapter = moshi.adapter(PaymentInfoDetails.class, emptySet, "paymentInfoDetails");
        this.statusAdapter = moshi.adapter(PaymentInfoResponse.Status.class, emptySet, ACSPConstants.STATUS);
        this.nullableListOfAutoTopupWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoTopupWidgetDto.class), emptySet, "widgets");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentInfoDetails paymentInfoDetails = null;
        PaymentInfoResponse.Status status = null;
        List<AutoTopupWidgetDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentInfoDetails = this.paymentInfoDetailsAdapter.fromJson(jsonReader);
                if (paymentInfoDetails == null) {
                    throw Util.unexpectedNull("paymentInfoDetails", "payment_info", jsonReader);
                }
            } else if (selectName == 1) {
                status = this.statusAdapter.fromJson(jsonReader);
                if (status == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 2) {
                list = this.nullableListOfAutoTopupWidgetDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (paymentInfoDetails == null) {
            throw Util.missingProperty("paymentInfoDetails", "payment_info", jsonReader);
        }
        if (status != null) {
            return new PaymentInfoResponse(paymentInfoDetails, status, list);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentInfoResponse paymentInfoResponse) {
        PaymentInfoResponse paymentInfoResponse2 = paymentInfoResponse;
        if (paymentInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_info");
        this.paymentInfoDetailsAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoResponse2.getPaymentInfoDetails());
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoResponse2.getStatus());
        jsonWriter.name("widgets");
        this.nullableListOfAutoTopupWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoResponse2.getWidgets());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(PaymentInfoResponse)");
    }
}
