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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage_PollJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Poll;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "arrayOfStringAdapter", "", "booleanAdapter", "", "intAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;", "nullablePollResultAdapter", "", "nullableIntArrayAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessage_PollJsonAdapter extends JsonAdapter<PlainMessage.Poll> {
    private final JsonAdapter<String[]> arrayOfStringAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PlainMessage.Poll> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<int[]> nullableIntArrayAdapter;
    private final JsonAdapter<PlainMessage.PollResult> nullablePollResultAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Title", "Answers", "IsAnonynmous", "MaxChoices", "Results", "MyChoices");
    private final JsonAdapter<String> stringAdapter;

    public PlainMessage_PollJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.arrayOfStringAdapter = moshi.adapter(Types.arrayOf(String.class), emptySet, "answers");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isAnonymous");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "maxChoices");
        this.nullablePollResultAdapter = moshi.adapter(PlainMessage.PollResult.class, emptySet, "pollResults");
        this.nullableIntArrayAdapter = moshi.adapter(int[].class, emptySet, "myChoices");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage.Poll fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        Integer num = 0;
        String[] strArr = null;
        String str = null;
        int[] iArr = null;
        int i = -1;
        PlainMessage.PollResult pollResult = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "Title", jsonReader);
                    }
                    break;
                case 1:
                    strArr = this.arrayOfStringAdapter.fromJson(jsonReader);
                    if (strArr == null) {
                        throw Util.unexpectedNull("answers", "Answers", jsonReader);
                    }
                    break;
                case 2:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isAnonymous", "IsAnonynmous", jsonReader);
                    }
                    i &= -5;
                    break;
                case 3:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("maxChoices", "MaxChoices", jsonReader);
                    }
                    i &= -9;
                    break;
                case 4:
                    pollResult = this.nullablePollResultAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    iArr = this.nullableIntArrayAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -29) {
            if (str == null) {
                throw Util.missingProperty("title", "Title", jsonReader);
            }
            if (strArr == null) {
                throw Util.missingProperty("answers", "Answers", jsonReader);
            }
            return new PlainMessage.Poll(str, strArr, bool2.booleanValue(), num.intValue(), pollResult, iArr);
        }
        Constructor<PlainMessage.Poll> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            constructor = PlainMessage.Poll.class.getDeclaredConstructor(String.class, String[].class, cls2, cls3, PlainMessage.PollResult.class, int[].class, cls3, cls);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("title", "Title", jsonReader);
        }
        if (strArr == null) {
            throw Util.missingProperty("answers", "Answers", jsonReader);
        }
        return constructor.newInstance(str, strArr, bool2, num, pollResult, iArr, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage.Poll poll) {
        PlainMessage.Poll poll2 = poll;
        if (poll2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) poll2.title);
        jsonWriter.name("Answers");
        this.arrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) poll2.answers);
        jsonWriter.name("IsAnonynmous");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(poll2.isAnonymous));
        jsonWriter.name("MaxChoices");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(poll2.maxChoices));
        jsonWriter.name("Results");
        this.nullablePollResultAdapter.toJson(jsonWriter, (JsonWriter) poll2.pollResults);
        jsonWriter.name("MyChoices");
        this.nullableIntArrayAdapter.toJson(jsonWriter, (JsonWriter) poll2.myChoices);
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(PlainMessage.Poll)");
    }
}
