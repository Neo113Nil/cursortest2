package ru.ok.media.api;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import ru.ok.media.utils.DataSample;
import ru.ok.media.utils.VideoSize;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: H264VideoProvider.kt */
/* loaded from: classes9.dex */
public interface H264VideoProvider {

    /* compiled from: H264VideoProvider.kt */
    public interface Consumer {
        void handleH264Frame(DataSample dataSample, boolean z, long j, int i, int i2);

        void handleH264Headers(byte[] bArr, long j, int i);

        void handleH264Stopped(StopReason stopReason, String str);

        boolean isH264Blocked();

        boolean isH264KeyFrameRequired();
    }

    /* compiled from: H264VideoProvider.kt */
    public static final class Params {
        private final long bitrate;
        private final Consumer consumer;
        private final int fps;
        private final int iframeIntervalSeconds;
        private final VideoSize size;

        public Params(VideoSize videoSize, long j, int i, int i2, Consumer consumer) {
            this.size = videoSize;
            this.bitrate = j;
            this.fps = i;
            this.iframeIntervalSeconds = i2;
            this.consumer = consumer;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.bitrate == params.bitrate && epx.f(this.size, params.size) && this.fps == params.fps && this.iframeIntervalSeconds == params.iframeIntervalSeconds && epx.f(this.consumer, params.consumer);
        }

        public final long getBitrate() {
            return this.bitrate;
        }

        public final Consumer getConsumer() {
            return this.consumer;
        }

        public final int getFps() {
            return this.fps;
        }

        public final int getIframeIntervalSeconds() {
            return this.iframeIntervalSeconds;
        }

        public final VideoSize getSize() {
            return this.size;
        }

        public int hashCode() {
            return this.consumer.hashCode() + ((this.size.hashCode() + (Long.hashCode(this.bitrate) * 31)) * 31);
        }

        public final boolean isSameWithoutBitrate(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return epx.f(this.size, params.size) && this.fps == params.fps && this.iframeIntervalSeconds == params.iframeIntervalSeconds && epx.f(this.consumer, params.consumer);
        }

        public String toString() {
            return "{" + this.size + "@" + this.fps + " " + this.bitrate + " " + this.iframeIntervalSeconds + " " + this.consumer + "}";
        }

        public final Params withBitrate(long j) {
            return new Params(this.size, j, this.fps, this.iframeIntervalSeconds, this.consumer);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: H264VideoProvider.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE = new State("IDLE", 0);
        public static final State RUNNING = new State("RUNNING", 1);
        public static final State RELEASED = new State("RELEASED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IDLE, RUNNING, RELEASED};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: H264VideoProvider.kt */
    public static final class StopReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StopReason[] $VALUES;
        public static final StopReason PARAMS_CHANGED = new StopReason("PARAMS_CHANGED", 0);
        public static final StopReason ENCODE_ERROR = new StopReason("ENCODE_ERROR", 1);
        public static final StopReason STOP = new StopReason("STOP", 2);
        public static final StopReason END_OF_CONTENT = new StopReason("END_OF_CONTENT", 3);
        public static final StopReason RELEASED = new StopReason("RELEASED", 4);
        public static final StopReason OTHER = new StopReason(NativeAdContent.ViewTag.OTHER, 5);

        private static final /* synthetic */ StopReason[] $values() {
            return new StopReason[]{PARAMS_CHANGED, ENCODE_ERROR, STOP, END_OF_CONTENT, RELEASED, OTHER};
        }

        static {
            StopReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private StopReason(String str, int i) {
        }

        public static zrp<StopReason> getEntries() {
            return $ENTRIES;
        }

        public static StopReason valueOf(String str) {
            return (StopReason) Enum.valueOf(StopReason.class, str);
        }

        public static StopReason[] values() {
            return (StopReason[]) $VALUES.clone();
        }
    }

    double getCaptureAverageFps();

    Params getCurrentParams();

    String getDebugString();

    State getState();

    void release();

    void requestKeyFrame();

    void start(Params params);

    void stop();
}
