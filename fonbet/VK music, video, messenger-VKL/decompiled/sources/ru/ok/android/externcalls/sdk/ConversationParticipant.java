package ru.ok.android.externcalls.sdk;

import androidx.annotation.NonNull;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.NetworkStatus;
import ru.ok.android.webrtc.participant.movie.Movie;
import xsna.ji;

/* loaded from: classes9.dex */
public class ConversationParticipant {
    private static final String LOG_TAG = "ConversationParticipant";
    private CallParticipant callParticipant;
    private ParticipantId externalId;
    private CallParticipant.ParticipantId internalId;
    private boolean reported;
    private final LocalParticipantId localParticipantId = LocalParticipantId.nextId();
    private int capabilities = 0;

    private ConversationParticipant() {
    }

    public static ConversationParticipant fromExternal(ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setExternalId(participantId);
        CallParticipant.ParticipantId byExternal = idMappingWrapper.getByExternal(participantId);
        if (byExternal != null) {
            conversationParticipant.setInternalId(byExternal);
        }
        return conversationParticipant;
    }

    public static ConversationParticipant fromInternal(CallParticipant.ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setInternalId(participantId);
        ParticipantId byInternal = idMappingWrapper.getByInternal(participantId);
        if (byInternal != null) {
            conversationParticipant.setExternalId(byInternal);
        }
        return conversationParticipant;
    }

    public void deAnonymize(CallParticipant callParticipant, ParticipantId participantId, ParticipantId participantId2, LocalIdMappings localIdMappings) {
        this.externalId = participantId2;
        this.callParticipant = callParticipant;
        localIdMappings.deAnonymizeMapping(participantId, this);
    }

    public long getAcceptCallEpochMs() {
        CallParticipant callParticipant = this.callParticipant;
        if (callParticipant != null) {
            return callParticipant.getAcceptCallEpochMs();
        }
        return 0L;
    }

    public String getAcceptedCallClientType() {
        CallParticipant callParticipant = this.callParticipant;
        if (callParticipant == null) {
            return null;
        }
        return callParticipant.getAcceptedCallClientType();
    }

    public String getAcceptedCallPlatform() {
        CallParticipant callParticipant = this.callParticipant;
        if (callParticipant == null) {
            return null;
        }
        return callParticipant.getAcceptedCallPlatform();
    }

    @NonNull
    public MediaOptionState getAudioOptionState() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null ? callParticipant.getAudioOptionState() : MediaOptionState.UNMUTED;
    }

    public CallParticipant getCallParticipant() {
        return this.callParticipant;
    }

    @NonNull
    public ClientCapabilities getCapabilities() {
        int i;
        CallParticipant callParticipant = this.callParticipant;
        int capabilities = callParticipant != null ? callParticipant.getCapabilities() : 0;
        if (capabilities == 0 && (i = this.capabilities) != 0) {
            capabilities = i;
        }
        return ClientCapabilities.from(capabilities);
    }

    public ParticipantId getExternalId() {
        return this.externalId;
    }

    public CallParticipant.ParticipantId getInternalId() {
        return this.internalId;
    }

    public LocalParticipantId getLocalParticipantId() {
        return this.localParticipantId;
    }

    @NonNull
    public List<Movie> getMovies() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant == null ? Collections.EMPTY_LIST : callParticipant.getMovies();
    }

    @NonNull
    public NetworkStatus getNetworkStatus() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant == null ? NetworkStatus.GOOD : callParticipant.getNetworkStatus();
    }

    @NonNull
    public MediaOptionState getScreenshareOptionState() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null ? callParticipant.getScreenshareOptionState() : MediaOptionState.UNMUTED;
    }

    @NonNull
    public MediaOptionState getVideoOptionState() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null ? callParticipant.getVideoOptionState() : MediaOptionState.UNMUTED;
    }

    @NonNull
    public MediaOptionState getWatchTogetherOptionState() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null ? callParticipant.getWatchTogetherOptionState() : MediaOptionState.UNMUTED;
    }

    public boolean hasRegisteredPeers() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.hasRegisteredPeers();
    }

    public boolean isAdmin() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.getRoles().contains(CallParticipant.Role.ADMIN);
    }

    public boolean isAnimojiEnabled() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.isAnimojiEnabled();
    }

    public boolean isAudioEnabled() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.isAudioEnabled();
    }

    public boolean isCallAccepted() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.isCallAccepted();
    }

    public boolean isConnected() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.isConnected();
    }

    public boolean isCreator() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.getRoles().contains(CallParticipant.Role.CREATOR);
    }

    public boolean isPrimarySpeaker() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.isPrimarySpeaker();
    }

    public boolean isReported() {
        return this.reported;
    }

    public boolean isScreenCaptureEnabled() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.mediaSettings.isScreenCaptureEnabled();
    }

    public boolean isTalking() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.isTalkingWithAudioCheck();
    }

    public boolean isUseable() {
        CallParticipant callParticipant;
        return (!isReported() || (callParticipant = this.callParticipant) == null || callParticipant.getParticipantId() == null) ? false : true;
    }

    public boolean isVideoEnabled() {
        CallParticipant callParticipant = this.callParticipant;
        return callParticipant != null && callParticipant.isVideoEnabled();
    }

    public void setCallParticipant(CallParticipant callParticipant, LocalIdMappings localIdMappings) {
        this.callParticipant = callParticipant;
        if (callParticipant != null) {
            this.internalId = callParticipant.getParticipantId();
        }
        localIdMappings.addMappings(this);
    }

    public void setCapabilities(ClientCapabilities clientCapabilities) {
        this.capabilities = clientCapabilities.getValue();
    }

    public void setDeviceIndex(int i, LocalIdMappings localIdMappings) {
        GlobalRTCLogger globalRTCLogger = GlobalRTCLogger.INSTANCE;
        StringBuilder b = ji.b(i, "updateDeviceIndex ", " for ");
        b.append(this.externalId);
        GlobalRTCLogger.log(LOG_TAG, b.toString());
        if (this.externalId != null) {
            ParticipantId participantId = this.externalId;
            this.externalId = new ParticipantId(participantId.id, participantId.isAnon, i);
        }
        CallParticipant.ParticipantId participantId2 = this.internalId;
        if (participantId2 != null) {
            this.internalId = new CallParticipant.ParticipantId(participantId2.id, participantId2.type, i);
        }
        CallParticipant callParticipant = this.callParticipant;
        if (callParticipant != null) {
            callParticipant.setDeviceIndex(i);
        }
        localIdMappings.addMappings(this);
    }

    public void setExternalId(ParticipantId participantId) {
        this.externalId = participantId;
    }

    public void setInternalId(CallParticipant.ParticipantId participantId) {
        this.internalId = participantId;
        CallParticipant callParticipant = this.callParticipant;
        if (callParticipant != null) {
            callParticipant.updateId(participantId);
        }
    }

    public void setReported(boolean z) {
        this.reported = z;
    }

    @NonNull
    public String toString() {
        return this.externalId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.internalId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.callParticipant;
    }
}
