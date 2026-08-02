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

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/OrganizationSearchDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/OrganizationSearchData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/yandex/messaging/core/net/entities/DepartmentSearchData;", "nullableDepartmentSearchDataAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrganizationSearchDataJsonAdapter extends JsonAdapter<OrganizationSearchData> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<OrganizationSearchData> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<DepartmentSearchData> nullableDepartmentSearchDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("organization_id", "organization_name", "position", "department", "is_guest", "deleted", "guest_organization_name", "display_name");

    public OrganizationSearchDataJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "organizationName");
        this.nullableDepartmentSearchDataAdapter = moshi.adapter(DepartmentSearchData.class, emptySet, "department");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isGuest");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OrganizationSearchData fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Long l = null;
        String str = null;
        String str2 = null;
        DepartmentSearchData departmentSearchData = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("id", "organization_id", jsonReader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    departmentSearchData = this.nullableDepartmentSearchDataAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isGuest", "is_guest", jsonReader);
                    }
                    i &= -17;
                    break;
                case 5:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("deleted", "deleted", jsonReader);
                    }
                    i &= -33;
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -177) {
            if (l != null) {
                return new OrganizationSearchData(l.longValue(), str, str2, departmentSearchData, bool2.booleanValue(), bool3.booleanValue(), str3, str4);
            }
            throw Util.missingProperty("id", "organization_id", jsonReader);
        }
        Constructor<OrganizationSearchData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            Class cls4 = Boolean.TYPE;
            constructor = OrganizationSearchData.class.getDeclaredConstructor(cls3, String.class, String.class, DepartmentSearchData.class, cls4, cls4, String.class, String.class, cls, cls2);
            this.constructorRef = constructor;
        }
        if (l == null) {
            throw Util.missingProperty("id", "organization_id", jsonReader);
        }
        return constructor.newInstance(l, str, str2, departmentSearchData, bool2, bool3, str3, str4, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OrganizationSearchData organizationSearchData) {
        OrganizationSearchData organizationSearchData2 = organizationSearchData;
        if (organizationSearchData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("organization_id");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(organizationSearchData2.getId()));
        jsonWriter.name("organization_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) organizationSearchData2.getOrganizationName());
        jsonWriter.name("position");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) organizationSearchData2.getPosition());
        jsonWriter.name("department");
        this.nullableDepartmentSearchDataAdapter.toJson(jsonWriter, (JsonWriter) organizationSearchData2.getDepartment());
        jsonWriter.name("is_guest");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(organizationSearchData2.isGuest()));
        jsonWriter.name("deleted");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(organizationSearchData2.getDeleted()));
        jsonWriter.name("guest_organization_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) organizationSearchData2.getGuestName());
        jsonWriter.name("display_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) organizationSearchData2.getDisplayName());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(OrganizationSearchData)");
    }
}
