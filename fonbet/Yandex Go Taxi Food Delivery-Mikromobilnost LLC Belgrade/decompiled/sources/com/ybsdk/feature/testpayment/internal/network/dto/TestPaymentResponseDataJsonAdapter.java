package com.ybsdk.feature.testpayment.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import defpackage.xe91;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentResponseDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentResponseData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusFailedData;", "testPaymentStatusFailedDataAdapter", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestPaymentResponseDataJsonAdapter extends JsonAdapter<TestPaymentResponseData> {
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TestPaymentStatusFailedData> testPaymentStatusFailedDataAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public TestPaymentResponseDataJsonAdapter(Moshi moshi) {
        byte[] bArr = new byte[10];
        for (int i = 0; i < 10; i++) {
            bArr[i] = (byte) (xe91.b[i] ^ xe91.a[i % 8]);
        }
        this.options = JsonReader.Options.of(new String(bArr, uza.a), "title", "subtitle", "request_id", "timeout_data");
        ParameterizedType newParameterizedType = Types.newParameterizedType(Themes.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themesOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "memberImage");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.testPaymentStatusFailedDataAdapter = moshi.adapter(TestPaymentStatusFailedData.class, emptySet, "timeoutData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TestPaymentResponseData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Themes<String> themes = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        TestPaymentStatusFailedData testPaymentStatusFailedData = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = xe91.a;
            byte[] bArr2 = xe91.b;
            if (!hasNext) {
                Themes<String> themes2 = themes;
                jsonReader.endObject();
                if (themes2 == null) {
                    byte[] bArr3 = new byte[10];
                    for (int i = 0; i < 10; i++) {
                        bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    }
                    throw Util.missingProperty("memberImage", new String(bArr3, uza.a), jsonReader);
                }
                if (str == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("subtitle", "subtitle", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("requestId", "request_id", jsonReader);
                }
                if (testPaymentStatusFailedData != null) {
                    return new TestPaymentResponseData(themes2, str, str2, str3, testPaymentStatusFailedData);
                }
                throw Util.missingProperty("timeoutData", "timeout_data", jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            Themes<String> themes3 = themes;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themes = this.themesOfStringAdapter.fromJson(jsonReader);
                if (themes == null) {
                    byte[] bArr4 = new byte[10];
                    int i2 = 0;
                    for (int i3 = 10; i2 < i3; i3 = 10) {
                        bArr4[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                        i2++;
                    }
                    throw Util.unexpectedNull("memberImage", new String(bArr4, uza.a), jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("requestId", "request_id", jsonReader);
                }
            } else if (selectName == 4 && (testPaymentStatusFailedData = this.testPaymentStatusFailedDataAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("timeoutData", "timeout_data", jsonReader);
            }
            themes = themes3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TestPaymentResponseData testPaymentResponseData) {
        TestPaymentResponseData testPaymentResponseData2 = testPaymentResponseData;
        if (testPaymentResponseData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        byte[] bArr = new byte[10];
        for (int i = 0; i < 10; i++) {
            bArr[i] = (byte) (xe91.b[i] ^ xe91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) testPaymentResponseData2.getMemberImage());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) testPaymentResponseData2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) testPaymentResponseData2.getSubtitle());
        jsonWriter.name("request_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) testPaymentResponseData2.getRequestId());
        jsonWriter.name("timeout_data");
        this.testPaymentStatusFailedDataAdapter.toJson(jsonWriter, (JsonWriter) testPaymentResponseData2.getTimeoutData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(TestPaymentResponseData)");
    }
}
