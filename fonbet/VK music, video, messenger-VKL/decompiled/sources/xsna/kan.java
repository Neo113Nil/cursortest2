package xsna;

import com.vk.libvideo.models.offline.VideoScreenMode;

/* compiled from: DiscoveryRedesign3DotActionsProvider.kt */
/* loaded from: classes2.dex */
public final class kan {

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
                iArr[VideoScreenMode.FULLSCREEN_PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static boolean a(s6s0 s6s0Var) {
        VideoScreenMode videoScreenMode = s6s0Var.u;
        int i = videoScreenMode == null ? -1 : a.$EnumSwitchMapping$0[videoScreenMode.ordinal()];
        return i != 2 ? (i == 3 && com.vk.toggle.d.v().d) ? false : true : !com.vk.toggle.d.w().d;
    }
}
