package xsna;

import android.os.SystemClock;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.analytics.SdkStatPixel;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.clips.viewer.impl.utils.ClipVideoPixelExecutorDelegate;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.StatPixel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipViewerDescriptionItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsSubscriptionItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$OwnerInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsFloatingButton;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$VkTicket;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$SocialProofAuthorType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowIconComment;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowProductPin;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedTicketItemClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$FeedPinEntryPoint;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.gjc;
import xsna.lie;
import xsna.zlc;

/* compiled from: ClipFeedAnalyticsDelegate.kt */
/* loaded from: classes17.dex */
public final class svc implements rih0 {
    public final SchemeStat$TypeClipViewerItem.ScreenType a;
    public final lie b;
    public final ufd c;
    public final zlc d;
    public final ycd e;
    public final lzc f;
    public final n8d g;
    public final gjc h;
    public final f9e i = new f9e();

    /* compiled from: ClipFeedAnalyticsDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SdkClipViewerClick.InlineNps.ClickEvent.values().length];
            try {
                iArr[SdkClipViewerClick.InlineNps.ClickEvent.SKIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType.values().length];
            try {
                iArr2[ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType.BUTTON_SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType.BUTTON_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType.BUTTON_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType.MODAL_CARD_CTA_BUTTON_CLICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public svc(SchemeStat$TypeClipViewerItem.ScreenType screenType, lie lieVar, ufd ufdVar, qoc qocVar, qcd qcdVar, zlc zlcVar, ycd ycdVar, lzc lzcVar, n8d n8dVar, q20 q20Var) {
        this.a = screenType;
        this.b = lieVar;
        this.c = ufdVar;
        this.d = zlcVar;
        this.e = ycdVar;
        this.f = lzcVar;
        this.g = n8dVar;
        this.h = new gjc(screenType, new fjc(), q20Var);
    }

    public final void a(FeedItem feedItem) {
        if (feedItem instanceof FeedItem.l) {
            FeedItem.l lVar = (FeedItem.l) feedItem;
            lzc lzcVar = this.f;
            lzcVar.f = lVar;
            LinkedHashSet linkedHashSet = lzcVar.c;
            if (linkedHashSet.add(lVar.F())) {
                ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                jt50.a(SingleEvent.CLIP_VIEW);
            }
            if (linkedHashSet.size() == 3 && !lzcVar.d) {
                lzcVar.d = true;
                ConcurrentHashMap.KeySetView<Object, Boolean> keySetView2 = jt50.a;
                jt50.a(SingleEvent.CLIP_USER_BECAME_ACTIVE);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - lzcVar.e >= 6000) {
                qyk0.a().a();
                lzcVar.e = elapsedRealtime;
            }
            nsk0 nsk0Var = k15.z(lVar.k()).S0.get(StatPixel.a.AbstractC0903a.b.a);
            if (nsk0Var != null) {
                ArrayList<StatPixel> arrayList = nsk0Var.a;
                if (!lVar.k().p0()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    for (StatPixel statPixel : arrayList) {
                        ClipVideoPixelExecutorDelegate clipVideoPixelExecutorDelegate = ffd.a;
                        List<StatPixel> list = clipVideoPixelExecutorDelegate.e;
                        list.add(statPixel);
                        if (clipVideoPixelExecutorDelegate.f.get()) {
                            clipVideoPixelExecutorDelegate.b.t(list);
                        }
                        clipVideoPixelExecutorDelegate.a(statPixel);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public final void b(FeedItem feedItem) {
        ki0 ki0Var = this.d.a;
        if (feedItem instanceof FeedItem.l) {
            Map<AdStatPixel.Type, List<AdStatPixel>> f6 = ((FeedItem.l) feedItem).k().f6();
            if (f6.isEmpty()) {
                return;
            }
            ki0Var.e(f6);
            return;
        }
        if (feedItem instanceof FeedItem.m) {
            Map<AdStatPixel.Type, List<AdStatPixel>> map = ((FeedItem.m) feedItem).d.i;
            if (map.isEmpty()) {
                return;
            }
            ki0Var.e(map);
            return;
        }
        if (feedItem instanceof FeedItem.j) {
            ?? r3 = ((FeedItem.j) feedItem).e.k;
            if (r3.isEmpty()) {
                return;
            }
            ki0Var.e(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public final void c(FeedItem feedItem) {
        ki0 ki0Var = this.d.a;
        if (feedItem instanceof FeedItem.l) {
            Map<AdStatPixel.Type, List<AdStatPixel>> f6 = ((FeedItem.l) feedItem).k().f6();
            if (f6.isEmpty()) {
                return;
            }
            ki0Var.b(f6);
            return;
        }
        if (feedItem instanceof FeedItem.m) {
            Map<AdStatPixel.Type, List<AdStatPixel>> map = ((FeedItem.m) feedItem).d.i;
            if (map.isEmpty()) {
                return;
            }
            ki0Var.b(map);
            return;
        }
        if (feedItem instanceof FeedItem.j) {
            ?? r3 = ((FeedItem.j) feedItem).e.k;
            if (r3.isEmpty()) {
                return;
            }
            ki0Var.b(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    public final void d(ClipViewerAnalyticsEvent clipViewerAnalyticsEvent) {
        SchemeStat$TypeClipViewerItem.EventType eventType;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        UserId userId;
        MobileOfficialAppsClipsStat$TypeClipsFloatingButton.EventType eventType2;
        if (clipViewerAnalyticsEvent instanceof lfd) {
            lfd lfdVar = (lfd) clipViewerAnalyticsEvent;
            ClipVideoFile z = k15.z(lfdVar.a);
            String str = lfdVar.b;
            String str2 = lfdVar.c;
            ArrayList arrayList = this.b.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lie.a aVar = (lie.a) it.next();
                    if (epx.f(aVar.a, z.r1()) && epx.f(aVar.b, str) && epx.f(aVar.c, str2)) {
                        return;
                    }
                }
            }
            arrayList.add(new lie.a(z.r1(), str, str2));
            lie.a(MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem.EventType.SHOW, z, str, str2, this.a);
            return;
        }
        if (clipViewerAnalyticsEvent instanceof mfd) {
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS;
            SchemeStat$TypeClipViewerItem.ScreenType screenType = this.e.a;
            SchemeStat$TypeClipViewerItem.EventType eventType3 = SchemeStat$TypeClipViewerItem.EventType.OPEN_OWNER_FROM_SUBSCRIPTION_SNACKBAR;
            SdkVideoFile sdkVideoFile = ((mfd) clipViewerAnalyticsEvent).a;
            new iof(mobileOfficialAppsCoreNavStat$EventScreen, new SchemeStat$TypeClipViewerItem(screenType, eventType3, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsOpenOwnerFromSubscriptionSnackbarItem(new MobileOfficialAppsClipsStat$TypeClipsClipItem(sdkVideoFile.o0(), sdkVideoFile.I0().b, sdkVideoFile.r())), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741756, null)).q();
            return;
        }
        int i = 1;
        if (clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.FloatingButtonEvent) {
            ClipViewerAnalyticsEvent.FloatingButtonEvent floatingButtonEvent = (ClipViewerAnalyticsEvent.FloatingButtonEvent) clipViewerAnalyticsEvent;
            String str3 = floatingButtonEvent.a;
            int i2 = a.$EnumSwitchMapping$1[floatingButtonEvent.b.ordinal()];
            if (i2 == 1) {
                eventType2 = MobileOfficialAppsClipsStat$TypeClipsFloatingButton.EventType.SHOW_FLOATING_BUTTON;
            } else if (i2 == 2) {
                eventType2 = MobileOfficialAppsClipsStat$TypeClipsFloatingButton.EventType.CLICK_FLOATING_BUTTON;
            } else if (i2 == 3) {
                eventType2 = MobileOfficialAppsClipsStat$TypeClipsFloatingButton.EventType.CLOSE_FLOATING_BUTTON;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                eventType2 = MobileOfficialAppsClipsStat$TypeClipsFloatingButton.EventType.CLICK_LINK_FLOATING_BUTTON;
            }
            ClipViewerAnalyticsEvent.FloatingButtonEvent.a aVar2 = floatingButtonEvent.c;
            this.i.getClass();
            new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(this.a, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsFloatingButton(eventType2, str3, new MobileOfficialAppsClipsStat$TypeClipsClipItem(aVar2.a, aVar2.b, aVar2.c)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073725438, null)).q();
            return;
        }
        Long l = 0;
        l = 0;
        if (clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.h) {
            ClipViewerAnalyticsEvent.h hVar = (ClipViewerAnalyticsEvent.h) clipViewerAnalyticsEvent;
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLIP;
            SdkOwner s = hVar.k().s();
            if (s != null && (userId = s.b) != null) {
                l = Long.valueOf(userId.b);
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, null, l, null, hVar.k().r(), null, 42, null);
            if (hVar instanceof ClipViewerAnalyticsEvent.h.a) {
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE;
            } else {
                if (!(hVar instanceof ClipViewerAnalyticsEvent.h.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE;
            }
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, null, 30, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
            return;
        }
        if (clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.b) {
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS;
            ClipViewerAnalyticsEvent.b bVar = (ClipViewerAnalyticsEvent.b) clipViewerAnalyticsEvent;
            if (bVar instanceof ClipViewerAnalyticsEvent.b.C0642b) {
                eventType = SchemeStat$TypeClipViewerItem.EventType.HIDE_CLIP_CONTROLS;
            } else {
                if (!(bVar instanceof ClipViewerAnalyticsEvent.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                eventType = SchemeStat$TypeClipViewerItem.EventType.SHOW_CLIP_CONTROLS;
            }
            new iof(mobileOfficialAppsCoreNavStat$EventScreen2, new SchemeStat$TypeClipViewerItem(this.a, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsClipItem(bVar.a().o0(), bVar.a().I0().b, bVar.a().r()), null, null, 939524092, null)).q();
            return;
        }
        if (clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.i) {
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen3 = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS;
            SchemeStat$TypeClipViewerItem.EventType eventType4 = SchemeStat$TypeClipViewerItem.EventType.SHOW_MORE_SHOPS_BUTTON;
            SdkClipVideoFile sdkClipVideoFile = ((ClipViewerAnalyticsEvent.i) clipViewerAnalyticsEvent).a;
            new iof(mobileOfficialAppsCoreNavStat$EventScreen3, new SchemeStat$TypeClipViewerItem(this.a, eventType4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsClipItem(sdkClipVideoFile.o0(), sdkClipVideoFile.I0().b, sdkClipVideoFile.r()), null, null, 939524092, null)).q();
            return;
        }
        if (clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.e) {
            SdkClipVideoFile sdkClipVideoFile2 = ((ClipViewerAnalyticsEvent.e) clipViewerAnalyticsEvent).a;
            SdkActionLink m1 = sdkClipVideoFile2.m1();
            String str4 = m1 != null ? m1.b : null;
            if (str4 == null) {
                str4 = "";
            }
            UiTracker uiTracker2 = UiTracker.a;
            new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(sdkClipVideoFile2.o0()), Long.valueOf(sdkClipVideoFile2.I0().b), null, sdkClipVideoFile2.r(), null, 40, null), "", "", null, new MobileOfficialAppsVideoStat$TypeClipsGoToAttachedVideoButtonShow(l, str4, i, l), 8)).q();
            return;
        }
        if (clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.d) {
            SdkClipVideoFile sdkClipVideoFile3 = ((ClipViewerAnalyticsEvent.d) clipViewerAnalyticsEvent).a;
            String valueOf = String.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
            UiTracker uiTracker3 = UiTracker.a;
            new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(sdkClipVideoFile3.o0()), Long.valueOf(sdkClipVideoFile3.I0().b), null, sdkClipVideoFile3.r(), null, 40, null), valueOf, valueOf, null, new MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon(r1.b.b.size()), 8)).q();
            return;
        }
        if (clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.c) {
            SdkClipVideoFile sdkClipVideoFile4 = ((ClipViewerAnalyticsEvent.c) clipViewerAnalyticsEvent).a;
            String valueOf2 = String.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
            UiTracker uiTracker4 = UiTracker.a;
            new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(sdkClipVideoFile4.o0()), Long.valueOf(sdkClipVideoFile4.I0().b), null, sdkClipVideoFile4.r(), null, 40, null), valueOf2, valueOf2, null, new MobileOfficialAppsFeedStat$TypeFeedShowIconComment(MobileOfficialAppsFeedStat$SocialProofAuthorType.FROM_FRIEND), 8)).q();
            return;
        }
        boolean z2 = clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.g;
        n8d n8dVar = this.g;
        if (z2) {
            SdkClipVideoFile sdkClipVideoFile5 = ((ClipViewerAnalyticsEvent.g) clipViewerAnalyticsEvent).a;
            new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(n8dVar.a, SchemeStat$TypeClipViewerItem.EventType.GO_TO_MONOTOPIC_BUTTON_SHOW, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsClipItem(sdkClipVideoFile5.o0(), sdkClipVideoFile5.I0().b, sdkClipVideoFile5.r()), null, null, 939524092, null)).q();
        } else if (clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.f) {
            SdkClipVideoFile sdkClipVideoFile6 = ((ClipViewerAnalyticsEvent.f) clipViewerAnalyticsEvent).a;
            new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(n8dVar.a, SchemeStat$TypeClipViewerItem.EventType.GO_TO_MONOTOPIC_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsClipItem(sdkClipVideoFile6.o0(), sdkClipVideoFile6.I0().b, sdkClipVideoFile6.r()), null, null, 939524092, null)).q();
        } else {
            if (!(clipViewerAnalyticsEvent instanceof ClipViewerAnalyticsEvent.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.c.a((ClipViewerAnalyticsEvent.a) clipViewerAnalyticsEvent);
        }
    }

    public final void e(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        lzc lzcVar = this.f;
        ClipFeedTab clipFeedTab = (ClipFeedTab) lzcVar.a.b;
        if (clipFeedTab.Db()) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.SHOPS_FEED_CLIPS;
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen = (((clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) && ((ClipFeedTab.SingleClipFromBlock) clipFeedTab).d == ClipFeedTab.SingleClipFromBlock.SourceBlockType.RETENTION) || (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource)) ? MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TAB_TRENDS : clipFeedTab instanceof ClipFeedTab.NewsMonotheme ? MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MONOTOPIC : null;
        }
        if (mobileOfficialAppsCoreNavStat$EventScreen != null) {
            uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
        }
        FeedItem.l lVar = lzcVar.f;
        uiTrackingScreen.f = lVar != null ? gls0.a(k15.A(lVar.k())) : lzcVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x065b  */
    @Override // xsna.rih0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o2(SdkClipViewerClick sdkClipViewerClick) {
        SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem;
        MobileOfficialAppsClipsStat$OwnerInfo.Direction direction;
        SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem2;
        SchemeStat$EventItem schemeStat$EventItem;
        ClickableMarketItem clickableMarketItem;
        SchemeStat$EventItem schemeStat$EventItem2;
        ClickableStickers clickableStickers;
        List<ClickableSticker> list;
        Object obj;
        Pair pair;
        MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype eventSubtype;
        MusicTrack musicTrack;
        SchemeStat$TypeClipViewerItem.EventType a2;
        Map<AdStatPixel.Type, List<AdStatPixel>> f6;
        int i;
        ukh0 ukh0Var;
        ArrayList<SdkStatPixel> arrayList;
        SdkVideoFile sdkVideoFile = sdkClipViewerClick.a;
        boolean z = sdkClipViewerClick instanceof SdkClipViewerClick.u;
        if (z && ((SdkClipViewerClick.u) sdkClipViewerClick).b) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a b = h5s.b("clips_subscribe");
            b.a(sdkClipViewerClick.a.I0(), "oid");
            b.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
            bVar.k(b.e());
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.InlineNps) {
            SdkClipViewerClick.InlineNps inlineNps = (SdkClipViewerClick.InlineNps) sdkClipViewerClick;
            if (a.$EnumSwitchMapping$0[inlineNps.d.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            lie.a(MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem.EventType.CLICK_SKIP, k15.A(sdkVideoFile), inlineNps.b, inlineNps.c, this.a);
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.o) {
            MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.ADD_ITEM_TO_CART;
            throw null;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.p) {
            throw null;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.n) {
            SdkClipViewerClick.n nVar = (SdkClipViewerClick.n) sdkClipViewerClick;
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(nVar.b), Long.valueOf(nVar.c), null, null, null, 56, null), new MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.PIN, null, nVar.a.r(), 2, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.v) {
            SdkClipViewerClick.v vVar = (SdkClipViewerClick.v) sdkClipViewerClick;
            SchemeStat$EventItem schemeStat$EventItem3 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_BUY_TICKET, null, null, null, null, null, 62, null);
            MobileOfficialAppsFeedStat$TypeFeedTicketItemClick.EntryPoint entryPoint = MobileOfficialAppsFeedStat$TypeFeedTicketItemClick.EntryPoint.PIN;
            String str = vVar.b;
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = str != null ? new CommonStat$TypeTrackCodeItem(str) : null;
            String str2 = vVar.c;
            SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(schemeStat$EventItem3, new MobileOfficialAppsFeedStat$TypeFeedTicketItemClick(entryPoint, new MobileOfficialAppsConPostingStat$VkTicket(commonStat$TypeTrackCodeItem, str2 != null ? new CommonStat$TypeTrackCodeItem(str2) : null)), 2);
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var2 = UiTracker.h;
            uzp0Var2.getClass();
            new bjc(c2, b3, uzp0Var2.a).q();
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.q) {
            SdkClipViewerClick.q qVar = (SdkClipViewerClick.q) sdkClipViewerClick;
            boolean z2 = qVar.e;
            boolean z3 = qVar.c;
            String str3 = qVar.g;
            String str4 = qVar.f;
            boolean z4 = qVar.d;
            boolean z5 = qVar.b;
            SdkVideoFile sdkVideoFile2 = qVar.a;
            if (z2) {
                if (z5) {
                    MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin = new MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin(z4 ? SchemeStat$FeedPinEntryPoint.TIMER : SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, sdkVideoFile2.r(), new MobileOfficialAppsConPostingStat$VkTicket(str4 != null ? new CommonStat$TypeTrackCodeItem(str4) : null, str3 != null ? new CommonStat$TypeTrackCodeItem(str3) : null));
                    UiTracker uiTracker3 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                    UiTrackingScreen b4 = UiTracker.j.b();
                    new iid0(c3, SchemeStat$TypeAction.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_BUY_TICKET, null, null, null, null, null, 62, null), b4 != null ? b4.a : null, mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin)).q();
                } else if (z3) {
                    SchemeStat$TypeClick b5 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_BUY_TICKET, null, null, null, null, null, 62, null), new MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin(SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, sdkVideoFile2.r(), new MobileOfficialAppsConPostingStat$VkTicket(str4 != null ? new CommonStat$TypeTrackCodeItem(str4) : null, str3 != null ? new CommonStat$TypeTrackCodeItem(str3) : null)), 2);
                    UiTracker uiTracker4 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c4 = UiTracker.c();
                    uzp0 uzp0Var3 = UiTracker.h;
                    uzp0Var3.getClass();
                    new bjc(c4, b5, uzp0Var3.a).q();
                }
            } else if (z5) {
                MobileOfficialAppsFeedStat$TypeFeedShowProductPin mobileOfficialAppsFeedStat$TypeFeedShowProductPin = new MobileOfficialAppsFeedStat$TypeFeedShowProductPin(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, null, null, null, null, null, 62, null), z4 ? SchemeStat$FeedPinEntryPoint.TIMER : SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, null, sdkVideoFile2.r(), 4, null);
                UiTracker uiTracker5 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c5 = UiTracker.c();
                UiTrackingScreen b6 = UiTracker.j.b();
                new iid0(c5, SchemeStat$TypeAction.a.b(null, b6 != null ? b6.a : null, mobileOfficialAppsFeedStat$TypeFeedShowProductPin, 1)).q();
            } else if (z3) {
                SchemeStat$TypeClick b7 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick(SchemeStat$FeedPinEntryPoint.SHOPPING_BAG, null, sdkVideoFile2.r(), 2, null), 2);
                UiTracker uiTracker6 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c6 = UiTracker.c();
                uzp0 uzp0Var4 = UiTracker.h;
                uzp0Var4.getClass();
                new bjc(c6, b7, uzp0Var4.a).q();
            }
        }
        gjc gjcVar = this.h;
        gjcVar.getClass();
        SchemeStat$TypeClipViewerItem.EventType a3 = fjc.a(sdkClipViewerClick);
        switch (a3 == null ? -1 : gjc.a.$EnumSwitchMapping$0[a3.ordinal()]) {
            case -1:
                schemeStat$TypeClipViewerItem = null;
                if (schemeStat$TypeClipViewerItem != null) {
                    SchemeStat$TypeClick b8 = SchemeStat$TypeClick.a.b(gls0.a(k15.A(sdkVideoFile)), schemeStat$TypeClipViewerItem, 2);
                    UiTracker uiTracker7 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c7 = UiTracker.c();
                    uzp0 uzp0Var5 = UiTracker.h;
                    uzp0Var5.getClass();
                    new bjc(c7, b8, uzp0Var5.a).q();
                }
                a2 = fjc.a(sdkClipViewerClick);
                if (a2 != null && (((i = zlc.a.$EnumSwitchMapping$0[a2.ordinal()]) == 1 || i == 2) && (ukh0Var = sdkVideoFile.e0().get(SdkStatPixel.a.AbstractC0637a.C0638a.a)) != null)) {
                    arrayList = ukh0Var.a;
                    if (!sdkVideoFile.p0()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        for (SdkStatPixel sdkStatPixel : arrayList) {
                            ClipVideoPixelExecutorDelegate clipVideoPixelExecutorDelegate = ffd.a;
                            StatPixel statPixel = new StatPixel(StatPixel.a.b.a(sdkStatPixel.b.a()), sdkStatPixel.c, sdkStatPixel.d, sdkStatPixel.e);
                            ClipVideoPixelExecutorDelegate clipVideoPixelExecutorDelegate2 = ffd.a;
                            List<StatPixel> list2 = clipVideoPixelExecutorDelegate2.e;
                            list2.add(statPixel);
                            if (clipVideoPixelExecutorDelegate2.f.get()) {
                                clipVideoPixelExecutorDelegate2.b.t(list2);
                            }
                            clipVideoPixelExecutorDelegate2.a(statPixel);
                        }
                    }
                }
                ki0 ki0Var = this.d.a;
                SdkClipVideoFile sdkClipVideoFile = !(sdkVideoFile instanceof SdkClipVideoFile) ? (SdkClipVideoFile) sdkVideoFile : null;
                f6 = sdkClipVideoFile == null ? sdkClipVideoFile.f6() : null;
                if (f6 != null && !f6.isEmpty()) {
                    if (!(sdkClipViewerClick instanceof SdkClipViewerClick.a)) {
                        ki0Var.d(f6);
                    } else if (sdkClipViewerClick instanceof SdkClipViewerClick.b) {
                        SdkVideoAdInfo X0 = sdkVideoFile.X0();
                        if ((X0 != null ? X0.h : null) == SdkVideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER) {
                            ki0Var.d(f6);
                        } else {
                            ki0Var.j(f6);
                        }
                    } else if (sdkClipViewerClick instanceof SdkClipViewerClick.s) {
                        ki0Var.f(f6);
                    } else if (sdkClipViewerClick instanceof SdkClipViewerClick.c) {
                        ki0Var.i(f6);
                    } else if (z) {
                        if (((SdkClipViewerClick.u) sdkClipViewerClick).b) {
                            ki0Var.g(f6);
                        }
                    } else if (sdkClipViewerClick instanceof SdkClipViewerClick.l) {
                        if (((SdkClipViewerClick.l) sdkClipViewerClick).b) {
                            ki0Var.c(f6);
                        }
                    } else if ((sdkClipViewerClick instanceof SdkClipViewerClick.h) && ((SdkClipViewerClick.h) sdkClipViewerClick).b) {
                        ki0Var.l(f6);
                    }
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.j) {
                    SdkClipVideoFile sdkClipVideoFile2 = ((SdkClipViewerClick.j) sdkClipViewerClick).b;
                    SchemeStat$TypeClick b9 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(sdkClipVideoFile2.o0()), Long.valueOf(sdkClipVideoFile2.I0().b), null, sdkClipVideoFile2.r(), null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal(MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint.FROM_FRIENDS_ICON_LIKES), 2);
                    UiTracker uiTracker8 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c8 = UiTracker.c();
                    uzp0 uzp0Var6 = UiTracker.h;
                    uzp0Var6.getClass();
                    new bjc(c8, b9, uzp0Var6.a).q();
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.i) {
                    return;
                }
                SdkClipViewerClick.i iVar = (SdkClipViewerClick.i) sdkClipViewerClick;
                SdkClipVideoFile sdkClipVideoFile3 = iVar.b;
                SchemeStat$EventItem schemeStat$EventItem4 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(sdkClipVideoFile3.o0()), Long.valueOf(sdkClipVideoFile3.I0().b), null, sdkClipVideoFile3.r(), null, 40, null);
                MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.EntryPoint entryPoint2 = MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.EntryPoint.FRIEND_ICON;
                String r = sdkClipVideoFile3.r();
                if (r == null) {
                    r = "";
                }
                SchemeStat$TypeClick b10 = SchemeStat$TypeClick.a.b(schemeStat$EventItem4, new MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal(entryPoint2, r, Integer.valueOf(iVar.c)), 2);
                UiTracker uiTracker9 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c9 = UiTracker.c();
                uzp0 uzp0Var7 = UiTracker.h;
                uzp0Var7.getClass();
                new bjc(c9, b10, uzp0Var7.a).q();
                return;
            case 0:
            default:
                schemeStat$TypeClipViewerItem = gjcVar.a(a3);
                if (schemeStat$TypeClipViewerItem != null) {
                }
                a2 = fjc.a(sdkClipViewerClick);
                if (a2 != null) {
                    arrayList = ukh0Var.a;
                    if (!sdkVideoFile.p0()) {
                    }
                    if (arrayList != null) {
                    }
                    break;
                }
                ki0 ki0Var2 = this.d.a;
                if (!(sdkVideoFile instanceof SdkClipVideoFile)) {
                }
                if (sdkClipVideoFile == null) {
                }
                if (f6 != null) {
                    if (!(sdkClipViewerClick instanceof SdkClipViewerClick.a)) {
                    }
                    break;
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.j) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.i) {
                }
                break;
            case 1:
                SdkClipViewerClick.b bVar2 = sdkClipViewerClick instanceof SdkClipViewerClick.b ? (SdkClipViewerClick.b) sdkClipViewerClick : null;
                Boolean valueOf = bVar2 != null ? Boolean.valueOf(bVar2.b) : null;
                if (epx.f(valueOf, Boolean.TRUE)) {
                    direction = MobileOfficialAppsClipsStat$OwnerInfo.Direction.TO_PLAYER_LIVE;
                } else if (epx.f(valueOf, Boolean.FALSE)) {
                    direction = MobileOfficialAppsClipsStat$OwnerInfo.Direction.TO_AUTHOR;
                } else {
                    if (valueOf != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    direction = null;
                }
                SchemeStat$TypeClipViewerItem.ScreenType screenType = gjcVar.a;
                SchemeStat$TypeClipViewerItem.EventType eventType2 = SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_AUTHOR;
                SchemeStat$EventItem schemeStat$EventItem5 = new SchemeStat$EventItem(fkq0.d(sdkVideoFile.I0()) ? SchemeStat$EventItem.Type.USER : SchemeStat$EventItem.Type.GROUP, Long.valueOf(sdkVideoFile.I0().b), null, null, null, null, 60, null);
                SdkOwner s = sdkVideoFile.s();
                schemeStat$TypeClipViewerItem2 = new SchemeStat$TypeClipViewerItem(screenType, eventType2, null, null, null, null, null, null, null, null, null, schemeStat$EventItem5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$OwnerInfo(s != null && s.q && gjcVar.c, direction), null, 805304316, null);
                schemeStat$TypeClipViewerItem = schemeStat$TypeClipViewerItem2;
                if (schemeStat$TypeClipViewerItem != null) {
                }
                a2 = fjc.a(sdkClipViewerClick);
                if (a2 != null) {
                }
                ki0 ki0Var22 = this.d.a;
                if (!(sdkVideoFile instanceof SdkClipVideoFile)) {
                }
                if (sdkClipVideoFile == null) {
                }
                if (f6 != null) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.j) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.i) {
                }
                break;
            case 2:
                SdkActionLink m1 = sdkVideoFile.m1();
                SchemeStat$TypeClipViewerItem.ScreenType screenType2 = gjcVar.a;
                SchemeStat$TypeClipViewerItem.EventType eventType3 = SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_ACTION_BUTTON;
                if (m1 != null) {
                    gjcVar.b.getClass();
                    schemeStat$EventItem = new SchemeStat$EventItem(q20.a(m1.e), Long.valueOf(m1.c), null, m1.f, m1.b, null, 36, null);
                } else {
                    schemeStat$EventItem = null;
                }
                schemeStat$TypeClipViewerItem = new SchemeStat$TypeClipViewerItem(screenType2, eventType3, null, null, null, null, null, null, null, null, schemeStat$EventItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740796, null);
                if (schemeStat$TypeClipViewerItem != null) {
                }
                a2 = fjc.a(sdkClipViewerClick);
                if (a2 != null) {
                }
                ki0 ki0Var222 = this.d.a;
                if (!(sdkVideoFile instanceof SdkClipVideoFile)) {
                }
                if (sdkClipVideoFile == null) {
                }
                if (f6 != null) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.j) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.i) {
                }
                break;
            case 3:
                Long l = sdkClipViewerClick instanceof SdkClipViewerClick.m ? ((SdkClipViewerClick.m) sdkClipViewerClick).b : null;
                VideoFile A = k15.A(sdkVideoFile);
                ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
                if (clipVideoFile == null || (clickableStickers = clipVideoFile.C1) == null || (list = clickableStickers.d) == null) {
                    clickableMarketItem = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof ClickableMarketItem) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            ClickableMarketItem clickableMarketItem2 = (ClickableMarketItem) obj;
                            if (l != null) {
                                long longValue = l.longValue();
                                Long l2 = clickableMarketItem2.e;
                                if (l2 != null && l2.longValue() == longValue) {
                                }
                            }
                        } else {
                            obj = null;
                        }
                    }
                    clickableMarketItem = (ClickableMarketItem) obj;
                }
                SchemeStat$TypeClipViewerItem.ScreenType screenType3 = gjcVar.a;
                SchemeStat$TypeClipViewerItem.EventType eventType4 = SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_MARKET_ITEM_SNIPPET;
                if (clickableMarketItem != null) {
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MARKET_ITEM;
                    String str5 = clickableMarketItem.g;
                    Long l3 = clickableMarketItem.e;
                    UserId userId = clickableMarketItem.f;
                    schemeStat$EventItem2 = new SchemeStat$EventItem(type, l3, userId != null ? Long.valueOf(userId.b) : null, str5, null, null, 48, null);
                } else {
                    schemeStat$EventItem2 = null;
                }
                schemeStat$TypeClipViewerItem = new SchemeStat$TypeClipViewerItem(screenType3, eventType4, null, null, null, null, null, null, null, null, null, null, schemeStat$EventItem2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073737724, null);
                if (schemeStat$TypeClipViewerItem != null) {
                }
                a2 = fjc.a(sdkClipViewerClick);
                if (a2 != null) {
                }
                ki0 ki0Var2222 = this.d.a;
                if (!(sdkVideoFile instanceof SdkClipVideoFile)) {
                }
                if (sdkClipVideoFile == null) {
                }
                if (f6 != null) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.j) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.i) {
                }
                break;
            case 4:
                if (sdkClipViewerClick instanceof SdkClipViewerClick.e) {
                    SdkClipViewerClick.e eVar = (SdkClipViewerClick.e) sdkClipViewerClick;
                    SdkVideoFile sdkVideoFile3 = eVar.a;
                    if (eVar instanceof SdkClipViewerClick.e.a) {
                        pair = new Pair(MobileOfficialAppsClipsStat$ClipViewerDescriptionItem.ObjectType.HASHTAG, ((SdkClipViewerClick.e.a) eVar).b);
                    } else if (eVar instanceof SdkClipViewerClick.e.c) {
                        pair = new Pair(MobileOfficialAppsClipsStat$ClipViewerDescriptionItem.ObjectType.MENTION, ((SdkClipViewerClick.e.c) eVar).b);
                    } else {
                        if (!(eVar instanceof SdkClipViewerClick.e.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pair = new Pair(MobileOfficialAppsClipsStat$ClipViewerDescriptionItem.ObjectType.LINK, ((SdkClipViewerClick.e.b) eVar).b);
                    }
                    schemeStat$TypeClipViewerItem = new SchemeStat$TypeClipViewerItem(gjcVar.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_DESCRIPTION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipViewerDescriptionItem(sdkVideoFile3.I0().b, sdkVideoFile3.o0(), (MobileOfficialAppsClipsStat$ClipViewerDescriptionItem.ObjectType) pair.d(), (String) pair.g()), null, null, null, null, null, null, null, 1069547516, null);
                } else {
                    schemeStat$TypeClipViewerItem = gjcVar.a(a3);
                }
                if (schemeStat$TypeClipViewerItem != null) {
                }
                a2 = fjc.a(sdkClipViewerClick);
                if (a2 != null) {
                }
                ki0 ki0Var22222 = this.d.a;
                if (!(sdkVideoFile instanceof SdkClipVideoFile)) {
                }
                if (sdkClipVideoFile == null) {
                }
                if (f6 != null) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.j) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.i) {
                }
                break;
            case 5:
                if (z && ((SdkClipViewerClick.u) sdkClipViewerClick).b) {
                    eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.SUBSCRIBE;
                } else {
                    if (!z) {
                        throw new IllegalArgumentException("SdkClipViewerClick.Subscription is expected, but " + sdkClipViewerClick + " is present");
                    }
                    eventSubtype = MobileOfficialAppsClipsStat$ClipsSubscriptionItem.EventSubtype.UNSUBSCRIBE;
                }
                schemeStat$TypeClipViewerItem = new SchemeStat$TypeClipViewerItem(gjcVar.a, a3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsSubscriptionItem(MobileOfficialAppsClipsStat$ClipsSubscriptionItem.SubscriptionPlace.VIEWER, eventSubtype), null, null, null, null, null, null, 1065353212, null);
                if (schemeStat$TypeClipViewerItem != null) {
                }
                a2 = fjc.a(sdkClipViewerClick);
                if (a2 != null) {
                }
                ki0 ki0Var222222 = this.d.a;
                if (!(sdkVideoFile instanceof SdkClipVideoFile)) {
                }
                if (sdkClipVideoFile == null) {
                }
                if (f6 != null) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.j) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.i) {
                }
                break;
            case 6:
                VideoFile A2 = k15.A(sdkVideoFile);
                ClipVideoFile clipVideoFile2 = A2 instanceof ClipVideoFile ? (ClipVideoFile) A2 : null;
                schemeStat$TypeClipViewerItem2 = new SchemeStat$TypeClipViewerItem(gjcVar.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_MUSIC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem(clipVideoFile2 != null && (musicTrack = clipVideoFile2.D1) != null && musicTrack.X ? MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem.TrendingStatus.TREND_MUSIC : MobileOfficialAppsClipsStat$TypeClipClickToMusicEventItem.TrendingStatus.NOT_TREND), null, null, null, null, null, null, null, null, null, null, null, null, 1073610748, null);
                schemeStat$TypeClipViewerItem = schemeStat$TypeClipViewerItem2;
                if (schemeStat$TypeClipViewerItem != null) {
                }
                a2 = fjc.a(sdkClipViewerClick);
                if (a2 != null) {
                }
                ki0 ki0Var2222222 = this.d.a;
                if (!(sdkVideoFile instanceof SdkClipVideoFile)) {
                }
                if (sdkClipVideoFile == null) {
                }
                if (f6 != null) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.j) {
                }
                if (sdkClipViewerClick instanceof SdkClipViewerClick.i) {
                }
                break;
        }
    }
}
