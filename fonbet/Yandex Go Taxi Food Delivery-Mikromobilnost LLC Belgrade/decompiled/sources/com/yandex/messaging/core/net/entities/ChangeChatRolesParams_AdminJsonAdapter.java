package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.ChangeChatRolesParams;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams_AdminJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Admin;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/ChangeChatRolesParams$Users;", "usersAdapter", "Lcom/squareup/moshi/JsonAdapter;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChangeChatRolesParams_AdminJsonAdapter extends JsonAdapter<ChangeChatRolesParams.Admin> {
    private final JsonReader.Options options = JsonReader.Options.of(CSPDirectoryConstants.SUBDIRECTORY_USERS);
    private final JsonAdapter<ChangeChatRolesParams.Users> usersAdapter;

    public ChangeChatRolesParams_AdminJsonAdapter(Moshi moshi) {
        this.usersAdapter = moshi.adapter(ChangeChatRolesParams.Users.class, EmptySet.a, CSPDirectoryConstants.SUBDIRECTORY_USERS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChangeChatRolesParams.Admin fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ChangeChatRolesParams.Users users = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (users = this.usersAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
            }
        }
        jsonReader.endObject();
        if (users != null) {
            return new ChangeChatRolesParams.Admin(users);
        }
        throw Util.missingProperty(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChangeChatRolesParams.Admin admin) {
        ChangeChatRolesParams.Admin admin2 = admin;
        if (admin2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(CSPDirectoryConstants.SUBDIRECTORY_USERS);
        this.usersAdapter.toJson(jsonWriter, (JsonWriter) admin2.getUsers());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(ChangeChatRolesParams.Admin)");
    }
}
