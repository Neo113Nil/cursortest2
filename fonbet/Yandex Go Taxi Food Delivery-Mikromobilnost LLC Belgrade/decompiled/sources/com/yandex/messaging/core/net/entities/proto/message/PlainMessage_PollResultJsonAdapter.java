package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_PollResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "nullableIntArrayAdapter", "", "Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "nullableArrayOfReducedUserInfoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_PollResultJsonAdapter extends JsonAdapter<PlainMessage.PollResult> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PlainMessage.PollResult> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<ReducedUserInfo[]> nullableArrayOfReducedUserInfoAdapter;
    private final JsonAdapter<int[]> nullableIntArrayAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Version", "VotedCount", "Answers", "RecentVoters", "Completed");

    public PlainMessage_PollResultJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "version");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "voteCount");
        this.nullableIntArrayAdapter = moshi.adapter(int[].class, emptySet, "answers");
        this.nullableArrayOfReducedUserInfoAdapter = moshi.adapter(Types.arrayOf(ReducedUserInfo.class), emptySet, "recentVoters");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isCompleted");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.PollResult fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Long l = 0L;
        Integer num = 0;
        Boolean bool2 = bool;
        int[] iArr = null;
        ReducedUserInfo[] reducedUserInfoArr = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("version", "Version", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("voteCount", "VotedCount", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                iArr = this.nullableIntArrayAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                reducedUserInfoArr = this.nullableArrayOfReducedUserInfoAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (selectName == 4) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("isCompleted", "Completed", jsonReader);
                }
                i &= -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -32) {
            return new PlainMessage.PollResult(l.longValue(), num.intValue(), iArr, reducedUserInfoArr, bool2.booleanValue());
        }
        Constructor<PlainMessage.PollResult> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Boolean.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            Class cls4 = Integer.TYPE;
            constructor = PlainMessage.PollResult.class.getDeclaredConstructor(cls3, cls4, int[].class, ReducedUserInfo[].class, cls, cls4, cls2);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(l, num, iArr, reducedUserInfoArr, bool2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.PollResult pollResult) {
        PlainMessage.PollResult pollResult2 = pollResult;
        if (pollResult2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Version");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(pollResult2.version));
        jsonWriter.name("VotedCount");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(pollResult2.voteCount));
        jsonWriter.name("Answers");
        this.nullableIntArrayAdapter.toJson(jsonWriter, (JsonWriter) pollResult2.answers);
        jsonWriter.name("RecentVoters");
        this.nullableArrayOfReducedUserInfoAdapter.toJson(jsonWriter, (JsonWriter) pollResult2.recentVoters);
        jsonWriter.name("Completed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(pollResult2.isCompleted));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(PlainMessage.PollResult)");
    }
}
