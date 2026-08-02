package xsna;

import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.newsfeed.common.views.header.PostHeaderSubtitleTextView;
import com.vk.newsfeed.impl.di.PostingSettingsComponentImpl;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vkontakte.android.task.di.components.StickersBridgeComponentImpl;
import xsna.rwm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2c0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ d2c0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        GetSafeguardedInitializationPolicy initialize$lambda$220$lambda$218;
        char c = 1;
        switch (this.b) {
            case 0:
                ComFeatures comFeatures = ComFeatures.COM_EASY_PROMOTE;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 1:
                int i = PostHeaderSubtitleTextView.D;
                return rik0.b(4.0f);
            case 2:
                qcy<Object>[] qcyVarArr = PostingSettingsComponentImpl.d;
                return new tfc0();
            case 3:
                return (LinksGeneratorComponent) ((k7m) m7m.f(iuc0.b)).mo408a(fpf0.a(LinksGeneratorComponent.class));
            case 4:
                return new com.vk.billing.k();
            case 5:
                initialize$lambda$220$lambda$218 = ServiceProvider.initialize$lambda$220$lambda$218();
                return initialize$lambda$220$lambda$218;
            case 6:
                return s3q0.a;
            case 7:
                qcy<Object>[] qcyVarArr2 = StickersBridgeComponentImpl.b;
                return omg.a;
            case 8:
                return ((StoriesComponent) ((k7m) m7m.f(o0m0.b)).a(fpf0.a(StoriesComponent.class))).b();
            case 9:
                int i2 = rwm0.g;
                dhr0.a.getClass();
                return rwm0.a.d(dhr0.y());
            case 10:
                f9w f9wVar = d7o0.g;
                return "onOpen";
            case 11:
                return new ozr0(fxc0.B().J().a());
            case 12:
                int i3 = VideoCatalogRootVh.M0;
                return Boolean.valueOf(fxc0.B().J().e0().a);
            case 13:
                Object obj = VideoItemListSmallVh.c0;
                return new s290();
            case 14:
                return Boolean.valueOf(e370.s != null && com.vk.toggle.b.A.a(SaFeatures.SA_GAMES_NATIVE_INSTALL_SCREEN));
            case 15:
                return new wha(c == true ? 1 : 0);
            case 16:
                return (kfv0) jfv0.m.getValue();
            case 17:
                return s3q0.a;
            default:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.J().f();
        }
    }
}
