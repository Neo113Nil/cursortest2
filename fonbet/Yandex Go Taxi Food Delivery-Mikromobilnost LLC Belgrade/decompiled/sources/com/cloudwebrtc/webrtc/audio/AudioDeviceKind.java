package com.cloudwebrtc.webrtc.audio;

import defpackage.df3;
import defpackage.ef3;
import defpackage.ff3;
import defpackage.gf3;
import defpackage.hf3;

/* loaded from: classes10.dex */
public enum AudioDeviceKind {
    BLUETOOTH("bluetooth", df3.class),
    WIRED_HEADSET("wired-headset", gf3.class),
    SPEAKER("speaker", ff3.class),
    EARPIECE("earpiece", ef3.class);

    public final Class<? extends hf3> audioDeviceClass;
    public final String typeName;

    AudioDeviceKind(String str, Class cls) {
        this.typeName = str;
        this.audioDeviceClass = cls;
    }

    public static AudioDeviceKind fromAudioDevice(hf3 hf3Var) {
        for (AudioDeviceKind audioDeviceKind : values()) {
            if (audioDeviceKind.audioDeviceClass.equals(hf3Var.getClass())) {
                return audioDeviceKind;
            }
        }
        return null;
    }

    public static AudioDeviceKind fromTypeName(String str) {
        for (AudioDeviceKind audioDeviceKind : values()) {
            if (audioDeviceKind.typeName.equals(str)) {
                return audioDeviceKind;
            }
        }
        return null;
    }
}
