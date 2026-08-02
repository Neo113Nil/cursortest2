package xsna;

import one.video.cast.model.VideoType;

/* compiled from: ContentTypeGetter.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class nlj {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VideoType.values().length];
        try {
            iArr[VideoType.DASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoType.HLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoType.LIVE_HLS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VideoType.MP4.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
