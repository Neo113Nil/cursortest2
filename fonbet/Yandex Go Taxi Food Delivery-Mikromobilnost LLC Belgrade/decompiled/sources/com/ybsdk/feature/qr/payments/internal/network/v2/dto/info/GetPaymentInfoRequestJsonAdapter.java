package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPaymentInfoRequestJsonAdapter extends JsonAdapter<GetPaymentInfoRequest> {
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("qrc_link", "qrc_scan_id", "agreement_id", "amount", "autopayment_id");
    private final JsonAdapter<String> stringAdapter;

    public GetPaymentInfoRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "qrcLink");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "amount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetPaymentInfoRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Money money = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("qrcLink", "qrc_link", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("qrcScanId", "qrc_scan_id", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                money = this.nullableMoneyAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("qrcLink", "qrc_link", jsonReader);
        }
        if (str2 != null) {
            return new GetPaymentInfoRequest(str, str2, str3, money, str4);
        }
        throw Util.missingProperty("qrcScanId", "qrc_scan_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetPaymentInfoRequest getPaymentInfoRequest) {
        GetPaymentInfoRequest getPaymentInfoRequest2 = getPaymentInfoRequest;
        if (getPaymentInfoRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("qrc_link");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoRequest2.getQrcLink());
        jsonWriter.name("qrc_scan_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoRequest2.getQrcScanId());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoRequest2.getAgreementId());
        jsonWriter.name("amount");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoRequest2.getAmount());
        jsonWriter.name("autopayment_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getPaymentInfoRequest2.getAutopaymentId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(GetPaymentInfoRequest)");
    }
}
