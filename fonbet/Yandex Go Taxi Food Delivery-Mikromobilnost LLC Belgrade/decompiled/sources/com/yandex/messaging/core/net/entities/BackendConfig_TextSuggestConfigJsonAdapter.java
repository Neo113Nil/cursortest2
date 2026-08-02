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
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig_TextSuggestConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$TextSuggestConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackendConfig_TextSuggestConfigJsonAdapter extends JsonAdapter<BackendConfig.TextSuggestConfig> {
    private volatile Constructor<BackendConfig.TextSuggestConfig> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("throttling_ms", "symbols_min", "symbols_max");

    public BackendConfig_TextSuggestConfigJsonAdapter(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.a, "throttle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackendConfig.TextSuggestConfig fromJson(JsonReader jsonReader) {
        Integer num = 0;
        jsonReader.beginObject();
        Integer num2 = num;
        Integer num3 = num2;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("throttle", "throttling_ms", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("min", "symbols_min", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                num3 = this.intAdapter.fromJson(jsonReader);
                if (num3 == null) {
                    throw Util.unexpectedNull(CspBioProgressConstants.MAX, "symbols_max", jsonReader);
                }
                i &= -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            return new BackendConfig.TextSuggestConfig(num.intValue(), num2.intValue(), num3.intValue());
        }
        Constructor<BackendConfig.TextSuggestConfig> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = BackendConfig.TextSuggestConfig.class.getDeclaredConstructor(cls, cls, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(num, num2, num3, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackendConfig.TextSuggestConfig textSuggestConfig) {
        BackendConfig.TextSuggestConfig textSuggestConfig2 = textSuggestConfig;
        if (textSuggestConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("throttling_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(textSuggestConfig2.getThrottle()));
        jsonWriter.name("symbols_min");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(textSuggestConfig2.getMin()));
        jsonWriter.name("symbols_max");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(textSuggestConfig2.getMax()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(BackendConfig.TextSuggestConfig)");
    }
}
