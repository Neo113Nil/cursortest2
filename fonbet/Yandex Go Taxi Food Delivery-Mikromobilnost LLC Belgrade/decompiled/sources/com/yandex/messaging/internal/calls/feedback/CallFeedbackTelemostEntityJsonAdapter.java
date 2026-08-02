package com.yandex.messaging.internal.calls.feedback;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.auth.LegacyAccountType;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/internal/calls/feedback/CallFeedbackTelemostEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/calls/feedback/CallFeedbackTelemostEntity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "", "intAdapter", "", "listOfStringAdapter", "nullableBooleanAdapter", "", "nullableLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CallFeedbackTelemostEntityJsonAdapter extends JsonAdapter<CallFeedbackTelemostEntity> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CallFeedbackTelemostEntity> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("event_type", "meeting_id", "user_guid", "platform", "version", "is_user_b2b", "organization_id", "rating", IssuingDistributionPointExtension.REASONS, "comment", LegacyAccountType.STRING_LOGIN, "os", "device", "client", "call_guid", "uuid", MetaDataField.DEVICE_ID_FIELD, "email", "call_end_reason", "is_initiator", ClidProvider.TIMESTAMP, "chat_id");
    private final JsonAdapter<String> stringAdapter;

    public CallFeedbackTelemostEntityJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "eventType");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "meetingId");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isUserB2B");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "rating");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, IssuingDistributionPointExtension.REASONS);
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isInitiator");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, ClidProvider.TIMESTAMP);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CallFeedbackTelemostEntity fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        String str6 = null;
        Integer num = null;
        List<String> list = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        Boolean bool2 = null;
        Long l = null;
        String str17 = null;
        while (true) {
            String str18 = str;
            String str19 = str2;
            String str20 = str3;
            String str21 = str4;
            if (!jsonReader.hasNext()) {
                String str22 = str5;
                jsonReader.endObject();
                if (i2 == -8202) {
                    if (str20 == null) {
                        throw Util.missingProperty("userGuid", "user_guid", jsonReader);
                    }
                    if (bool == null) {
                        throw Util.missingProperty("isUserB2B", "is_user_b2b", jsonReader);
                    }
                    Integer num2 = num;
                    String str23 = str6;
                    boolean booleanValue = bool.booleanValue();
                    if (num2 == null) {
                        throw Util.missingProperty("rating", "rating", jsonReader);
                    }
                    List<String> list2 = list;
                    int intValue = num2.intValue();
                    if (list2 != null) {
                        return new CallFeedbackTelemostEntity(str18, str19, str20, str21, str22, booleanValue, str23, intValue, list2, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, bool2, l, str17);
                    }
                    throw Util.missingProperty(IssuingDistributionPointExtension.REASONS, IssuingDistributionPointExtension.REASONS, jsonReader);
                }
                Integer num3 = num;
                String str24 = str6;
                Constructor<CallFeedbackTelemostEntity> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Boolean.TYPE;
                    Class cls3 = Integer.TYPE;
                    i = i2;
                    constructor = CallFeedbackTelemostEntity.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, cls2, String.class, cls3, List.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Long.class, String.class, cls3, cls);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<CallFeedbackTelemostEntity> constructor2 = constructor;
                if (str20 == null) {
                    throw Util.missingProperty("userGuid", "user_guid", jsonReader);
                }
                if (bool == null) {
                    throw Util.missingProperty("isUserB2B", "is_user_b2b", jsonReader);
                }
                if (num3 == null) {
                    throw Util.missingProperty("rating", "rating", jsonReader);
                }
                if (list == null) {
                    throw Util.missingProperty(IssuingDistributionPointExtension.REASONS, IssuingDistributionPointExtension.REASONS, jsonReader);
                }
                return constructor2.newInstance(str18, str19, str20, str21, str22, bool, str24, num3, list, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, bool2, l, str17, Integer.valueOf(i), null);
            }
            String str25 = str5;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("eventType", "event_type", jsonReader);
                    }
                    i2 &= -2;
                    str5 = str25;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str3 = str20;
                    str4 = str21;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("userGuid", "user_guid", jsonReader);
                    }
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str4 = str21;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("platform", "platform", jsonReader);
                    }
                    i2 &= -9;
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 5:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isUserB2B", "is_user_b2b", jsonReader);
                    }
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 7:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("rating", "rating", jsonReader);
                    }
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 8:
                    list = this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull(IssuingDistributionPointExtension.REASONS, IssuingDistributionPointExtension.REASONS, jsonReader);
                    }
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 9:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 10:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 11:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 12:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 13:
                    str11 = this.stringAdapter.fromJson(jsonReader);
                    if (str11 == null) {
                        throw Util.unexpectedNull("client", "client", jsonReader);
                    }
                    i2 &= -8193;
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 14:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 15:
                    str13 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 16:
                    str14 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 17:
                    str15 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 18:
                    str16 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 19:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 20:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                case 21:
                    str17 = this.nullableStringAdapter.fromJson(jsonReader);
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
                default:
                    str5 = str25;
                    str = str18;
                    str2 = str19;
                    str3 = str20;
                    str4 = str21;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CallFeedbackTelemostEntity callFeedbackTelemostEntity) {
        CallFeedbackTelemostEntity callFeedbackTelemostEntity2 = callFeedbackTelemostEntity;
        if (callFeedbackTelemostEntity2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("event_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getEventType());
        jsonWriter.name("meeting_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getMeetingId());
        jsonWriter.name("user_guid");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getUserGuid());
        jsonWriter.name("platform");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getPlatform());
        jsonWriter.name("version");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getVersion());
        jsonWriter.name("is_user_b2b");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(callFeedbackTelemostEntity2.isUserB2B()));
        jsonWriter.name("organization_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getOrganizationId());
        jsonWriter.name("rating");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(callFeedbackTelemostEntity2.getRating()));
        jsonWriter.name(IssuingDistributionPointExtension.REASONS);
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getReasons());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getComment());
        jsonWriter.name(LegacyAccountType.STRING_LOGIN);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getLogin());
        jsonWriter.name("os");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getOs());
        jsonWriter.name("device");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getDevice());
        jsonWriter.name("client");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getClient());
        jsonWriter.name("call_guid");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getCallGuid());
        jsonWriter.name("uuid");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getUuid());
        jsonWriter.name(MetaDataField.DEVICE_ID_FIELD);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getDeviceId());
        jsonWriter.name("email");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getEmail());
        jsonWriter.name("call_end_reason");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getCallEndReason());
        jsonWriter.name("is_initiator");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.isInitiator());
        jsonWriter.name(ClidProvider.TIMESTAMP);
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getTimestamp());
        jsonWriter.name("chat_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) callFeedbackTelemostEntity2.getChatId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(CallFeedbackTelemostEntity)");
    }
}
