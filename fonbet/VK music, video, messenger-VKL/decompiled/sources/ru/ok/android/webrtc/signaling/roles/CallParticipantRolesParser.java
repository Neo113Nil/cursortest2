package ru.ok.android.webrtc.signaling.roles;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public final class CallParticipantRolesParser {
    public final CallParticipant.Role parseRole(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1290540065) {
            if (str.equals(SignalingProtocol.KEY_ROLE_SPEAKER)) {
                return CallParticipant.Role.SPEAKER;
            }
            return null;
        }
        if (hashCode == 62130991) {
            if (str.equals("ADMIN")) {
                return CallParticipant.Role.ADMIN;
            }
            return null;
        }
        if (hashCode == 1746537484 && str.equals(SignalingProtocol.KEY_ROLE_CREATOR)) {
            return CallParticipant.Role.CREATOR;
        }
        return null;
    }
}
