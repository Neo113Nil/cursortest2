package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PollInfoRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/PollInfoRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "longAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;", "nullableMessageRefAdapter", "Lcom/yandex/messaging/core/net/entities/proto/CommonRequestFields;", "commonRequestFieldsAdapter", "", "booleanAdapter", "", "intAdapter", "Lcom/yandex/messaging/core/net/entities/proto/PollInfoRequest$AnswerFilter;", "nullableAnswerFilterAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PollInfoRequestJsonAdapter extends JsonAdapter<PollInfoRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<CommonRequestFields> commonRequestFieldsAdapter;
    private volatile Constructor<PollInfoRequest> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<PollInfoRequest.AnswerFilter> nullableAnswerFilterAdapter;
    private final JsonAdapter<MessageRef> nullableMessageRefAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ChatId", "InviteHash", "Timestamp", "ForwardMessageRef", "CommonRequestFields", "ReturnResults", "Limit", "AnswerFilter");
    private final JsonAdapter<String> stringAdapter;

    public PollInfoRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "inviteHash");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
        this.nullableMessageRefAdapter = moshi.adapter(MessageRef.class, emptySet, "forwardMessageRef");
        this.commonRequestFieldsAdapter = moshi.adapter(CommonRequestFields.class, emptySet, "commonFields");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "returnResults");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "limit");
        this.nullableAnswerFilterAdapter = moshi.adapter(PollInfoRequest.AnswerFilter.class, emptySet, "answerFilter");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PollInfoRequest fromJson(JsonReader jsonReader) {
        int i;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        Integer num = 0;
        String str = null;
        String str2 = null;
        Long l = null;
        PollInfoRequest.AnswerFilter answerFilter = null;
        CommonRequestFields commonRequestFields = null;
        int i2 = -1;
        MessageRef messageRef = null;
        while (true) {
            String str3 = str;
            if (!jsonReader.hasNext()) {
                MessageRef messageRef2 = messageRef;
                jsonReader.endObject();
                if (i2 == -235) {
                    if (str2 == null) {
                        throw Util.missingProperty("chatId", "ChatId", jsonReader);
                    }
                    if (l == null) {
                        throw Util.missingProperty(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
                    }
                    long longValue = l.longValue();
                    if (commonRequestFields == null) {
                        throw Util.missingProperty("commonFields", "CommonRequestFields", jsonReader);
                    }
                    return new PollInfoRequest(str2, str3, longValue, messageRef2, commonRequestFields, bool2.booleanValue(), num.intValue(), answerFilter);
                }
                Constructor<PollInfoRequest> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Long.TYPE;
                    Class cls3 = Boolean.TYPE;
                    Class cls4 = Integer.TYPE;
                    i = i2;
                    constructor = PollInfoRequest.class.getDeclaredConstructor(String.class, String.class, cls2, MessageRef.class, CommonRequestFields.class, cls3, cls4, PollInfoRequest.AnswerFilter.class, cls4, cls);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                if (str2 == null) {
                    throw Util.missingProperty("chatId", "ChatId", jsonReader);
                }
                if (l == null) {
                    throw Util.missingProperty(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
                }
                if (commonRequestFields == null) {
                    throw Util.missingProperty("commonFields", "CommonRequestFields", jsonReader);
                }
                return constructor.newInstance(str2, str3, l, messageRef2, commonRequestFields, bool2, num, answerFilter, Integer.valueOf(i), null);
            }
            MessageRef messageRef3 = messageRef;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str3;
                    messageRef = messageRef3;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("chatId", "ChatId", jsonReader);
                    }
                    str = str3;
                    messageRef = messageRef3;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -3;
                    messageRef = messageRef3;
                case 2:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
                    }
                    str = str3;
                    messageRef = messageRef3;
                case 3:
                    messageRef = this.nullableMessageRefAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    str = str3;
                case 4:
                    commonRequestFields = this.commonRequestFieldsAdapter.fromJson(jsonReader);
                    if (commonRequestFields == null) {
                        throw Util.unexpectedNull("commonFields", "CommonRequestFields", jsonReader);
                    }
                    str = str3;
                    messageRef = messageRef3;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("returnResults", "ReturnResults", jsonReader);
                    }
                    i2 &= -33;
                    str = str3;
                    messageRef = messageRef3;
                case 6:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("limit", "Limit", jsonReader);
                    }
                    i2 &= -65;
                    str = str3;
                    messageRef = messageRef3;
                case 7:
                    answerFilter = this.nullableAnswerFilterAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    str = str3;
                    messageRef = messageRef3;
                default:
                    str = str3;
                    messageRef = messageRef3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PollInfoRequest pollInfoRequest) {
        PollInfoRequest pollInfoRequest2 = pollInfoRequest;
        if (pollInfoRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pollInfoRequest2.chatId);
        jsonWriter.name("InviteHash");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) pollInfoRequest2.inviteHash);
        jsonWriter.name("Timestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(pollInfoRequest2.timestamp));
        jsonWriter.name("ForwardMessageRef");
        this.nullableMessageRefAdapter.toJson(jsonWriter, (JsonWriter) pollInfoRequest2.forwardMessageRef);
        jsonWriter.name("CommonRequestFields");
        this.commonRequestFieldsAdapter.toJson(jsonWriter, (JsonWriter) pollInfoRequest2.commonFields);
        jsonWriter.name("ReturnResults");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(pollInfoRequest2.returnResults));
        jsonWriter.name("Limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(pollInfoRequest2.limit));
        jsonWriter.name("AnswerFilter");
        this.nullableAnswerFilterAdapter.toJson(jsonWriter, (JsonWriter) pollInfoRequest2.answerFilter);
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(PollInfoRequest)");
    }
}
