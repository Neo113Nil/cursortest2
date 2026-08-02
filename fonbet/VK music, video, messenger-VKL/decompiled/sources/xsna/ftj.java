package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CopyLink.kt */
/* loaded from: classes2.dex */
public final class ftj extends h6s0 {
    public static final ftj c = new ftj(VideoBottomSheetOptions.COPY_LINK.ordinal());

    /* compiled from: CopyLink.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoScreenMode.values().length];
            try {
                iArr[VideoScreenMode.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoScreenMode.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoScreenMode.FULLSCREEN_PORTRAIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoScreenMode.INVISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        boolean z = false;
        boolean z2 = (hg10.n(s6s0Var) || hg10.k(s6s0Var)) && videoFile.Fa();
        if (!hg10.u(s6s0Var) && !egd.b(videoFile) && hg10.m(s6s0Var) && z2) {
            z = true;
        }
        if (videoFile.o0() == 0 || !z || fxc0.B().b0().e(videoFile) || videoFile.k1() != 0) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_copy_outline_28, R.string.copy_link, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode;
        com.vk.video.ui.share.api.b bVar;
        VideoFile videoFile = s6s0Var.a;
        VideoScreenMode videoScreenMode = s6s0Var.u;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, null, null, 56, null);
        MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick.EventType eventType = MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick.EventType.COPY_LINK;
        int i = videoScreenMode == null ? -1 : a.$EnumSwitchMapping$0[videoScreenMode.ordinal()];
        if (i == -1) {
            mobileOfficialAppsVideoStat$TypeScreenMode = null;
        } else if (i == 1) {
            mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY;
        } else if (i == 2) {
            mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.PREVIEW;
        } else if (i == 3) {
            mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE;
        } else if (i == 4) {
            mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_PORTRAIT;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.INVISIBLE;
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick(eventType, mobileOfficialAppsVideoStat$TypeScreenMode), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c2, b, uzp0Var.a).q();
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        String a2 = fss0.a(videoFile);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures) && (bVar = s6s0Var.x) != null) {
            a2 = bVar.c(a2);
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(a2, a2));
        cvk.u(R.string.link_copied, false);
    }
}
