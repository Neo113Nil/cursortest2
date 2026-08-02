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

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ContactDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ContactData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "stringAdapter", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ContactDataJsonAdapter extends JsonAdapter<ContactData> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ContactData> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("deleted", "contact_name", "avatar_id", "display_name", "guid", "phone_id", "version", "account_deleted", "is_robot", "is_display_restricted");
    private final JsonAdapter<String> stringAdapter;

    public ContactDataJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "deleted");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "contactName");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "userId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "version");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ContactData fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Long l = 0L;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("deleted", "deleted", jsonReader);
                    }
                    i &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("userId", "guid", jsonReader);
                    }
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("version", "version", jsonReader);
                    }
                    i &= -65;
                    break;
                case 7:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("accountDeleted", "account_deleted", jsonReader);
                    }
                    i &= -129;
                    break;
                case 8:
                    bool4 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool4 == null) {
                        throw Util.unexpectedNull("isRobot", "is_robot", jsonReader);
                    }
                    i &= -257;
                    break;
                case 9:
                    bool5 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool5 == null) {
                        throw Util.unexpectedNull("isDisplayRestricted", "is_display_restricted", jsonReader);
                    }
                    i &= -513;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -1008) {
            boolean booleanValue = bool2.booleanValue();
            if (str4 != null) {
                return new ContactData(booleanValue, str, str2, str3, str4, str5, l.longValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue());
            }
            throw Util.missingProperty("userId", "guid", jsonReader);
        }
        Constructor<ContactData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = ContactData.class.getDeclaredConstructor(cls3, String.class, String.class, String.class, String.class, String.class, Long.TYPE, cls3, cls3, cls3, cls, cls2);
            this.constructorRef = constructor;
        }
        if (str4 == null) {
            throw Util.missingProperty("userId", "guid", jsonReader);
        }
        return constructor.newInstance(bool2, str, str2, str3, str4, str5, l, bool3, bool4, bool5, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ContactData contactData) {
        ContactData contactData2 = contactData;
        if (contactData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("deleted");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(contactData2.getDeleted()));
        jsonWriter.name("contact_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contactData2.getContactName());
        jsonWriter.name("avatar_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contactData2.getAvatarId());
        jsonWriter.name("display_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contactData2.getDisplayName());
        jsonWriter.name("guid");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) contactData2.getUserId());
        jsonWriter.name("phone_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contactData2.getPhoneId());
        jsonWriter.name("version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(contactData2.getVersion()));
        jsonWriter.name("account_deleted");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(contactData2.getAccountDeleted()));
        jsonWriter.name("is_robot");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(contactData2.isRobot()));
        jsonWriter.name("is_display_restricted");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(contactData2.isDisplayRestricted()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(ContactData)");
    }
}
