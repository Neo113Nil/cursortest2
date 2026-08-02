package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoItemDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDto$CommunicationTypeDto;", "communicationTypeDtoAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommunicationsShownInfoItemDtoJsonAdapter extends JsonAdapter<CommunicationsShownInfoItemDto> {
    private final JsonAdapter<CommunicationsShownInfoItemDto.CommunicationTypeDto> communicationTypeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("defaults_group", "event_id", MetaDataField.SCREEN_FIELD, "type");
    private final JsonAdapter<String> stringAdapter;

    public CommunicationsShownInfoItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "defaultsGroup");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "eventId");
        this.communicationTypeDtoAdapter = moshi.adapter(CommunicationsShownInfoItemDto.CommunicationTypeDto.class, emptySet, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CommunicationsShownInfoItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        CommunicationsShownInfoItemDto.CommunicationTypeDto communicationTypeDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("eventId", "event_id", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull(MetaDataField.SCREEN_FIELD, MetaDataField.SCREEN_FIELD, jsonReader);
                }
            } else if (selectName == 3 && (communicationTypeDto = this.communicationTypeDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("type", "type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            throw Util.missingProperty("eventId", "event_id", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty(MetaDataField.SCREEN_FIELD, MetaDataField.SCREEN_FIELD, jsonReader);
        }
        if (communicationTypeDto != null) {
            return new CommunicationsShownInfoItemDto(str, str2, str3, communicationTypeDto);
        }
        throw Util.missingProperty("type", "type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CommunicationsShownInfoItemDto communicationsShownInfoItemDto) {
        CommunicationsShownInfoItemDto communicationsShownInfoItemDto2 = communicationsShownInfoItemDto;
        if (communicationsShownInfoItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("defaults_group");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) communicationsShownInfoItemDto2.getDefaultsGroup());
        jsonWriter.name("event_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) communicationsShownInfoItemDto2.getEventId());
        jsonWriter.name(MetaDataField.SCREEN_FIELD);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) communicationsShownInfoItemDto2.getScreen());
        jsonWriter.name("type");
        this.communicationTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) communicationsShownInfoItemDto2.getType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(CommunicationsShownInfoItemDto)");
    }
}
