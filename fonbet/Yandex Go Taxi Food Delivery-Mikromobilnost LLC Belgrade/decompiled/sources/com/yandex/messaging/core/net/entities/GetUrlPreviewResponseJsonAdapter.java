package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetUrlPreviewResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GetUrlPreviewResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lcom/yandex/messaging/core/net/entities/UrlPreviewDto;", "nullableUrlPreviewDtoAdapter", "Lcom/yandex/messaging/core/net/entities/UrlPreviewChatDto;", "nullableUrlPreviewChatDtoAdapter", "Lcom/yandex/messaging/core/net/entities/UrlPreviewMessageDto;", "nullableUrlPreviewMessageDtoAdapter", "Lcom/yandex/messaging/core/net/entities/UrlPreviewUserDto;", "nullableUrlPreviewUserDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetUrlPreviewResponseJsonAdapter extends JsonAdapter<GetUrlPreviewResponse> {
    private volatile Constructor<GetUrlPreviewResponse> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UrlPreviewChatDto> nullableUrlPreviewChatDtoAdapter;
    private final JsonAdapter<UrlPreviewDto> nullableUrlPreviewDtoAdapter;
    private final JsonAdapter<UrlPreviewMessageDto> nullableUrlPreviewMessageDtoAdapter;
    private final JsonAdapter<UrlPreviewUserDto> nullableUrlPreviewUserDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "title", "url", "width", "height", "preview", "chat", Constants.KEY_MESSAGE, "user");

    public GetUrlPreviewResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "imageUrl");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "width");
        this.nullableUrlPreviewDtoAdapter = moshi.adapter(UrlPreviewDto.class, emptySet, "preview");
        this.nullableUrlPreviewChatDtoAdapter = moshi.adapter(UrlPreviewChatDto.class, emptySet, "chat");
        this.nullableUrlPreviewMessageDtoAdapter = moshi.adapter(UrlPreviewMessageDto.class, emptySet, Constants.KEY_MESSAGE);
        this.nullableUrlPreviewUserDtoAdapter = moshi.adapter(UrlPreviewUserDto.class, emptySet, "user");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetUrlPreviewResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        UrlPreviewDto urlPreviewDto = null;
        UrlPreviewChatDto urlPreviewChatDto = null;
        UrlPreviewMessageDto urlPreviewMessageDto = null;
        UrlPreviewUserDto urlPreviewUserDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    urlPreviewDto = this.nullableUrlPreviewDtoAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    urlPreviewChatDto = this.nullableUrlPreviewChatDtoAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    urlPreviewMessageDto = this.nullableUrlPreviewMessageDtoAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    urlPreviewUserDto = this.nullableUrlPreviewUserDtoAdapter.fromJson(jsonReader);
                    i &= -513;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -1024) {
            UrlPreviewMessageDto urlPreviewMessageDto2 = urlPreviewMessageDto;
            UrlPreviewChatDto urlPreviewChatDto2 = urlPreviewChatDto;
            UrlPreviewDto urlPreviewDto2 = urlPreviewDto;
            Integer num3 = num2;
            Integer num4 = num;
            String str5 = str4;
            return new GetUrlPreviewResponse(str, str2, str3, str5, num4, num3, urlPreviewDto2, urlPreviewChatDto2, urlPreviewMessageDto2, urlPreviewUserDto);
        }
        UrlPreviewMessageDto urlPreviewMessageDto3 = urlPreviewMessageDto;
        UrlPreviewChatDto urlPreviewChatDto3 = urlPreviewChatDto;
        UrlPreviewDto urlPreviewDto3 = urlPreviewDto;
        Integer num5 = num2;
        Integer num6 = num;
        String str6 = str4;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Constructor<GetUrlPreviewResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GetUrlPreviewResponse.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.class, Integer.class, UrlPreviewDto.class, UrlPreviewChatDto.class, UrlPreviewMessageDto.class, UrlPreviewUserDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str9, str8, str7, str6, num6, num5, urlPreviewDto3, urlPreviewChatDto3, urlPreviewMessageDto3, urlPreviewUserDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetUrlPreviewResponse getUrlPreviewResponse) {
        GetUrlPreviewResponse getUrlPreviewResponse2 = getUrlPreviewResponse;
        if (getUrlPreviewResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getImageUrl());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getDescription());
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getTitle());
        jsonWriter.name("url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getUrl());
        jsonWriter.name("width");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getWidth());
        jsonWriter.name("height");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getHeight());
        jsonWriter.name("preview");
        this.nullableUrlPreviewDtoAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getPreview());
        jsonWriter.name("chat");
        this.nullableUrlPreviewChatDtoAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getChat());
        jsonWriter.name(Constants.KEY_MESSAGE);
        this.nullableUrlPreviewMessageDtoAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getMessage());
        jsonWriter.name("user");
        this.nullableUrlPreviewUserDtoAdapter.toJson(jsonWriter, (JsonWriter) getUrlPreviewResponse2.getUser());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(GetUrlPreviewResponse)");
    }
}
