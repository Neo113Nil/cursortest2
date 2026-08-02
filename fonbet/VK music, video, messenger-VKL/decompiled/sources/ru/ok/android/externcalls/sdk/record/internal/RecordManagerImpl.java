package ru.ok.android.externcalls.sdk.record.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordDescriptionHistory;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.listeners.CallRecordListener;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.record.CallRecordDescription;
import ru.ok.android.webrtc.record.RecordInfoProvider;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.record.RecordCommandParamsCreator;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.mx5;
import xsna.r44;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: RecordManagerImpl.kt */
/* loaded from: classes9.dex */
public final class RecordManagerImpl implements RecordManager, CallSessionRoomsListener, CallRecordListener, RecordInfoProvider {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_REMOVE_ERROR = "removeError";
    private static final String LOG_TAG = "RecordManagerImpl";
    private final RecordEventListener deprecatedRecordListener;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final boolean isStrongModeEnabled;
    private final RTCLog logger;
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;
    private final RecordCommandParamsCreator commandParamsCreator = new RecordCommandParamsCreator();
    private final CopyOnWriteArraySet<RecordEventListener> listeners = new CopyOnWriteArraySet<>();
    private final HashMap<SessionRoomId, RecordDescription> sessionRoomToRecordInfo = new HashMap<>();
    private final HashMap<SessionRoomId, RecordDescriptionHistory> sessionRoomToRecordInfoHistory = new HashMap<>();
    private SessionRoomId activeRoomId = SessionRoomId.MainCall.INSTANCE;

