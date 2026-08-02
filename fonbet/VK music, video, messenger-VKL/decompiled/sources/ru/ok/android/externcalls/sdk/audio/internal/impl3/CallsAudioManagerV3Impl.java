package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vk.movika.sdk.base.model.history.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.android.externcalls.sdk.audio.internal.DeviceSwitchHelper;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import xsna.c5g;
import xsna.epx;
import xsna.go9;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.odj;
import xsna.pn00;
import xsna.qc9;
import xsna.s3q0;
import xsna.sj1;
import xsna.wr;
import xsna.xw1;
import xsna.zcl;
import xsna.zhy0;
import xsna.zr;
import xsna.zy60;

/* compiled from: CallsAudioManagerV3Impl.kt */
@TargetApi(31)
/* loaded from: classes9.dex */
public final class CallsAudioManagerV3Impl extends AudioDeviceCallback implements CallsAudioManager, AudioManager$OnCommunicationDeviceChangedListener {
    private static final int MESSAGE_REPORT_DEVICE = 311;

    @Deprecated
    public static final long ROLLBACK_TO_ACTUAL_DEVICE_TIMEOUT_MS = 2000;

    @Deprecated
    public static final String TAG = "CallsAudioManagerV3Impl";

    @Deprecated
    public static final long TRY_AGAIN_TIMEOUT_MS = 2000;

    @Deprecated
    public static final long USED_DEVICE_RECOVER_TIMEOUT_MS = 3000;
    private final Map<CallsAudioDeviceInfo, AudioDeviceInfo> audioDeviceByCallsDevice;
    private final AudioDeviceSelector audioDeviceSelector;
    private int audioDeviceSyncCount;
    private final AudioFocusRequestHelper audioFocusRequestHelper;
    private final AudioManager audioManager;
    private final boolean awaitDeviceChangeConfirmation;
    private final HandlerThread backgroundHandlerThread;
    private final List<CallsAudioDeviceInfo> callsAudioDevices;
    private final DeviceSwitchHelper<CallsAudioDeviceInfo> deviceSwitchHelper;
    private final CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy;
    private boolean disabledBluetoothOnce;
    private boolean disabledSpeakerOnce;
    private boolean isDestroyed;
    private boolean isInCall;
    private boolean isStarted;
    private CallsAudioManager.AudioDeviceType lastKnownAudioDeviceType;
    private final Logger logger;
    private final Handler mainHandler;
    private volatile CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceChangeListener;
    private final CopyOnWriteArrayList<CallsAudioManager.OnAudioDeviceListChangeListener> onAudioDeviceListChangeListeners;
    private final ProximityTracker proximityTracker;
    private final Runnable recoverDeviceByTypeRunnable;
    private CallsAudioDeviceInfo reportedAudioDevice;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private boolean savedPreviousState;
    private CallsAudioManager.State state;
    private final Runnable syncWithSystemCommunicationDeviceRunnable;
    private final boolean trackProximityWhenSpeakerEnabled;
    private final Runnable tryAgainRunnable;
    private CallsAudioDeviceInfo usedDevice;
    private final VideoTracker videoTracker;
    private final Handler workerThreadHandler;
    private static final Companion Companion = new Companion(null);
    private static final CallsAudioDeviceInfo NO_DEVICE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");

