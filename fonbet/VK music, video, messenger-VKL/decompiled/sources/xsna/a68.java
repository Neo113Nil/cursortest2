package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.gif.di.GifSelectorComponentImpl;
import com.vk.menu.di.MenuComponent;
import com.vk.music.playerservice.impl.PlayerServiceComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.focus.impl.di.VideoFocusComponentImpl;
import com.vk.video.music.api.di.MusicInVideoComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.clips.ClipsViewerEditSdkComponentVkApp;
import com.vkontakte.android.task.di.components.music.MusicStorageTypeComponentImpl;
import java.util.List;
import xsna.p2i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a68 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ a68(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        z = false;
        switch (this.b) {
            case 0:
                return new h58(((MenuComponent) ((k7m) m7m.f(b68.b)).a(fpf0.a(MenuComponent.class))).S2(), (wtn0) b68.i.getValue());
            case 1:
                qcy<Object>[] qcyVarArr = CatalogLegacyComponentImpl.b;
                return new m8a();
            case 2:
                return new ClipsViewerEditSdkComponentVkApp.a();
            case 3:
                com.vk.contacts.e eVar = com.vk.contacts.e.b;
                return Boolean.TRUE;
            case 4:
                return new GifSelectorComponentImpl.a();
            case 5:
                return new g3u();
            case 6:
                vwv vwvVar = vwv.b;
                return Boolean.FALSE;
            case 7:
                return new g80();
            case 8:
                return new q8b0();
            case 9:
                return new PlayerServiceComponentImpl.a();
            case 10:
                qcy<Object>[] qcyVarArr2 = MusicStorageTypeComponentImpl.d;
                return i850.a.getSTUB();
            case 11:
                FeedFeatures feedFeatures = FeedFeatures.FEED_NEW_CAROUSEL_PRODUCT_ITEM;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 12:
                List<String> list = p2i0.b;
                return p2i0.a.a(rl3.y0(new String[]{"value", "common_token"}));
            case 13:
                VKApplication.a aVar = VKApplication.c;
                return ((MusicInVideoComponent) m7m.e().a(fpf0.a(MusicInVideoComponent.class))).pb();
            case 14:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_OPEN_STANDALONE_BOTTOMSHEET_BGR_VIEW;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures) && BuildInfo.s()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                return new VideoFocusComponentImpl.a();
            case 16:
                return new com.vk.billing.f();
            case 17:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                Boolean bool = (Boolean) com.vk.core.apps.a.c(Boolean.TRUE, "com.vk.network.is_ssl_pinning");
                bool.getClass();
                return bool;
            case 18:
                return new cg90();
            case 19:
                return new llx0(new z3x0(z ? 1 : 0), ((VoipCallComponent) ((k7m) m7m.f(com.vk.voip.ui.c.b)).a(fpf0.a(VoipCallComponent.class))).s4(), com.vk.voip.ui.c.j0());
            default:
                return new jit();
        }
    }

    public /* synthetic */ a68(VKApplication vKApplication) {
        this.b = 13;
    }
}
