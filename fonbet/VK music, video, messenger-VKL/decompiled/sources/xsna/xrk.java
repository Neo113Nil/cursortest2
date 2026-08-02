package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.api.minimizable.TypeScreen;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DIscoveryBottomSheetActionsTracker.kt */
/* loaded from: classes2.dex */
public final class xrk {

    /* compiled from: DIscoveryBottomSheetActionsTracker.kt */
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
            try {
                iArr[VideoScreenMode.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoScreenMode.INVISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(hfs0 hfs0Var, VideoFile videoFile, DiscoveryAction discoveryAction, boolean z, VideoScreenMode videoScreenMode) {
        TypeScreen typeScreen;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        if (videoFile.C2()) {
            return;
        }
        int i = videoScreenMode == null ? -1 : a.$EnumSwitchMapping$0[videoScreenMode.ordinal()];
        if (i == -1) {
            typeScreen = null;
        } else if (i == 1) {
            typeScreen = TypeScreen.DISCOVERY;
        } else if (i == 2) {
            typeScreen = TypeScreen.FULLSCREEN_LANDSCAPE;
        } else if (i == 3) {
            typeScreen = TypeScreen.FULLSCREEN_PORTRAIT;
        } else if (i == 4) {
            typeScreen = TypeScreen.PREVIEW;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            typeScreen = TypeScreen.INVISIBLE;
        }
        if (typeScreen == null) {
            return;
        }
        if (z) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
        } else {
            UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
            if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.OTHER;
            }
        }
        hfs0Var.a(discoveryAction, new ai90(videoFile, typeScreen, mobileOfficialAppsCoreNavStat$EventScreen.name()));
    }
}
