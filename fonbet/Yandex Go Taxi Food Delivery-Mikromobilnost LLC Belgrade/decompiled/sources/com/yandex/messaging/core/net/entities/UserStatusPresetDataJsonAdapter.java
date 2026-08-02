package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UserStatusPresetDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UserStatusPresetData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserStatusPresetDataJsonAdapter extends JsonAdapter<UserStatusPresetData> {
    private volatile Constructor<UserStatusPresetData> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("availability", "notification_mode", "emoji", "icon_name", "text");
    private final JsonAdapter<String> stringAdapter;

    public UserStatusPresetDataJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "availability");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "emoji");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "iconName");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UserStatusPresetData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("availability", "availability", jsonReader);
                }
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("notificationMode", "notification_mode", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("emoji", "emoji", jsonReader);
                }
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i = -9;
            } else if (selectName == 4 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("text", "text", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            String str4 = str;
            if (num == null) {
                throw Util.missingProperty("availability", "availability", jsonReader);
            }
            String str5 = str2;
            int intValue = num.intValue();
            if (num2 == null) {
                throw Util.missingProperty("notificationMode", "notification_mode", jsonReader);
            }
            String str6 = str3;
            int intValue2 = num2.intValue();
            if (str4 == null) {
                throw Util.missingProperty("emoji", "emoji", jsonReader);
            }
            if (str6 != null) {
                return new UserStatusPresetData(intValue, intValue2, str4, str5, str6);
            }
            throw Util.missingProperty("text", "text", jsonReader);
        }
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        Constructor<UserStatusPresetData> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = UserStatusPresetData.class.getDeclaredConstructor(cls2, cls2, String.class, String.class, String.class, cls2, cls);
            this.constructorRef = constructor;
        }
        Constructor<UserStatusPresetData> constructor2 = constructor;
        if (num == null) {
            throw Util.missingProperty("availability", "availability", jsonReader);
        }
        if (num2 == null) {
            throw Util.missingProperty("notificationMode", "notification_mode", jsonReader);
        }
        if (str7 == null) {
            throw Util.missingProperty("emoji", "emoji", jsonReader);
        }
        if (str9 != null) {
            return constructor2.newInstance(num, num2, str7, str8, str9, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UserStatusPresetData userStatusPresetData) {
        UserStatusPresetData userStatusPresetData2 = userStatusPresetData;
        if (userStatusPresetData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("availability");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(userStatusPresetData2.getAvailability()));
        jsonWriter.name("notification_mode");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(userStatusPresetData2.getNotificationMode()));
        jsonWriter.name("emoji");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) userStatusPresetData2.getEmoji());
        jsonWriter.name("icon_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) userStatusPresetData2.getIconName());
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) userStatusPresetData2.getText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(UserStatusPresetData)");
    }
}
