package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.design.design.DesignTextStyle;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/core/stories/dto/CommunicationFullScreenTextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenText;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "Lcom/ybsdk/core/stories/dto/HorizontalAlignment;", "nullableHorizontalAlignmentAdapter", "Lcom/ybsdk/core/design/design/DesignTextStyle;", "nullableDesignTextStyleAdapter", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommunicationFullScreenTextJsonAdapter extends JsonAdapter<CommunicationFullScreenText> {
    private final JsonAdapter<DesignTextStyle> nullableDesignTextStyleAdapter;
    private final JsonAdapter<HorizontalAlignment> nullableHorizontalAlignmentAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "text_color", "alignment", "text_style");
    private final JsonAdapter<String> stringAdapter;

    public CommunicationFullScreenTextJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "textColor");
        this.nullableHorizontalAlignmentAdapter = moshi.adapter(HorizontalAlignment.class, emptySet, "alignment");
        this.nullableDesignTextStyleAdapter = moshi.adapter(DesignTextStyle.class, emptySet, "textStyle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CommunicationFullScreenText fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Themes<String> themes = null;
        HorizontalAlignment horizontalAlignment = null;
        DesignTextStyle designTextStyle = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1) {
                themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                horizontalAlignment = this.nullableHorizontalAlignmentAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                designTextStyle = this.nullableDesignTextStyleAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new CommunicationFullScreenText(str, themes, horizontalAlignment, designTextStyle);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CommunicationFullScreenText communicationFullScreenText) {
        CommunicationFullScreenText communicationFullScreenText2 = communicationFullScreenText;
        if (communicationFullScreenText2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenText2.getText());
        jsonWriter.name("text_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenText2.getTextColor());
        jsonWriter.name("alignment");
        this.nullableHorizontalAlignmentAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenText2.getAlignment());
        jsonWriter.name("text_style");
        this.nullableDesignTextStyleAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenText2.getTextStyle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(CommunicationFullScreenText)");
    }
}
