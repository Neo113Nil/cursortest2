package com.yandex.messaging.core.net.entities.proto.telemost;

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
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingEndRingingMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingEndRingingMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableArrayOfIntAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MeetingEndRingingMessageJsonAdapter extends JsonAdapter<MeetingEndRingingMessage> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Integer[]> nullableArrayOfIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Reason", "SupportedFeatures");

    public MeetingEndRingingMessageJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, CRLReasonCodeExtension.REASON);
        this.nullableArrayOfIntAdapter = moshi.adapter(Types.arrayOf(Integer.class), emptySet, "supportedFeatures");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MeetingEndRingingMessage fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer[] numArr = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull(CRLReasonCodeExtension.REASON, "Reason", jsonReader);
                }
            } else if (selectName == 1) {
                numArr = this.nullableArrayOfIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (num != null) {
            return new MeetingEndRingingMessage(num.intValue(), numArr);
        }
        throw Util.missingProperty(CRLReasonCodeExtension.REASON, "Reason", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MeetingEndRingingMessage meetingEndRingingMessage) {
        MeetingEndRingingMessage meetingEndRingingMessage2 = meetingEndRingingMessage;
        if (meetingEndRingingMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Reason");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(meetingEndRingingMessage2.getReason()));
        jsonWriter.name("SupportedFeatures");
        this.nullableArrayOfIntAdapter.toJson(jsonWriter, (JsonWriter) meetingEndRingingMessage2.getSupportedFeatures());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(MeetingEndRingingMessage)");
    }
}
