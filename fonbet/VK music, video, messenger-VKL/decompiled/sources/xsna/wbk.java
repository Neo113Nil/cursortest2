package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesClick;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Iterator;

/* compiled from: CreationOnboardingAnalyticsImpl.kt */
/* loaded from: classes5.dex */
public final class wbk implements vbk {
    @Override // xsna.vbk
    public final void a(long j, String str) {
        Object obj;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null);
        long abs = Math.abs(j);
        CommonCommunitiesStat$TypeCommunitiesClick.Source source = CommonCommunitiesStat$TypeCommunitiesClick.Source.COMMUNITY_HEADER_BLOCK;
        CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem.Event event = CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem.Event.BLOCK_CLICK;
        Iterator<E> it = CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem.OnboardingScreen.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem.OnboardingScreen) obj).name(), str)) {
                    break;
                }
            }
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, CommonCommunitiesStat$TypeCommunitiesClick.a.a(abs, source, new CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem(event, (CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem.OnboardingScreen) obj)), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
