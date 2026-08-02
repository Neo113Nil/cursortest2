package com.ybsdk.feature.qr.payments.internal.network.dto.info;

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
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/HeaderDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/HeaderDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "stringAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeaderDtoJsonAdapter extends JsonAdapter<HeaderDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", "themed_image", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    private final JsonAdapter<String> stringAdapter;

    public HeaderDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "image");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "themedImage");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HeaderDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Themes<String> themes = null;
        String str2 = null;
        String str3 = null;
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
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 3 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str3 != null) {
            return new HeaderDto(str, themes, str2, str3);
        }
        throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HeaderDto headerDto) {
        HeaderDto headerDto2 = headerDto;
        if (headerDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getImage());
        jsonWriter.name("themed_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getThemedImage());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) headerDto2.getDescription());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(HeaderDto)");
    }
}
