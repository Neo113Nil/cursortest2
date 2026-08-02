package ru.ok.android.externcalls.sdk.audio;

import android.content.Context;
import android.os.Build;
import java.util.Collection;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.internal.DefaultAudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.audio.internal.stubs.LoggerStub;
import ru.ok.android.externcalls.sdk.audio.internal.stubs.VideoTrackerStub;
import ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLiteFacade;
import ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLogger;
import xsna.asp;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.rl3;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: CallsAudioManager.kt */
/* loaded from: classes9.dex */
public interface CallsAudioManager {

    /* compiled from: CallsAudioManager.kt */
    public static final class AudioDeviceInfoChangedEvent {
        private final CallsAudioDeviceInfo newDevice;
        private final CallsAudioDeviceInfo oldDevice;

        public AudioDeviceInfoChangedEvent(CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioDeviceInfo callsAudioDeviceInfo2) {
            this.oldDevice = callsAudioDeviceInfo;
            this.newDevice = callsAudioDeviceInfo2;
        }

        public static /* synthetic */ AudioDeviceInfoChangedEvent copy$default(AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent, CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioDeviceInfo callsAudioDeviceInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                callsAudioDeviceInfo = audioDeviceInfoChangedEvent.oldDevice;
            }
            if ((i & 2) != 0) {
                callsAudioDeviceInfo2 = audioDeviceInfoChangedEvent.newDevice;
            }
            return audioDeviceInfoChangedEvent.copy(callsAudioDeviceInfo, callsAudioDeviceInfo2);
        }

        public final CallsAudioDeviceInfo component1() {
            return this.oldDevice;
        }

        public final CallsAudioDeviceInfo component2() {
            return this.newDevice;
        }

