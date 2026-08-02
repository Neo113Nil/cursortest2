package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: DiscoveryRedesign3DotActionsProvider.kt */
/* loaded from: classes2.dex */
public final class lan {

    /* compiled from: DiscoveryRedesign3DotActionsProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoScreenMode.values().length];
            try {
                iArr[VideoScreenMode.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoScreenMode.FULLSCREEN_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if (videoFile.v() && videoFile.l6() != 6) {
            return false;
        }
        VideoScreenMode videoScreenMode = s6s0Var.u;
        int i = videoScreenMode == null ? -1 : a.$EnumSwitchMapping$0[videoScreenMode.ordinal()];
        if (i == 1) {
            return com.vk.toggle.d.u().a;
        }
        if (i == 2) {
            return com.vk.toggle.d.v().a;
        }
        if (i != 3) {
            return false;
        }
        return com.vk.toggle.d.w().a;
    }

    public static final boolean b(s6s0 s6s0Var) {
        boolean a2;
        VideoScreenMode videoScreenMode = s6s0Var.u;
        int i = videoScreenMode == null ? -1 : a.$EnumSwitchMapping$0[videoScreenMode.ordinal()];
        if (i == 1) {
            VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
            videoFeatures.getClass();
            a2 = com.vk.toggle.b.A.a(videoFeatures);
        } else if (i == 2) {
            VideoFeatures videoFeatures2 = VideoFeatures.NEW_FULLSCREEN_REDESIGN_HORIZONTAL;
            videoFeatures2.getClass();
            a2 = com.vk.toggle.b.A.a(videoFeatures2);
        } else if (i != 3) {
            a2 = false;
        } else {
            VideoFeatures videoFeatures3 = VideoFeatures.NEW_FULLSCREEN_REDESIGN_VERTICAL;
            videoFeatures3.getClass();
            a2 = com.vk.toggle.b.A.a(videoFeatures3);
        }
        return !a2;
    }
}
