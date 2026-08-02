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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusSuccessResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusSuccessResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusDto;", "fundOperationRequestStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationSuccessDataDto;", "nullableFundOperationSuccessDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationInProgressDataDto;", "nullableFundOperationInProgressDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/FundResultDataDto;", "nullableFundResultDataDtoAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/FundNeedConfirmationDataDto;", "nullableFundNeedConfirmationDataDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundOperationRequestStatusSuccessResponseDtoJsonAdapter extends JsonAdapter<FundOperationRequestStatusSuccessResponseDto> {
    private final JsonAdapter<FundOperationRequestStatusDto> fundOperationRequestStatusDtoAdapter;
    private final JsonAdapter<FundNeedConfirmationDataDto> nullableFundNeedConfirmationDataDtoAdapter;
    private final JsonAdapter<FundOperationInProgressDataDto> nullableFundOperationInProgressDataDtoAdapter;
    private final JsonAdapter<FundOperationSuccessDataDto> nullableFundOperationSuccessDataDtoAdapter;
    private final JsonAdapter<FundResultDataDto> nullableFundResultDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "success_data", "in_progress_data", "result_data", "need_confirmation_data");

    public FundOperationRequestStatusSuccessResponseDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.fundOperationRequestStatusDtoAdapter = moshi.adapter(FundOperationRequestStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.nullableFundOperationSuccessDataDtoAdapter = moshi.adapter(FundOperationSuccessDataDto.class, emptySet, "successData");
        this.nullableFundOperationInProgressDataDtoAdapter = moshi.adapter(FundOperationInProgressDataDto.class, emptySet, "inProgressData");
        this.nullableFundResultDataDtoAdapter = moshi.adapter(FundResultDataDto.class, emptySet, "resultStatusData");
        this.nullableFundNeedConfirmationDataDtoAdapter = moshi.adapter(FundNeedConfirmationDataDto.class, emptySet, "needConfirmationData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FundOperationRequestStatusSuccessResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        FundOperationRequestStatusDto fundOperationRequestStatusDto = null;
        FundOperationSuccessDataDto fundOperationSuccessDataDto = null;
        FundOperationInProgressDataDto fundOperationInProgressDataDto = null;
        FundResultDataDto fundResultDataDto = null;
        FundNeedConfirmationDataDto fundNeedConfirmationDataDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                fundOperationRequestStatusDto = this.fundOperationRequestStatusDtoAdapter.fromJson(jsonReader);
                if (fundOperationRequestStatusDto == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                fundOperationSuccessDataDto = this.nullableFundOperationSuccessDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                fundOperationInProgressDataDto = this.nullableFundOperationInProgressDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                fundResultDataDto = this.nullableFundResultDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                fundNeedConfirmationDataDto = this.nullableFundNeedConfirmationDataDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (fundOperationRequestStatusDto != null) {
            return new FundOperationRequestStatusSuccessResponseDto(fundOperationRequestStatusDto, fundOperationSuccessDataDto, fundOperationInProgressDataDto, fundResultDataDto, fundNeedConfirmationDataDto);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FundOperationRequestStatusSuccessResponseDto fundOperationRequestStatusSuccessResponseDto) {
        FundOperationRequestStatusSuccessResponseDto fundOperationRequestStatusSuccessResponseDto2 = fundOperationRequestStatusSuccessResponseDto;
        if (fundOperationRequestStatusSuccessResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.fundOperationRequestStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) fundOperationRequestStatusSuccessResponseDto2.getStatus());
        jsonWriter.name("success_data");
        this.nullableFundOperationSuccessDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundOperationRequestStatusSuccessResponseDto2.getSuccessData());
        jsonWriter.name("in_progress_data");
        this.nullableFundOperationInProgressDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundOperationRequestStatusSuccessResponseDto2.getInProgressData());
        jsonWriter.name("result_data");
        this.nullableFundResultDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundOperationRequestStatusSuccessResponseDto2.getResultStatusData());
        jsonWriter.name("need_confirmation_data");
        this.nullableFundNeedConfirmationDataDtoAdapter.toJson(jsonWriter, (JsonWriter) fundOperationRequestStatusSuccessResponseDto2.getNeedConfirmationData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(66, "GeneratedJsonAdapter(FundOperationRequestStatusSuccessResponseDto)");
    }
}
