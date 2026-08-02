package ru.ok.android.webrtc.connection;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.command.SignalingCommand;

/* loaded from: classes9.dex */
public final class BadConnectionSignaling {
    public static final BadConnectionSignaling INSTANCE = new BadConnectionSignaling();
    public static final String KEY_BAD_NET_BITRATE = "bitrate";
    public static final String KEY_BAD_NET_LOSS = "loss";
    public static final String KEY_BAD_NET_RTT = "rtt";
    public static final String TYPE_BAD_NET = "bad-net";

    public static final SignalingCommand createBadNetMessage(boolean z, CallParticipant.ParticipantId participantId) {
        try {
            return SignalingProtocol.createCustomData(participantId, new JSONObject().put("sdk", new JSONObject().put("type", TYPE_BAD_NET).put("value", z)));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static final SignalingCommand createBadNetMessage(CallParticipant.ParticipantId participantId, double d, double d2, double d3) {
        try {
            JSONObject put = new JSONObject().put("type", TYPE_BAD_NET).put(KEY_BAD_NET_LOSS, d2).put("rtt", d);
            if (Math.abs(d3) <= Double.MAX_VALUE) {
                put.put(KEY_BAD_NET_BITRATE, d3);
            }
            return SignalingProtocol.createCustomData(participantId, new JSONObject().put("sdk", put));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
