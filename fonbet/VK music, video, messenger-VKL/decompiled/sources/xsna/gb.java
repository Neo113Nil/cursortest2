package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.channels.dto.ChannelsInitializePaymentForMessagesPaidReactionsResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.impl.post_settings.e;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.components.common.BanDuration;
import com.vk.lists.ListDataSet;
import com.vk.media.pipeline.codec.CodecFeeder;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.playlist.api.di.MusicClickByPlaylistItemHandlerComponent;
import com.vk.music.playlist.display.domain.d;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.details.impl.name_history.e;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import com.vk.superapp.browser.internal.ui.banner.PersonalBannerView;
import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$BooleanRef;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import xsna.a3p0;
import xsna.aig;
import xsna.ang;
import xsna.ang.c;
import xsna.bwy;
import xsna.eeu0;
import xsna.f8l;
import xsna.gm50;
import xsna.h7u0;
import xsna.i640;
import xsna.ikv0;
import xsna.k840;
import xsna.lab;
import xsna.mwa;
import xsna.oj3;
import xsna.osh;
import xsna.qls;
import xsna.vm30;
import xsna.xl40;
import xsna.y050;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class gb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v100, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 5;
        int i3 = 2;
        int i4 = 3;
        char c = 1;
        char c2 = 1;
        int i5 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) obj3;
                View view = (View) obj2;
                qls.a aVar = (qls.a) obj;
                int i6 = AbsFriendsAndFollowersTabFragment.X;
                pls fo = absFriendsAndFollowersTabFragment.fo();
                fo.b.setVisibility(8);
                fo.c.setVisibility(8);
                fo.d.setVisibility(8);
                ViewGroup viewGroup = fo.f;
                viewGroup.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
                if (dVar != null) {
                    dVar.a = 5;
                }
                viewGroup.setLayoutParams(dVar);
                fo.g.setSeparatorAllowed(viewGroup.getChildCount() == 0);
                gm50.a.a(absFriendsAndFollowersTabFragment, aVar.a, new ab(i5, absFriendsAndFollowersTabFragment, view));
                return s3q0.a;
            case 1:
                nj3 nj3Var = (nj3) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                oj3.a aVar2 = (oj3.a) obj;
                gm50.a.a(nj3Var, aVar2.a, new g60(nj3Var, i2));
                int i7 = 4;
                gm50.a.a(nj3Var, aVar2.d, new uf1(i7, nj3Var, ref$BooleanRef));
                gm50.a.a(nj3Var, aVar2.e, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(nj3Var, i7));
                gm50.a.a(nj3Var, aVar2.b, new o43(i3, ref$BooleanRef, nj3Var));
                return s3q0.a;
            case 2:
                bq6 bq6Var = (bq6) obj3;
                com.vk.superapp.multiaccount.api.f fVar = (com.vk.superapp.multiaccount.api.f) obj2;
                kgq0 kgq0Var = bq6Var.l;
                if (kgq0Var != null) {
                    kgq0Var.a(fVar);
                }
                Context context = bq6Var.u;
                cq6 cq6Var = new cq6(bq6Var);
                j4 j4Var = new j4(c == true ? 1 : 0, bq6Var, fVar);
                eeu0.a aVar3 = new eeu0.a(context, R.style.VkAlertDialogThemePositive);
                aVar3.c = true;
                aVar3.B(R.string.vk_multiaccount_logout_dialog_title);
                aVar3.q(R.string.vk_multiaccount_logout_dialog_message);
                aVar3.setNegativeButton(R.string.vk_auth_exchange_delete_dialog_cancel, new z140(cq6Var));
                aVar3.j(cqm0.b(context.getString(R.string.vk_multiaccount_logout)), new a240(j4Var, i5));
                aVar3.m();
                return s3q0.a;
            case 3:
                myc0.h((yvj) obj3, null, null, new pu6((xwr) obj, (h6p0) obj2, null), 3);
                return s3q0.a;
            case 4:
                bi9 bi9Var = (bi9) obj3;
                bi9Var.d = false;
                bi9Var.c((StoryMusicInfo) obj2, (Throwable) obj);
                return s3q0.a;
            case 5:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, com.vk.channels.impl.comments.b.s((com.vk.channels.impl.comments.b) obj3, (mwa.a) obj2, false, 3), null, null, false, 14);
            case 6:
                kab kabVar = (kab) obj3;
                Pair pair = (Pair) obj;
                Integer num = (Integer) pair.d();
                ChannelsInitializePaymentForMessagesPaidReactionsResponseDto channelsInitializePaymentForMessagesPaidReactionsResponseDto = (ChannelsInitializePaymentForMessagesPaidReactionsResponseDto) pair.g();
                f4z f4zVar = kabVar.j;
                f4zVar.b(new lab.b(kabVar.f, kabVar.g, channelsInitializePaymentForMessagesPaidReactionsResponseDto.d(), ((sab) obj2).b, num.intValue()));
                f4zVar.b(lab.a.a);
                return s3q0.a;
            case 7:
                DialogMember dialogMember = (DialogMember) obj2;
                BanDuration banDuration = (BanDuration) obj;
                tsu tsuVar = ((azb) obj3).k;
                if (tsuVar != null) {
                    int h = banDuration.h();
                    xyb xybVar = (xyb) tsuVar.b;
                    if (xybVar.q.f) {
                        xybVar.x.b(h, dialogMember.b);
                    }
                }
                return s3q0.a;
            case 8:
                ((yle) obj3).a.V1(((a3p0.a.C2519a) obj2).e);
                return s3q0.a;
            case 9:
                ang angVar = (ang) obj3;
                ang.c cVar = (ang.c) obj2;
                oge0 oge0Var = angVar.c;
                Activity activity = angVar.b;
                ArrayList arrayList = cVar.b;
                oge0Var.i(activity, arrayList, new ang.a(activity, angVar.new c(arrayList, cVar.c)), Boolean.TRUE, (Boolean) obj);
                return s3q0.a;
            case 10:
                int i8 = CommunityNameHistoryFragment.S;
                gm50.a.a((CommunityNameHistoryFragment) obj3, ((e.b) obj).a, new m4g((UsableRecyclerPaginatedView) obj2, i2));
                return s3q0.a;
            case 11:
                ((wzs) obj3).invoke((osh.a) obj, (ExtendedCommunityProfile) obj2);
                return s3q0.a;
            case 12:
                ((izs) obj3).invoke(((f8l.a) obj2).c);
                return CodecFeeder.FeedStatus.CONTINUE;
            case 13:
                pcl pclVar = (pcl) obj3;
                Throwable th = (Throwable) obj;
                int b = pclVar.b((NewsComment) obj2);
                ListDataSet<cbg> listDataSet = pclVar.a;
                if (b >= 0) {
                    listDataSet.c(b).d = Boolean.FALSE;
                    listDataSet.d(b);
                }
                if (th instanceof VKApiExecutionException) {
                    Context context2 = e43.a;
                    j03.i(context2 != null ? context2 : null, (VKApiExecutionException) th);
                }
                return s3q0.a;
            case 14:
                izs izsVar = (izs) obj2;
                rvl rvlVar = ((svl) obj3).n;
                if (rvlVar != null) {
                    izsVar.invoke(Integer.valueOf(rvlVar.a));
                }
                return s3q0.a;
            case 15:
                DisplayMusicPlaylistFragment displayMusicPlaylistFragment = (DisplayMusicPlaylistFragment) obj3;
                com.vk.music.playlist.display.domain.b bVar = (com.vk.music.playlist.display.domain.b) obj2;
                com.vk.music.playlist.display.domain.d dVar2 = (com.vk.music.playlist.display.domain.d) obj;
                int i9 = DisplayMusicPlaylistFragment.b0;
                if (epx.f(dVar2, d.a.a)) {
                    h3p0.b(displayMusicPlaylistFragment);
                } else if (dVar2 instanceof d.k) {
                    ic40 w = displayMusicPlaylistFragment.fo().Le().w();
                    FragmentActivity kn = displayMusicPlaylistFragment.kn();
                    d.k kVar = (d.k) dVar2;
                    Playlist playlist = kVar.a;
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext = kVar.b;
                    MusicBottomSheetLaunchPoint.App app2 = MusicBottomSheetLaunchPoint.App.b;
                    Bundle arguments = displayMusicPlaylistFragment.getArguments();
                    ic40.j(w, kn, playlist, musicPlaybackLaunchContext, app2, arguments != null ? ne7.g(arguments) : null, 80);
                } else if (dVar2 instanceof d.o) {
                    maz.c(displayMusicPlaylistFragment.fo().p().e(), displayMusicPlaylistFragment.requireContext(), ((d.o) dVar2).a, LaunchContext.A, null, null, 24);
                } else if (dVar2 instanceof d.f) {
                    d.f fVar2 = (d.f) dVar2;
                    displayMusicPlaylistFragment.fo().Le().I(displayMusicPlaylistFragment.requireContext(), fVar2.a, fVar2.b);
                } else if (dVar2 instanceof d.l) {
                    ((MusicClickByPlaylistItemHandlerComponent) displayMusicPlaylistFragment.V.getValue()).o8(displayMusicPlaylistFragment.requireContext(), ((d.l) dVar2).a);
                } else if (dVar2 instanceof d.n) {
                    d.n nVar = (d.n) dVar2;
                    ic40.r(displayMusicPlaylistFragment.fo().Le().w(), displayMusicPlaylistFragment.kn(), new MusicBottomSheetLaunchPoint.Playlist(nVar.b), nVar.a, nVar.c, null, false, false, null, null, 480);
                } else if (dVar2 instanceof d.j) {
                    fl4 Le = displayMusicPlaylistFragment.fo().Le();
                    FragmentActivity kn2 = displayMusicPlaylistFragment.kn();
                    d.j jVar = (d.j) dVar2;
                    MusicTrack musicTrack = jVar.a;
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = jVar.b;
                    int i10 = fl4.a;
                    Le.k(kn2, musicTrack, musicPlaybackLaunchContext2, "");
                } else if (dVar2 instanceof d.i) {
                    displayMusicPlaylistFragment.fo().Le().u(displayMusicPlaylistFragment.requireContext(), ((d.i) dVar2).a);
                } else if (dVar2 instanceof d.m) {
                    y050 U = displayMusicPlaylistFragment.fo().Le().U();
                    FragmentActivity kn3 = displayMusicPlaylistFragment.kn();
                    d.m mVar = (d.m) dVar2;
                    Playlist playlist2 = mVar.a;
                    String str = mVar.b;
                    Bundle arguments2 = displayMusicPlaylistFragment.getArguments();
                    U.a(kn3, new y050.b.a(playlist2, str, str, null, arguments2 != null ? arguments2.getString("LAUNCH_ORIGIN", "unknown") : "unknown", 8));
                } else if (dVar2 instanceof d.C1347d) {
                    je50.b(displayMusicPlaylistFragment.requireContext(), ((d.C1347d) dVar2).a, new trf(bVar, 17));
                } else if (epx.f(dVar2, d.b.a)) {
                    int i11 = h7u0.p;
                    h7u0.a c3 = h7u0.b.c(displayMusicPlaylistFragment.requireContext());
                    c3.g0(R.string.music_confirm_downloading_by_mobile_net);
                    c3.U(R.string.music_confirm_downloading_by_mobile_net_description);
                    c3.W(R.string.music_forbid, new nfn());
                    c3.c0(R.string.music_allow, new yb5(bVar, i3));
                    c3.m();
                } else if (epx.f(dVar2, d.p.a)) {
                    com.vk.music.notifications.restriction.a aVar4 = k840.a.d;
                    MusicRestrictionPopupDisplayer.e(aVar4 != null ? aVar4 : null, displayMusicPlaylistFragment.requireContext(), "download", MusicPlaybackLaunchContext.d, null, null, null, 56);
                } else if (dVar2 instanceof d.g) {
                    d.g gVar = (d.g) dVar2;
                    ic40.j(displayMusicPlaylistFragment.fo().Le().w(), displayMusicPlaylistFragment.kn(), gVar.a, gVar.b, MusicBottomSheetLaunchPoint.Delete.b, null, PsExtractor.VIDEO_STREAM_MASK);
                } else if (epx.f(dVar2, d.h.a)) {
                    displayMusicPlaylistFragment.fo().Le().N(displayMusicPlaylistFragment.kn());
                } else if (epx.f(dVar2, d.e.a)) {
                    xl40 xl40Var = (xl40) displayMusicPlaylistFragment.W.getValue();
                    Context requireContext = displayMusicPlaylistFragment.requireContext();
                    xl40.a aVar5 = xl40.a;
                    xl40Var.a(requireContext);
                } else if (dVar2 instanceof d.r) {
                    com.vk.music.notifications.restriction.a aVar6 = k840.a.d;
                    if (aVar6 == null) {
                        aVar6 = null;
                    }
                    aVar6.a(((d.r) dVar2).a, null);
                } else if (dVar2 instanceof d.q) {
                    i0q0.f(new i3r(displayMusicPlaylistFragment.kn(), 2));
                } else {
                    if (!(dVar2 instanceof d.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Playlist playlist3 = ((d.c) dVar2).a;
                    FragmentActivity kn4 = displayMusicPlaylistFragment.kn();
                    String string = playlist3.Eb() ? kn4.getString(R.string.music_title_album) : kn4.getString(R.string.music_title_playlist);
                    String string2 = jnj.h(playlist3.O) ? kn4.getString(R.string.music_entity_will_be_added_to_my_collection, string) : kn4.getString(R.string.music_entity_will_be_added_to_my_music, string);
                    String string3 = jnj.h(playlist3.O) ? kn4.getString(R.string.music_entity_will_be_added_to_my_collection_description, cqm0.m(string)) : kn4.getString(R.string.music_entity_will_be_added_to_my_music_description, cqm0.m(string));
                    int i12 = h7u0.p;
                    h7u0.a c4 = h7u0.b.c(kn4);
                    c4.h0(string2);
                    c4.a.f = string3;
                    c4.W(R.string.cancel, new vld(c2 == true ? 1 : 0));
                    c4.c0(R.string.download, new ofn(bVar, i5));
                    c4.m();
                }
                return s3q0.a;
            case 16:
                s4o s4oVar = (s4o) obj;
                s4oVar.a(new wow(((h4o) obj3).c), ad0.i);
                s4oVar.b(new cbb((rg50) obj2, i4));
                return s3q0.a;
            case 17:
                ((bcq) obj3).h.onNext(new Result((ExtendedProfilesRepository.b) obj2));
                return s3q0.a;
            case 18:
                PostingSettings postingSettings = (PostingSettings) obj;
                ((m6r) obj3).a.d(new PostingAction.Fetch.SettingsLoadingState(LoadingState.FINISHED, postingSettings));
                wmi0.a.a("postingSettingsLocal" + ((UserId) obj2), postingSettings);
                return s3q0.a;
            case 19:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj3;
                int i13 = MarketEditAlbumGoodsFragment.c1;
                ((fy00) marketEditAlbumGoodsFragment.V0.getValue()).b(new by00(((GoodAlbumEditFlowEntity) obj2).Ab()));
                marketEditAlbumGoodsFragment.finish();
                return s3q0.a;
            case 20:
                LinearLayout linearLayout = new LinearLayout(((vm30) obj3).q);
                linearLayout.setOrientation(1);
                linearLayout.addView(((vm30.i) obj2).a);
                linearLayout.addView((View) obj);
                return linearLayout;
            case 21:
                ((i640) obj3).c.add(new i640.a(obj, (ohi0) obj2));
                return s3q0.a;
            case 22:
                Intent intent = (Intent) obj2;
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                ((ww50) obj3).getClass();
                if (intent != null) {
                    y760 y760Var = fragmentImpl instanceof y760 ? (y760) fragmentImpl : null;
                    if (y760Var != null) {
                        y760Var.h9(intent);
                    }
                }
                return s3q0.a;
            case 23:
                NewsEntry newsEntry = (NewsEntry) obj3;
                va60 va60Var = (va60) obj2;
                newsEntry.f = bwy.a.a;
                va60Var.b.remove(newsEntry);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                String Db = newsEntry.Db();
                bpn0 bpn0Var = cqm0.a;
                if (Db == null) {
                    Db = "";
                }
                String str2 = newsEntry.Cb().b;
                SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError(Db, str2 != null ? str2 : ""), 3);
                iid0 iid0Var = (iid0) va60Var.c.getValue();
                UiTracker uiTracker = UiTracker.a;
                iid0Var.f = UiTracker.c();
                iid0Var.g = b2;
                iid0Var.q();
                qr.d(ce60.b, 146, newsEntry);
                return s3q0.a;
            case 24:
                int i14 = PersonalBannerView.y;
                ((PersonalBannerView.a) obj3).a((String) obj2);
                return s3q0.a;
            case 25:
                TransformController transformController = (TransformController) obj3;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj2;
                transformController.e(oneVideoPlayer);
                return new x4b0(transformController, oneVideoPlayer);
            case 26:
                MusicTrack musicTrack2 = (MusicTrack) obj3;
                PodcastEpisodeFragment podcastEpisodeFragment = ((com.vk.music.podcast.impl.ui.episode.b) obj2).b;
                Episode episode = musicTrack2.w;
                if (episode != null) {
                    episode.c = false;
                }
                podcastEpisodeFragment.ko(musicTrack2);
                FragmentActivity activity2 = podcastEpisodeFragment.getActivity();
                if (activity2 != null) {
                    ikv0.a aVar7 = new ikv0.a(activity2);
                    aVar7.t = new ikv0.c.C3058c(R.drawable.vk_icon_favorite_circle_fill_yellow_28, (Integer) null, (Size) null, 14);
                    aVar7.u = new ikv0.d(activity2.getString(R.string.podcast_toast_unfave_done), (String) null, (ikv0.d.a) null, 6);
                    aVar7.n();
                }
                return s3q0.a;
            case 27:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.e eVar = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.e) obj3;
                List list = (List) obj2;
                if (!((onb0) obj).b) {
                    return io.reactivex.rxjava3.core.x.i(new RuntimeException("can't delete vote"));
                }
                UserId userId = eVar.a;
                int i15 = eVar.b;
                boolean z = eVar.c;
                InteractivePollStickerView.b bVar2 = eVar.d;
                return rsg0.w0(new rtb0(userId, bVar2.a, bVar2.b, z, list, i15, ""));
            case 28:
                e.a aVar8 = (e.a) obj3;
                j7c0 j7c0Var = (j7c0) obj;
                j7c0 a = j7c0.a(j7c0Var, ChannelMsgSendConfig.a(j7c0Var.a, null, false, false, false, false, null, aVar8.c, aVar8.b, Boolean.valueOf(aVar8.d), false, false, false, false, null, 32063), null, aVar8.b, null, false, 26);
                ((com.vk.channels.impl.post_settings.b) obj2).s(a.a, null);
                return a;
            default:
                ((e6h0) obj3).m.a(new aig.a(((ScheduledCallViewItem.ScheduledCall) obj2).f.i));
                return s3q0.a;
        }
    }
}
