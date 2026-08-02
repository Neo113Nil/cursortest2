package ru.ok.media.api;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.nio.ByteBuffer;
import ru.ok.media.utils.DebugUtils;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: AACAudioProvider.kt */
/* loaded from: classes9.dex */
public interface AACAudioProvider {

    /* compiled from: AACAudioProvider.kt */
    public interface Consumer {
        void handleAACAudioFrame(ByteBuffer byteBuffer, long j, int i);

        void handleAACConfig(ByteBuffer byteBuffer, long j);

        void handleAACStopped(StopReason stopReason, String str);

        boolean isAACBlocked();
    }

    /* compiled from: AACAudioProvider.kt */
    public static final class Params {
        private final int bitrate;
        private final int channelCount;
        private final Consumer consumer;
        private final int sampleRate;

        public Params(int i, int i2, int i3, Consumer consumer) {
            this.sampleRate = i;
            this.channelCount = i2;
            this.bitrate = i3;
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
            return this.sampleRate == params.sampleRate && this.channelCount == params.channelCount && this.bitrate == params.bitrate && epx.f(this.consumer, params.consumer);
        }

        public final int getBitrate() {
            return this.bitrate;
        }

        public final int getChannelCount() {
            return this.channelCount;
        }

        public final Consumer getConsumer() {
            return this.consumer;
        }

        public final int getSampleRate() {
            return this.sampleRate;
        }

        public int hashCode() {
            return this.consumer.hashCode() + (((((this.sampleRate * 31) + this.channelCount) * 31) + this.bitrate) * 31);
        }

        public String toString() {
            String channelsString = DebugUtils.channelsString(this.channelCount, true);
            String formatBitrate = DebugUtils.formatBitrate(this.bitrate, true);
            return this.sampleRate + DomExceptionUtils.SEPARATOR + channelsString + DomExceptionUtils.SEPARATOR + formatBitrate;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AACAudioProvider.kt */
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
    /* compiled from: AACAudioProvider.kt */
    public static final class StopReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StopReason[] $VALUES;
        public static final StopReason PARAMS_CHANGED = new StopReason("PARAMS_CHANGED", 0);
        public static final StopReason CAPTURE_ERROR = new StopReason("CAPTURE_ERROR", 1);
        public static final StopReason ENCODE_ERROR = new StopReason("ENCODE_ERROR", 2);
        public static final StopReason STOP = new StopReason("STOP", 3);
        public static final StopReason END_OF_CONTENT = new StopReason("END_OF_CONTENT", 4);
        public static final StopReason RELEASED = new StopReason("RELEASED", 5);
        public static final StopReason OTHER = new StopReason(NativeAdContent.ViewTag.OTHER, 6);

        private static final /* synthetic */ StopReason[] $values() {
            return new StopReason[]{PARAMS_CHANGED, CAPTURE_ERROR, ENCODE_ERROR, STOP, END_OF_CONTENT, RELEASED, OTHER};
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

    Params getCurrentParams();

    String getDebugString();

    State getState();

    void release();

    void start(Params params);

    void stop();
}
