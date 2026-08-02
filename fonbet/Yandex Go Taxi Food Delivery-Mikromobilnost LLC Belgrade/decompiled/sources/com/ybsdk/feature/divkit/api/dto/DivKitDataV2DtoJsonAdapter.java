package com.ybsdk.feature.divkit.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/divkit/api/dto/DivKitDataV2DtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivKitDataV2Dto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "nullableListOfDataEntryDescriptorDtoAdapter", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivKitDataV2DtoJsonAdapter extends JsonAdapter<DivKitDataV2Dto> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<List<DataEntryDescriptorDto>> nullableListOfDataEntryDescriptorDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(Constants.KEY_DATA, "variables");

    public DivKitDataV2DtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, Constants.KEY_DATA);
        this.nullableListOfDataEntryDescriptorDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DataEntryDescriptorDto.class), emptySet, "variables");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DivKitDataV2Dto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivDataDto divDataDto = null;
        List<DataEntryDescriptorDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                if (divDataDto == null) {
                    throw Util.unexpectedNull("data_", Constants.KEY_DATA, jsonReader);
                }
            } else if (selectName == 1) {
                list = this.nullableListOfDataEntryDescriptorDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (divDataDto != null) {
            return new DivKitDataV2Dto(divDataDto, list);
        }
        throw Util.missingProperty("data_", Constants.KEY_DATA, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DivKitDataV2Dto divKitDataV2Dto) {
        DivKitDataV2Dto divKitDataV2Dto2 = divKitDataV2Dto;
        if (divKitDataV2Dto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(Constants.KEY_DATA);
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) divKitDataV2Dto2.getData());
        jsonWriter.name("variables");
        this.nullableListOfDataEntryDescriptorDtoAdapter.toJson(jsonWriter, (JsonWriter) divKitDataV2Dto2.getVariables());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(DivKitDataV2Dto)");
    }
}
