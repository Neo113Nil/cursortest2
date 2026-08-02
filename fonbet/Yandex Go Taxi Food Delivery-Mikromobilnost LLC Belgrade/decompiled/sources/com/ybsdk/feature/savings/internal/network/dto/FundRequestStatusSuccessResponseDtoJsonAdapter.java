package com.ybsdk.feature.savings.internal.network.dto;

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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusDto;", "fundRequestStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusSuccessDataDto;", "nullableFundRequestStatusSuccessDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusInProgressDataDto;", "nullableFundRequestStatusInProgressDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusResultDataDto;", "nullableFundRequestStatusResultDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusOpenAndTopupDataDto;", "nullableFundRequestStatusOpenAndTopupDataDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundRequestStatusSuccessResponseDtoJsonAdapter extends JsonAdapter<FundRequestStatusSuccessResponseDto> {
    private final JsonAdapter<FundRequestStatusDto> fundRequestStatusDtoAdapter;
    private final JsonAdapter<FundRequestStatusInProgressDataDto> nullableFundRequestStatusInProgressDataDtoAdapter;
    private final JsonAdapter<FundRequestStatusOpenAndTopupDataDto> nullableFundRequestStatusOpenAndTopupDataDtoAdapter;
    private final JsonAdapter<FundRequestStatusResultDataDto> nullableFundRequestStatusResultDataDtoAdapter;
    private final JsonAdapter<FundRequestStatusSuccessDataDto> nullableFundRequestStatusSuccessDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "success_data", "in_progress_data", "result_status_data", "open_and_topup_data");

    public FundRequestStatusSuccessResponseDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.fundRequestStatusDtoAdapter = moshi.adapter(FundRequestStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.nullableFundRequestStatusSuccessDataDtoAdapter = moshi.adapter(FundRequestStatusSuccessDataDto.class, emptySet, "successData");
        this.nullableFundRequestStatusInProgressDataDtoAdapter = moshi.adapter(FundRequestStatusInProgressDataDto.class, emptySet, "inProgressData");
        this.nullableFundRequestStatusResultDataDtoAdapter = moshi.adapter(FundRequestStatusResultDataDto.class, emptySet, "resultStatusData");
        this.nullableFundRequestStatusOpenAndTopupDataDtoAdapter = moshi.adapter(FundRequestStatusOpenAndTopupDataDto.class, emptySet, "openAndTopupData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FundRequestStatusSuccessResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        FundRequestStatusDto fundRequestStatusDto = null;
        FundRequestStatusSuccessDataDto fundRequestStatusSuccessDataDto = null;
        FundRequestStatusInProgressDataDto fundRequestStatusInProgressDataDto = null;
        FundRequestStatusResultDataDto fundRequestStatusResultDataDto = null;
        FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                fundRequestStatusDto = this.fundRequestStatusDtoAdapter.fromJson(jsonReader);
                if (fundRequestStatusDto == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                fundRequestStatusSuccessDataDto = this.nullableFundRequestStatusSuccessDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                fundRequestStatusInProgressDataDto = this.nullableFundRequestStatusInProgressDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                fundRequestStatusResultDataDto = this.nullableFundRequestStatusResultDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                fundRequestStatusOpenAndTopupDataDto = this.nullableFundRequestStatusOpenAndTopupDataDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (fundRequestStatusDto != null) {
            return new FundRequestStatusSuccessResponseDto(fundRequestStatusDto, fundRequestStatusSuccessDataDto, fundRequestStatusInProgressDataDto, fundRequestStatusResultDataDto, fundRequestStatusOpenAndTopupDataDto);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FundRequestStatusSuccessResponseDto fundRequestStatusSuccessResponseDto) {
        FundRequestStatusSuccessResponseDto fundRequestStatusSuccessResponseDto2 = fundRequestStatusSuccessResponseDto;
        if (fundRequestStatusSuccessResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.fundRequestStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusSuccessResponseDto2.getStatus());
        jsonWriter.name("success_data");
        this.nullableFundRequestStatusSuccessDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusSuccessResponseDto2.getSuccessData());
        jsonWriter.name("in_progress_data");
        this.nullableFundRequestStatusInProgressDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusSuccessResponseDto2.getInProgressData());
        jsonWriter.name("result_status_data");
        this.nullableFundRequestStatusResultDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusSuccessResponseDto2.getResultStatusData());
        jsonWriter.name("open_and_topup_data");
        this.nullableFundRequestStatusOpenAndTopupDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundRequestStatusSuccessResponseDto2.getOpenAndTopupData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(57, "GeneratedJsonAdapter(FundRequestStatusSuccessResponseDto)");
    }
}
