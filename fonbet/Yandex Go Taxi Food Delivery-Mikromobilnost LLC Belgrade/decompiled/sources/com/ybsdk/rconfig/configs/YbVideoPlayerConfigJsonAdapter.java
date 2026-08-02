package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbVideoPlayerConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/YbVideoPlayerConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class YbVideoPlayerConfigJsonAdapter extends JsonAdapter<YbVideoPlayerConfig> {
    private volatile Constructor<YbVideoPlayerConfig> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("exo_load_control_min_buffer_ms", "exo_load_control_max_buffer_ms", "exo_load_control_buffer_for_playback_ms", "exo_load_control_buffer_for_playback_after_rebuffer_ms");

    public YbVideoPlayerConfigJsonAdapter(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.a, "exoLoadControlMinBufferMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbVideoPlayerConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("exoLoadControlMinBufferMs", "exo_load_control_min_buffer_ms", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("exoLoadControlMaxBufferMs", "exo_load_control_max_buffer_ms", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                num3 = this.intAdapter.fromJson(jsonReader);
                if (num3 == null) {
                    throw Util.unexpectedNull("exoLoadControlBufferForPlaybackMs", "exo_load_control_buffer_for_playback_ms", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                num4 = this.intAdapter.fromJson(jsonReader);
                if (num4 == null) {
                    throw Util.unexpectedNull("exoLoadControlBufferForPlaybackAfterRebufferMS", "exo_load_control_buffer_for_playback_after_rebuffer_ms", jsonReader);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new YbVideoPlayerConfig(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        }
        Constructor<YbVideoPlayerConfig> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = YbVideoPlayerConfig.class.getDeclaredConstructor(cls, cls, cls, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(num, num2, num3, num4, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbVideoPlayerConfig ybVideoPlayerConfig) {
        YbVideoPlayerConfig ybVideoPlayerConfig2 = ybVideoPlayerConfig;
        if (ybVideoPlayerConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("exo_load_control_min_buffer_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(ybVideoPlayerConfig2.getExoLoadControlMinBufferMs()));
        jsonWriter.name("exo_load_control_max_buffer_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(ybVideoPlayerConfig2.getExoLoadControlMaxBufferMs()));
        jsonWriter.name("exo_load_control_buffer_for_playback_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(ybVideoPlayerConfig2.getExoLoadControlBufferForPlaybackMs()));
        jsonWriter.name("exo_load_control_buffer_for_playback_after_rebuffer_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(ybVideoPlayerConfig2.getExoLoadControlBufferForPlaybackAfterRebufferMS()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(YbVideoPlayerConfig)");
    }
}
