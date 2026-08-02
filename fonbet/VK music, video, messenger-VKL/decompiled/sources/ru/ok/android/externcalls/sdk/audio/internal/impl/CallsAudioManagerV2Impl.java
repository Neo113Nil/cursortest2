package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.android.externcalls.sdk.audio.internal.DeviceSwitchHelper;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner;
import xsna.anj;
import xsna.c5g;
import xsna.epx;
import xsna.fc9;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.sni0;
import xsna.zcl;
import xsna.zhy0;
import xsna.zy60;

/* compiled from: CallsAudioManagerV2Impl.kt */
/* loaded from: classes9.dex */
public final class CallsAudioManagerV2Impl implements CallsAudioManager, CallsBluethoothDeviceScanner.Listener {
    private static final long DELAY_USER_REQUEST_MS = 100;
    private static final String LOG_TAG = "CallsAudioManagerV2";
    private static final int MESSAGE_REPORT_DEVICE = 311;
    private final AudioDeviceSelector audioDeviceSelector;
    private final Set<CallsAudioDeviceInfo> audioDevices;
    private final AudioFocusRequestHelper audioFocusRequestHelper;
    private final AudioManager audioManager;
    private final boolean awaitDeviceChangeConfirmation;
    private final HandlerThread backgroundHandlerThread;
    private final CallsBluethoothDeviceScanner bluetoothDeviceScanner;
    private final CallsBluetoothManager bluetoothManager;
    private final Context context;
    private volatile CallsAudioDeviceInfo currentDevice;
    private final DeviceSwitchHelper<CallsAudioManager.AudioDeviceType> deviceSwitchHelper;
    private boolean disabledBluetoothOnce;
    private boolean disabledSpeakerOnce;
    private final boolean hasEarpiece;
    private volatile boolean isDestroyed;
    private final Logger logger;
    private final Handler mainHandler;
    private volatile CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceChangeListener;
    private final CopyOnWriteArrayList<CallsAudioManager.OnAudioDeviceListChangeListener> onAudioDeviceListChangeListeners;
    private final ProximityTracker proximityTracker;
    private CallsAudioDeviceInfo reportedAudioDevice;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private boolean savedPreviousState;
    private CallsAudioManager.AudioDeviceType selectedDevice;
    private CallsAudioManager.State state;
    private final boolean trackProximityWhenSpeakerEnabled;
    private final VideoTracker videoTracker;
    private final CallsWiredHeadsetManager wiredHeadsetManager;
    private final Handler workerThreadHandler;
    public static final Companion Companion = new Companion(null);
    private static final CallsAudioDeviceInfo NO_DEVICE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");

