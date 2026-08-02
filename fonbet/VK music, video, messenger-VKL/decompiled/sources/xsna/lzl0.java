package xsna;

import android.net.Uri;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetWatchTogetherVideosResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.catalog.mvi.block.video.impl.video.stackedlist.VideosStackedListView$State;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivityWithPip;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.f;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.video.profile.presentation.h;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.abw0;
import xsna.gm50;
import xsna.jhw0;
import xsna.klx0;
import xsna.kzw0;
import xsna.mlx0;
import xsna.n3t0;
import xsna.slx0;
import xsna.ump0;
import xsna.v59;
import xsna.ypr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lzl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lzl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Image image;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                jzl0.j(((StoryBottomViewGroup) obj2).B);
                return s3q0.a;
            case 1:
                f.b.h hVar = (f.b.h) obj2;
                StoryQuestionEntry storyQuestionEntry = (StoryQuestionEntry) obj;
                UserId userId = hVar.c;
                boolean z = hVar.d;
                if (userId != null) {
                    UserProfile userProfile = storyQuestionEntry.g;
                    return epx.f(userProfile != null ? userProfile.c : null, userId) ? StoryQuestionEntry.zb(storyQuestionEntry, z) : storyQuestionEntry;
                }
                int i2 = storyQuestionEntry.b;
                Integer num = hVar.b;
                return (num != null && i2 == num.intValue()) ? StoryQuestionEntry.zb(storyQuestionEntry, z) : storyQuestionEntry;
            case 2:
                return new ump0.a((wlp0) obj2);
            case 3:
                ppr0 ppr0Var = (ppr0) obj2;
                ypr0.b bVar = (ypr0.b) obj;
                cp2.c(ppr0Var.l, 0L, 0L, new a72(ppr0Var, 23), null, 11);
                gm50.a.a(ppr0Var, bVar.a, new ehm0(ppr0Var, 8));
                gm50.a.a(ppr0Var, bVar.b, new emh0(ppr0Var, 13));
                return s3q0.a;
            case 4:
                dw20 dw20Var = ((c2s0) obj2).b;
                if (dw20Var != null) {
                    String str = dw20.d1;
                    dw20Var.Sn(null);
                }
                return s3q0.a;
            case 5:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj2;
                videoAutoPlay.p0 = null;
                videoAutoPlay.K1(null);
                videoAutoPlay.p.b(null);
                videoAutoPlay.u1((d3b0) obj);
                return s3q0.a;
            case 6:
                VideoContainerActivityWithPip videoContainerActivityWithPip = (VideoContainerActivityWithPip) obj2;
                n3t0 n3t0Var = (n3t0) obj;
                int i3 = VideoContainerActivityWithPip.G;
                if (n3t0Var instanceof n3t0.c) {
                    n3t0.c cVar = (n3t0.c) n3t0Var;
                    ((VideoPip2Component) videoContainerActivityWithPip.x.getValue()).L3().onNext(new n3t0.c(cVar.a, cVar.b));
                } else if (n3t0Var instanceof n3t0.b) {
                    videoContainerActivityWithPip.finishAndRemoveTask();
                } else if (!(n3t0Var instanceof n3t0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 7:
                z2t0 z2t0Var = (z2t0) obj2;
                VideoGetAlbumsExtendedResponseDto videoGetAlbumsExtendedResponseDto = (VideoGetAlbumsExtendedResponseDto) obj;
                List<VideoVideoAlbumFullDto> d = videoGetAlbumsExtendedResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (VideoVideoAlbumFullDto videoVideoAlbumFullDto : d) {
                    int id = videoVideoAlbumFullDto.getId();
                    UserId q = videoVideoAlbumFullDto.q();
                    String title = videoVideoAlbumFullDto.getTitle();
                    int count = videoVideoAlbumFullDto.getCount();
                    List<VideoVideoImageDto> g = videoVideoAlbumFullDto.g();
                    if (g != null) {
                        z2t0Var.d.getClass();
                        image = q7o.i(g);
                    } else {
                        image = Image.d;
                    }
                    arrayList.add(new VideoAlbum(id, q, title, null, count, 0, image, false, null, false, false, 0, null, null, false, null, null, null, 262056, null));
                }
                VKList vKList = new VKList(arrayList);
                vKList.o(videoGetAlbumsExtendedResponseDto.getCount());
                return vKList;
            case 8:
                com.vk.video.profile.presentation.c cVar2 = (com.vk.video.profile.presentation.c) obj2;
                if (fxc0.B().J().j0()) {
                    cVar2.A.b(h.p.a);
                }
                return s3q0.a;
            case 9:
                return ((yat0) obj2).a.a().U(new qw80(new xd60((List) obj, 2), 14));
            case 10:
                ((VideoView) obj2).d.a((com.vk.fullscreenvideo.a) obj);
                return s3q0.a;
            case 11:
                irt0 irt0Var = (irt0) obj2;
                for (CachedVideoViewedSegments cachedVideoViewedSegments : (List) obj) {
                    irt0Var.a.put(new qg90(cachedVideoViewedSegments.b, Integer.valueOf(cachedVideoViewedSegments.c)), cachedVideoViewedSegments);
                }
                irt0Var.c = true;
                return s3q0.a;
            case 12:
                VideosStackedListView$State videosStackedListView$State = (VideosStackedListView$State) obj;
                return new VideosStackedListView$State(videosStackedListView$State.b, videosStackedListView$State.c, videosStackedListView$State.d, videosStackedListView$State.e, videosStackedListView$State.f, (VideoFile) obj2, videosStackedListView$State.h, videosStackedListView$State.i, videosStackedListView$State.j, videosStackedListView$State.k);
            case 13:
                z8u0 z8u0Var = (z8u0) obj2;
                List<GroupsGroupFullDto> d2 = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d2 == null) {
                    return EmptyList.b;
                }
                List<GroupsGroupFullDto> list = d2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : list) {
                    z8u0Var.r.getClass();
                    Group a = dqu.a(groupsGroupFullDto);
                    UserProfile userProfile2 = new UserProfile();
                    userProfile2.c = fkq0.e(a.c);
                    userProfile2.e = a.d;
                    userProfile2.h = a.e;
                    userProfile2.g = a.f;
                    arrayList2.add(userProfile2);
                }
                return arrayList2;
            case 14:
                ((com.vk.auth.ui.password.askpassword.a) obj2).b.I();
                return s3q0.a;
            case 15:
                tx txVar = ((VkAuthPhoneView) obj2).i;
                if (txVar != null) {
                    txVar.invoke();
                }
                return s3q0.a;
            case 16:
                kw8 kw8Var = (kw8) obj;
                long d3 = kw8Var.b.d();
                return kw8Var.e(new did(fyj0.a((SkeletonType) obj2, Math.min(Float.intBitsToFloat((int) (d3 >> 32)), Float.intBitsToFloat((int) (4294967295L & d3))) / kw8Var.getDensity()).a(d3, kw8Var.b.getLayoutDirection(), kw8Var), 1));
            case 17:
                return ((VkTopBar.e) obj2).d.a;
            case 18:
                yaw0 yaw0Var = (yaw0) obj2;
                abw0.b bVar2 = (abw0.b) obj;
                yaw0Var.i.setText(bVar2.b);
                yaw0Var.j.setItems(bVar2.c);
                yaw0Var.h.setRefreshing(bVar2.d);
                return s3q0.a;
            case 19:
                lcw0 lcw0Var = (lcw0) obj2;
                lcw0Var.getClass();
                lcw0Var.d(new ptb(lcw0Var, 5));
                return s3q0.a;
            case 20:
                ihw0 ihw0Var = (ihw0) obj2;
                jhw0.b bVar3 = (jhw0.b) obj;
                Preference.F(System.currentTimeMillis(), "voip_prefs_shared", "slider_moved");
                pla.e().b().b(HintId.VOIP_CALL_FEATURE_ONBOARDING_MENU.getId());
                ihw0Var.e.onNext(new v59.c(bVar3.g));
                ihw0Var.c(jhw0.b.e(bVar3, false, false, null, null, jhw0.d.b.a, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE));
                return s3q0.a;
            case 21:
                return mjw0.c((mjw0) obj2);
            case 22:
                VideoGetWatchTogetherVideosResponseDto videoGetWatchTogetherVideosResponseDto = (VideoGetWatchTogetherVideosResponseDto) obj;
                String f = videoGetWatchTogetherVideosResponseDto.f();
                iid iidVar = (iid) ((og0) obj2).c;
                List<VideoVideoFullDto> e = videoGetWatchTogetherVideosResponseDto.e();
                List<UsersUserFullDto> g2 = videoGetWatchTogetherVideosResponseDto.g();
                if (g2 == null) {
                    g2 = EmptyList.b;
                }
                List<GroupsGroupFullDto> d4 = videoGetWatchTogetherVideosResponseDto.d();
                if (d4 == null) {
                    d4 = EmptyList.b;
                }
                return new u6x0(f, iidVar.f(e, g2, d4), videoGetWatchTogetherVideosResponseDto.getCount());
            case 23:
                ((hzw0) obj2).T(new kzw0.d.a((Throwable) obj));
                return s3q0.a;
            case 24:
                int i4 = o1x0.g1;
                nr4.b().k(((o1x0) obj2).requireContext(), (String) obj);
                return s3q0.a;
            default:
                plx0 plx0Var = (plx0) obj2;
                String str2 = ((klx0.a) obj).a;
                plx0Var.getClass();
                f4z f4zVar = plx0Var.k;
                mlx0.a aVar = mlx0.a.a;
                if (str2 != null && drm0.D(str2, "editboard.team", false)) {
                    String queryParameter = Uri.parse(str2).getQueryParameter("hash");
                    if (queryParameter == null) {
                        f4zVar.b(aVar);
                    } else {
                        plx0Var.T(new slx0.d(queryParameter));
                    }
                } else if (str2 == null) {
                    f4zVar.b(aVar);
                } else {
                    plx0Var.T(new slx0.e(str2));
                }
                return s3q0.a;
        }
    }
}
