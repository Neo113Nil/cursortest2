package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.UserStatusMessage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/UserStatusInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/UserStatusInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/message/UserStatusMessage;", "userStatusMessageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserStatusInfoJsonAdapter extends JsonAdapter<UserStatusInfo> {
    private volatile Constructor<UserStatusInfo> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("UserStatus", "Timestamp");
    private final JsonAdapter<UserStatusMessage> userStatusMessageAdapter;

    public UserStatusInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.userStatusMessageAdapter = moshi.adapter(UserStatusMessage.class, emptySet, "userStatusMessage");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UserStatusInfo fromJson(JsonReader jsonReader) {
        Long l = 0L;
        jsonReader.beginObject();
        UserStatusMessage userStatusMessage = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                userStatusMessage = this.userStatusMessageAdapter.fromJson(jsonReader);
                if (userStatusMessage == null) {
                    throw Util.unexpectedNull("userStatusMessage", "UserStatus", jsonReader);
                }
            } else if (selectName == 1) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (userStatusMessage != null) {
                return new UserStatusInfo(userStatusMessage, l.longValue());
            }
            throw Util.missingProperty("userStatusMessage", "UserStatus", jsonReader);
        }
        Constructor<UserStatusInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UserStatusInfo.class.getDeclaredConstructor(UserStatusMessage.class, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (userStatusMessage != null) {
            return constructor.newInstance(userStatusMessage, l, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("userStatusMessage", "UserStatus", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UserStatusInfo userStatusInfo) {
        UserStatusInfo userStatusInfo2 = userStatusInfo;
        if (userStatusInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("UserStatus");
        this.userStatusMessageAdapter.toJson(jsonWriter, (JsonWriter) userStatusInfo2.userStatusMessage);
        jsonWriter.name("Timestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(userStatusInfo2.timestamp));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(UserStatusInfo)");
    }
}
