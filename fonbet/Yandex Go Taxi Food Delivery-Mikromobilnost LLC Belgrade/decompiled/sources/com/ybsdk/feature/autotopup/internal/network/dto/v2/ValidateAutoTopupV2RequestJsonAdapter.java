package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/ValidateAutoTopupV2RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/ValidateAutoTopupV2Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;", "autoTopupPaymentPartyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentInfo;", "autoTopupPaymentInfoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValidateAutoTopupV2RequestJsonAdapter extends JsonAdapter<ValidateAutoTopupV2Request> {
    private final JsonAdapter<AutoTopupPaymentInfo> autoTopupPaymentInfoAdapter;
    private final JsonAdapter<AutoTopupPaymentParty> autoTopupPaymentPartyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_source", "payment_target", "auto_payment");

    public ValidateAutoTopupV2RequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.autoTopupPaymentPartyAdapter = moshi.adapter(AutoTopupPaymentParty.class, emptySet, "paymentSource");
        this.autoTopupPaymentInfoAdapter = moshi.adapter(AutoTopupPaymentInfo.class, emptySet, "autoPayment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ValidateAutoTopupV2Request fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AutoTopupPaymentParty autoTopupPaymentParty = null;
        AutoTopupPaymentParty autoTopupPaymentParty2 = null;
        AutoTopupPaymentInfo autoTopupPaymentInfo = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                autoTopupPaymentParty = this.autoTopupPaymentPartyAdapter.fromJson(jsonReader);
                if (autoTopupPaymentParty == null) {
                    throw Util.unexpectedNull("paymentSource", "payment_source", jsonReader);
                }
            } else if (selectName == 1) {
                autoTopupPaymentParty2 = this.autoTopupPaymentPartyAdapter.fromJson(jsonReader);
                if (autoTopupPaymentParty2 == null) {
                    throw Util.unexpectedNull("paymentTarget", "payment_target", jsonReader);
                }
            } else if (selectName == 2 && (autoTopupPaymentInfo = this.autoTopupPaymentInfoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("autoPayment", "auto_payment", jsonReader);
            }
        }
        jsonReader.endObject();
        if (autoTopupPaymentParty == null) {
            throw Util.missingProperty("paymentSource", "payment_source", jsonReader);
        }
        if (autoTopupPaymentParty2 == null) {
            throw Util.missingProperty("paymentTarget", "payment_target", jsonReader);
        }
        if (autoTopupPaymentInfo != null) {
            return new ValidateAutoTopupV2Request(autoTopupPaymentParty, autoTopupPaymentParty2, autoTopupPaymentInfo);
        }
        throw Util.missingProperty("autoPayment", "auto_payment", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ValidateAutoTopupV2Request validateAutoTopupV2Request) {
        ValidateAutoTopupV2Request validateAutoTopupV2Request2 = validateAutoTopupV2Request;
        if (validateAutoTopupV2Request2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_source");
        this.autoTopupPaymentPartyAdapter.toJson(jsonWriter, (JsonWriter) validateAutoTopupV2Request2.getPaymentSource());
        jsonWriter.name("payment_target");
        this.autoTopupPaymentPartyAdapter.toJson(jsonWriter, (JsonWriter) validateAutoTopupV2Request2.getPaymentTarget());
        jsonWriter.name("auto_payment");
        this.autoTopupPaymentInfoAdapter.toJson(jsonWriter, (JsonWriter) validateAutoTopupV2Request2.getAutoPayment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(ValidateAutoTopupV2Request)");
    }
}
