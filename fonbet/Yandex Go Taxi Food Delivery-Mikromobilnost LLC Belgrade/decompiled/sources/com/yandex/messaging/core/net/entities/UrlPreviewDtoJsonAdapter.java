package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;
import org.webrtc.MediaStreamTrack;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UrlPreviewDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UrlPreviewDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UrlPreviewImageDto;", "nullableUrlPreviewImageDtoAdapter", "Lcom/yandex/messaging/core/net/entities/UrlPreviewVideoDto;", "nullableUrlPreviewVideoDtoAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlPreviewDtoJsonAdapter extends JsonAdapter<UrlPreviewDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UrlPreviewImageDto> nullableUrlPreviewImageDtoAdapter;
    private final JsonAdapter<UrlPreviewVideoDto> nullableUrlPreviewVideoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", MediaStreamTrack.VIDEO_TRACK_KIND, "turbo_link");

    public UrlPreviewDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableUrlPreviewImageDtoAdapter = moshi.adapter(UrlPreviewImageDto.class, emptySet, "image");
        this.nullableUrlPreviewVideoDtoAdapter = moshi.adapter(UrlPreviewVideoDto.class, emptySet, MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UrlPreviewDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        UrlPreviewImageDto urlPreviewImageDto = null;
        UrlPreviewVideoDto urlPreviewVideoDto = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                urlPreviewImageDto = this.nullableUrlPreviewImageDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                urlPreviewVideoDto = this.nullableUrlPreviewVideoDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new UrlPreviewDto(str, str2, urlPreviewImageDto, urlPreviewVideoDto, str3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UrlPreviewDto urlPreviewDto) {
        UrlPreviewDto urlPreviewDto2 = urlPreviewDto;
        if (urlPreviewDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewDto2.getDescription());
        jsonWriter.name("image");
        this.nullableUrlPreviewImageDtoAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewDto2.getImage());
        jsonWriter.name(MediaStreamTrack.VIDEO_TRACK_KIND);
        this.nullableUrlPreviewVideoDtoAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewDto2.getVideo());
        jsonWriter.name("turbo_link");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) urlPreviewDto2.getTurboLink());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(UrlPreviewDto)");
    }
}
