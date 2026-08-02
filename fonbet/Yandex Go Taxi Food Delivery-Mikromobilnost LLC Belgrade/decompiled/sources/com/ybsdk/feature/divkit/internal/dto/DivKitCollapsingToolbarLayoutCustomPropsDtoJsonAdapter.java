package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivKitCollapsingToolbarLayoutCustomPropsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/divkit/internal/dto/DivKitCollapsingToolbarLayoutCustomPropsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "", "nullableFloatAdapter", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivKitCollapsingToolbarLayoutCustomPropsDtoJsonAdapter extends JsonAdapter<DivKitCollapsingToolbarLayoutCustomPropsDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("toolbar_collapsed_height", "is_anchored", "is_toolbar_scroll_enabled", "parallax_multiplier");

    public DivKitCollapsingToolbarLayoutCustomPropsDtoJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "toolbarCollapsedHeightDp");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isAnchored");
        this.nullableFloatAdapter = moshi.adapter(Float.class, emptySet, "parallaxMultiplier");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DivKitCollapsingToolbarLayoutCustomPropsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Float f = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("toolbarCollapsedHeightDp", "toolbar_collapsed_height", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                f = this.nullableFloatAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (num != null) {
            return new DivKitCollapsingToolbarLayoutCustomPropsDto(num.intValue(), bool, bool2, f);
        }
        throw Util.missingProperty("toolbarCollapsedHeightDp", "toolbar_collapsed_height", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DivKitCollapsingToolbarLayoutCustomPropsDto divKitCollapsingToolbarLayoutCustomPropsDto) {
        DivKitCollapsingToolbarLayoutCustomPropsDto divKitCollapsingToolbarLayoutCustomPropsDto2 = divKitCollapsingToolbarLayoutCustomPropsDto;
        if (divKitCollapsingToolbarLayoutCustomPropsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("toolbar_collapsed_height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(divKitCollapsingToolbarLayoutCustomPropsDto2.getToolbarCollapsedHeightDp()));
        jsonWriter.name("is_anchored");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) divKitCollapsingToolbarLayoutCustomPropsDto2.isAnchored());
        jsonWriter.name("is_toolbar_scroll_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) divKitCollapsingToolbarLayoutCustomPropsDto2.isToolbarScrollEnabled());
        jsonWriter.name("parallax_multiplier");
        this.nullableFloatAdapter.toJson(jsonWriter, (JsonWriter) divKitCollapsingToolbarLayoutCustomPropsDto2.getParallaxMultiplier());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(65, "GeneratedJsonAdapter(DivKitCollapsingToolbarLayoutCustomPropsDto)");
    }
}