    /* compiled from: CallsAudioManagerV2Impl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: CallsAudioManagerV2Impl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallsAudioManager.State.values().length];
            try {
                iArr[CallsAudioManager.State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallsAudioManager.State.RINGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallsAudioManager.State.DIALING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallsAudioManager.State.CONVERSATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CallsAudioManager.AudioDeviceType.values().length];
            try {
                iArr2[CallsAudioManager.AudioDeviceType.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.SPEAKER_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public CallsAudioManagerV2Impl(Context context, ProximityTracker proximityTracker, boolean z, VideoTracker videoTracker, AudioDeviceSelector audioDeviceSelector, CallsAudioManager.OnMuteListener onMuteListener, Logger logger, boolean z2) {
        this.context = context;
        this.proximityTracker = proximityTracker;
        this.trackProximityWhenSpeakerEnabled = z;
        this.videoTracker = videoTracker;
        this.audioDeviceSelector = audioDeviceSelector;
        this.logger = logger;
        this.awaitDeviceChangeConfirmation = z2;
        HandlerThread handlerThread = new HandlerThread("CallsAudioManagerThread");
        this.backgroundHandlerThread = handlerThread;
        this.state = CallsAudioManager.State.IDLE;
        this.audioDevices = new LinkedHashSet();
        CallsAudioDeviceInfo callsAudioDeviceInfo = NO_DEVICE;
        this.reportedAudioDevice = callsAudioDeviceInfo;
        this.selectedDevice = CallsAudioManager.AudioDeviceType.NONE;
        this.onAudioDeviceListChangeListeners = new CopyOnWriteArrayList<>();
        this.currentDevice = callsAudioDeviceInfo;
        this.deviceSwitchHelper = new DeviceSwitchHelper<>(z2, logger, LOG_TAG, new CallsAudioManagerV2Impl$deviceSwitchHelper$1(this));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.workerThreadHandler = handler;
        Handler handler2 = new Handler(Looper.getMainLooper()) { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 311) {
                    Object obj = message.obj;
                    CallsAudioDeviceInfo callsAudioDeviceInfo2 = obj instanceof CallsAudioDeviceInfo ? (CallsAudioDeviceInfo) obj : null;
                    if (callsAudioDeviceInfo2 != null) {
                        CallsAudioManagerV2Impl.this.reportAudioDeviceOnMainThreadImpl(callsAudioDeviceInfo2);
                    }
                }
            }
        };
        this.mainHandler = handler2;
        this.bluetoothManager = new CallsBluetoothManager(context, this, logger);
        this.wiredHeadsetManager = new CallsWiredHeadsetManager(context, this, logger);
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.audioManager = audioManager;
        CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = new CallsBluethoothDeviceScanner(handler, this);
        callsBluethoothDeviceScanner.start(audioManager);
        this.bluetoothDeviceScanner = callsBluethoothDeviceScanner;
        this.hasEarpiece = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        this.audioFocusRequestHelper = new AudioFocusRequestHelper(audioManager, onMuteListener, handler2, handler, new gzs<Boolean>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final Boolean invoke() {
                return Boolean.valueOf(CallsAudioManagerV2Impl.this.isDestroyed);
            }
        }, logger, null, null, PsExtractor.AUDIO_STREAM, null);
        logger.v(LOG_TAG, "CAM is created");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addOnAudioDeviceListChangeListenerImpl(CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
        if (this.isDestroyed) {
            return;
        }
        onAudioDeviceListChangeListener.onAudioDeviceListChanged(this.audioDevices);
        this.onAudioDeviceListChangeListeners.add(onAudioDeviceListChangeListener);
    }

    private final void applySelectedDevice() {
        CallsAudioDeviceInfo deviceInfo = getDeviceInfo(this.selectedDevice);
        reportAudioDeviceOnMainThread(deviceInfo);
        if (!epx.f(getCurrentDevice(), deviceInfo)) {
            setAudioDeviceInternal(deviceInfo);
        }
        doOnOwnThread$calls_audiomanager_release$default(this, "finalize device switch", null, null, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$applySelectedDevice$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DeviceSwitchHelper deviceSwitchHelper;
                deviceSwitchHelper = CallsAudioManagerV2Impl.this.deviceSwitchHelper;
                deviceSwitchHelper.onDeviceSwitched();
            }
        }, 6, null);
    }

    private final void autoSelectAudioDevice(boolean z) {
        selectAudioDevice(getPreferredAudioDevice(true, !z), zhy0.a("auto select (stop ringing=", z));
    }

    public static /* synthetic */ void autoSelectAudioDevice$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        callsAudioManagerV2Impl.autoSelectAudioDevice(z);
    }

    private final boolean canSwitchToSpeaker(boolean z, boolean z2) {
        return z && (z2 || !this.disabledSpeakerOnce) && getCurrentDevice().oneOf$calls_audiomanager_release(CallsAudioManager.AudioDeviceType.EARPIECE, CallsAudioManager.AudioDeviceType.SPEAKER_PHONE) && this.proximityTracker.getCanUseSpeaker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeState(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(LOG_TAG, "requested " + state);
        onCallStateChangedInternal(state);
    }

    private final void clearDeviceSelection() {
        this.logger.v(LOG_TAG, "clearing device");
        this.currentDevice = NO_DEVICE;
        this.selectedDevice = CallsAudioManager.AudioDeviceType.NONE;
        reportNewDeviceList(EmptySet.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void doOnOwnThread$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, String str, gzs gzsVar, izs izsVar, gzs gzsVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        callsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release(str, gzsVar, izsVar, gzsVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doOnOwnThread$lambda$8(CallsAudioManagerV2Impl callsAudioManagerV2Impl, gzs gzsVar, gzs gzsVar2, String str, izs izsVar) {
        if (callsAudioManagerV2Impl.isDestroyed) {
            return;
        }
        try {
            gzsVar.invoke();
            if (gzsVar2 != null) {
                gzsVar2.invoke();
            }
        } catch (Throwable th) {
            callsAudioManagerV2Impl.logger.e(LOG_TAG, "Error executing an action ".concat(str), th);
            if (izsVar != null) {
                izsVar.invoke(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void doOnOwnThreadWithDelay$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, String str, gzs gzsVar, izs izsVar, long j, gzs gzsVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        callsAudioManagerV2Impl.doOnOwnThreadWithDelay$calls_audiomanager_release(str, gzsVar, izsVar, j, gzsVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doOnOwnThreadWithDelay$lambda$9(CallsAudioManagerV2Impl callsAudioManagerV2Impl, gzs gzsVar, gzs gzsVar2, String str, izs izsVar) {
        if (callsAudioManagerV2Impl.isDestroyed) {
            return;
        }
        try {
            gzsVar.invoke();
            if (gzsVar2 != null) {
                gzsVar2.invoke();
            }
        } catch (Throwable th) {
            callsAudioManagerV2Impl.logger.e(LOG_TAG, "Error executing an action ".concat(str), th);
            if (izsVar != null) {
                izsVar.invoke(th);
            }
        }
    }

    private final String getAudioDeviceReadableName(CallsAudioManager.AudioDeviceType audioDeviceType) {
        int i = WhenMappings.$EnumSwitchMapping$1[audioDeviceType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : CallsAudioDeviceInfo.SPEAKERPHONE : CallsAudioDeviceInfo.EARPIECE : this.wiredHeadsetManager.getConnectedDeviceName() : this.bluetoothManager.getConnectedDeviceName();
    }

    private final long getAudioDeviceSwitchDelay() {
        if (this.awaitDeviceChangeConfirmation) {
            return DELAY_USER_REQUEST_MS;
        }
        return 0L;
    }

    private final CallsAudioDeviceInfo getDeviceInfo(CallsAudioManager.AudioDeviceType audioDeviceType) {
        return new CallsAudioDeviceInfo(audioDeviceType, getAudioDeviceReadableName(audioDeviceType));
    }

    private final boolean getHasBluetoothHeadset() {
        return this.bluetoothManager.getHasBluetoothHeadset();
    }

    private final boolean getHasWiredHeadset() {
        return this.wiredHeadsetManager.isWiredHeadsetPlugged();
    }

    private final CallsAudioManager.AudioDeviceType getPreferredAudioDevice(boolean z, boolean z2) {
        AudioDeviceSelector audioDeviceSelector = this.audioDeviceSelector;
        CallsAudioManager.State state = this.state;
        boolean hasWiredHeadset = getHasWiredHeadset();
        boolean z3 = this.hasEarpiece;
        boolean z4 = this.disabledSpeakerOnce;
        boolean z5 = this.disabledBluetoothOnce;
        Set<CallsAudioDeviceInfo> set = this.audioDevices;
        ArrayList arrayList = new ArrayList(c5g.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallsAudioDeviceInfo) it.next()).getDeviceType());
        }
        return audioDeviceSelector.selectPreferableDevice(state, z, z2, hasWiredHeadset, z3, z4, z5, j5g.S0(arrayList), getCurrentDevice().getDeviceType(), this.videoTracker, this.proximityTracker);
    }

    public static /* synthetic */ CallsAudioManager.AudioDeviceType getPreferredAudioDevice$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return callsAudioManagerV2Impl.getPreferredAudioDevice(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final boolean hasBluetoothHeadset() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        return (Build.VERSION.SDK_INT < 31 || anj.a(this.context, "android.permission.BLUETOOTH_CONNECT") == 0) && defaultAdapter.getProfileConnectionState(1) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasWiredHeadset() {
        return this.wiredHeadsetManager.isWiredHeadsetPlugged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeRestartBluetoothManager() {
        if (this.isDestroyed) {
            return;
        }
        this.bluetoothManager.start();
    }

    private final void onCallStateChangedInternal(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        boolean z = this.state == CallsAudioManager.State.RINGING && state == CallsAudioManager.State.CONVERSATION;
        this.state = state;
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            release();
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            if (this.audioManager.getMode() != 3) {
                savePreviousState();
                requestAudioFocus();
                startTrackingAudioDevices();
                autoSelectAudioDevice$default(this, false, 1, null);
                setAudioManagerModeSafe(3);
            }
            if (z) {
                autoSelectAudioDevice(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(LOG_TAG, "release CAM");
        this.isDestroyed = true;
        this.proximityTracker.stopTrackingProximity();
        this.wiredHeadsetManager.stop();
        this.bluetoothManager.stop();
        this.bluetoothDeviceScanner.stop();
        clearDeviceSelection();
        restorePreviousAudioState();
        releaseAudioFocus();
        setAudioManagerModeSafe(0);
        this.backgroundHandlerThread.quitSafely();
        this.onAudioDeviceChangeListener = null;
        this.onAudioDeviceListChangeListeners.clear();
    }

    private final void releaseAudioFocus() {
        this.audioFocusRequestHelper.releaseFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeOnAudioDeviceListChangeListenerImpl(CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
        if (this.isDestroyed) {
            return;
        }
        this.onAudioDeviceListChangeListeners.remove(onAudioDeviceListChangeListener);
    }

    private final void reportAudioDeviceOnMainThread(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.mainHandler.removeMessages(311);
        Handler handler = this.mainHandler;
        handler.sendMessage(handler.obtainMessage(311, callsAudioDeviceInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportAudioDeviceOnMainThreadImpl(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener = this.onAudioDeviceChangeListener;
        if (epx.f(this.reportedAudioDevice, callsAudioDeviceInfo) || onAudioDeviceInfoChangeListener == null) {
            return;
        }
        this.logger.v(LOG_TAG, "reporting device change " + this.reportedAudioDevice + " -> " + callsAudioDeviceInfo);
        onAudioDeviceInfoChangeListener.onAudioDeviceChanged(new CallsAudioManager.AudioDeviceInfoChangedEvent(this.reportedAudioDevice, callsAudioDeviceInfo));
        this.reportedAudioDevice = callsAudioDeviceInfo;
    }

    private final void reportNewDeviceList(Set<CallsAudioDeviceInfo> set) {
        if (epx.f(set, this.audioDevices)) {
            return;
        }
        this.audioDevices.clear();
        Set<CallsAudioDeviceInfo> set2 = set;
        this.audioDevices.addAll(set2);
        Iterator<T> it = this.onAudioDeviceListChangeListeners.iterator();
        while (it.hasNext()) {
            ((CallsAudioManager.OnAudioDeviceListChangeListener) it.next()).onAudioDeviceListChanged(set2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAudioFocus() {
        this.audioFocusRequestHelper.requestFocus();
    }

    private final void restorePreviousAudioState() {
        if (this.savedPreviousState) {
            this.logger.v(LOG_TAG, "restoring state");
            this.savedPreviousState = false;
            try {
                AudioManager audioManager = this.audioManager;
                audioManager.setMode(this.savedAudioMode);
                audioManager.setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
                audioManager.setMicrophoneMute(this.savedIsMicrophoneMute);
            } catch (Exception e) {
                this.logger.reportError(LOG_TAG, "restorePreviousAudioState: failed", e);
            }
        }
    }

    private final void savePreviousState() {
        if (this.savedPreviousState) {
            return;
        }
        this.logger.v(LOG_TAG, "saving state");
        try {
            AudioManager audioManager = this.audioManager;
            this.savedAudioMode = audioManager.getMode();
            this.savedIsSpeakerPhoneOn = audioManager.isSpeakerphoneOn();
            this.savedIsMicrophoneMute = audioManager.isMicrophoneMute();
            this.savedPreviousState = true;
        } catch (Exception e) {
            this.logger.reportError(LOG_TAG, "savePreviousState: failed", e);
        }
    }

    private final void selectAudioDevice(CallsAudioManager.AudioDeviceType audioDeviceType, String str) {
        this.logger.d(LOG_TAG, "device " + audioDeviceType + " requested by " + str);
        this.deviceSwitchHelper.onDeviceSwitchRequested(audioDeviceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectAudioDeviceImpl(CallsAudioManager.AudioDeviceType audioDeviceType) {
        Object obj;
        if (audioDeviceType == CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT) {
            this.logger.e(LOG_TAG, "device " + audioDeviceType + " can never be selected. use it as trigger for permission request");
            return;
        }
        this.logger.v(LOG_TAG, "selecting " + audioDeviceType);
        Iterator<T> it = this.audioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((CallsAudioDeviceInfo) obj).getDeviceType() == audioDeviceType) {
                    break;
                }
            }
        }
        if (obj == null) {
            this.logger.e(LOG_TAG, "can't select " + audioDeviceType + " from available " + this.audioDevices);
        }
        this.selectedDevice = audioDeviceType;
        updateAudioDeviceState(true);
    }

    public static /* synthetic */ void selectPreferredAudioDevice$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        callsAudioManagerV2Impl.selectPreferredAudioDevice$calls_audiomanager_release(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAudioDevice(CallsAudioManager.AudioDeviceType audioDeviceType) {
        CallsAudioManager.AudioDeviceType deviceType;
        this.logger.v(LOG_TAG, "requested " + audioDeviceType);
        if (this.isDestroyed || audioDeviceType == (deviceType = getCurrentDevice().getDeviceType())) {
            return;
        }
        CallsAudioManager.State state = this.state;
        if (state == CallsAudioManager.State.RINGING) {
            this.logger.d(LOG_TAG, "Avoid audio device update in state " + state);
            return;
        }
        boolean z = this.disabledBluetoothOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        this.disabledBluetoothOnce = z | (deviceType == audioDeviceType2);
        boolean z2 = this.disabledSpeakerOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType3 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        this.disabledSpeakerOnce = z2 | (deviceType == audioDeviceType3);
        CallsAudioManager.AudioDeviceType audioDeviceType4 = CallsAudioManager.AudioDeviceType.NONE;
        if (deviceType == audioDeviceType4) {
            mute(false);
        }
        if (audioDeviceType.oneOf(audioDeviceType3, CallsAudioManager.AudioDeviceType.WIRED_HEADSET, CallsAudioManager.AudioDeviceType.EARPIECE, audioDeviceType2)) {
            selectAudioDevice(audioDeviceType, "user request");
        }
        if (audioDeviceType == audioDeviceType4) {
            mute(true);
        }
    }

    private final void setAudioDeviceInternal(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.logger.v(LOG_TAG, "Setting " + callsAudioDeviceInfo);
        if (this.isDestroyed) {
            return;
        }
        this.currentDevice = callsAudioDeviceInfo;
        boolean z = callsAudioDeviceInfo.getDeviceType() == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        AudioManager audioManager = this.audioManager;
        if (audioManager.isSpeakerphoneOn() != z) {
            audioManager.setSpeakerphoneOn(z);
        }
        updateProximityTrackingState(z);
    }

    private final void setAudioManagerModeSafe(int i) {
        try {
            this.audioManager.setMode(i);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't set audio manager mode", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnAudioDeviceChangeListenerImpl(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        if (this.isDestroyed) {
            return;
        }
        this.onAudioDeviceChangeListener = onAudioDeviceInfoChangeListener;
        if (onAudioDeviceInfoChangeListener == null) {
            return;
        }
        this.reportedAudioDevice = NO_DEVICE;
        reportAudioDeviceOnMainThread(getCurrentDevice());
    }

    private final void startTrackingAudioDevices() {
        this.logger.v(LOG_TAG, "start tracking devices");
        clearDeviceSelection();
        this.wiredHeadsetManager.start();
        this.bluetoothManager.start();
        updateAudioDeviceState(false);
    }

    private final void updateAudioDeviceState(boolean z) {
        this.logger.v(LOG_TAG, "Updating device, prefer selection is " + z + "...");
        try {
            boolean hasBluetoothHeadset = this.bluetoothManager.getHasBluetoothHeadset();
            CallsAudioManager.AudioDeviceType deviceType = getCurrentDevice().getDeviceType();
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
            if (deviceType == audioDeviceType && !hasBluetoothHeadset) {
                this.logger.v(LOG_TAG, "BT is down, reselect");
                this.selectedDevice = getPreferredAudioDevice(false, false);
            }
            if (shouldSwitchToBluetooth(hasBluetoothHeadset, z)) {
                this.logger.v(LOG_TAG, "suddenly, BT. " + this.selectedDevice + " -> " + audioDeviceType);
                this.selectedDevice = audioDeviceType;
            }
            updateAvailableAudioDevices();
            this.logger.v(LOG_TAG, "current selected device is " + this.selectedDevice);
            CallsAudioManager.AudioDeviceType audioDeviceType2 = this.selectedDevice;
            if (audioDeviceType2 == audioDeviceType) {
                if (!this.bluetoothManager.isBluetoothOn() && !this.bluetoothManager.startScoAudio()) {
                    CallsAudioManager.AudioDeviceType preferredAudioDevice = getPreferredAudioDevice(false, true);
                    this.selectedDevice = preferredAudioDevice;
                    this.logger.e(LOG_TAG, "failed to start bluetooth, so selected other preferred device: " + preferredAudioDevice);
                }
            } else if (audioDeviceType2 != CallsAudioManager.AudioDeviceType.NONE) {
                this.bluetoothManager.stopScoAudio();
            }
            applySelectedDevice();
        } catch (Throwable th) {
            applySelectedDevice();
            throw th;
        }
    }

    private final void updateAvailableAudioDevices() {
        this.logger.v(LOG_TAG, "updating available devices");
        EnumSet noneOf = EnumSet.noneOf(CallsAudioManager.AudioDeviceType.class);
        if (getHasBluetoothHeadset()) {
            noneOf.add(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        }
        if (getHasWiredHeadset()) {
            noneOf.add(CallsAudioManager.AudioDeviceType.WIRED_HEADSET);
        } else if (this.hasEarpiece) {
            noneOf.add(CallsAudioManager.AudioDeviceType.EARPIECE);
        }
        noneOf.add(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
        ArrayList arrayList = new ArrayList(c5g.u(noneOf, 10));
        Iterator it = noneOf.iterator();
        while (it.hasNext()) {
            arrayList.add(getDeviceInfo((CallsAudioManager.AudioDeviceType) it.next()));
        }
        reportNewDeviceList(j5g.S0(arrayList));
        this.logger.v(LOG_TAG, "updated devices: " + noneOf);
    }

    private final void updateProximityTrackingState(boolean z) {
        boolean z2 = getCurrentDevice().getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH || getHasWiredHeadset() || (z && !this.trackProximityWhenSpeakerEnabled);
        this.logger.v(LOG_TAG, zy60.c("proximity disabled? ", ", speaker? ", z2, z));
        if (z2) {
            this.proximityTracker.stopTrackingProximity();
        } else {
            this.proximityTracker.startTrackingProximity();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void addOnAudioDeviceListChangeListener(final CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
        doOnOwnThread$calls_audiomanager_release$default(this, "addOnAudioDeviceListChangeListener", null, null, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$addOnAudioDeviceListChangeListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.addOnAudioDeviceListChangeListenerImpl(onAudioDeviceListChangeListener);
            }
        }, 6, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void changeStateAsync(final CallsAudioManager.State state, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThread$calls_audiomanager_release("changeState", gzsVar, izsVar, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$changeStateAsync$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.changeState(state);
            }
        });
    }

    public final void doOnOwnThread$calls_audiomanager_release(String str, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar2) {
        if (this.isDestroyed) {
            return;
        }
        this.workerThreadHandler.post(new fc9(0, str, this, gzsVar2, gzsVar, izsVar));
    }

    public final void doOnOwnThreadWithDelay$calls_audiomanager_release(final String str, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar, long j, final gzs<s3q0> gzsVar2) {
        if (this.isDestroyed) {
            return;
        }
        this.workerThreadHandler.postDelayed(new Runnable() { // from class: xsna.ec9
            @Override // java.lang.Runnable
            public final void run() {
                CallsAudioManagerV2Impl.doOnOwnThreadWithDelay$lambda$9(CallsAudioManagerV2Impl.this, gzsVar2, gzsVar, str, izsVar);
            }
        }, j);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public List<CallsAudioDeviceInfo> getAvailableAudioDevices() {
        return j5g.O0(this.audioDevices);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public CallsAudioDeviceInfo getCurrentDevice() {
        return this.currentDevice;
    }

    public final Handler getWorkerThreadHandler$calls_audiomanager_release() {
        return this.workerThreadHandler;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasBluetoothHeadsetAsync(final izs<? super Boolean, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        doOnOwnThread$calls_audiomanager_release$default(this, "hasBluetoothHeadset", null, izsVar2, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$hasBluetoothHeadsetAsync$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean hasBluetoothHeadset;
                izs<Boolean, s3q0> izsVar3 = izsVar;
                hasBluetoothHeadset = this.hasBluetoothHeadset();
                izsVar3.invoke(Boolean.valueOf(hasBluetoothHeadset));
            }
        }, 2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasWiredHeadsetAsync(final izs<? super Boolean, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        doOnOwnThread$calls_audiomanager_release$default(this, "hasWiredHeadset", null, izsVar2, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$hasWiredHeadsetAsync$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean hasWiredHeadset;
                izs<Boolean, s3q0> izsVar3 = izsVar;
                hasWiredHeadset = this.hasWiredHeadset();
                izsVar3.invoke(Boolean.valueOf(hasWiredHeadset));
            }
        }, 2, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public boolean isHeadsetConnected() {
        return getCurrentDevice().getDeviceType().isHeadsetDevice();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void notifyBluetoothPermissionGranted() {
        doOnOwnThread$calls_audiomanager_release$default(this, "refreshPermissions", null, null, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$notifyBluetoothPermissionGranted$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.maybeRestartBluetoothManager();
            }
        }, 6, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner.Listener
    public boolean onDeviceAvailable(CallsBluethoothDeviceScanner.BluetoothDeviceIntent bluetoothDeviceIntent) {
        this.logger.d(LOG_TAG, "Bluetooth device added: " + bluetoothDeviceIntent);
        updateAvailableAudioDevices();
        return true;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner.Listener
    public boolean onDeviceUnavailable(CallsBluethoothDeviceScanner.BluetoothDeviceIntent bluetoothDeviceIntent) {
        this.logger.d(LOG_TAG, "Bluetooth device removed: " + bluetoothDeviceIntent);
        updateAvailableAudioDevices();
        return true;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void releaseAsync(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThread$calls_audiomanager_release("release", gzsVar, izsVar, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$releaseAsync$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.release();
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void removeOnAudioDeviceListChangeListener(final CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
        doOnOwnThread$calls_audiomanager_release$default(this, "removeOnAudioDeviceListChangeListener", null, null, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$removeOnAudioDeviceListChangeListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.removeOnAudioDeviceListChangeListenerImpl(onAudioDeviceListChangeListener);
            }
        }, 6, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void requestAudioFocusAsync() {
        doOnOwnThread$calls_audiomanager_release("requestAudioFocus", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$requestAudioFocusAsync$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Logger logger;
                logger = CallsAudioManagerV2Impl.this.logger;
                logger.e("CallsAudioManagerV2", "audio focus request done");
            }
        }, new izs<Throwable, s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$requestAudioFocusAsync$2
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                invoke2(th);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Logger logger;
                logger = CallsAudioManagerV2Impl.this.logger;
                logger.e("CallsAudioManagerV2", "audio focus request failed", th);
            }
        }, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$requestAudioFocusAsync$3
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.requestAudioFocus();
            }
        });
    }

    public final void selectPreferredAudioDevice$calls_audiomanager_release(boolean z) {
        selectAudioDevice(getPreferredAudioDevice(z, true), "set preferred device");
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceAsync(final CallsAudioDeviceInfo callsAudioDeviceInfo, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThreadWithDelay$calls_audiomanager_release("setAudioDevice", gzsVar, izsVar, getAudioDeviceSwitchDelay(), new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setAudioDeviceAsync$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.setAudioDevice(callsAudioDeviceInfo.getDeviceType());
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceTypeAsync(final CallsAudioManager.AudioDeviceType audioDeviceType, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThreadWithDelay$calls_audiomanager_release("setAudioDevice", gzsVar, izsVar, getAudioDeviceSwitchDelay(), new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setAudioDeviceTypeAsync$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.setAudioDevice(audioDeviceType);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setOnAudioDeviceChangeListener(final CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        doOnOwnThread$calls_audiomanager_release$default(this, "setOnAudioDeviceChangeListener", null, null, new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setOnAudioDeviceChangeListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.setOnAudioDeviceChangeListenerImpl(onAudioDeviceInfoChangeListener);
            }
        }, 6, null);
    }

    public final void setSpeakerEnabled$calls_audiomanager_release(boolean z, boolean z2) {
        this.logger.v(LOG_TAG, sni0.a("requested speaker ", " (", ")", z, z2));
        if (this.isDestroyed) {
            return;
        }
        if (canSwitchToSpeaker(z, z2)) {
            selectAudioDevice(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE, "speaker enabled");
        } else {
            selectAudioDevice(getPreferredAudioDevice(true, false), "speaker disabled");
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setSpeakerEnabledAsync(final boolean z, final boolean z2, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThreadWithDelay$calls_audiomanager_release("setSpeakerEnabled", gzsVar, izsVar, getAudioDeviceSwitchDelay(), new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl$setSpeakerEnabledAsync$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CallsAudioManagerV2Impl.this.setSpeakerEnabled$calls_audiomanager_release(z, z2);
            }
        });
    }

    public final boolean shouldSwitchToBluetooth(boolean z, boolean z2) {
        CallsAudioManager.AudioDeviceType audioDeviceType;
        return (!z || z2 || (audioDeviceType = this.selectedDevice) == CallsAudioManager.AudioDeviceType.BLUETOOTH || audioDeviceType == CallsAudioManager.AudioDeviceType.WIRED_HEADSET || this.disabledBluetoothOnce) ? false : true;
    }

    public final void updateAudioDeviceState$calls_audiomanager_release() {
        updateAudioDeviceState(false);
    }

    private final void mute(boolean z) {
    }
}
