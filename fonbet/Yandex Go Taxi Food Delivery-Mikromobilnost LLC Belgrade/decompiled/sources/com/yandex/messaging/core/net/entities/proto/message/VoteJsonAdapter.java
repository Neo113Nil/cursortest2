package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/VoteJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/Vote;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "", "arrayOfIntAdapter", "intAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;", "nullableMessageRefAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VoteJsonAdapter extends JsonAdapter<Vote> {
    private final JsonAdapter<Integer[]> arrayOfIntAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<MessageRef> nullableMessageRefAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ChatId", "Timestamp", "Choices", "Action", "ForwardMessageRef");
    private final JsonAdapter<String> stringAdapter;

    public VoteJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "messageTimestamp");
        this.arrayOfIntAdapter = moshi.adapter(Types.arrayOf(Integer.class), emptySet, "choices");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "voteAction");
        this.nullableMessageRefAdapter = moshi.adapter(MessageRef.class, emptySet, "forwardMessageRef");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Vote fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        Integer num = null;
        String str = null;
        Integer[] numArr = null;
        MessageRef messageRef = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            Long l2 = l;
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
                    throw Util.unexpectedNull("messageTimestamp", "Timestamp", jsonReader);
                }
            } else if (selectName == 2) {
                numArr = this.arrayOfIntAdapter.fromJson(jsonReader);
                if (numArr == null) {
                    throw Util.unexpectedNull("choices", "Choices", jsonReader);
                }
            } else if (selectName == 3) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("voteAction", "Action", jsonReader);
                }
            } else if (selectName == 4) {
                messageRef = this.nullableMessageRefAdapter.fromJson(jsonReader);
            }
            l = l2;
        }
        Long l3 = l;
        jsonReader.endObject();
        Integer num2 = num;
        if (str == null) {
            throw Util.missingProperty("chatId", "ChatId", jsonReader);
        }
        if (l3 == null) {
            throw Util.missingProperty("messageTimestamp", "Timestamp", jsonReader);
        }
        long longValue = l3.longValue();
        if (numArr == null) {
            throw Util.missingProperty("choices", "Choices", jsonReader);
        }
        if (num2 != null) {
            return new Vote(str, longValue, numArr, num2.intValue(), messageRef);
        }
        throw Util.missingProperty("voteAction", "Action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Vote vote) {
        Vote vote2 = vote;
        if (vote2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) vote2.getChatId());
        jsonWriter.name("Timestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(vote2.getMessageTimestamp()));
        jsonWriter.name("Choices");
        this.arrayOfIntAdapter.toJson(jsonWriter, (JsonWriter) vote2.getChoices());
        jsonWriter.name("Action");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(vote2.getVoteAction()));
        jsonWriter.name("ForwardMessageRef");
        this.nullableMessageRefAdapter.toJson(jsonWriter, (JsonWriter) vote2.getForwardMessageRef());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(26, "GeneratedJsonAdapter(Vote)");
    }
}
