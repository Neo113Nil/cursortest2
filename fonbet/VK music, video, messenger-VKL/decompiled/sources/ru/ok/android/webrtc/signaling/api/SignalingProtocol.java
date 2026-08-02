package ru.ok.android.webrtc.signaling.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;
import ru.ok.android.webrtc.layout.internal.ServerDisplayLayoutItem;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.mediamodifiers.MediaModifiers;
import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.Peer;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MoviePresetMeta;
import ru.ok.android.webrtc.participant.movie.MovieThumbnail;
import ru.ok.android.webrtc.participant.waiting.CallWaitingParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.sessionroom.admin.ActivateRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.RemoveRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.SwitchRoomParams;
import ru.ok.android.webrtc.sessionroom.admin.UpdateRoomsParams;
import ru.ok.android.webrtc.signaling.command.GenericCommand;
import ru.ok.android.webrtc.signaling.command.SignalingCommand;
import ru.ok.android.webrtc.signaling.command.SignalingCommandChangeMediaModifiers;
import ru.ok.android.webrtc.signaling.command.SignalingCommandChangeMediaSettings;
import ru.ok.android.webrtc.signaling.command.SignalingCommandRecordStart;
import ru.ok.android.webrtc.signaling.command.SignalingCommandRecordStop;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettings;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.utils.HangupInfo;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.i5s;
import xsna.yq;

/* loaded from: classes9.dex */
public final class SignalingProtocol {
    public static final String AUDIO_TRACK_ID_PREFIX = "audio-";
    public static final String COMMAND = "command";
    public static final String COMMAND_ACCEPT_PROMOTION = "accept-promotion";
    public static final String COMMAND_ENABLE_FEATURE_FOR_ROLES = "enable-feature-for-roles";
    public static final String COMMAND_GET_HAND_QUEUE = "get-hand-queue";
    public static final String COMMAND_GET_PARTICIPANT_LIST_CHUNK = "get-participant-list-chunk";
    public static final String COMMAND_GET_ROOMS = "get-rooms";
    public static final String COMMAND_MUTE_PARTICIPANT = "mute-participant";
    public static final String COMMAND_RECORD_START = "record-start";
    public static final String COMMAND_RECORD_STOP = "record-stop";
    public static final String COMMAND_REQUEST_PROMOTION = "request-promotion";
    public static final String COMMAND_START_URL_SHARING = "start-url-sharing";
    public static final String COMMAND_STOP_URL_SHARING = "stop-url-sharing";
    public static final String ERROR_CALL_UNFEASIBLE = "call-unfeasible";
    public static final String ERROR_COMMAND_CAN_NOT_BE_POSTPONED = "command-can-not-be-postponed";
    public static final String ERROR_COMMAND_DISCARDED = "command-discarded";
    public static final String ERROR_COMMAND_NOT_DELIVERED = "command-not-delivered";
    public static final String ERROR_CONVERSATION_ENDED = "conversation-ended";
    public static final String ERROR_CONVERSATION_NOT_FOUND = "conversation-not-found";
    public static final String ERROR_CONVERSATION_RECORDING = "conversation-recording";

    @Deprecated
    public static final String ERROR_FEATURE_DISABLED = "feature-is-disabled";
    public static final String ERROR_ILLEGAL_CONVERSATION_STATE = "illegal-conversation-state";
    public static final String ERROR_ILLEGAL_PARTICIPANT_STATE = "illegal-participant-state";

    @Deprecated
    public static final String ERROR_INTERNAL = "internal-error";
    public static final String ERROR_INVALID_REQUEST = "invalid-request";
    public static final String ERROR_INVALID_TOKEN = "invalid-token";
    public static final String ERROR_MOVIE_LIMIT_EXCEEDED = "movie-limit-exceeded";
    public static final String ERROR_MOVIE_NOT_FOUND = "movie-not-found";
    public static final String ERROR_NO_CALL = "no-call";
    public static final String ERROR_OBSOLETE_CLIENT = "gen.obsoleteClient";
    public static final String ERROR_PARTICIPANT_LIMIT_REACHED = "participants-limit-reached";

    @Deprecated
    public static final String ERROR_PARTICIPANT_NOT_FOUND = "participant-not-found";
    public static final String ERROR_ROOM_INACTIVE = "rooms.roomInactive";
    public static final String ERROR_ROOM_NOT_ADMIN = "rooms.notAdmin";
    public static final String ERROR_SERVICE_UNAVAILABLE = "service-unavailable";
    public static final String FEATURE_ADD_PARTICIPANT = "ADD_PARTICIPANT";

    @Deprecated
    public static final String HUNGUP_REASON_BUSY = "BUSY";

    @Deprecated
    public static final String HUNGUP_REASON_CANCELED = "CANCELED";

    @Deprecated
    public static final String HUNGUP_REASON_FAILED = "FAILED";

    @Deprecated
    public static final String HUNGUP_REASON_HUNGUP = "HUNGUP";

    @Deprecated
    public static final String HUNGUP_REASON_MISSED = "MISSED";

    @Deprecated
    public static final String HUNGUP_REASON_REJECTED = "REJECTED";

    @Deprecated
    public static final String HUNGUP_REASON_REMOVED = "REMOVED";

    @Deprecated
    public static final String HUNGUP_REASON_TIMEOUT = "TIMEOUT";
    public static final String KEY_ACTIVE = "active";
    public static final String KEY_ADDED_PARTICIPANTS = "addedParticipants";
    public static final String KEY_ADDED_PARTICIPANT_IDS = "addedParticipantIds";
    public static final String KEY_ADDED_TS = "addedTs";
    public static final String KEY_ADD_PARTICIPANT_IDS = "addParticipantIds";
    public static final String KEY_ADMIN = "ADMIN";
    public static final String KEY_ASR_INFO = "asrInfo";
    public static final String KEY_ASSIGN_RANDOMLY = "assignRandomly";
    public static final String KEY_AUDIO_BITRATE = "audioBitrateBps";
    public static final String KEY_AUDIO_ENABLED = "isAudioEnabled";
    public static final String KEY_BACKWARD = "backward";
    public static final String KEY_BANNED_PARTICIPANTS = "bannedParticipants";
    public static final String KEY_BANNED_PARTICIPANT_IDS = "bannedParticipantIds";
    public static final String KEY_CAMERA = "camera";
    public static final String KEY_CAPABILITIES = "capabilities";
    public static final String KEY_CHAT_DIRECT = "direct";
    public static final String KEY_CHAT_MESSAGE = "message";
    public static final String KEY_CHUNK = "chunk";
    public static final String KEY_CLIENT_TYPE = "clientType";
    public static final String KEY_CODE = "code";
    public static final String KEY_CONNECT_TO = "connectTo";
    public static final String KEY_CONVERSATION = "conversation";
    public static final String KEY_COUNT = "count";
    public static final String KEY_COUNTDOWN_SEC = "countdownSec";
    public static final String KEY_COUNT_AFTER = "countAfter";
    public static final String KEY_COUNT_BEFORE = "countBefore";
    public static final String KEY_DATA = "data";
    public static final String KEY_DEACTIVATE = "deactivate";
    public static final String KEY_DECORATIVE_EXTERNAL_PARTICIPANT_ID = "decorativeExternalParticipantId";
    public static final String KEY_DECORATIVE_PARTICIPANT_ID = "decorativeParticipantId";
    public static final String KEY_DEMOTE = "demote";
    public static final String KEY_DENOISE = "denoise";
    public static final String KEY_DENOISE_ANN = "denoiseAnn";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_DEVICE_IDX = "deviceIdx";
    public static final String KEY_DISPROVE = "disprove";
    public static final String KEY_DRAW_ATTENTION = "drat";
    public static final String KEY_DURATION = "duration";
    public static final String KEY_ENDPOINT = "endpoint";
    public static final String KEY_ENDPOINT_TOKEN = "token";
    public static final String KEY_ERROR = "error";
    public static final String KEY_ERRORS = "errors";
    public static final String KEY_ERROR_CODE = "errorCode";
    public static final String KEY_ERROR_RECOVERABLE = "recoverable";
    public static final String KEY_EVENTS = "events";
    public static final String KEY_EVENT_TYPE = "eventType";
    public static final String KEY_EXPLANATION_HTML = "explanationHtml";
    public static final String KEY_EXTERNAL_ID = "externalId";
    public static final String KEY_EXTERNAL_IDS = "externalIds";
    public static final String KEY_EXTERNAL_MOVIE_ID = "externalMovieId";
    public static final String KEY_FEATURE = "feature";
    public static final String KEY_FEATURES = "features";
    public static final String KEY_FEATURES_PER_ROLE = "featuresPerRole";
    public static final String KEY_FEATURE_ADD_PARTICIPANT = "ADD_PARTICIPANT";
    public static final String KEY_FEATURE_ASR_RECORD = "ASR";
    public static final String KEY_FEATURE_MOVIE_SHARE = "MOVIE_SHARE";
    public static final String KEY_FEATURE_RECORD = "RECORD";
    public static final String KEY_FEEDBACK = "feedback";
    public static final String KEY_FILE_NAME = "fileName";
    public static final String KEY_FROM_ID = "fromId";
    public static final String KEY_GAIN = "gain";
    public static final String KEY_GRID = "GRID";
    public static final String KEY_HAND = "hand";
    public static final String KEY_HANDLE_CONNECTION = "handleConnection";
    public static final String KEY_HANDLE_PROMOTE_PARTICIPANT = "handlePromoteParticipant";
    public static final String KEY_HAS_MORE = "hasMore";
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_HOLD = "hold";
    public static final String KEY_ICE = "candidate";
    public static final String KEY_ICE_CANDIDATE = "candidate";
    public static final String KEY_ICE_MIN_LINE_INDEX = "sdpMLineIndex";
    public static final String KEY_ICE_REMOVED_CANDIDATES = "candidates-removed";
    public static final String KEY_ICE_SDP_MID = "sdpMid";
    public static final String KEY_ID = "id";
    public static final String KEY_ID_TYPE = "idType";
    public static final String KEY_INITIATOR = "initiator";
    public static final String KEY_INITIATOR_ID = "initiatorId";
    public static final String KEY_IS_ANIMOJI_ENABLED = "isAnimojiEnabled";
    public static final String KEY_IS_AUDIO_SHARING_ENABLED = "isAudioSharingEnabled";
    public static final String KEY_IS_CONCURRENT = "isConcurrent";
    public static final String KEY_IS_FAST_SCREEN_SHARING_ENABLED = "isFastScreenSharingEnabled";
    public static final String KEY_IS_SCREEN_SHARING_ENABLED = "isScreenSharingEnabled";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_JOIN_LINK = "joinLink";
    public static final String KEY_KEY = "key";