    /* compiled from: RecordManagerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public RecordManagerImpl(RTCLog rTCLog, ParticipantStore participantStore, IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper, SignalingProvider signalingProvider, RecordEventListener recordEventListener, boolean z) {
        this.logger = rTCLog;
        this.participantStore = participantStore;
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
        this.signalingProvider = signalingProvider;
        this.deprecatedRecordListener = recordEventListener;
        this.isStrongModeEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRecordStarted(CallRecordListener.RecordStartInfo recordStartInfo) {
        RecordDescription recordDescription = toRecordDescription(recordStartInfo.getRecordDescription());
        if (recordDescription == null) {
            return;
        }
        setMyRecordHistory(recordDescription.getInitiator(), recordStartInfo.getSessionRoomId(), recordDescription);
        this.sessionRoomToRecordInfo.put(recordStartInfo.getSessionRoomId(), recordDescription);
        if (epx.f(recordStartInfo.getSessionRoomId(), this.activeRoomId)) {
            reportStarted();
        }
    }

    private final void notifyListenersWhenActiveRoomChanged(SessionRoomId sessionRoomId, SessionRoomId sessionRoomId2) {
        if (this.sessionRoomToRecordInfo.get(sessionRoomId) != null) {
            RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(sessionRoomId);
            reportStopped(recordDescription != null ? recordDescription.getInitiator() : null);
        }
        if (this.sessionRoomToRecordInfo.get(sessionRoomId2) != null) {
            reportStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRecordStarted$lambda$1(RecordManagerImpl recordManagerImpl) {
        recordManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void reportError(String str) {
        this.deprecatedRecordListener.onRecordError(str);
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((RecordEventListener) it.next()).onRecordError(str);
        }
    }

    private final void reportStarted() {
        this.deprecatedRecordListener.onRecordStarted();
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((RecordEventListener) it.next()).onRecordStarted();
        }
    }

    private final void reportStopped(ParticipantId participantId) {
        ConversationParticipant byExternal = participantId != null ? this.participantStore.getByExternal(participantId) : null;
        this.deprecatedRecordListener.onRecordStopped(byExternal);
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((RecordEventListener) it.next()).onRecordStopped(byExternal);
        }
    }

    private final void setMyRecordHistory(ParticipantId participantId, SessionRoomId sessionRoomId, RecordDescription recordDescription) {
        ConversationParticipant me2 = this.participantStore.getMe();
        if (epx.f(participantId, me2 != null ? me2.getExternalId() : null)) {
            HashMap<SessionRoomId, RecordDescriptionHistory> hashMap = this.sessionRoomToRecordInfoHistory;
            RecordDescriptionHistory recordDescriptionHistory = hashMap.get(sessionRoomId);
            hashMap.put(sessionRoomId, new RecordDescriptionHistory(recordDescription, recordDescriptionHistory != null ? recordDescriptionHistory.getCurrentState() : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecord$lambda$0(RecordManager.StartParams startParams, gzs gzsVar, JSONObject jSONObject) {
        if (startParams.getOnSuccess() != null) {
            startParams.getOnSuccess().invoke(new RecordManager.StartRecordInfo());
        } else if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecord$lambda$1(RecordManagerImpl recordManagerImpl, RecordManager.StartParams startParams, izs izsVar, JSONObject jSONObject) {
        String str;
        if ("error".equals(jSONObject.optString("type"))) {
            str = jSONObject.optString("message");
            recordManagerImpl.reportError(str);
        } else {
            str = null;
        }
        String jSONObject2 = jSONObject.toString();
        if (str == null) {
            str = jSONObject.toString();
        }
        RecordManager.RecordStartError recordStartError = new RecordManager.RecordStartError(jSONObject2, str);
        recordManagerImpl.logger.logException(LOG_TAG, "Can't start record", recordStartError);
        izs<Throwable, s3q0> onError = startParams.getOnError();
        if (onError != null) {
            izsVar = onError;
        }
        if (izsVar != null) {
            izsVar.invoke(recordStartError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopRecord$lambda$0(RecordManager.StopParams stopParams, gzs gzsVar, JSONObject jSONObject) {
        if (stopParams.getOnSuccess() != null) {
            stopParams.getOnSuccess().invoke(new RecordManager.StopRecordInfo(stopParams.getRemoveRecord() ? jSONObject.has(KEY_REMOVE_ERROR) ? epx.f(jSONObject.optString(KEY_REMOVE_ERROR), "record.remove_unsupported") ? RecordManager.StopRecordInfo.RemoveResult.NOT_SUPPORTED : RecordManager.StopRecordInfo.RemoveResult.NOT_REMOVED : RecordManager.StopRecordInfo.RemoveResult.REMOVED : RecordManager.StopRecordInfo.RemoveResult.NOT_REQUESTED));
        } else if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopRecord$lambda$1(RecordManagerImpl recordManagerImpl, RecordManager.StopParams stopParams, izs izsVar, JSONObject jSONObject) {
        String str;
        if ("error".equals(jSONObject.optString("type"))) {
            str = jSONObject.optString("message");
            recordManagerImpl.reportError(str);
        } else {
            str = null;
        }
        String jSONObject2 = jSONObject.toString();
        if (str == null) {
            str = jSONObject.toString();
        }
        RecordManager.RecordStopError recordStopError = new RecordManager.RecordStopError(jSONObject2, str);
        izs<Throwable, s3q0> onError = stopParams.getOnError();
        if (onError != null) {
            izsVar = onError;
        }
        if (izsVar != null) {
            izsVar.invoke(recordStopError);
        }
        recordManagerImpl.logger.logException(LOG_TAG, "Can't stop record", recordStopError);
    }

    private final CallRecordDescription toCallRecordDescription(RecordDescription recordDescription) {
        CallParticipant.ParticipantId byExternal;
        ConversationParticipant participantById = this.participantStore.getParticipantById(recordDescription.getInitiator());
        if ((participantById == null || (byExternal = participantById.getInternalId()) == null) && (byExternal = this.idMappingWrapper.getByExternal(recordDescription.getInitiator())) == null) {
            return null;
        }
        return new CallRecordDescription(recordDescription.getMovieId(), recordDescription.getType(), byExternal, recordDescription.getStart(), recordDescription.getExternalMovieId(), recordDescription.getExternalOwnerId());
    }

    private final RecordDescription toRecordDescription(CallRecordDescription callRecordDescription) {
        ParticipantId byInternal;
        ConversationParticipant byInternal2 = this.participantStore.getByInternal(callRecordDescription.getInitiator());
        if ((byInternal2 == null || (byInternal = byInternal2.getExternalId()) == null) && (byInternal = this.idMappingWrapper.getByInternal(callRecordDescription.getInitiator())) == null) {
            return null;
        }
        return new RecordDescription(byInternal, callRecordDescription.getRecordType(), callRecordDescription.getRecordStartTime(), callRecordDescription.getRecordMovieId(), callRecordDescription.getRecordExternalMovieId(), callRecordDescription.getRecordExternalOwnerId());
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void addRecordListener(RecordEventListener recordEventListener) {
        this.listeners.add(recordEventListener);
    }

    @Override // ru.ok.android.webrtc.record.RecordInfoProvider
    public CallRecordDescription getActiveRecording(SessionRoomId sessionRoomId) {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(sessionRoomId);
        if (recordDescription != null) {
            return toCallRecordDescription(recordDescription);
        }
        return null;
    }

    public final ParticipantId getRecordAdmin() {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(this.activeRoomId);
        if (recordDescription != null) {
            return recordDescription.getInitiator();
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public RecordDescription getRecordDescription() {
        return this.sessionRoomToRecordInfo.get(this.activeRoomId);
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public Map<SessionRoomId, RecordDescriptionHistory> getRecordDescriptionHistory() {
        return this.sessionRoomToRecordInfoHistory;
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantActiveRoomChanged(CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        if (epx.f(activeRoomChangedParams.getRoomId(), this.activeRoomId)) {
            return;
        }
        SessionRoomId sessionRoomId = this.activeRoomId;
        SessionRoomId roomId = activeRoomChangedParams.getRoomId();
        this.activeRoomId = roomId;
        notifyListenersWhenActiveRoomChanged(sessionRoomId, roomId);
    }

    @Override // ru.ok.android.webrtc.listeners.CallRecordListener
    public void onRecordError(CallRecordListener.RecordErrorInfo recordErrorInfo) {
        reportError(recordErrorInfo.getError());
    }

    @Override // ru.ok.android.webrtc.listeners.CallRecordListener
    public void onRecordStarted(CallRecordListener.RecordStartInfo recordStartInfo) {
        if (this.participantStore.getByInternal(recordStartInfo.getRecordDescription().getInitiator()) != null) {
            applyRecordStarted(recordStartInfo);
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(Collections.singletonList(recordStartInfo.getRecordDescription().getInitiator()), new mx5(4, this, recordStartInfo), new r44(this, 16));
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallRecordListener
    public void onRecordStopped(CallRecordListener.RecordStopInfo recordStopInfo) {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(recordStopInfo.getSessionRoomId());
        setMyRecordHistory(recordDescription != null ? recordDescription.getInitiator() : null, recordStopInfo.getSessionRoomId(), null);
        this.sessionRoomToRecordInfo.remove(recordStopInfo.getSessionRoomId());
        if (epx.f(recordStopInfo.getSessionRoomId(), this.activeRoomId)) {
            CallParticipant.ParticipantId stoppedBy = recordStopInfo.getStoppedBy();
            ConversationParticipant byInternal = stoppedBy != null ? this.participantStore.getByInternal(stoppedBy) : null;
            reportStopped(byInternal != null ? byInternal.getExternalId() : null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void removeRecordListener(RecordEventListener recordEventListener) {
        this.listeners.remove(recordEventListener);
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void startRecord(final RecordManager.StartParams startParams, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        RecordCommandParamsCreator recordCommandParamsCreator = this.commandParamsCreator;
        boolean isStream = startParams.isStream();
        Long movieId = startParams.getMovieId();
        SessionRoomId sessionRoomId = startParams.getSessionRoomId();
        if (sessionRoomId == null) {
            sessionRoomId = this.activeRoomId;
        }
        signaling.send(recordCommandParamsCreator.createStartRecordParams(isStream, startParams.getPrivacy(), movieId, sessionRoomId, startParams.getGroupId(), startParams.getAlbumId(), startParams.getName(), startParams.getDescription(), this.isStrongModeEnabled), new Signaling.Listener() { // from class: xsna.ghf0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                RecordManagerImpl.startRecord$lambda$0(RecordManager.StartParams.this, gzsVar, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.hhf0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                RecordManagerImpl.startRecord$lambda$1(RecordManagerImpl.this, startParams, izsVar, jSONObject);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void stopRecord(final RecordManager.StopParams stopParams, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        RecordCommandParamsCreator recordCommandParamsCreator = this.commandParamsCreator;
        SessionRoomId sessionRoomId = stopParams.getSessionRoomId();
        if (sessionRoomId == null) {
            sessionRoomId = this.activeRoomId;
        }
        signaling.send(recordCommandParamsCreator.createStopRecordParams(sessionRoomId, stopParams.getRemoveRecord(), this.isStrongModeEnabled), new Signaling.Listener() { // from class: xsna.ehf0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                RecordManagerImpl.stopRecord$lambda$0(RecordManager.StopParams.this, gzsVar, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.fhf0
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                RecordManagerImpl.stopRecord$lambda$1(RecordManagerImpl.this, stopParams, izsVar, jSONObject);
            }
        });
    }
}
