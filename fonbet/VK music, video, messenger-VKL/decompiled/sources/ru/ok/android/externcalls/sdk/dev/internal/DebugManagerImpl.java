package ru.ok.android.externcalls.sdk.dev.internal;

import java.util.concurrent.TimeUnit;
import ru.ok.android.annotation.CallExperimentalApi;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.CameraToggles;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.listener.StatisticsListener;
import ru.ok.android.webrtc.utils.PeerVideoSettingsAdapter;
import xsna.izs;
import xsna.zcl;

/* compiled from: DebugManagerImpl.kt */
@CallExperimentalApi
/* loaded from: classes9.dex */
public final class DebugManagerImpl implements DebugManager {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "DebugManager";
    private final RTCLog log;
    private final MediaDumpManagerImpl mediaDumpManager;
    private final PeerVideoSettingsAdapter peerVideoSettingsAdapter;
    private final Call underlyingCall;

    /* compiled from: DebugManagerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DebugManagerImpl(Call call, RTCLog rTCLog, PeerVideoSettingsAdapter peerVideoSettingsAdapter, SignalingProvider signalingProvider) {
        this.underlyingCall = call;
        this.log = rTCLog;
        this.peerVideoSettingsAdapter = peerVideoSettingsAdapter;
        this.mediaDumpManager = new MediaDumpManagerImpl(getUnderlyingCall(), signalingProvider);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void enableFullAudioDump(String str) {
        getUnderlyingCall().dumpLocalAudio(str);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public DebugManager.VideoSettingsOverride getCurrentVideoSettingsOverride() {
        return new DebugManager.VideoSettingsOverride(this.peerVideoSettingsAdapter.isMaxDimensionOverrideEnabled(), this.peerVideoSettingsAdapter.getOverrideMaxDimension());
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public Call getUnderlyingCall() {
        return this.underlyingCall;
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void registerStatListener(StatisticsListener statisticsListener, int i, TimeUnit timeUnit) {
        getUnderlyingCall().registerStatListener(statisticsListener, i, timeUnit);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void removeStatListener(StatisticsListener statisticsListener) {
        getUnderlyingCall().removeStatListener(statisticsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void reportError(Throwable th) {
        this.log.reportException(LOG_TAG, "error", th);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void setVideoSettingsOverride(DebugManager.VideoSettingsOverride videoSettingsOverride) {
        this.peerVideoSettingsAdapter.setOverrideMaxDimension(videoSettingsOverride.getMaxDimension());
        this.peerVideoSettingsAdapter.setMaxDimensionOverrideEnabled(videoSettingsOverride.isMaxDimensionOverrideEnabled());
        getUnderlyingCall().notifyUpdatePeerVideoSettings();
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void updateCameraToggles(izs<? super CameraToggles, CameraToggles> izsVar) {
        getUnderlyingCall().updateCameraToggles(izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public MediaDumpManagerImpl getMediaDumpManager() {
        return this.mediaDumpManager;
    }
}
