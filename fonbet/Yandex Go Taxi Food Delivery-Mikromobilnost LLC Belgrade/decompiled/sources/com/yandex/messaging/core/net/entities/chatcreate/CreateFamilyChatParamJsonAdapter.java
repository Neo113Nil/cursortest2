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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/CreateFamilyChatParamJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/chatcreate/CreateFamilyChatParam;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;", "permissionsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/chatcreate/Roles;", "rolesAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreateFamilyChatParamJsonAdapter extends JsonAdapter<CreateFamilyChatParam> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CreateFamilyChatParam> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of("permissions", "roles", "is_family", "public");
    private final JsonAdapter<Permissions> permissionsAdapter;
    private final JsonAdapter<Roles> rolesAdapter;

    public CreateFamilyChatParamJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.permissionsAdapter = moshi.adapter(Permissions.class, emptySet, "permissions");
        this.rolesAdapter = moshi.adapter(Roles.class, emptySet, "roles");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isFamily");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreateFamilyChatParam fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Permissions permissions = null;
        Roles roles = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                permissions = this.permissionsAdapter.fromJson(jsonReader);
                if (permissions == null) {
                    throw Util.unexpectedNull("permissions", "permissions", jsonReader);
                }
            } else if (selectName == 1) {
                roles = this.rolesAdapter.fromJson(jsonReader);
                if (roles == null) {
                    throw Util.unexpectedNull("roles", "roles", jsonReader);
                }
            } else if (selectName == 2) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("isFamily", "is_family", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                bool3 = this.booleanAdapter.fromJson(jsonReader);
                if (bool3 == null) {
                    throw Util.unexpectedNull("isPublic", "public", jsonReader);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -13) {
            if (permissions == null) {
                throw Util.missingProperty("permissions", "permissions", jsonReader);
            }
            if (roles != null) {
                return new CreateFamilyChatParam(permissions, roles, bool2.booleanValue(), bool3.booleanValue());
            }
            throw Util.missingProperty("roles", "roles", jsonReader);
        }
        Constructor<CreateFamilyChatParam> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = CreateFamilyChatParam.class.getDeclaredConstructor(Permissions.class, Roles.class, cls3, cls3, cls, cls2);
            this.constructorRef = constructor;
        }
        if (permissions == null) {
            throw Util.missingProperty("permissions", "permissions", jsonReader);
        }
        if (roles != null) {
            return constructor.newInstance(permissions, roles, bool2, bool3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("roles", "roles", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreateFamilyChatParam createFamilyChatParam) {
        CreateFamilyChatParam createFamilyChatParam2 = createFamilyChatParam;
        if (createFamilyChatParam2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("permissions");
        this.permissionsAdapter.toJson(jsonWriter, (JsonWriter) createFamilyChatParam2.getPermissions());
        jsonWriter.name("roles");
        this.rolesAdapter.toJson(jsonWriter, (JsonWriter) createFamilyChatParam2.getRoles());
        jsonWriter.name("is_family");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(createFamilyChatParam2.isFamily()));
        jsonWriter.name("public");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(createFamilyChatParam2.isPublic()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(CreateFamilyChatParam)");
    }
}
