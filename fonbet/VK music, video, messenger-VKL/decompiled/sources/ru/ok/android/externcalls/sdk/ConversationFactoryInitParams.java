package ru.ok.android.externcalls.sdk;

import android.content.Context;
import org.webrtc.NativeLibraryLoader;
import ru.ok.android.webrtc.RTCLog;
import xsna.ozl;
import xsna.zcl;

/* compiled from: ConversationFactoryInitParams.kt */
/* loaded from: classes9.dex */
public final class ConversationFactoryInitParams {
    private final Context context;
    private final PeerConnection peerConnection;
    private final Long sharedSettingsLifeTime;

    /* compiled from: ConversationFactoryInitParams.kt */
    public static final class Builder {
        private final Context context;
        private PeerConnection peerConnection;
        private Long sharedSettingsLifeTime;

        public Builder(Context context) {
            this.context = context;
        }

        public final ConversationFactoryInitParams build() {
            Context context = this.context;
            PeerConnection peerConnection = this.peerConnection;
            if (peerConnection == null) {
                peerConnection = new PeerConnection.Builder().build();
            }
            return new ConversationFactoryInitParams(context, peerConnection, this.sharedSettingsLifeTime, null);
        }

        public final Builder setPeerConnection(PeerConnection peerConnection) {
            this.peerConnection = peerConnection;
            return this;
        }

        public final Builder setSharedSettingsStorageEnabled(Long l) {
            this.sharedSettingsLifeTime = l;
            return this;
        }
    }

    public /* synthetic */ ConversationFactoryInitParams(Context context, PeerConnection peerConnection, Long l, zcl zclVar) {
        this(context, peerConnection, l);
    }

    public final Context getContext() {
        return this.context;
    }

    public final PeerConnection getPeerConnection() {
        return this.peerConnection;
    }

    public final Long getSharedSettingsLifeTime() {
        return this.sharedSettingsLifeTime;
    }

    private ConversationFactoryInitParams(Context context, PeerConnection peerConnection, Long l) {
        this.context = context;
        this.peerConnection = peerConnection;
        this.sharedSettingsLifeTime = l;
    }

    /* compiled from: ConversationFactoryInitParams.kt */
    public static final class PeerConnection {
        private final String bonusFieldTrials;
        private final boolean isAudioPipelineOffOnMuteEnabled;
        private final boolean isEarlyAudioPlayoutEnabled;
        private final boolean isEarlyAudioRecordingEnabled;
        private final boolean isSimulcastEnabled;
        private final NativeLibraryLoader libraryLoader;
        private final RTCLog logger;
        private final Integer rttMultCapMs;
        private final String tcpMarker;
        private final String udpMarker;

        public PeerConnection(String str, Integer num, String str2, String str3, NativeLibraryLoader nativeLibraryLoader, boolean z, boolean z2, boolean z3, boolean z4, RTCLog rTCLog) {
            this.bonusFieldTrials = str;
            this.rttMultCapMs = num;
            this.udpMarker = str2;
            this.tcpMarker = str3;
            this.libraryLoader = nativeLibraryLoader;
            this.isEarlyAudioPlayoutEnabled = z;
            this.isEarlyAudioRecordingEnabled = z2;
            this.isAudioPipelineOffOnMuteEnabled = z3;
            this.isSimulcastEnabled = z4;
            this.logger = rTCLog;
        }

        public final String getBonusFieldTrials() {
            return this.bonusFieldTrials;
        }

        public final NativeLibraryLoader getLibraryLoader() {
            return this.libraryLoader;
        }

        public final RTCLog getLogger() {
            return this.logger;
        }

        public final Integer getRttMultCapMs() {
            return this.rttMultCapMs;
        }

        public final String getTcpMarker() {
            return this.tcpMarker;
        }

        public final String getUdpMarker() {
            return this.udpMarker;
        }

        public final boolean isAudioPipelineOffOnMuteEnabled() {
            return this.isAudioPipelineOffOnMuteEnabled;
        }

        public final boolean isEarlyAudioPlayoutEnabled() {
            return this.isEarlyAudioPlayoutEnabled;
        }

        public final boolean isEarlyAudioRecordingEnabled() {
            return this.isEarlyAudioRecordingEnabled;
        }

        public final boolean isSimulcastEnabled() {
            return this.isSimulcastEnabled;
        }

        /* compiled from: ConversationFactoryInitParams.kt */
        public static final class Builder {
            private String bonusFieldTrials;
            private boolean isSimulcastEnabled;
            private NativeLibraryLoader libraryLoader;
            private RTCLog logger;
            private Integer rttMultCapMs;
            private String tcpMarker;
            private String udpMarker;
            private boolean isEarlyAudioPlayoutEnabled = true;
            private boolean isEarlyAudioRecordingEnabled = true;
            private boolean isAudioPipelineOffOnMuteEnabled = true;

            public final PeerConnection build() {
                return new PeerConnection(this.bonusFieldTrials, this.rttMultCapMs, this.udpMarker, this.tcpMarker, this.libraryLoader, this.isEarlyAudioPlayoutEnabled, this.isEarlyAudioRecordingEnabled, this.isAudioPipelineOffOnMuteEnabled, this.isSimulcastEnabled, this.logger);
            }

            public final Builder setAudioPipelineOffOnMuteEnabled(boolean z) {
                this.isAudioPipelineOffOnMuteEnabled = z;
                return this;
            }

            public final Builder setBonusFieldTrials(String str) {
                this.bonusFieldTrials = str;
                return this;
            }

            public final Builder setEarlyAudioPlayoutEnabled(boolean z) {
                this.isEarlyAudioPlayoutEnabled = z;
                return this;
            }

            public final Builder setEarlyAudioRecordingEnabled(boolean z) {
                this.isEarlyAudioRecordingEnabled = z;
                return this;
            }

            public final Builder setLogger(RTCLog rTCLog) {
                this.logger = rTCLog;
                return this;
            }

            public final Builder setNativeLibraryLoader(NativeLibraryLoader nativeLibraryLoader) {
                this.libraryLoader = nativeLibraryLoader;
                return this;
            }

            public final Builder setRttMultCapMs(Integer num) {
                this.rttMultCapMs = num;
                return this;
            }

            public final Builder setSimulcastEnabled(boolean z) {
                this.isSimulcastEnabled = z;
                return this;
            }

            public final Builder setTcpMarker(String str) {
                this.tcpMarker = str;
                return this;
            }

            public final Builder setUdpMarker(String str) {
                this.udpMarker = str;
                return this;
            }

            @ozl
            public final Builder setSharedSocketDisabledForICE(boolean z) {
                return this;
            }
        }
    }
}
