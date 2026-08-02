package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: OnStorySelectedNavigationListener.kt */
/* loaded from: classes6.dex */
public final class ac80 implements zb80 {
    public final y1q0 a;
    public final String b;

    public ac80(y1q0 y1q0Var, String str) {
        this.a = y1q0Var;
        this.b = str;
    }

    public final void a(StoryEntry storyEntry) {
        UiTrackingScreen uiTrackingScreen = new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.STORY);
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.STORY, Long.valueOf(storyEntry.c), Long.valueOf(storyEntry.d.b), null, this.b, null, 40, null);
        this.a.c(uiTrackingScreen, true);
    }
}
