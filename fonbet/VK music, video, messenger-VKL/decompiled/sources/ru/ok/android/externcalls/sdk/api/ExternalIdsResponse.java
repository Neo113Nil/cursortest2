package ru.ok.android.externcalls.sdk.api;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public class ExternalIdsResponse {
    public static final JsonParser<ExternalIdsResponse> INSTANCE = new JsonParser<ExternalIdsResponse>() { // from class: ru.ok.android.externcalls.sdk.api.ExternalIdsResponse.1
        private void parseIds(Map<CallParticipant.ParticipantId, ParticipantId> map, @NonNull JsonReader jsonReader, boolean z) throws IOException, JsonTypeMismatchException {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String name = jsonReader.name();
                try {
                    map.put(CallParticipant.ParticipantId.fromStringValue(name), ParticipantId.withoutDeviceId(jsonReader.stringValue(), z));
                } catch (NumberFormatException unused) {
                    GlobalRTCLogger.log(ExternalIdsResponse.LOG_TAG, "got not parsable internal id '" + name + "'");
                }
            }
            jsonReader.endObject();
        }

        @Override // ru.ok.android.api.json.JsonParser
        public ExternalIdsResponse parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
            HashMap hashMap = new HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String name = jsonReader.name();
                name.getClass();
                if (name.equals("external_ids")) {
                    parseIds(hashMap, jsonReader, false);
                } else if (name.equals("anonym_ids")) {
                    parseIds(hashMap, jsonReader, true);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return new ExternalIdsResponse(hashMap);
        }
    };
    private static final String LOG_TAG = "ExternalIdsResponse";
    private final Map<CallParticipant.ParticipantId, ParticipantId> internalToExternal;

    public ExternalIdsResponse(Map<CallParticipant.ParticipantId, ParticipantId> map) {
        this.internalToExternal = map;
    }

    public Map<CallParticipant.ParticipantId, ParticipantId> getMapping() {
        return this.internalToExternal;
    }
}
