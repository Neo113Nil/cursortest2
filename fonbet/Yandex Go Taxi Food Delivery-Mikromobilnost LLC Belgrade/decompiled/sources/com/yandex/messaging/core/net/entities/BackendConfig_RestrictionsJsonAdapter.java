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

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/BackendConfig_RestrictionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$NamespacesDescriptor;", "nullableNamespacesDescriptorAdapter", "Lcom/yandex/messaging/core/net/entities/BackendConfig$Restrictions$ManagedByClient;", "nullableManagedByClientAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BackendConfig_RestrictionsJsonAdapter extends JsonAdapter<BackendConfig.Restrictions> {
    private volatile Constructor<BackendConfig.Restrictions> constructorRef;
    private final JsonAdapter<BackendConfig.Restrictions.ManagedByClient> nullableManagedByClientAdapter;
    private final JsonAdapter<BackendConfig.Restrictions.NamespacesDescriptor> nullableNamespacesDescriptorAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("robots", "private", "channels", "groups", BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.DISABLED, "managed_by_client", "default");

    public BackendConfig_RestrictionsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "chatsWithBot");
        this.nullableNamespacesDescriptorAdapter = moshi.adapter(BackendConfig.Restrictions.NamespacesDescriptor.class, emptySet, "enabledChats");
        this.nullableManagedByClientAdapter = moshi.adapter(BackendConfig.Restrictions.ManagedByClient.class, emptySet, "managedByClient");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackendConfig.Restrictions fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        BackendConfig.Restrictions.NamespacesDescriptor namespacesDescriptor = null;
        BackendConfig.Restrictions.NamespacesDescriptor namespacesDescriptor2 = null;
        BackendConfig.Restrictions.ManagedByClient managedByClient = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    namespacesDescriptor = this.nullableNamespacesDescriptorAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    namespacesDescriptor2 = this.nullableNamespacesDescriptorAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    managedByClient = this.nullableManagedByClientAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -256) {
            String str6 = str5;
            BackendConfig.Restrictions.ManagedByClient managedByClient2 = managedByClient;
            BackendConfig.Restrictions.NamespacesDescriptor namespacesDescriptor3 = namespacesDescriptor2;
            BackendConfig.Restrictions.NamespacesDescriptor namespacesDescriptor4 = namespacesDescriptor;
            String str7 = str4;
            return new BackendConfig.Restrictions(str, str2, str3, str7, namespacesDescriptor4, namespacesDescriptor3, managedByClient2, str6);
        }
        String str8 = str5;
        BackendConfig.Restrictions.ManagedByClient managedByClient3 = managedByClient;
        BackendConfig.Restrictions.NamespacesDescriptor namespacesDescriptor5 = namespacesDescriptor2;
        BackendConfig.Restrictions.NamespacesDescriptor namespacesDescriptor6 = namespacesDescriptor;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        Constructor<BackendConfig.Restrictions> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BackendConfig.Restrictions.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, BackendConfig.Restrictions.NamespacesDescriptor.class, BackendConfig.Restrictions.NamespacesDescriptor.class, BackendConfig.Restrictions.ManagedByClient.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str12, str11, str10, str9, namespacesDescriptor6, namespacesDescriptor5, managedByClient3, str8, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackendConfig.Restrictions restrictions) {
        BackendConfig.Restrictions restrictions2 = restrictions;
        if (restrictions2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("robots");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) restrictions2.getChatsWithBot());
        jsonWriter.name("private");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) restrictions2.getPrivateChats());
        jsonWriter.name("channels");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) restrictions2.getChannels());
        jsonWriter.name("groups");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) restrictions2.getGroups());
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.nullableNamespacesDescriptorAdapter.toJson(jsonWriter, (JsonWriter) restrictions2.getEnabledChats());
        jsonWriter.name(BackendConfig.Restrictions.DISABLED);
        this.nullableNamespacesDescriptorAdapter.toJson(jsonWriter, (JsonWriter) restrictions2.getDisabledChats());
        jsonWriter.name("managed_by_client");
        this.nullableManagedByClientAdapter.toJson(jsonWriter, (JsonWriter) restrictions2.getManagedByClient());
        jsonWriter.name("default");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) restrictions2.getDefaultValue());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(BackendConfig.Restrictions)");
    }
}
