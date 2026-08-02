package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.fb80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jrc0 implements fb80.a {
    public final /* synthetic */ int b;

    public /* synthetic */ jrc0(int i) {
        this.b = i;
    }

    @Override // xsna.fb80.a
    public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                return MobileOfficialAppsCoreNavStat$EventScreen.FEED_POSTPONED_POSTS;
            default:
                qcy<Object>[] qcyVarArr2 = ReactionsFeedFragment.q0;
                UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                return (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) ? MobileOfficialAppsCoreNavStat$EventScreen.FEED_LIKES : mobileOfficialAppsCoreNavStat$EventScreen;
        }
    }
}
