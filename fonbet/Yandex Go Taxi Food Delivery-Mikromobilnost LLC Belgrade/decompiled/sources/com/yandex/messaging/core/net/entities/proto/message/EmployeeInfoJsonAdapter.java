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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EmployeeInfoJsonAdapter extends JsonAdapter<EmployeeInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<EmployeeInfo> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Position", "OrganizationId", "OrganizationName", "IsGuest", "GuestOrganizationName", "Deleted", "DisplayName");

    public EmployeeInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "position");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "organizationId");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isGuest");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EmployeeInfo fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Long l = 0L;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("organizationId", "OrganizationId", jsonReader);
                    }
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isGuest", "IsGuest", jsonReader);
                    }
                    i &= -9;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("deleted", "Deleted", jsonReader);
                    }
                    i &= -33;
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -128) {
            return new EmployeeInfo(str, l.longValue(), str2, bool2.booleanValue(), str3, bool3.booleanValue(), str4);
        }
        Constructor<EmployeeInfo> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            Class cls4 = Boolean.TYPE;
            constructor = EmployeeInfo.class.getDeclaredConstructor(String.class, cls3, String.class, cls4, String.class, cls4, String.class, cls, cls2);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(str, l, str2, bool2, str3, bool3, str4, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EmployeeInfo employeeInfo) {
        EmployeeInfo employeeInfo2 = employeeInfo;
        if (employeeInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Position");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) employeeInfo2.getPosition());
        jsonWriter.name("OrganizationId");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(employeeInfo2.getOrganizationId()));
        jsonWriter.name("OrganizationName");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) employeeInfo2.getOrganizationName());
        jsonWriter.name("IsGuest");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(employeeInfo2.isGuest()));
        jsonWriter.name("GuestOrganizationName");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) employeeInfo2.getGuestOrganizationName());
        jsonWriter.name("Deleted");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(employeeInfo2.getDeleted()));
        jsonWriter.name("DisplayName");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) employeeInfo2.getDisplayName());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(EmployeeInfo)");
    }
}