    @Deprecated
    public static final String KEY_LAYOUTS = "layouts";
    public static final String KEY_LIMIT = "limit";
    public static final String KEY_LIST_TYPE = "listType";
    public static final String KEY_MARKER_FOUND = "markerFound";
    public static final String KEY_MEDIA_MODIFIERS = "mediaModifiers";
    public static final String KEY_MEDIA_SETTINGS = "mediaSettings";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_MOVE_TO_ADMIN_ON_HANGUP = "moveToAdminOnHangup";
    public static final String KEY_MOVIE_ID = "movieId";
    public static final String KEY_MOVIE_META = "metadata";
    public static final String KEY_MOVIE_SHARE_INFO = "movieShareInfo";
    public static final String KEY_MOVIE_SHARE_INFOS = "movieShareInfos";
    public static final String KEY_MULTIPARTY_CHAT_ID = "chatId";
    public static final String KEY_MUTE = "mute";
    public static final String KEY_MUTE_OPTIONS = "muteOptions";
    public static final String KEY_MUTE_STATES = "muteStates";
    public static final String KEY_NAME = "name";
    public static final String KEY_NOTIFY = "notification";
    public static final String KEY_OFFER_TO = "offerTo";
    public static final String KEY_OFFER_TO_DEVICE_IDXS = "offerToDeviceIdxs";
    public static final String KEY_OFFER_TO_TYPES = "offerToTypes";
    public static final String KEY_OFFSET = "offset";
    public static final String KEY_ON_HOLD = "onHold";
    public static final String KEY_OPTIONS = "options";
    public static final String KEY_P2P_RELAY = "p2pRelay";
    public static final String KEY_PARTICIPANT = "participant";
    public static final String KEY_PARTICIPANTS = "participants";
    public static final String KEY_PARTICIPANT_COUNT = "participantCount";
    public static final String KEY_PARTICIPANT_DEVICE_IDX = "deviceIdx";
    public static final String KEY_PARTICIPANT_ID = "participantId";
    public static final String KEY_PARTICIPANT_IDS = "participantIds";
    public static final String KEY_PARTICIPANT_STATE = "participantState";
    public static final String KEY_PARTICIPANT_TYPE = "participantType";
    public static final String KEY_PAUSE = "pause";
    public static final String KEY_PAYLOAD = "payload";
    public static final String KEY_PCAP_LABEL = "label";
    public static final String KEY_PEER = "peerId";
    public static final String KEY_PEER_VIDEO_SETTINGS_BITRATES = "bitrates";
    public static final String KEY_PEER_VIDEO_SETTINGS_DEGRADATION_PREFERENCE = "degradationPreference";
    public static final String KEY_PEER_VIDEO_SETTINGS_MAX_BITRATE_K = "maxBitrateK";
    public static final String KEY_PEER_VIDEO_SETTINGS_MAX_DIMENSION = "maxDimension";
    public static final String KEY_PEER_VIDEO_SETTINGS_MAX_FRAMERATE = "maxFramerate";
    public static final String KEY_PERMISSIONS = "permissions";
    public static final String KEY_PINNED_PARTICIPANT_ID = "pinnedParticipantId";
    public static final String KEY_PLATFORM = "platform";

    @Deprecated
    public static final String KEY_PRIORITIES = "priorities";
    public static final String KEY_REASON = "reason";
    public static final String KEY_RECORD_EXTERNAL_MOVIE_ID = "recordExternalMovieId";
    public static final String KEY_RECORD_EXTERNAL_OWNER_ID = "recordExternalOwnerId";
    public static final String KEY_RECORD_INFO = "recordInfo";
    public static final String KEY_RECORD_MOVIE_ID = "recordMovieId";
    public static final String KEY_RECORD_START_TIME = "recordStartTime";
    public static final String KEY_RECORD_TYPE = "recordType";
    public static final String KEY_RECORD_TYPE_RECORD = "RECORD";
    public static final String KEY_RECORD_TYPE_STREAM = "STREAM";
    public static final String KEY_REJECT = "reject";
    public static final String KEY_REJECTED_PARTICIPANTS = "rejectedParticipants";
    public static final String KEY_REJECTED_PARTICIPANT_IDS = "rejectedParticipantIds";
    public static final String KEY_REMOVE = "remove";
    public static final String KEY_REMOVED_PARTICIPANT_IDS = "removedParticipantIds";
    public static final String KEY_REMOVED_PARTICIPANT_MARKERS = "removedParticipantMarkers";
    public static final String KEY_REMOVE_PARTICIPANT_IDS = "removeParticipantIds";
    public static final String KEY_REQUESTED_MEDIA = "requestedMedia";
    public static final String KEY_RESPONDERS = "responders";
    public static final String KEY_RESPONDER_DEVICE_IDXS = "responderDeviceIdxs";
    public static final String KEY_RESPONDER_TYPES = "responderTypes";
    public static final String KEY_RESTRICTED = "restricted";
    public static final String KEY_ROLES = "roles";
    public static final String KEY_ROLE_ADMIN = "ADMIN";
    public static final String KEY_ROLE_CREATOR = "CREATOR";
    public static final String KEY_ROLE_SPEAKER = "SPEAKER";
    public static final String KEY_ROOM = "room";
    public static final String KEY_ROOMS = "rooms";
    public static final String KEY_ROOMS_EVENT_TYPE_ACTIVATE = "ACTIVATE";
    public static final String KEY_ROOMS_EVENT_TYPE_REMOVE = "REMOVE";
    public static final String KEY_ROOMS_EVENT_TYPE_TIMEOUT = "TIMEOUT";
    public static final String KEY_ROOMS_EVENT_TYPE_UPDATE = "UPDATE";
    public static final String KEY_ROOM_ID = "roomId";
    public static final String KEY_ROOM_IDS = "roomIds";
    public static final String KEY_SCREEN_SHARING = "screenSharing";
    public static final String KEY_SDK = "sdk";
    public static final String KEY_SDP = "sdp";
    public static final String KEY_SDP_DESCRIPTION = "sdp";
    public static final String KEY_SDP_ONLY_DESCRIPTION = "description";
    public static final String KEY_SDP_SESSION_ID = "sessionId";
    public static final String KEY_SDP_TYPE = "type";
    public static final String KEY_SEQUENCE = "sequence";
    public static final String KEY_SETTINGS = "settings";
    public static final String KEY_SHARED_URL = "sharedUrl";
    public static final String KEY_SHOW_CHAT_HISTORY = "show_chat_history";
    public static final String KEY_SIDE = "SIDE";
    public static final String KEY_SOURCE = "source";
    public static final String KEY_SSRCS = "ssrcs";
    public static final String KEY_STAMP = "stamp";
    public static final String KEY_STATE = "state";

