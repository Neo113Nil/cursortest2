package xsna;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponentStub;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.im.ui.di.MaxUtilityStubComponent;
import com.vk.music.player.analytics.impl.tracker.di.AbstractPlayerAnalyticsComponent;
import com.vk.music.player.analytics.impl.tracker.timespent.MusicTimespentEventType;
import com.vk.newsfeed.impl.config.FeedTabsDelayConfig;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.search.ui.impl.catalog.SearchChannelsFeatureCatalogFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vkontakte.android.R;
import kotlin.text.Regex;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import xsna.ds60;
import xsna.ey60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ig(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AbstractPlayerAnalyticsComponent.g;
                com.vk.music.player.analytics.impl.tracker.timespent.a aVar = new com.vk.music.player.analytics.impl.tracker.timespent.a();
                aVar.d = "";
                aVar.g = MusicTimespentEventType.AUDIO;
                return aVar;
            case 1:
                return s3q0.a;
            case 2:
                int i = rt5.r1;
                return new yd10();
            case 3:
                return '?';
            case 4:
                return new max0();
            case 5:
                ClipsAttachmentsComponentStub.a aVar2 = ClipsAttachmentsComponentStub.f;
                return pne.a.getSTUB();
            case 6:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return new hld(new jae(g620.f(), new lec(1), new ojd()), new jld(), new pp5());
            case 7:
                return new FeedTabsDelayConfig(10000L);
            case 8:
                return new SearchChannelsFeatureCatalogFragment.a(SearchChannelsFeatureCatalogFragment.class, null, null).f();
            case 9:
                return new t4r();
            case 10:
                int i2 = GamesCatalogDetailFragment.d0;
                Object obj = uca.a;
                b.d i3 = com.vk.toggle.b.A.i(SaFeatures.SA_APP_VIEW_PART_RECS);
                int i4 = 50;
                if (i3 != null && (g = i3.g()) != null) {
                    i4 = g.optInt("view_percentage", 50);
                }
                return Float.valueOf(i35.k(i4 / 100.0f, 2));
            case 11:
                return s3q0.a;
            case 12:
                return new a390();
            case 13:
                return com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORIES_INTERESTING_BLOCK);
            case 14:
                return new Regex("donut_payment(-?\\d+)");
            case 15:
                return new ne6();
            case 16:
                qcy<Object>[] qcyVarArr3 = MaxUtilityStubComponent.b;
                return new MaxUtilityStubComponent.a();
            case 17:
                return new Regex("([-0-9]+)_([0-9]+)");
            case 18:
                o2l.a.getClass();
                return Long.valueOf(BuildInfo.h() ? Preference.j().getLong("__dbg_apply_spaces_chat", 0L) : 0L);
            case 19:
                return Boolean.valueOf(MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.h());
            case 20:
                return s3q0.a;
            case 21:
                qcy<Object>[] qcyVarArr4 = NewsfeedFragment.J0;
                ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 22:
                return "Activity.onPause";
            case 23:
                return e43.l(ey60.b.C2841b.b, new ey60.a.C2840a(ds60.a.C2747a.b), new ey60.a.C2840a(ds60.a.b.b));
            case 24:
                return new v1r0();
            case 25:
                return hd60.a().a().H().l0();
            case 26:
                return Long.valueOf(ProcessorStatistics.d());
            case 27:
                return s3q0.a;
            case 28:
                return dhr0.t.a(R.drawable.bg_selected_style);
            default:
                TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 1, 1.0f, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                translateAnimation.setDuration(700L);
                translateAnimation.setStartOffset(0L);
                translateAnimation.setRepeatMode(1);
                translateAnimation.setRepeatCount(-1);
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                return translateAnimation;
        }
    }
}
