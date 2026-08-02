package ru.ok.android.webrtc.topology;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.CallTimings;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener;
import ru.ok.android.webrtc.listeners.CallVideoQualityUpdateListener;
import ru.ok.android.webrtc.listeners.collection.CallListenersCollection;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptation;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptationController;
import ru.ok.android.webrtc.mediaadaptation.NetworkConditionProvider;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.ServerCallCapabilities;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.data.FirstDataStat;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.topology.server.layout.DisplayLayouts;
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper;
import xsna.bin0;
import xsna.gav;
import xsna.yu3;

/* loaded from: classes9.dex */
public abstract class CallTopology implements CallActiveSessionRoomParticipantsListener, CallVideoQualityUpdateListener, MutableMediaSettings.EventListener, TrackVideoKeyMapper, MediaAdaptation.EventListener {
    public boolean b;
    public Runnable c;
    public final CallParams d;
    public final RTCLog e;
    public final FirstDataStat f;
    public final LocalMediaStreamSource g;
    public final MutableMediaSettings i;
    public final CallParticipants j;
    public final CallListenersCollection k;
    public final MediaAdaptationController l;
    public EventListener m;
    public final TimeProvider n;
    public boolean p;
    public PeerVideoSettings q;
    public final ScreenCapturePermissionProvider r;
    public long s;
    public long t;
    public final CallTimings u;
    public final CropAndScaleParamsProvider v;
    public final Signaling w;
    public final bin0 x;
    public final Handler a = new Handler(Looper.getMainLooper());
    public ArrayList h = null;
    public int o = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
        public static final int ACTIVE = 1;
        public static final int HOLD = 2;
        public static final int PASSIVE = 0;
    }

    public CallTopology(@NonNull CallParticipants callParticipants, @NonNull MutableMediaSettings mutableMediaSettings, @NonNull CallParams callParams, @NonNull RTCLog rTCLog, @Nullable FirstDataStat firstDataStat, @Nullable LocalMediaStreamSource localMediaStreamSource, @NonNull CallListenersCollection callListenersCollection, @Nullable MediaAdaptationController mediaAdaptationController, @Nullable ScreenCapturePermissionProvider screenCapturePermissionProvider, @NonNull TimeProvider timeProvider, @NonNull CallTimings callTimings, @NonNull CropAndScaleParamsProvider cropAndScaleParamsProvider, @NonNull Signaling signaling, @NonNull bin0<Boolean> bin0Var) {
        MiscHelper.throwIfNotMainThread();
        this.u = callTimings;
        this.v = cropAndScaleParamsProvider;
        this.d = callParams;
        this.e = rTCLog;
        this.f = firstDataStat;
        this.j = callParticipants;
        this.i = mutableMediaSettings;
        this.k = callListenersCollection;
        callListenersCollection.addActiveSessionRoomParticipantsListener(this);
        callListenersCollection.addVideoQualityUpdateListener(this);
        mutableMediaSettings.addEventListener(this);
        this.g = localMediaStreamSource;
        this.l = mediaAdaptationController;
        this.r = screenCapturePermissionProvider;
        this.n = timeProvider;
        this.w = signaling;
        this.x = bin0Var;
    }

    public static String getStateAsString(int i) {
        return i != 0 ? i != 2 ? SignalingProtocol.STATE_ACTIVE : "HOLD" : "PASSIVE";
    }

    public final void debug(String str) {
        this.e.log(getTag(), str);
    }

    public final void error(String str) {
        this.e.log(getTag(), str);
    }

    public abstract Runnable getConnectivityControlRunnable();

    @NonNull
    public final CallParticipant getCurrentUserParticipant() {
        return this.j.getCurrentUserParticipant();
    }

    @Nullable
    public DisplayLayouts getDisplayLayouts() {
        return null;
    }

    public long getIceGatheringStartTime() {
        return -1L;
    }

    @NonNull
    public final List<PeerConnection.IceServer> getIceServers() {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @NonNull
    public abstract Topology getIdentity();

    @NonNull
    public final MutableMediaSettings getMediaSettings() {
        return this.i;
    }

    @Nullable
    public NetworkConditionProvider getNetworkConditionProvider() {
        return this.l;
    }

    @Nullable
    public final CallParticipant getParticipant(@Nullable CallParticipant.ParticipantId participantId) {
        if (participantId != null) {
            return this.j.getParticipant(participantId);
        }
        return null;
    }

    @NonNull
    public final Collection<CallParticipant> getParticipants() {
        return this.j.getActiveSessionRoomParticipants();
    }

    @Nullable
    public Map<CallParticipant.ParticipantId, ScreenshareRecvStat> getScreenshareRecvStats() {
        return null;
    }

    public final int getState() {
        return this.o;
    }

    @NonNull
    public abstract String getTag();

    public final boolean has(CallParticipant callParticipant) {
        return this.j.has(callParticipant);
    }

    public final void info(String str) {
        this.e.log(getTag(), str);
    }

    public final boolean is(Topology topology) {
        return getIdentity().equals(topology);
    }

    public final boolean isActive() {
        return this.o == 1;
    }

    public boolean isP2PRelayEnabled() {
        return false;
    }

    @Override // ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public CallVideoTrackParticipantKey keyByWebrtcTrackId(@NonNull String str) {
        return null;
    }

    public void maybeStartConnectivityControl() {
        if (this.b || this.d.getTimeouts().getNoPeerConnectionTimeoutMs() <= 0) {
            return;
        }
        if (this.c == null) {
            this.c = getConnectivityControlRunnable();
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.postDelayed(runnable, this.d.getTimeouts().getNoPeerConnectionTimeoutMs());
            this.t = this.n.getMsSinceBoot();
        }
    }

    public void onFirstDataReceived() {
        FirstDataStat firstDataStat = this.f;
        if (firstDataStat == null || firstDataStat.isReported()) {
            return;
        }
        this.f.onFirstData();
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.MediaAdaptation.EventListener
    public void onNetworkConditionChanged(@NonNull MediaAdaptation.NetworkConditionChange networkConditionChange) {
        if (isActive()) {
            PeerVideoSettings suggestedVideoSettings = networkConditionChange.getSuggestedVideoSettings();
            if (suggestedVideoSettings == null) {
                suggestedVideoSettings = this.q;
            }
            updatePeerVideoSettings(suggestedVideoSettings);
        }
    }

    public void onPeerVideoSettingsChange(PeerVideoSettings peerVideoSettings) {
        this.q = peerVideoSettings;
        MediaAdaptationController mediaAdaptationController = this.l;
        if (mediaAdaptationController != null) {
            mediaAdaptationController.onPeerVideoSettingsChange(peerVideoSettings);
        } else {
            updatePeerVideoSettings(peerVideoSettings);
        }
    }

    public final void permitIceApply(boolean z) {
        MiscHelper.throwIfNotMainThread();
        if (z != this.p) {
            this.p = z;
            handleIceApplyPermissionChanged(z);
        }
    }

    public void presetVideoSettings(PeerVideoSettings peerVideoSettings) {
        this.q = peerVideoSettings;
        MediaAdaptationController mediaAdaptationController = this.l;
        if (mediaAdaptationController != null) {
            mediaAdaptationController.onPeerVideoSettingsChange(peerVideoSettings);
        }
    }

    public void release() {
        MiscHelper.throwIfNotMainThread();
        MediaAdaptationController mediaAdaptationController = this.l;
        if (mediaAdaptationController != null) {
            mediaAdaptationController.release();
        }
        this.i.removeEventListener(this);
        this.k.removeActiveSessionRoomParticipantsListener(this);
        this.m = null;
        stopConnectivityControl();
    }

    public void sendHoldRequest(boolean z, @Nullable ServerCallCapabilities serverCallCapabilities, Consumer<Void> consumer, final Consumer<gav> consumer2) throws JSONException {
        if (((Boolean) this.x.get()).booleanValue()) {
            consumer.accept(null);
        } else {
            this.w.send(SignalingProtocol.createHoldCommand(z, serverCallCapabilities), new yu3(consumer, 1), new Signaling.Listener() { // from class: xsna.na9
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    Consumer.this.accept(new gav("error".equals(r3.optString("type")) ? jSONObject.optString("message") : jSONObject.toString()));
                }
            });
        }
    }

    public boolean setIceServers(List<PeerConnection.IceServer> list) {
        MiscHelper.throwIfNotMainThread();
        ArrayList arrayList = this.h;
        if (arrayList != null && arrayList.equals(list)) {
            return false;
        }
        ArrayList arrayList2 = this.h;
        if (arrayList2 == null) {
            this.h = new ArrayList(list != null ? list.size() : 0);
        } else {
            arrayList2.clear();
        }
        if (list == null) {
            return true;
        }
        this.h.addAll(list);
        return true;
    }

    public final void setState(int i) {
        MiscHelper.throwIfNotMainThread();
        if (i != this.o) {
            this.o = i;
            handleStateChanged(i);
        }
    }

    public void stopConnectivityControl() {
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    @NonNull
    public String toString() {
        return getTag() + '@' + MiscHelper.identity(this) + '{' + getStateAsString(this.o) + '}';
    }

    public final void trace(String str) {
        this.e.log(getTag(), str);
    }

    public abstract void updatePeerVideoSettings(PeerVideoSettings peerVideoSettings);

    public final void warn(String str) {
        this.e.log(getTag(), str);
    }

    @Override // ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper
    @Nullable
    public String webrtcTrackIdByKey(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey) {
        return null;
    }

    public final void debug(String str, String str2) {
        this.e.log(str, str2);
    }

    public final void error(String str, String str2) {
        this.e.log(str, str2);
    }

    public final void warn(String str, String str2) {
        this.e.log(str, str2);
    }

    public void clearRemoteVideoRenderers() {
    }

    public void prepareOffer() {
    }

    public void createOffers(boolean z) {
    }

    @Deprecated
    public void getStats(@NonNull StatsObserver statsObserver) {
    }

    public void handleIceApplyPermissionChanged(boolean z) {
    }

    public void handleRemoteHold(CallParticipant callParticipant) {
    }

    public void handleRemoteUnhold(CallParticipant callParticipant) {
    }

    public void handleStateChanged(int i) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantUpdated(@NonNull CallActiveSessionRoomParticipantsListener.UpdatedParams updatedParams) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsAdded(@NonNull CallActiveSessionRoomParticipantsListener.AddedParams addedParams) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsChanged(@NonNull CallActiveSessionRoomParticipantsListener.ChangedParams changedParams) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsDeAnonimized(@NonNull CallActiveSessionRoomParticipantsListener.DeAnonParams deAnonParams) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallActiveSessionRoomParticipantsListener
    public void onActiveParticipantsRemoved(@NonNull CallActiveSessionRoomParticipantsListener.RemovedParams removedParams) {
    }

    @Override // ru.ok.android.webrtc.MutableMediaSettings.EventListener
    public void onMediaSettingsChanged(@NonNull MutableMediaSettings mutableMediaSettings) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallVideoQualityUpdateListener
    public void onVideoQualityUpdate(@NonNull CallVideoQualityUpdateListener.VideoQualityUpdateParams videoQualityUpdateParams) {
    }

    public void reportStats(@NonNull RTCStat rTCStat) {
    }

    public void requestAsrDataChannel(boolean z) {
    }

    public void requestStats(@NonNull StatsCallback statsCallback) {
    }

    public void setUseP2PRelay(boolean z) {
    }

    public void updateDisplayLayout(@NonNull List<CallDisplayLayoutItem> list) {
    }

    public void createAnswerFor(CallParticipant.ParticipantId participantId, @NonNull SessionDescription sessionDescription) {
    }

    public void createOfferFor(@NonNull CallParticipant callParticipant, boolean z) {
    }

    public void hold(Consumer<Void> consumer, Consumer<gav> consumer2) throws JSONException {
    }

    public void reportNetworkStat(long j, long j2) {
    }

    public void setRemoteVideoRenderers(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list) {
    }

    public void unhold(Consumer<Void> consumer, Consumer<gav> consumer2) throws JSONException {
    }

    public interface EventListener {
        void onTopologyCreated(@NonNull CallTopology callTopology);

        void onTopologyIceConnectionChange(@NonNull CallTopology callTopology, @NonNull PeerConnection.IceConnectionState iceConnectionState);

        void onTopologyOfferCreated(@NonNull CallTopology callTopology, @NonNull CallParticipant callParticipant, @NonNull SessionDescription sessionDescription);

        void onTopologyPeerConnectionChange(@NonNull CallTopology callTopology, @NonNull PeerConnection.PeerConnectionState peerConnectionState);

        void onTopologyRemoteVideoTrackAdded(@NonNull CallTopology callTopology, @NonNull CallParticipant callParticipant, @NonNull String str);

        void onTopologyUpgradeProposed(@NonNull CallTopology callTopology);

        default void onFingerprintChanged(@NonNull CallTopology callTopology, @NonNull CallParticipant callParticipant, long j) {
        }
    }

    public void grantRoles(@NonNull CallParticipant.ParticipantId participantId, @NonNull List<CallParticipant.Role> list, boolean z, Signaling.Listener listener) {
    }

    public void pinParticipant(@NonNull CallParticipant.ParticipantId participantId, SessionRoomId sessionRoomId, boolean z, Signaling.Listener listener) {
    }
}
