package xsna;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.tabbar.dto.TabbarGetSettingsResponseDto;
import com.vk.api.generated.tabbar.dto.TabbarItemDto;
import com.vk.api.generated.tabbar.dto.TabbarItemNameDto;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import com.vk.channels.api.Channel;
import com.vk.clips.design.view.QRSharingView;
import com.vk.clips.design.view.sidecontrols.side.reactions.ReactionsLoading;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stories.design.view.stats.tabs.info.mvi.g;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.voip.ui.settings.participants_view.j;
import java.util.ArrayList;
import java.util.List;
import one.video.player.OneVideoPlayer;
import xsna.hg1;
import xsna.n4n0;
import xsna.p9i0;
import xsna.tsb0;
import xsna.v1t0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ggb0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ggb0(com.vk.superapp.ui.a aVar, SuperAppWidget superAppWidget) {
        this.b = 21;
        this.c = superAppWidget;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        d3b0 d3b0Var;
        OneVideoPlayer a;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                ((lsb0) obj2).U(tsb0.e.a);
                break;
            case 2:
                Channel channel = (Channel) obj2;
                j7c0 j7c0Var = (j7c0) obj;
                break;
            case 3:
                PostingState.Editing editing = (PostingState.Editing) obj;
                ((qkc0) obj2).d.getClass();
                break;
            case 4:
                pvc0 pvc0Var = (pvc0) obj2;
                VKList vKList = (VKList) obj;
                lwc0 lwc0Var = pvc0Var.f;
                break;
            case 5:
                ((dad0) obj2).c();
                break;
            case 6:
                break;
            case 7:
                QRSharingView qRSharingView = (QRSharingView) obj2;
                Uri uri = qRSharingView.d;
                if (uri != null) {
                    nr4.b().D(qRSharingView.getContext(), uri.toString());
                } else {
                    qRSharingView.a(true);
                }
                break;
            case 8:
                break;
            case 9:
                zli0 zli0Var = (zli0) obj2;
                int intValue = ((Integer) obj).intValue();
                break;
            case 10:
                ((po5) obj2).invoke(p9i0.a.b);
                break;
            case 11:
                break;
            case 12:
                g1k0 g1k0Var = (g1k0) obj2;
                g1k0Var.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                g1k0Var.n.invoke();
                break;
            case 13:
                break;
            case 14:
                com.vk.stories.design.view.stats.tabs.info.mvi.c cVar = (com.vk.stories.design.view.stats.tabs.info.mvi.c) obj2;
                g.b bVar = (g.b) obj;
                RecyclerView recyclerView = cVar.d;
                View view = cVar.e;
                View view2 = cVar.c;
                if (bVar.a) {
                    bwt0.p0(view2, true);
                    bwt0.p0(view, false);
                    bwt0.p0(recyclerView, false);
                } else if (bVar.c != null) {
                    bwt0.p0(view2, false);
                    bwt0.p0(view, true);
                    bwt0.p0(recyclerView, false);
                } else {
                    bwt0.p0(view2, false);
                    bwt0.p0(view, false);
                    bwt0.p0(recyclerView, true);
                    cVar.f.submitList(bVar.b);
                }
                break;
            case 15:
                VKList vKList2 = (VKList) obj;
                if (((LoadStrategy) obj2) != LoadStrategy.CACHE_FIRST || !vKList2.isEmpty()) {
                    break;
                } else {
                    break;
                }
                break;
            case 16:
                ((Boolean) obj).booleanValue();
                ((zim0) obj2).f.r();
                break;
            case 17:
                hnm0 hnm0Var = (hnm0) obj2;
                StoriesContainer storiesContainer = (StoriesContainer) obj;
                if (storiesContainer.g.isEmpty()) {
                    break;
                } else {
                    break;
                }
            case 18:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((sum0) obj2).i).setValue(bool);
                break;
            case 19:
                ((jym0) obj2).b.b(b0n0.a);
                break;
            case 20:
                ((r4n0) obj2).c(new n4n0.a(new yo60.g.a((Throwable) obj)));
                break;
            case 21:
                SuperAppWidget superAppWidget = (SuperAppWidget) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    com.vk.superapp.ui.a.S1().g(superAppWidget);
                }
                break;
            case 22:
                TabbarGetSettingsResponseDto tabbarGetSettingsResponseDto = (TabbarGetSettingsResponseDto) obj;
                ((vvn0) obj2).e.getClass();
                List<TabbarItemDto> e = tabbarGetSettingsResponseDto.e();
                if (e != null) {
                    List<TabbarItemDto> list = e;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    for (TabbarItemDto tabbarItemDto : list) {
                        arrayList.add(new wvn0(tabbarItemDto.f(), tabbarItemDto.e().i(), tabbarItemDto.getTitle(), tabbarItemDto.d(), tabbarItemDto.e() == TabbarItemNameDto.EMPTY ? tabbarGetSettingsResponseDto.d() : null, tabbarItemDto.i()));
                    }
                    break;
                } else {
                    break;
                }
            case 23:
                k0p0 k0p0Var = (k0p0) obj2;
                Throwable th = (Throwable) obj;
                v1t0.b bVar2 = new v1t0.b(false);
                rwc rwcVar = k0p0Var.e;
                if (bVar2.a) {
                    rwcVar.a(ReactionsLoading.LOAD_ADD_DISLIKE);
                } else {
                    rwcVar.a(ReactionsLoading.LOAD_REMOVE_DISLIKE);
                }
                rwcVar.b(bVar2);
                k0p0Var.f.invoke(th);
                break;
            case 24:
                int i3 = UserProfileFragment.p0;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) ((UserProfileFragment) obj2).h0.getValue();
                hg1.j4 j4Var = new hg1.j4(UserProfileFragment.f.b);
                qVar.getClass();
                break;
            case 25:
                com.vk.movika.sdk.base.observable.a aVar = ((com.vk.voip.ui.settings.participants_view.k) obj2).l;
                if (aVar != null) {
                    aVar.invoke(j.d.e.a);
                }
                break;
            case 26:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj2;
                if (videoAutoPlay.J0() && (d3b0Var = videoAutoPlay.p0) != null && (a = d3b0Var.a()) != null) {
                    a.e();
                }
                break;
            case 27:
                gzs<s3q0> gzsVar = ((VideoCatalogHeaderDebrandedVh) obj2).i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 28:
                ((Boolean) obj).getClass();
                int i4 = VideoNewProfileHeaderViewV2.y;
                ((d8t0) obj2).invoke();
                break;
            default:
                int i5 = VideoOfflineFragment.f1;
                j03.j(((VideoOfflineFragment) obj2).getActivity(), (Throwable) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ggb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
