package ru.ok.android.webrtc.signaling.participant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.media_options.internal.CallMediaOptionsDelegate;
import ru.ok.android.webrtc.media_options.internal.MutableMediaOptions;
import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.Peer;
import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParams;
import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParamsList;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.movie.MovieSharesInfoParser;
import xsna.epx;

/* loaded from: classes9.dex */
public final class ParticipantListParser {
    public final CallParticipant a;
    public final CallMediaOptionsDelegate b;
    public final MovieSharesInfoParser c;
    public final ParticipantStateParser d;

    public ParticipantListParser(RTCLog rTCLog, CallParticipant callParticipant, CallMediaOptionsDelegate callMediaOptionsDelegate, MovieSharesInfoParser movieSharesInfoParser, ParticipantStateParser participantStateParser) {
        this.a = callParticipant;
        this.b = callMediaOptionsDelegate;
        this.c = movieSharesInfoParser;
        this.d = participantStateParser;
    }

    public final ParticipantAddOrUpdateParams createAddOrUpdateParamsForAcceptedParticipant(CallParticipant.ParticipantId participantId, JSONObject jSONObject, SessionRoomId sessionRoomId) throws JSONException {
        CallMediaOptionsDelegate callMediaOptionsDelegate = this.b;
        MutableMediaOptions createParticipantMediaOptions = callMediaOptionsDelegate.createParticipantMediaOptions(jSONObject, participantId, "createAddOrUpdateParamsForAcceptedParticipant", callMediaOptionsDelegate.getMediaOptionsForCall(sessionRoomId).toMap(), true);
        MutableMediaSettings createMediaSettingsFromParent = SignalingProtocol.createMediaSettingsFromParent(jSONObject);
        List<CallParticipant.Role> createRolesFromParent = SignalingProtocol.createRolesFromParent(jSONObject);
        Peer createPeerFromParent = SignalingProtocol.createPeerFromParent(jSONObject);
        CallParticipant.SessionState sessionStateFromParticipant = SignalingProtocol.getSessionStateFromParticipant(jSONObject);
        if (createPeerFromParent == null) {
            createPeerFromParent = CallParticipant.FAKE_PEER;
        }
        return new ParticipantAddOrUpdateParams.Builder(participantId).setAcceptedCallPeer(createPeerFromParent).setMediaOptions(createParticipantMediaOptions).setMediaSettingsIfNotNull(createMediaSettingsFromParent).setRoles(createRolesFromParent).setExternalIdIfNotNull(SignalingProtocol.createExternalIdFromParent(jSONObject)).setMovies(this.c.parseMoviesFromParticipant(jSONObject, sessionRoomId)).setCapabilities(SignalingProtocol.getParticipantCapabilitiesFromParticipant(jSONObject)).setSessionState(sessionStateFromParticipant).build();
    }

    public final ParticipantAddOrUpdateParams createAddOrUpdateParamsForCalledParticipant(CallParticipant.ParticipantId participantId, JSONObject jSONObject, SessionRoomId sessionRoomId) throws JSONException {
        CallMediaOptionsDelegate callMediaOptionsDelegate = this.b;
        MutableMediaOptions createParticipantMediaOptions = callMediaOptionsDelegate.createParticipantMediaOptions(jSONObject, participantId, "createAddOrUpdateParamsForCalledParticipant", callMediaOptionsDelegate.getMediaOptionsForCall(sessionRoomId).toMap(), true);
        MutableMediaSettings createMediaSettingsFromParent = SignalingProtocol.createMediaSettingsFromParent(jSONObject);
        List<CallParticipant.Role> createRolesFromParent = SignalingProtocol.createRolesFromParent(jSONObject);
        CallExternalId createExternalIdFromParent = SignalingProtocol.createExternalIdFromParent(jSONObject);
        Integer participantCapabilitiesFromParticipant = SignalingProtocol.getParticipantCapabilitiesFromParticipant(jSONObject);
        return new ParticipantAddOrUpdateParams.Builder(participantId).setMediaOptions(createParticipantMediaOptions).setMediaSettingsIfNotNull(createMediaSettingsFromParent).setRoles(createRolesFromParent).setExternalIdIfNotNull(createExternalIdFromParent).setMovies(this.c.parseMoviesFromParticipant(jSONObject, sessionRoomId)).setCapabilities(participantCapabilitiesFromParticipant).setSessionState(SignalingProtocol.getSessionStateFromParticipant(jSONObject)).build();
    }

    public final ParticipantAddOrUpdateParamsList parseParticipantList(JSONArray jSONArray, SessionRoomId sessionRoomId) {
        SessionRoomId sessionRoomId2;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("state");
            CallParticipant.ParticipantId extractParticipantIdFromParticipant = SignalingProtocol.extractParticipantIdFromParticipant(jSONObject);
            if (epx.f(extractParticipantIdFromParticipant, this.a.getParticipantId())) {
                this.a.setMovies(this.c.parseMoviesFromParticipant(jSONObject, sessionRoomId));
                this.a.setRoles(SignalingProtocol.createRolesFromParent(jSONObject));
                Integer participantCapabilitiesFromParticipant = SignalingProtocol.getParticipantCapabilitiesFromParticipant(jSONObject);
                if (participantCapabilitiesFromParticipant != null) {
                    this.a.setCapabilities(participantCapabilitiesFromParticipant.intValue());
                }
                CallMediaOptionsDelegate callMediaOptionsDelegate = this.b;
                sessionRoomId2 = sessionRoomId;
                callMediaOptionsDelegate.setupMediaOptionStatesForCurrentUser(jSONObject, "handleConversationParticipants", callMediaOptionsDelegate.getCallMediaOptionsDefault(sessionRoomId, CallMediaOptionsDelegate.CallMediaOptionsAcceptPolicy.DEFAULT_TO_CALL_OPTIONS), true, false, sessionRoomId2, sessionRoomId);
            } else {
                sessionRoomId2 = sessionRoomId;
                if (SignalingProtocol.PARTICIPANT_STATE_ACCEPTED.equals(string)) {
                    arrayList.add(createAddOrUpdateParamsForAcceptedParticipant(extractParticipantIdFromParticipant, jSONObject, sessionRoomId2));
                } else if (SignalingProtocol.PARTICIPANT_STATE_CALLED.equals(string)) {
                    arrayList.add(createAddOrUpdateParamsForCalledParticipant(extractParticipantIdFromParticipant, jSONObject, sessionRoomId2));
                } else {
                    hashSet.add(extractParticipantIdFromParticipant);
                }
            }
            CallParticipant.ParticipantState parseParticipantState = this.d.parseParticipantState(jSONObject);
            if (parseParticipantState != null) {
                arrayList2.add(parseParticipantState);
            }
            i++;
            sessionRoomId = sessionRoomId2;
        }
        return new ParticipantAddOrUpdateParamsList(arrayList, hashSet, arrayList2);
    }
}
