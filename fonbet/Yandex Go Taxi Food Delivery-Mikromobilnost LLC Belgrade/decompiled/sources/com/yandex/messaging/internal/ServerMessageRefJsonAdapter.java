package com.yandex.messaging.internal;

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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/internal/ServerMessageRefJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/ServerMessageRef;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ServerMessageRefJsonAdapter extends JsonAdapter<ServerMessageRef> {
    private volatile Constructor<ServerMessageRef> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ClidProvider.TIMESTAMP, "chatId");

    public ServerMessageRefJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, ClidProvider.TIMESTAMP);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "chatId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ServerMessageRef fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (l != null) {
                return new ServerMessageRef(l.longValue(), str);
            }
            throw Util.missingProperty(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
        }
        Constructor<ServerMessageRef> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ServerMessageRef.class.getDeclaredConstructor(Long.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (l != null) {
            return constructor.newInstance(l, str, Integer.valueOf(i), null);
        }
        throw Util.missingProperty(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ServerMessageRef serverMessageRef) {
        ServerMessageRef serverMessageRef2 = serverMessageRef;
        if (serverMessageRef2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ClidProvider.TIMESTAMP);
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(serverMessageRef2.getTimestamp()));
        jsonWriter.name("chatId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) serverMessageRef2.getChatId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ServerMessageRef)");
    }
}