        public final AudioDeviceInfoChangedEvent copy(CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioDeviceInfo callsAudioDeviceInfo2) {
            return new AudioDeviceInfoChangedEvent(callsAudioDeviceInfo, callsAudioDeviceInfo2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioDeviceInfoChangedEvent)) {
                return false;
            }
            AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent = (AudioDeviceInfoChangedEvent) obj;
            return epx.f(this.oldDevice, audioDeviceInfoChangedEvent.oldDevice) && epx.f(this.newDevice, audioDeviceInfoChangedEvent.newDevice);
        }

        public final CallsAudioDeviceInfo getNewDevice() {
            return this.newDevice;
        }

        public final CallsAudioDeviceInfo getOldDevice() {
            return this.oldDevice;
        }

        public int hashCode() {
            return this.newDevice.hashCode() + (this.oldDevice.hashCode() * 31);
        }

        public String toString() {
            return "AudioDeviceInfoChangedEvent(oldDevice=" + this.oldDevice + ", newDevice=" + this.newDevice + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallsAudioManager.kt */
    /* loaded from: classes11.dex */
    public static final class AudioDeviceType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AudioDeviceType[] $VALUES;
        public static final AudioDeviceType BLUETOOTH = new AudioDeviceType("BLUETOOTH", 0);
        public static final AudioDeviceType WIRED_HEADSET = new AudioDeviceType("WIRED_HEADSET", 1);
        public static final AudioDeviceType EARPIECE = new AudioDeviceType("EARPIECE", 2);
        public static final AudioDeviceType SPEAKER_PHONE = new AudioDeviceType("SPEAKER_PHONE", 3);
        public static final AudioDeviceType NONE = new AudioDeviceType("NONE", 4);

        @Deprecated(forRemoval = true, since = "125.1.0.71")
        public static final AudioDeviceType BLUETOOTH_INTENT = new AudioDeviceType("BLUETOOTH_INTENT", 5);

        private static final /* synthetic */ AudioDeviceType[] $values() {
            return new AudioDeviceType[]{BLUETOOTH, WIRED_HEADSET, EARPIECE, SPEAKER_PHONE, NONE, BLUETOOTH_INTENT};
        }

        static {
            AudioDeviceType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private AudioDeviceType(String str, int i) {
        }

        public static zrp<AudioDeviceType> getEntries() {
            return $ENTRIES;
        }

        public static AudioDeviceType valueOf(String str) {
            return (AudioDeviceType) Enum.valueOf(AudioDeviceType.class, str);
        }

        public static AudioDeviceType[] values() {
            return (AudioDeviceType[]) $VALUES.clone();
        }

        public final boolean isHeadsetDevice() {
            return oneOf(WIRED_HEADSET, BLUETOOTH);
        }

        public final boolean oneOf(AudioDeviceType... audioDeviceTypeArr) {
            return rl3.G(audioDeviceTypeArr, this);
        }
    }

    /* compiled from: CallsAudioManager.kt */
    public static final class Builder {
        private boolean awaitDeviceChangeConfirmationV3;
        private Context context;
        private DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy;
        private OnMuteListener onMuteListener;
        private boolean trackProximityWhenSpeakerEnabled;
        private ProximityTracker proximityTracker = ProximityTracker.Companion.getNOOP$calls_audiomanager_release();
        private VideoTracker videoTracker = new VideoTrackerStub();
        private Logger logger = new LoggerStub();

        public final CallsAudioManager build() {
            Context context = this.context;
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            DefaultAudioDeviceSelector defaultAudioDeviceSelector = new DefaultAudioDeviceSelector(this.logger);
            TracerLiteFacade tracerLiteFacade = new TracerLiteFacade(context);
            if (Build.VERSION.SDK_INT < 31) {
                return new CallsAudioManagerV2Impl(context, this.proximityTracker, this.trackProximityWhenSpeakerEnabled, this.videoTracker, defaultAudioDeviceSelector, this.onMuteListener, new TracerLogger(tracerLiteFacade, this.logger), this.awaitDeviceChangeConfirmationV3);
            }
            ProximityTracker proximityTracker = this.proximityTracker;
            boolean z = this.trackProximityWhenSpeakerEnabled;
            VideoTracker videoTracker = this.videoTracker;
            DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy = this.disabledAudioDeviceUsagePolicy;
            if (disabledAudioDeviceUsagePolicy == null) {
                disabledAudioDeviceUsagePolicy = new DisabledAudioDeviceUsagePolicy() { // from class: ru.ok.android.externcalls.sdk.audio.CallsAudioManager$Builder$build$1
                };
            }
            return new CallsAudioManagerV3Impl(context, proximityTracker, z, videoTracker, defaultAudioDeviceSelector, disabledAudioDeviceUsagePolicy, this.onMuteListener, new TracerLogger(tracerLiteFacade, this.logger), this.awaitDeviceChangeConfirmationV3);
        }

        public final Builder setAwaitDeviceChangeConfirmationEnabled(boolean z) {
            this.awaitDeviceChangeConfirmationV3 = z;
            return this;
        }

        public final Builder setContext(Context context) {
            this.context = context;
            return this;
        }

        public final Builder setDisabledAudioDeviceUsagePolicy(DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy) {
            this.disabledAudioDeviceUsagePolicy = disabledAudioDeviceUsagePolicy;
            return this;
        }

        public final Builder setLogger(Logger logger) {
            this.logger = logger;
            return this;
        }

        public final Builder setOnMuteListener(OnMuteListener onMuteListener) {
            this.onMuteListener = onMuteListener;
            return this;
        }

        public final Builder setProximityTracker(ProximityTracker proximityTracker) {
            if (proximityTracker == null) {
                proximityTracker = ProximityTracker.Companion.getNOOP$calls_audiomanager_release();
            }
            this.proximityTracker = proximityTracker;
            return this;
        }

        public final Builder setTrackProximityWhenSpeakerEnabled(boolean z) {
            this.trackProximityWhenSpeakerEnabled = z;
            return this;
        }

        public final Builder setVideoTracker(VideoTracker videoTracker) {
            this.videoTracker = videoTracker;
            return this;
        }
    }

    /* compiled from: CallsAudioManager.kt */
    public interface DisabledAudioDeviceUsagePolicy {
        default boolean isAvailableForAutoSelect(AudioDeviceType audioDeviceType) {
            return false;
        }
    }

    /* compiled from: CallsAudioManager.kt */
    public interface OnAudioDeviceInfoChangeListener {
        void onAudioDeviceChanged(AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent);
    }

    /* compiled from: CallsAudioManager.kt */
    public interface OnAudioDeviceListChangeListener {
        void onAudioDeviceListChanged(Collection<CallsAudioDeviceInfo> collection);
    }

    /* compiled from: CallsAudioManager.kt */
    public interface OnMuteListener {
        void onMute(boolean z);

        void onMutedForever();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallsAudioManager.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE = new State("IDLE", 0);
        public static final State DIALING = new State("DIALING", 1);
        public static final State RINGING = new State("RINGING", 2);
        public static final State CONVERSATION = new State("CONVERSATION", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IDLE, DIALING, RINGING, CONVERSATION};
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

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void changeStateAsync$default(CallsAudioManager callsAudioManager, State state, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeStateAsync");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        callsAudioManager.changeStateAsync(state, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void releaseAsync$default(CallsAudioManager callsAudioManager, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: releaseAsync");
        }
        if ((i & 1) != 0) {
            gzsVar = null;
        }
        if ((i & 2) != 0) {
            izsVar = null;
        }
        callsAudioManager.releaseAsync(gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setAudioDeviceAsync$default(CallsAudioManager callsAudioManager, CallsAudioDeviceInfo callsAudioDeviceInfo, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAudioDeviceAsync");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        callsAudioManager.setAudioDeviceAsync(callsAudioDeviceInfo, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setAudioDeviceTypeAsync$default(CallsAudioManager callsAudioManager, AudioDeviceType audioDeviceType, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAudioDeviceTypeAsync");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        callsAudioManager.setAudioDeviceTypeAsync(audioDeviceType, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setSpeakerEnabledAsync$default(CallsAudioManager callsAudioManager, boolean z, boolean z2, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSpeakerEnabledAsync");
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        if ((i & 8) != 0) {
            izsVar = null;
        }
        callsAudioManager.setSpeakerEnabledAsync(z, z2, gzsVar, izsVar);
    }

    void addOnAudioDeviceListChangeListener(OnAudioDeviceListChangeListener onAudioDeviceListChangeListener);

    void changeStateAsync(State state, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    List<CallsAudioDeviceInfo> getAvailableAudioDevices();

    CallsAudioDeviceInfo getCurrentDevice();

    void hasBluetoothHeadsetAsync(izs<? super Boolean, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2);

    void hasWiredHeadsetAsync(izs<? super Boolean, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2);

    boolean isHeadsetConnected();

    void notifyBluetoothPermissionGranted();

    void releaseAsync(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void removeOnAudioDeviceListChangeListener(OnAudioDeviceListChangeListener onAudioDeviceListChangeListener);

    void requestAudioFocusAsync();

    void setAudioDeviceAsync(CallsAudioDeviceInfo callsAudioDeviceInfo, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void setAudioDeviceTypeAsync(AudioDeviceType audioDeviceType, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void setOnAudioDeviceChangeListener(OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener);

    void setSpeakerEnabledAsync(boolean z, boolean z2, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
