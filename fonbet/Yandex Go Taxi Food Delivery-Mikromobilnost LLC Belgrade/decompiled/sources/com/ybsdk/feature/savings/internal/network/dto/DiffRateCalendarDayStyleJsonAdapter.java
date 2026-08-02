package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarDayStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarDayStyle;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "nullableThemesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "themesOfStringAdapter", "Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarTooltip;", "nullableDiffRateCalendarTooltipAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiffRateCalendarDayStyleJsonAdapter extends JsonAdapter<DiffRateCalendarDayStyle> {
    private final JsonAdapter<DiffRateCalendarTooltip> nullableDiffRateCalendarTooltipAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("highlight_color", "text_color", "tooltip");
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public DiffRateCalendarDayStyleJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Themes.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableThemesOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "highlightColor");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "textColor");
        this.nullableDiffRateCalendarTooltipAdapter = moshi.adapter(DiffRateCalendarTooltip.class, emptySet, "tooltip");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DiffRateCalendarDayStyle fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        DiffRateCalendarTooltip diffRateCalendarTooltip = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                themes2 = this.themesOfStringAdapter.fromJson(jsonReader);
                if (themes2 == null) {
                    throw Util.unexpectedNull("textColor", "text_color", jsonReader);
                }
            } else if (selectName == 2) {
                diffRateCalendarTooltip = this.nullableDiffRateCalendarTooltipAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (themes2 != null) {
            return new DiffRateCalendarDayStyle(themes, themes2, diffRateCalendarTooltip);
        }
        throw Util.missingProperty("textColor", "text_color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DiffRateCalendarDayStyle diffRateCalendarDayStyle) {
        DiffRateCalendarDayStyle diffRateCalendarDayStyle2 = diffRateCalendarDayStyle;
        if (diffRateCalendarDayStyle2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("highlight_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) diffRateCalendarDayStyle2.getHighlightColor());
        jsonWriter.name("text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) diffRateCalendarDayStyle2.getTextColor());
        jsonWriter.name("tooltip");
        this.nullableDiffRateCalendarTooltipAdapter.toJson(jsonWriter, (JsonWriter) diffRateCalendarDayStyle2.getTooltip());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(DiffRateCalendarDayStyle)");
    }
}
