package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_FunFactDivItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactDivItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_FunFactDivItemJsonAdapter extends JsonAdapter<PfmResponse.FunFactDivItem> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("log_id", "div_json");
    private final JsonAdapter<String> stringAdapter;

    public PfmResponse_FunFactDivItemJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "logId");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divJson");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse.FunFactDivItem fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        DivDataDto divDataDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("logId", "log_id", jsonReader);
                }
            } else if (selectName == 1 && (divDataDto = this.divDataDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("divJson", "div_json", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("logId", "log_id", jsonReader);
        }
        if (divDataDto != null) {
            return new PfmResponse.FunFactDivItem(str, divDataDto);
        }
        throw Util.missingProperty("divJson", "div_json", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse.FunFactDivItem funFactDivItem) {
        PfmResponse.FunFactDivItem funFactDivItem2 = funFactDivItem;
        if (funFactDivItem2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("log_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) funFactDivItem2.getLogId());
        jsonWriter.name("div_json");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) funFactDivItem2.getDivJson());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(PfmResponse.FunFactDivItem)");
    }
}
