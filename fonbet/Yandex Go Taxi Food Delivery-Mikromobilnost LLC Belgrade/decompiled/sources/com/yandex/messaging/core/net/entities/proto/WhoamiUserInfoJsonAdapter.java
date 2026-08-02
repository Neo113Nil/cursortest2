package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.AccountTypeProto;
import com.yandex.messaging.core.net.entities.proto.message.RobotInfo;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/WhoamiUserInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/WhoamiUserInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "longAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "booleanAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;", "nullableRobotInfoAdapter", "", "Lcom/yandex/messaging/core/net/entities/proto/OrganizationProto;", "nullableArrayOfOrganizationProtoAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/AccountTypeProto;", "nullableAccountTypeProtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WhoamiUserInfoJsonAdapter extends JsonAdapter<WhoamiUserInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<WhoamiUserInfo> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<AccountTypeProto> nullableAccountTypeProtoAdapter;
    private final JsonAdapter<OrganizationProto[]> nullableArrayOfOrganizationProtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<RobotInfo> nullableRobotInfoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("AvatarId", "DisplayName", "Guid", "PhoneId", "Version", "Nickname", "RegistrationStatus", "Phone", "IsRobot", "IsOnboarded", "IsDisplayRestricted", "RobotInfo", "OrganizationInfos", "NeedsMigrationOnboarding", "AccountType");
    private final JsonAdapter<String> stringAdapter;

    public WhoamiUserInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "avatarId");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "userId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "version");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "registrationStatus");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isRobot");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isOnboarded");
        this.nullableRobotInfoAdapter = moshi.adapter(RobotInfo.class, emptySet, "robotInfo");
        this.nullableArrayOfOrganizationProtoAdapter = moshi.adapter(Types.arrayOf(OrganizationProto.class), emptySet, "organizations");
        this.nullableAccountTypeProtoAdapter = moshi.adapter(AccountTypeProto.class, emptySet, "accountType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WhoamiUserInfo fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Long l = 0L;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        String str6 = null;
        Boolean bool5 = null;
        RobotInfo robotInfo = null;
        OrganizationProto[] organizationProtoArr = null;
        AccountTypeProto accountTypeProto = null;
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
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("userId", "Guid", jsonReader);
                    }
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("version", "Version", jsonReader);
                    }
                    i &= -17;
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    str6 = this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("phone", "Phone", jsonReader);
                    }
                    break;
                case 8:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isOnboarded", "IsOnboarded", jsonReader);
                    }
                    i &= -513;
                    break;
                case 10:
                    bool4 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool4 == null) {
                        throw Util.unexpectedNull("isDisplayRestricted", "IsDisplayRestricted", jsonReader);
                    }
                    break;
                case 11:
                    robotInfo = this.nullableRobotInfoAdapter.fromJson(jsonReader);
                    i &= -2049;
                    break;
                case 12:
                    organizationProtoArr = this.nullableArrayOfOrganizationProtoAdapter.fromJson(jsonReader);
                    i &= -4097;
                    break;
                case 13:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("needsMigrationOnboarding", "NeedsMigrationOnboarding", jsonReader);
                    }
                    i &= -8193;
                    break;
                case 14:
                    accountTypeProto = this.nullableAccountTypeProtoAdapter.fromJson(jsonReader);
                    i &= -16385;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -31612) {
            if (str3 == null) {
                throw Util.missingProperty("userId", "Guid", jsonReader);
            }
            long longValue = l.longValue();
            if (str6 == null) {
                throw Util.missingProperty("phone", "Phone", jsonReader);
            }
            boolean booleanValue = bool2.booleanValue();
            if (bool4 != null) {
                return new WhoamiUserInfo(str, str2, str3, str4, longValue, str5, num, str6, bool5, booleanValue, bool4.booleanValue(), robotInfo, organizationProtoArr, bool3.booleanValue(), accountTypeProto);
            }
            throw Util.missingProperty("isDisplayRestricted", "IsDisplayRestricted", jsonReader);
        }
        Constructor<WhoamiUserInfo> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            Class cls4 = Boolean.TYPE;
            constructor = WhoamiUserInfo.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls3, String.class, Integer.class, String.class, Boolean.class, cls4, cls4, RobotInfo.class, OrganizationProto[].class, cls4, AccountTypeProto.class, cls, cls2);
            this.constructorRef = constructor;
        }
        if (str3 == null) {
            throw Util.missingProperty("userId", "Guid", jsonReader);
        }
        if (str6 == null) {
            throw Util.missingProperty("phone", "Phone", jsonReader);
        }
        if (bool4 == null) {
            throw Util.missingProperty("isDisplayRestricted", "IsDisplayRestricted", jsonReader);
        }
        return constructor.newInstance(str, str2, str3, str4, l, str5, num, str6, bool5, bool2, bool4, robotInfo, organizationProtoArr, bool3, accountTypeProto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WhoamiUserInfo whoamiUserInfo) {
        WhoamiUserInfo whoamiUserInfo2 = whoamiUserInfo;
        if (whoamiUserInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("AvatarId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.avatarId);
        jsonWriter.name("DisplayName");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.displayName);
        jsonWriter.name("Guid");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.userId);
        jsonWriter.name("PhoneId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.phoneId);
        jsonWriter.name("Version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(whoamiUserInfo2.version));
        jsonWriter.name("Nickname");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.nickname);
        jsonWriter.name("RegistrationStatus");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.getRegistrationStatus());
        jsonWriter.name("Phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.phone);
        jsonWriter.name("IsRobot");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.isRobot);
        jsonWriter.name("IsOnboarded");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(whoamiUserInfo2.isOnboarded()));
        jsonWriter.name("IsDisplayRestricted");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(whoamiUserInfo2.isDisplayRestricted));
        jsonWriter.name("RobotInfo");
        this.nullableRobotInfoAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.robotInfo);
        jsonWriter.name("OrganizationInfos");
        this.nullableArrayOfOrganizationProtoAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.organizations);
        jsonWriter.name("NeedsMigrationOnboarding");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(whoamiUserInfo2.getNeedsMigrationOnboarding()));
        jsonWriter.name("AccountType");
        this.nullableAccountTypeProtoAdapter.toJson(jsonWriter, (JsonWriter) whoamiUserInfo2.accountType);
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(WhoamiUserInfo)");
    }
}
