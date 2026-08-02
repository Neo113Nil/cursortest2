package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR(\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitCreateApplicationRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitCreateApplicationRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "", "nullableMapOfStringAnyAdapter", "", "nullableIntAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitCreateApplicationRequestJsonAdapter extends JsonAdapter<CreditLimitCreateApplicationRequest> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ret_path", "originating_system", "merchant_data", "promo_id", "selected_term");
    private final JsonAdapter<String> stringAdapter;

    public CreditLimitCreateApplicationRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "retpath");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "originatingSystem");
        this.nullableMapOfStringAnyAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), emptySet, "merchantData");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "selectedTerm");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitCreateApplicationRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Map<String, Object> map = null;
        String str3 = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("retpath", "ret_path", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                map = this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new CreditLimitCreateApplicationRequest(str, str2, map, str3, num);
        }
        throw Util.missingProperty("retpath", "ret_path", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitCreateApplicationRequest creditLimitCreateApplicationRequest) {
        CreditLimitCreateApplicationRequest creditLimitCreateApplicationRequest2 = creditLimitCreateApplicationRequest;
        if (creditLimitCreateApplicationRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ret_path");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitCreateApplicationRequest2.getRetpath());
        jsonWriter.name("originating_system");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitCreateApplicationRequest2.getOriginatingSystem());
        jsonWriter.name("merchant_data");
        this.nullableMapOfStringAnyAdapter.toJson(jsonWriter, (JsonWriter) creditLimitCreateApplicationRequest2.getMerchantData());
        jsonWriter.name("promo_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitCreateApplicationRequest2.getPromoId());
        jsonWriter.name("selected_term");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) creditLimitCreateApplicationRequest2.getSelectedTerm());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(57, "GeneratedJsonAdapter(CreditLimitCreateApplicationRequest)");
    }
}
