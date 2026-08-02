package ru.ok.android.webrtc.protocol.impl.utils;

import ru.ok.android.webrtc.protocol.RtcFormat;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RtcFormat.values().length];
        a = iArr;
        try {
            iArr[RtcFormat.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[RtcFormat.BINARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
