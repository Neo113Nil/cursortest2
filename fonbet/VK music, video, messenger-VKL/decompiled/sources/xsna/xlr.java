package xsna;

import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class xlr implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ VkOnboardingHighlighter c;
    public final /* synthetic */ FirstPinnedTabLayoutVh d;
    public final /* synthetic */ int e;

    public xlr(FirstPinnedTabLayout firstPinnedTabLayout, VkOnboardingHighlighter vkOnboardingHighlighter, FirstPinnedTabLayoutVh firstPinnedTabLayoutVh, int i) {
        this.b = firstPinnedTabLayout;
        this.c = vkOnboardingHighlighter;
        this.d = firstPinnedTabLayoutVh;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        UIBlockHint uIBlockHint;
        VkOnboardingHighlighter vkOnboardingHighlighter = this.c;
        if (vkOnboardingHighlighter != null) {
            vkOnboardingHighlighter.c(false);
        }
        SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
        SchemeStat$EventItem schemeStat$EventItem2 = FirstPinnedTabLayoutVh.F;
        CommonOnboardingStat$TypeOnboardingEvent.OnboardingType onboardingType = FirstPinnedTabLayoutVh.G;
        CommonOnboardingStat$TypeOnboardingEvent.EventType eventType = CommonOnboardingStat$TypeOnboardingEvent.EventType.CLICK;
        UIBlockCatalog uIBlockCatalog = this.d.z;
        String str = (uIBlockCatalog == null || (arrayList = uIBlockCatalog.A) == null || (uIBlock = arrayList.get(this.e)) == null || (uIBlockHint = uIBlock.j) == null) ? null : uIBlockHint.q;
        if (str == null) {
            str = "";
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, new CommonOnboardingStat$TypeOnboardingEvent(onboardingType, eventType, str, -1, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
