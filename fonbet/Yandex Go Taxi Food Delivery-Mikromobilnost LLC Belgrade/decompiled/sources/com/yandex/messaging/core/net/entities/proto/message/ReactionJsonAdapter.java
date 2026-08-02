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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ReactionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/Reaction;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReactionJsonAdapter extends JsonAdapter<Reaction> {
    private volatile Constructor<Reaction> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ChatId", "Timestamp", "Type", "Action");
    private final JsonAdapter<String> stringAdapter;

    public ReactionJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Reaction fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = 0L;
        Integer num = 0;
        Integer num2 = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("chatId", "ChatId", jsonReader);
                }
            } else if (selectName == 1) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("type", "Type", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("action", "Action", jsonReader);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -15) {
            if (str == null) {
                throw Util.missingProperty("chatId", "ChatId", jsonReader);
            }
            return new Reaction(str, l.longValue(), num.intValue(), num2.intValue());
        }
        Constructor<Reaction> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Reaction.class.getDeclaredConstructor(String.class, Long.TYPE, cls, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str != null) {
            return constructor.newInstance(str, l, num, num2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("chatId", "ChatId", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Reaction reaction) {
        Reaction reaction2 = reaction;
        if (reaction2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) reaction2.chatId);
        jsonWriter.name("Timestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(reaction2.timestamp));
        jsonWriter.name("Type");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(reaction2.type));
        jsonWriter.name("Action");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(reaction2.action));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(30, "GeneratedJsonAdapter(Reaction)");
    }
}
