package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.Set;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig_SourceExtensionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$SourceExtensions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "setOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackendConfig_SourceExtensionsJsonAdapter extends JsonAdapter<BackendConfig.SourceExtensions> {
    private volatile Constructor<BackendConfig.SourceExtensions> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of("extensions");
    private final JsonAdapter<Set<String>> setOfStringAdapter;

    public BackendConfig_SourceExtensionsJsonAdapter(Moshi moshi) {
        this.setOfStringAdapter = moshi.adapter(Types.newParameterizedType(Set.class, String.class), EmptySet.a, "extensions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackendConfig.SourceExtensions fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Set<String> set = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                set = this.setOfStringAdapter.fromJson(jsonReader);
                if (set == null) {
                    throw Util.unexpectedNull("extensions", "extensions", jsonReader);
                }
                i = -2;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            return new BackendConfig.SourceExtensions(set);
        }
        Constructor<BackendConfig.SourceExtensions> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BackendConfig.SourceExtensions.class.getDeclaredConstructor(Set.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(set, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackendConfig.SourceExtensions sourceExtensions) {
        BackendConfig.SourceExtensions sourceExtensions2 = sourceExtensions;
        if (sourceExtensions2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("extensions");
        this.setOfStringAdapter.toJson(jsonWriter, (JsonWriter) sourceExtensions2.getExtensions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(BackendConfig.SourceExtensions)");
    }
}
