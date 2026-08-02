package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPositionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPosition;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "floatAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TsarButtonGradientV2OffsetPositionJsonAdapter extends JsonAdapter<TsarButtonGradientV2OffsetPosition> {
    private final JsonAdapter<Float> floatAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("offset_x", "offset_y");

    public TsarButtonGradientV2OffsetPositionJsonAdapter(Moshi moshi) {
        this.floatAdapter = moshi.adapter(Float.TYPE, EmptySet.a, "offsetX");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TsarButtonGradientV2OffsetPosition fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Float f = null;
        Float f2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                f = this.floatAdapter.fromJson(jsonReader);
                if (f == null) {
                    throw Util.unexpectedNull("offsetX", "offset_x", jsonReader);
                }
            } else if (selectName == 1 && (f2 = this.floatAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("offsetY", "offset_y", jsonReader);
            }
        }
        jsonReader.endObject();
        if (f == null) {
            throw Util.missingProperty("offsetX", "offset_x", jsonReader);
        }
        float floatValue = f.floatValue();
        if (f2 != null) {
            return new TsarButtonGradientV2OffsetPosition(floatValue, f2.floatValue());
        }
        throw Util.missingProperty("offsetY", "offset_y", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TsarButtonGradientV2OffsetPosition tsarButtonGradientV2OffsetPosition) {
        TsarButtonGradientV2OffsetPosition tsarButtonGradientV2OffsetPosition2 = tsarButtonGradientV2OffsetPosition;
        if (tsarButtonGradientV2OffsetPosition2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("offset_x");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(tsarButtonGradientV2OffsetPosition2.getOffsetX()));
        jsonWriter.name("offset_y");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(tsarButtonGradientV2OffsetPosition2.getOffsetY()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(TsarButtonGradientV2OffsetPosition)");
    }
}
