package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stories.design.view.stats.tabs.StoryStatisticsTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.hem0;

/* compiled from: StoryViewRepliesAndViewersDelegate.kt */
/* loaded from: classes6.dex */
public final class xmm0 {
    public final uov a;
    public final po6 b;
    public final qlm0 c;
    public final anm0 d;

    public xmm0(mkm0 mkm0Var, mkm0 mkm0Var2, qlm0 qlm0Var) {
        this.a = mkm0Var;
        this.b = mkm0Var2;
        this.c = qlm0Var;
        this.d = qlm0Var.f;
    }

    public final void a(boolean z) {
        StoryStatisticsTab storyStatisticsTab;
        UserId userId;
        MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.OPEN_FEEDBACK;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER;
        po6 po6Var = this.b;
        anm0.d(this.d, eventType, mobileOfficialAppsCoreNavStat$EventScreen, po6Var.d, po6Var.m, po6Var.P0(), 32);
        po6Var.Z0();
        uov uovVar = this.a;
        uovVar.v0(false, (r3 & 2) != 0, false);
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = uovVar.getStoriesContainer().g;
        ArrayList arrayList = new ArrayList();
        Iterator<StoryEntry> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            StoryEntry next = it.next();
            if (!this.c.o.m(next.c)) {
                arrayList.add(next);
            }
        }
        int indexOf = arrayList.indexOf(uovVar.getCurrentStory());
        if (indexOf == -1) {
            return;
        }
        n7b0 n7b0Var = new n7b0(this, 11);
        su80 su80Var = new su80(this, 28);
        if (z) {
            storyStatisticsTab = StoryStatisticsTab.STICKERS;
        } else {
            StoryStatisticsTab.Companion.getClass();
            storyStatisticsTab = StoryStatisticsTab.INITIAL;
        }
        int m = storyStatisticsTab.m();
        StoryEntry currentStory = uovVar.getCurrentStory();
        StringBuilder sb = new StringBuilder("StoryStatisticsBottomSheet_");
        sb.append(currentStory != null ? currentStory.d : null);
        sb.append('_');
        sb.append(currentStory != null ? Integer.valueOf(currentStory.c) : null);
        String sb2 = sb.toString();
        StoryEntry currentStory2 = uovVar.getCurrentStory();
        new hem0.a(uovVar, n7b0Var, su80Var, arrayList, indexOf, (currentStory2 == null || (userId = currentStory2.d) == null || !fkq0.b(userId)) ? false : true, m).H0(((FragmentActivity) e3m.h(uovVar.getCtx())).getSupportFragmentManager(), sb2);
    }
}
