package com.ybsdk.feature.divkit.internal.extensions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.internal.extensions.ShimmerDivKitHandler;
import com.ybsdk.widgets.common.shimmer.ShimmerArgs$CompositeMode;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler_ShimmerConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$ShimmerConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$Width;", "nullableWidthAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "nullableThemesOfStringAdapter", "", "nullableFloatAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lcom/ybsdk/widgets/common/shimmer/ShimmerArgs$CompositeMode;", "nullableCompositeModeAdapter", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShimmerDivKitHandler_ShimmerConfigJsonAdapter extends JsonAdapter<ShimmerDivKitHandler.ShimmerConfig> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ShimmerArgs$CompositeMode> nullableCompositeModeAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonAdapter<ShimmerDivKitHandler.Width> nullableWidthAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("duration", "width", "color", "highlight_alpha", "repeat_delay", "autostart", "play_state_flag_name", "composite_mode");

    public ShimmerDivKitHandler_ShimmerConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "duration");
        this.nullableWidthAdapter = moshi.adapter(ShimmerDivKitHandler.Width.class, emptySet, "width");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "color");
        this.nullableFloatAdapter = moshi.adapter(Float.class, emptySet, "highlightAlpha");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "autostart");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "playStateFlagName");
        this.nullableCompositeModeAdapter = moshi.adapter(ShimmerArgs$CompositeMode.class, emptySet, "compositeMode");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ShimmerDivKitHandler.ShimmerConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        ShimmerDivKitHandler.Width width = null;
        Themes<String> themes = null;
        Float f = null;
        Integer num2 = null;
        Boolean bool = null;
        String str = null;
        ShimmerArgs$CompositeMode shimmerArgs$CompositeMode = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    width = this.nullableWidthAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    f = this.nullableFloatAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    shimmerArgs$CompositeMode = this.nullableCompositeModeAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new ShimmerDivKitHandler.ShimmerConfig(num, width, themes, f, num2, bool, str, shimmerArgs$CompositeMode);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ShimmerDivKitHandler.ShimmerConfig shimmerConfig) {
        ShimmerDivKitHandler.ShimmerConfig shimmerConfig2 = shimmerConfig;
        if (shimmerConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("duration");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) shimmerConfig2.getDuration());
        jsonWriter.name("width");
        this.nullableWidthAdapter.toJson(jsonWriter, (JsonWriter) shimmerConfig2.getWidth());
        jsonWriter.name("color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) shimmerConfig2.getColor());
        jsonWriter.name("highlight_alpha");
        this.nullableFloatAdapter.toJson(jsonWriter, (JsonWriter) shimmerConfig2.getHighlightAlpha());
        jsonWriter.name("repeat_delay");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) shimmerConfig2.getRepeatDelay());
        jsonWriter.name("autostart");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) shimmerConfig2.getAutostart());
        jsonWriter.name("play_state_flag_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) shimmerConfig2.getPlayStateFlagName());
        jsonWriter.name("composite_mode");
        this.nullableCompositeModeAdapter.toJson(jsonWriter, (JsonWriter) shimmerConfig2.getCompositeMode());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(ShimmerDivKitHandler.ShimmerConfig)");
    }
}
