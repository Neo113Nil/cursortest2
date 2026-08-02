package xsna;

import android.content.Intent;
import android.os.Bundle;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: NewsfeedRouterImpl.kt */
/* loaded from: classes4.dex */
public final class zdg extends oz50 {
    public NewsEntry m;
    public String n;

    @Override // xsna.oz50
    public final boolean p() {
        Bundle bundle = this.j;
        return bundle.containsKey("entry_key") || bundle.getParcelable("entry") != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r1.longValue() != r6) goto L40;
     */
    @Override // xsna.oz50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Intent intent) {
        SchemeStat$EventItem schemeStat$EventItem;
        NewsEntry newsEntry = this.m;
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        if (post == null) {
            return;
        }
        UserId userId = post.m;
        String str = this.n;
        boolean z = true;
        boolean z2 = epx.f(str, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP)) || epx.f(str, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT));
        boolean z3 = str == null || str.length() == 0;
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if ((uiTrackingScreen != null ? uiTrackingScreen.a : null) == MobileOfficialAppsCoreNavStat$EventScreen.GROUP) {
            SchemeStat$EventItem schemeStat$EventItem2 = uiTrackingScreen.f;
            if ((schemeStat$EventItem2 != null ? schemeStat$EventItem2.d() : null) == SchemeStat$EventItem.Type.GROUP && (schemeStat$EventItem = uiTrackingScreen.f) != null) {
                Long b = schemeStat$EventItem.b();
                long j = userId.b;
                if (b != null) {
                }
            }
        }
        z = false;
        if (post.dc() || !fkq0.b(userId)) {
            return;
        }
        if (z2 || (z3 && !z)) {
            this.j.putBoolean("has_similar_posts_action_bar_button", false);
        }
    }
}
