package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/CreateChannelParamJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/chatcreate/CreateChannelParam;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;", "permissionsAdapter", "Lcom/yandex/messaging/core/net/entities/chatcreate/Roles;", "rolesAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreateChannelParamJsonAdapter extends JsonAdapter<CreateChannelParam> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CreateChannelParam> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of("name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "permissions", "roles", "is_public", "channel");
    private final JsonAdapter<Permissions> permissionsAdapter;
    private final JsonAdapter<Roles> rolesAdapter;
    private final JsonAdapter<String> stringAdapter;

    public CreateChannelParamJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.permissionsAdapter = moshi.adapter(Permissions.class, emptySet, "permissions");
        this.rolesAdapter = moshi.adapter(Roles.class, emptySet, "roles");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "channelPublicity");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreateChannelParam fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Permissions permissions = null;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str = null;
        String str2 = null;
        int i = -1;
        Roles roles = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    break;
                case 2:
                    permissions = this.permissionsAdapter.fromJson(jsonReader);
                    if (permissions == null) {
                        throw Util.unexpectedNull("permissions", "permissions", jsonReader);
                    }
                    break;
                case 3:
                    roles = this.rolesAdapter.fromJson(jsonReader);
                    if (roles == null) {
                        throw Util.unexpectedNull("roles", "roles", jsonReader);
                    }
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("channelPublicity", "is_public", jsonReader);
                    }
                    i &= -17;
                    break;
                case 5:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("isChannel", "channel", jsonReader);
                    }
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -49) {
            if (str2 == null) {
                throw Util.missingProperty("name", "name", jsonReader);
            }
            if (str == null) {
                throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
            }
            if (permissions == null) {
                throw Util.missingProperty("permissions", "permissions", jsonReader);
            }
            if (roles != null) {
                return new CreateChannelParam(str2, str, permissions, roles, bool2.booleanValue(), bool3.booleanValue());
            }
            throw Util.missingProperty("roles", "roles", jsonReader);
        }
        String str3 = str2;
        Constructor<CreateChannelParam> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = CreateChannelParam.class.getDeclaredConstructor(String.class, String.class, Permissions.class, Roles.class, cls3, cls3, cls, cls2);
            this.constructorRef = constructor;
        }
        Constructor<CreateChannelParam> constructor2 = constructor;
        if (str3 == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
        }
        if (permissions == null) {
            throw Util.missingProperty("permissions", "permissions", jsonReader);
        }
        if (roles == null) {
            throw Util.missingProperty("roles", "roles", jsonReader);
        }
        return constructor2.newInstance(str3, str, permissions, roles, bool2, bool3, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreateChannelParam createChannelParam) {
        CreateChannelParam createChannelParam2 = createChannelParam;
        if (createChannelParam2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) createChannelParam2.getName());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) createChannelParam2.getDescription());
        jsonWriter.name("permissions");
        this.permissionsAdapter.toJson(jsonWriter, (JsonWriter) createChannelParam2.getPermissions());
        jsonWriter.name("roles");
        this.rolesAdapter.toJson(jsonWriter, (JsonWriter) createChannelParam2.getRoles());
        jsonWriter.name("is_public");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(createChannelParam2.getChannelPublicity()));
        jsonWriter.name("channel");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(createChannelParam2.isChannel()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(CreateChannelParam)");
    }
}
