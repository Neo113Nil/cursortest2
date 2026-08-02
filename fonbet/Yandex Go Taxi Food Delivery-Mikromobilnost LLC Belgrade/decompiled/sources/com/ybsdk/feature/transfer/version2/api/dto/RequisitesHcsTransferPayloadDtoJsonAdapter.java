package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferPayloadDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferPayloadDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferFieldsDto;", "requisitesHcsTransferFieldsDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequisitesHcsTransferPayloadDtoJsonAdapter extends JsonAdapter<RequisitesHcsTransferPayloadDto> {
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("validation", "divkit_widget");
    private final JsonAdapter<RequisitesHcsTransferFieldsDto> requisitesHcsTransferFieldsDtoAdapter;

    public RequisitesHcsTransferPayloadDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.requisitesHcsTransferFieldsDtoAdapter = moshi.adapter(RequisitesHcsTransferFieldsDto.class, emptySet, "validation");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitWidget");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RequisitesHcsTransferPayloadDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RequisitesHcsTransferFieldsDto requisitesHcsTransferFieldsDto = null;
        DivDataDto divDataDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                requisitesHcsTransferFieldsDto = this.requisitesHcsTransferFieldsDtoAdapter.fromJson(jsonReader);
                if (requisitesHcsTransferFieldsDto == null) {
                    throw Util.unexpectedNull("validation", "validation", jsonReader);
                }
            } else if (selectName == 1) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (requisitesHcsTransferFieldsDto != null) {
            return new RequisitesHcsTransferPayloadDto(requisitesHcsTransferFieldsDto, divDataDto);
        }
        throw Util.missingProperty("validation", "validation", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RequisitesHcsTransferPayloadDto requisitesHcsTransferPayloadDto) {
        RequisitesHcsTransferPayloadDto requisitesHcsTransferPayloadDto2 = requisitesHcsTransferPayloadDto;
        if (requisitesHcsTransferPayloadDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("validation");
        this.requisitesHcsTransferFieldsDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferPayloadDto2.getValidation());
        jsonWriter.name("divkit_widget");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) requisitesHcsTransferPayloadDto2.getDivkitWidget());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(RequisitesHcsTransferPayloadDto)");
    }
}
