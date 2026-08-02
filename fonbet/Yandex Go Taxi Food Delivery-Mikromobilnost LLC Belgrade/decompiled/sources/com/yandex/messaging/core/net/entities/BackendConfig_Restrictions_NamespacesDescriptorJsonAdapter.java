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
import java.util.List;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig_Restrictions_NamespacesDescriptorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$NamespacesDescriptor;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "nullableListOfIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackendConfig_Restrictions_NamespacesDescriptorJsonAdapter extends JsonAdapter<BackendConfig.Restrictions.NamespacesDescriptor> {
    private volatile Constructor<BackendConfig.Restrictions.NamespacesDescriptor> constructorRef;
    private final JsonAdapter<List<Integer>> nullableListOfIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("channelsNS", "groupsNS");

    public BackendConfig_Restrictions_NamespacesDescriptorJsonAdapter(Moshi moshi) {
        this.nullableListOfIntAdapter = moshi.adapter(Types.newParameterizedType(List.class, Integer.class), EmptySet.a, "channelNamespaces");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackendConfig.Restrictions.NamespacesDescriptor fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<Integer> list = null;
        List<Integer> list2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.nullableListOfIntAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                list2 = this.nullableListOfIntAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new BackendConfig.Restrictions.NamespacesDescriptor(list, list2);
        }
        Constructor<BackendConfig.Restrictions.NamespacesDescriptor> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BackendConfig.Restrictions.NamespacesDescriptor.class.getDeclaredConstructor(List.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(list, list2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackendConfig.Restrictions.NamespacesDescriptor namespacesDescriptor) {
        BackendConfig.Restrictions.NamespacesDescriptor namespacesDescriptor2 = namespacesDescriptor;
        if (namespacesDescriptor2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("channelsNS");
        this.nullableListOfIntAdapter.toJson(jsonWriter, (JsonWriter) namespacesDescriptor2.getChannelNamespaces());
        jsonWriter.name("groupsNS");
        this.nullableListOfIntAdapter.toJson(jsonWriter, (JsonWriter) namespacesDescriptor2.getGroupsNamespaces());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(69, "GeneratedJsonAdapter(BackendConfig.Restrictions.NamespacesDescriptor)");
    }
}
