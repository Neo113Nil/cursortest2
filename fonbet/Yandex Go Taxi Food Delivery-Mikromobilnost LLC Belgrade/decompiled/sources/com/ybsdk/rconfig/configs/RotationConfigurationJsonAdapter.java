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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/configs/RotationConfigurationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/RotationConfiguration;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "", "nullableFloatAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RotationConfigurationJsonAdapter extends JsonAdapter<RotationConfiguration> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("time_window", "start_range_for_first_lean", "start_range_for_return_lean", "accelerometer_fallback_enabled", "accelerometer_alpha");

    public RotationConfigurationJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "timeWindowMs");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "accelerometerFallbackEnabled");
        this.nullableFloatAdapter = moshi.adapter(Float.class, emptySet, "accelerometerAlpha");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RotationConfiguration fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool = null;
        Float f = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("timeWindowMs", "time_window", jsonReader);
                }
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("startRangeForFirstLean", "start_range_for_first_lean", jsonReader);
                }
            } else if (selectName == 2) {
                num3 = this.intAdapter.fromJson(jsonReader);
                if (num3 == null) {
                    throw Util.unexpectedNull("startRangeForReturnLean", "start_range_for_return_lean", jsonReader);
                }
            } else if (selectName == 3) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                f = this.nullableFloatAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("timeWindowMs", "time_window", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw Util.missingProperty("startRangeForFirstLean", "start_range_for_first_lean", jsonReader);
        }
        int intValue2 = num2.intValue();
        if (num3 != null) {
            return new RotationConfiguration(intValue, intValue2, num3.intValue(), bool, f);
        }
        throw Util.missingProperty("startRangeForReturnLean", "start_range_for_return_lean", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RotationConfiguration rotationConfiguration) {
        RotationConfiguration rotationConfiguration2 = rotationConfiguration;
        if (rotationConfiguration2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("time_window");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(rotationConfiguration2.getTimeWindowMs()));
        jsonWriter.name("start_range_for_first_lean");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(rotationConfiguration2.getStartRangeForFirstLean()));
        jsonWriter.name("start_range_for_return_lean");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(rotationConfiguration2.getStartRangeForReturnLean()));
        jsonWriter.name("accelerometer_fallback_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) rotationConfiguration2.getAccelerometerFallbackEnabled());
        jsonWriter.name("accelerometer_alpha");
        this.nullableFloatAdapter.toJson(jsonWriter, (JsonWriter) rotationConfiguration2.getAccelerometerAlpha());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(RotationConfiguration)");
    }
}
