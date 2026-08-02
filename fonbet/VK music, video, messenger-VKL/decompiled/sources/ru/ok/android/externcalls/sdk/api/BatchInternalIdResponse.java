package ru.ok.android.externcalls.sdk.api;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.vu6;

/* loaded from: classes9.dex */
public class BatchInternalIdResponse {
    public static final JsonParser<BatchInternalIdResponse> PARSER = new vu6();

    @NonNull
    public final Map<ParticipantId, CallParticipant.ParticipantId> externalToInternalIdsMap;

    public BatchInternalIdResponse(@NonNull Map<ParticipantId, CallParticipant.ParticipantId> map) {
        this.externalToInternalIdsMap = map;
    }

    public static BatchInternalIdResponse parse(JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.name().equals("ids")) {
                readIdsArray(jsonReader, hashMap);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new BatchInternalIdResponse(hashMap);
    }

    private static ParticipantId readExternalId(@NonNull JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        jsonReader.beginObject();
        String str = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            name.getClass();
            if (name.equals("id")) {
                str = jsonReader.stringValue();
            } else if (name.equals("ok_anonym")) {
                bool = Boolean.valueOf(jsonReader.booleanValue());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null || bool == null) {
            return null;
        }
        return ParticipantId.withoutDeviceId(str, bool.booleanValue());
    }

    private static void readIdMapping(@NonNull JsonReader jsonReader, @NonNull Map<ParticipantId, CallParticipant.ParticipantId> map) throws IOException, JsonTypeMismatchException {
        jsonReader.beginObject();
        CallParticipant.ParticipantId participantId = null;
        ParticipantId participantId2 = null;
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            name.getClass();
            if (name.equals("external_user_id")) {
                participantId2 = readExternalId(jsonReader);
            } else if (name.equals("ok_user_id")) {
                participantId = CallParticipant.ParticipantId.fromStringValue(jsonReader.stringValue());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (participantId == null || participantId2 == null) {
            return;
        }
        map.put(participantId2, participantId);
    }

    private static void readIdsArray(@NonNull JsonReader jsonReader, @NonNull Map<ParticipantId, CallParticipant.ParticipantId> map) throws IOException, JsonTypeMismatchException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            readIdMapping(jsonReader, map);
        }
        jsonReader.endArray();
    }
}
