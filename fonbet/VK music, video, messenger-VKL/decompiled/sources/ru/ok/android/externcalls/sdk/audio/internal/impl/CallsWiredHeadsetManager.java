package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.view.KeyEvent;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.Logger;
import xsna.epx;
import xsna.xe9;
import xsna.zcl;
import xsna.zr;

/* compiled from: CallsWiredHeadsetManager.kt */
/* loaded from: classes9.dex */
public final class CallsWiredHeadsetManager {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "CallsWiredHeadsetManager";
    private final AudioManager audioManager;
    private final CallsAudioManagerV2Impl callsAudioManager;
    private final Context context;
    private final Logger logger;
    private volatile WiredHeadsetState wiredHeadsetState = WiredHeadsetState.None.INSTANCE;
    private final BroadcastReceiver headsetReceiver = new BroadcastReceiver() { // from class: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsWiredHeadsetManager$headsetReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CallsWiredHeadsetManager.this.onReceiveBroadcast(this, intent);
        }
    };

    /* compiled from: CallsWiredHeadsetManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: CallsWiredHeadsetManager.kt */
    public interface WiredHeadsetState {

        /* compiled from: CallsWiredHeadsetManager.kt */
        public static final class None implements WiredHeadsetState {
            public static final None INSTANCE = new None();

            private None() {
            }

            public String toString() {
                return "Uninitialized";
            }
        }

        /* compiled from: CallsWiredHeadsetManager.kt */
        public static final class Plugged implements WiredHeadsetState {
            private final String name;

            /* JADX WARN: Multi-variable type inference failed */
            public Plugged() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Plugged copy$default(Plugged plugged, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = plugged.name;
                }
                return plugged.copy(str);
            }

            public final String component1() {
                return this.name;
            }

            public final Plugged copy(String str) {
                return new Plugged(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Plugged) && epx.f(this.name, ((Plugged) obj).name);
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            public String toString() {
                return zr.a("Plugged(name=", this.name, ")");
            }

            public Plugged(String str) {
                this.name = str;
            }

            public /* synthetic */ Plugged(String str, int i, zcl zclVar) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: CallsWiredHeadsetManager.kt */
        public static final class Unplugged implements WiredHeadsetState {
            public static final Unplugged INSTANCE = new Unplugged();

            private Unplugged() {
            }

            public String toString() {
                return "Unplugged";
            }
        }
    }

    public CallsWiredHeadsetManager(Context context, CallsAudioManagerV2Impl callsAudioManagerV2Impl, Logger logger) {
        this.context = context;
        this.callsAudioManager = callsAudioManagerV2Impl;
        this.logger = logger;
        this.audioManager = (AudioManager) context.getSystemService("audio");
    }

    @TargetApi(23)
    private final String getDeviceNameByPortName(String str, AudioDeviceInfo[] audioDeviceInfoArr) {
        String str2 = CallsAudioDeviceInfo.WIRED_HEADPHONES;
        if (str != null) {
            this.logger.v(LOG_TAG, "Looking for a used wired device using port name ".concat(str));
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (epx.f(audioDeviceInfo.getProductName(), str)) {
                    int type = audioDeviceInfo.getType();
                    if (type == 3) {
                        str2 = CallsAudioDeviceInfo.WIRED_HEADSET;
                    } else if (type == 11 || type == 22) {
                        str2 = CallsAudioDeviceInfo.USB_HEADSET;
                    }
                    this.logger.v(LOG_TAG, "Matching device found " + audioDeviceInfo);
                    return str2;
                }
            }
        }
        return CallsAudioDeviceInfo.WIRED_HEADPHONES;
    }

    private final WiredHeadsetState getWiredHeadsetStateSdk27() {
        return this.audioManager.isWiredHeadsetOn() ? new WiredHeadsetState.Plugged("") : WiredHeadsetState.Unplugged.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r6 == false) goto L35;
     */
    @TargetApi(28)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WiredHeadsetState getWiredHeadsetStateSdk28(String str) {
        String deviceNameByPortName;
        try {
            AudioDeviceInfo[] devices = this.audioManager.getDevices(2);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type == 3) {
                    z2 = true;
                } else if (type == 4) {
                    z3 = true;
                } else if (type == 11 || type == 22) {
                    z = true;
                }
                if (z && z2 && z3) {
                    break;
                }
            }
            this.logger.v(LOG_TAG, "Wired device connectivity check: usb=" + z + " headset=" + z2 + " phones=" + z3);
            if (!z && !z3 && !z2) {
                return WiredHeadsetState.Unplugged.INSTANCE;
            }
            if (z) {
                deviceNameByPortName = getDeviceNameByPortName(str, devices);
                return new WiredHeadsetState.Plugged(deviceNameByPortName);
            }
            deviceNameByPortName = z ? CallsAudioDeviceInfo.USB_HEADSET : z2 ? CallsAudioDeviceInfo.WIRED_HEADSET : CallsAudioDeviceInfo.WIRED_HEADPHONES;
            return new WiredHeadsetState.Plugged(deviceNameByPortName);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't detect audio device name", th);
            return WiredHeadsetState.Unplugged.INSTANCE;
        }
    }

    private final void handleHeadsetPlugAction(Intent intent) {
        int intExtra = intent.getIntExtra("state", -1);
        if (intExtra == 0 || intExtra == 1) {
            updateWiredHeadsetState(intExtra == 1, intent);
        } else {
            this.logger.e(LOG_TAG, "unknown headset state received");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReceiveBroadcast(BroadcastReceiver broadcastReceiver, Intent intent) {
        KeyEvent keyEvent;
        this.logger.v(LOG_TAG, "CAM got " + intent);
        String action = intent.getAction();
        if ("android.intent.action.HEADSET_PLUG".equals(action)) {
            handleHeadsetPlugAction(intent);
            return;
        }
        if ("android.intent.action.MEDIA_BUTTON".equals(action) && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 5 || keyCode == 6 || keyCode == 79 || keyCode == 126 || keyCode == 127) {
                try {
                    broadcastReceiver.abortBroadcast();
                } catch (Exception e) {
                    this.logger.e(LOG_TAG, "onReceiveBroadcast: failed to abort broadcast, e: " + e);
                }
            }
        }
    }

    private final void updateWiredHeadsetState(boolean z, Intent intent) {
        String stringExtra = intent.getStringExtra("name");
        String stringExtra2 = intent.getStringExtra("portName");
        boolean z2 = intent.getIntExtra("microphone", 0) == 1;
        if (z) {
            Logger logger = this.logger;
            StringBuilder a = xe9.a("Wired device plugged: name=", stringExtra, " port=", stringExtra2, " hasMic=");
            a.append(z2);
            logger.v(LOG_TAG, a.toString());
        } else {
            Logger logger2 = this.logger;
            StringBuilder a2 = xe9.a("Wired device unplugged: name=", stringExtra, " port=", stringExtra2, " hasMic=");
            a2.append(z2);
            logger2.v(LOG_TAG, a2.toString());
        }
        if (!z) {
            stringExtra2 = null;
        }
        this.wiredHeadsetState = getWiredHeadsetStateSdk28(stringExtra2);
        if (this.wiredHeadsetState instanceof WiredHeadsetState.Plugged) {
            this.callsAudioManager.setSpeakerEnabled$calls_audiomanager_release(false, false);
        } else {
            CallsAudioManagerV2Impl.selectPreferredAudioDevice$calls_audiomanager_release$default(this.callsAudioManager, false, 1, null);
        }
    }

    public final String getConnectedDeviceName() {
        WiredHeadsetState wiredHeadsetState = this.wiredHeadsetState;
        return wiredHeadsetState instanceof WiredHeadsetState.Plugged ? ((WiredHeadsetState.Plugged) wiredHeadsetState).getName() : "";
    }

    public final boolean isWiredHeadsetPlugged() {
        return this.wiredHeadsetState instanceof WiredHeadsetState.Plugged;
    }

    public final void start() {
        this.logger.v(LOG_TAG, "start tracking headset");
        if (!(this.wiredHeadsetState instanceof WiredHeadsetState.None)) {
            this.logger.e(LOG_TAG, "already started, ignore");
        } else {
            this.wiredHeadsetState = WiredHeadsetState.Unplugged.INSTANCE;
            this.context.registerReceiver(this.headsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"), null, this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release());
        }
    }

    public final void stop() {
        this.logger.v(LOG_TAG, "stop tracking headset");
        if (this.wiredHeadsetState instanceof WiredHeadsetState.None) {
            this.logger.e(LOG_TAG, "already stopped, ignore");
        } else {
            this.wiredHeadsetState = WiredHeadsetState.None.INSTANCE;
            this.context.unregisterReceiver(this.headsetReceiver);
        }
    }
}
