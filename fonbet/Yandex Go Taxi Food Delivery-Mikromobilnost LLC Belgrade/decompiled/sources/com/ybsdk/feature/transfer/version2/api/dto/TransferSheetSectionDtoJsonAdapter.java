package com.ybsdk.feature.transfer.version2.api.dto;

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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/TransferSheetSectionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/TransferSheetSectionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "Lcom/ybsdk/feature/transfer/version2/api/dto/TransferSheetItemDto;", "listOfTransferSheetItemDtoAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferSheetSectionDtoJsonAdapter extends JsonAdapter<TransferSheetSectionDto> {
    private final JsonAdapter<List<TransferSheetItemDto>> listOfTransferSheetItemDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "title", "items");
    private final JsonAdapter<String> stringAdapter;

    public TransferSheetSectionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.listOfTransferSheetItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, TransferSheetItemDto.class), emptySet, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferSheetSectionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        List<TransferSheetItemDto> list = null;
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
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2 && (list = this.listOfTransferSheetItemDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("items", "items", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (list != null) {
            return new TransferSheetSectionDto(str, str2, list);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferSheetSectionDto transferSheetSectionDto) {
        TransferSheetSectionDto transferSheetSectionDto2 = transferSheetSectionDto;
        if (transferSheetSectionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transferSheetSectionDto2.getType());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferSheetSectionDto2.getTitle());
        jsonWriter.name("items");
        this.listOfTransferSheetItemDtoAdapter.toJson(jsonWriter, (JsonWriter) transferSheetSectionDto2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(TransferSheetSectionDto)");
    }
}
