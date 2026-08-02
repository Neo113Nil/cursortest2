package com.ybsdk.rconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.NotificationChannels;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/NotificationChannelsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/NotificationChannels;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/rconfig/NotificationChannels$YbNotificationChannel;", "listOfYbNotificationChannelAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationChannelsJsonAdapter extends JsonAdapter<NotificationChannels> {
    private final JsonAdapter<List<NotificationChannels.YbNotificationChannel>> listOfYbNotificationChannelAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("channels");

    public NotificationChannelsJsonAdapter(Moshi moshi) {
        this.listOfYbNotificationChannelAdapter = moshi.adapter(Types.newParameterizedType(List.class, NotificationChannels.YbNotificationChannel.class), EmptySet.a, "channels");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NotificationChannels fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<NotificationChannels.YbNotificationChannel> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = this.listOfYbNotificationChannelAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("channels", "channels", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new NotificationChannels(list);
        }
        throw Util.missingProperty("channels", "channels", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NotificationChannels notificationChannels) {
        NotificationChannels notificationChannels2 = notificationChannels;
        if (notificationChannels2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("channels");
        this.listOfYbNotificationChannelAdapter.toJson(jsonWriter, (JsonWriter) notificationChannels2.getChannels());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(NotificationChannels)");
    }
}
