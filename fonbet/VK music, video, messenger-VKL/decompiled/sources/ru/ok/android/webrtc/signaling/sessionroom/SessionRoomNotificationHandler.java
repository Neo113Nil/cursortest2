package ru.ok.android.webrtc.signaling.sessionroom;

import org.json.JSONObject;
import ru.ok.android.webrtc.sessionroom.CallSessionRoomsManager;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomParticipantsUpdate;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomUpdatedEvent;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomsUpdatedEvent;
import ru.ok.android.webrtc.signaling.sessionroom.event.SignalingSessionRooms;

/* loaded from: classes9.dex */
public final class SessionRoomNotificationHandler {
    public final SessionRoomUpdateParser a;
    public final SessionRoomParticipantsUpdateParser b;
    public final SessionRoomsParser c;
    public final CallSessionRoomsManager d;

    public SessionRoomNotificationHandler(SessionRoomUpdateParser sessionRoomUpdateParser, SessionRoomParticipantsUpdateParser sessionRoomParticipantsUpdateParser, SessionRoomsParser sessionRoomsParser, CallSessionRoomsManager callSessionRoomsManager) {
        this.a = sessionRoomUpdateParser;
        this.b = sessionRoomParticipantsUpdateParser;
        this.c = sessionRoomsParser;
        this.d = callSessionRoomsManager;
    }

    public final void onConnectionRooms(JSONObject jSONObject) {
        SignalingSessionRooms parse = this.c.parse(jSONObject);
        if (parse == null) {
            return;
        }
        this.d.onRoomsState(parse);
    }

    public final void onRoomParticipantsUpdated(JSONObject jSONObject) {
        SessionRoomParticipantsUpdate parse = this.b.parse(jSONObject);
        if (parse == null) {
            return;
        }
        this.d.onRoomsParticipantsUpdated(parse);
    }

    public final void onRoomUpdated(JSONObject jSONObject) {
        SessionRoomUpdatedEvent parseRoomUpdate = this.a.parseRoomUpdate(jSONObject);
        if (parseRoomUpdate == null) {
            return;
        }
        this.d.onRoomUpdated(parseRoomUpdate);
    }

    public final void onRoomsUpdated(JSONObject jSONObject) {
        SessionRoomsUpdatedEvent parseRoomsUpdate = this.a.parseRoomsUpdate(jSONObject);
        if (parseRoomsUpdate == null) {
            return;
        }
        this.d.onRoomsUpdated(parseRoomsUpdate);
    }
}
