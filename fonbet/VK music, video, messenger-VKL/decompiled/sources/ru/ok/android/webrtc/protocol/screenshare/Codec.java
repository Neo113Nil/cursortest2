package ru.ok.android.webrtc.protocol.screenshare;

import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public enum Codec {
    VP8((byte) 0),
    VP9((byte) 1);

    public final byte encodedValue;

    Codec(byte b) {
        this.encodedValue = b;
    }

    @Nullable
    public static Codec safeValueOf(int i) {
        for (Codec codec : values()) {
            if (codec.encodedValue == i) {
                return codec;
            }
        }
        return null;
    }
}