    @Deprecated
    public static final String KEY_STREAM_TYPE = "streamType";
    public static final String KEY_STREAM_TYPE_MOVIE = "MOVIE";
    public static final String KEY_STREAM_TYPE_STREAM = "STREAM";
    public static final String KEY_S_ANIMOJI = "sANIMOJI";
    public static final String KEY_S_CAMERA = "sCAMERA";
    public static final String KEY_S_MOVIE = "sMOVIE";
    public static final String KEY_S_SCREEN = "sSCREEN";
    public static final String KEY_S_STREAM = "sSTREAM";
    public static final String KEY_TAM_TAM_MULTICHAT_ID = "tamtamMultichatId";
    public static final String KEY_THUMBNAILS = "thumbnails";
    public static final String KEY_TIMEOUT_MS = "timeoutMs";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TOPOLOGY = "topology";
    public static final String KEY_TOTAL_COUNT = "totalCount";
    public static final String KEY_TO_ROOM_ID = "toRoomId";
    public static final String KEY_TYPE = "type";

    @Deprecated
    public static final String KEY_TYPED_PRIORITIES = "typedPriorities";
    public static final String KEY_UNBAN = "unban";
    public static final String KEY_UNMUTE = "unmute";
    public static final String KEY_UNMUTE_OPTIONS = "unmuteOptions";
    public static final String KEY_UNREQUEST = "unrequest";
    public static final String KEY_UPDATES = "updates";
    public static final String KEY_URL = "url";
    public static final String KEY_URL_SHARING_INFO = "urlSharingInfo";
    public static final String KEY_VALUE = "value";
    public static final String KEY_VIDEO_BITRATE = "videoBitrateBps";
    public static final String KEY_VIDEO_ENABLED = "isVideoEnabled";
    public static final String KEY_VIDEO_STREAMS = "videoStreams";
    public static final String KEY_WIDTH = "width";
    public static final String KEY_WITH_PARTICIPANTS = "withParticipants";
    public static final String MEDIA_OPTION_AUDIO = "AUDIO";
    public static final String MEDIA_OPTION_MOVIE_SHARING = "MOVIE_SHARING";
    public static final String MEDIA_OPTION_SCREEN_SHARING = "SCREEN_SHARING";
    public static final String MEDIA_OPTION_STATE_MUTE = "MUTE";
    public static final String MEDIA_OPTION_STATE_MUTE_PERMANENT = "MUTE_PERMANENT";
    public static final String MEDIA_OPTION_STATE_UNMUTE = "UNMUTE";
    public static final String MEDIA_OPTION_VIDEO = "VIDEO";
    public static final String NAME_ERROR = "error";

    @Deprecated
    public static final String NAME_NOTIFY = "notification";
    public static final String NAME_RESPONSE = "response";
    public static final String NOTIFY_ACCEPTED_CALL = "accepted-call";
    public static final String NOTIFY_ASR_RECORD_STARTED = "asr-started";
    public static final String NOTIFY_ASR_RECORD_STOPPED = "asr-stopped";
    public static final String NOTIFY_AUDIO_ACTIVITY = "audio-activity";
    public static final String NOTIFY_CHAT_MESSAGE = "chat-message";
    public static final String NOTIFY_CHAT_ROOM_UPDATED = "chat-room-updated";
    public static final String NOTIFY_CLOSED_CONVERSATION = "closed-conversation";
    public static final String NOTIFY_CONNECTION = "connection";
    public static final String NOTIFY_CONSUMER_ANSWERED = "consumer-answered";
    public static final String NOTIFY_CUSTOM_DATA = "custom-data";
    public static final String NOTIFY_DECORATIVE_PARTICIPANT_ID_CHANGED = "decorative-participant-id-changed";
    public static final String NOTIFY_FEATURES_PER_ROLE_CHANGED = "features-per-role-changed";
    public static final String NOTIFY_FEATURE_SET_CHANGED = "feature-set-changed";
    public static final String NOTIFY_FEEDBACK = "feedback";
    public static final String NOTIFY_FORCE_CHANGE_MEDIA_SETTINGS = "force-media-settings-change";
    public static final String NOTIFY_HOLD = "hold";
    public static final String NOTIFY_HUNGUP = "hungup";
    public static final String NOTIFY_JOIN_LINK_CHANGED = "join-link-changed";
    public static final String NOTIFY_MEDIA_SETTINGS_CHANGED = "media-settings-changed";
    public static final String NOTIFY_MOVIE_SHARE_STARTED = "movie-share-started";
    public static final String NOTIFY_MOVIE_SHARE_STOPPED = "movie-share-stopped";
    public static final String NOTIFY_MULTIPARTY_CHAT_CREATED = "multiparty-chat-created";
    public static final String NOTIFY_MUTE_PARTICIPANT = "mute-participant";
    public static final String NOTIFY_OPTIONS_CHANGED = "options-changed";
    public static final String NOTIFY_PARTICIPANTS_STATE_CHANGED = "participants-state-changed";
    public static final String NOTIFY_PARTICIPANT_ADDED = "participant-added";
    public static final String NOTIFY_PARTICIPANT_ANIMOJI_CHANGED = "participant-animoji-changed";
    public static final String NOTIFY_PARTICIPANT_JOINED = "participant-joined";
    public static final String NOTIFY_PARTICIPANT_STATE_CHANGED = "participant-state-changed";

    @Deprecated
    public static final String NOTIFY_PEER_CONNECTION_LOST = "peer-connection-lost";

    @Deprecated
    public static final String NOTIFY_PEER_CONNECTION_RESTORED = "peer-connection-restored";
    public static final String NOTIFY_PEER_REGISTERED = "registered-peer";
    public static final String NOTIFY_PIN_PARTICIPANT = "pin-participant";
    public static final String NOTIFY_PRODUCER_UPDATED = "producer-updated";
    public static final String NOTIFY_PROMOTE_PARTICIPANT = "promote-participant";
    public static final String NOTIFY_PROMOTION_APPROVED = "promotion-approved";
    public static final String NOTIFY_RATE_CALL_DATA = "rate-call-data";
    public static final String NOTIFY_REALLOC_CONSUMER = "realloc-con";
    public static final String NOTIFY_RECORD_STARTED = "record-started";
    public static final String NOTIFY_RECORD_STOPPED = "record-stopped";
    public static final String NOTIFY_ROLES_CHANGED = "roles-changed";
    public static final String NOTIFY_ROOMS_UPDATED = "rooms-updated";
    public static final String NOTIFY_ROOM_PARTICIPANTS_UPDATED = "room-participants-updated";
    public static final String NOTIFY_ROOM_UPDATED = "room-updated";
    public static final String NOTIFY_SESSION_STATE = "session-state";
    public static final String NOTIFY_SETTINGS_UPDATE = "settings-update";
    public static final String NOTIFY_SPEAKER_CHANGED = "speaker-changed";
    public static final String NOTIFY_STALLED_ACTIVITY = "stalled-activity";
    public static final String NOTIFY_SWITCH_MICRO = "switch-micro";
    public static final String NOTIFY_TOPOLOGY_CHANGED = "topology-changed";
    public static final String NOTIFY_TRANSMITTED_DATA = "transmitted-data";
    public static final String NOTIFY_URL_SHARING_INFO_UPDATED = "url-sharing-info-updated";
    public static final String PARTICIPANT_PERMISSION_MUTE = "MUTE_PARTICIPANTS";
    public static final String PARTICIPANT_STATE_ACCEPTED = "ACCEPTED";
    public static final String PARTICIPANT_STATE_CALLED = "CALLED";
    public static final String PARTICIPANT_STATE_HUNGUP = "HUNGUP";
    public static final String PARTICIPANT_STATE_REJECTED = "REJECTED";

    @Deprecated
    public static final String PEER_CONNECTION_KIND_CONSUMER = "CONSUMER";

    @Deprecated
    public static final String PEER_CONNECTION_KIND_PRODUCER = "PRODUCER";

    @Deprecated
    public static final String STATE_ACTIVE = "ACTIVE";
    public static final String STATE_ENDED = "ENDED";

    @Deprecated
    public static final String STATE_STARTED = "STARTED";
    public static final String TOPOLOGY_SERVER = "SERVER";
    public static final String VIDEO_TRACK_ID_PREFIX = "video-";

    public static class Capabilities {
        public static final int H265_SUPPORTED = 1;
    }

