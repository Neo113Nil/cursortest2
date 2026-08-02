package com.ybsdk.core.common.data.network.dto;

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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDto;", "listOfCommunicationsShownInfoItemDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommunicationsShownInfoDtoJsonAdapter extends JsonAdapter<CommunicationsShownInfoDto> {
    private final JsonAdapter<List<CommunicationsShownInfoItemDto>> listOfCommunicationsShownInfoItemDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("items");

    public CommunicationsShownInfoDtoJsonAdapter(Moshi moshi) {
        this.listOfCommunicationsShownInfoItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, CommunicationsShownInfoItemDto.class), EmptySet.a, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CommunicationsShownInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<CommunicationsShownInfoItemDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = this.listOfCommunicationsShownInfoItemDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("items", "items", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new CommunicationsShownInfoDto(list);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CommunicationsShownInfoDto communicationsShownInfoDto) {
        CommunicationsShownInfoDto communicationsShownInfoDto2 = communicationsShownInfoDto;
        if (communicationsShownInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("items");
        this.listOfCommunicationsShownInfoItemDtoAdapter.toJson(jsonWriter, (JsonWriter) communicationsShownInfoDto2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(CommunicationsShownInfoDto)");
    }
}
