package com.ybsdk.feature.autotopup.internal.network.dto;

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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;", "autoTopupParamsDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDto;", "nullableAutoFundDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "hmacDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveAutoTopupRequestJsonAdapter extends JsonAdapter<SaveAutoTopupRequest> {
    private final JsonAdapter<AutoTopupParamsDto> autoTopupParamsDtoAdapter;
    private final JsonAdapter<HmacDto> hmacDtoAdapter;
    private final JsonAdapter<AutoFundDto> nullableAutoFundDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "autotopup_id", "params", "autofund", "hmac");
    private final JsonAdapter<String> stringAdapter;

    public SaveAutoTopupRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "autoTopupId");
        this.autoTopupParamsDtoAdapter = moshi.adapter(AutoTopupParamsDto.class, emptySet, "params");
        this.nullableAutoFundDtoAdapter = moshi.adapter(AutoFundDto.class, emptySet, "autoFundData");
        this.hmacDtoAdapter = moshi.adapter(HmacDto.class, emptySet, "hmac");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SaveAutoTopupRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        AutoTopupParamsDto autoTopupParamsDto = null;
        AutoFundDto autoFundDto = null;
        HmacDto hmacDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                autoTopupParamsDto = this.autoTopupParamsDtoAdapter.fromJson(jsonReader);
                if (autoTopupParamsDto == null) {
                    throw Util.unexpectedNull("params", "params", jsonReader);
                }
            } else if (selectName == 3) {
                autoFundDto = this.nullableAutoFundDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4 && (hmacDto = this.hmacDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("hmac", "hmac", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
        }
        if (autoTopupParamsDto == null) {
            throw Util.missingProperty("params", "params", jsonReader);
        }
        if (hmacDto != null) {
            return new SaveAutoTopupRequest(str, str2, autoTopupParamsDto, autoFundDto, hmacDto);
        }
        throw Util.missingProperty("hmac", "hmac", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SaveAutoTopupRequest saveAutoTopupRequest) {
        SaveAutoTopupRequest saveAutoTopupRequest2 = saveAutoTopupRequest;
        if (saveAutoTopupRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupRequest2.getAgreementId());
        jsonWriter.name("autotopup_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupRequest2.getAutoTopupId());
        jsonWriter.name("params");
        this.autoTopupParamsDtoAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupRequest2.getParams());
        jsonWriter.name("autofund");
        this.nullableAutoFundDtoAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupRequest2.getAutoFundData());
        jsonWriter.name("hmac");
        this.hmacDtoAdapter.toJson(jsonWriter, (JsonWriter) saveAutoTopupRequest2.getHmac());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(SaveAutoTopupRequest)");
    }
}
