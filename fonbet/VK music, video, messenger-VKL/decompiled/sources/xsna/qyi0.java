package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.stories.dto.StoriesBackgroundAnimatedDto;
import com.vk.api.generated.stories.dto.StoriesBackgroundDto;
import com.vk.api.generated.stories.dto.StoriesGetBackgroundsResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistToolbarVh;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoOwner;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.views.settings.SwitchSettingsView;
import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import com.vk.libvideo.offline.VideoDownloadServiceV2;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.superapp.animation.SuperAppAnimation;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.group_selector.ui.VoipGroupSelectorFragment;
import com.vk.voip.ui.history.friends.ui.a;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.Regex;
import xsna.b4;
import xsna.b6h0;
import xsna.dw20;
import xsna.fxw0;
import xsna.h7u0;
import xsna.iyq0;
import xsna.n1k0;
import xsna.o1k0;
import xsna.qr60;
import xsna.r4n0;
import xsna.to90;
import xsna.tww0;
import xsna.u4a;
import xsna.xcw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qyi0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qyi0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r6;
        String num;
        boolean z;
        mzp0 mzp0Var;
        VideoShareComponent value;
        VideoShareComponent value2;
        int i = this.b;
        int i2 = 24;
        int i3 = 15;
        r7 = null;
        com.vk.video.ui.share.api.b bVar = null;
        r7 = null;
        com.vk.video.ui.share.api.b bVar2 = null;
        Owner a = null;
        ljo0 ljo0Var = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ryi0 ryi0Var = (ryi0) obj2;
                NewsEntry newsEntry = (NewsEntry) obj;
                return pn60.c(ryi0Var.b, newsEntry, new syi0(newsEntry, ryi0Var.a), null, 12);
            case 1:
                GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
                Integer valueOf = Integer.valueOf(groupsGetObjectExtendedResponseDto.getCount());
                List<GroupsGroupFullDto> e = groupsGetObjectExtendedResponseDto.e();
                dqu dquVar = ((d9j0) obj2).f;
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : e) {
                    dquVar.getClass();
                    arrayList.add(dqu.a(groupsGroupFullDto));
                }
                return new Pair(valueOf, arrayList);
            case 2:
                return s3q0.a;
            case 3:
                c4 c4Var = ((n1k0.a) obj2).l;
                o1k0 o1k0Var = (o1k0) obj;
                if (o1k0Var.equals(o1k0.a.a)) {
                    c4Var.d(b4.d.a);
                } else {
                    if (!o1k0Var.equals(o1k0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c4Var.d(b4.d0.a);
                }
                return s3q0.a;
            case 4:
                kql0 kql0Var = (kql0) obj2;
                StoriesGetBackgroundsResponseDto storiesGetBackgroundsResponseDto = (StoriesGetBackgroundsResponseDto) obj;
                StoryBackgroundType storyBackgroundType = StoryBackgroundType.COLOR;
                ListBuilder e2 = e43.e();
                e2.add(new StoryBackground(storyBackgroundType, 9999, null, null, "#00000000", null, true, Integer.valueOf(R.string.story_background_pipette), null, 300, null));
                List<StoriesBackgroundDto> f = storiesGetBackgroundsResponseDto.f();
                Collection d = f != null ? kql0Var.d(storyBackgroundType, f) : null;
                if (d == null) {
                    d = EmptyList.b;
                }
                e2.addAll(d);
                s3q0 s3q0Var = s3q0.a;
                Pair pair = new Pair(storyBackgroundType, e2.g());
                StoryBackgroundType storyBackgroundType2 = StoryBackgroundType.GRAPHICS;
                List<StoriesBackgroundDto> d2 = storiesGetBackgroundsResponseDto.d();
                Object d3 = d2 != null ? kql0Var.d(storyBackgroundType2, d2) : null;
                if (d3 == null) {
                    d3 = EmptyList.b;
                }
                Pair pair2 = new Pair(storyBackgroundType2, d3);
                StoryBackgroundType storyBackgroundType3 = StoryBackgroundType.EMOJIES;
                List<StoriesBackgroundDto> g = storiesGetBackgroundsResponseDto.g();
                Object d4 = g != null ? kql0Var.d(storyBackgroundType3, g) : null;
                if (d4 == null) {
                    d4 = EmptyList.b;
                }
                Pair pair3 = new Pair(storyBackgroundType3, d4);
                StoryBackgroundType storyBackgroundType4 = StoryBackgroundType.GRADIENTS;
                List<StoriesBackgroundDto> i4 = storiesGetBackgroundsResponseDto.i();
                Object d5 = i4 != null ? kql0Var.d(storyBackgroundType4, i4) : null;
                if (d5 == null) {
                    d5 = EmptyList.b;
                }
                Pair pair4 = new Pair(storyBackgroundType4, d5);
                StoryBackgroundType storyBackgroundType5 = StoryBackgroundType.ANIMATED;
                List<StoriesBackgroundAnimatedDto> e3 = storiesGetBackgroundsResponseDto.e();
                if (e3 != null) {
                    List<StoriesBackgroundAnimatedDto> list = e3;
                    r6 = new ArrayList(c5g.u(list, 10));
                    for (StoriesBackgroundAnimatedDto storiesBackgroundAnimatedDto : list) {
                        hql0 hql0Var = (hql0) kql0Var.b.getValue();
                        StoryBackgroundType storyBackgroundType6 = StoryBackgroundType.ANIMATED;
                        hql0Var.getClass();
                        r6.add(new StoryBackground(storyBackgroundType6, storiesBackgroundAnimatedDto.g(), storiesBackgroundAnimatedDto.f(), storiesBackgroundAnimatedDto.i(), storiesBackgroundAnimatedDto.d(), storiesBackgroundAnimatedDto.e(), false, null, null, 448, null));
                    }
                } else {
                    r6 = 0;
                }
                if (r6 == 0) {
                    r6 = EmptyList.b;
                }
                Iterable<StoryBackground> iterable = (Iterable) r6;
                ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
                for (StoryBackground storyBackground : iterable) {
                    Integer num2 = storyBackground.c;
                    if (num2 != null && (num = num2.toString()) != null) {
                        File e4 = PrivateFiles.e(e8r.a, PrivateSubdir.STORIES_BACKGROUND, num, "mp4", 24);
                        Regex regex = com.vk.core.files.a.a;
                        if (!vhk0.g(e4)) {
                            e4 = null;
                        }
                        storyBackground = StoryBackground.zb(storyBackground, null, e4, 255);
                    }
                    arrayList2.add(storyBackground);
                }
                Pair pair5 = new Pair(storyBackgroundType5, arrayList2);
                StoryBackgroundType storyBackgroundType7 = StoryBackgroundType.MARUSIA;
                List<StoriesBackgroundDto> j = storiesGetBackgroundsResponseDto.j();
                Object d6 = j != null ? kql0Var.d(storyBackgroundType7, j) : null;
                if (d6 == null) {
                    d6 = EmptyList.b;
                }
                return pn00.m(pair, pair2, pair3, pair4, pair5, new Pair(storyBackgroundType7, d6));
            case 5:
                List list2 = (List) obj;
                Iterator<com.vk.upload.impl.b<StoryEntry>> it = ((azl0) obj2).l.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    com.vk.upload.impl.b next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    next.L((Parcelable) list2.get(i5));
                    i5 = i6;
                }
                return s3q0.a;
            case 6:
                r4n0.a aVar = (r4n0.a) obj2;
                aVar.a();
                r4n0.this.e(new s4n0(qr60.a.b.a));
                return s3q0.a;
            case 7:
                k7n0 k7n0Var = ((SuperAppAnimation) obj2).e;
                return Boolean.valueOf(!(k7n0Var != null && k7n0Var.f.m()));
            case 8:
                SwitchCompat switchCompat = ((SwitchSettingsView) obj2).c;
                (switchCompat == null ? null : switchCompat).setChecked(!(switchCompat != null ? switchCompat : null).isChecked());
                return s3q0.a;
            case 9:
                sbo0 sbo0Var = (sbo0) obj2;
                List list3 = (List) obj;
                ljo0 ljo0Var2 = sbo0Var.j2().n;
                if (ljo0Var2 != null) {
                    kjo0 kjo0Var = ljo0Var2.a;
                    us2 us2Var = kjo0Var.a;
                    nmo0 nmo0Var = sbo0Var.q;
                    o7g o7gVar = sbo0Var.A;
                    z = true;
                    ljo0Var = new ljo0(new kjo0(us2Var, nmo0.e(nmo0Var, o7gVar != null ? o7gVar.a() : l5g.k, 0L, null, null, 0L, null, 0, 0L, 16777214), kjo0Var.c, kjo0Var.d, kjo0Var.e, kjo0Var.f, kjo0Var.g, kjo0Var.h, kjo0Var.i, kjo0Var.j), ljo0Var2.b, ljo0Var2.c);
                    list3.add(ljo0Var);
                } else {
                    z = true;
                }
                return Boolean.valueOf(ljo0Var != null ? z : false);
            case 10:
                z8q0 z8q0Var = (z8q0) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                List A = rli0.A(rli0.u(rli0.t(rli0.k(new i5g(xgl0Var.o().k0(15, z8q0Var.b.c, Long.valueOf(r5.b))), MsgFromUser.class), new com.vk.repository.internal.repos.stickers.suggests.a(z8q0Var, 11)), new ap30(z8q0Var, i2)));
                List list4 = A;
                if (!list4.isEmpty()) {
                    xgl0Var.o().q0(list4);
                }
                return A;
            case 11:
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                rdi.y((gce0) obj2, new izs() { // from class: xsna.ydq0
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        return PublishState.a((PublishState) obj3, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, booleanValue, false, -1, 1791);
                    }
                });
                return s3q0.a;
            case 12:
                Clips clips = (Clips) obj2;
                VKList vKList = (VKList) ((it80) obj).a;
                return Clips.i(clips, null, vKList, null, vKList != null ? vKList.j() : null, false, myc0.f(vKList != null ? vKList.j() : null) && vKList != null && (vKList.isEmpty() ^ true), null, null, null, null, null, null, false, 524245);
            case 13:
                ((vnq0) obj2).k.clear();
                return s3q0.a;
            case 14:
                ((hyq0) obj2).T(iyq0.b.b);
                return s3q0.a;
            case 15:
                b9r0 b9r0Var = (b9r0) obj2;
                RecyclerPaginatedView recyclerPaginatedView = b9r0Var.e;
                if (recyclerPaginatedView == null) {
                    recyclerPaginatedView = null;
                }
                RecyclerView.o layoutManager = recyclerPaginatedView.getRecyclerView().getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null || linearLayoutManager.s() != 0) {
                    RecyclerPaginatedView recyclerPaginatedView2 = b9r0Var.e;
                    if (recyclerPaginatedView2 == null) {
                        recyclerPaginatedView2 = null;
                    }
                    recyclerPaginatedView2.getRecyclerView().scrollToPosition(0);
                    AppBarLayout appBarLayout = b9r0Var.c;
                    (appBarLayout != null ? appBarLayout : null).g(true, true, true);
                }
                return s3q0.a;
            case 16:
                ((VideoAuthorView) obj2).e.invoke(VideoAuthorView.Action.Subscribe);
                return s3q0.a;
            case 17:
                Pair pair6 = (Pair) obj;
                hda hdaVar = (hda) pair6.i();
                VideoOwner videoOwner = (VideoOwner) pair6.j();
                VideoFile videoFile = videoOwner.f;
                ((b9s0) obj2).f0 = videoFile;
                if (videoFile != null) {
                    UserProfile userProfile = videoOwner.g;
                    if (userProfile != null) {
                        a = userProfile.l0();
                    } else {
                        Group group = videoOwner.h;
                        if (group != null) {
                            a = tsj.a(group);
                        }
                    }
                    videoFile.f1(a);
                }
                return hdaVar;
            case 18:
                jas0 jas0Var = (jas0) obj2;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (epx.f(((VideoUploadEvent) obj3).b.d, jas0Var.b)) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 19:
                ((VideoDownloadServiceV2) obj2).o.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 20:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj2;
                List list5 = (List) obj;
                if (!list5.isEmpty() && (mzp0Var = gVar.E.b) != null) {
                    mzp0Var.c(false);
                }
                gVar.T(new n.l(list5));
                return s3q0.a;
            case 21:
                tgi0 tgi0Var = (tgi0) obj;
                int i7 = VideoOfflineFragment.f1;
                qgi0.r(tgi0Var, "VideoOfflineTopBarSettings");
                qgi0.h(tgi0Var, ((VideoOfflineFragment) obj2).requireContext().getString(R.string.video_download_settings_menu_title));
                return s3q0.a;
            case 22:
                VideoPlaylistToolbarVh videoPlaylistToolbarVh = (VideoPlaylistToolbarVh) obj2;
                Context context = ((View) obj).getContext();
                u4a.a aVar2 = videoPlaylistToolbarVh.f;
                if (((Boolean) videoPlaylistToolbarVh.q.getValue()).booleanValue()) {
                    VideoAlbum videoAlbum = videoPlaylistToolbarVh.o;
                    if (videoAlbum == null) {
                        videoAlbum = null;
                    }
                    mmm0 mmm0Var = new mmm0(videoPlaylistToolbarVh, i3);
                    h5t0 h5t0Var = new h5t0(1, videoPlaylistToolbarVh, VideoPlaylistToolbarVh.class, "trackClickToAnalytics", "trackClickToAnalytics(Lcom/vk/libvideo/bottomsheet/videoplaylist/VideoPlaylistBottomSheetRedesign$Action;)V", 0);
                    aVar2.getClass();
                    Lazy<VideoShareComponent> lazy = aVar2.S;
                    if (lazy != null && (value2 = lazy.getValue()) != null) {
                        bVar = value2.S();
                    }
                    new VideoPlaylistBottomSheetRedesign(new VideoPlaylistBottomSheetRedesign.a(videoAlbum, mmm0Var, h5t0Var, (rcg0) null, bVar)).c(e3m.h(context));
                } else {
                    VideoAlbum videoAlbum2 = videoPlaylistToolbarVh.o;
                    if (videoAlbum2 == null) {
                        videoAlbum2 = null;
                    }
                    zyl0 zyl0Var = new zyl0(videoPlaylistToolbarVh, 18);
                    i5t0 i5t0Var = new i5t0(1, videoPlaylistToolbarVh, VideoPlaylistToolbarVh.class, "trackClickToAnalytics", "trackClickToAnalytics(Lcom/vk/libvideo/bottomsheet/VideoPlaylistBottomSheet$Action;)V", 0);
                    aVar2.getClass();
                    Lazy<VideoShareComponent> lazy2 = aVar2.S;
                    if (lazy2 != null && (value = lazy2.getValue()) != null) {
                        bVar2 = value.S();
                    }
                    new VideoPlaylistBottomSheet(context, videoAlbum2, zyl0Var, i5t0Var, (rcg0) null, bVar2).c();
                }
                return s3q0.a;
            case 23:
                x9t0 x9t0Var = (x9t0) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return EmptyList.b;
                }
                boolean z2 = x9t0Var.b;
                return rl3.I(new hfz[]{z2 ? null : AboutVideoItem.k.b, new AboutVideoItem.r(z2)});
            case 24:
                ((Ref$LongRef) obj2).element = System.currentTimeMillis();
                return s3q0.a;
            case 25:
                ((qpw0) obj2).l.a(a.e.a);
                return s3q0.a;
            case 26:
                ((nrw0) obj2).q(xcw0.m.a);
                return s3q0.a;
            case 27:
                int i8 = euw0.f1;
                ((gzs) obj2).invoke();
                return s3q0.a;
            case 28:
                fxw0.a aVar3 = (fxw0.a) obj;
                tww0.c cVar = (tww0.c) ((tww0) obj2);
                if (cVar instanceof tww0.c.a) {
                    return fxw0.a.a(aVar3, null, null, 0L, 0L, null, null, null, fxw0.a.AbstractC2899a.C2900a.a, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33553407);
                }
                if (cVar instanceof tww0.c.b) {
                    return fxw0.a.a(aVar3, null, null, 0L, 0L, null, null, null, new fxw0.a.AbstractC2899a.b(((tww0.c.b) cVar).b), false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33553407);
                }
                throw new NoWhenBranchMatchedException();
            default:
                final VoipScheduledCallsFragment voipScheduledCallsFragment = (VoipScheduledCallsFragment) obj2;
                final u49 u49Var = (u49) obj;
                int i9 = VoipScheduledCallsFragment.c0;
                FragmentActivity activity = voipScheduledCallsFragment.getActivity();
                if (activity == null) {
                    return s3q0.a;
                }
                if (u49Var instanceof fp90) {
                    int i10 = h7u0.p;
                    h7u0.a c = h7u0.b.c(activity);
                    c.g0(R.string.voip_history_past_calls_dialog_confirm_delete_title);
                    c.U(R.string.voip_history_past_calls_dialog_confirm_delete_message);
                    c.c0(R.string.voip_history_past_calls_dialog_confirm_delete_yes, new DialogInterface.OnClickListener() { // from class: xsna.ryw0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            int i12 = VoipScheduledCallsFragment.c0;
                            to90.f fVar = new to90.f(((fp90) u49Var).a);
                            VoipScheduledCallsFragment voipScheduledCallsFragment2 = VoipScheduledCallsFragment.this;
                            voipScheduledCallsFragment2.getClass();
                            xn50.a.c(voipScheduledCallsFragment2, fVar);
                        }
                    });
                    c.W(R.string.cancel, new syw0());
                    c.m();
                } else if (u49Var instanceof b6h0) {
                    c6h0 c6h0Var = (c6h0) voipScheduledCallsFragment.Y.getValue();
                    b6h0 b6h0Var = (b6h0) u49Var;
                    k59<j59> k59Var = c6h0Var.b;
                    Context context2 = c6h0Var.a;
                    if (b6h0Var instanceof b6h0.c) {
                        b6h0.c cVar2 = (b6h0.c) b6h0Var;
                        txw0 txw0Var = new txw0(context2, cVar2.a, cVar2.b, k59Var);
                        txw0Var.D = new dw20.b(txw0Var.getContext(), null).D0(txw0Var, false).P0().O0().I0("VoipScheduledCallMenuView");
                    } else if (b6h0Var instanceof b6h0.b) {
                        wxw0 wxw0Var = new wxw0(context2, ((b6h0.b) b6h0Var).a, k59Var);
                        wxw0Var.x = new dw20.b(wxw0Var.getContext(), null).D0(wxw0Var, false).P0().O0().I0("VoipScheduledCallRemoveConfirmView");
                    } else {
                        if (!(b6h0Var instanceof b6h0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CallsUserId callsUserId = ((b6h0.a) b6h0Var).a;
                        VoipGroupSelectorConfig voipGroupSelectorConfig = new VoipGroupSelectorConfig("select_calls_from", callsUserId != null ? com.vk.voip.userid.a.b(callsUserId) : null, new VoipGroupSelectorConfig.TitleConfig.ResId(R.string.voip_scheduled_calls_from), new VoipGroupSelectorConfig.ButtonConfig.ResId(R.string.voip_call_by_link_call_as_button), false, true, 16, null);
                        vbs vbsVar = c6h0Var.c;
                        VoipGroupSelectorFragment voipGroupSelectorFragment = new VoipGroupSelectorFragment();
                        voipGroupSelectorFragment.setArguments(yfb.b(new Pair("arg_config", voipGroupSelectorConfig)));
                        voipGroupSelectorFragment.Fn(vbsVar, "VoipGroupSelectorFragment");
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ qyi0(www0 www0Var, tww0 tww0Var) {
        this.b = 28;
        this.c = tww0Var;
    }
}
