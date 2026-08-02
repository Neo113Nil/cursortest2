package ru.ok.android.externcalls.sdk.events;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.HangupReason;
import ru.ok.android.webrtc.SignalingErrors;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.media.MuteEvent;
import xsna.iav;

/* loaded from: classes9.dex */
public interface ConversationEventsListener extends RecordEventListener {

    public static class CallEndInfo {

        @Nullable
        public final String explanationHtml;

        @Nullable
        public final Set<HangupHint> hints;

        @Nullable
        public final HangupReason reason;

        public CallEndInfo(@Nullable HangupReason hangupReason, Set<HangupHint> set, @Nullable String str) {
            this.reason = hangupReason;
            this.hints = set;
            this.explanationHtml = str;
        }
    }

    @Deprecated
    default void onCallEnded(@NonNull CallEndInfo callEndInfo) {
    }

    @Deprecated
    default void onDestroyed() {
    }

    @Nullable
    default ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return null;
    }

    default void onCallEnded(@NonNull ConversationEndInfo conversationEndInfo) {
    }

    default void onDestroyed(@NonNull ConversationDestroyedInfo conversationDestroyedInfo) {
    }

    @Deprecated
    default void onDestroyed(@Nullable String str) {
        onDestroyed();
    }

    default void onCallAccepted() {
    }

    default void onCallAcceptedForAll() {
    }

    default void onCallSignalingConnected() {
    }

    @Deprecated
    default void onCameraBusy() {
    }

    default void onCameraChanged() {
    }

    default void onCameraForciblyMuted() {
    }

    @Deprecated
    default void onConnected() {
    }

    @Deprecated
    default void onDisconnected() {
    }

    default void onLocalMediaChanged() {
    }

    default void onMicrophoneForciblyMuted() {
    }

    @Deprecated
    default void onMigratedToServerTopology() {
    }

    @Deprecated
    default void onOpponentMediaChanged() {
    }

    default void onOpponentRegistered() {
    }

    default void onWaitForAdminEnabled() {
    }

    default void onAdminInCallChanged(boolean z) {
    }

    default void onAnonJoinForbiddenChanged(boolean z) {
    }

    default void onCallIsUnfeasibleError(@NonNull SignalingErrors.CallIsUnfeasibleError callIsUnfeasibleError) {
    }

    default void onCallParticipantsNetworkStatusChanged(@NonNull List<ConversationParticipant> list) {
    }

    default void onCallStartResolutionFailed(List<ParticipantId> list) {
    }

    default void onCustomData(JSONObject jSONObject) {
    }

    default void onJoinLinkUpdated(@NonNull String str) {
    }

    default void onMeInWaitingRoomChanged(boolean z) {
    }

    default void onMicChanged(boolean z) {
    }

    @Deprecated
    default void onMuteChanged(@NonNull MuteEvent muteEvent) {
    }

    @Deprecated
    default void onMuteStateInitialized(@NonNull MuteEvent muteEvent) {
    }

    default void onOpponentFingerprintChanged(long j) {
    }

    default void onParticipantHoldStateChanged(@NonNull iav iavVar) {
    }

    default void onParticipantsAdded(@NonNull List<ConversationParticipant> list) {
    }

    default void onParticipantsChanged(@NonNull List<ConversationParticipant> list) {
    }

    default void onParticipantsRemoved(@NonNull List<ConversationParticipant> list) {
    }

    default void onParticipantsUpdated(@NonNull Collection<ConversationParticipant> collection) {
    }

    default void onRateCall(@NonNull RateCallData rateCallData) {
    }

    default void onRecurringChanged(boolean z) {
    }

    default void onRolesChanged(ConversationParticipant conversationParticipant) {
    }

    default void onWaitingRoomEnabledChanged(boolean z) {
    }

    default void onWaitingRoomParticipantsChanged(@NonNull WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
    }

    default void onConversationIdChanged(@NonNull String str, @NonNull String str2) {
    }

    default void onParticipantsDeAnonymized(@NonNull List<ConversationParticipant> list, @NonNull Map<ParticipantId, ParticipantId> map) {
    }

    default void onPinChanged(@Nullable ConversationParticipant conversationParticipant, boolean z) {
    }

    default void onStateChanged(@NonNull ConversationParticipant conversationParticipant, @NonNull CallParticipant.ParticipantState participantState) {
    }
}
