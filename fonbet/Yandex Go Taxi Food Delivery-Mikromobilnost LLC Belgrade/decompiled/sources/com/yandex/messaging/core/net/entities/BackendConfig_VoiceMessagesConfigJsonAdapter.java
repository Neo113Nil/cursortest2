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

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig_VoiceMessagesConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$VoiceMessagesConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "restrictionsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackendConfig_VoiceMessagesConfigJsonAdapter extends JsonAdapter<BackendConfig.VoiceMessagesConfig> {
    private volatile Constructor<BackendConfig.VoiceMessagesConfig> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("max_duration_s", "restrictions");
    private final JsonAdapter<BackendConfig.Restrictions> restrictionsAdapter;

    public BackendConfig_VoiceMessagesConfigJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "maxDuration");
        this.restrictionsAdapter = moshi.adapter(BackendConfig.Restrictions.class, emptySet, "restrictions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackendConfig.VoiceMessagesConfig fromJson(JsonReader jsonReader) {
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
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("maxDuration", "max_duration_s", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                restrictions = this.restrictionsAdapter.fromJson(jsonReader);
                if (restrictions == null) {
                    throw Util.unexpectedNull("restrictions", "restrictions", jsonReader);
                }
                i &= -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new BackendConfig.VoiceMessagesConfig(num.intValue(), restrictions);
        }
        Constructor<BackendConfig.VoiceMessagesConfig> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = BackendConfig.VoiceMessagesConfig.class.getDeclaredConstructor(cls2, BackendConfig.Restrictions.class, cls2, cls);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(num, restrictions, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackendConfig.VoiceMessagesConfig voiceMessagesConfig) {
        BackendConfig.VoiceMessagesConfig voiceMessagesConfig2 = voiceMessagesConfig;
        if (voiceMessagesConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("max_duration_s");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(voiceMessagesConfig2.getMaxDuration()));
        jsonWriter.name("restrictions");
        this.restrictionsAdapter.toJson(jsonWriter, (JsonWriter) voiceMessagesConfig2.getRestrictions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(BackendConfig.VoiceMessagesConfig)");
    }
}
