package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/PermissionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/chatcreate/Permissions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "arrayOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "arrayOfLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PermissionsJsonAdapter extends JsonAdapter<Permissions> {
    private final JsonAdapter<Long[]> arrayOfLongAdapter;
    private final JsonAdapter<String[]> arrayOfStringAdapter;
    private volatile Constructor<Permissions> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of(CSPDirectoryConstants.SUBDIRECTORY_USERS, "groups", "departments");

    public PermissionsJsonAdapter(Moshi moshi) {
        GenericArrayType arrayOf = Types.arrayOf(String.class);
        EmptySet emptySet = EmptySet.a;
        this.arrayOfStringAdapter = moshi.adapter(arrayOf, emptySet, CSPDirectoryConstants.SUBDIRECTORY_USERS);
        this.arrayOfLongAdapter = moshi.adapter(Types.arrayOf(Long.class), emptySet, "groups");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Permissions fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String[] strArr = null;
        Long[] lArr = null;
        Long[] lArr2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                strArr = this.arrayOfStringAdapter.fromJson(jsonReader);
                if (strArr == null) {
                    throw Util.unexpectedNull(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
                }
            } else if (selectName == 1) {
                lArr = this.arrayOfLongAdapter.fromJson(jsonReader);
                if (lArr == null) {
                    throw Util.unexpectedNull("groups", "groups", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                lArr2 = this.arrayOfLongAdapter.fromJson(jsonReader);
                if (lArr2 == null) {
                    throw Util.unexpectedNull("departments", "departments", jsonReader);
                }
                i &= -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -7) {
            if (strArr != null) {
                return new Permissions(strArr, lArr, lArr2);
            }
            throw Util.missingProperty(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
        }
        Constructor<Permissions> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Permissions.class.getDeclaredConstructor(String[].class, Long[].class, Long[].class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (strArr != null) {
            return constructor.newInstance(strArr, lArr, lArr2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Permissions permissions) {
        Permissions permissions2 = permissions;
        if (permissions2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(CSPDirectoryConstants.SUBDIRECTORY_USERS);
        this.arrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) permissions2.getUsers());
        jsonWriter.name("groups");
        this.arrayOfLongAdapter.toJson(jsonWriter, (JsonWriter) permissions2.getGroups());
        jsonWriter.name("departments");
        this.arrayOfLongAdapter.toJson(jsonWriter, (JsonWriter) permissions2.getDepartments());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(Permissions)");
    }
}
