package com.yandex.messaging.core.net.entities.proto;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PostMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/PostMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/message/ClientMessage;", "clientMessageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/MessageMeta;", "messageMetaAdapter", "Lcom/yandex/messaging/core/net/entities/proto/ClientTransportId;", "nullableClientTransportIdAdapter", "", "nullableLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PostMessageJsonAdapter extends JsonAdapter<PostMessage> {
    private final JsonAdapter<ClientMessage> clientMessageAdapter;
    private volatile Constructor<PostMessage> constructorRef;
    private final JsonAdapter<MessageMeta> messageMetaAdapter;
    private final JsonAdapter<ClientTransportId> nullableClientTransportIdAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ClientMessage", "Meta", "ClientTransportId", "ClientSupportedFeatures");

    public PostMessageJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.clientMessageAdapter = moshi.adapter(ClientMessage.class, emptySet, "clientMessage");
        this.messageMetaAdapter = moshi.adapter(MessageMeta.class, emptySet, Constants.REFERRER_API_META);
        this.nullableClientTransportIdAdapter = moshi.adapter(ClientTransportId.class, emptySet, "clientTransportId");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "clientSupportedFeatures");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PostMessage fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ClientMessage clientMessage = null;
        MessageMeta messageMeta = null;
        ClientTransportId clientTransportId = null;
        Long l = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                clientMessage = this.clientMessageAdapter.fromJson(jsonReader);
                if (clientMessage == null) {
                    throw Util.unexpectedNull("clientMessage", "ClientMessage", jsonReader);
                }
            } else if (selectName == 1) {
                messageMeta = this.messageMetaAdapter.fromJson(jsonReader);
                if (messageMeta == null) {
                    throw Util.unexpectedNull(Constants.REFERRER_API_META, "Meta", jsonReader);
                }
            } else if (selectName == 2) {
                clientTransportId = this.nullableClientTransportIdAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -13) {
            if (clientMessage == null) {
                throw Util.missingProperty("clientMessage", "ClientMessage", jsonReader);
            }
            if (messageMeta != null) {
                return new PostMessage(clientMessage, messageMeta, clientTransportId, l);
            }
            throw Util.missingProperty(Constants.REFERRER_API_META, "Meta", jsonReader);
        }
        Constructor<PostMessage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PostMessage.class.getDeclaredConstructor(ClientMessage.class, MessageMeta.class, ClientTransportId.class, Long.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (clientMessage == null) {
            throw Util.missingProperty("clientMessage", "ClientMessage", jsonReader);
        }
        if (messageMeta != null) {
            return constructor.newInstance(clientMessage, messageMeta, clientTransportId, l, Integer.valueOf(i), null);
        }
        throw Util.missingProperty(Constants.REFERRER_API_META, "Meta", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PostMessage postMessage) {
        PostMessage postMessage2 = postMessage;
        if (postMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ClientMessage");
        this.clientMessageAdapter.toJson(jsonWriter, (JsonWriter) postMessage2.clientMessage);
        jsonWriter.name("Meta");
        this.messageMetaAdapter.toJson(jsonWriter, (JsonWriter) postMessage2.meta);
        jsonWriter.name("ClientTransportId");
        this.nullableClientTransportIdAdapter.toJson(jsonWriter, (JsonWriter) postMessage2.getClientTransportId());
        jsonWriter.name("ClientSupportedFeatures");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) postMessage2.getClientSupportedFeatures());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(PostMessage)");
    }
}
