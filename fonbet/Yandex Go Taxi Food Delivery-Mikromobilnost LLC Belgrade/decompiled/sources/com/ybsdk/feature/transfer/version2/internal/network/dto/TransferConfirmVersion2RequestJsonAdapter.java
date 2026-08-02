package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmVersion2RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmVersion2Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;", "transferRequestAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "nullableHmacDtoAdapter", "nullableStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferConfirmVersion2RequestJsonAdapter extends JsonAdapter<TransferConfirmVersion2Request> {
    private final JsonAdapter<HmacDto> nullableHmacDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("transfer", "check_id", "hmac", "referrer");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TransferRequest> transferRequestAdapter;

    public TransferConfirmVersion2RequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.transferRequestAdapter = moshi.adapter(TransferRequest.class, emptySet, "transferRequest");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "checkId");
        this.nullableHmacDtoAdapter = moshi.adapter(HmacDto.class, emptySet, "hmac");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "referrer");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferConfirmVersion2Request fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TransferRequest transferRequest = null;
        String str = null;
        HmacDto hmacDto = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                transferRequest = this.transferRequestAdapter.fromJson(jsonReader);
                if (transferRequest == null) {
                    throw Util.unexpectedNull("transferRequest", "transfer", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("checkId", "check_id", jsonReader);
                }
            } else if (selectName == 2) {
                hmacDto = this.nullableHmacDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (transferRequest == null) {
            throw Util.missingProperty("transferRequest", "transfer", jsonReader);
        }
        if (str != null) {
            return new TransferConfirmVersion2Request(transferRequest, str, hmacDto, str2);
        }
        throw Util.missingProperty("checkId", "check_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferConfirmVersion2Request transferConfirmVersion2Request) {
        TransferConfirmVersion2Request transferConfirmVersion2Request2 = transferConfirmVersion2Request;
        if (transferConfirmVersion2Request2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("transfer");
        this.transferRequestAdapter.toJson(jsonWriter, (JsonWriter) transferConfirmVersion2Request2.getTransferRequest());
        jsonWriter.name("check_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferConfirmVersion2Request2.getCheckId());
        jsonWriter.name("hmac");
        this.nullableHmacDtoAdapter.toJson(jsonWriter, (JsonWriter) transferConfirmVersion2Request2.getHmac());
        jsonWriter.name("referrer");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferConfirmVersion2Request2.getReferrer());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(TransferConfirmVersion2Request)");
    }
}
