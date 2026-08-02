package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/rconfig/configs/RadialGradientLayerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/RadialGradientLayer;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/rconfig/configs/GradientColorStop;", "listOfGradientColorStopAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "floatAdapter", "Lcom/ybsdk/rconfig/configs/AnimationKeyframeConfig;", "nullableListOfAnimationKeyframeConfigAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadialGradientLayerJsonAdapter extends JsonAdapter<RadialGradientLayer> {
    private final JsonAdapter<Float> floatAdapter;
    private final JsonAdapter<List<GradientColorStop>> listOfGradientColorStopAdapter;
    private final JsonAdapter<List<AnimationKeyframeConfig>> nullableListOfAnimationKeyframeConfigAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("colors_stops", "center_x_fraction", "center_y_fraction", "radius_fraction", "keyframes");

    public RadialGradientLayerJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, GradientColorStop.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfGradientColorStopAdapter = moshi.adapter(newParameterizedType, emptySet, "colorStops");
        this.floatAdapter = moshi.adapter(Float.TYPE, emptySet, "centerXFraction");
        this.nullableListOfAnimationKeyframeConfigAdapter = moshi.adapter(Types.newParameterizedType(List.class, AnimationKeyframeConfig.class), emptySet, "keyframes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RadialGradientLayer fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Float f = null;
        Float f2 = null;
        List<GradientColorStop> list = null;
        Float f3 = null;
        List<AnimationKeyframeConfig> list2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            Float f4 = f;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfGradientColorStopAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("colorStops", "colors_stops", jsonReader);
                }
            } else if (selectName == 1) {
                f = this.floatAdapter.fromJson(jsonReader);
                if (f == null) {
                    throw Util.unexpectedNull("centerXFraction", "center_x_fraction", jsonReader);
                }
            } else if (selectName == 2) {
                f2 = this.floatAdapter.fromJson(jsonReader);
                if (f2 == null) {
                    throw Util.unexpectedNull("centerYFraction", "center_y_fraction", jsonReader);
                }
            } else if (selectName == 3) {
                f3 = this.floatAdapter.fromJson(jsonReader);
                if (f3 == null) {
                    throw Util.unexpectedNull("radiusFraction", "radius_fraction", jsonReader);
                }
            } else if (selectName == 4) {
                list2 = this.nullableListOfAnimationKeyframeConfigAdapter.fromJson(jsonReader);
            }
            f = f4;
        }
        Float f5 = f;
        jsonReader.endObject();
        Float f6 = f2;
        if (list == null) {
            throw Util.missingProperty("colorStops", "colors_stops", jsonReader);
        }
        if (f5 == null) {
            throw Util.missingProperty("centerXFraction", "center_x_fraction", jsonReader);
        }
        float floatValue = f5.floatValue();
        if (f6 == null) {
            throw Util.missingProperty("centerYFraction", "center_y_fraction", jsonReader);
        }
        float floatValue2 = f6.floatValue();
        if (f3 != null) {
            return new RadialGradientLayer(list, floatValue, floatValue2, f3.floatValue(), list2);
        }
        throw Util.missingProperty("radiusFraction", "radius_fraction", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RadialGradientLayer radialGradientLayer) {
        RadialGradientLayer radialGradientLayer2 = radialGradientLayer;
        if (radialGradientLayer2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("colors_stops");
        this.listOfGradientColorStopAdapter.toJson(jsonWriter, (JsonWriter) radialGradientLayer2.getColorStops());
        jsonWriter.name("center_x_fraction");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(radialGradientLayer2.getCenterXFraction()));
        jsonWriter.name("center_y_fraction");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(radialGradientLayer2.getCenterYFraction()));
        jsonWriter.name("radius_fraction");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(radialGradientLayer2.getRadiusFraction()));
        jsonWriter.name("keyframes");
        this.nullableListOfAnimationKeyframeConfigAdapter.toJson(jsonWriter, (JsonWriter) radialGradientLayer2.getKeyframes());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(RadialGradientLayer)");
    }
}
