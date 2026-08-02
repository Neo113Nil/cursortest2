package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR(\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditSummaryRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditSummaryRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "nullableStringAdapter", "", "", "nullableMapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditSummaryRequestJsonAdapter extends JsonAdapter<CreditSummaryRequest> {
    private volatile Constructor<CreditSummaryRequest> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("consumer_id", "selected_term", "ret_path", "promo_id", "merchant_data");
    private final JsonAdapter<String> stringAdapter;

    public CreditSummaryRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "consumerId");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "selectedTerm");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "retPath");
        this.nullableMapOfStringAnyAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), emptySet, "merchantData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditSummaryRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        Map<String, Object> map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("consumerId", "consumer_id", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (selectName == 4) {
                map = this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.endObject();
        if (i == -31) {
            Map<String, Object> map2 = map;
            String str4 = str3;
            String str5 = str2;
            Integer num2 = num;
            String str6 = str;
            if (str6 != null) {
                return new CreditSummaryRequest(str6, num2, str5, str4, map2);
            }
            throw Util.missingProperty("consumerId", "consumer_id", jsonReader);
        }
        Map<String, Object> map3 = map;
        String str7 = str3;
        String str8 = str2;
        Integer num3 = num;
        String str9 = str;
        Constructor<CreditSummaryRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CreditSummaryRequest.class.getDeclaredConstructor(String.class, Integer.class, String.class, String.class, Map.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str9 != null) {
            return constructor.newInstance(str9, num3, str8, str7, map3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("consumerId", "consumer_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditSummaryRequest creditSummaryRequest) {
        CreditSummaryRequest creditSummaryRequest2 = creditSummaryRequest;
        if (creditSummaryRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("consumer_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditSummaryRequest2.getConsumerId());
        jsonWriter.name("selected_term");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) creditSummaryRequest2.getSelectedTerm());
        jsonWriter.name("ret_path");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditSummaryRequest2.getRetPath());
        jsonWriter.name("promo_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditSummaryRequest2.getPromoId());
        jsonWriter.name("merchant_data");
        this.nullableMapOfStringAnyAdapter.toJson(jsonWriter, (JsonWriter) creditSummaryRequest2.getMerchantData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(CreditSummaryRequest)");
    }
}
