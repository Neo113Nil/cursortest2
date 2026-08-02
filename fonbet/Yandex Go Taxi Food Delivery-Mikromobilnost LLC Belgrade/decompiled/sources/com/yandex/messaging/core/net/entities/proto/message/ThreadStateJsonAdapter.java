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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ThreadStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/ThreadState;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "arrayOfLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThreadStateJsonAdapter extends JsonAdapter<ThreadState> {
    private final JsonAdapter<Long[]> arrayOfLongAdapter;
    private volatile Constructor<ThreadState> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("LastSeqNo", "LastTsMcs", "LastSeenByMeSeqNo", "LastSeenByMeTsMcs", "MentionTsMcs", "HistoryStartTsMcs", "LastSeenByMeVersion");

    public ThreadStateJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "lastSeqNo");
        this.arrayOfLongAdapter = moshi.adapter(Types.arrayOf(Long.class), emptySet, "mentions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ThreadState fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        Long l = 0L;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        Long[] lArr = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    l5 = this.longAdapter.fromJson(jsonReader);
                    if (l5 == null) {
                        throw Util.unexpectedNull("lastSeqNo", "LastSeqNo", jsonReader);
                    }
                    break;
                case 1:
                    l6 = this.longAdapter.fromJson(jsonReader);
                    if (l6 == null) {
                        throw Util.unexpectedNull("lastTimestamp", "LastTsMcs", jsonReader);
                    }
                    break;
                case 2:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("lastSeenSeqNo", "LastSeenByMeSeqNo", jsonReader);
                    }
                    i &= -5;
                    break;
                case 3:
                    l2 = this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        throw Util.unexpectedNull("lastSeenTimestamp", "LastSeenByMeTsMcs", jsonReader);
                    }
                    i &= -9;
                    break;
                case 4:
                    lArr = this.arrayOfLongAdapter.fromJson(jsonReader);
                    if (lArr == null) {
                        throw Util.unexpectedNull("mentions", "MentionTsMcs", jsonReader);
                    }
                    i &= -17;
                    break;
                case 5:
                    l3 = this.longAdapter.fromJson(jsonReader);
                    if (l3 == null) {
                        throw Util.unexpectedNull("historyStartTimestamp", "HistoryStartTsMcs", jsonReader);
                    }
                    i &= -33;
                    break;
                case 6:
                    l4 = this.longAdapter.fromJson(jsonReader);
                    if (l4 == null) {
                        throw Util.unexpectedNull("lastSeenByMeVersion", "LastSeenByMeVersion", jsonReader);
                    }
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -125) {
            if (l5 == null) {
                throw Util.missingProperty("lastSeqNo", "LastSeqNo", jsonReader);
            }
            long longValue = l5.longValue();
            if (l6 != null) {
                return new ThreadState(longValue, l6.longValue(), l.longValue(), l2.longValue(), lArr, l3.longValue(), l4.longValue());
            }
            throw Util.missingProperty("lastTimestamp", "LastTsMcs", jsonReader);
        }
        Constructor<ThreadState> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            constructor = ThreadState.class.getDeclaredConstructor(cls3, cls3, cls3, cls3, Long[].class, cls3, cls3, cls, cls2);
            this.constructorRef = constructor;
        }
        Constructor<ThreadState> constructor2 = constructor;
        if (l5 == null) {
            throw Util.missingProperty("lastSeqNo", "LastSeqNo", jsonReader);
        }
        if (l6 == null) {
            throw Util.missingProperty("lastTimestamp", "LastTsMcs", jsonReader);
        }
        return constructor2.newInstance(l5, l6, l, l2, lArr, l3, l4, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ThreadState threadState) {
        ThreadState threadState2 = threadState;
        if (threadState2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("LastSeqNo");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(threadState2.getLastSeqNo()));
        jsonWriter.name("LastTsMcs");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(threadState2.getLastTimestamp()));
        jsonWriter.name("LastSeenByMeSeqNo");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(threadState2.getLastSeenSeqNo()));
        jsonWriter.name("LastSeenByMeTsMcs");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(threadState2.getLastSeenTimestamp()));
        jsonWriter.name("MentionTsMcs");
        this.arrayOfLongAdapter.toJson(jsonWriter, (JsonWriter) threadState2.getMentions());
        jsonWriter.name("HistoryStartTsMcs");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(threadState2.getHistoryStartTimestamp()));
        jsonWriter.name("LastSeenByMeVersion");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(threadState2.getLastSeenByMeVersion()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(ThreadState)");
    }
}
