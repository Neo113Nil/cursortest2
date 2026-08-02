package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/BotRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableAnyAdapter", "nullableStringAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/MessageContext;", "nullableMessageContextAdapter", "", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "nullableArrayOfErrorAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggest;", "nullableTextSuggestAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$ServerAction;", "nullableServerActionAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BotRequestJsonAdapter extends JsonAdapter<BotRequest> {
    private volatile Constructor<BotRequest> constructorRef;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<BotRequest.Error[]> nullableArrayOfErrorAdapter;
    private final JsonAdapter<MessageContext> nullableMessageContextAdapter;
    private final JsonAdapter<BotRequest.ServerAction> nullableServerActionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<BotRequest.TextSuggest> nullableTextSuggestAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ChatId", "CustomPayload", "ActionId", "MessageContext", "Errors", "Suggest", "ServerAction");
    private final JsonAdapter<String> stringAdapter;

    public BotRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "customPayload");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "actionId");
        this.nullableMessageContextAdapter = moshi.adapter(MessageContext.class, emptySet, "messageContext");
        this.nullableArrayOfErrorAdapter = moshi.adapter(Types.arrayOf(BotRequest.Error.class), emptySet, "errors");
        this.nullableTextSuggestAdapter = moshi.adapter(BotRequest.TextSuggest.class, emptySet, "textSuggest");
        this.nullableServerActionAdapter = moshi.adapter(BotRequest.ServerAction.class, emptySet, "serverAction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BotRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        Object obj = null;
        String str2 = null;
        MessageContext messageContext = null;
        BotRequest.Error[] errorArr = null;
        BotRequest.TextSuggest textSuggest = null;
        BotRequest.ServerAction serverAction = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("chatId", "ChatId", jsonReader);
                    }
                    break;
                case 1:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    messageContext = this.nullableMessageContextAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    errorArr = this.nullableArrayOfErrorAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    textSuggest = this.nullableTextSuggestAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    serverAction = this.nullableServerActionAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -127) {
            BotRequest.ServerAction serverAction2 = serverAction;
            BotRequest.TextSuggest textSuggest2 = textSuggest;
            BotRequest.Error[] errorArr2 = errorArr;
            MessageContext messageContext2 = messageContext;
            String str3 = str2;
            Object obj2 = obj;
            String str4 = str;
            if (str4 != null) {
                return new BotRequest(str4, obj2, str3, messageContext2, errorArr2, textSuggest2, serverAction2);
            }
            throw Util.missingProperty("chatId", "ChatId", jsonReader);
        }
        BotRequest.ServerAction serverAction3 = serverAction;
        BotRequest.TextSuggest textSuggest3 = textSuggest;
        BotRequest.Error[] errorArr3 = errorArr;
        MessageContext messageContext3 = messageContext;
        String str5 = str2;
        Object obj3 = obj;
        String str6 = str;
        Constructor<BotRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BotRequest.class.getDeclaredConstructor(String.class, Object.class, String.class, MessageContext.class, BotRequest.Error[].class, BotRequest.TextSuggest.class, BotRequest.ServerAction.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str6 != null) {
            return constructor.newInstance(str6, obj3, str5, messageContext3, errorArr3, textSuggest3, serverAction3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("chatId", "ChatId", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BotRequest botRequest) {
        BotRequest botRequest2 = botRequest;
        if (botRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) botRequest2.getChatId());
        jsonWriter.name("CustomPayload");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) botRequest2.getCustomPayload());
        jsonWriter.name("ActionId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) botRequest2.getActionId());
        jsonWriter.name("MessageContext");
        this.nullableMessageContextAdapter.toJson(jsonWriter, (JsonWriter) botRequest2.getMessageContext());
        jsonWriter.name("Errors");
        this.nullableArrayOfErrorAdapter.toJson(jsonWriter, (JsonWriter) botRequest2.getErrors());
        jsonWriter.name("Suggest");
        this.nullableTextSuggestAdapter.toJson(jsonWriter, (JsonWriter) botRequest2.getTextSuggest());
        jsonWriter.name("ServerAction");
        this.nullableServerActionAdapter.toJson(jsonWriter, (JsonWriter) botRequest2.getServerAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(BotRequest)");
    }
}
