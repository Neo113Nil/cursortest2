package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/FoldersConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/FoldersConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "Lcom/yandex/messaging/core/net/entities/FoldersConfig$Filter;", "mapOfStringFilterAdapter", "", "listOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FoldersConfigJsonAdapter extends JsonAdapter<FoldersConfig> {
    private volatile Constructor<FoldersConfig> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Map<String, FoldersConfig.Filter>> mapOfStringFilterAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("max_folders_per_org", "max_chats_per_folder", "types", "types_list");

    public FoldersConfigJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "maxFoldersPerOrg");
        this.mapOfStringFilterAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, FoldersConfig.Filter.class), emptySet, "filters");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "filtersList");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FoldersConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        Integer num2 = null;
        Map<String, FoldersConfig.Filter> map = null;
        List<String> list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("maxFoldersPerOrg", "max_folders_per_org", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("maxChatsPerFolder", "max_chats_per_folder", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                map = this.mapOfStringFilterAdapter.fromJson(jsonReader);
                if (map == null) {
                    throw Util.unexpectedNull("filters", "types", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("filtersList", "types_list", jsonReader);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new FoldersConfig(num.intValue(), num2.intValue(), map, list);
        }
        Constructor<FoldersConfig> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = FoldersConfig.class.getDeclaredConstructor(cls2, cls2, Map.class, List.class, cls2, cls);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(num, num2, map, list, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FoldersConfig foldersConfig) {
        FoldersConfig foldersConfig2 = foldersConfig;
        if (foldersConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("max_folders_per_org");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(foldersConfig2.getMaxFoldersPerOrg()));
        jsonWriter.name("max_chats_per_folder");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(foldersConfig2.getMaxChatsPerFolder()));
        jsonWriter.name("types");
        this.mapOfStringFilterAdapter.toJson(jsonWriter, (JsonWriter) foldersConfig2.getFilters());
        jsonWriter.name("types_list");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) foldersConfig2.getFiltersList());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(FoldersConfig)");
    }
}
