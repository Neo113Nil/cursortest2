package ru.ok.android.webrtc.media_options.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import okcalls.l;
import okcalls.m;
import okcalls.n;
import okcalls.o;
import okcalls.p;
import okcalls.q;
import okcalls.r;
import okcalls.s;
import okcalls.t;
import okcalls.u;
import okcalls.v;
import okcalls.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.CallEvents;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.LocalMediaPermissionProvider;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.media_options.CallMediaOptionsChangeVerifier;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.participant.media.MuteEvent;
import ru.ok.android.webrtc.participant.media.MuteState;
import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParams;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomCommonParser;
import ru.ok.android.webrtc.signaling.util.JSONExtensionsKt;
import xsna.asp;
import xsna.epx;
import xsna.gzs;
import xsna.jgp;
import xsna.s3q0;
import xsna.wzs;
import xsna.zrp;

/* loaded from: classes9.dex */
public final class CallMediaOptionsDelegate implements CallMediaOptionsChangeVerifier {
    public final CallParticipants a;
    public final RTCLog b;
    public wzs c;
    public final SessionRoomCommonParser d;
    public final gzs e;
    public final LocalMediaPermissionProvider f;
    public final CallParams g;
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public MutableMediaOptions j = new MutableMediaOptions(null, null, null, null, 15, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CallMediaOptionsAcceptPolicy {
        public static final CallMediaOptionsAcceptPolicy DEFAULT_TO_CALL_OPTIONS;
        public static final CallMediaOptionsAcceptPolicy DONT_DEFAULT_TO_CALL_OPTIONS;
        public static final CallMediaOptionsAcceptPolicy IGNORE_CALL_OPTIONS;
        public static final /* synthetic */ CallMediaOptionsAcceptPolicy[] a;
        public static final /* synthetic */ zrp b;

        static {
            CallMediaOptionsAcceptPolicy callMediaOptionsAcceptPolicy = new CallMediaOptionsAcceptPolicy("DONT_DEFAULT_TO_CALL_OPTIONS", 0);
            DONT_DEFAULT_TO_CALL_OPTIONS = callMediaOptionsAcceptPolicy;
            CallMediaOptionsAcceptPolicy callMediaOptionsAcceptPolicy2 = new CallMediaOptionsAcceptPolicy("DEFAULT_TO_CALL_OPTIONS", 1);
            DEFAULT_TO_CALL_OPTIONS = callMediaOptionsAcceptPolicy2;
            CallMediaOptionsAcceptPolicy callMediaOptionsAcceptPolicy3 = new CallMediaOptionsAcceptPolicy("IGNORE_CALL_OPTIONS", 2);
            IGNORE_CALL_OPTIONS = callMediaOptionsAcceptPolicy3;
            CallMediaOptionsAcceptPolicy[] callMediaOptionsAcceptPolicyArr = {callMediaOptionsAcceptPolicy, callMediaOptionsAcceptPolicy2, callMediaOptionsAcceptPolicy3};
            a = callMediaOptionsAcceptPolicyArr;
            b = new asp(callMediaOptionsAcceptPolicyArr);
        }

        public CallMediaOptionsAcceptPolicy(String str, int i) {
        }

        public static zrp<CallMediaOptionsAcceptPolicy> getEntries() {
            return b;
        }

        public static CallMediaOptionsAcceptPolicy valueOf(String str) {
            return (CallMediaOptionsAcceptPolicy) Enum.valueOf(CallMediaOptionsAcceptPolicy.class, str);
        }

        public static CallMediaOptionsAcceptPolicy[] values() {
            return (CallMediaOptionsAcceptPolicy[]) a.clone();
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MediaOptionState.values().length];
            try {
                iArr[MediaOptionState.MUTED_PERMANENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaOptionState.UNMUTED_BUT_MUTED_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CallMediaOptionsAcceptPolicy.values().length];
            try {
                iArr2[CallMediaOptionsAcceptPolicy.DEFAULT_TO_CALL_OPTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CallMediaOptionsAcceptPolicy.DONT_DEFAULT_TO_CALL_OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MediaOption.values().length];
            try {
                iArr3[MediaOption.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[MediaOption.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[MediaOption.SCREEN_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[MediaOption.MOVIE_SHARING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public CallMediaOptionsDelegate(CallParticipants callParticipants, RTCLog rTCLog, wzs<? super CallEvents, Object, s3q0> wzsVar, SessionRoomCommonParser sessionRoomCommonParser, gzs<? extends SessionRoomId> gzsVar, LocalMediaPermissionProvider localMediaPermissionProvider, CallParams callParams) {
        this.a = callParticipants;
        this.b = rTCLog;
        this.c = wzsVar;
        this.d = sessionRoomCommonParser;
        this.e = gzsVar;
        this.f = localMediaPermissionProvider;
        this.g = callParams;
    }

    public static boolean a(MutablePropertyReference0Impl mutablePropertyReference0Impl) {
        V v = mutablePropertyReference0Impl.get();
        MediaOptionState mediaOptionState = MediaOptionState.MUTED_PERMANENT;
        if (v == mediaOptionState) {
            return false;
        }
        if (mutablePropertyReference0Impl.get() == MediaOptionState.UNMUTED_BUT_MUTED_ONCE) {
            mutablePropertyReference0Impl.set(MediaOptionState.UNMUTED);
        }
        if (mutablePropertyReference0Impl.get() != MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE) {
            return true;
        }
        mutablePropertyReference0Impl.set(mediaOptionState);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(MutablePropertyReference0Impl mutablePropertyReference0Impl) {
        MediaOptionState mediaOptionState = (MediaOptionState) mutablePropertyReference0Impl.get();
        if (mediaOptionState == MediaOptionState.MUTED_PERMANENT) {
            mutablePropertyReference0Impl.set(MediaOptionState.UNMUTED_BUT_MUTED_ONCE);
        } else if (mediaOptionState == MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE) {
            mutablePropertyReference0Impl.set(MediaOptionState.UNMUTED);
        }
    }

    public static /* synthetic */ MutableMediaOptions createParticipantMediaOptions$default(CallMediaOptionsDelegate callMediaOptionsDelegate, JSONObject jSONObject, CallParticipant.ParticipantId participantId, String str, Map map, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        return callMediaOptionsDelegate.createParticipantMediaOptions(jSONObject, participantId, str, map, z);
    }

    public static /* synthetic */ void setupMediaOptionStatesForCurrentUser$default(CallMediaOptionsDelegate callMediaOptionsDelegate, JSONObject jSONObject, String str, Map map, boolean z, boolean z2, SessionRoomId sessionRoomId, SessionRoomId sessionRoomId2, int i, Object obj) {
        callMediaOptionsDelegate.setupMediaOptionStatesForCurrentUser(jSONObject, str, map, z, z2, sessionRoomId, (i & 64) != 0 ? null : sessionRoomId2);
    }

    public final MutableMediaOptions createParticipantMediaOptions(JSONObject jSONObject, CallParticipant.ParticipantId participantId, String str, Map<MediaOption, ? extends MediaOptionState> map, boolean z) {
        HashMap linkedHashMap;
        List<CallParticipant.Role> list;
        CallParticipant participant = participantId != null ? this.a.getParticipant(participantId) : null;
        if (!map.isEmpty()) {
            linkedHashMap = new HashMap(MediaOption.values().length);
            MediaOption mediaOption = MediaOption.AUDIO;
            MediaOptionState audioState = this.j.getAudioState();
            MediaOptionState mediaOptionState = map.get(mediaOption);
            if (mediaOptionState != null) {
                audioState = mediaOptionState;
            }
            linkedHashMap.put(mediaOption, audioState);
            MediaOption mediaOption2 = MediaOption.VIDEO;
            MediaOptionState videoState = this.j.getVideoState();
            MediaOptionState mediaOptionState2 = map.get(mediaOption2);
            if (mediaOptionState2 != null) {
                videoState = mediaOptionState2;
            }
            linkedHashMap.put(mediaOption2, videoState);
            MediaOption mediaOption3 = MediaOption.SCREEN_SHARING;
            MediaOptionState screenshareState = this.j.getScreenshareState();
            MediaOptionState mediaOptionState3 = map.get(mediaOption3);
            if (mediaOptionState3 != null) {
                screenshareState = mediaOptionState3;
            }
            linkedHashMap.put(mediaOption3, screenshareState);
            MediaOption mediaOption4 = MediaOption.MOVIE_SHARING;
            MediaOptionState movieSharingState = this.j.getMovieSharingState();
            MediaOptionState mediaOptionState4 = map.get(mediaOption4);
            if (mediaOptionState4 != null) {
                movieSharingState = mediaOptionState4;
            }
            linkedHashMap.put(mediaOption4, movieSharingState);
        } else if (epx.f(participantId, this.a.getCurrentUserParticipant().getParticipantId())) {
            linkedHashMap = new HashMap(MediaOption.values().length);
            linkedHashMap.put(MediaOption.AUDIO, this.j.getAudioState());
            linkedHashMap.put(MediaOption.VIDEO, this.j.getVideoState());
            linkedHashMap.put(MediaOption.SCREEN_SHARING, this.j.getScreenshareState());
            linkedHashMap.put(MediaOption.MOVIE_SHARING, this.j.getMovieSharingState());
        } else if ((participant != null ? participant.mediaOptions : null) != null) {
            linkedHashMap = new HashMap(MediaOption.values().length);
            linkedHashMap.put(MediaOption.AUDIO, participant.mediaOptions.getAudioState());
            linkedHashMap.put(MediaOption.VIDEO, participant.mediaOptions.getVideoState());
            linkedHashMap.put(MediaOption.SCREEN_SHARING, participant.mediaOptions.getScreenshareState());
            linkedHashMap.put(MediaOption.MOVIE_SHARING, participant.mediaOptions.getMovieSharingState());
        } else {
            linkedHashMap = new LinkedHashMap();
            this.b.log("CallMediaOptionsDelegate", "createParticipantMediaOptions null participant or null media options");
        }
        if (z) {
            for (Map.Entry<MediaOption, MediaOptionState> entry : SignalingProtocol.createMediaOptionStates(jSONObject, SignalingProtocol.KEY_MUTE_STATES).entrySet()) {
                MediaOption key = entry.getKey();
                MediaOptionState value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        ArrayList a = a(jSONObject, str);
        boolean optBoolean = jSONObject.optBoolean("unmute", false);
        if (jSONObject.has(SignalingProtocol.KEY_ROLES)) {
            try {
                list = SignalingProtocol.createRolesFromParent(jSONObject);
            } catch (Exception unused) {
                if (participant == null || (list = participant.getRoles()) == null) {
                    list = EmptyList.b;
                }
            }
        } else if (participant == null || (list = participant.getRoles()) == null) {
            list = EmptyList.b;
        }
        MutableMediaOptions mutableMediaOptions = new MutableMediaOptions(null, null, null, null, 15, null);
        MediaOption mediaOption5 = MediaOption.AUDIO;
        mutableMediaOptions.setAudioState(a(mediaOption5, (MediaOptionState) linkedHashMap.get(mediaOption5), list, a, optBoolean));
        MediaOption mediaOption6 = MediaOption.VIDEO;
        mutableMediaOptions.setVideoState(a(mediaOption6, (MediaOptionState) linkedHashMap.get(mediaOption6), list, a, optBoolean));
        MediaOption mediaOption7 = MediaOption.SCREEN_SHARING;
        mutableMediaOptions.setScreenshareState(a(mediaOption7, (MediaOptionState) linkedHashMap.get(mediaOption7), list, a, optBoolean));
        MediaOption mediaOption8 = MediaOption.MOVIE_SHARING;
        mutableMediaOptions.setMovieSharingState(a(mediaOption8, (MediaOptionState) linkedHashMap.get(mediaOption8), list, a, optBoolean));
        return mutableMediaOptions;
    }

    public final Map<MediaOption, MediaOptionState> getCallMediaOptionsDefault(SessionRoomId sessionRoomId, CallMediaOptionsAcceptPolicy callMediaOptionsAcceptPolicy) {
        int i = WhenMappings.$EnumSwitchMapping$1[callMediaOptionsAcceptPolicy.ordinal()];
        if (i == 1) {
            return getMediaOptionsForCall(sessionRoomId).toMap();
        }
        jgp jgpVar = jgp.b;
        if (i != 2) {
            return jgpVar;
        }
        Map<MediaOption, MediaOptionState> map = (Map) this.h.get(sessionRoomId);
        return map == null ? jgpVar : map;
    }

    public final MutableMediaOptions getMediaOptionsForCall(SessionRoomId sessionRoomId) {
        LinkedHashMap linkedHashMap = this.i;
        Object obj = linkedHashMap.get(sessionRoomId);
        if (obj == null) {
            MutableMediaOptions mutableMediaOptions = new MutableMediaOptions(null, null, null, null, 15, null);
            linkedHashMap.put(sessionRoomId, mutableMediaOptions);
            obj = mutableMediaOptions;
        }
        return (MutableMediaOptions) obj;
    }

    public final MutableMediaOptions getMediaOptionsForCurrentUser() {
        return this.j;
    }

    public final boolean handleMediaOptionsForSetMuted(boolean z) {
        if (z) {
            return true;
        }
        return this.f.isMicrophonePermissionGranted() && a(new l(this.j, MutableMediaOptions.class, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0));
    }

    public final boolean handleMediaOptionsForSetScreenCapture(boolean z) {
        return !z || a(new m(this.j, MutableMediaOptions.class, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0));
    }

    public final boolean handleMediaOptionsForSetVideo(boolean z) {
        if (z) {
            return this.f.isCameraPermissionGranted() && a(new n(this.j, MutableMediaOptions.class, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0));
        }
        return true;
    }

    public final void handleMuteParticipant(JSONObject jSONObject) {
        try {
            a(jSONObject);
        } catch (JSONException e) {
            this.b.logException("CallMediaOptionsDelegate", "can't handle mute participant", e);
        }
    }

    public final void handlePinForMediaOptions(boolean z, CallParticipant.ParticipantId participantId) {
        if (z || !epx.f(this.a.getCurrentUserParticipant().getParticipantId(), participantId)) {
            return;
        }
        o oVar = new o(this.j, MutableMediaOptions.class, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
        Object obj = oVar.get();
        MediaOptionState mediaOptionState = MediaOptionState.MUTED_PERMANENT;
        if (obj == mediaOptionState) {
            oVar.set(MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE);
        }
        p pVar = new p(this.j, MutableMediaOptions.class, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
        if (pVar.get() == mediaOptionState) {
            pVar.set(MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE);
        }
        q qVar = new q(this.j, MutableMediaOptions.class, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
        if (qVar.get() == mediaOptionState) {
            qVar.set(MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE);
        }
        r rVar = new r(this.j, MutableMediaOptions.class, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0);
        if (rVar.get() == mediaOptionState) {
            rVar.set(MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE);
        }
    }

    public final void handleRolesChangedForMediaOptions(List<? extends CallParticipant.Role> list, CallParticipant.ParticipantId participantId) {
        CallParticipant currentUserParticipant = this.a.getCurrentUserParticipant();
        if (participantId.equals(currentUserParticipant.getParticipantId())) {
            currentUserParticipant.setRoles(list);
            if (list.contains(CallParticipant.Role.ADMIN)) {
                b(new s(this.j, MutableMediaOptions.class, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0));
                b(new t(this.j, MutableMediaOptions.class, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0));
                b(new u(this.j, MutableMediaOptions.class, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0));
                b(new v(this.j, MutableMediaOptions.class, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0));
            }
        }
    }

    public final void resetMediaOptionStatesForCurrentUser() {
        this.j = new MutableMediaOptions(null, null, null, null, 15, null);
    }

    public final void sendMuteInitializedEvent(boolean z) {
        this.c.invoke(CallEvents.MUTE_STATE_INITIALIZED, new MuteState(new MuteEvent(this.j.toMap(), EmptySet.b), z && this.g.getExperiments().C()));
    }

    public final void setSendEventCallback(wzs<? super CallEvents, Object, s3q0> wzsVar) {
        this.c = wzsVar;
    }

    public final void setupMediaOptionStatesForCall(JSONObject jSONObject, String str, CallMediaOptionsAcceptPolicy callMediaOptionsAcceptPolicy, SessionRoomId sessionRoomId, boolean z) {
        Map<MediaOption, ? extends MediaOptionState> map;
        if (jSONObject.has(SignalingProtocol.KEY_MUTE_STATES)) {
            map = SignalingProtocol.createMediaOptionStates(jSONObject, SignalingProtocol.KEY_MUTE_STATES);
        } else if (jSONObject.has(SignalingProtocol.KEY_REQUESTED_MEDIA)) {
            return;
        } else {
            map = jgp.b;
        }
        setupMediaOptionStatesForCall(map, jSONObject, str, callMediaOptionsAcceptPolicy, sessionRoomId, z);
    }

    public final void setupMediaOptionStatesForCurrentUser(JSONObject jSONObject, String str, Map<MediaOption, ? extends MediaOptionState> map, boolean z, boolean z2, SessionRoomId sessionRoomId, SessionRoomId sessionRoomId2) {
        JSONArray optJSONArray;
        if (sessionRoomId2 == null) {
            sessionRoomId2 = (SessionRoomId) this.e.invoke();
        }
        if (sessionRoomId.equals(sessionRoomId2)) {
            MutableMediaOptions createParticipantMediaOptions = createParticipantMediaOptions(jSONObject, this.a.getCurrentUserParticipant().getParticipantId(), str, map, z);
            if (!epx.f(createParticipantMediaOptions, this.j)) {
                this.j = createParticipantMediaOptions;
                if (!this.g.getExperiments().C()) {
                    sendMuteInitializedEvent(false);
                } else if (!z2) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(SignalingProtocol.KEY_MUTE_STATES);
                    if (((optJSONObject == null || optJSONObject.length() <= 0) && ((optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_UNMUTE_OPTIONS)) == null || optJSONArray.length() <= 0)) ? jSONObject.has("unmute") : true) {
                        sendMuteInitializedEvent(false);
                    }
                }
            }
            this.h.put(sessionRoomId, jgp.b);
        }
    }

    @Override // ru.ok.android.webrtc.media_options.CallMediaOptionsChangeVerifier
    public boolean tryEnableWatchTogetherMediaOption() {
        return a(new w(this.j, MutableMediaOptions.class, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;", 0));
    }

    public final ArrayList a(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_UNMUTE_OPTIONS);
        if (optJSONArray != null) {
            try {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        arrayList.add(MediaOption.valueOf((String) optJSONArray.get(i)));
                    } catch (IllegalArgumentException e) {
                        this.b.logException("CallMediaOptionsDelegate", "invalid MediaOption in " + str, e);
                    }
                }
            } catch (JSONException e2) {
                this.b.logException("CallMediaOptionsDelegate", str, e2);
            }
        }
        return arrayList;
    }

    public final void setupMediaOptionStatesForCall(Map<MediaOption, ? extends MediaOptionState> map, JSONObject jSONObject, String str, CallMediaOptionsAcceptPolicy callMediaOptionsAcceptPolicy, SessionRoomId sessionRoomId, boolean z) {
        MutableMediaOptions mutableMediaOptions = new MutableMediaOptions(null, null, null, null, 15, null);
        MediaOptionState mediaOptionState = map.get(MediaOption.AUDIO);
        if (mediaOptionState != null) {
            mutableMediaOptions.setAudioState(mediaOptionState);
        }
        MediaOptionState mediaOptionState2 = map.get(MediaOption.VIDEO);
        if (mediaOptionState2 != null) {
            mutableMediaOptions.setVideoState(mediaOptionState2);
        }
        MediaOptionState mediaOptionState3 = map.get(MediaOption.SCREEN_SHARING);
        if (mediaOptionState3 != null) {
            mutableMediaOptions.setScreenshareState(mediaOptionState3);
        }
        MediaOptionState mediaOptionState4 = map.get(MediaOption.MOVIE_SHARING);
        if (mediaOptionState4 != null) {
            mutableMediaOptions.setMovieSharingState(mediaOptionState4);
        }
        Map<MediaOption, MediaOptionState> diff = mutableMediaOptions.getDiff(getMediaOptionsForCall(sessionRoomId));
        if (diff.isEmpty()) {
            return;
        }
        this.h.put(sessionRoomId, diff);
        this.i.put(sessionRoomId, mutableMediaOptions);
        if (z) {
            setupMediaOptionStatesForCurrentUser$default(this, jSONObject, str, getCallMediaOptionsDefault(sessionRoomId, callMediaOptionsAcceptPolicy), false, true, sessionRoomId, null, 64, null);
        }
    }

    public static MediaOptionState a(MediaOption mediaOption, MediaOptionState mediaOptionState, List list, ArrayList arrayList, boolean z) {
        if (mediaOptionState == null) {
            return MediaOptionState.UNMUTED;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[mediaOptionState.ordinal()];
        if (i != 1) {
            if (i == 2 && z) {
                return MediaOptionState.UNMUTED;
            }
        } else if (!list.contains(CallParticipant.Role.CREATOR) && !list.contains(CallParticipant.Role.ADMIN)) {
            if (arrayList.contains(mediaOption)) {
                return MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE;
            }
        } else {
            return MediaOptionState.UNMUTED_BUT_MUTED_ONCE;
        }
        return mediaOptionState;
    }

    public final void a(JSONObject jSONObject) {
        SessionRoomId parseRoomIdUnsafe = this.d.parseRoomIdUnsafe(jSONObject);
        CallParticipant.ParticipantId participantId = this.a.getCurrentUserParticipant().getParticipantId();
        String optStringOrNull = JSONExtensionsKt.optStringOrNull(jSONObject, "adminId");
        CallParticipant.ParticipantId fromStringValueSafe = optStringOrNull != null ? CallParticipant.ParticipantId.fromStringValueSafe(optStringOrNull) : null;
        String optStringOrNull2 = JSONExtensionsKt.optStringOrNull(jSONObject, SignalingProtocol.KEY_PARTICIPANT_ID);
        CallParticipant.ParticipantId fromStringValueSafe2 = optStringOrNull2 != null ? CallParticipant.ParticipantId.fromStringValueSafe(optStringOrNull2) : null;
        boolean optBoolean = jSONObject.optBoolean("muteAll", false);
        Map<MediaOption, ? extends MediaOptionState> map = jgp.b;
        if (fromStringValueSafe2 != null && !fromStringValueSafe2.equals(participantId)) {
            if (jSONObject.has(SignalingProtocol.KEY_MUTE_STATES)) {
                map = SignalingProtocol.createMediaOptionStates(jSONObject, SignalingProtocol.KEY_MUTE_STATES);
            }
            CallParticipant.ParticipantId participantId2 = fromStringValueSafe2;
            CallParticipants.addOrUpdate$default(this.a, new ParticipantAddOrUpdateParams.Builder(participantId2).setMediaOptions(createParticipantMediaOptions(jSONObject, participantId2, "handleMuteParticipant", map, false)).build(), null, 2, null);
            return;
        }
        if (fromStringValueSafe != null && fromStringValueSafe.equals(participantId)) {
            setupMediaOptionStatesForCall(jSONObject, "handleMuteParticipant", CallMediaOptionsAcceptPolicy.IGNORE_CALL_OPTIONS, parseRoomIdUnsafe, false);
            ArrayList arrayList = new ArrayList(this.a.size());
            for (CallParticipant.ParticipantId participantId3 : this.a.getSessionRoomParticipantIds(parseRoomIdUnsafe)) {
                arrayList.add(new ParticipantAddOrUpdateParams.Builder(participantId3).setMediaOptions(createParticipantMediaOptions(jSONObject, participantId3, "handleMuteParticipant", map, false)).build());
            }
            this.a.addOrUpdateBatch(arrayList, parseRoomIdUnsafe);
            return;
        }
        if (optBoolean) {
            a(jSONObject, parseRoomIdUnsafe, true);
            setupMediaOptionStatesForCall(jSONObject, "handleMuteParticipant", CallMediaOptionsAcceptPolicy.IGNORE_CALL_OPTIONS, parseRoomIdUnsafe, false);
            ArrayList arrayList2 = new ArrayList(this.a.size());
            for (CallParticipant.ParticipantId participantId4 : this.a.getSessionRoomParticipantIds(parseRoomIdUnsafe)) {
                arrayList2.add(new ParticipantAddOrUpdateParams.Builder(participantId4).setMediaOptions(createParticipantMediaOptions(jSONObject, participantId4, "handleMuteParticipant", map, false)).build());
            }
            this.a.addOrUpdateBatch(arrayList2, parseRoomIdUnsafe);
            return;
        }
        a(jSONObject, parseRoomIdUnsafe, false);
    }

    public final void release() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [xsna.jgp] */
    public final void a(JSONObject jSONObject, SessionRoomId sessionRoomId, boolean z) {
        List<MediaOption> list;
        HashMap hashMap;
        if (epx.f(sessionRoomId, this.e.invoke())) {
            try {
                list = SignalingProtocol.parseMediaOptions(jSONObject);
            } catch (JSONException e) {
                this.b.logException("CallMediaOptionsDelegate", "media options parsing error", e);
                list = EmptyList.b;
            }
            if (!list.isEmpty()) {
                if (list.isEmpty()) {
                    hashMap = jgp.b;
                } else {
                    Map<MediaOption, MediaOptionState> createMediaOptionStates = SignalingProtocol.createMediaOptionStates(jSONObject, SignalingProtocol.KEY_MUTE_STATES);
                    hashMap = new HashMap();
                    for (MediaOption mediaOption : list) {
                        MediaOptionState mediaOptionState = createMediaOptionStates.get(mediaOption);
                        if (mediaOptionState != null) {
                            hashMap.put(mediaOption, mediaOptionState);
                        }
                    }
                }
                if (!list.isEmpty() || jSONObject.has(SignalingProtocol.KEY_UNMUTE_OPTIONS) || jSONObject.has("unmute")) {
                    setupMediaOptionStatesForCurrentUser$default(this, jSONObject, "handleMuteParticipant", hashMap, false, z, sessionRoomId, null, 64, null);
                }
            }
            MediaOptions mediaOptions = this.j.toMediaOptions();
            Set<MediaOption> parseRequestedMediaOptions = SignalingProtocol.parseRequestedMediaOptions(jSONObject);
            boolean isEmpty = parseRequestedMediaOptions.isEmpty();
            HashMap hashMap2 = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i = WhenMappings.$EnumSwitchMapping$2[((MediaOption) it.next()).ordinal()];
                if (i == 1) {
                    hashMap2.put(MediaOption.AUDIO, mediaOptions.getAudioState());
                } else if (i == 2) {
                    hashMap2.put(MediaOption.VIDEO, mediaOptions.getVideoState());
                } else if (i == 3) {
                    hashMap2.put(MediaOption.SCREEN_SHARING, mediaOptions.getScreenshareState());
                } else if (i == 4) {
                    hashMap2.put(MediaOption.MOVIE_SHARING, mediaOptions.getMovieSharingState());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            MediaOptionState audioState = mediaOptions.getAudioState();
            MediaOption mediaOption2 = MediaOption.AUDIO;
            MediaOptionState mediaOptionState2 = MediaOptionState.MUTED_PERMANENT;
            if (audioState == mediaOptionState2 && parseRequestedMediaOptions.contains(mediaOption2)) {
                parseRequestedMediaOptions.remove(mediaOption2);
                hashMap2.remove(mediaOption2);
            }
            MediaOptionState videoState = mediaOptions.getVideoState();
            MediaOption mediaOption3 = MediaOption.VIDEO;
            if (videoState == mediaOptionState2 && parseRequestedMediaOptions.contains(mediaOption3)) {
                parseRequestedMediaOptions.remove(mediaOption3);
                hashMap2.remove(mediaOption3);
            }
            MediaOptionState screenshareState = mediaOptions.getScreenshareState();
            MediaOption mediaOption4 = MediaOption.SCREEN_SHARING;
            if (screenshareState == mediaOptionState2 && parseRequestedMediaOptions.contains(mediaOption4)) {
                parseRequestedMediaOptions.remove(mediaOption4);
                hashMap2.remove(mediaOption4);
            }
            MediaOptionState movieSharingState = mediaOptions.getMovieSharingState();
            MediaOption mediaOption5 = MediaOption.MOVIE_SHARING;
            if (movieSharingState == mediaOptionState2 && parseRequestedMediaOptions.contains(mediaOption5)) {
                parseRequestedMediaOptions.remove(mediaOption5);
                hashMap2.remove(mediaOption5);
            }
            if (isEmpty || !parseRequestedMediaOptions.isEmpty()) {
                if (hashMap2.isEmpty() && parseRequestedMediaOptions.isEmpty()) {
                    return;
                }
                this.c.invoke(CallEvents.MUTE_PARTICIPANT, new MuteState(new MuteEvent(hashMap2, parseRequestedMediaOptions), z));
            }
        }
    }
}
