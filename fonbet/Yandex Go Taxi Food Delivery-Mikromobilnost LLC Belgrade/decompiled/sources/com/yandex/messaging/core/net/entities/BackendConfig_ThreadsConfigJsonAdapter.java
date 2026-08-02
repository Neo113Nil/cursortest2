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

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig_ThreadsConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$ThreadsConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "restrictionsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackendConfig_ThreadsConfigJsonAdapter extends JsonAdapter<BackendConfig.ThreadsConfig> {
    private volatile Constructor<BackendConfig.ThreadsConfig> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of("restrictions");
    private final JsonAdapter<BackendConfig.Restrictions> restrictionsAdapter;

    public BackendConfig_ThreadsConfigJsonAdapter(Moshi moshi) {
        this.restrictionsAdapter = moshi.adapter(BackendConfig.Restrictions.class, EmptySet.a, "restrictions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackendConfig.ThreadsConfig fromJson(JsonReader jsonReader) {
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
                i = -2;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            return new BackendConfig.ThreadsConfig(restrictions);
        }
        Constructor<BackendConfig.ThreadsConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BackendConfig.ThreadsConfig.class.getDeclaredConstructor(BackendConfig.Restrictions.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(restrictions, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackendConfig.ThreadsConfig threadsConfig) {
        BackendConfig.ThreadsConfig threadsConfig2 = threadsConfig;
        if (threadsConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("restrictions");
        this.restrictionsAdapter.toJson(jsonWriter, (JsonWriter) threadsConfig2.getRestrictions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(BackendConfig.ThreadsConfig)");
    }
}
