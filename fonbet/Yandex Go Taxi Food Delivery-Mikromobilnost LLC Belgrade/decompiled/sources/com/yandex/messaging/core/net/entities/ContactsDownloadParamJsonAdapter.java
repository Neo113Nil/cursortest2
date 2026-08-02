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

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ContactsDownloadParamJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ContactsDownloadParam;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableLongAdapter", "", "nullableStringAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ContactsDownloadParamJsonAdapter extends JsonAdapter<ContactsDownloadParam> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ContactsDownloadParam> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("version", "version_offset", "guid_offset", "without_deleted", "limit");

    public ContactsDownloadParamJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "version");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "offsetVersion");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "offsetGuid");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "withoutDeleted");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ContactsDownloadParam fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = 0L;
        Long l2 = null;
        Long l3 = null;
        Boolean bool = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l2 = this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    throw Util.unexpectedNull("version", "version", jsonReader);
                }
            } else if (selectName == 1) {
                l3 = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("withoutDeleted", "without_deleted", jsonReader);
                }
            } else if (selectName == 4) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("limit", "limit", jsonReader);
                }
                i = -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            if (l2 == null) {
                throw Util.missingProperty("version", "version", jsonReader);
            }
            long longValue = l2.longValue();
            if (bool == null) {
                throw Util.missingProperty("withoutDeleted", "without_deleted", jsonReader);
            }
            return new ContactsDownloadParam(longValue, l3, str, bool.booleanValue(), l.longValue());
        }
        Constructor<ContactsDownloadParam> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            constructor = ContactsDownloadParam.class.getDeclaredConstructor(cls3, Long.class, String.class, Boolean.TYPE, cls3, cls, cls2);
            this.constructorRef = constructor;
        }
        Constructor<ContactsDownloadParam> constructor2 = constructor;
        if (l2 == null) {
            throw Util.missingProperty("version", "version", jsonReader);
        }
        if (bool == null) {
            throw Util.missingProperty("withoutDeleted", "without_deleted", jsonReader);
        }
        return constructor2.newInstance(l2, l3, str, bool, l, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ContactsDownloadParam contactsDownloadParam) {
        ContactsDownloadParam contactsDownloadParam2 = contactsDownloadParam;
        if (contactsDownloadParam2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(contactsDownloadParam2.getVersion()));
        jsonWriter.name("version_offset");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) contactsDownloadParam2.getOffsetVersion());
        jsonWriter.name("guid_offset");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contactsDownloadParam2.getOffsetGuid());
        jsonWriter.name("without_deleted");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(contactsDownloadParam2.getWithoutDeleted()));
        jsonWriter.name("limit");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(contactsDownloadParam2.getLimit()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ContactsDownloadParam)");
    }
}
