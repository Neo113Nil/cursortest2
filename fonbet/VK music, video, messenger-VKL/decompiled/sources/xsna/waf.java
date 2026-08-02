package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;

/* compiled from: ClipsUiTracker.kt */
/* loaded from: classes17.dex */
public final class waf implements ilh0 {

    /* compiled from: ClipsUiTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsCoreNavStat$EventScreen.values().length];
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.DIALOG_MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.ilh0
    public final void a(ClipFeedTab clipFeedTab, SdkVideoFile sdkVideoFile) {
        int i = ClipFeedListFragment.a2;
        fsk0 fsk0Var = qsk0.a;
        if (fsk0Var == null) {
            return;
        }
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen uiTrackingScreen = t1q0Var.b;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = null;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = uiTrackingScreen != null ? uiTrackingScreen.a : null;
        int i2 = mobileOfficialAppsCoreNavStat$EventScreen2 == null ? -1 : a.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen2.ordinal()];
        if (i2 == -1 || i2 == 1 || i2 == 2) {
            UiTrackingScreen b = t1q0Var.b();
            if (b != null) {
                mobileOfficialAppsCoreNavStat$EventScreen = b.a;
            }
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen = mobileOfficialAppsCoreNavStat$EventScreen2;
        }
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.OTHER;
        }
        new iof(mobileOfficialAppsCoreNavStat$EventScreen, new SchemeStat$TypeClipViewerItem(fzc.b(clipFeedTab), SchemeStat$TypeClipViewerItem.EventType.OPEN_FULLSCREEN, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsOpenFullscreenItem(sdkVideoFile.r(), Long.valueOf(sdkVideoFile.I0().b), Long.valueOf(sdkVideoFile.o0()), null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741788, null), fsk0Var).q();
    }
}
