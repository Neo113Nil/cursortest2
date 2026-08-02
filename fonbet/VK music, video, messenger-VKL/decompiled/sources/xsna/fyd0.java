package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.SearchPlaylistViewHolder;
import com.vk.documents.impl.TypedDocumentsListFragment;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.photo.editor.features.mlenhance.TextSwitcherView;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profilelist.api.ProfileListData;
import com.vk.profilelist.impl.ProfileListRootFragment;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stories.design.view.editor.verticalization.VerticalizationLoadingView;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e6w0;
import xsna.hpe0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fyd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fyd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        yks0 yks0Var;
        int i = this.b;
        int i2 = 19;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i3 = ProfileListRootFragment.W;
                Bundle arguments = ((ProfileListRootFragment) obj).getArguments();
                ProfileListData profileListData = arguments != null ? (ProfileListData) arguments.getParcelable("profile_list_data") : null;
                if (profileListData != null) {
                    return profileListData;
                }
                return null;
            case 1:
                ((wh50) obj).setValue(0);
                return s3q0.a;
            case 2:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) obj;
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return new n3f0(new bbb0(reactionsFeedFragment, 6), new rkt(reactionsFeedFragment, 29), new kld0(reactionsFeedFragment, 1), new u210(reactionsFeedFragment, 21));
            case 3:
                return (idf0) obj;
            case 4:
                RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) obj;
                RecyclerView.n nVar = (RecyclerView.n) recyclerPaginatedView.getTag(R.id.vk_pending_decoration);
                if (nVar != null) {
                    recyclerPaginatedView.setItemDecoration(nVar);
                    recyclerPaginatedView.setTag(R.id.vk_pending_decoration, null);
                }
                return s3q0.a;
            case 5:
                return ((SharingComponent) ((k7m) m7m.f((m3g0) obj)).a(fpf0.a(SharingComponent.class))).P8();
            case 6:
                ((uig0) obj).c = null;
                return s3q0.a;
            case 7:
                ych0 ych0Var = (ych0) obj;
                return new bb40(new yqd0(ych0Var, 3), new jz70(ych0Var, i2));
            case 8:
                return Boolean.valueOf(((SearchPlaylistViewHolder) obj).b.J().c1());
            case 9:
                s8i0 s8i0Var = (s8i0) obj;
                s8i0Var.d(s8i0Var.j ? R.string.highlight_create_description_group : R.string.highlight_create_description);
                return s3q0.a;
            case 10:
                ((ikv0) obj).a();
                return s3q0.a;
            case 11:
                int i4 = StoryStatisticsStickersFragment.X;
                return ((UserProfileComponent) m7m.d((StoryStatisticsStickersFragment) obj).mo408a(fpf0.a(UserProfileComponent.class))).D8().a();
            case 12:
                d0u0.a(((TextSwitcherView) obj).c.animate().alpha(1.0f).setDuration(150L), new vo50(i2)).start();
                return s3q0.a;
            case 13:
                int i5 = TypedDocumentsListFragment.e0;
                UserId userId = (UserId) ((TypedDocumentsListFragment) obj).requireArguments().getParcelable("owner_id");
                return userId == null ? UserId.d : userId;
            case 14:
                VerticalizationLoadingView verticalizationLoadingView = (VerticalizationLoadingView) obj;
                int i6 = verticalizationLoadingView.y + 1;
                List<Integer> list = VerticalizationLoadingView.A;
                int size = i6 % list.size();
                verticalizationLoadingView.y = size;
                int intValue = list.get(size).intValue();
                TextView textView = verticalizationLoadingView.x;
                textView.setText(verticalizationLoadingView.getContext().getString(intValue));
                d0u0.a(textView.animate().alpha(1.0f).setDuration(150L), new yqd0(verticalizationLoadingView, 14)).start();
                return s3q0.a;
            case 15:
                return Integer.valueOf(((VideoAutoPlaySeekBarLayout2) obj).getResources().getDimensionPixelSize(R.dimen.video_autoplay_seekbar_large_touch_area_height));
            case 16:
                return new mca(((b9s0) obj).D.a.invoke());
            case 17:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj;
                if (videoCatalogRootVh.q) {
                    videoCatalogRootVh.p.c(false);
                } else {
                    gzs<s3q0> gzsVar = videoCatalogRootVh.s;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((DonutVideoComponent) ((k7m) m7m.c((dis0) obj)).a(fpf0.a(DonutVideoComponent.class))).J().a());
            case 19:
                return new com.vk.video.ui.discovery.minimizable.related_videos.b(((com.vk.video.ui.discovery.minimizable.g) obj).k);
            case 20:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper != null && (yks0Var = miniPlayerControllersWrapper.t) != null) {
                    videoMinimizableDiscoveryFragment.go(videoMinimizableDiscoveryFragment.requireContext(), yks0Var.e);
                }
                return s3q0.a;
            case 21:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj;
                return Boolean.valueOf(!(!mVar.l || mVar.k || (mVar.j instanceof VideoAnnounceState.Shown) || mVar.m || mVar.n));
            case 22:
                ((cys0) obj).b0.invoke(a.y.b);
                return s3q0.a;
            case 23:
                n4t0 n4t0Var = (n4t0) obj;
                VideoPlaylistReversionComponent videoPlaylistReversionComponent = (VideoPlaylistReversionComponent) n4t0Var.N.getValue();
                UserId userId2 = n4t0Var.b;
                long j = userId2.b;
                int i7 = n4t0Var.D;
                videoPlaylistReversionComponent.X3(i7, j);
                long j2 = userId2.b;
                wjs0.a(new fwr0(i7, j2));
                wjs0.a(new iwr0(i7, j2));
                return s3q0.a;
            case 24:
                Activity activity = ((jat0) obj).c;
                QualitySettingsType z = fxc0.B().z();
                QualitySettingsType p0 = fxc0.B().p0();
                hpe0.a aVar = new hpe0.a(activity.getString(R.string.video_quality_new_wifi));
                String string = activity.getString(R.string.video_quality_new_auto);
                String string2 = activity.getString(R.string.video_quality_new_auto_subtitle);
                QualitySettingsType qualitySettingsType = QualitySettingsType.WIFI_AUTO;
                hpe0.c cVar = new hpe0.c(new gpe0(R.id.video_quality_new_wifi_auto, string, string2, qualitySettingsType, qualitySettingsType == z));
                String string3 = activity.getString(R.string.video_quality_new_high);
                String string4 = activity.getString(R.string.video_quality_new_high_subtitle);
                QualitySettingsType qualitySettingsType2 = QualitySettingsType.WIFI_HIGH;
                hpe0.c cVar2 = new hpe0.c(new gpe0(R.id.video_quality_new_wifi_high, string3, string4, qualitySettingsType2, qualitySettingsType2 == z));
                String string5 = activity.getString(R.string.video_quality_new_econom);
                String string6 = activity.getString(R.string.video_quality_new_econom_subtitle);
                QualitySettingsType qualitySettingsType3 = QualitySettingsType.WIFI_ECONOM;
                hpe0.c cVar3 = new hpe0.c(new gpe0(R.id.video_quality_new_wifi_econom, string5, string6, qualitySettingsType3, qualitySettingsType3 == z));
                hpe0.a aVar2 = new hpe0.a(activity.getString(R.string.video_quality_new_mobile));
                String string7 = activity.getString(R.string.video_quality_new_auto);
                String string8 = activity.getString(R.string.video_quality_new_auto_subtitle);
                QualitySettingsType qualitySettingsType4 = QualitySettingsType.MOBILE_AUTO;
                hpe0.c cVar4 = new hpe0.c(new gpe0(R.id.video_quality_new_mobile_auto, string7, string8, qualitySettingsType4, qualitySettingsType4 == p0));
                String string9 = activity.getString(R.string.video_quality_new_high);
                String string10 = activity.getString(R.string.video_quality_new_high_subtitle);
                QualitySettingsType qualitySettingsType5 = QualitySettingsType.MOBILE_HIGH;
                hpe0.c cVar5 = new hpe0.c(new gpe0(R.id.video_quality_new_mobile_high, string9, string10, qualitySettingsType5, qualitySettingsType5 == p0));
                String string11 = activity.getString(R.string.video_quality_new_econom);
                String string12 = activity.getString(R.string.video_quality_new_econom_subtitle);
                QualitySettingsType qualitySettingsType6 = QualitySettingsType.MOBILE_ECONOM;
                return e43.l(aVar, cVar, cVar2, cVar3, aVar2, cVar4, cVar5, new hpe0.c(new gpe0(R.id.video_quality_new_mobile_econom, string11, string12, qualitySettingsType6, qualitySettingsType6 == p0)));
            case 25:
                fxc0.B().d((VideoFile) obj);
                return s3q0.a;
            case 26:
                return VideoView.D((VideoView) obj);
            case 27:
                Object obj2 = ((w73) obj).a;
                if (obj2 == null) {
                    obj2 = EmptyList.b;
                }
                return io.reactivex.rxjava3.core.q.T(obj2).r0(io.reactivex.rxjava3.android.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            case 28:
                return new lhv0(((khv0) obj).x());
            default:
                oaw0 oaw0Var = (oaw0) obj;
                String str = oaw0Var.q;
                if (str != null) {
                    oaw0Var.m.invoke(new e6w0.i.a(str));
                }
                return s3q0.a;
        }
    }
}
