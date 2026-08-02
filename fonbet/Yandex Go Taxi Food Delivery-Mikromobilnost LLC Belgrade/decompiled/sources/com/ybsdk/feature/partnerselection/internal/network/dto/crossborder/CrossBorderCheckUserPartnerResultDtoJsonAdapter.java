package com.ybsdk.feature.partnerselection.internal.network.dto.crossborder;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerResultDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto$Status;", "statusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerSuccessDto;", "nullableCrossBorderCheckUserPartnerSuccessDtoAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerErrorInfoDto;", "nullableCrossBorderCheckUserPartnerErrorInfoDtoAdapter", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossBorderCheckUserPartnerResultDtoJsonAdapter extends JsonAdapter<CrossBorderCheckUserPartnerResultDto> {
    private final JsonAdapter<CrossBorderCheckUserPartnerErrorInfoDto> nullableCrossBorderCheckUserPartnerErrorInfoDtoAdapter;
    private final JsonAdapter<CrossBorderCheckUserPartnerSuccessDto> nullableCrossBorderCheckUserPartnerSuccessDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "success_data", "error", "error_info", "request_id");
    private final JsonAdapter<CrossBorderCheckUserPartnerResultDto.Status> statusAdapter;

    public CrossBorderCheckUserPartnerResultDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.statusAdapter = moshi.adapter(CrossBorderCheckUserPartnerResultDto.Status.class, emptySet, ACSPConstants.STATUS);
        this.nullableCrossBorderCheckUserPartnerSuccessDtoAdapter = moshi.adapter(CrossBorderCheckUserPartnerSuccessDto.class, emptySet, "successData");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "error");
        this.nullableCrossBorderCheckUserPartnerErrorInfoDtoAdapter = moshi.adapter(CrossBorderCheckUserPartnerErrorInfoDto.class, emptySet, "errorInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CrossBorderCheckUserPartnerResultDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CrossBorderCheckUserPartnerResultDto.Status status = null;
        CrossBorderCheckUserPartnerSuccessDto crossBorderCheckUserPartnerSuccessDto = null;
        String str = null;
        CrossBorderCheckUserPartnerErrorInfoDto crossBorderCheckUserPartnerErrorInfoDto = null;
        String str2 = null;
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
                crossBorderCheckUserPartnerSuccessDto = this.nullableCrossBorderCheckUserPartnerSuccessDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                crossBorderCheckUserPartnerErrorInfoDto = this.nullableCrossBorderCheckUserPartnerErrorInfoDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (status != null) {
            return new CrossBorderCheckUserPartnerResultDto(status, crossBorderCheckUserPartnerSuccessDto, str, crossBorderCheckUserPartnerErrorInfoDto, str2);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CrossBorderCheckUserPartnerResultDto crossBorderCheckUserPartnerResultDto) {
        CrossBorderCheckUserPartnerResultDto crossBorderCheckUserPartnerResultDto2 = crossBorderCheckUserPartnerResultDto;
        if (crossBorderCheckUserPartnerResultDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerResultDto2.getStatus());
        jsonWriter.name("success_data");
        this.nullableCrossBorderCheckUserPartnerSuccessDtoAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerResultDto2.getSuccessData());
        jsonWriter.name("error");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerResultDto2.getError());
        jsonWriter.name("error_info");
        this.nullableCrossBorderCheckUserPartnerErrorInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerResultDto2.getErrorInfo());
        jsonWriter.name("request_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerResultDto2.getRequestId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(58, "GeneratedJsonAdapter(CrossBorderCheckUserPartnerResultDto)");
    }
}
