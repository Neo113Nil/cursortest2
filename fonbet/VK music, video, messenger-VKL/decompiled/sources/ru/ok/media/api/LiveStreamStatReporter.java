package ru.ok.media.api;

import io.appmetrica.analytics.impl.L2;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.media.StreamerLinkStats;
import xsna.asp;
import xsna.zrp;

/* compiled from: LiveStreamStatReporter.kt */
/* loaded from: classes9.dex */
public interface LiveStreamStatReporter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LiveStreamStatReporter.kt */
    public static final class ApplicationState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ApplicationState[] $VALUES;
        public static final ApplicationState active = new ApplicationState(SignalingProtocol.KEY_ACTIVE, 0);
        public static final ApplicationState inactive = new ApplicationState("inactive", 1);
        public static final ApplicationState background = new ApplicationState(L2.g, 2);

        private static final /* synthetic */ ApplicationState[] $values() {
            return new ApplicationState[]{active, inactive, background};
        }

        static {
            ApplicationState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private ApplicationState(String str, int i) {
        }

        public static zrp<ApplicationState> getEntries() {
            return $ENTRIES;
        }

        public static ApplicationState valueOf(String str) {
            return (ApplicationState) Enum.valueOf(ApplicationState.class, str);
        }

        public static ApplicationState[] values() {
            return (ApplicationState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LiveStreamStatReporter.kt */
    public static final class PublisherType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PublisherType[] $VALUES;
        private final int type;
        public static final PublisherType unspecified = new PublisherType("unspecified", 0, 0);
        public static final PublisherType larix = new PublisherType("larix", 1, 1);
        public static final PublisherType okmp_cpp = new PublisherType("okmp_cpp", 2, 2);
        public static final PublisherType rtmp_vk = new PublisherType("rtmp_vk", 3, 3);

        private static final /* synthetic */ PublisherType[] $values() {
            return new PublisherType[]{unspecified, larix, okmp_cpp, rtmp_vk};
        }

        static {
            PublisherType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private PublisherType(String str, int i, int i2) {
            this.type = i2;
        }

        public static zrp<PublisherType> getEntries() {
            return $ENTRIES;
        }

        public static PublisherType valueOf(String str) {
            return (PublisherType) Enum.valueOf(PublisherType.class, str);
        }

        public static PublisherType[] values() {
            return (PublisherType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }
    }

    void setApplicationState(ApplicationState applicationState);

    void streamAudioFailed(String str, String str2);

    void streamConnected(String str, String str2);

    void streamConnecting(String str);

    void streamCreateFailed(String str);

    void streamCreated(PublisherType publisherType);

    void streamDisconnected(String str);

    void streamEnded(String str);

    void streamLink(StreamerState streamerState, StreamerLinkStats streamerLinkStats);

    void streamPauseFailed(String str);

    void streamPaused(String str);

    void streamQuality(int i, StreamerState streamerState, Integer num, Integer num2, int i2, Integer num3, int i3, Integer num4, int i4, long j, long j2, long j3, int i5, int i6, int i7, long j4, Integer[] numArr, long j5, Integer[] numArr2);

    void streamQualitySwitched(int i, int i2, int i3, int i4);

    void streamResumeFailed(String str);

    void streamResumed();

    void streamStartFailed(String str);

    void streamStarted();

    void streamStateChanged(StreamerState streamerState, StreamerState streamerState2, String str);

    void streamVideoFailed(String str, String str2);
}
