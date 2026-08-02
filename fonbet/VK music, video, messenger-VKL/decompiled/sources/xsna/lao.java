package xsna;

import one.video.player.model.VideoContentType;

/* compiled from: DownloadTracker.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class lao {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VideoContentType.values().length];
        try {
            iArr[VideoContentType.MP4.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoContentType.HLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoContentType.DASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VideoContentType.RTMP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
