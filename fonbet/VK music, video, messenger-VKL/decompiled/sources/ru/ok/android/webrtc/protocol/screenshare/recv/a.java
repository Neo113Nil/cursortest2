package ru.ok.android.webrtc.protocol.screenshare.recv;

import ru.ok.android.webrtc.protocol.screenshare.Codec;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Codec.values().length];
        a = iArr;
        try {
            iArr[Codec.VP9.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Codec.VP8.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
