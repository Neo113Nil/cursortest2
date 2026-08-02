package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;", "pollResultAdapter", "", "intArrayAdapter", "", "Lcom/yandex/messaging/core/net/entities/proto/PollInfoResponse$AnswerVotes;", "nullableArrayOfAnswerVotesAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PollInfoResponseJsonAdapter extends JsonAdapter<PollInfoResponse> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<int[]> intArrayAdapter;
    private final JsonAdapter<PollInfoResponse.AnswerVotes[]> nullableArrayOfAnswerVotesAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Status", "Results", "MyChoices", "AnswerVotes");
    private final JsonAdapter<PlainMessage.PollResult> pollResultAdapter;

    public PollInfoResponseJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, ACSPConstants.STATUS);
        this.pollResultAdapter = moshi.adapter(PlainMessage.PollResult.class, emptySet, "results");
        this.intArrayAdapter = moshi.adapter(int[].class, emptySet, "myChoices");
        this.nullableArrayOfAnswerVotesAdapter = moshi.adapter(Types.arrayOf(PollInfoResponse.AnswerVotes.class), emptySet, "answerVotes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PollInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        PlainMessage.PollResult pollResult = null;
        int[] iArr = null;
        PollInfoResponse.AnswerVotes[] answerVotesArr = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, "Status", jsonReader);
                }
            } else if (selectName == 1) {
                pollResult = this.pollResultAdapter.fromJson(jsonReader);
                if (pollResult == null) {
                    throw Util.unexpectedNull("results", "Results", jsonReader);
                }
            } else if (selectName == 2) {
                iArr = this.intArrayAdapter.fromJson(jsonReader);
                if (iArr == null) {
                    throw Util.unexpectedNull("myChoices", "MyChoices", jsonReader);
                }
            } else if (selectName == 3) {
                answerVotesArr = this.nullableArrayOfAnswerVotesAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, "Status", jsonReader);
        }
        int intValue = num.intValue();
        if (pollResult == null) {
            throw Util.missingProperty("results", "Results", jsonReader);
        }
        if (iArr != null) {
            return new PollInfoResponse(intValue, pollResult, iArr, answerVotesArr);
        }
        throw Util.missingProperty("myChoices", "MyChoices", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PollInfoResponse pollInfoResponse) {
        PollInfoResponse pollInfoResponse2 = pollInfoResponse;
        if (pollInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Status");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(pollInfoResponse2.getStatus()));
        jsonWriter.name("Results");
        this.pollResultAdapter.toJson(jsonWriter, (JsonWriter) pollInfoResponse2.getResults());
        jsonWriter.name("MyChoices");
        this.intArrayAdapter.toJson(jsonWriter, (JsonWriter) pollInfoResponse2.getMyChoices());
        jsonWriter.name("AnswerVotes");
        this.nullableArrayOfAnswerVotesAdapter.toJson(jsonWriter, (JsonWriter) pollInfoResponse2.getAnswerVotes());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(PollInfoResponse)");
    }
}
