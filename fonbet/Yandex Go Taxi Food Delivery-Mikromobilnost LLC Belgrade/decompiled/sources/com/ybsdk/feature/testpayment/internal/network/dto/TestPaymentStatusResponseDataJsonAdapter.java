package com.ybsdk.feature.testpayment.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusResponseDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusResponseData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatus;", "testPaymentStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusSuccessData;", "nullableTestPaymentStatusSuccessDataAdapter", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusInProgressData;", "nullableTestPaymentStatusInProgressDataAdapter", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusFailedData;", "nullableTestPaymentStatusFailedDataAdapter", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestPaymentStatusResponseDataJsonAdapter extends JsonAdapter<TestPaymentStatusResponseData> {
    private final JsonAdapter<TestPaymentStatusFailedData> nullableTestPaymentStatusFailedDataAdapter;
    private final JsonAdapter<TestPaymentStatusInProgressData> nullableTestPaymentStatusInProgressDataAdapter;
    private final JsonAdapter<TestPaymentStatusSuccessData> nullableTestPaymentStatusSuccessDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "success_data", "in_progress_data", "failed_data");
    private final JsonAdapter<TestPaymentStatus> testPaymentStatusAdapter;

    public TestPaymentStatusResponseDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.testPaymentStatusAdapter = moshi.adapter(TestPaymentStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableTestPaymentStatusSuccessDataAdapter = moshi.adapter(TestPaymentStatusSuccessData.class, emptySet, "successData");
        this.nullableTestPaymentStatusInProgressDataAdapter = moshi.adapter(TestPaymentStatusInProgressData.class, emptySet, "inProgressData");
        this.nullableTestPaymentStatusFailedDataAdapter = moshi.adapter(TestPaymentStatusFailedData.class, emptySet, "failedData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TestPaymentStatusResponseData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TestPaymentStatus testPaymentStatus = null;
        TestPaymentStatusSuccessData testPaymentStatusSuccessData = null;
        TestPaymentStatusInProgressData testPaymentStatusInProgressData = null;
        TestPaymentStatusFailedData testPaymentStatusFailedData = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                testPaymentStatus = this.testPaymentStatusAdapter.fromJson(jsonReader);
                if (testPaymentStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                testPaymentStatusSuccessData = this.nullableTestPaymentStatusSuccessDataAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                testPaymentStatusInProgressData = this.nullableTestPaymentStatusInProgressDataAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                testPaymentStatusFailedData = this.nullableTestPaymentStatusFailedDataAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (testPaymentStatus != null) {
            return new TestPaymentStatusResponseData(testPaymentStatus, testPaymentStatusSuccessData, testPaymentStatusInProgressData, testPaymentStatusFailedData);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TestPaymentStatusResponseData testPaymentStatusResponseData) {
        TestPaymentStatusResponseData testPaymentStatusResponseData2 = testPaymentStatusResponseData;
        if (testPaymentStatusResponseData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.testPaymentStatusAdapter.toJson(jsonWriter, (JsonWriter) testPaymentStatusResponseData2.getStatus());
        jsonWriter.name("success_data");
        this.nullableTestPaymentStatusSuccessDataAdapter.toJson(jsonWriter, (JsonWriter) testPaymentStatusResponseData2.getSuccessData());
        jsonWriter.name("in_progress_data");
        this.nullableTestPaymentStatusInProgressDataAdapter.toJson(jsonWriter, (JsonWriter) testPaymentStatusResponseData2.getInProgressData());
        jsonWriter.name("failed_data");
        this.nullableTestPaymentStatusFailedDataAdapter.toJson(jsonWriter, (JsonWriter) testPaymentStatusResponseData2.getFailedData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(TestPaymentStatusResponseData)");
    }
}
