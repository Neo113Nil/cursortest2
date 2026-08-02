package xsna;

import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.tracker.VideoPlayerMode;

/* compiled from: VideoPlayerModeAnalytics.kt */
/* loaded from: classes3.dex */
public final class e4t0 {
    public static VideoPlayerMode a;
    public static String b;

    /* compiled from: VideoPlayerModeAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPlayerMode.values().length];
            try {
                iArr[VideoPlayerMode.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPlayerMode.DISCOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPlayerMode.FULLSCREEN_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoPlayerMode.FULLSCREEN_LANDSCAPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoPlayerMode.MINIMIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoPlayerMode.PIP_EXTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoPlayerMode.PIP_INTERNAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoPlayerMode.INVISIBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoPlayerMode.CHROMECAST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoPlayerMode.DLNA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(VideoPlayerMode videoPlayerMode, yg5 yg5Var) {
        if (yg5Var instanceof VideoAutoPlay) {
            i0q0.j(new tou(5, videoPlayerMode, yg5Var));
        }
    }
}
