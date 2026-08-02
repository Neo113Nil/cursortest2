package xsna;

import android.content.Context;
import com.vk.ads.easypromote.impl.di.EasyPromoteComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.registration.funnels.di.SakAnalyticsComponentImpl;
import com.vk.search.communities.map.impl.di.SearchCommunitiesOnMapComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wb3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wb3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return a201.a().c();
            case 1:
                return Boolean.valueOf(Preference.j().getBoolean("prefetchAudioMsg", true));
            case 2:
                BuildInfo.Client client = BuildInfo.a;
                VKApplication vKApplication = com.vk.core.apps.a.a;
                return null;
            case 3:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                return ce60.b;
            case 4:
                return new ClipsPrefetchHelper();
            case 5:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SPORT_TOPSHELF_SUBSCRIBE;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 6:
                return new SakAnalyticsComponentImpl.a();
            case 7:
                return new EasyPromoteComponentImpl.a();
            case 8:
                return new SearchCommunitiesOnMapComponentImpl.a();
            case 9:
                int i = VkBlurView.C;
                return aeu.b();
            case 10:
                return asu0.a.z(5, "vk-scheduled-thread");
            case 11:
                return new lfv0();
            default:
                com.vk.voip.ui.c.p.getClass();
                Context context = e43.a;
                AccessibilityEvents.d dVar = new AccessibilityEvents.d(context != null ? context : null);
                dVar.b(new bpn0(new pm60(22)));
                return dVar.a();
        }
    }
}
