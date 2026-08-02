package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ClipsCameraAnalyticsDelegate.kt */
/* loaded from: classes16.dex */
public final class vkd {
    public final lbk a;

    public vkd(lbk lbkVar) {
        this.a = lbkVar;
    }

    public final void a(MobileOfficialAppsClipsStat$TypeClipDraft mobileOfficialAppsClipsStat$TypeClipDraft) {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        kbk context = this.a.getContext();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        int i = context != null ? context.b : -1;
        if (context == null || (creationEntryPoint = context.a) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        new xxd(c, new MobileOfficialAppsClipsStat$ClipsCreateContext(i, creationEntryPoint), mobileOfficialAppsClipsStat$TypeClipDraft).q();
    }
}
