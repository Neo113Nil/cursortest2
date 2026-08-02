package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/OrganizationProtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/OrganizationProto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "booleanAdapter", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrganizationProtoJsonAdapter extends JsonAdapter<OrganizationProto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<OrganizationProto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("OrganizationId", "OrganizationName", "RegistrationStatus", "IsPublic", "Disabled", "IsGuest", "Rights");
    private final JsonAdapter<String> stringAdapter;

    public OrganizationProtoJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "organizationId");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "organizationName");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isPublic");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "organizationRights");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final OrganizationProto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Integer num = 0;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Long l = 0L;
        Integer num2 = null;
        String str = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("organizationId", "OrganizationId", jsonReader);
                    }
                    i &= -2;
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("organizationName", "OrganizationName", jsonReader);
                    }
                    break;
                case 2:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("registrationStatus", "RegistrationStatus", jsonReader);
                    }
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isPublic", "IsPublic", jsonReader);
                    }
                    i &= -9;
                    break;
                case 4:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull(BackendConfig.Restrictions.DISABLED, "Disabled", jsonReader);
                    }
                    i &= -17;
                    break;
                case 5:
                    bool4 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool4 == null) {
                        throw Util.unexpectedNull("isGuest", "IsGuest", jsonReader);
                    }
                    i &= -33;
                    break;
                case 6:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("organizationRights", "Rights", jsonReader);
                    }
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -122) {
            int intValue = num.intValue();
            if (str == null) {
                throw Util.missingProperty("organizationName", "OrganizationName", jsonReader);
            }
            if (num2 != null) {
                return new OrganizationProto(intValue, str, num2.intValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), l.longValue());
            }
            throw Util.missingProperty("registrationStatus", "RegistrationStatus", jsonReader);
        }
        Constructor<OrganizationProto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Integer.TYPE;
            Class cls4 = Boolean.TYPE;
            constructor = OrganizationProto.class.getDeclaredConstructor(cls3, String.class, cls3, cls4, cls4, cls4, cls, cls3, cls2);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("organizationName", "OrganizationName", jsonReader);
        }
        if (num2 == null) {
            throw Util.missingProperty("registrationStatus", "RegistrationStatus", jsonReader);
        }
        return constructor.newInstance(num, str, num2, bool2, bool3, bool4, l, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, OrganizationProto organizationProto) {
        OrganizationProto organizationProto2 = organizationProto;
        if (organizationProto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("OrganizationId");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(organizationProto2.getOrganizationId()));
        jsonWriter.name("OrganizationName");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) organizationProto2.getOrganizationName());
        jsonWriter.name("RegistrationStatus");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(organizationProto2.getRegistrationStatus()));
        jsonWriter.name("IsPublic");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(organizationProto2.isPublic()));
        jsonWriter.name("Disabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(organizationProto2.getDisabled()));
        jsonWriter.name("IsGuest");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(organizationProto2.isGuest()));
        jsonWriter.name("Rights");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(organizationProto2.getOrganizationRights()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(OrganizationProto)");
    }
}
