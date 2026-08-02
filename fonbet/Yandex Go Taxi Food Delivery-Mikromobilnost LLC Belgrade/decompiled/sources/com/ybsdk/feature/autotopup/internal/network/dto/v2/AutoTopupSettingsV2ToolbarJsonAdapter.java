package com.ybsdk.feature.autotopup.internal.network.dto.v2;

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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ToolbarJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Toolbar;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsV2ToolbarJsonAdapter extends JsonAdapter<AutoTopupSettingsV2Toolbar> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("divkit_block_center", "divkit_block_right");

    public AutoTopupSettingsV2ToolbarJsonAdapter(Moshi moshi) {
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, EmptySet.a, "divkitBlockCenter");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupSettingsV2Toolbar fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DivDataDto divDataDto = null;
        DivDataDto divDataDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                if (divDataDto == null) {
                    throw Util.unexpectedNull("divkitBlockCenter", "divkit_block_center", jsonReader);
                }
            } else if (selectName == 1 && (divDataDto2 = this.divDataDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("divkitBlockRight", "divkit_block_right", jsonReader);
            }
        }
        jsonReader.endObject();
        if (divDataDto == null) {
            throw Util.missingProperty("divkitBlockCenter", "divkit_block_center", jsonReader);
        }
        if (divDataDto2 != null) {
            return new AutoTopupSettingsV2Toolbar(divDataDto, divDataDto2);
        }
        throw Util.missingProperty("divkitBlockRight", "divkit_block_right", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar) {
        AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar2 = autoTopupSettingsV2Toolbar;
        if (autoTopupSettingsV2Toolbar2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("divkit_block_center");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Toolbar2.getDivkitBlockCenter());
        jsonWriter.name("divkit_block_right");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2Toolbar2.getDivkitBlockRight());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(AutoTopupSettingsV2Toolbar)");
    }
}
