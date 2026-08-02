package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/PosCreditSummaryResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/PosCreditSummaryResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "", "stringAdapter", "nullableStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PosCreditSummaryResponseJsonAdapter extends JsonAdapter<PosCreditSummaryResponse> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("credit_found", "credit_payment_count", "credit_details_external_deeplink", "has_overdue_payment", "next_payment_date");
    private final JsonAdapter<String> stringAdapter;

    public PosCreditSummaryResponseJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "creditFound");
        this.bigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "creditPaymentCount");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "creditDetailsExternalDeeplink");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "nextPaymentDate");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PosCreditSummaryResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        BigDecimal bigDecimal = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            Boolean bool3 = bool;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("creditFound", "credit_found", jsonReader);
                }
            } else if (selectName == 1) {
                bigDecimal = this.bigDecimalAdapter.fromJson(jsonReader);
                if (bigDecimal == null) {
                    throw Util.unexpectedNull("creditPaymentCount", "credit_payment_count", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("creditDetailsExternalDeeplink", "credit_details_external_deeplink", jsonReader);
                }
            } else if (selectName == 3) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("hasOverduePayment", "has_overdue_payment", jsonReader);
                }
            } else if (selectName == 4) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
            bool = bool3;
        }
        Boolean bool4 = bool;
        jsonReader.endObject();
        Boolean bool5 = bool2;
        if (bool4 == null) {
            throw Util.missingProperty("creditFound", "credit_found", jsonReader);
        }
        boolean booleanValue = bool4.booleanValue();
        if (bigDecimal == null) {
            throw Util.missingProperty("creditPaymentCount", "credit_payment_count", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("creditDetailsExternalDeeplink", "credit_details_external_deeplink", jsonReader);
        }
        if (bool5 != null) {
            return new PosCreditSummaryResponse(booleanValue, bigDecimal, str, bool5.booleanValue(), str2);
        }
        throw Util.missingProperty("hasOverduePayment", "has_overdue_payment", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PosCreditSummaryResponse posCreditSummaryResponse) {
        PosCreditSummaryResponse posCreditSummaryResponse2 = posCreditSummaryResponse;
        if (posCreditSummaryResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("credit_found");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(posCreditSummaryResponse2.getCreditFound()));
        jsonWriter.name("credit_payment_count");
        this.bigDecimalAdapter.toJson(jsonWriter, (JsonWriter) posCreditSummaryResponse2.getCreditPaymentCount());
        jsonWriter.name("credit_details_external_deeplink");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) posCreditSummaryResponse2.getCreditDetailsExternalDeeplink());
        jsonWriter.name("has_overdue_payment");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(posCreditSummaryResponse2.getHasOverduePayment()));
        jsonWriter.name("next_payment_date");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) posCreditSummaryResponse2.getNextPaymentDate());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(PosCreditSummaryResponse)");
    }
}
