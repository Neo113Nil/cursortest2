package defpackage;

import com.ybsdk.feature.videoplayer.api.VideoPlayer$RepeatMode;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class moo {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VideoPlayer$RepeatMode.values().length];
        try {
            iArr[VideoPlayer$RepeatMode.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoPlayer$RepeatMode.ONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoPlayer$RepeatMode.ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
