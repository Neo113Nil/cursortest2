package xsna;

import ru.ok.android.webrtc.videotracks.VideoTrackType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class gxy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VideoTrackType.values().length];
        a = iArr;
        try {
            iArr[VideoTrackType.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[VideoTrackType.SCREEN_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[VideoTrackType.ANIMOJI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
