package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CommonSheetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CommonSheetButton;", "commonSheetButtonAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonSheetJsonAdapter extends JsonAdapter<CommonSheet> {
    private final JsonAdapter<CommonSheetButton> commonSheetButtonAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "primary_button");
    private final JsonAdapter<String> stringAdapter;

    public CommonSheetJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.commonSheetButtonAdapter = moshi.adapter(CommonSheetButton.class, emptySet, "primaryButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CommonSheet fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        CommonSheetButton commonSheetButton = null;
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
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
            } else if (selectName == 2 && (commonSheetButton = this.commonSheetButtonAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("primaryButton", "primary_button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
        }
        if (commonSheetButton != null) {
            return new CommonSheet(str, str2, commonSheetButton);
        }
        throw Util.missingProperty("primaryButton", "primary_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CommonSheet commonSheet) {
        CommonSheet commonSheet2 = commonSheet;
        if (commonSheet2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) commonSheet2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) commonSheet2.getDescription());
        jsonWriter.name("primary_button");
        this.commonSheetButtonAdapter.toJson(jsonWriter, (JsonWriter) commonSheet2.getPrimaryButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(CommonSheet)");
    }
}
