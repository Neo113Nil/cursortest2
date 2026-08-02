package com.ybsdk.rconfig.configs;

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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2Config;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPosition;", "tsarButtonGradientV2OffsetPositionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2Component;", "listOfTsarButtonGradientV2ComponentAdapter", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2AnimationSettings;", "nullableTsarButtonGradientV2AnimationSettingsAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TsarButtonGradientV2ConfigJsonAdapter extends JsonAdapter<TsarButtonGradientV2Config> {
    private final JsonAdapter<List<TsarButtonGradientV2Component>> listOfTsarButtonGradientV2ComponentAdapter;
    private final JsonAdapter<TsarButtonGradientV2AnimationSettings> nullableTsarButtonGradientV2AnimationSettingsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("offset", "components", "animation_settings");
    private final JsonAdapter<TsarButtonGradientV2OffsetPosition> tsarButtonGradientV2OffsetPositionAdapter;

    public TsarButtonGradientV2ConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.tsarButtonGradientV2OffsetPositionAdapter = moshi.adapter(TsarButtonGradientV2OffsetPosition.class, emptySet, "gradientOffsetPosition");
        this.listOfTsarButtonGradientV2ComponentAdapter = moshi.adapter(Types.newParameterizedType(List.class, TsarButtonGradientV2Component.class), emptySet, "components");
        this.nullableTsarButtonGradientV2AnimationSettingsAdapter = moshi.adapter(TsarButtonGradientV2AnimationSettings.class, emptySet, "animationSettings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TsarButtonGradientV2Config fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TsarButtonGradientV2OffsetPosition tsarButtonGradientV2OffsetPosition = null;
        List<TsarButtonGradientV2Component> list = null;
        TsarButtonGradientV2AnimationSettings tsarButtonGradientV2AnimationSettings = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                tsarButtonGradientV2OffsetPosition = this.tsarButtonGradientV2OffsetPositionAdapter.fromJson(jsonReader);
                if (tsarButtonGradientV2OffsetPosition == null) {
                    throw Util.unexpectedNull("gradientOffsetPosition", "offset", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfTsarButtonGradientV2ComponentAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("components", "components", jsonReader);
                }
            } else if (selectName == 2) {
                tsarButtonGradientV2AnimationSettings = this.nullableTsarButtonGradientV2AnimationSettingsAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (tsarButtonGradientV2OffsetPosition == null) {
            throw Util.missingProperty("gradientOffsetPosition", "offset", jsonReader);
        }
        if (list != null) {
            return new TsarButtonGradientV2Config(tsarButtonGradientV2OffsetPosition, list, tsarButtonGradientV2AnimationSettings);
        }
        throw Util.missingProperty("components", "components", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TsarButtonGradientV2Config tsarButtonGradientV2Config) {
        TsarButtonGradientV2Config tsarButtonGradientV2Config2 = tsarButtonGradientV2Config;
        if (tsarButtonGradientV2Config2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("offset");
        this.tsarButtonGradientV2OffsetPositionAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonGradientV2Config2.getGradientOffsetPosition());
        jsonWriter.name("components");
        this.listOfTsarButtonGradientV2ComponentAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonGradientV2Config2.getComponents());
        jsonWriter.name("animation_settings");
        this.nullableTsarButtonGradientV2AnimationSettingsAdapter.toJson(jsonWriter, (JsonWriter) tsarButtonGradientV2Config2.getAnimationSettings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(TsarButtonGradientV2Config)");
    }
}
