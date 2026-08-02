package com.ybsdk.feature.split.deposit.internal.data.network.dto;

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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatusScreenDataJsonAdapter extends JsonAdapter<StatusScreenData> {
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "bottom_divkit_data", "close_action");
    private final JsonAdapter<String> stringAdapter;

    public StatusScreenDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "bottomDivKitData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StatusScreenData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        DivDataDto divDataDto = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new StatusScreenData(str, str2, divDataDto, str3);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StatusScreenData statusScreenData) {
        StatusScreenData statusScreenData2 = statusScreenData;
        if (statusScreenData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) statusScreenData2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) statusScreenData2.getSubtitle());
        jsonWriter.name("bottom_divkit_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) statusScreenData2.getBottomDivKitData());
        jsonWriter.name("close_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) statusScreenData2.getCloseAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(StatusScreenData)");
    }
}