    public static GenericCommand a(JSONObject jSONObject, Boolean bool, boolean z) {
        if (bool != null && bool.booleanValue()) {
            jSONObject.put(KEY_UNBAN, true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(KEY_SHOW_CHAT_HISTORY, true);
            jSONObject.put("payload", jSONObject2.toString());
        }
        return a("add-participant", jSONObject);
    }

    @NonNull
    public static SignalingCommand createAcceptCallCommand(SignalingMediaSettings signalingMediaSettings) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", "accept-call");
            jSONObject.put(KEY_MEDIA_SETTINGS, createMediaSettingsParams(signalingMediaSettings, false, false));
            return new GenericCommand(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createAcceptPromotion(@NonNull boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", COMMAND_ACCEPT_PROMOTION);
        jSONObject.put(KEY_REJECT, z);
        return new GenericCommand(jSONObject);
    }

    @NonNull
    public static SignalingCommand createActivateRoomsCommand(@NonNull ActivateRoomsParams activateRoomsParams) throws JSONException {
        JSONObject d = yq.d("command", "activate-rooms");
        if (activateRoomsParams == null) {
            return new GenericCommand(d);
        }
        Collection<SessionRoomId.Room> roomIds = activateRoomsParams.getRoomIds();
        if (roomIds == null) {
            return new GenericCommand(d);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<SessionRoomId.Room> it = roomIds.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        d.put(KEY_ROOM_IDS, jSONArray);
        if (activateRoomsParams.getDeactivate()) {
            d.put(KEY_DEACTIVATE, true);
        }
        return new GenericCommand(d);
    }

    @NonNull
    public static SignalingCommand createAddMovieCommand(long j, float f, @Nullable MoviePresetMeta moviePresetMeta, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "add-movie");
        jSONObject.put(KEY_MOVIE_ID, j);
        jSONObject.put(KEY_GAIN, f);
        jSONObject.put(KEY_MOVE_TO_ADMIN_ON_HANGUP, z);
        if (moviePresetMeta != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", moviePresetMeta.getTitle());
            JSONArray jSONArray = new JSONArray();
            for (MovieThumbnail.Quality quality : moviePresetMeta.getImages()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("url", quality.getLink());
                jSONObject3.put("width", quality.getWidth());
                jSONObject3.put("height", quality.getHeight());
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put(KEY_THUMBNAILS, jSONArray);
            jSONObject.put("metadata", jSONObject2);
        }
        return new GenericCommand(jSONObject);
    }

    @NonNull
    public static SignalingCommand createAddParticipants(Collection<CallParticipant.ParticipantId> collection, @Nullable Boolean bool, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (CallParticipant.ParticipantId participantId : collection) {
            jSONArray.put(participantId.type.toString() + participantId.id);
        }
        jSONObject.put(KEY_PARTICIPANT_IDS, jSONArray);
        return a(jSONObject, bool, z);
    }

    @NonNull
    public static SignalingCommand createAddParticipantsExtIds(Collection<CallExternalId> collection, @Nullable Boolean bool, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<CallExternalId> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        jSONObject.put("externalIds", jSONArray);
        return a(jSONObject, bool, z);
    }

    @NonNull
    public static SignalingCommand createAsrStartCommand(String str, SessionRoomId sessionRoomId) {
        try {
            GenericCommand put = a("asr-start", (JSONObject) null).put("fileName", str);
            if (sessionRoomId instanceof SessionRoomId.Room) {
                put.put(KEY_ROOM_ID, ((SessionRoomId.Room) sessionRoomId).getId());
            }
            return put;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createAsrStopCommand(SessionRoomId sessionRoomId) {
        try {
            GenericCommand a = a("asr-stop", (JSONObject) null);
            if (sessionRoomId instanceof SessionRoomId.Room) {
                a.put(KEY_ROOM_ID, ((SessionRoomId.Room) sessionRoomId).getId());
            }
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createChangeMediaSettingsCommand(SignalingMediaSettings signalingMediaSettings, boolean z, boolean z2) {
        return new SignalingCommandChangeMediaSettings(signalingMediaSettings, z, z2);
    }

    @NonNull
    public static SignalingCommand createChangeOptions(@Nullable Set<Call.Option> set, @Nullable Set<Call.Option> set2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (set != null) {
                Iterator<Call.Option> it = set.iterator();
                while (it.hasNext()) {
                    jSONObject.put(it.next().name(), true);
                }
            }
            if (set2 != null) {
                Iterator<Call.Option> it2 = set2.iterator();
                while (it2.hasNext()) {
                    jSONObject.put(it2.next().name(), false);
                }
            }
            return a("change-options", (JSONObject) null).put(KEY_OPTIONS, jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createChangeParticipantState(@NonNull Map<String, String> map, @Nullable CallParticipant.ParticipantId participantId) {
        try {
            GenericCommand put = a("change-participant-state", (JSONObject) null).put(KEY_PARTICIPANT_STATE, new JSONObject().put("state", new JSONObject(map)));
            if (participantId != null) {
                put.put(KEY_PARTICIPANT_ID, participantId.toStringValue());
            }
            return put;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createChatMessage(@Nullable CallParticipant.ParticipantId participantId, @NonNull String str) {
        JSONObject jSONObject;
        if (participantId != null) {
            try {
                jSONObject = new JSONObject();
                a(participantId, jSONObject, true);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            jSONObject = null;
        }
        return a(NOTIFY_CHAT_MESSAGE, jSONObject).put("message", str);
    }

    public static SignalingCommand createCollectDebugDump(boolean z, boolean z2, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("audio", z);
        jSONObject.put("video", z2);
        jSONObject.put("duration", i);
        return a("collect-debug-dump", jSONObject);
    }

    @NonNull
    public static SignalingCommand createCustomData(CallParticipant.ParticipantId participantId, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(KEY_PARTICIPANT_ID, participantId.id);
            jSONObject2.put(KEY_PARTICIPANT_TYPE, participantId.type.name());
            jSONObject2.put("deviceIdx", participantId.deviceIndex);
            jSONObject2.put("data", jSONObject);
            return a(NOTIFY_CUSTOM_DATA, jSONObject2);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public static CallExternalId createExternalIdFromParent(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            int optInt = jSONObject.optInt("deviceIdx", 0);
            if (jSONObject.has(KEY_DECORATIVE_EXTERNAL_PARTICIPANT_ID)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(KEY_DECORATIVE_EXTERNAL_PARTICIPANT_ID);
                if (jSONObject2 == null) {
                    return null;
                }
                String string = jSONObject2.getString("id");
                String lowerCase = jSONObject2.getString("type").toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return new CallExternalId(string, !lowerCase.equals("anonym") ? !lowerCase.equals("vk") ? CallExternalId.Type.UNKNOWN : CallExternalId.Type.VK : CallExternalId.Type.ANONYM, optInt);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(KEY_EXTERNAL_ID);
            if (jSONObject3 == null) {
                return null;
            }
            String string2 = jSONObject3.getString("id");
            String lowerCase2 = jSONObject3.getString("type").toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            return new CallExternalId(string2, !lowerCase2.equals("anonym") ? !lowerCase2.equals("vk") ? CallExternalId.Type.UNKNOWN : CallExternalId.Type.VK : CallExternalId.Type.ANONYM, optInt);
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    public static SignalingCommand createGetChatHistory(@Nullable Integer num, @Nullable Integer num2) {
        try {
            return a("chat-history", (JSONObject) null).put(KEY_OFFSET, num.intValue()).put("count", num2.intValue());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static SignalingCommand createGetGroupSettingsRequest(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("groupId", str);
            return a("get-group-settings", jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createGetHandQueue() throws JSONException {
        return new GenericCommand(yq.d("command", COMMAND_GET_HAND_QUEUE));
    }

    public static SignalingCommand createHoldCommand(boolean z, @Nullable ServerCallCapabilities serverCallCapabilities) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "hold");
        jSONObject.put("hold", z);
        if (serverCallCapabilities != null) {
            jSONObject.put("capabilities", a(serverCallCapabilities));
        }
        return new GenericCommand(jSONObject);
    }

    @Nullable
    public static IceCandidate createIceCandidate(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            return new IceCandidate(jSONObject.getString(KEY_ICE_SDP_MID), jSONObject.getInt(KEY_ICE_MIN_LINE_INDEX), jSONObject.getString("candidate"));
        }
        return null;
    }

    @Nullable
    public static List<IceCandidate> createIceCandidates(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(createIceCandidate(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    @NonNull
    public static JSONObject createJsonIceCandidateParams(CallParticipant.ParticipantId participantId, IceCandidate iceCandidate) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("candidate", MiscHelper.secureIceCandidateSdpString(iceCandidate));
        jSONObject.put(KEY_ICE_SDP_MID, iceCandidate.sdpMid);
        jSONObject.put(KEY_ICE_MIN_LINE_INDEX, iceCandidate.sdpMLineIndex);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidate", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        a(participantId, jSONObject3, true);
        jSONObject3.put("data", jSONObject2);
        return jSONObject3;
    }

    @NonNull
    public static JSONObject createJsonOfferAnswer(CallParticipant.ParticipantId participantId, SessionDescription sessionDescription, boolean z, @Nullable String str, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a(participantId, jSONObject, true);
        jSONObject.put("data", createJsonWithSdp(sessionDescription, z, str, i));
        return jSONObject;
    }

    @NonNull
    public static JSONObject createJsonRemovedIceCandidatesParams(CallParticipant.ParticipantId participantId, IceCandidate[] iceCandidateArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (IceCandidate iceCandidate : iceCandidateArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidate", MiscHelper.secureIceCandidateSdpString(iceCandidate));
            jSONObject.put(KEY_ICE_SDP_MID, iceCandidate.sdpMid);
            jSONObject.put(KEY_ICE_MIN_LINE_INDEX, iceCandidate.sdpMLineIndex);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(KEY_ICE_REMOVED_CANDIDATES, jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        a(participantId, jSONObject3, true);
        jSONObject3.put("data", jSONObject2);
        return jSONObject3;
    }

    public static JSONObject createJsonSdpDescription(@Nullable SessionDescription sessionDescription) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (sessionDescription != null) {
            jSONObject.put("description", sessionDescription.description);
        }
        return jSONObject;
    }

    @NonNull
    public static JSONObject createJsonWithSdp(SessionDescription sessionDescription, boolean z, @Nullable String str, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", sessionDescription.type.canonicalForm());
        jSONObject.put("sdp", sessionDescription.description);
        if (sessionDescription.type.equals(SessionDescription.Type.OFFER) && z) {
            jSONObject.put(KEY_P2P_RELAY, "true");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("sdp", jSONObject);
        if (i != 0) {
            jSONObject2.put("capabilities", Integer.toHexString(i));
        }
        if (str != null) {
            jSONObject2.put("label", str);
        }
        return jSONObject2;
    }

    @Nullable
    public static MediaOptionState createMediaOptionState(@Nullable String str) {
        if (str == null) {
            return null;
        }
        if (str.equals(MEDIA_OPTION_STATE_UNMUTE)) {
            return MediaOptionState.UNMUTED;
        }
        if (str.equals(MEDIA_OPTION_STATE_MUTE)) {
            return MediaOptionState.UNMUTED_BUT_MUTED_ONCE;
        }
        if (str.equals(MEDIA_OPTION_STATE_MUTE_PERMANENT)) {
            return MediaOptionState.MUTED_PERMANENT;
        }
        return null;
    }

    @NonNull
    public static Map<MediaOption, MediaOptionState> createMediaOptionStates(@NonNull JSONObject jSONObject, @NonNull String str) {
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            hashMap.put(MediaOption.AUDIO, createMediaOptionState(optJSONObject.optString(MEDIA_OPTION_AUDIO)));
            hashMap.put(MediaOption.VIDEO, createMediaOptionState(optJSONObject.optString(MEDIA_OPTION_VIDEO)));
            hashMap.put(MediaOption.SCREEN_SHARING, createMediaOptionState(optJSONObject.optString(MEDIA_OPTION_SCREEN_SHARING)));
            hashMap.put(MediaOption.MOVIE_SHARING, createMediaOptionState(optJSONObject.optString(MEDIA_OPTION_MOVIE_SHARING)));
        }
        return hashMap;
    }

    @Nullable
    public static MutableMediaSettings createMediaSettings(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new MutableMediaSettings(jSONObject.optBoolean(KEY_AUDIO_ENABLED, false), jSONObject.optBoolean(KEY_VIDEO_ENABLED, false), jSONObject.optBoolean(KEY_IS_SCREEN_SHARING_ENABLED, false), jSONObject.optBoolean(KEY_IS_ANIMOJI_ENABLED, false));
    }

    @Nullable
    public static MutableMediaSettings createMediaSettingsFromParent(JSONObject jSONObject) {
        return createMediaSettings(jSONObject.optJSONObject(KEY_MEDIA_SETTINGS));
    }

    @NonNull
    public static JSONObject createMediaSettingsParams(SignalingMediaSettings signalingMediaSettings, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY_VIDEO_ENABLED, signalingMediaSettings.isVideoEnabled());
            jSONObject.put(KEY_AUDIO_ENABLED, signalingMediaSettings.isAudioEnabled());
            jSONObject.put(KEY_IS_SCREEN_SHARING_ENABLED, signalingMediaSettings.isScreenSharingEnabled());
            jSONObject.put(KEY_IS_ANIMOJI_ENABLED, signalingMediaSettings.isAnimojiEnabled());
            if (z) {
                jSONObject.put(KEY_IS_FAST_SCREEN_SHARING_ENABLED, signalingMediaSettings.isFastScreenSharingEnabled());
            }
            if (z2) {
                jSONObject.put(KEY_IS_AUDIO_SHARING_ENABLED, signalingMediaSettings.isAudioSharingEnabled());
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createMuteAll() {
        try {
            return a(NOTIFY_SWITCH_MICRO, new JSONObject().put("all", true).put("muteTarget", true));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public static Peer createPeerFromParent(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("peerId");
        if (optJSONObject != null) {
            return new Peer(optJSONObject.getString("id"));
        }
        return null;
    }

    public static SignalingCommand createPromoteParticipant(CallParticipant.ParticipantId participantId, boolean z) {
        try {
            return a(z, participantId);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createPutHandsDown() {
        return a("put-hands-down", (JSONObject) null);
    }

    @NonNull
    public static SignalingCommand createRemoveMovieCommand(long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "remove-movie");
        jSONObject.put(KEY_MOVIE_ID, j);
        return new GenericCommand(jSONObject);
    }

    @NonNull
    public static SignalingCommand createRemoveRoomsCommand(@NonNull RemoveRoomsParams removeRoomsParams) throws JSONException {
        JSONObject d = yq.d("command", "remove-rooms");
        if (removeRoomsParams == null) {
            return new GenericCommand(d);
        }
        Collection<SessionRoomId.Room> roomIds = removeRoomsParams.getRoomIds();
        if (roomIds == null) {
            return new GenericCommand(d);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<SessionRoomId.Room> it = roomIds.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        d.put(KEY_ROOM_IDS, jSONArray);
        return new GenericCommand(d);
    }

    @NonNull
    @Deprecated
    public static SignalingCommand createReportStat(Ssrc.VideoRecv videoRecv) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RTCStatsConstants.KEY_FRAMES_DECODED, videoRecv.framesDecoded);
            jSONObject.put(RTCStatsConstants.KEY_FRAMES_RECEIVED, videoRecv.framesReceived);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("report", jSONObject);
            return a("report-perf-stat", jSONObject2);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createRequestAcceptProducer(SessionDescription sessionDescription, Set<String> set, String str) throws JSONException {
        JSONObject createJsonSdpDescription = createJsonSdpDescription(sessionDescription);
        if (!set.isEmpty()) {
            createJsonSdpDescription.put(KEY_SSRCS, new JSONArray((Collection) set));
        }
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                int codePointAt = str.codePointAt(i);
                if (!Character.isWhitespace(codePointAt)) {
                    createJsonSdpDescription.put("sessionId", str);
                    break;
                }
                i += Character.charCount(codePointAt);
            }
        }
        return a("accept-producer", createJsonSdpDescription);
    }

    @NonNull
    public static SignalingCommand createRequestAddParticipant(CallParticipant.ParticipantId participantId, @Nullable Boolean bool, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a(participantId, jSONObject, false);
        return a(jSONObject, bool, z);
    }

    @NonNull
    public static SignalingCommand createRequestAddParticipantByLink(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantIdAsQRCodeLink", str);
        return a("add-participant", jSONObject);
    }

    @NonNull
    public static SignalingCommand createRequestAllocConsumer(@Nullable SessionDescription sessionDescription, ServerCallCapabilities serverCallCapabilities) throws JSONException {
        JSONObject createJsonSdpDescription = createJsonSdpDescription(sessionDescription);
        createJsonSdpDescription.put("capabilities", a(serverCallCapabilities));
        return a("allocate-consumer", createJsonSdpDescription);
    }

    @NonNull
    public static SignalingCommand createRequestAsrOnlineCommand() {
        return a("request-asr", (JSONObject) null);
    }

    @NonNull
    public static SignalingCommand createRequestGrantRoles(@NonNull CallParticipant.ParticipantId participantId, @NonNull List<CallParticipant.Role> list, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_PARTICIPANT_ID, participantId.toStringValue());
        JSONArray jSONArray = new JSONArray();
        Iterator<CallParticipant.Role> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put(KEY_ROLES, jSONArray);
        jSONObject.put("revoke", z);
        return a("grant-roles", jSONObject);
    }

    @NonNull
    public static SignalingCommand createRequestPinParticipant(@NonNull CallParticipant.ParticipantId participantId, @NonNull SessionRoomId sessionRoomId, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_PARTICIPANT_ID, participantId.toStringValue());
        if (sessionRoomId instanceof SessionRoomId.Room) {
            jSONObject.put(KEY_ROOM_ID, ((SessionRoomId.Room) sessionRoomId).getId());
        }
        jSONObject.put("unpin", !z);
        return a(NOTIFY_PIN_PARTICIPANT, jSONObject);
    }

    @NonNull
    public static SignalingCommand createRequestPromotion(@NonNull boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", COMMAND_REQUEST_PROMOTION);
        jSONObject.put(KEY_UNREQUEST, z);
        return new GenericCommand(jSONObject);
    }

    @NonNull
    public static SignalingCommand createRequestRealloc() {
        return a("request-realloc", (JSONObject) null);
    }

    @NonNull
    public static SignalingCommand createRequestRecovery(long j, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_STAMP, j);
        jSONObject.put(KEY_SEQUENCE, i);
        return a("recover", jSONObject);
    }

    @NonNull
    public static SignalingCommand createRequestRemoveParticipant(CallParticipant.ParticipantId participantId, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a(participantId, jSONObject, false);
        jSONObject.put("ban", z);
        return a("remove-participant", jSONObject);
    }

    @NonNull
    public static SignalingCommand createRequestTransmitData(CallParticipant.ParticipantId participantId, IceCandidate iceCandidate) throws JSONException {
        return a("transmit-data", createJsonIceCandidateParams(participantId, iceCandidate));
    }

    @NonNull
    public static List<CallParticipant.Role> createRolesFromParent(JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(KEY_ROLES)) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(CallParticipant.Role.valueOf(optJSONArray.getString(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static SessionDescription createSdp(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            return new SessionDescription(SessionDescription.Type.fromCanonicalForm(jSONObject.getString("type")), jSONObject.getString("sdp"));
        }
        return null;
    }

    @NonNull
    public static SignalingCommand createSendFeedbackCommand(@NonNull String str) {
        try {
            return a("feedback", (JSONObject) null).put("key", str);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createStartRecord(@Nullable Long l, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable String str, @Nullable Long l2, @Nullable String str2, boolean z, SessionRoomId sessionRoomId, boolean z2) {
        return new SignalingCommandRecordStart(l, charSequence, charSequence2, str, l2, str2, z, sessionRoomId, z2);
    }

    @NonNull
    public static SignalingCommand createStopRecord(SessionRoomId sessionRoomId, boolean z, boolean z2) throws JSONException {
        return new SignalingCommandRecordStop(sessionRoomId, z, z2);
    }

    @NonNull
    public static SignalingCommand createSwitchMicro(@NonNull CallParticipant.ParticipantId participantId, boolean z) {
        try {
            return a(NOTIFY_SWITCH_MICRO, new JSONObject().put("eId", participantId.toStringValue()).put("muteTarget", z));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static SignalingCommand createSwitchRoomCommand(@NonNull SwitchRoomParams switchRoomParams) throws JSONException {
        JSONObject d = yq.d("command", "switch-room");
        if (switchRoomParams == null) {
            return new GenericCommand(d);
        }
        SessionRoomId toRoomId = switchRoomParams.getToRoomId();
        if (toRoomId != null && (toRoomId instanceof SessionRoomId.Room)) {
            d.put(KEY_TO_ROOM_ID, ((SessionRoomId.Room) toRoomId).getId());
        }
        CallParticipant.ParticipantId participantId = switchRoomParams.getParticipantId();
        if (participantId != null) {
            d.put(KEY_PARTICIPANT_ID, participantId.toStringValue());
        }
        return new GenericCommand(d);
    }

    @NonNull
    public static SignalingCommand createSwitchTopology(String str, boolean z) {
        GenericCommand a = a("switch-topology", (JSONObject) null);
        try {
            a.put(KEY_TOPOLOGY, str);
            a.put("force", z);
            return a;
        } catch (JSONException e) {
            e.printStackTrace();
            return a;
        }
    }

    @NonNull
    public static SignalingCommand createUpdateMediaModifiers(MediaModifiers mediaModifiers) {
        return new SignalingCommandChangeMediaModifiers(mediaModifiers);
    }

    @NonNull
    public static SignalingCommand createUpdateMovieMuteCommand(long j, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put(KEY_MOVIE_ID, j);
        jSONObject.put("mute", z);
        return new GenericCommand(jSONObject);
    }

    @NonNull
    public static SignalingCommand createUpdateMovieOffsetCommand(long j, long j2, TimeUnit timeUnit) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put(KEY_MOVIE_ID, j);
        jSONObject.put(KEY_OFFSET, timeUnit.toSeconds(j2));
        return new GenericCommand(jSONObject);
    }

    @NonNull
    public static SignalingCommand createUpdateMoviePauseCommand(long j, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put(KEY_MOVIE_ID, j);
        jSONObject.put("pause", z);
        return new GenericCommand(jSONObject);
    }

    @NonNull
    public static SignalingCommand createUpdateMovieVolumeCommand(long j, float f, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put(KEY_MOVIE_ID, j);
        jSONObject.put(KEY_GAIN, f);
        jSONObject.put("mute", z);
        return new GenericCommand(jSONObject);
    }

    @NonNull
    public static SignalingCommand createUpdateRoomsCommand(@NonNull UpdateRoomsParams updateRoomsParams) throws JSONException {
        JSONObject d = yq.d("command", "update-rooms");
        if (updateRoomsParams == null) {
            return new GenericCommand(d);
        }
        Collection<UpdateRoomsParams.Room> rooms = updateRoomsParams.getRooms();
        if (rooms == null) {
            return new GenericCommand(d);
        }
        JSONArray jSONArray = new JSONArray();
        for (UpdateRoomsParams.Room room : rooms) {
            JSONObject jSONObject = new JSONObject();
            SessionRoomId.Room id = room.getId();
            if (id != null) {
                jSONObject.put("id", id.getId());
            }
            String name = room.getName();
            if (name != null) {
                jSONObject.put("name", name);
            }
            Integer countdownSec = room.getCountdownSec();
            if (countdownSec != null) {
                jSONObject.put(KEY_COUNTDOWN_SEC, countdownSec);
            }
            Long timeoutMs = room.getTimeoutMs();
            if (timeoutMs != null) {
                jSONObject.put(KEY_TIMEOUT_MS, timeoutMs);
            }
            Integer participantCount = room.getParticipantCount();
            if (participantCount != null) {
                jSONObject.put(KEY_PARTICIPANT_COUNT, participantCount);
            }
            Collection<CallParticipant.ParticipantId> participantIds = room.getParticipantIds();
            if (participantIds != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<CallParticipant.ParticipantId> it = participantIds.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().toStringValue());
                }
                jSONObject.put(KEY_PARTICIPANT_IDS, jSONArray2);
            }
            Collection<CallParticipant.ParticipantId> addParticipantIds = room.getAddParticipantIds();
            if (addParticipantIds != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<CallParticipant.ParticipantId> it2 = addParticipantIds.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next().toStringValue());
                }
                jSONObject.put(KEY_ADD_PARTICIPANT_IDS, jSONArray3);
            }
            Collection<CallParticipant.ParticipantId> removeParticipantIds = room.getRemoveParticipantIds();
            if (removeParticipantIds != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator<CallParticipant.ParticipantId> it3 = removeParticipantIds.iterator();
                while (it3.hasNext()) {
                    jSONArray4.put(it3.next().toStringValue());
                }
                jSONObject.put(KEY_REMOVE_PARTICIPANT_IDS, jSONArray4);
            }
            jSONArray.put(jSONObject);
        }
        d.put(KEY_ROOMS, jSONArray);
        if (updateRoomsParams.getAssignRandomly()) {
            d.put(KEY_ASSIGN_RANDOMLY, true);
        }
        return new GenericCommand(d);
    }

    public static SignalingCommand createWaitingRoomParticipantsList(@Nullable CallWaitingParticipantId callWaitingParticipantId, int i, boolean z) {
        try {
            return a(z, callWaitingParticipantId, i);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static CallParticipant.ParticipantId extractParticipantIdFromAny(JSONObject jSONObject) {
        long optLong = jSONObject.optLong(KEY_PARTICIPANT_ID);
        String optString = jSONObject.optString(KEY_PARTICIPANT_TYPE);
        return new CallParticipant.ParticipantId(optLong, "GROUP".equals(optString) ? CallParticipant.ParticipantId.Type.GROUP : CallParticipant.ParticipantId.Type.USER, jSONObject.optInt("deviceIdx"));
    }

    public static CallParticipant.ParticipantId extractParticipantIdFromParticipant(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("id");
        String optString = jSONObject.optString(KEY_ID_TYPE);
        return new CallParticipant.ParticipantId(optLong, "GROUP".equals(optString) ? CallParticipant.ParticipantId.Type.GROUP : CallParticipant.ParticipantId.Type.USER, jSONObject.optInt("deviceIdx"));
    }

    public static List<CallParticipant.ParticipantId> extractParticipantIdListFromOfferTo(JSONObject jSONObject) {
        return a(jSONObject, KEY_RESPONDERS, KEY_RESPONDER_TYPES, KEY_RESPONDER_DEVICE_IDXS);
    }

    public static List<CallParticipant.ParticipantId> extractParticipantIdListFromResponders(JSONObject jSONObject) {
        return a(jSONObject, KEY_OFFER_TO, KEY_OFFER_TO_TYPES, KEY_OFFER_TO_DEVICE_IDXS);
    }

    @Nullable
    public static PeerVideoSettings extractPeerVideoSettingsFromAny(JSONObject jSONObject, String str) {
        return extractPeerVideoSettingsFromAny(jSONObject.optJSONObject(str));
    }

    public static boolean extractUnpin(@NonNull JSONObject jSONObject) {
        return jSONObject.optBoolean("unpin", false);
    }

    @Nullable
    public static MediaOption getMediaOption(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    @Nullable
    public static String getMediaOptionStateForRequest(@Nullable MediaOptionState mediaOptionState) {
        if (mediaOptionState == null) {
            return null;
        }
        int i = g.a[mediaOptionState.ordinal()];
        if (i == 1) {
            return MEDIA_OPTION_STATE_UNMUTE;
        }
        if (i == 2) {
            return MEDIA_OPTION_STATE_MUTE;
        }
        if (i == 3) {
            return MEDIA_OPTION_STATE_MUTE_PERMANENT;
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalArgumentException("Unknown media option state: " + mediaOptionState);
    }

    @Nullable
    public static Integer getParticipantCapabilitiesFromParticipant(JSONObject jSONObject) {
        String optString;
        if (!jSONObject.has("capabilities") || (optString = jSONObject.optString("capabilities", null)) == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(optString, 16));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static List<String> getParticipantExtIdsFromDataArray(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                arrayList.add(optJSONArray.getJSONObject(i).getString(KEY_EXTERNAL_ID));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    @Nullable
    public static CallParticipant.ParticipantId getParticipantIdFromSpeakerChanged(JSONObject jSONObject) {
        try {
            return CallParticipant.ParticipantId.fromStringValueSafe(jSONObject.getString("speaker"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    public static List<CallParticipant.ParticipantId> getParticipantIdsFromAudioActivity(JSONObject jSONObject) {
        return getParticipantIdsFromStringArray(jSONObject, "activeParticipants");
    }

    @Nullable
    public static List<CallParticipant.ParticipantId> getParticipantIdsFromStalledActivity(JSONObject jSONObject) {
        return getParticipantIdsFromStringArray(jSONObject, "stalledParticipants");
    }

    @Nullable
    public static List<CallParticipant.ParticipantId> getParticipantIdsFromStringArray(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                CallParticipant.ParticipantId fromStringValueSafe = CallParticipant.ParticipantId.fromStringValueSafe(optJSONArray.getString(i));
                if (fromStringValueSafe != null) {
                    arrayList.add(fromStringValueSafe);
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    @Nullable
    public static String getParticipantStateFromParticipant(JSONObject jSONObject) {
        return jSONObject.optString("state");
    }

    @NonNull
    public static SessionRoomId getSessionRoomIdFromParent(JSONObject jSONObject) throws JSONException {
        return (!jSONObject.has(KEY_ROOM_ID) || jSONObject.isNull(KEY_ROOM_ID)) ? SessionRoomId.MainCall.INSTANCE : new SessionRoomId.Room(jSONObject.getInt(KEY_ROOM_ID));
    }

    public static CallParticipant.SessionState getSessionStateFromParent(JSONObject jSONObject) throws JSONException {
        return new CallParticipant.SessionState(Boolean.valueOf(jSONObject.getBoolean(AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED)));
    }

    @Nullable
    public static CallParticipant.SessionState getSessionStateFromParticipant(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("sessionState");
        if (optJSONObject == null) {
            return null;
        }
        try {
            return new CallParticipant.SessionState(Boolean.valueOf(optJSONObject.getBoolean(AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED)));
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    public static VideoTrackType getTrackTypeFromString(@NonNull String str) {
        str.getClass();
        switch (str) {
            case "sANIMOJI":
                return VideoTrackType.ANIMOJI;
            case "sMOVIE":
                return VideoTrackType.MOVIE;
            case "sCAMERA":
                return VideoTrackType.VIDEO;
            case "sSCREEN":
                return VideoTrackType.SCREEN_CAPTURE;
            case "sSTREAM":
                return VideoTrackType.STREAM;
            default:
                throw new RuntimeException("Unknown video track type");
        }
    }

    public static String getUpdateDisplayLayoutKey(@NonNull ServerDisplayLayoutItem serverDisplayLayoutItem) {
        String str;
        String str2;
        MovieId movieId = serverDisplayLayoutItem.getVideoTrackParticipantKey().getMovieId();
        if (movieId != null) {
            str = ":m" + movieId.getId();
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(serverDisplayLayoutItem.getVideoTrackParticipantKey().getParticipantId().toStringValue());
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        int i = g.b[serverDisplayLayoutItem.getVideoTrackParticipantKey().getType().ordinal()];
        if (i == 1) {
            str2 = KEY_S_CAMERA;
        } else if (i == 2) {
            str2 = KEY_S_SCREEN;
        } else if (i == 3) {
            str2 = KEY_S_MOVIE;
        } else if (i == 4) {
            str2 = KEY_S_STREAM;
        } else {
            if (i != 5) {
                throw new RuntimeException("Unknown VideoTrackType");
            }
            str2 = KEY_S_ANIMOJI;
        }
        return i5s.a(sb, str2, str);
    }

    public static JSONObject getWaitingParticipantIdJson(CallWaitingParticipantId callWaitingParticipantId) throws JSONException {
        return new JSONObject().put("id", callWaitingParticipantId.getParticipantId().toString()).put(KEY_ADDED_TS, callWaitingParticipantId.getAddedTs());
    }

    public static boolean isCollectDebugDumpResponse(JSONObject jSONObject) {
        return "response".equals(jSONObject.optString("type")) && "collect-debug-dump".equals(jSONObject.optString("response"));
    }

    public static boolean isConsumerAnsweredNotify(String str) {
        return NOTIFY_CONSUMER_ANSWERED.equals(str);
    }

    public static boolean isProducerUpdatedNotify(String str) {
        return NOTIFY_PRODUCER_UPDATED.equals(str);
    }

    @Nullable
    public static Set<HangupInfo.HangupError> parseHungupErrors(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HangupInfo.HangupError fromCode;
        if (!NOTIFY_HUNGUP.equals(jSONObject.optString("notification")) || (optJSONArray = jSONObject.optJSONArray(KEY_ERRORS)) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < optJSONArray.length(); i++) {
            int optInt = optJSONArray.optInt(i, Integer.MIN_VALUE);
            if (optInt != Integer.MIN_VALUE && (fromCode = HangupInfo.HangupError.fromCode(optInt)) != null) {
                hashSet.add(fromCode);
            }
        }
        return hashSet;
    }

    @NonNull
    public static List<MediaOption> parseMediaOptions(@NonNull JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("mediaOptions")) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("mediaOptions");
        for (int i = 0; i < jSONArray.length(); i++) {
            MediaOption mediaOption = getMediaOption(jSONArray.getString(i));
            if (mediaOption != null) {
                arrayList.add(mediaOption);
            }
        }
        return arrayList;
    }

    @NonNull
    public static Set<MediaOption> parseRequestedMediaOptions(@NonNull JSONObject jSONObject) {
        try {
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray(KEY_REQUESTED_MEDIA);
            for (int i = 0; i < jSONArray.length(); i++) {
                MediaOption mediaOption = getMediaOption(jSONArray.getString(i));
                if (mediaOption != null) {
                    hashSet.add(mediaOption);
                }
            }
            return hashSet;
        } catch (JSONException unused) {
            return Collections.EMPTY_SET;
        }
    }

    @Nullable
    public static CallVideoTrackParticipantKey parseVideoTrackParticipantKey(@NonNull String str) {
        String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        VideoTrackType videoTrackType = VideoTrackType.VIDEO;
        CallParticipant.ParticipantId participantId = null;
        MovieId movieId = null;
        for (String str2 : split) {
            if (str2 != null) {
                if (str2.startsWith("u") || str2.startsWith(com.vungle.ads.internal.task.g.e)) {
                    participantId = CallParticipant.ParticipantId.fromStringValueSafe(str);
                }
                if (str2.startsWith(UcumUtils.UCUM_SECONDS)) {
                    videoTrackType = getTrackTypeFromString(str2);
                }
                if (str2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                    movieId = new MovieId(Long.parseLong(str2.substring(1)));
                }
            }
        }
        if (participantId == null) {
            return null;
        }
        return new CallVideoTrackParticipantKey.Builder().setParticipantId(participantId).setType(videoTrackType).setMovieId(movieId).build();
    }

    @Nullable
    public static CallParticipant.ParticipantId participantIdFromAudioTrackId(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith(AUDIO_TRACK_ID_PREFIX) || str.length() == 6) {
            return null;
        }
        return CallParticipant.ParticipantId.fromStringValueSafe(str.substring(6));
    }

    @Nullable
    public static CallParticipant.ParticipantId participantIdFromTrackId(String str) {
        CallParticipant.ParticipantId participantIdFromAudioTrackId = participantIdFromAudioTrackId(str);
        return participantIdFromAudioTrackId != null ? participantIdFromAudioTrackId : participantIdFromVideoTrackId(str);
    }

    @Nullable
    public static CallParticipant.ParticipantId participantIdFromVideoTrackId(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith(VIDEO_TRACK_ID_PREFIX) || str.length() == 6) {
            return null;
        }
        return CallParticipant.ParticipantId.fromStringValueSafe(str.substring(6));
    }

    @NonNull
    public static String trackIdFromParticipantId(CallParticipant.ParticipantId participantId) {
        return VIDEO_TRACK_ID_PREFIX + participantId.toStringValue();
    }

    @NonNull
    public static SignalingCommand createRequestTransmitData(CallParticipant.ParticipantId participantId, IceCandidate[] iceCandidateArr) throws JSONException {
        return a("transmit-data", createJsonRemovedIceCandidatesParams(participantId, iceCandidateArr));
    }

    @Nullable
    public static PeerVideoSettings extractPeerVideoSettingsFromAny(@Nullable JSONObject jSONObject) {
        PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable = null;
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt(KEY_PEER_VIDEO_SETTINGS_MAX_DIMENSION);
        int optInt2 = jSONObject.optInt(KEY_PEER_VIDEO_SETTINGS_MAX_BITRATE_K);
        int optInt3 = jSONObject.optInt(KEY_PEER_VIDEO_SETTINGS_MAX_FRAMERATE);
        String optString = jSONObject.optString(KEY_PEER_VIDEO_SETTINGS_DEGRADATION_PREFERENCE);
        try {
            peerVideoSettingsBitrateTable = PeerVideoSettingsBitrateTable.fromJson(jSONObject.getJSONObject(KEY_PEER_VIDEO_SETTINGS_BITRATES));
        } catch (Exception unused) {
        }
        return new PeerVideoSettings(optInt, optInt, optInt2, optInt3, optString, peerVideoSettingsBitrateTable, 1);
    }

    @NonNull
    public static SignalingCommand createRequestRecovery(long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_STAMP, j);
        return a("recover", jSONObject);
    }

    @NonNull
    public static SignalingCommand createRequestTransmitData(CallParticipant.ParticipantId participantId, SessionDescription sessionDescription, boolean z, @Nullable String str, int i) {
        try {
            return a("transmit-data", createJsonOfferAnswer(participantId, sessionDescription, z, str, i));
        } catch (JSONException e) {
            throw new RuntimeException("sdp " + sessionDescription.type + " " + sessionDescription.description, e);
        }
    }

    public static JSONObject a(ServerCallCapabilities serverCallCapabilities) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("maxH264Decoders", serverCallCapabilities.getMaxH264Decoders());
        if (serverCallCapabilities.getEstimatedPerfIndex() != null) {
            jSONObject.put(PreferencesHelper.ESTIMATED_PERFORMANCE_INDEX_KEY, serverCallCapabilities.getEstimatedPerfIndex());
        }
        jSONObject.put("producerNotificationDataChannelVersion", 7);
        jSONObject.put("producerCommandDataChannelVersion", serverCallCapabilities.getProducerCommandDataChannelVersion());
        jSONObject.put("audioMix", true);
        jSONObject.put("consumerUpdate", serverCallCapabilities.isConsumerUpdateEnabled());
        jSONObject.put("onDemandTracks", serverCallCapabilities.isOnDemandTracksEnabled());
        jSONObject.put("singleSession", true);
        jSONObject.put("unifiedPlan", true);
        jSONObject.put("fastScreenShare", true);
        if (serverCallCapabilities.isDataChannelScreenShareRecvEnabled()) {
            jSONObject.put("producerScreenDataChannelVersion", 1);
        }
        if (serverCallCapabilities.isDataChannelScreenShareSendEnabled()) {
            jSONObject.put("consumerScreenDataChannelVersion", 1);
        }
        if (serverCallCapabilities.isAnimojiDataChannelEnabled()) {
            jSONObject.put("animojiDataChannelVersion", serverCallCapabilities.getAnimojiDataChannelVersion());
        }
        if (serverCallCapabilities.isAnimojiBackendRenderEnabled()) {
            jSONObject.put("animojiBackendRender", true);
        }
        if (serverCallCapabilities.isAsrOnlineEnabled()) {
            jSONObject.put("asrDataChannelVersion", 1);
        }
        if (serverCallCapabilities.isFastScreenCaptureEnabled()) {
            jSONObject.put("consumerFastScreenShare", true);
        }
        jSONObject.put("consumerFastScreenShareQualityOnDemand", true);
        if (serverCallCapabilities.isDeviceAudioShareEnabled()) {
            jSONObject.put("audioShare", true);
        }
        if (serverCallCapabilities.isSimulcastEnabled()) {
            jSONObject.put("simulcast", true);
            jSONObject.put("simulcastNativeOrder", true);
        }
        jSONObject.put("red", true);
        if (serverCallCapabilities.getVideoTracksCount() > 0) {
            jSONObject.put("videoTracksCount", serverCallCapabilities.getVideoTracksCount());
            jSONObject.put("csrcAccessible", true);
        }
        return jSONObject;
    }

    public static GenericCommand a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("command", str);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            return new GenericCommand(jSONObject2, false);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList a(JSONObject jSONObject, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        JSONArray optJSONArray2 = jSONObject.optJSONArray(str2);
        JSONArray optJSONArray3 = jSONObject.optJSONArray(str3);
        if (optJSONArray != null) {
            int i = 0;
            while (i < optJSONArray.length()) {
                arrayList.add(new CallParticipant.ParticipantId(Long.parseLong(optJSONArray.optString(i)), (optJSONArray2 == null || i >= optJSONArray2.length()) ? false : "GROUP".equals(optJSONArray2.optString(i)) ? CallParticipant.ParticipantId.Type.GROUP : CallParticipant.ParticipantId.Type.USER, (optJSONArray3 == null || i >= optJSONArray3.length()) ? 0 : optJSONArray3.optInt(i)));
                i++;
            }
        }
        return arrayList;
    }

    public static void a(CallParticipant.ParticipantId participantId, JSONObject jSONObject, boolean z) {
        jSONObject.put(KEY_PARTICIPANT_ID, participantId.id);
        jSONObject.put(KEY_PARTICIPANT_TYPE, participantId.type.name());
        if (z) {
            jSONObject.put("deviceIdx", participantId.deviceIndex);
        }
    }

    public static /* synthetic */ SignalingCommand a(boolean z, CallParticipant.ParticipantId participantId) {
        return a(NOTIFY_PROMOTE_PARTICIPANT, (JSONObject) null).put(KEY_DEMOTE, !z).put(KEY_PARTICIPANT_ID, participantId.toStringValue());
    }

    public static /* synthetic */ SignalingCommand a(boolean z, CallWaitingParticipantId callWaitingParticipantId, int i) {
        GenericCommand put = a("get-waiting-hall", (JSONObject) null).put("backward", z);
        if (callWaitingParticipantId != null) {
            put.put(KEY_FROM_ID, getWaitingParticipantIdJson(callWaitingParticipantId));
        }
        if (i > 0) {
            put.put("count", i);
        }
        return put;
    }
}
