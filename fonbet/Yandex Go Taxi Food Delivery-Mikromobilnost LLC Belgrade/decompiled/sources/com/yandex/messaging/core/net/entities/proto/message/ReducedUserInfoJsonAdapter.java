package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "longAdapter", "", "nullableBooleanAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;", "nullableRobotInfoAdapter", "", "Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfo;", "nullableArrayOfEmployeeInfoAdapter", "booleanAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationDescriptor;", "nullableLocalizationDescriptorAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReducedUserInfoJsonAdapter extends JsonAdapter<ReducedUserInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ReducedUserInfo> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<EmployeeInfo[]> nullableArrayOfEmployeeInfoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<LocalizationDescriptor> nullableLocalizationDescriptorAdapter;
    private final JsonAdapter<RobotInfo> nullableRobotInfoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("AvatarId", "DisplayName", "Guid", "PhoneId", "Version", "Nickname", "IsRobot", "IsDisplayRestricted", "RobotInfo", "EmployeeInfos", "AccountDeleted", "LocalizationDescriptor");
    private final JsonAdapter<String> stringAdapter;

    public ReducedUserInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "avatarId");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "userId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "version");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isRobot");
        this.nullableRobotInfoAdapter = moshi.adapter(RobotInfo.class, emptySet, "robotInfo");
        this.nullableArrayOfEmployeeInfoAdapter = moshi.adapter(Types.arrayOf(EmployeeInfo.class), emptySet, "employeeInfos");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "deleted");
        this.nullableLocalizationDescriptorAdapter = moshi.adapter(LocalizationDescriptor.class, emptySet, "localizationDescriptor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ReducedUserInfo fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Long l = 0L;
        Boolean bool2 = bool;
        RobotInfo robotInfo = null;
        EmployeeInfo[] employeeInfoArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        LocalizationDescriptor localizationDescriptor = null;
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
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    robotInfo = this.nullableRobotInfoAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    employeeInfoArr = this.nullableArrayOfEmployeeInfoAdapter.fromJson(jsonReader);
                    i &= -513;
                    break;
                case 10:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("deleted", "AccountDeleted", jsonReader);
                    }
                    i &= -1025;
                    break;
                case 11:
                    localizationDescriptor = this.nullableLocalizationDescriptorAdapter.fromJson(jsonReader);
                    i &= -2049;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -4092) {
            if (str3 == null) {
                throw Util.missingProperty("userId", "Guid", jsonReader);
            }
            return new ReducedUserInfo(str, str2, str3, str4, l.longValue(), str5, bool3, bool4, robotInfo, employeeInfoArr, bool2.booleanValue(), localizationDescriptor);
        }
        Constructor<ReducedUserInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReducedUserInfo.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Long.TYPE, String.class, Boolean.class, Boolean.class, RobotInfo.class, EmployeeInfo[].class, Boolean.TYPE, LocalizationDescriptor.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str3 == null) {
            throw Util.missingProperty("userId", "Guid", jsonReader);
        }
        return constructor.newInstance(str, str2, str3, str4, l, str5, bool3, bool4, robotInfo, employeeInfoArr, bool2, localizationDescriptor, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ReducedUserInfo reducedUserInfo) {
        ReducedUserInfo reducedUserInfo2 = reducedUserInfo;
        if (reducedUserInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("AvatarId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.avatarId);
        jsonWriter.name("DisplayName");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.displayName);
        jsonWriter.name("Guid");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.userId);
        jsonWriter.name("PhoneId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.phoneId);
        jsonWriter.name("Version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(reducedUserInfo2.version));
        jsonWriter.name("Nickname");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.nickname);
        jsonWriter.name("IsRobot");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.isRobot);
        jsonWriter.name("IsDisplayRestricted");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.isDisplayRestricted);
        jsonWriter.name("RobotInfo");
        this.nullableRobotInfoAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.robotInfo);
        jsonWriter.name("EmployeeInfos");
        this.nullableArrayOfEmployeeInfoAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.employeeInfos);
        jsonWriter.name("AccountDeleted");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(reducedUserInfo2.deleted));
        jsonWriter.name("LocalizationDescriptor");
        this.nullableLocalizationDescriptorAdapter.toJson(jsonWriter, (JsonWriter) reducedUserInfo2.getLocalizationDescriptor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(ReducedUserInfo)");
    }
}
