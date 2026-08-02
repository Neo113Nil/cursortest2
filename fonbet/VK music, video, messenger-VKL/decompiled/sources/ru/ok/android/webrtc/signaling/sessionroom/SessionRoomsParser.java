package ru.ok.android.webrtc.signaling.sessionroom;

import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.sessionroom.event.SignalingSessionRoom;
import ru.ok.android.webrtc.signaling.sessionroom.event.SignalingSessionRooms;

/* loaded from: classes9.dex */
public final class SessionRoomsParser {
    public final RTCLog a;
    public final SessionRoomCommonParser b;
    public final SessionRoomUpdateParser c;

    public SessionRoomsParser(RTCLog rTCLog, SessionRoomCommonParser sessionRoomCommonParser, SessionRoomUpdateParser sessionRoomUpdateParser) {
        this.a = rTCLog;
        this.b = sessionRoomCommonParser;
        this.c = sessionRoomUpdateParser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    public final SignalingSessionRooms parse(JSONObject jSONObject) {
        try {
            ?? arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_ROOMS);
            if (optJSONArray == null) {
                arrayList = EmptyList.b;
            } else {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    SignalingSessionRoom parseRoomUpdateUnsafe = optJSONObject != null ? this.c.parseRoomUpdateUnsafe(optJSONObject) : null;
                    if (parseRoomUpdateUnsafe != null) {
                        arrayList.add(parseRoomUpdateUnsafe);
                    }
                }
            }
            return new SignalingSessionRooms(this.b.parseRoomIdUnsafe(jSONObject), arrayList);
        } catch (JSONException e) {
            this.a.logException("SessionRoomsParser", "Can't parse rooms state", e);
            return null;
        }
    }
}
