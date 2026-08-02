package ru.ok.android.externcalls.sdk;

import java.util.Collection;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.annotation.CallExperimentalApi;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.HangupReason;
import ru.ok.android.webrtc.animoji.util.AnimojiControl;
import ru.ok.android.webrtc.hangup.HangupParameters;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signallingchat.SignalingChatMessage;
import ru.ok.android.webrtc.stat.MediaStat;
import ru.ok.android.webrtc.stat.camera.CameraStatProvider;
import ru.ok.android.webrtc.utils.AudioProcessor;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.asp;
import xsna.hav;
import xsna.izs;
import xsna.ozl;
import xsna.qt;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: Conversation.kt */
/* loaded from: classes9.dex */
public interface Conversation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Conversation.kt */
    public static final class CallType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CallType[] $VALUES;
        public static final CallType Incoming = new CallType("Incoming", 0);
        public static final CallType Outgoing = new CallType("Outgoing", 1);
        public static final CallType Join = new CallType("Join", 2);

        private static final /* synthetic */ CallType[] $values() {
            return new CallType[]{Incoming, Outgoing, Join};
        }

        static {
            CallType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private CallType(String str, int i) {
        }

        public static zrp<CallType> getEntries() {
            return $ENTRIES;
        }

        public static CallType valueOf(String str) {
            return (CallType) Enum.valueOf(CallType.class, str);
        }

        public static CallType[] values() {
            return (CallType[]) $VALUES.clone();
        }
    }

    /* compiled from: Conversation.kt */
    public interface ChatHistoryCallback {
        void onResponse(SignalingChatMessage[] signalingChatMessageArr);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Conversation.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State None = new State("None", 0);
        public static final State Preparing = new State("Preparing", 1);
        public static final State Starting = new State("Starting", 2);
        public static final State Connecting = new State("Connecting", 3);
        public static final State Connected = new State("Connected", 4);
        public static final State HeldByMe = new State("HeldByMe", 5);
        public static final State Finished = new State("Finished", 6);

        private static final /* synthetic */ State[] $values() {
            return new State[]{None, Preparing, Starting, Connecting, Connected, HeldByMe, Finished};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private State(String str, int i) {
        }

        public static zrp<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void addParticipant$default(Conversation conversation, ParticipantId participantId, Boolean bool, boolean z, Consumer consumer, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addParticipant");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            consumer = null;
        }
        conversation.addParticipant(participantId, bool, z, consumer);
    }

    static /* synthetic */ void addParticipants$default(Conversation conversation, Collection collection, Boolean bool, boolean z, izs izsVar, izs izsVar2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addParticipants");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            izsVar = new qt(21);
        }
        izs izsVar3 = izsVar;
        if ((i & 16) != 0) {
            izsVar2 = null;
        }
        conversation.addParticipants(collection, bool, z2, izsVar3, izsVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static s3q0 addParticipants$lambda$0(AddParticipantsResult addParticipantsResult) {
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setAnonJoinForbidden$default(Conversation conversation, boolean z, Consumer consumer, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnonJoinForbidden");
        }
        if ((i & 2) != 0) {
            consumer = null;
        }
        conversation.setAnonJoinForbidden(z, consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setFeedbackEnabled$default(Conversation conversation, boolean z, Consumer consumer, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFeedbackEnabled");
        }
        if ((i & 2) != 0) {
            consumer = null;
        }
        conversation.setFeedbackEnabled(z, consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setWaitingRoomEnabled$default(Conversation conversation, boolean z, Consumer consumer, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWaitingRoomEnabled");
        }
        if ((i & 2) != 0) {
            consumer = null;
        }
        conversation.setWaitingRoomEnabled(z, consumer);
    }

    void addEventsListener(ConversationEventsListener conversationEventsListener);

    @ozl
    void addParticipant(String str, boolean z, Consumer<String> consumer);

    @ozl
    void addParticipant(ParticipantId participantId, Boolean bool, boolean z, Consumer<String> consumer);

    void addParticipantByLink(String str, Runnable runnable, Consumer<Throwable> consumer);

    void addParticipants(Collection<ParticipantId> collection, Boolean bool, boolean z, izs<AddParticipantsResult, s3q0> izsVar, izs<Throwable, s3q0> izsVar2);

    void changeMyState(Map<String, String> map);

    void changeMyState(Map<String, String> map, Signaling.Listener listener);

    void connect();

    float getAdjustedAudioLevel(ConversationParticipant conversationParticipant);

    AnimojiControl getAnimojiControl();

    AsrManager getAsrManager();

    AsrOnlineManager getAsrOnlineManager();

    AudioProcessor getAudioLevel(ConversationParticipant conversationParticipant);

    int getAudioLevelFrequencyMs();

    CallInfo getCallInfo();

    CallType getCallType();

    CameraManager getCameraManager();

    CameraStatProvider getCameraStatProvider();

    ChatManager getChatManager();

    ContactCallManager getContactCallManager();

    String getConversationId();

    DebugManager getDebugManager();

    String getDestroyReason();

    DisplayLayoutSender getDisplayLayoutSender();

    ConversationFeatureManager getFeatureManager();

    FeedbackManager getFeedbackManager();

    String getJoinLink();

    ConversationParticipant getMe();

    MediaConnectionManager getMediaConnectionManager();

    MediaMuteManager getMediaMuteManager();

    MicrophoneManager getMicrophoneManager();

    NetworkConnectionManager getNetworkConnectionManager();

    NoiseSuppressionManager getNoiseSuppressionManager();

    ConversationParticipant getOpponent();

    MediaStat getParticipantMediaStat(ConversationParticipant conversationParticipant);

    ParticipantStatesManager getParticipantStatesManager();

    ParticipantCollection getParticipants();

    ConversationParticipant getPinnedParticipant();

    RateManager getRateManager();

    RecordManager getRecordManager();

    HangupReason getRejectReason();

    ScreenCaptureManager getScreenCaptureManager();

    SessionRoomsManager getSessionRoomManager();

    State getState();

    StereoRoomManager getStereoRoomManager();

    Call getUnderlyingCall();

    UrlSharingManager getUrlSharingManager();

    VideoRenderManager getVideoRenderManager();

    WatchTogetherPlayer getWatchTogetherPlayer();

    void grantRoles(ParticipantId participantId, boolean z, CallParticipant.Role... roleArr);

    void hangup(HangupParameters hangupParameters);

    boolean hasRegisteredParticipnats();

    void init();

    boolean isAdminHere();

    boolean isAnonJoinForbidden();

    boolean isAnswered();

    boolean isAudioMixEnabled();

    boolean isCaller();

    boolean isConcurrent();

    boolean isConditionAccepted();

    boolean isConnected();

    boolean isDestroyed();

    boolean isFeatureAddParticipantEnabled();

    boolean isFeedbackEnabled();

    boolean isGroupCall();

    boolean isHeldByMe();

    boolean isInited();

    boolean isInitialVideoEnabled();

    boolean isMeCreatorOrAdmin();

    boolean isMeInWaitingRoom();

    boolean isMuteParticipantsPermitted();

    @ozl
    boolean isParticipantAdmin(String str);

    @ozl
    boolean isParticipantCreator(String str);

    @ozl
    boolean isParticipantCreatorOrAdmin(String str);

    boolean isPermissionsGranted();

    boolean isPrepared();

    boolean isRecurring();

    boolean isVideoPermissionGranted();

    boolean isWaitForAdminEnabled();

    boolean isWaitingRoomEnabled();

    void muteAll();

    void pinParticipant(ParticipantId participantId, boolean z);

    void promoteParticipant(ParticipantId participantId, boolean z);

    void queryChatHistory(Integer num, Integer num2, ChatHistoryCallback chatHistoryCallback);

    void release();

    void removeEventsListener(ConversationEventsListener conversationEventsListener);

    void removeParticipant(ParticipantId participantId);

    void removeParticipant(ParticipantId participantId, boolean z);

    void requestHoldStateChange(boolean z, hav havVar);

    void sendData(ConversationParticipant conversationParticipant, JSONObject jSONObject);

    void setAnonJoinForbidden(boolean z);

    void setAnonJoinForbidden(boolean z, Consumer<String> consumer);

    void setAudioCaptureEnabled(boolean z);

    void setCallOptionEnabled(Call.Option option, boolean z, Consumer<String> consumer);

    void setFeedbackEnabled(boolean z);

    void setFeedbackEnabled(boolean z, Consumer<String> consumer);

    void setMuteState(ParticipantId participantId, boolean z);

    void setWaitingRoomEnabled(boolean z);

    void setWaitingRoomEnabled(boolean z, Consumer<String> consumer);

    @CallExperimentalApi
    static /* synthetic */ void getDebugManager$annotations() {
    }

    @ozl
    static /* synthetic */ void getRejectReason$annotations() {
    }

    @ozl
    static /* synthetic */ void isConditionAccepted$annotations() {
    }
}
