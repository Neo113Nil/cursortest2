package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupStatusDto;", "regularAutotopupStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupErrorDto;", "nullableRegularAutotopupErrorDtoAdapter", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupOptionDto;", "listOfRegularAutotopupOptionDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SelectedRegularAutotopupOptionDto;", "selectedRegularAutotopupOptionDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDto;", "nullableAutotopupWidgetSummaryDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupLimitsDataDto;", "regularAutotopupLimitsDataDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutotopupDataDtoJsonAdapter extends JsonAdapter<RegularAutotopupDataDto> {
    private final JsonAdapter<List<RegularAutotopupOptionDto>> listOfRegularAutotopupOptionDtoAdapter;
    private final JsonAdapter<AutotopupWidgetSummaryDto> nullableAutotopupWidgetSummaryDtoAdapter;
    private final JsonAdapter<RegularAutotopupErrorDto> nullableRegularAutotopupErrorDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "error", "available_autotopup_options", "selected_autotopup_option", "summary", "limits_data");
    private final JsonAdapter<RegularAutotopupLimitsDataDto> regularAutotopupLimitsDataDtoAdapter;
    private final JsonAdapter<RegularAutotopupStatusDto> regularAutotopupStatusDtoAdapter;
    private final JsonAdapter<SelectedRegularAutotopupOptionDto> selectedRegularAutotopupOptionDtoAdapter;

    public RegularAutotopupDataDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.regularAutotopupStatusDtoAdapter = moshi.adapter(RegularAutotopupStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.nullableRegularAutotopupErrorDtoAdapter = moshi.adapter(RegularAutotopupErrorDto.class, emptySet, "error");
        this.listOfRegularAutotopupOptionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, RegularAutotopupOptionDto.class), emptySet, "availableOptions");
        this.selectedRegularAutotopupOptionDtoAdapter = moshi.adapter(SelectedRegularAutotopupOptionDto.class, emptySet, "selectedOption");
        this.nullableAutotopupWidgetSummaryDtoAdapter = moshi.adapter(AutotopupWidgetSummaryDto.class, emptySet, "summary");
        this.regularAutotopupLimitsDataDtoAdapter = moshi.adapter(RegularAutotopupLimitsDataDto.class, emptySet, "limitsData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RegularAutotopupDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RegularAutotopupStatusDto regularAutotopupStatusDto = null;
        RegularAutotopupErrorDto regularAutotopupErrorDto = null;
        List<RegularAutotopupOptionDto> list = null;
        SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto = null;
        AutotopupWidgetSummaryDto autotopupWidgetSummaryDto = null;
        RegularAutotopupLimitsDataDto regularAutotopupLimitsDataDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    regularAutotopupStatusDto = this.regularAutotopupStatusDtoAdapter.fromJson(jsonReader);
                    if (regularAutotopupStatusDto == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    break;
                case 1:
                    regularAutotopupErrorDto = this.nullableRegularAutotopupErrorDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    list = this.listOfRegularAutotopupOptionDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("availableOptions", "available_autotopup_options", jsonReader);
                    }
                    break;
                case 3:
                    selectedRegularAutotopupOptionDto = this.selectedRegularAutotopupOptionDtoAdapter.fromJson(jsonReader);
                    if (selectedRegularAutotopupOptionDto == null) {
                        throw Util.unexpectedNull("selectedOption", "selected_autotopup_option", jsonReader);
                    }
                    break;
                case 4:
                    autotopupWidgetSummaryDto = this.nullableAutotopupWidgetSummaryDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    regularAutotopupLimitsDataDto = this.regularAutotopupLimitsDataDtoAdapter.fromJson(jsonReader);
                    if (regularAutotopupLimitsDataDto == null) {
                        throw Util.unexpectedNull("limitsData", "limits_data", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (regularAutotopupStatusDto == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("availableOptions", "available_autotopup_options", jsonReader);
        }
        if (selectedRegularAutotopupOptionDto == null) {
            throw Util.missingProperty("selectedOption", "selected_autotopup_option", jsonReader);
        }
        if (regularAutotopupLimitsDataDto != null) {
            return new RegularAutotopupDataDto(regularAutotopupStatusDto, regularAutotopupErrorDto, list, selectedRegularAutotopupOptionDto, autotopupWidgetSummaryDto, regularAutotopupLimitsDataDto);
        }
        throw Util.missingProperty("limitsData", "limits_data", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RegularAutotopupDataDto regularAutotopupDataDto) {
        RegularAutotopupDataDto regularAutotopupDataDto2 = regularAutotopupDataDto;
        if (regularAutotopupDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.regularAutotopupStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupDataDto2.getStatus());
        jsonWriter.name("error");
        this.nullableRegularAutotopupErrorDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupDataDto2.getError());
        jsonWriter.name("available_autotopup_options");
        this.listOfRegularAutotopupOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupDataDto2.getAvailableOptions());
        jsonWriter.name("selected_autotopup_option");
        this.selectedRegularAutotopupOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupDataDto2.getSelectedOption());
        jsonWriter.name("summary");
        this.nullableAutotopupWidgetSummaryDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupDataDto2.getSummary());
        jsonWriter.name("limits_data");
        this.regularAutotopupLimitsDataDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutotopupDataDto2.getLimitsData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(RegularAutotopupDataDto)");
    }
}
