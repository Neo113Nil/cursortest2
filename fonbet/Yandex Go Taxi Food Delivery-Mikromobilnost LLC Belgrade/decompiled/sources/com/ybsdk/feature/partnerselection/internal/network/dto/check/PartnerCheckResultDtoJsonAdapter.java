package com.ybsdk.feature.partnerselection.internal.network.dto.check;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.partnerselection.internal.network.dto.check.PartnerCheckResultDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/PartnerCheckResultDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/PartnerCheckResultDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/PartnerCheckResultDto$Status;", "statusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/PartnerCheckResultErrorInfoDto;", "nullablePartnerCheckResultErrorInfoDtoAdapter", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PartnerCheckResultDtoJsonAdapter extends JsonAdapter<PartnerCheckResultDto> {
    private final JsonAdapter<PartnerCheckResultErrorInfoDto> nullablePartnerCheckResultErrorInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "receiver_name", "error", "error_info", "request_id");
    private final JsonAdapter<PartnerCheckResultDto.Status> statusAdapter;

    public PartnerCheckResultDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.statusAdapter = moshi.adapter(PartnerCheckResultDto.Status.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "receiverName");
        this.nullablePartnerCheckResultErrorInfoDtoAdapter = moshi.adapter(PartnerCheckResultErrorInfoDto.class, emptySet, "errorInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PartnerCheckResultDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PartnerCheckResultDto.Status status = null;
        String str = null;
        String str2 = null;
        PartnerCheckResultErrorInfoDto partnerCheckResultErrorInfoDto = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                status = this.statusAdapter.fromJson(jsonReader);
                if (status == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                partnerCheckResultErrorInfoDto = this.nullablePartnerCheckResultErrorInfoDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (status != null) {
            return new PartnerCheckResultDto(status, str, str2, partnerCheckResultErrorInfoDto, str3);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PartnerCheckResultDto partnerCheckResultDto) {
        PartnerCheckResultDto partnerCheckResultDto2 = partnerCheckResultDto;
        if (partnerCheckResultDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) partnerCheckResultDto2.getStatus());
        jsonWriter.name("receiver_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) partnerCheckResultDto2.getReceiverName());
        jsonWriter.name("error");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) partnerCheckResultDto2.getError());
        jsonWriter.name("error_info");
        this.nullablePartnerCheckResultErrorInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) partnerCheckResultDto2.getErrorInfo());
        jsonWriter.name("request_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) partnerCheckResultDto2.getRequestId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(PartnerCheckResultDto)");
    }
}
