package com.yandex.messaging.core.net.entities.proto.message;

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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/UserStatusMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/UserStatusMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/CustomStatusMessage;", "nullableCustomStatusMessageAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserStatusMessageJsonAdapter extends JsonAdapter<UserStatusMessage> {
    private volatile Constructor<UserStatusMessage> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<CustomStatusMessage> nullableCustomStatusMessageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Availability", "NotificationMode", "Duration", "CustomStatus");

    public UserStatusMessageJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "availability");
        this.nullableCustomStatusMessageAdapter = moshi.adapter(CustomStatusMessage.class, emptySet, "customStatus");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UserStatusMessage fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        CustomStatusMessage customStatusMessage = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("availability", "Availability", jsonReader);
                }
            } else if (selectName == 1) {
                num3 = this.intAdapter.fromJson(jsonReader);
                if (num3 == null) {
                    throw Util.unexpectedNull("notificationMode", "NotificationMode", jsonReader);
                }
            } else if (selectName == 2) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("duration", "Duration", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                customStatusMessage = this.nullableCustomStatusMessageAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -13) {
            if (num2 == null) {
                throw Util.missingProperty("availability", "Availability", jsonReader);
            }
            int intValue = num2.intValue();
            if (num3 != null) {
                return new UserStatusMessage(intValue, num3.intValue(), num.intValue(), customStatusMessage);
            }
            throw Util.missingProperty("notificationMode", "NotificationMode", jsonReader);
        }
        Constructor<UserStatusMessage> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = UserStatusMessage.class.getDeclaredConstructor(cls2, cls2, cls2, CustomStatusMessage.class, cls2, cls);
            this.constructorRef = constructor;
        }
        if (num2 == null) {
            throw Util.missingProperty("availability", "Availability", jsonReader);
        }
        if (num3 != null) {
            return constructor.newInstance(num2, num3, num, customStatusMessage, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("notificationMode", "NotificationMode", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UserStatusMessage userStatusMessage) {
        UserStatusMessage userStatusMessage2 = userStatusMessage;
        if (userStatusMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Availability");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(userStatusMessage2.getAvailability()));
        jsonWriter.name("NotificationMode");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(userStatusMessage2.getNotificationMode()));
        jsonWriter.name("Duration");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(userStatusMessage2.getDuration()));
        jsonWriter.name("CustomStatus");
        this.nullableCustomStatusMessageAdapter.toJson(jsonWriter, (JsonWriter) userStatusMessage2.getCustomStatus());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(UserStatusMessage)");
    }
}
