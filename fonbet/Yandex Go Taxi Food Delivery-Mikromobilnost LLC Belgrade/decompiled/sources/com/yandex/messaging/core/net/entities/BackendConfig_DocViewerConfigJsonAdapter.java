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
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig_DocViewerConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$DocViewerConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "Lcom/yandex/messaging/core/net/entities/BackendConfig$SourceExtensions;", "mapOfStringSourceExtensionsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "restrictionsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackendConfig_DocViewerConfigJsonAdapter extends JsonAdapter<BackendConfig.DocViewerConfig> {
    private volatile Constructor<BackendConfig.DocViewerConfig> constructorRef;
    private final JsonAdapter<Map<String, BackendConfig.SourceExtensions>> mapOfStringSourceExtensionsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("supported_files_by_source", "restrictions");
    private final JsonAdapter<BackendConfig.Restrictions> restrictionsAdapter;

    public BackendConfig_DocViewerConfigJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Map.class, String.class, BackendConfig.SourceExtensions.class);
        EmptySet emptySet = EmptySet.a;
        this.mapOfStringSourceExtensionsAdapter = moshi.adapter(newParameterizedType, emptySet, "supportedFilesBySource");
        this.restrictionsAdapter = moshi.adapter(BackendConfig.Restrictions.class, emptySet, "restrictions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackendConfig.DocViewerConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Map<String, BackendConfig.SourceExtensions> map = null;
        BackendConfig.Restrictions restrictions = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                map = this.mapOfStringSourceExtensionsAdapter.fromJson(jsonReader);
                if (map == null) {
                    throw Util.unexpectedNull("supportedFilesBySource", "supported_files_by_source", jsonReader);
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
            return new BackendConfig.DocViewerConfig(map, restrictions);
        }
        Constructor<BackendConfig.DocViewerConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BackendConfig.DocViewerConfig.class.getDeclaredConstructor(Map.class, BackendConfig.Restrictions.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(map, restrictions, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackendConfig.DocViewerConfig docViewerConfig) {
        BackendConfig.DocViewerConfig docViewerConfig2 = docViewerConfig;
        if (docViewerConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("supported_files_by_source");
        this.mapOfStringSourceExtensionsAdapter.toJson(jsonWriter, (JsonWriter) docViewerConfig2.getSupportedFilesBySource());
        jsonWriter.name("restrictions");
        this.restrictionsAdapter.toJson(jsonWriter, (JsonWriter) docViewerConfig2.getRestrictions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(BackendConfig.DocViewerConfig)");
    }
}
