package ru.ok.android.externcalls.sdk.dev;

import java.util.concurrent.TimeUnit;
import ru.ok.android.annotation.CallExperimentalApi;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.CameraToggles;
import ru.ok.android.webrtc.stat.listener.StatisticsListener;
import xsna.izs;

/* compiled from: DebugManager.kt */
@CallExperimentalApi
/* loaded from: classes9.dex */
public interface DebugManager {

    /* compiled from: DebugManager.kt */
    public static final class VideoSettingsOverride {
        private final boolean isMaxDimensionOverrideEnabled;
        private final int maxDimension;

        public VideoSettingsOverride(boolean z, int i) {
            this.isMaxDimensionOverrideEnabled = z;
            this.maxDimension = i;
        }

        public final int getMaxDimension() {
            return this.maxDimension;
        }

        public final boolean isMaxDimensionOverrideEnabled() {
            return this.isMaxDimensionOverrideEnabled;
        }
    }

    void enableFullAudioDump(String str);

    VideoSettingsOverride getCurrentVideoSettingsOverride();

    MediaDumpManager getMediaDumpManager();

    Call getUnderlyingCall();

    void registerStatListener(StatisticsListener statisticsListener, int i, TimeUnit timeUnit);

    void removeStatListener(StatisticsListener statisticsListener);

    void reportError(Throwable th);

    void setVideoSettingsOverride(VideoSettingsOverride videoSettingsOverride);

    void updateCameraToggles(izs<? super CameraToggles, CameraToggles> izsVar);
}
