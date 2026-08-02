package xsna;

import android.content.Context;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.video.PromoBannerVh;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import com.vk.libvideo.live.impl.views.liveswipe.LiveSwipeView;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.stories.StorySettingsActivity;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.wall.AddGridView;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.Collections;
import xsna.b78;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gkc0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gkc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        OmImpressionOccurred initialize$lambda$220$lambda$158;
        LiveSwipeView liveSwipeView;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((ikc0) this.c).R7();
                break;
            case 1:
                break;
            case 2:
                ((qyc0) this.c).onClick();
                break;
            case 3:
                break;
            case 4:
                PromoBannerVh promoBannerVh = (PromoBannerVh) this.c;
                UIBlockPlaceholder uIBlockPlaceholder = promoBannerVh.i;
                if (uIBlockPlaceholder != null && (str = uIBlockPlaceholder.b) != null) {
                    promoBannerVh.c.b(new lwf0(Collections.singletonList(str)), false);
                }
                break;
            case 5:
                break;
            case 6:
                Context mo2getContext = ((AddGridView) this.c).mo2getContext();
                if (mo2getContext != null) {
                    xwk.d().getBrowser().k(mo2getContext, i5s.a(new StringBuilder("https://"), a0a.d, "/@vklive_app-add-market"), 0, mo2getContext.getString(R.string.goods));
                }
                break;
            case 7:
                initialize$lambda$220$lambda$158 = ServiceProvider.initialize$lambda$220$lambda$158((ServicesRegistry) this.c);
                break;
            case 8:
                ((io.reactivex.rxjava3.core.b) this.c).onComplete();
                break;
            case 9:
                SettingsListFragment settingsListFragment = (SettingsListFragment) this.c;
                int i = SettingsListFragment.X0;
                break;
            case 10:
                HorizontalRecyclerPaginationView a = ((znj0) this.c).h().a();
                if (a != null) {
                    a.Mk();
                }
                break;
            case 11:
                StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) this.c;
                int i2 = StickersDrawingViewGroup.j0;
                stickersDrawingViewGroup.invalidate();
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) this.c;
                int i3 = StorySettingsActivity.P;
                break;
            case 16:
                fmm0 fmm0Var = (fmm0) this.c;
                fmm0Var.j = false;
                fmm0Var.b.play();
                break;
            case 17:
                ((fuv0) this.c).close();
                break;
            case 18:
                ((com.vk.video.ad.b) this.c).f.play();
                break;
            case 19:
                break;
            case 20:
                yg5 autoPlay = ((hgs0) this.c).getAutoPlay();
                if (autoPlay != null && !autoPlay.P0()) {
                    z = true;
                }
                break;
            case 21:
                VideoEmbedFragment videoEmbedFragment = (VideoEmbedFragment) this.c;
                int i4 = VideoEmbedFragment.q0;
                break;
            case 22:
                break;
            case 23:
                VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = (VideoInteractiveFullscreenFragment) this.c;
                int i5 = VideoInteractiveFullscreenFragment.Q0;
                break;
            case 24:
                VideoLiveFragment.a aVar = ((VideoLiveFragment) this.c).O;
                if (aVar != null && (liveSwipeView = aVar.a) != null && (r0 = liveSwipeView.getCurrentVideoFile()) != null) {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    break;
                }
                break;
            case 25:
                break;
            case 26:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) this.c;
                int i6 = VideoOfflineFragment.f1;
                break;
            case 27:
                break;
            case 28:
                fxc0.B().d((VideoFile) this.c);
                break;
            default:
                ((b78.h) this.c).a().invoke(sx40.g.b);
                break;
        }
        return s3q0.a;
    }
}
