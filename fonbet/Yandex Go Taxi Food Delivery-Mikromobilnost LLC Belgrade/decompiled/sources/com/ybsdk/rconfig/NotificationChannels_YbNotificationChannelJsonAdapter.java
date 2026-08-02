package com.ybsdk.rconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.NotificationChannels;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/rconfig/NotificationChannels_YbNotificationChannelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/NotificationChannels$YbNotificationChannel;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/text/Text;", "textAdapter", "nullableStringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationChannels_YbNotificationChannelJsonAdapter extends JsonAdapter<NotificationChannels.YbNotificationChannel> {
    private volatile Constructor<NotificationChannels.YbNotificationChannel> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "priority");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Text> textAdapter;

    public NotificationChannels_YbNotificationChannelJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.textAdapter = moshi.adapter(Text.class, emptySet, "name");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "priority");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NotificationChannels.YbNotificationChannel fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Text text = null;
        String str2 = null;
        Integer num = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1) {
                text = this.textAdapter.fromJson(jsonReader);
                if (text == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i = -5;
            } else if (selectName == 3 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("priority", "priority", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (str == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            if (text == null) {
                throw Util.missingProperty("name", "name", jsonReader);
            }
            if (num != null) {
                return new NotificationChannels.YbNotificationChannel(str, text, str2, num.intValue());
            }
            throw Util.missingProperty("priority", "priority", jsonReader);
        }
        Constructor<NotificationChannels.YbNotificationChannel> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = NotificationChannels.YbNotificationChannel.class.getDeclaredConstructor(String.class, Text.class, String.class, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (text == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (num != null) {
            return constructor.newInstance(str, text, str2, num, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("priority", "priority", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NotificationChannels.YbNotificationChannel ybNotificationChannel) {
        NotificationChannels.YbNotificationChannel ybNotificationChannel2 = ybNotificationChannel;
        if (ybNotificationChannel2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) ybNotificationChannel2.getId());
        jsonWriter.name("name");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) ybNotificationChannel2.getName());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) ybNotificationChannel2.getDescription());
        jsonWriter.name("priority");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(ybNotificationChannel2.getPriority()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(64, "GeneratedJsonAdapter(NotificationChannels.YbNotificationChannel)");
    }
}
