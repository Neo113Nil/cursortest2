package com.ybsdk.feature.transfer.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.internal.network.dto.CheckUserTransferTargetResponse;
import defpackage.cf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/internal/network/dto/YbCheckResult;", "nullableYbCheckResultAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponse$Status;", "statusAdapter", "", "nullableStringAdapter", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckUserTransferTargetResponseJsonAdapter extends JsonAdapter<CheckUserTransferTargetResponse> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<YbCheckResult> nullableYbCheckResultAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<CheckUserTransferTargetResponse.Status> statusAdapter;

    public CheckUserTransferTargetResponseJsonAdapter(Moshi moshi) {
        byte[] bArr = cf91.f;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ cf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of(new String(bArr2, uza.a), ACSPConstants.STATUS, "error");
        EmptySet emptySet = EmptySet.a;
        this.nullableYbCheckResultAdapter = moshi.adapter(YbCheckResult.class, emptySet, "ybCheckResult");
        this.statusAdapter = moshi.adapter(CheckUserTransferTargetResponse.Status.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "error");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckUserTransferTargetResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        YbCheckResult ybCheckResult = null;
        CheckUserTransferTargetResponse.Status status = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                ybCheckResult = this.nullableYbCheckResultAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                status = this.statusAdapter.fromJson(jsonReader);
                if (status == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (status != null) {
            return new CheckUserTransferTargetResponse(ybCheckResult, status, str);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckUserTransferTargetResponse checkUserTransferTargetResponse) {
        CheckUserTransferTargetResponse checkUserTransferTargetResponse2 = checkUserTransferTargetResponse;
        if (checkUserTransferTargetResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        byte[] bArr = new byte[17];
        for (int i = 0; i < 17; i++) {
            bArr[i] = (byte) (cf91.f[i] ^ cf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.nullableYbCheckResultAdapter.toJson(jsonWriter, (JsonWriter) checkUserTransferTargetResponse2.getYbCheckResult());
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) checkUserTransferTargetResponse2.getStatus());
        jsonWriter.name("error");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkUserTransferTargetResponse2.getError());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(CheckUserTransferTargetResponse)");
    }
}
