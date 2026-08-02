package xsna;

import com.vk.clips.sdk.stats.pixels.impl.di.AdStatPixelsComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.playlist.di.MusicClickByPlaylistItemHandlerAppComponentImpl;
import com.vk.network.di.NetworkTogglesComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VoipFeatures;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.writebar.di.WritebarComponentImpl;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qn6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qn6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new AdStatPixelsComponentImpl.a(new com.vk.movika.sdk.base.logic.interactor.g(7), new lt0(18));
            case 2:
                return Boolean.valueOf(BuildInfo.q());
            case 3:
                return ((VkClientMultiAccountComponent) ((k7m) m7m.f(m820.b)).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 4:
                return new MusicClickByPlaylistItemHandlerAppComponentImpl.a();
            case 5:
                FeedFeatures feedFeatures = FeedFeatures.FEED_DS_OVERLAY_PRODUCT_DESIGN;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 6:
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                return new w5m0();
            case 7:
                return "api.".concat(a0a.d);
            case 8:
                VKApplication.a aVar = VKApplication.c;
                return ((VideoGrowthComponent) m7m.e().a(fpf0.a(VideoGrowthComponent.class))).Z7();
            case 9:
                b.d i = com.vk.toggle.b.A.i(VoipFeatures.VOIP_MAX_ENTRY_POINTS);
                if (i == null) {
                    return null;
                }
                if (!i.a) {
                    i = null;
                }
                if (i != null) {
                    return i.c.toString();
                }
                return null;
            case 10:
                return new WritebarComponentImpl.a();
            case 11:
                return new NetworkTogglesComponentImpl.a();
            case 12:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                Boolean bool = (Boolean) com.vk.core.apps.a.c(Boolean.FALSE, "com.vk.benchmark.is_profileable");
                bool.getClass();
                return bool;
            case 13:
                return new vy50();
            default:
                return new wit();
        }
    }
}
