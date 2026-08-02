package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;

/* compiled from: CommunityProfileAdBloggerBannerFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class ceh {
    public final UserId a;
    public final h7v b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final uw4 d;
    public final vw4 e;

    public ceh(UserId userId, h7v h7vVar, io.reactivex.rxjava3.disposables.b bVar, uw4 uw4Var, vw4 vw4Var) {
        this.a = userId;
        this.b = h7vVar;
        this.c = bVar;
        this.d = uw4Var;
        this.e = vw4Var;
    }

    public static void b(UserId userId, CommonCommunitiesStat$ClickEvent.ClickEventType clickEventType) {
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(fkq0.a(userId).b), null, null, null, 58, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(fkq0.a(userId).b, null, null, new CommonCommunitiesStat$ClickEvent(clickEventType, null, null, 6, null), 30), 2)).q();
    }

    public final void a() {
        String valueOf = String.valueOf(System.currentTimeMillis());
        new bvt0(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, SchemeStat$TypeView.a(SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.ONBOARDING, null, null, null, null, null, 62, null), valueOf, valueOf, null, new CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView(CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView.Event.SHOW_OZON_INVITE_BANNER_ADB, fkq0.a(this.a).b), 8), SchemeStat$TypeView.Type.TYPE_COMMUNITIES_OZON_INVITE_BANNER_ADB_VIEW)).q();
    }
}
