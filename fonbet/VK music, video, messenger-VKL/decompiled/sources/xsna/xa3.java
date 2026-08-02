package xsna;

import android.content.Context;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.core.ui.di.StatComponentImpl;
import com.vk.feed.settings.impl.di.NewsfeedSettingsComponentImpl;
import com.vk.music.snippet.player.di.AudioSnippetPlayerComponentImpl;
import com.vk.search.integration.followers.impl.di.SearchFollowersIntegrationComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.stereo.stub.common.di.VoipStereoRouterComponentStub;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.SuperAppMinimizablePlayerComponentImpl;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class xa3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xa3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Lazy lazy;
        VkBuildAppStore vkBuildAppStore = null;
        switch (this.b) {
            case 0:
                c63 c63Var = c63.a;
                return Boolean.valueOf(!c63.f);
            case 1:
                return new a1f();
            case 2:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 3:
                return new AudioSnippetPlayerComponentImpl.a();
            case 4:
                FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 5:
                return new ThreadPoolExecutor(1, 1, TimeUnit.SECONDS.toMillis(10L), TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new sk50(1));
            case 6:
                qcy<Object>[] qcyVarArr = StatComponentImpl.b;
                return new StatComponentImpl.b();
            case 7:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return new jfr();
            case 8:
                qcy<Object>[] qcyVarArr3 = SuperAppMinimizablePlayerComponentImpl.g;
                return new wxs0();
            case 9:
                VKApplication.a aVar = VKApplication.c;
                o2l.a.getClass();
                VkBuildAppStore.a aVar2 = VkBuildAppStore.Companion;
                String c = o2l.c("__dbg_app_store", "");
                aVar2.getClass();
                VkBuildAppStore[] values = VkBuildAppStore.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        VkBuildAppStore vkBuildAppStore2 = values[i];
                        if (epx.f(vkBuildAppStore2.i(), c)) {
                            vkBuildAppStore = vkBuildAppStore2;
                        } else {
                            i++;
                        }
                    }
                }
                if (vkBuildAppStore != null) {
                    return vkBuildAppStore;
                }
                lazy = VkBuildAppStore.DEFAULT$delegate;
                return (VkBuildAppStore) lazy.getValue();
            case 10:
                return new com.vk.core.ui.themes.a();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_HORIZONTAL;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_VERTICAL_FULLSCREEN_WITH_DIALOGS;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 13:
                Context context = e43.a;
                if (context != null) {
                    return context;
                }
                return null;
            case 14:
                return new SearchFollowersIntegrationComponentImpl.a();
            case 15:
                return new NewsfeedSettingsComponentImpl.a();
            case 16:
                return rl3.y0(new String[]{"app_starts_perf_common", "app_starts_perf_net", "app_starts_perf_ftr", "energy_consumption", "memory_leaks", "on_low_memory", "application_exit_info", "out_of_memory"});
            default:
                qcy<Object>[] qcyVarArr4 = VoipStereoRouterComponentStub.b;
                return new VoipStereoRouterComponentStub.b();
        }
    }

    public /* synthetic */ xa3(pzc0 pzc0Var) {
        this.b = 5;
    }
}
