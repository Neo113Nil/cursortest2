package com.cloudwebrtc.webrtc.audio;

import android.media.AudioDeviceInfo;
import defpackage.g8e;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class AudioUtils {
    private static final String TAG = "AudioUtils";

    public static Integer getAudioAttributesContentTypeFromString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static Integer getAudioAttributesUsageTypeForString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static String getAudioDeviceId(AudioDeviceInfo audioDeviceInfo) {
        String address = audioDeviceInfo.getAddress();
        String str = "" + audioDeviceInfo.getId();
        if (audioDeviceInfo.getType() == 15) {
            str = g8e.o("microphone-", address);
        }
        if (audioDeviceInfo.getType() == 3) {
            str = "wired-headset";
        }
        return audioDeviceInfo.getType() == 7 ? "bluetooth" : str;
    }

    public static String getAudioDeviceLabel(AudioDeviceInfo audioDeviceInfo) {
        String address = audioDeviceInfo.getAddress();
        String charSequence = audioDeviceInfo.getProductName().toString();
        if (audioDeviceInfo.getType() == 15) {
            charSequence = oyr.p("Built-in Microphone (", address, Extension.C_BRAKE);
        }
        if (audioDeviceInfo.getType() == 3) {
            charSequence = "Wired Headset Microphone";
        }
        return audioDeviceInfo.getType() == 7 ? audioDeviceInfo.getProductName().toString() : charSequence;
    }

    public static String getAudioGroupId(AudioDeviceInfo audioDeviceInfo) {
        String str = "" + audioDeviceInfo.getType();
        if (audioDeviceInfo.getType() == 15) {
            str = "microphone";
        }
        if (audioDeviceInfo.getType() == 3) {
            str = "wired-headset";
        }
        return audioDeviceInfo.getType() == 7 ? "bluetooth" : str;
    }

    public static Integer getAudioModeForString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Integer getFocusModeForString(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1600850485:
                if (str.equals("gainTransient")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -1587200749:
                if (str.equals("gainTransientExclusive")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case -973361293:
                if (str.equals("gainTransientMayDuck")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 3165055:
                if (str.equals("gain")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 3327779:
                if (str.equals("loss")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
        }
        return null;
    }

    public static Integer getStreamTypeForString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }
}
