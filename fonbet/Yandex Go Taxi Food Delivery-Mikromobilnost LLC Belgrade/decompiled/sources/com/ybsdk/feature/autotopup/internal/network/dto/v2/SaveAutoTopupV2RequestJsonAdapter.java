package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SaveAutoTopupV2Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentParty;", "autoTopupPaymentPartyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupV2PaymentInput;", "listOfAutoTopupV2PaymentInputAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "nullableHmacDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveAutoTopupV2RequestJsonAdapter extends JsonAdapter<SaveAutoTopupV2Request> {
    private final JsonAdapter<AutoTopupPaymentParty> autoTopupPaymentPartyAdapter;
    private final JsonAdapter<List<AutoTopupV2PaymentInput>> listOfAutoTopupV2PaymentInputAdapter;
    private final JsonAdapter<HmacDto> nullableHmacDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_source", "payment_target", "auto_payments", "autotopup_id", "hmac_deprecated");

    public SaveAutoTopupV2RequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.autoTopupPaymentPartyAdapter = moshi.adapter(AutoTopupPaymentParty.class, emptySet, "paymentSource");
        this.listOfAutoTopupV2PaymentInputAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoTopupV2PaymentInput.class), emptySet, "autoPayments");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "autotopupId");
        this.nullableHmacDtoAdapter = moshi.adapter(HmacDto.class, emptySet, "hmacDeprecated");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SaveAutoTopupV2Request fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AutoTopupPaymentParty autoTopupPaymentParty = null;
        AutoTopupPaymentParty autoTopupPaymentParty2 = null;
        List<AutoTopupV2PaymentInput> list = null;
        String str = null;
        HmacDto hmacDto = null;
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
            } else if (selectName == 2) {
                list = this.listOfAutoTopupV2PaymentInputAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("autoPayments", "auto_payments", jsonReader);
                }
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                hmacDto = this.nullableHmacDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (autoTopupPaymentParty == null) {
            throw Util.missingProperty("paymentSource", "payment_source", jsonReader);
        }
        if (autoTopupPaymentParty2 == null) {
            throw Util.missingProperty("paymentTarget", "payment_target", jsonReader);
        }
        if (list != null) {
            return new SaveAutoTopupV2Request(autoTopupPaymentParty, autoTopupPaymentParty2, list, str, hmacDto);
        }
        throw Util.missingProperty("autoPayments", "auto_payments", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SaveAutoTopupV2Request saveAutoTopupV2Request) {
        SaveAutoTopupV2Request saveAutoTopupV2Request2 = saveAutoTopupV2Request;
        if (saveAutoTopupV2Request2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_source");
        this.autoTopupPaymentPartyAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupV2Request2.getPaymentSource());
        jsonWriter.name("payment_target");
        this.autoTopupPaymentPartyAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupV2Request2.getPaymentTarget());
        jsonWriter.name("auto_payments");
        this.listOfAutoTopupV2PaymentInputAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupV2Request2.getAutoPayments());
        jsonWriter.name("autotopup_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupV2Request2.getAutotopupId());
        jsonWriter.name("hmac_deprecated");
        this.nullableHmacDtoAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupV2Request2.getHmacDeprecated());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(SaveAutoTopupV2Request)");
    }
}