    /* compiled from: CallsAudioManagerV3Impl.kt */
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements gzs<s3q0> {
        public AnonymousClass2(Object obj) {
            super(0, obj, CallsAudioManagerV3Impl.class, "maybeRecoverUtilizedDeviceType", "maybeRecoverUtilizedDeviceType()V", 0);
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            invoke2();
            return s3q0.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CallsAudioManagerV3Impl) this.receiver).maybeRecoverUtilizedDeviceType();
        }
    }

    /* compiled from: CallsAudioManagerV3Impl.kt */
    /* renamed from: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements gzs<s3q0> {
        public AnonymousClass3(Object obj) {
            super(0, obj, CallsAudioManagerV3Impl.class, "rememberUtilizedDeviceType", "rememberUtilizedDeviceType()V", 0);
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            invoke2();
            return s3q0.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CallsAudioManagerV3Impl) this.receiver).rememberUtilizedDeviceType();
        }
    }

    /* compiled from: CallsAudioManagerV3Impl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CallsAudioDeviceInfo getNO_DEVICE() {
            return CallsAudioManagerV3Impl.NO_DEVICE;
        }

        private Companion() {
        }
    }

    /* compiled from: CallsAudioManagerV3Impl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public CallsAudioManagerV3Impl(Context context, ProximityTracker proximityTracker, boolean z, VideoTracker videoTracker, AudioDeviceSelector audioDeviceSelector, CallsAudioManager.DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy, CallsAudioManager.OnMuteListener onMuteListener, Logger logger, boolean z2) {
        this.proximityTracker = proximityTracker;
        this.trackProximityWhenSpeakerEnabled = z;
        this.videoTracker = videoTracker;
        this.audioDeviceSelector = audioDeviceSelector;
        this.disabledAudioDeviceUsagePolicy = disabledAudioDeviceUsagePolicy;
        this.logger = logger;
        this.awaitDeviceChangeConfirmation = z2;
        HandlerThread handlerThread = new HandlerThread("CallsAudioManagerV3Thread");
        this.backgroundHandlerThread = handlerThread;
        this.lastKnownAudioDeviceType = CallsAudioManager.AudioDeviceType.NONE;
        this.callsAudioDevices = new ArrayList();
        this.audioDeviceByCallsDevice = new LinkedHashMap();
        CallsAudioDeviceInfo.Companion companion = CallsAudioDeviceInfo.Companion;
        this.usedDevice = companion.getNONE();
        this.reportedAudioDevice = companion.getNONE();
        this.onAudioDeviceListChangeListeners = new CopyOnWriteArrayList<>();
        this.recoverDeviceByTypeRunnable = new qc9(this, 0);
        int i = 2;
        this.syncWithSystemCommunicationDeviceRunnable = new xw1(this, i);
        this.tryAgainRunnable = new sj1(this, i);
        this.state = CallsAudioManager.State.IDLE;
        this.deviceSwitchHelper = new DeviceSwitchHelper<>(z2, logger, TAG, new CallsAudioManagerV3Impl$deviceSwitchHelper$1(this));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.workerThreadHandler = handler;
        Handler handler2 = new Handler(Looper.getMainLooper()) { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 311) {
                    Object obj = message.obj;
                    CallsAudioDeviceInfo callsAudioDeviceInfo = obj instanceof CallsAudioDeviceInfo ? (CallsAudioDeviceInfo) obj : null;
                    if (callsAudioDeviceInfo != null) {
                        CallsAudioManagerV3Impl.this.reportAudioDeviceOnMainThreadImpl(callsAudioDeviceInfo);
                    }
                }
            }
        };
        this.mainHandler = handler2;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.audioManager = audioManager;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this);
        this.audioFocusRequestHelper = new AudioFocusRequestHelper(audioManager, onMuteListener, handler2, handler, new gzs<Boolean>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final Boolean invoke() {
                return Boolean.valueOf(CallsAudioManagerV3Impl.this.isDestroyed);
            }
        }, logger, new AnonymousClass3(this), anonymousClass2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addOnAudioDeviceListChangeListenerImpl(CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
        if (this.isDestroyed) {
            return;
        }
        onAudioDeviceListChangeListener.onAudioDeviceListChanged(this.callsAudioDevices);
        this.onAudioDeviceListChangeListeners.add(onAudioDeviceListChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String androidDeviceToString(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return "null";
        }
        try {
            return audioDeviceInfo.getId() + StringUtils.PROCESS_POSTFIX_DELIMITER + audioDeviceInfo.getType() + StringUtils.PROCESS_POSTFIX_DELIMITER + ((Object) audioDeviceInfo.getProductName());
        } catch (Throwable th) {
            return go9.b("error: ", th.getMessage());
        }
    }

    private final void applyCurrentDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.logger.d(TAG, "Cancel try again schedule because of used device change to " + callsAudioDeviceInfo);
        cancelScheduledTrySetCommunicationDeviceAgain();
        this.usedDevice = callsAudioDeviceInfo;
        reportCurrentCallsAudioDevice(callsAudioDeviceInfo);
    }

    private final boolean canSetSpeakerEnabled(boolean z) {
        return (z || !(this.disabledSpeakerOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE))) && this.usedDevice.oneOf$calls_audiomanager_release(CallsAudioManager.AudioDeviceType.EARPIECE, CallsAudioManager.AudioDeviceType.SPEAKER_PHONE) && this.proximityTracker.getCanUseSpeaker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelScheduledSyncWithSystemCommunicationDevice() {
        this.workerThreadHandler.removeCallbacks(this.syncWithSystemCommunicationDeviceRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelScheduledTrySetCommunicationDeviceAgain() {
        this.workerThreadHandler.removeCallbacks(this.tryAgainRunnable);
    }

    private final void cancelUtilizedDeviceTypeRecovery() {
        this.logger.d(TAG, "Cancelling audio device recovery by type " + this.lastKnownAudioDeviceType + " (maybe)");
        this.workerThreadHandler.removeCallbacks(this.recoverDeviceByTypeRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeState(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(TAG, "requested " + state);
        onCallStateChangedInternal(state);
    }

    private final void doOnOwnThread(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, izs<? super Throwable, s3q0> izsVar) {
        try {
            doOnOwnThreadUnsafe(str, gzsVar, gzsVar2, izsVar);
        } catch (Throwable th) {
            this.logger.e(TAG, zr.a("error posting action ", str, " for execution"), th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void doOnOwnThread$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, gzs gzsVar, gzs gzsVar2, izs izsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            gzsVar2 = null;
        }
        if ((i & 8) != 0) {
            izsVar = null;
        }
        callsAudioManagerV3Impl.doOnOwnThread(str, gzsVar, gzsVar2, izsVar);
    }

    private final void doOnOwnThreadUnsafe(final String str, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final izs<? super Throwable, s3q0> izsVar) {
        this.workerThreadHandler.post(new Runnable() { // from class: xsna.nc9
            @Override // java.lang.Runnable
            public final void run() {
                CallsAudioManagerV3Impl.doOnOwnThreadUnsafe$lambda$9(gzs.this, gzsVar2, this, str, izsVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void doOnOwnThreadUnsafe$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, gzs gzsVar, gzs gzsVar2, izs izsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            gzsVar2 = null;
        }
        if ((i & 8) != 0) {
            izsVar = null;
        }
        callsAudioManagerV3Impl.doOnOwnThreadUnsafe(str, gzsVar, gzsVar2, izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doOnOwnThreadUnsafe$lambda$9(gzs gzsVar, gzs gzsVar2, CallsAudioManagerV3Impl callsAudioManagerV3Impl, String str, izs izsVar) {
        try {
            gzsVar.invoke();
            if (gzsVar2 != null) {
                gzsVar2.invoke();
            }
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "error on executing action ".concat(str), th);
            if (izsVar != null) {
                izsVar.invoke(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallsAudioDeviceInfo firstOfType(CallsAudioManager.AudioDeviceType audioDeviceType) {
        Object obj;
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CallsAudioDeviceInfo) obj).getDeviceType() == audioDeviceType) {
                break;
            }
        }
        return (CallsAudioDeviceInfo) obj;
    }

    private final AudioDeviceInfo getAudioDeviceInfo(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        return this.audioDeviceByCallsDevice.get(callsAudioDeviceInfo);
    }

    private final String getAudioManagerStateDetails() {
        List availableCommunicationDevices;
        try {
            availableCommunicationDevices = this.audioManager.getAvailableCommunicationDevices();
            return j5g.g0(availableCommunicationDevices, StringUtils.COMMA, null, null, 0, new izs<AudioDeviceInfo, CharSequence>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$getAudioManagerStateDetails$1
                {
                    super(1);
                }

                @Override // xsna.izs
                public final CharSequence invoke(AudioDeviceInfo audioDeviceInfo) {
                    String androidDeviceToString;
                    androidDeviceToString = CallsAudioManagerV3Impl.this.androidDeviceToString(audioDeviceInfo);
                    return androidDeviceToString;
                }
            }, 30);
        } catch (Throwable th) {
            return go9.b("audio manager error: ", th.getMessage());
        }
    }

    private final List<Pair<CallsAudioDeviceInfo, AudioDeviceInfo>> getAvailableDevices() {
        List availableCommunicationDevices;
        availableCommunicationDevices = this.audioManager.getAvailableCommunicationDevices();
        ArrayList arrayList = new ArrayList();
        Iterator it = availableCommunicationDevices.iterator();
        while (it.hasNext()) {
            Pair<CallsAudioDeviceInfo, AudioDeviceInfo> mapAndroidDeviceToCallsDevice = mapAndroidDeviceToCallsDevice((AudioDeviceInfo) it.next());
            if (mapAndroidDeviceToCallsDevice != null) {
                arrayList.add(mapAndroidDeviceToCallsDevice);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallsAudioDeviceInfo getDeviceForAndroidDevice(AudioDeviceInfo audioDeviceInfo) {
        Object obj;
        Object obj2;
        if (audioDeviceInfo == null) {
            this.logger.d(TAG, "NULL device mapped to null");
            return null;
        }
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(getAudioDeviceInfo((CallsAudioDeviceInfo) obj), audioDeviceInfo)) {
                break;
            }
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) obj;
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "Not having a mirror for current communication device");
            syncAudioDeviceList();
            Iterator<T> it2 = this.callsAudioDevices.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (epx.f(getAudioDeviceInfo((CallsAudioDeviceInfo) obj2), audioDeviceInfo)) {
                    break;
                }
            }
            callsAudioDeviceInfo = (CallsAudioDeviceInfo) obj2;
        }
        if (callsAudioDeviceInfo == null) {
            this.logger.e(TAG, "After double-check still not having a mirror for current communication device");
            return null;
        }
        Logger logger = this.logger;
        int id = audioDeviceInfo.getId();
        int type = audioDeviceInfo.getType();
        CharSequence productName = audioDeviceInfo.getProductName();
        StringBuilder a = odj.a(id, type, "Device ", StringUtils.PROCESS_POSTFIX_DELIMITER, StringUtils.PROCESS_POSTFIX_DELIMITER);
        a.append((Object) productName);
        a.append(" mirrored to ");
        a.append(callsAudioDeviceInfo);
        logger.d(TAG, a.toString());
        return callsAudioDeviceInfo;
    }

    private final boolean getHasEarpiece() {
        return firstOfType(CallsAudioManager.AudioDeviceType.EARPIECE) != null;
    }

    private final boolean getHasWiredHeadset() {
        return firstOfType(CallsAudioManager.AudioDeviceType.WIRED_HEADSET) != null;
    }

    private final CallsAudioDeviceInfo getPreferredAudioDevice(boolean z, boolean z2) {
        boolean z3;
        maybeSyncAudioDeviceList();
        AudioDeviceSelector audioDeviceSelector = this.audioDeviceSelector;
        CallsAudioManager.State state = this.state;
        boolean hasWiredHeadset = getHasWiredHeadset();
        boolean hasEarpiece = getHasEarpiece();
        boolean z4 = true;
        if (!this.disabledSpeakerOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE)) {
            z3 = true;
            z4 = false;
        } else {
            z3 = true;
        }
        boolean z5 = (!this.disabledBluetoothOnce || this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH)) ? false : z3;
        List<CallsAudioDeviceInfo> list = this.callsAudioDevices;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallsAudioDeviceInfo) it.next()).getDeviceType());
        }
        CallsAudioDeviceInfo firstOfType = firstOfType(audioDeviceSelector.selectPreferableDevice(state, z, z2, hasWiredHeadset, hasEarpiece, z4, z5, j5g.S0(arrayList), this.usedDevice.getDeviceType(), this.videoTracker, this.proximityTracker));
        return firstOfType == null ? CallsAudioDeviceInfo.Companion.getNONE() : firstOfType;
    }

    public static /* synthetic */ CallsAudioDeviceInfo getPreferredAudioDevice$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return callsAudioManagerV3Impl.getPreferredAudioDevice(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCurrentCommunicationDevice(AudioDeviceInfo audioDeviceInfo) {
        CallsAudioDeviceInfo deviceForAndroidDevice = getDeviceForAndroidDevice(audioDeviceInfo);
        if (deviceForAndroidDevice == null) {
            return;
        }
        this.logger.d(TAG, "Apply device " + deviceForAndroidDevice + " confirmed by system");
        applyCurrentDevice(deviceForAndroidDevice);
        this.deviceSwitchHelper.onDeviceSwitched();
    }

    private final Pair<CallsAudioDeviceInfo, AudioDeviceInfo> mapAndroidDeviceToCallsDevice(AudioDeviceInfo audioDeviceInfo) {
        CallsAudioDeviceInfo callsAudioDeviceInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String obj;
        String obj2;
        String str5;
        String obj3;
        int type = audioDeviceInfo.getType();
        if (type == 1) {
            CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
            CharSequence productName = audioDeviceInfo.getProductName();
            if (productName == null || (str = productName.toString()) == null) {
                str = CallsAudioDeviceInfo.EARPIECE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType, str);
        } else if (type == 2) {
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            CharSequence productName2 = audioDeviceInfo.getProductName();
            if (productName2 == null || (str2 = productName2.toString()) == null) {
                str2 = CallsAudioDeviceInfo.SPEAKERPHONE;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType2, str2);
        } else if (type == 3) {
            CallsAudioManager.AudioDeviceType audioDeviceType3 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName3 = audioDeviceInfo.getProductName();
            if (productName3 == null || (str3 = productName3.toString()) == null) {
                str3 = CallsAudioDeviceInfo.WIRED_HEADSET;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType3, str3);
        } else if (type != 4) {
            String str6 = CallsAudioDeviceInfo.BLUETOOTH;
            if (type == 7) {
                CallsAudioManager.AudioDeviceType audioDeviceType4 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName4 = audioDeviceInfo.getProductName();
                if (productName4 != null && (obj = productName4.toString()) != null) {
                    str6 = obj;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType4, str6);
            } else if (type == 8) {
                CallsAudioManager.AudioDeviceType audioDeviceType5 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName5 = audioDeviceInfo.getProductName();
                if (productName5 != null && (obj2 = productName5.toString()) != null) {
                    str6 = obj2;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType5, str6);
            } else if (type == 22) {
                CallsAudioManager.AudioDeviceType audioDeviceType6 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
                CharSequence productName6 = audioDeviceInfo.getProductName();
                if (productName6 == null || (str5 = productName6.toString()) == null) {
                    str5 = CallsAudioDeviceInfo.USB_HEADSET;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType6, str5);
            } else if (type != 26) {
                this.logger.d(TAG, "Unknown available audio device " + audioDeviceInfo.getType() + StringUtils.PROCESS_POSTFIX_DELIMITER + ((Object) audioDeviceInfo.getProductName()));
                callsAudioDeviceInfo = null;
            } else {
                CallsAudioManager.AudioDeviceType audioDeviceType7 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                CharSequence productName7 = audioDeviceInfo.getProductName();
                if (productName7 != null && (obj3 = productName7.toString()) != null) {
                    str6 = obj3;
                }
                callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType7, str6);
            }
        } else {
            CallsAudioManager.AudioDeviceType audioDeviceType8 = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
            CharSequence productName8 = audioDeviceInfo.getProductName();
            if (productName8 == null || (str4 = productName8.toString()) == null) {
                str4 = CallsAudioDeviceInfo.WIRED_HEADPHONES;
            }
            callsAudioDeviceInfo = new CallsAudioDeviceInfo(audioDeviceType8, str4);
        }
        Logger logger = this.logger;
        int id = audioDeviceInfo.getId();
        int type2 = audioDeviceInfo.getType();
        CharSequence productName9 = audioDeviceInfo.getProductName();
        StringBuilder a = odj.a(id, type2, "Map ", StringUtils.PROCESS_POSTFIX_DELIMITER, StringUtils.PROCESS_POSTFIX_DELIMITER);
        a.append((Object) productName9);
        a.append(" -> ");
        a.append(callsAudioDeviceInfo);
        logger.d(TAG, a.toString());
        if (callsAudioDeviceInfo != null) {
            return new Pair<>(callsAudioDeviceInfo, audioDeviceInfo);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeRecoverUtilizedDeviceType() {
        if (this.lastKnownAudioDeviceType == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Previously used device type is not known, will not try to recover");
        }
        if (this.usedDevice.getDeviceType() == this.lastKnownAudioDeviceType) {
            this.logger.d(TAG, "Used device type matches type of device used before audio focus was lost. Nothing to do here");
            return;
        }
        this.logger.d(TAG, "Schedule previously utilized device recovery in 3000 ms");
        try {
            this.workerThreadHandler.postDelayed(this.recoverDeviceByTypeRunnable, 3000L);
        } catch (Throwable th) {
            this.logger.e(TAG, "Unable to post recovery runnable", th);
        }
    }

    private final void maybeSyncAudioDeviceList() {
        if (this.audioDeviceSyncCount > 0) {
            return;
        }
        syncAudioDeviceList();
    }

    private final void onCallStateChangedInternal(CallsAudioManager.State state) {
        if (this.isDestroyed) {
            return;
        }
        boolean z = this.state == CallsAudioManager.State.RINGING && state == CallsAudioManager.State.CONVERSATION;
        this.isInCall = state == CallsAudioManager.State.CONVERSATION;
        this.state = state;
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            release();
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            start();
            if (z) {
                updateAvailableDeviceList(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recoverDeviceByTypeRunnable$lambda$0(CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        try {
            callsAudioManagerV3Impl.recoverPreviouslyUtilizedDeviceType();
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "Error on device recovery", th);
        }
    }

    private final void recoverPreviouslyUtilizedDeviceType() {
        if (this.isDestroyed) {
            return;
        }
        if (this.usedDevice.getDeviceType() != this.lastKnownAudioDeviceType) {
            this.logger.d(TAG, "It seems previously used device has been recovered by system. Nothing to do here");
            return;
        }
        if (updateAvailableDeviceList$default(this, false, 1, null)) {
            this.logger.d(TAG, "It seems better option was found during device list update. Keep it as it is");
            return;
        }
        CallsAudioDeviceInfo firstOfType = firstOfType(this.lastKnownAudioDeviceType);
        if (firstOfType == null) {
            this.logger.d(TAG, "No device found by requested type " + this.lastKnownAudioDeviceType);
            return;
        }
        this.logger.d(TAG, "Submitting request to select " + firstOfType + " as current (recovery)");
        selectAudioDevice(firstOfType, "recover");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        if (this.isDestroyed) {
            this.logger.d(TAG, "Already released, ignore");
            return;
        }
        this.isDestroyed = true;
        AudioManager audioManager = this.audioManager;
        audioManager.unregisterAudioDeviceCallback(this);
        try {
            audioManager.removeOnCommunicationDeviceChangedListener(this);
        } catch (IllegalArgumentException unused) {
        }
        audioManager.clearCommunicationDevice();
        this.logger.d(TAG, "Audio manager cleanup completed");
        releaseAudioFocus();
        restorePreviousAudioState();
        setAudioManagerModeSafe(0);
        this.backgroundHandlerThread.quit();
        this.onAudioDeviceChangeListener = null;
        this.onAudioDeviceListChangeListeners.clear();
        this.logger.d(TAG, "Release completed");
    }

    private final void releaseAudioFocus() {
        this.audioFocusRequestHelper.releaseFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rememberUtilizedDeviceType() {
        cancelUtilizedDeviceTypeRecovery();
        this.lastKnownAudioDeviceType = this.usedDevice.getDeviceType();
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
        if (!epx.f(this.reportedAudioDevice, callsAudioDeviceInfo) && onAudioDeviceInfoChangeListener != null) {
            this.logger.v(TAG, "reporting device change " + this.reportedAudioDevice + " -> " + callsAudioDeviceInfo);
            onAudioDeviceInfoChangeListener.onAudioDeviceChanged(new CallsAudioManager.AudioDeviceInfoChangedEvent(this.reportedAudioDevice, callsAudioDeviceInfo));
            this.reportedAudioDevice = callsAudioDeviceInfo;
            return;
        }
        Logger logger = this.logger;
        CallsAudioDeviceInfo callsAudioDeviceInfo2 = this.reportedAudioDevice;
        logger.d(TAG, "Will not report audio device change from " + callsAudioDeviceInfo2 + " to " + callsAudioDeviceInfo + " because of same device=" + epx.f(callsAudioDeviceInfo2, callsAudioDeviceInfo) + ", has listener=" + (onAudioDeviceInfoChangeListener != null));
    }

    private final void reportCurrentCallsAudioDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        reportAudioDeviceOnMainThread(callsAudioDeviceInfo);
        updateProximityTrackingState(callsAudioDeviceInfo.getDeviceType() == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
    }

    private final void reportNewDeviceList(List<CallsAudioDeviceInfo> list) {
        if (epx.f(list, this.callsAudioDevices)) {
            return;
        }
        this.callsAudioDevices.clear();
        List<CallsAudioDeviceInfo> list2 = list;
        this.callsAudioDevices.addAll(list2);
        Iterator<T> it = this.onAudioDeviceListChangeListeners.iterator();
        while (it.hasNext()) {
            ((CallsAudioManager.OnAudioDeviceListChangeListener) it.next()).onAudioDeviceListChanged(list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAudioFocus() {
        this.audioFocusRequestHelper.requestFocus();
    }

    private final void restorePreviousAudioState() {
        List availableCommunicationDevices;
        Object obj;
        if (this.savedPreviousState) {
            this.logger.v(TAG, "restoring state");
            this.savedPreviousState = false;
            try {
                AudioManager audioManager = this.audioManager;
                if (this.savedIsSpeakerPhoneOn) {
                    availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
                    Iterator it = availableCommunicationDevices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((AudioDeviceInfo) obj).getType() == 2) {
                                break;
                            }
                        }
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    if (audioDeviceInfo != null) {
                        audioManager.setCommunicationDevice(audioDeviceInfo);
                    }
                }
                audioManager.setMicrophoneMute(this.savedIsMicrophoneMute);
            } catch (Exception e) {
                this.logger.e(TAG, "restorePreviousAudioState: failed", e);
            }
        }
    }

    private final void savePreviousState() {
        AudioDeviceInfo communicationDevice;
        if (this.savedPreviousState) {
            return;
        }
        this.logger.v(TAG, "saving state");
        try {
            AudioManager audioManager = this.audioManager;
            this.savedIsMicrophoneMute = audioManager.isMicrophoneMute();
            communicationDevice = audioManager.getCommunicationDevice();
            boolean z = false;
            if (communicationDevice != null && communicationDevice.getType() == 2) {
                z = true;
            }
            this.savedIsSpeakerPhoneOn = z;
            this.savedPreviousState = true;
        } catch (Exception e) {
            this.logger.e(TAG, "savePreviousState: failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleSyncWithSystemCommunicationDevice() {
        if (this.isDestroyed) {
            return;
        }
        cancelScheduledSyncWithSystemCommunicationDevice();
        try {
            this.workerThreadHandler.postDelayed(this.syncWithSystemCommunicationDeviceRunnable, 2000L);
        } catch (Throwable th) {
            this.logger.d(TAG, "Can't schedule sync with system communication device", th);
        }
    }

    private final void scheduleTryToSetCommunicationDeviceAgain() {
        if (this.isDestroyed) {
            return;
        }
        cancelScheduledTrySetCommunicationDeviceAgain();
        this.logger.d(TAG, "Schedule try again with current device in 2000ms");
        try {
            this.workerThreadHandler.postDelayed(this.tryAgainRunnable, 2000L);
        } catch (Throwable th) {
            this.logger.e(TAG, "Unable to post try again runnable", th);
        }
    }

    private final void selectAudioDevice(CallsAudioDeviceInfo callsAudioDeviceInfo, String str) {
        this.logger.d(TAG, "Request to select devices " + callsAudioDeviceInfo + ", by " + str);
        this.deviceSwitchHelper.onDeviceSwitchRequested(callsAudioDeviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectAudioDeviceImpl(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        AudioDeviceInfo communicationDevice;
        cancelUtilizedDeviceTypeRecovery();
        this.logger.d(TAG, "Selecting " + callsAudioDeviceInfo);
        if (epx.f(this.usedDevice, callsAudioDeviceInfo)) {
            this.logger.d(TAG, "An attempt to select same device " + this.usedDevice + ", ignore");
            this.deviceSwitchHelper.onDeviceSwitched();
            return;
        }
        AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(callsAudioDeviceInfo);
        if (audioDeviceInfo == null) {
            this.logger.d(TAG, "No known android device matches requested device " + callsAudioDeviceInfo);
            this.audioManager.clearCommunicationDevice();
            this.deviceSwitchHelper.onDeviceSwitched();
            return;
        }
        if (callsAudioDeviceInfo.getDeviceType() == CallsAudioManager.AudioDeviceType.NONE) {
            this.logger.d(TAG, "Empty device type, clear communication device");
            this.audioManager.clearCommunicationDevice();
            reportCurrentCallsAudioDevice(callsAudioDeviceInfo);
            this.deviceSwitchHelper.onDeviceSwitched();
            return;
        }
        communicationDevice = this.audioManager.getCommunicationDevice();
        if (audioDeviceInfo.equals(communicationDevice)) {
            this.logger.d(TAG, "Device " + callsAudioDeviceInfo + " mapped to currently used communication device");
            handleCurrentCommunicationDevice(audioDeviceInfo);
            return;
        }
        this.logger.d(TAG, "Submit request to set current communication device to " + callsAudioDeviceInfo);
        try {
            this.logger.d(TAG, "Apply device " + callsAudioDeviceInfo + " (just a promise to use)");
            applyCurrentDevice(callsAudioDeviceInfo);
            if (setCommunicationDevice(audioDeviceInfo)) {
                return;
            }
            this.logger.d(TAG, "Can't set " + androidDeviceToString(audioDeviceInfo) + ": setCommunicationDevice() returned false");
            syncWithSystemCommunicationDevice();
        } catch (Throwable th) {
            this.logger.e(TAG, "Error setting communication device", new IllegalArgumentException("Proposed device was not able to set as current " + callsAudioDeviceInfo + " (" + androidDeviceToString(audioDeviceInfo) + "), details: " + getAudioManagerStateDetails(), th));
            syncWithSystemCommunicationDevice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAudioDevice(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        CallsAudioManager.AudioDeviceType deviceType;
        if (this.isDestroyed || (deviceType = this.usedDevice.getDeviceType()) == callsAudioDeviceInfo.getDeviceType()) {
            return;
        }
        CallsAudioManager.State state = this.state;
        if (state == CallsAudioManager.State.RINGING) {
            this.logger.d(TAG, "Avoid audio device update in state " + state);
            return;
        }
        boolean z = this.disabledBluetoothOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        this.disabledBluetoothOnce = z | (deviceType == audioDeviceType);
        boolean z2 = this.disabledSpeakerOnce;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
        this.disabledSpeakerOnce = z2 | (deviceType == audioDeviceType2);
        this.logger.d(TAG, "Set audio device by external request: " + callsAudioDeviceInfo);
        if (callsAudioDeviceInfo.oneOf$calls_audiomanager_release(audioDeviceType2, CallsAudioManager.AudioDeviceType.WIRED_HEADSET, CallsAudioManager.AudioDeviceType.EARPIECE, audioDeviceType)) {
            selectAudioDevice(callsAudioDeviceInfo, "user request");
        }
    }

    private final void setAudioManagerModeSafe(int i) {
        try {
            this.audioManager.setMode(i);
        } catch (Throwable th) {
            this.logger.reportError(TAG, "Can't set audio manager mode", th);
        }
    }

    private final boolean setCommunicationDevice(AudioDeviceInfo audioDeviceInfo) {
        boolean communicationDevice;
        if (audioDeviceInfo == null) {
            this.audioManager.clearCommunicationDevice();
            return true;
        }
        communicationDevice = this.audioManager.setCommunicationDevice(audioDeviceInfo);
        if (!communicationDevice) {
            return false;
        }
        scheduleTryToSetCommunicationDeviceAgain();
        return true;
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
        reportAudioDeviceOnMainThread(this.usedDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSpeakerEnabled(boolean z, boolean z2) {
        if (this.isDestroyed) {
            return;
        }
        this.logger.v(TAG, zy60.c("requested speaker enable=", " by video=", z, z2));
        if (!z) {
            selectAudioDevice(getPreferredAudioDevice(true, false), "set speaker disabled, state=" + this.state);
            return;
        }
        if (canSetSpeakerEnabled(z2)) {
            CallsAudioDeviceInfo firstOfType = firstOfType(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
            if (firstOfType != null) {
                selectAudioDevice(firstOfType, "set speaker enabled");
            } else {
                this.logger.e(TAG, "No speaker found");
            }
        }
    }

    private final void start() {
        if (this.isStarted) {
            this.logger.d(TAG, "Already started, ignore");
            return;
        }
        this.logger.d(TAG, "Starting...");
        this.isStarted = true;
        savePreviousState();
        requestAudioFocus();
        startTrackingAudioDevices();
        setAudioManagerModeSafe(3);
        selectAudioDevice(getPreferredAudioDevice(true, false), "start");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.oc9] */
    private final void startTrackingAudioDevices() {
        AudioManager audioManager = this.audioManager;
        audioManager.registerAudioDeviceCallback(this, this.workerThreadHandler);
        audioManager.addOnCommunicationDeviceChangedListener(new Executor() { // from class: xsna.oc9
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                CallsAudioManagerV3Impl.startTrackingAudioDevices$lambda$4$lambda$3(CallsAudioManagerV3Impl.this, runnable);
            }
        }, this);
        updateAvailableDeviceList$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTrackingAudioDevices$lambda$4$lambda$3(CallsAudioManagerV3Impl callsAudioManagerV3Impl, Runnable runnable) {
        callsAudioManagerV3Impl.workerThreadHandler.post(runnable);
    }

    private final void syncAudioDeviceList() {
        this.logger.d(TAG, b.b(this.audioDeviceSyncCount, " Sync audio device list (", "). List before update: ", j5g.g0(this.callsAudioDevices, null, null, null, 0, new izs<CallsAudioDeviceInfo, CharSequence>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$syncAudioDeviceList$1
            @Override // xsna.izs
            public final CharSequence invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) {
                return callsAudioDeviceInfo.toString();
            }
        }, 31)));
        this.audioDeviceByCallsDevice.clear();
        try {
            List<Pair<CallsAudioDeviceInfo, AudioDeviceInfo>> availableDevices = getAvailableDevices();
            List<Pair<CallsAudioDeviceInfo, AudioDeviceInfo>> list = availableDevices;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((CallsAudioDeviceInfo) ((Pair) it.next()).i());
            }
            pn00.p(this.audioDeviceByCallsDevice, availableDevices);
            reportNewDeviceList(arrayList);
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while getting available communication devices", th);
        }
        this.logger.d(TAG, b.b(this.audioDeviceSyncCount, " Sync audio device list (", "). List after update: ", j5g.g0(this.callsAudioDevices, null, null, null, 0, new izs<CallsAudioDeviceInfo, CharSequence>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$syncAudioDeviceList$2
            @Override // xsna.izs
            public final CharSequence invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) {
                return callsAudioDeviceInfo.toString();
            }
        }, 31)));
        this.audioDeviceSyncCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncWithSystemCommunicationDevice() {
        AudioDeviceInfo communicationDevice;
        if (this.isDestroyed) {
            return;
        }
        this.logger.d(TAG, "Try to recover actual device audio device state");
        try {
            communicationDevice = this.audioManager.getCommunicationDevice();
            handleCurrentCommunicationDevice(communicationDevice);
        } catch (Throwable unused) {
            this.logger.e(TAG, "Can't recover current communication device from system state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trySetCommunicationDeviceAgain() {
        try {
            trySetCommunicationDeviceAgainUnsafe();
        } catch (Throwable th) {
            this.logger.e(TAG, "Failed to set communication device again", th);
            syncWithSystemCommunicationDevice();
        }
    }

    private final void trySetCommunicationDeviceAgainUnsafe() {
        boolean communicationDevice;
        if (this.isDestroyed) {
            return;
        }
        this.logger.d(TAG, "Try again with " + androidDeviceToString(getAudioDeviceInfo(this.usedDevice)));
        this.audioManager.clearCommunicationDevice();
        AudioDeviceInfo audioDeviceInfo = getAudioDeviceInfo(this.usedDevice);
        if (audioDeviceInfo == null) {
            this.logger.d(TAG, "No current device, ignore try again attempt, sync with system device instead");
            syncWithSystemCommunicationDevice();
            return;
        }
        communicationDevice = this.audioManager.setCommunicationDevice(audioDeviceInfo);
        if (communicationDevice) {
            this.logger.d(TAG, "Try again with " + androidDeviceToString(audioDeviceInfo) + " passed, wait for a system confirmation or rollback in 2000ms");
            scheduleSyncWithSystemCommunicationDevice();
            return;
        }
        this.logger.d(TAG, "Try again with " + androidDeviceToString(audioDeviceInfo) + " did fail. Sync with system device immediately");
        syncWithSystemCommunicationDevice();
    }

    private final boolean updateAvailableDeviceList(boolean z) {
        CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.WIRED_HEADSET;
        boolean z2 = firstOfType(audioDeviceType) != null;
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        boolean z3 = firstOfType(audioDeviceType2) != null;
        this.logger.d(TAG, zy60.c("update audio device list, had bt before=", ", had headphones before=", z3, z2));
        syncAudioDeviceList();
        Object obj = null;
        CallsAudioDeviceInfo firstOfType = !z2 ? firstOfType(audioDeviceType) : null;
        CallsAudioDeviceInfo firstOfType2 = !z3 ? firstOfType(audioDeviceType2) : null;
        Iterator<T> it = this.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f((CallsAudioDeviceInfo) next, this.usedDevice)) {
                obj = next;
                break;
            }
        }
        if (obj == null || z) {
            CallsAudioDeviceInfo preferredAudioDevice = getPreferredAudioDevice(true, !z);
            if (z) {
                this.logger.d(TAG, "Current device " + this.usedDevice + " replaced by " + preferredAudioDevice + " because of stop ringing");
            } else {
                this.logger.d(TAG, "Current device " + this.usedDevice + " disappeared, select " + preferredAudioDevice + " instead");
            }
            selectAudioDevice(preferredAudioDevice, zhy0.a("auto select. stop ringing=", z));
        } else {
            if (firstOfType != null && this.usedDevice.getDeviceType() != CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
                this.logger.d(TAG, "Wired headset did appear: " + firstOfType + ", let us try to select it");
                selectAudioDevice(firstOfType, "wired headset appeared");
                return true;
            }
            if (firstOfType2 != null && !this.usedDevice.getDeviceType().isHeadsetDevice()) {
                if (this.disabledBluetoothOnce && !this.disabledAudioDeviceUsagePolicy.isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType.BLUETOOTH)) {
                    this.logger.d(TAG, "Will not try to select bluetooth because user disable it once already");
                    return true;
                }
                this.logger.d(TAG, "Bluetooth headset did appear: " + firstOfType2 + ", let us try to select it");
                selectAudioDevice(firstOfType2, "bt headset appeared");
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean updateAvailableDeviceList$default(CallsAudioManagerV3Impl callsAudioManagerV3Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return callsAudioManagerV3Impl.updateAvailableDeviceList(z);
    }

    private final void updateProximityTrackingState(boolean z) {
        final boolean z2 = this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH || this.usedDevice.getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET || (z && !this.trackProximityWhenSpeakerEnabled);
        this.logger.v(TAG, zy60.c("proximity disabled? ", ", speaker? ", z2, z));
        this.mainHandler.post(new Runnable() { // from class: xsna.pc9
            @Override // java.lang.Runnable
            public final void run() {
                CallsAudioManagerV3Impl.updateProximityTrackingState$lambda$10(z2, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProximityTrackingState$lambda$10(boolean z, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        try {
            if (z) {
                callsAudioManagerV3Impl.proximityTracker.stopTrackingProximity();
            } else {
                callsAudioManagerV3Impl.proximityTracker.startTrackingProximity();
            }
        } catch (Throwable th) {
            callsAudioManagerV3Impl.logger.e(TAG, "Proximity tracker error", th);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void addOnAudioDeviceListChangeListener(final CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
        doOnOwnThread$default(this, "addOnAudioDeviceListChangeListener", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$addOnAudioDeviceListChangeListener$1
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
                CallsAudioManagerV3Impl.this.addOnAudioDeviceListChangeListenerImpl(onAudioDeviceListChangeListener);
            }
        }, null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void changeStateAsync(final CallsAudioManager.State state, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThread("changeStateAsync", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$changeStateAsync$1
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
                CallsAudioManagerV3Impl.this.changeState(state);
            }
        }, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public List<CallsAudioDeviceInfo> getAvailableAudioDevices() {
        return this.callsAudioDevices;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public CallsAudioDeviceInfo getCurrentDevice() {
        return this.usedDevice;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasBluetoothHeadsetAsync(final izs<? super Boolean, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        doOnOwnThread("hasBluetoothHeadsetAsync", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$hasBluetoothHeadsetAsync$1
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
                List list;
                Object obj;
                izs<Boolean, s3q0> izsVar3 = izsVar;
                list = this.callsAudioDevices;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((CallsAudioDeviceInfo) obj).getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH) {
                            break;
                        }
                    }
                }
                izsVar3.invoke(Boolean.valueOf(obj != null));
            }
        }, null, izsVar2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void hasWiredHeadsetAsync(final izs<? super Boolean, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        doOnOwnThread("hasWiredHeadsetAsync", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1
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
                List list;
                Object obj;
                izs<Boolean, s3q0> izsVar3 = izsVar;
                list = this.callsAudioDevices;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((CallsAudioDeviceInfo) obj).getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
                            break;
                        }
                    }
                }
                izsVar3.invoke(Boolean.valueOf(obj != null));
            }
        }, null, izsVar2);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public boolean isHeadsetConnected() {
        return this.usedDevice.getDeviceType().isHeadsetDevice();
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.logger.d(TAG, "Audio devices were added, update list");
        updateAvailableDeviceList$default(this, false, 1, null);
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.logger.d(TAG, "Audio devices were removed, update list");
        updateAvailableDeviceList$default(this, false, 1, null);
    }

    public void onCommunicationDeviceChanged(final AudioDeviceInfo audioDeviceInfo) {
        doOnOwnThread$default(this, "onCommunicationDeviceChanged", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$onCommunicationDeviceChanged$1
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
                CallsAudioDeviceInfo deviceForAndroidDevice;
                Logger logger;
                CharSequence productName;
                CallsAudioDeviceInfo callsAudioDeviceInfo;
                Logger logger2;
                CallsAudioManagerV3Impl.this.cancelScheduledSyncWithSystemCommunicationDevice();
                deviceForAndroidDevice = CallsAudioManagerV3Impl.this.getDeviceForAndroidDevice(audioDeviceInfo);
                if (deviceForAndroidDevice != null) {
                    CallsAudioManager.AudioDeviceType deviceType = deviceForAndroidDevice.getDeviceType();
                    CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.BLUETOOTH;
                    if (deviceType != audioDeviceType) {
                        callsAudioDeviceInfo = CallsAudioManagerV3Impl.this.usedDevice;
                        if (callsAudioDeviceInfo.getDeviceType() == audioDeviceType) {
                            logger2 = CallsAudioManagerV3Impl.this.logger;
                            AudioDeviceInfo audioDeviceInfo2 = audioDeviceInfo;
                            Integer valueOf = audioDeviceInfo2 != null ? Integer.valueOf(audioDeviceInfo2.getId()) : null;
                            AudioDeviceInfo audioDeviceInfo3 = audioDeviceInfo;
                            Integer valueOf2 = audioDeviceInfo3 != null ? Integer.valueOf(audioDeviceInfo3.getType()) : null;
                            AudioDeviceInfo audioDeviceInfo4 = audioDeviceInfo;
                            productName = audioDeviceInfo4 != null ? audioDeviceInfo4.getProductName() : null;
                            StringBuilder a = wr.a(valueOf, "Unexpected device reported by system ", valueOf2, StringUtils.PROCESS_POSTFIX_DELIMITER, StringUtils.PROCESS_POSTFIX_DELIMITER);
                            a.append((Object) productName);
                            logger2.d(CallsAudioManagerV3Impl.TAG, a.toString());
                            CallsAudioManagerV3Impl.this.scheduleSyncWithSystemCommunicationDevice();
                            return;
                        }
                    }
                }
                CallsAudioManagerV3Impl.this.cancelScheduledTrySetCommunicationDeviceAgain();
                logger = CallsAudioManagerV3Impl.this.logger;
                AudioDeviceInfo audioDeviceInfo5 = audioDeviceInfo;
                Integer valueOf3 = audioDeviceInfo5 != null ? Integer.valueOf(audioDeviceInfo5.getId()) : null;
                AudioDeviceInfo audioDeviceInfo6 = audioDeviceInfo;
                Integer valueOf4 = audioDeviceInfo6 != null ? Integer.valueOf(audioDeviceInfo6.getType()) : null;
                AudioDeviceInfo audioDeviceInfo7 = audioDeviceInfo;
                productName = audioDeviceInfo7 != null ? audioDeviceInfo7.getProductName() : null;
                StringBuilder a2 = wr.a(valueOf3, "Communication device did change to ", valueOf4, StringUtils.PROCESS_POSTFIX_DELIMITER, StringUtils.PROCESS_POSTFIX_DELIMITER);
                a2.append((Object) productName);
                logger.d(CallsAudioManagerV3Impl.TAG, a2.toString());
                CallsAudioManagerV3Impl.this.handleCurrentCommunicationDevice(audioDeviceInfo);
            }
        }, null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void releaseAsync(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThread("releaseAsync", new CallsAudioManagerV3Impl$releaseAsync$1(this), gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void removeOnAudioDeviceListChangeListener(final CallsAudioManager.OnAudioDeviceListChangeListener onAudioDeviceListChangeListener) {
        doOnOwnThread$default(this, "removeOnAudioDeviceListChangeListener", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$removeOnAudioDeviceListChangeListener$1
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
                CallsAudioManagerV3Impl.this.removeOnAudioDeviceListChangeListenerImpl(onAudioDeviceListChangeListener);
            }
        }, null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void requestAudioFocusAsync() {
        doOnOwnThread("requestAudioFocus", new CallsAudioManagerV3Impl$requestAudioFocusAsync$1(this), new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$requestAudioFocusAsync$2
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
                logger = CallsAudioManagerV3Impl.this.logger;
                logger.d(CallsAudioManagerV3Impl.TAG, "audio focus request proceeded");
            }
        }, new izs<Throwable, s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$requestAudioFocusAsync$3
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
                logger = CallsAudioManagerV3Impl.this.logger;
                logger.e(CallsAudioManagerV3Impl.TAG, "audio focus request failed", th);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceAsync(final CallsAudioDeviceInfo callsAudioDeviceInfo, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThread("setAudioDeviceAsync", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setAudioDeviceAsync$1
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
                CallsAudioManagerV3Impl.this.setAudioDevice(callsAudioDeviceInfo);
            }
        }, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setAudioDeviceTypeAsync(final CallsAudioManager.AudioDeviceType audioDeviceType, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThread("setAudioDeviceAsync", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setAudioDeviceTypeAsync$1
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
                CallsAudioDeviceInfo firstOfType;
                Logger logger;
                firstOfType = CallsAudioManagerV3Impl.this.firstOfType(audioDeviceType);
                if (firstOfType != null) {
                    CallsAudioManagerV3Impl.this.setAudioDevice(firstOfType);
                    return;
                }
                logger = CallsAudioManagerV3Impl.this.logger;
                logger.e(CallsAudioManagerV3Impl.TAG, "Device not found for type " + audioDeviceType);
            }
        }, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setOnAudioDeviceChangeListener(final CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        doOnOwnThread$default(this, "setOnAudioDeviceChangeListener", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setOnAudioDeviceChangeListener$1
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
                CallsAudioManagerV3Impl.this.setOnAudioDeviceChangeListenerImpl(onAudioDeviceInfoChangeListener);
            }
        }, null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void setSpeakerEnabledAsync(final boolean z, final boolean z2, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        doOnOwnThread("setSpeakerEnabledAsync", new gzs<s3q0>() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl$setSpeakerEnabledAsync$1
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
                CallsAudioManagerV3Impl.this.setSpeakerEnabled(z, z2);
            }
        }, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager
    public void notifyBluetoothPermissionGranted() {
    }
}
