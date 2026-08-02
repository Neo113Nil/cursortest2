package com.ybsdk.core.stories.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import org.webrtc.MediaStreamTrack;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/core/stories/dto/FullScreenDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/FullScreenDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenText;", "communicationFullScreenTextAdapter", "nullableCommunicationFullScreenTextAdapter", "", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenBullet;", "nullableListOfCommunicationFullScreenBulletAdapter", "Lcom/ybsdk/core/stories/dto/Background;", "nullableBackgroundAdapter", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButtonGroup;", "nullableCommunicationFullScreenButtonGroupAdapter", "Lcom/ybsdk/core/stories/dto/VideoSettingsDto;", "nullableVideoSettingsDtoAdapter", "Lcom/ybsdk/core/stories/dto/AdvertisementDisclosureDto;", "nullableAdvertisementDisclosureDtoAdapter", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FullScreenDtoJsonAdapter extends JsonAdapter<FullScreenDto> {
    private final JsonAdapter<CommunicationFullScreenText> communicationFullScreenTextAdapter;
    private final JsonAdapter<AdvertisementDisclosureDto> nullableAdvertisementDisclosureDtoAdapter;
    private final JsonAdapter<Background> nullableBackgroundAdapter;
    private final JsonAdapter<CommunicationFullScreenButtonGroup> nullableCommunicationFullScreenButtonGroupAdapter;
    private final JsonAdapter<CommunicationFullScreenText> nullableCommunicationFullScreenTextAdapter;
    private final JsonAdapter<List<CommunicationFullScreenBullet>> nullableListOfCommunicationFullScreenBulletAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<VideoSettingsDto> nullableVideoSettingsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "title", "subtitle", "bullets", C0553n3.g, "buttons", MediaStreamTrack.VIDEO_TRACK_KIND, "advertisement_disclosure");

    public FullScreenDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.communicationFullScreenTextAdapter = moshi.adapter(CommunicationFullScreenText.class, emptySet, "title");
        this.nullableCommunicationFullScreenTextAdapter = moshi.adapter(CommunicationFullScreenText.class, emptySet, "subtitle");
        this.nullableListOfCommunicationFullScreenBulletAdapter = moshi.adapter(Types.newParameterizedType(List.class, CommunicationFullScreenBullet.class), emptySet, "bullets");
        this.nullableBackgroundAdapter = moshi.adapter(Background.class, emptySet, C0553n3.g);
        this.nullableCommunicationFullScreenButtonGroupAdapter = moshi.adapter(CommunicationFullScreenButtonGroup.class, emptySet, "buttonGroup");
        this.nullableVideoSettingsDtoAdapter = moshi.adapter(VideoSettingsDto.class, emptySet, MediaStreamTrack.VIDEO_TRACK_KIND);
        this.nullableAdvertisementDisclosureDtoAdapter = moshi.adapter(AdvertisementDisclosureDto.class, emptySet, "advertisementDisclosure");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FullScreenDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        CommunicationFullScreenText communicationFullScreenText = null;
        CommunicationFullScreenText communicationFullScreenText2 = null;
        List<CommunicationFullScreenBullet> list = null;
        Background background = null;
        CommunicationFullScreenButtonGroup communicationFullScreenButtonGroup = null;
        VideoSettingsDto videoSettingsDto = null;
        AdvertisementDisclosureDto advertisementDisclosureDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    communicationFullScreenText = this.communicationFullScreenTextAdapter.fromJson(jsonReader);
                    if (communicationFullScreenText == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    communicationFullScreenText2 = this.nullableCommunicationFullScreenTextAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    list = this.nullableListOfCommunicationFullScreenBulletAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    background = this.nullableBackgroundAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    communicationFullScreenButtonGroup = this.nullableCommunicationFullScreenButtonGroupAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    videoSettingsDto = this.nullableVideoSettingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    advertisementDisclosureDto = this.nullableAdvertisementDisclosureDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (communicationFullScreenText != null) {
            return new FullScreenDto(str, communicationFullScreenText, communicationFullScreenText2, list, background, communicationFullScreenButtonGroup, videoSettingsDto, advertisementDisclosureDto);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FullScreenDto fullScreenDto) {
        FullScreenDto fullScreenDto2 = fullScreenDto;
        if (fullScreenDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getId());
        jsonWriter.name("title");
        this.communicationFullScreenTextAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableCommunicationFullScreenTextAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getSubtitle());
        jsonWriter.name("bullets");
        this.nullableListOfCommunicationFullScreenBulletAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getBullets());
        jsonWriter.name(C0553n3.g);
        this.nullableBackgroundAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getBackground());
        jsonWriter.name("buttons");
        this.nullableCommunicationFullScreenButtonGroupAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getButtonGroup());
        jsonWriter.name(MediaStreamTrack.VIDEO_TRACK_KIND);
        this.nullableVideoSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getVideo());
        jsonWriter.name("advertisement_disclosure");
        this.nullableAdvertisementDisclosureDtoAdapter.toJson(jsonWriter, (JsonWriter) fullScreenDto2.getAdvertisementDisclosure());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(FullScreenDto)");
    }
}
