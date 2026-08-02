package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig_MeetingsConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$MeetingsConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "restrictionsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackendConfig_MeetingsConfigJsonAdapter extends JsonAdapter<BackendConfig.MeetingsConfig> {
    private volatile Constructor<BackendConfig.MeetingsConfig> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("restrictions", "max_participants_count");
    private final JsonAdapter<BackendConfig.Restrictions> restrictionsAdapter;

    public BackendConfig_MeetingsConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.restrictionsAdapter = moshi.adapter(BackendConfig.Restrictions.class, emptySet, "restrictions");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "maxParticipantsCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackendConfig.MeetingsConfig fromJson(JsonReader jsonReader) {
        Integer num = 0;
        jsonReader.beginObject();
        BackendConfig.Restrictions restrictions = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                restrictions = this.restrictionsAdapter.fromJson(jsonReader);
                if (restrictions == null) {
                    throw Util.unexpectedNull("restrictions", "restrictions", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("maxParticipantsCount", "max_participants_count", jsonReader);
                }
                i &= -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new BackendConfig.MeetingsConfig(restrictions, num.intValue());
        }
        Constructor<BackendConfig.MeetingsConfig> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = BackendConfig.MeetingsConfig.class.getDeclaredConstructor(BackendConfig.Restrictions.class, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(restrictions, num, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackendConfig.MeetingsConfig meetingsConfig) {
        BackendConfig.MeetingsConfig meetingsConfig2 = meetingsConfig;
        if (meetingsConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("restrictions");
        this.restrictionsAdapter.toJson(jsonWriter, (JsonWriter) meetingsConfig2.getRestrictions());
        jsonWriter.name("max_participants_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(meetingsConfig2.getMaxParticipantsCount()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(BackendConfig.MeetingsConfig)");
    }
}
