package ru.ok.android.externcalls.sdk.audio;

import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import xsna.epx;
import xsna.rl3;
import xsna.zcl;

/* compiled from: CallsAudioDeviceInfo.kt */
/* loaded from: classes11.dex */
public final class CallsAudioDeviceInfo {
    public static final String BLUETOOTH = "wireless headset";
    public static final String EARPIECE = "earpiece";
    public static final String NO_NAME_DEVICE = "";
    public static final String SPEAKERPHONE = "speakerphone";
    public static final String USB_HEADSET = "usb headset";
    public static final String WIRED_HEADPHONES = "wired headphones";
    public static final String WIRED_HEADSET = "wired headset";
    private final CallsAudioManager.AudioDeviceType deviceType;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final CallsAudioDeviceInfo NONE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");

    /* compiled from: CallsAudioDeviceInfo.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CallsAudioDeviceInfo getNONE() {
            return CallsAudioDeviceInfo.NONE;
        }

        private Companion() {
        }
    }

    public CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType audioDeviceType, String str) {
        this.deviceType = audioDeviceType;
        this.name = str;
    }

    public static /* synthetic */ CallsAudioDeviceInfo copy$default(CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioManager.AudioDeviceType audioDeviceType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            audioDeviceType = callsAudioDeviceInfo.deviceType;
        }
        if ((i & 2) != 0) {
            str = callsAudioDeviceInfo.name;
        }
        return callsAudioDeviceInfo.copy(audioDeviceType, str);
    }

    public final CallsAudioManager.AudioDeviceType component1() {
        return this.deviceType;
    }

    public final String component2() {
        return this.name;
    }

    public final CallsAudioDeviceInfo copy(CallsAudioManager.AudioDeviceType audioDeviceType, String str) {
        return new CallsAudioDeviceInfo(audioDeviceType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsAudioDeviceInfo)) {
            return false;
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) obj;
        return this.deviceType == callsAudioDeviceInfo.deviceType && epx.f(this.name, callsAudioDeviceInfo.name);
    }

    public final CallsAudioManager.AudioDeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.deviceType.hashCode() * 31);
    }

    public final boolean oneOf$calls_audiomanager_release(CallsAudioManager.AudioDeviceType... audioDeviceTypeArr) {
        return rl3.G(audioDeviceTypeArr, this.deviceType);
    }

    public String toString() {
        return "CallsAudioDeviceInfo(deviceType=" + this.deviceType + ", name=" + this.name + ")";
    }
}
