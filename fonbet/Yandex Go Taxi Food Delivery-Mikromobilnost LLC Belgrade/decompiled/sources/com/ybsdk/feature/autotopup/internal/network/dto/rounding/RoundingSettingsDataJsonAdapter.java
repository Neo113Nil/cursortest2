package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.AutotopupWidgetSummaryDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingStatusDto;", "roundingStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDto;", "nullableAutotopupWidgetSummaryDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingOptionDto;", "listOfRoundingOptionDtoAdapter", "roundingOptionDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoundingSettingsDataJsonAdapter extends JsonAdapter<RoundingSettingsData> {
    private final JsonAdapter<List<RoundingOptionDto>> listOfRoundingOptionDtoAdapter;
    private final JsonAdapter<AutotopupWidgetSummaryDto> nullableAutotopupWidgetSummaryDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "summary", "top_divkit_widget", "available_rounding_steps", "selected_rounding_step");
    private final JsonAdapter<RoundingOptionDto> roundingOptionDtoAdapter;
    private final JsonAdapter<RoundingStatusDto> roundingStatusDtoAdapter;

    public RoundingSettingsDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.roundingStatusDtoAdapter = moshi.adapter(RoundingStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.nullableAutotopupWidgetSummaryDtoAdapter = moshi.adapter(AutotopupWidgetSummaryDto.class, emptySet, "summary");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "topDivkitWidget");
        this.listOfRoundingOptionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, RoundingOptionDto.class), emptySet, "availableRoundingOption");
        this.roundingOptionDtoAdapter = moshi.adapter(RoundingOptionDto.class, emptySet, "selectedRoundingStep");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RoundingSettingsData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RoundingStatusDto roundingStatusDto = null;
        AutotopupWidgetSummaryDto autotopupWidgetSummaryDto = null;
        DivDataDto divDataDto = null;
        List<RoundingOptionDto> list = null;
        RoundingOptionDto roundingOptionDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                roundingStatusDto = this.roundingStatusDtoAdapter.fromJson(jsonReader);
                if (roundingStatusDto == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                autotopupWidgetSummaryDto = this.nullableAutotopupWidgetSummaryDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                list = this.listOfRoundingOptionDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("availableRoundingOption", "available_rounding_steps", jsonReader);
                }
            } else if (selectName == 4 && (roundingOptionDto = this.roundingOptionDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("selectedRoundingStep", "selected_rounding_step", jsonReader);
            }
        }
        jsonReader.endObject();
        if (roundingStatusDto == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("availableRoundingOption", "available_rounding_steps", jsonReader);
        }
        if (roundingOptionDto != null) {
            return new RoundingSettingsData(roundingStatusDto, autotopupWidgetSummaryDto, divDataDto, list, roundingOptionDto);
        }
        throw Util.missingProperty("selectedRoundingStep", "selected_rounding_step", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RoundingSettingsData roundingSettingsData) {
        RoundingSettingsData roundingSettingsData2 = roundingSettingsData;
        if (roundingSettingsData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.roundingStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsData2.getStatus());
        jsonWriter.name("summary");
        this.nullableAutotopupWidgetSummaryDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsData2.getSummary());
        jsonWriter.name("top_divkit_widget");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsData2.getTopDivkitWidget());
        jsonWriter.name("available_rounding_steps");
        this.listOfRoundingOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsData2.getAvailableRoundingOption());
        jsonWriter.name("selected_rounding_step");
        this.roundingOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsData2.getSelectedRoundingStep());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(RoundingSettingsData)");
    }
}
