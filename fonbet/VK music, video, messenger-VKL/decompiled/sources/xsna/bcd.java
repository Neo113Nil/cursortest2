package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsSubscriptionItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;

/* compiled from: ClipSearchStatDelegate.kt */
/* loaded from: classes16.dex */
public final class bcd {

    /* compiled from: ClipSearchStatDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchAuthorAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[SearchAuthorAnalyticsInfo.ClickTarget.Subscribe.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchAuthorAnalyticsInfo.ClickTarget.Unsubscribe.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(cfp0 cfp0Var) {
        SearchAuthorAnalyticsInfo.ClickTarget clickTarget;
        boolean z;
        UserId userId;
        MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype eventSubtype;
        UIBlock uIBlock = cfp0Var.a;
        UIBlockSearchAuthor uIBlockSearchAuthor = uIBlock instanceof UIBlockSearchAuthor ? (UIBlockSearchAuthor) uIBlock : null;
        if (uIBlockSearchAuthor != null && uIBlockSearchAuthor.z == UIBlockSearchAuthor.AuthorType.Clips) {
            Object obj = cfp0Var.b;
            SearchAuthorAnalyticsInfo searchAuthorAnalyticsInfo = obj instanceof SearchAuthorAnalyticsInfo ? (SearchAuthorAnalyticsInfo) obj : null;
            if (searchAuthorAnalyticsInfo == null || (clickTarget = searchAuthorAnalyticsInfo.a) == null) {
                return;
            }
            int i = a.$EnumSwitchMapping$0[clickTarget.ordinal()];
            if (i == 1) {
                z = true;
            } else if (i != 2) {
                return;
            } else {
                z = false;
            }
            oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
            if (oapVar instanceof oap.b) {
                userId = fkq0.e(((Group) ((oap.b) oapVar).a).c);
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                userId = ((UserProfile) ((oap.a) oapVar).a).c;
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, 0L, Long.valueOf(userId.b), null, null, null, 56, null);
            SchemeStat$TypeClipViewerItem.ScreenType screenType = SchemeStat$TypeClipViewerItem.ScreenType.SUBSCRIPTIONS;
            SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_SUBSCRIPTION_BUTTON;
            if (z) {
                eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.SUBSCRIBE;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.UNSUBSCRIBE;
            }
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new SchemeStat$TypeClipViewerItem(screenType, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsSubscriptionItem(MobileOfficialAppsClipsStat$ClipsSubscriptionItem.SubscriptionPlace.CLIPS_SEARCH, eventSubtype), null, null, null, null, null, null, 1065353212, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
    }
}
