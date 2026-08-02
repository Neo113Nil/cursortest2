package xsna;

import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$ArticleInfoArticleId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeDzenBlockArticleView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DzenArticlesBlockAnalyticsImpl.kt */
/* loaded from: classes16.dex */
public final class eto implements dto {
    public final db4 a;
    public final ia4 b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new zq3(15));

    public eto(db4 db4Var, ia4 ia4Var) {
        this.a = db4Var;
        this.b = ia4Var;
    }

    public static void d(String str, String str2, int i, MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick.Target target) {
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP, SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, str2, null, 46, null), Integer.valueOf(i), new MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick(target, new MobileOfficialAppsConDzenStat$ArticleInfoArticleId(str)))).q();
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dto
    public final void a(String str, String str2, int i, NewsfeedResearch newsfeedResearch) {
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = new CommonStat$TypeTrackCodeItem(str);
        new bvt0(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP, SchemeStat$TypeView.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.DZEN_ARTICLE_ITEM, null, null, null, str2, null, 46, null), "", "", Integer.valueOf(i), new MobileOfficialAppsFeedStat$TypeDzenBlockArticleView(commonStat$TypeTrackCodeItem))).q();
        if (((Boolean) this.c.getValue()).booleanValue() && newsfeedResearch != null) {
            AudienceResearchSurfaceCode audienceResearchSurfaceCode = AudienceResearchSurfaceCode.DZEN_ARTICLE_CAROUSEL;
            List<String> list = newsfeedResearch.b;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.a.a((String) it.next()).b(audienceResearchSurfaceCode).build());
            }
            ia4 ia4Var = this.b;
            ia4Var.b(arrayList);
            for (NewsfeedResearchEvent newsfeedResearchEvent : newsfeedResearch.c) {
                ia4Var.a(newsfeedResearchEvent.b, newsfeedResearchEvent.c);
            }
        }
    }

    @Override // xsna.dto
    public final void b(int i, String str, String str2) {
        d(str, str2, i, MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick.Target.BUTTON);
    }

    @Override // xsna.dto
    public final void c(int i, String str, String str2) {
        d(str, str2, i, MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick.Target.CARD);
    }
}
