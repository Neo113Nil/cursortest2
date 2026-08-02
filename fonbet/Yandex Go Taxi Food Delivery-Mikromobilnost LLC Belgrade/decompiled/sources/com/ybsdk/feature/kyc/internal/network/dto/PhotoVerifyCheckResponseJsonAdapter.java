package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/PhotoVerifyCheckResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/kyc/internal/network/dto/PhotoVerifyCheckResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/kyc/internal/network/dto/VerificationStatus;", "nullableVerificationStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/kyc/internal/network/dto/DocumentVerificationResult;", "nullableDocumentVerificationResultAdapter", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhotoVerifyCheckResponseJsonAdapter extends JsonAdapter<PhotoVerifyCheckResponse> {
    private final JsonAdapter<DocumentVerificationResult> nullableDocumentVerificationResultAdapter;
    private final JsonAdapter<VerificationStatus> nullableVerificationStatusAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("verification_status", "verification_result");

    public PhotoVerifyCheckResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableVerificationStatusAdapter = moshi.adapter(VerificationStatus.class, emptySet, "verificationStatus");
        this.nullableDocumentVerificationResultAdapter = moshi.adapter(DocumentVerificationResult.class, emptySet, "verificationResult");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PhotoVerifyCheckResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        VerificationStatus verificationStatus = null;
        DocumentVerificationResult documentVerificationResult = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                verificationStatus = this.nullableVerificationStatusAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                documentVerificationResult = this.nullableDocumentVerificationResultAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PhotoVerifyCheckResponse(verificationStatus, documentVerificationResult);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PhotoVerifyCheckResponse photoVerifyCheckResponse) {
        PhotoVerifyCheckResponse photoVerifyCheckResponse2 = photoVerifyCheckResponse;
        if (photoVerifyCheckResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("verification_status");
        this.nullableVerificationStatusAdapter.toJson(jsonWriter, (JsonWriter) photoVerifyCheckResponse2.getVerificationStatus());
        jsonWriter.name("verification_result");
        this.nullableDocumentVerificationResultAdapter.toJson(jsonWriter, (JsonWriter) photoVerifyCheckResponse2.getVerificationResult());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(PhotoVerifyCheckResponse)");
    }
}
