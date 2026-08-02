package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/core/stories/dto/CommunicationFullScreenBulletJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenBullet;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenImage;", "communicationFullScreenImageAdapter", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommunicationFullScreenBulletJsonAdapter extends JsonAdapter<CommunicationFullScreenBullet> {
    private final JsonAdapter<CommunicationFullScreenImage> communicationFullScreenImageAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "title_color", "subtitle", "subtitle_color", "image");

    public CommunicationFullScreenBulletJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "titleColor");
        this.communicationFullScreenImageAdapter = moshi.adapter(CommunicationFullScreenImage.class, emptySet, "image");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CommunicationFullScreenBullet fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Themes<String> themes = null;
        String str2 = null;
        Themes<String> themes2 = null;
        CommunicationFullScreenImage communicationFullScreenImage = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4 && (communicationFullScreenImage = this.communicationFullScreenImageAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("image", "image", jsonReader);
            }
        }
        jsonReader.endObject();
        if (communicationFullScreenImage != null) {
            return new CommunicationFullScreenBullet(str, themes, str2, themes2, communicationFullScreenImage);
        }
        throw Util.missingProperty("image", "image", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CommunicationFullScreenBullet communicationFullScreenBullet) {
        CommunicationFullScreenBullet communicationFullScreenBullet2 = communicationFullScreenBullet;
        if (communicationFullScreenBullet2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenBullet2.getTitle());
        jsonWriter.name("title_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenBullet2.getTitleColor());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenBullet2.getSubtitle());
        jsonWriter.name("subtitle_color");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenBullet2.getSubtitleColor());
        jsonWriter.name("image");
        this.communicationFullScreenImageAdapter.toJson(jsonWriter, (JsonWriter) communicationFullScreenBullet2.getImage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(CommunicationFullScreenBullet)");
    }
}
