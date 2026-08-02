package ru.ok.android.webrtc.protocol.impl.serializers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.protocol.RtcNotificationSerializer;
import ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException;
import ru.ok.android.webrtc.protocol.notifications.AudioActivityNotification;
import ru.ok.android.webrtc.protocol.notifications.SpeakerChangedNotification;
import ru.ok.android.webrtc.protocol.notifications.StalledParticipantsNotification;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public class RtcNotificationsJsonSerializer implements RtcNotificationSerializer {
    @Override // ru.ok.android.webrtc.protocol.RtcNotificationSerializer
    @Nullable
    public RtcNotification deserialize(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) throws RtcNotificationSerializeException {
        if (bArr == null) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Illegal 'value' value: null"));
        }
        if (rtcFormat == null) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Illegal 'format' value: null"));
        }
        if (rtcFormat != RtcFormat.TEXT) {
            throw new RtcNotificationSerializeException(new UnsupportedOperationException("Only text format is supported"));
        }
        try {
            String str = new String(bArr);
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    if (!"notification".equals(jSONObject.has("type") ? jSONObject.getString("type") : null)) {
                        return null;
                    }
                    try {
                        String string = jSONObject.getString("notification");
                        string.getClass();
                        switch (string) {
                            case "audio-activity":
                                List<CallParticipant.ParticipantId> participantIdsFromAudioActivity = SignalingProtocol.getParticipantIdsFromAudioActivity(jSONObject);
                                if (participantIdsFromAudioActivity == null) {
                                    return null;
                                }
                                return new AudioActivityNotification(participantIdsFromAudioActivity);
                            case "speaker-changed":
                                CallParticipant.ParticipantId participantIdFromSpeakerChanged = SignalingProtocol.getParticipantIdFromSpeakerChanged(jSONObject);
                                if (participantIdFromSpeakerChanged == null) {
                                    return null;
                                }
                                return new SpeakerChangedNotification(participantIdFromSpeakerChanged);
                            case "stalled-activity":
                                List<CallParticipant.ParticipantId> participantIdsFromStalledActivity = SignalingProtocol.getParticipantIdsFromStalledActivity(jSONObject);
                                if (participantIdsFromStalledActivity == null) {
                                    return null;
                                }
                                return new StalledParticipantsNotification(participantIdsFromStalledActivity);
                            default:
                                return null;
                        }
                    } catch (Throwable th) {
                        throw new RtcNotificationSerializeException(new IllegalArgumentException("Unable to decode notification body: ".concat(str), th));
                    }
                } catch (Throwable th2) {
                    throw new RtcNotificationSerializeException(new IllegalArgumentException("Unable to decode notification type: ".concat(str), th2));
                }
            } catch (Throwable th3) {
                throw new RtcNotificationSerializeException(new IllegalArgumentException("Unable to decode notification as json: ".concat(str), th3));
            }
        } catch (Throwable th4) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Unable to decode notification as string", th4));
        }
    }
}
