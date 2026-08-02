package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitGetOrderInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitGetOrderInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanResponse;", "creditLimitPlanResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitGetOrderInfoResponseJsonAdapter extends JsonAdapter<CreditLimitGetOrderInfoResponse> {
    private final JsonAdapter<CreditLimitPlanResponse> creditLimitPlanResponseAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public CreditLimitGetOrderInfoResponseJsonAdapter(Moshi moshi) {
        byte[] bArr = tje.z0;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        this.options = JsonReader.Options.of("plan", new String(bArr2, uza.a));
        EmptySet emptySet = EmptySet.a;
        this.creditLimitPlanResponseAdapter = moshi.adapter(CreditLimitPlanResponse.class, emptySet, "plan");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "appLink");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitGetOrderInfoResponse fromJson(JsonReader jsonReader) {
        byte[] bArr = tje.b;
        byte[] bArr2 = tje.z0;
        jsonReader.beginObject();
        CreditLimitPlanResponse creditLimitPlanResponse = null;
        String str = null;
        while (true) {
            int i = 0;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (creditLimitPlanResponse == null) {
                    throw Util.missingProperty("plan", "plan", jsonReader);
                }
                if (str != null) {
                    return new CreditLimitGetOrderInfoResponse(creditLimitPlanResponse, str);
                }
                byte[] bArr3 = new byte[13];
                while (i < 13) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    i++;
                }
                throw Util.missingProperty("appLink", new String(bArr3, uza.a), jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                creditLimitPlanResponse = this.creditLimitPlanResponseAdapter.fromJson(jsonReader);
                if (creditLimitPlanResponse == null) {
                    throw Util.unexpectedNull("plan", "plan", jsonReader);
                }
            } else if (selectName == 1 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                byte[] bArr4 = new byte[13];
                while (i < 13) {
                    bArr4[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    i++;
                }
                throw Util.unexpectedNull("appLink", new String(bArr4, uza.a), jsonReader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitGetOrderInfoResponse creditLimitGetOrderInfoResponse) {
        CreditLimitGetOrderInfoResponse creditLimitGetOrderInfoResponse2 = creditLimitGetOrderInfoResponse;
        if (creditLimitGetOrderInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("plan");
        this.creditLimitPlanResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitGetOrderInfoResponse2.getPlan());
        byte[] bArr = tje.z0;
        byte[] bArr2 = new byte[13];
        for (int i = 0; i < 13; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        jsonWriter.name(new String(bArr2, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitGetOrderInfoResponse2.getAppLink());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(CreditLimitGetOrderInfoResponse)");
    }
}
