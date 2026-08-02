package xsna;

import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$ArticleInfo;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$ArticleInfoArticleId;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$CloseArticleEvent;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$ScrollArticleEvent;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$TypeDzenArticleItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: DzenArticleAnalytics.kt */
/* loaded from: classes18.dex */
public final class dro {
    public static void a(MobileOfficialAppsConDzenStat$CloseArticleEvent.CloseType closeType, long j, String str, String str2) {
        b(new MobileOfficialAppsConDzenStat$TypeDzenArticleItem(null, new MobileOfficialAppsConDzenStat$CloseArticleEvent(closeType, new MobileOfficialAppsConDzenStat$ArticleInfo(new MobileOfficialAppsConDzenStat$ArticleInfoArticleId(str), str2), (int) j), null, null, 13, null));
    }

    public static void b(MobileOfficialAppsConDzenStat$TypeDzenArticleItem mobileOfficialAppsConDzenStat$TypeDzenArticleItem) {
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.ARTICLE_DZEN, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), mobileOfficialAppsConDzenStat$TypeDzenArticleItem, 2)).q();
    }

    public static void c(MobileOfficialAppsConDzenStat$ScrollArticleEvent.ScrollPesent scrollPesent, String str, String str2) {
        b(new MobileOfficialAppsConDzenStat$TypeDzenArticleItem(null, null, new MobileOfficialAppsConDzenStat$ScrollArticleEvent(scrollPesent, new MobileOfficialAppsConDzenStat$ArticleInfo(new MobileOfficialAppsConDzenStat$ArticleInfoArticleId(str), str2)), null, 11, null));
    }
}
