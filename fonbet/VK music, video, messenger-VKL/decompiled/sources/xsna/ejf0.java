package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.SearchPlaylistViewHolder;
import com.vk.core.tips.Tooltip;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.VideoFragment;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vk.sharing.im_engine_impl.di.SharingImEngineScopedComponentImpl;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.koj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ejf0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ejf0(VideoCatalogRootVh videoCatalogRootVh, Activity activity) {
        this.b = 16;
        this.c = videoCatalogRootVh;
    }

    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) obj;
                Object tag = recyclerPaginatedView.getTag(R.id.vk_pending_decoration);
                RecyclerView.n nVar = tag instanceof RecyclerView.n ? (RecyclerView.n) tag : null;
                if (nVar != null) {
                    recyclerPaginatedView.setItemDecoration(nVar);
                    recyclerPaginatedView.setTag(R.id.vk_pending_decoration, null);
                }
                return s3q0.a;
            case 1:
                hzf0 hzf0Var = (hzf0) obj;
                Iterator it = hzf0Var.h.entrySet().iterator();
                while (it.hasNext()) {
                    ((dzf0) ((Map.Entry) it.next()).getValue()).a();
                }
                Iterator it2 = hzf0Var.i.iterator();
                while (it2.hasNext()) {
                    ((a2t) it2.next()).d();
                }
                return s3q0.a;
            case 2:
                int i2 = SearchDocumentsListFragment.h0;
                FragmentActivity activity = ((SearchDocumentsListFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 3:
                l7m l7mVar = ((SearchPlaylistViewHolder) obj).g;
                return ((VideoKidsComponent) (l7mVar != null ? l7mVar : null).a(fpf0.a(VideoKidsComponent.class))).I4();
            case 4:
                return new sbj0(((SharingImEngineScopedComponentImpl) obj).a.s());
            case 5:
                koj0.a aVar = (koj0.a) obj;
                izs<AboutVideoItem.SimilarVideoRedesign, s3q0> izsVar = aVar.l;
                AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = (AboutVideoItem.SimilarVideoRedesign) ((zak0) aVar.m).getValue();
                if (similarVideoRedesign != null) {
                    izsVar.invoke(similarVideoRedesign);
                }
                return s3q0.a;
            case 6:
                k800 k800Var = ((v800) obj).h.a;
                Iterator it3 = ((HashMap) k800Var.b.d()).entrySet().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        str = (String) ((Map.Entry) it3.next()).getKey();
                        if (str != null) {
                        }
                    } else {
                        str = null;
                    }
                }
                if (str != null) {
                    return k800Var.j(str);
                }
                return null;
            case 7:
                int i3 = StoryStatisticsStickersFragment.X;
                return ((StoryViewerComponent) m7m.d((StoryStatisticsStickersFragment) obj).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 8:
                ((dpx0) obj).invoke();
                return s3q0.a;
            case 9:
                ((yg5) obj).play();
                return s3q0.a;
            case 10:
                sc2 sc2Var = ((Tooltip) obj).m;
                if (sc2Var != null) {
                    i0q0.g(sc2Var);
                }
                return s3q0.a;
            case 11:
                return Long.valueOf(((wlp0) obj).b());
            case 12:
                qcy<Object>[] qcyVarArr = UserEditProfileModalBottomSheet.s1;
                return ((UserProfileComponent) m7m.d((UserEditProfileModalBottomSheet) obj).mo408a(fpf0.a(UserProfileComponent.class))).X2();
            case 13:
                return "Source is null, videoFile= " + ((VideoAutoPlay) obj).u;
            case 14:
                return Integer.valueOf(((VideoAutoPlaySeekBarLayout2) obj).getResources().getDimensionPixelSize(R.dimen.video_autoplay_seekbar_small_touch_area_height));
            case 15:
                return ((VideoPromoComponent) ((k7m) m7m.f((b9s0) obj)).a(fpf0.a(VideoPromoComponent.class))).L();
            case 16:
                int i4 = VideoCatalogRootVh.M0;
                ((VideoCatalogRootVh) obj).m.c.getClass();
                return s3q0.a;
            case 17:
                return ((DonutVideoComponent) ((k7m) m7m.c((dis0) obj)).a(fpf0.a(DonutVideoComponent.class))).Qa();
            case 18:
                int i5 = VideoFragment.c0;
                return ((VideoMinimizablePlayerComponent) m7m.d((VideoFragment) obj).a(fpf0.a(VideoMinimizablePlayerComponent.class))).P7();
            case 19:
                return ((DonutVideoComponent) ((VideoItemListLargeVh) obj).j0.getValue()).wb();
            case 20:
                int i6 = VideoMinimizableDiscoveryFragment.p1;
                com.vk.video.ui.discovery.minimizable.related_videos.h P0 = ((VideoMinimizableDiscoveryFragment) obj).getFeature().Q.P0();
                if (P0 == null) {
                    return null;
                }
                if (P0 instanceof h.a) {
                    VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = ((h.a) P0).h;
                    if (videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist) {
                        return ((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource).b;
                    }
                    return null;
                }
                if ((P0 instanceof h.c) || P0.equals(h.b.a) || P0.equals(h.d.a)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj;
                return Boolean.valueOf((mVar.r || mVar.x || !mVar.v) ? false : true);
            case 22:
                n4t0 n4t0Var = (n4t0) obj;
                return Boolean.valueOf(((VideoPlaylistReversionComponent) n4t0Var.N.getValue()).L0(n4t0Var.D, n4t0Var.b.b));
            case 23:
                return Boolean.valueOf(((VideoView) obj).x0);
            case 24:
                return (zia) ((xhu0) obj).b.getValue();
            case 25:
                return ((MultiAccountComponent) ((k7m) m7m.f(((ufw0) obj).a)).a(fpf0.a(MultiAccountComponent.class))).c();
            default:
                int i7 = VoipScheduledCallsFragment.c0;
                return new l6h0(((VoipScheduledCallsFragment) obj).requireContext());
        }
    }

    public /* synthetic */ ejf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
