package xsna;

import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.dto.VkOptionalNativeAdType;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.ecomm.design.view.deletedreview.DeletedReviewView;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.playback.PlayableType;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.superapp.common.js.bridge.impl.di.JsCommonDelegateComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.bbv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x84 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ x84(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new LinkedHashMap();
            case 1:
                Pair pair = new Pair(Integer.valueOf(TabMenuItemUiData.IM.h()), Integer.valueOf(R.id.menu_messages));
                Pair pair2 = new Pair(Integer.valueOf(TabMenuItemUiData.HOME.h()), Integer.valueOf(R.id.menu_newsfeed));
                Pair pair3 = new Pair(Integer.valueOf(TabMenuItemUiData.CLIPS.h()), Integer.valueOf(R.id.menu_clips));
                Pair pair4 = new Pair(Integer.valueOf(TabMenuItemUiData.FRIENDS.h()), Integer.valueOf(R.id.menu_friends));
                Integer valueOf = Integer.valueOf(TabMenuItemUiData.GROUPS.h());
                Integer valueOf2 = Integer.valueOf(R.id.menu_groups);
                return pn00.i(pair, pair2, pair3, pair4, new Pair(valueOf, valueOf2), new Pair(Integer.valueOf(TabMenuItemUiData.VIDEO.h()), Integer.valueOf(R.id.menu_videos)), new Pair(Integer.valueOf(TabMenuItemUiData.HUB.h()), Integer.valueOf(R.id.menu_superapp)), new Pair(Integer.valueOf(TabMenuItemUiData.FEEDBACK.h()), Integer.valueOf(R.id.menu_feedback)), new Pair(Integer.valueOf(TabMenuItemUiData.MANAGED_GROUP.h()), valueOf2), new Pair(Integer.valueOf(TabMenuItemUiData.MUSIC.h()), Integer.valueOf(R.id.menu_audios)), new Pair(Integer.valueOf(TabMenuItemUiData.PROFILE.h()), Integer.valueOf(R.id.menu_profile)), new Pair(Integer.valueOf(TabMenuItemUiData.OVERVIEW.h()), Integer.valueOf(R.id.menu_search)), new Pair(Integer.valueOf(TabMenuItemUiData.GAMES.h()), Integer.valueOf(R.id.menu_games)));
            case 2:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                return s3q0.a;
            case 3:
                return new s290();
            case 4:
                return s3q0.a;
            case 5:
                return s3q0.a;
            case 6:
                int i = DeletedReviewView.c;
                return s3q0.a;
            case 7:
                int i2 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return Integer.valueOf(iah0.a(2));
            case 8:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 9:
                FeedFeatures feedFeatures = FeedFeatures.DZEN_CAROUSEL;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 10:
                return new p4r();
            case 11:
                int i3 = ImSettingsDialogThemeFragment.c0;
                int i4 = iah0.f().widthPixels;
                int i5 = iah0.f().heightPixels;
                float max = Math.max(i4, i5);
                if (max > 2048.0f) {
                    return new x9g0(max, i4, i5, 8);
                }
                return null;
            case 12:
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("max_ad", MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_MORE, null, 4, null), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                return s3q0.a;
            case 13:
                iyk0 iyk0Var = d5x.a;
                return null;
            case 14:
                return new kzg0(null);
            case 15:
                return s3q0.a;
            case 16:
                qcy<Object>[] qcyVarArr = JsCommonDelegateComponentImpl.b;
                return new f3y();
            case 17:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_LINKVH_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 18:
                List<Integer> list = a500.z;
                return "long poll sync thread interrupted";
            case 19:
                return s3q0.a;
            case 20:
                return new ots();
            case 21:
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                return new mx40();
            case 24:
                FeedFeatures feedFeatures2 = FeedFeatures.FRESH_TIMER;
                feedFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures2));
            case 25:
                return new lu0();
            case 26:
                return new PlaybackLaunchMeta(MusicPlaybackLaunchContext.d, "", PlayableType.MUSIC_TRACK, PlaySourceMeta.Default.b, null, 16, null);
            case 27:
                return new pbc0();
            case 28:
                yzc0 yzc0Var = yzc0.b;
                return ((NewsfeedOptionalAdsComponent) yzc0.c.getValue()).m5(VkOptionalNativeAdType.APPLOVIN);
            default:
                qcy<Object>[] qcyVarArr2 = cfd0.q1;
                ComFeatures comFeatures2 = ComFeatures.COM_NEW_POSTING_PRIVACY_UX;
                comFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures2));
        }
    }
}
