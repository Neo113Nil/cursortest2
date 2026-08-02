package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/SectionsSheetPayloadDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/SectionsSheetPayloadDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/transfer/version2/api/dto/TransferSheetSectionDto;", "listOfTransferSheetSectionDtoAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SectionsSheetPayloadDtoJsonAdapter extends JsonAdapter<SectionsSheetPayloadDto> {
    private final JsonAdapter<List<TransferSheetSectionDto>> listOfTransferSheetSectionDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("empty_state_div", "header_widget_div", "sections");

    public SectionsSheetPayloadDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "emptyStateDiv");
        this.listOfTransferSheetSectionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, TransferSheetSectionDto.class), emptySet, "sections");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SectionsSheetPayloadDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivDataDto divDataDto = null;
        DivDataDto divDataDto2 = null;
        List<TransferSheetSectionDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                divDataDto2 = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (list = this.listOfTransferSheetSectionDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("sections", "sections", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new SectionsSheetPayloadDto(divDataDto, divDataDto2, list);
        }
        throw Util.missingProperty("sections", "sections", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SectionsSheetPayloadDto sectionsSheetPayloadDto) {
        SectionsSheetPayloadDto sectionsSheetPayloadDto2 = sectionsSheetPayloadDto;
        if (sectionsSheetPayloadDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("empty_state_div");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) sectionsSheetPayloadDto2.getEmptyStateDiv());
        jsonWriter.name("header_widget_div");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) sectionsSheetPayloadDto2.getHeaderWidgetDiv());
        jsonWriter.name("sections");
        this.listOfTransferSheetSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) sectionsSheetPayloadDto2.getSections());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(SectionsSheetPayloadDto)");
    }
}
