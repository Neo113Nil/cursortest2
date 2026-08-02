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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/AnimationKeyframeConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/AnimationKeyframeConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "floatAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AnimationKeyframeConfigJsonAdapter extends JsonAdapter<AnimationKeyframeConfig> {
    private final JsonAdapter<Float> floatAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("progress", "center_x_fraction", "center_y_fraction", "radius_fraction");

    public AnimationKeyframeConfigJsonAdapter(Moshi moshi) {
        this.floatAdapter = moshi.adapter(Float.TYPE, EmptySet.a, "progress");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AnimationKeyframeConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                f = this.floatAdapter.fromJson(jsonReader);
                if (f == null) {
                    throw Util.unexpectedNull("progress", "progress", jsonReader);
                }
            } else if (selectName == 1) {
                f2 = this.floatAdapter.fromJson(jsonReader);
                if (f2 == null) {
                    throw Util.unexpectedNull("centerXFraction", "center_x_fraction", jsonReader);
                }
            } else if (selectName == 2) {
                f3 = this.floatAdapter.fromJson(jsonReader);
                if (f3 == null) {
                    throw Util.unexpectedNull("centerYFraction", "center_y_fraction", jsonReader);
                }
            } else if (selectName == 3 && (f4 = this.floatAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("radiusFraction", "radius_fraction", jsonReader);
            }
        }
        jsonReader.endObject();
        if (f == null) {
            throw Util.missingProperty("progress", "progress", jsonReader);
        }
        float floatValue = f.floatValue();
        if (f2 == null) {
            throw Util.missingProperty("centerXFraction", "center_x_fraction", jsonReader);
        }
        float floatValue2 = f2.floatValue();
        if (f3 == null) {
            throw Util.missingProperty("centerYFraction", "center_y_fraction", jsonReader);
        }
        float floatValue3 = f3.floatValue();
        if (f4 != null) {
            return new AnimationKeyframeConfig(floatValue, floatValue2, floatValue3, f4.floatValue());
        }
        throw Util.missingProperty("radiusFraction", "radius_fraction", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AnimationKeyframeConfig animationKeyframeConfig) {
        AnimationKeyframeConfig animationKeyframeConfig2 = animationKeyframeConfig;
        if (animationKeyframeConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("progress");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(animationKeyframeConfig2.getProgress()));
        jsonWriter.name("center_x_fraction");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(animationKeyframeConfig2.getCenterXFraction()));
        jsonWriter.name("center_y_fraction");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(animationKeyframeConfig2.getCenterYFraction()));
        jsonWriter.name("radius_fraction");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(animationKeyframeConfig2.getRadiusFraction()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(AnimationKeyframeConfig)");
    }
}
