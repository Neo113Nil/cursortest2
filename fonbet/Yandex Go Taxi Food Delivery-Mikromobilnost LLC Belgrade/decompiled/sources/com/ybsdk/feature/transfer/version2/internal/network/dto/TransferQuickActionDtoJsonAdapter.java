package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferQuickActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferQuickActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferQuickActionDtoJsonAdapter extends JsonAdapter<TransferQuickActionDto> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "actions", "icon");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public TransferQuickActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "actions");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "icon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferQuickActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<String> list = null;
        Themes<String> themes = null;
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
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("actions", "actions", jsonReader);
                }
            } else if (selectName == 2 && (themes = this.themesOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("icon", "icon", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("actions", "actions", jsonReader);
        }
        if (themes != null) {
            return new TransferQuickActionDto(str, list, themes);
        }
        throw Util.missingProperty("icon", "icon", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferQuickActionDto transferQuickActionDto) {
        TransferQuickActionDto transferQuickActionDto2 = transferQuickActionDto;
        if (transferQuickActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferQuickActionDto2.getTitle());
        jsonWriter.name("actions");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) transferQuickActionDto2.getActions());
        jsonWriter.name("icon");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) transferQuickActionDto2.getIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(TransferQuickActionDto)");
    }
}
