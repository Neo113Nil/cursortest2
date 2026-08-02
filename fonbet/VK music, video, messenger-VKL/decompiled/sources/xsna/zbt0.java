package xsna;

import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;

/* compiled from: VideoRelatedVideosGetNext.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class zbt0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VideoRelatedVideosLoopMode.values().length];
        try {
            iArr[VideoRelatedVideosLoopMode.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoRelatedVideosLoopMode.ALL_VIDEOS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoRelatedVideosLoopMode.SINGLE_VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
