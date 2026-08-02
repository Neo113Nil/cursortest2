package ru.ok.android.webrtc.signaling.mediaoptions;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public final class MediaOptionsCommandParamsCreator {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaOption.values().length];
            try {
                iArr[MediaOption.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaOption.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaOption.SCREEN_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaOption.MOVIE_SHARING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final JSONObject createRequestToEnableMedia(Set<? extends MediaOption> set, CallParticipant.ParticipantId participantId, SessionRoomId sessionRoomId) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SignalingProtocol.KEY_PARTICIPANT_ID, participantId != null ? participantId.toStringValue() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends MediaOption> it = set.iterator();
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[it.next().ordinal()];
            if (i == 1) {
                str = SignalingProtocol.MEDIA_OPTION_AUDIO;
            } else if (i == 2) {
                str = SignalingProtocol.MEDIA_OPTION_VIDEO;
            } else if (i == 3) {
                str = SignalingProtocol.MEDIA_OPTION_SCREEN_SHARING;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = SignalingProtocol.MEDIA_OPTION_MOVIE_SHARING;
            }
            jSONArray.put(str);
        }
        jSONObject.put(SignalingProtocol.KEY_REQUESTED_MEDIA, jSONArray);
        jSONObject.put("command", "mute-participant");
        if (sessionRoomId instanceof SessionRoomId.Room) {
            jSONObject.put(SignalingProtocol.KEY_ROOM_ID, ((SessionRoomId.Room) sessionRoomId).getId());
        }
        return jSONObject;
    }

    public final JSONObject createUpdateMediaOptions(Map<MediaOption, ? extends MediaOptionState> map, CallParticipant.ParticipantId participantId, SessionRoomId sessionRoomId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SignalingProtocol.KEY_PARTICIPANT_ID, participantId != null ? participantId.toStringValue() : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(SignalingProtocol.MEDIA_OPTION_AUDIO, SignalingProtocol.getMediaOptionStateForRequest(map.get(MediaOption.AUDIO)));
        jSONObject2.put(SignalingProtocol.MEDIA_OPTION_VIDEO, SignalingProtocol.getMediaOptionStateForRequest(map.get(MediaOption.VIDEO)));
        jSONObject2.put(SignalingProtocol.MEDIA_OPTION_SCREEN_SHARING, SignalingProtocol.getMediaOptionStateForRequest(map.get(MediaOption.SCREEN_SHARING)));
        jSONObject2.put(SignalingProtocol.MEDIA_OPTION_MOVIE_SHARING, SignalingProtocol.getMediaOptionStateForRequest(map.get(MediaOption.MOVIE_SHARING)));
        jSONObject.put(SignalingProtocol.KEY_MUTE_STATES, jSONObject2);
        jSONObject.put("command", "mute-participant");
        if (sessionRoomId instanceof SessionRoomId.Room) {
            jSONObject.put(SignalingProtocol.KEY_ROOM_ID, ((SessionRoomId.Room) sessionRoomId).getId());
        }
        return jSONObject;
    }
}
