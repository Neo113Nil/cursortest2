package xsna;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.api.generated.market.dto.MarketAddAlbumResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.CatalogText;
import com.vk.catalog2.common.dto.api.channel.CatalogChannel;
import com.vk.catalog2.common.dto.ui.UIBlockChannel;
import com.vk.catalog2.common.dto.ui.UIBlockText;
import com.vk.catalog2.common.dto.ui.actions.UIBlockMusicFollowOwnerButton;
import com.vk.catalog2.feature.music.holders.MusicFollowOwnerButtonVh;
import com.vk.channels.impl.comments.g;
import com.vk.channels.impl.post_settings.e;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.im.MsgType;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photo.editor.markup.view.tools.button.FontButton;
import com.vk.photo.editor.markup.view.tools.utils.Anchor;
import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.clj0;
import xsna.e8v0;
import xsna.fh8;
import xsna.gh8;
import xsna.ikv0;
import xsna.ipz;
import xsna.ka40;
import xsna.mwa;
import xsna.nt7;
import xsna.orx;
import xsna.pp80;
import xsna.q6h0;
import xsna.rmy;
import xsna.sum0;
import xsna.u7h0;
import xsna.v8v;
import xsna.w8v;
import xsna.wk50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ju implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ju(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId userId;
        DownloadingState downloadingState;
        int i;
        Throwable th;
        int i2 = this.b;
        int i3 = 6;
        io.reactivex.rxjava3.internal.operators.observable.m1 m1Var = null;
        doe doeVar = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                ((ku) obj3).d((View) obj2);
                return s3q0.a;
            case 1:
                ((izs) obj3).invoke(new nt7.f((BookingButton.Action) obj, ((vu7) obj2).b.e));
                return s3q0.a;
            case 2:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) obj3;
                mwa.a aVar = (mwa.a) obj2;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                Integer num = bVar.h.d;
                if (num != null) {
                    bVar.n.add(Integer.valueOf(num.intValue()));
                }
                return com.vk.channels.impl.comments.g.a(gVar, com.vk.channels.impl.comments.b.s(bVar, aVar, false, 3), new g.a(false), aVar.a.bc() ? new g.b(0) : null, false, 8);
            case 3:
                gdb gdbVar = (gdb) obj2;
                j3a j3aVar = (j3a) obj;
                CatalogChannel catalogChannel = ((UIBlockChannel) obj3).y;
                if (catalogChannel.b == j3aVar.a) {
                    catalogChannel.h = !catalogChannel.g && j3aVar.b;
                    gdbVar.a.a(catalogChannel);
                }
                return s3q0.a;
            case 4:
                toe toeVar = (toe) obj3;
                xne xneVar = toeVar.c;
                String str = (String) obj2;
                VideoFile videoFile = (VideoFile) ((Optional) obj).orElse(null);
                if (videoFile == null || (userId = videoFile.I0()) == null || egd.c(videoFile)) {
                    userId = null;
                }
                Integer valueOf = videoFile != null ? Integer.valueOf(videoFile.o0()) : null;
                if (userId != null && fkq0.b(userId)) {
                    t6g0 t6g0Var = t6g0.b;
                    Group C0 = t6g0.b().C0(fkq0.a(userId));
                    doeVar = new doe(userId, C0 != null ? C0.e() : xneVar.a(k15.B(videoFile)), valueOf);
                } else if (userId != null) {
                    if (!o25.a().a(userId) && !xneVar.a(k15.B(videoFile))) {
                        r7 = false;
                    }
                    doeVar = new doe(userId, r7, valueOf);
                }
                toeVar.b.f(str, doeVar);
                return s3q0.a;
            case 5:
                i8f i8fVar = (i8f) obj3;
                n7f n7fVar = (n7f) obj2;
                List<ClipsProcessedItem> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (ClipsProcessedItem clipsProcessedItem : list) {
                    i8fVar.getClass();
                    arrayList.add(i8f.u7(clipsProcessedItem, n7fVar, null));
                }
                return arrayList;
            case 6:
                return new uvl((ViewGroup) obj, new dyh((fyh) obj3), ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.h) obj2).invoke()).booleanValue(), cn70.b(16));
            case 7:
                ArrayList arrayList2 = ((ContextMenuScreenContent) obj3).b;
                ((rry) obj).a(arrayList2.size(), new hoj(new com.vk.movika.sdk.base.observable.i(22), arrayList2), new ioj(arrayList2, 0), new jai(-1117249557, new joj(r8, (wh50) obj2, arrayList2), true));
                return s3q0.a;
            case 8:
                drx drxVar = (drx) obj3;
                GroupsGetFriendsInvitationListResponseDto groupsGetFriendsInvitationListResponseDto = (GroupsGetFriendsInvitationListResponseDto) obj;
                ArrayList W = drxVar.W(groupsGetFriendsInvitationListResponseDto.i());
                InviteFriendsTabIndex inviteFriendsTabIndex = InviteFriendsTabIndex.NOT_INVITED;
                drxVar.T(new orx.c.C3467c(inviteFriendsTabIndex, bsx.a(frx.e((erx) obj2, inviteFriendsTabIndex).c, W, groupsGetFriendsInvitationListResponseDto.g())));
                return s3q0.a;
            case 9:
                a.g.d dVar = (a.g.d) obj2;
                List<cf10> list2 = ((ft00) obj3).l;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                for (cf10 cf10Var : list2) {
                    if (cf10Var.a == dVar.b) {
                        cf10Var = cf10.a(cf10Var, false, false, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
                    }
                    arrayList3.add(cf10Var);
                }
                return new c.l(arrayList3);
            case 10:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj3;
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) obj2;
                MarketAddAlbumResponseDto marketAddAlbumResponseDto = (MarketAddAlbumResponseDto) obj;
                int i4 = MarketEditAlbumGoodsFragment.c1;
                io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(marketAddAlbumResponseDto);
                Integer d = marketAddAlbumResponseDto.d();
                if (d != null) {
                    int intValue = d.intValue();
                    UserId userId2 = goodAlbumEditFlowEntity.b;
                    List<Long> list3 = goodAlbumEditFlowEntity.i;
                    marketEditAlbumGoodsFragment.getClass();
                    m1Var = MarketEditAlbumGoodsFragment.Jo(userId2, intValue, list3);
                }
                return T.L0(m1Var, new pi0(new cc5(i3), 25));
            case 11:
                w920 w920Var = (w920) obj3;
                jpz jpzVar = (jpz) obj;
                gj30 c = w920Var.c();
                c.getClass();
                gj30 gj30Var = new gj30(c);
                gj30 gj30Var2 = jpzVar.a;
                w920Var.g(gj30Var2, jpzVar.b);
                gj30 c2 = w920Var.c();
                c2.getClass();
                return new v8v.a(new w8v.a(gj30Var, new gj30(c2), gj30Var2, ((ipz.a) obj2).a.c));
            case 12:
                e140 e140Var = (e140) obj3;
                NumberPicker numberPicker = ((d140) obj2).a;
                if (numberPicker == null) {
                    numberPicker = null;
                }
                int value = numberPicker.getValue();
                cew cewVar = cew.b;
                cewVar.getClass();
                cew.h().edit().putInt("pref_message_expiration_option_index", value).apply();
                e140Var.d();
                ((d98) e140Var.l.getValue()).g.X(5);
                e140Var.a();
                izs<? super MsgType, s3q0> izsVar = e140Var.s;
                izs<? super MsgType, s3q0> izsVar2 = izsVar != null ? izsVar : null;
                long[] jArr = e140Var.r;
                cewVar.getClass();
                izsVar2.invoke(new MsgType.WithTtl(jArr[cew.h().getInt("pref_message_expiration_option_index", 0)]));
                return s3q0.a;
            case 13:
                String str2 = ka40.B;
                ka40.a.b((Activity) obj3, (Artist) obj, (MusicPlaybackLaunchContext) obj2, null);
                return s3q0.a;
            case 14:
                MusicFollowOwnerButtonVh musicFollowOwnerButtonVh = (MusicFollowOwnerButtonVh) obj3;
                UIBlockMusicFollowOwnerButton uIBlockMusicFollowOwnerButton = (UIBlockMusicFollowOwnerButton) obj2;
                BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) obj;
                musicFollowOwnerButtonVh.f = null;
                if (baseBoolIntDto == BaseBoolIntDto.YES) {
                    uIBlockMusicFollowOwnerButton.A = true;
                    musicFollowOwnerButtonVh.b(true);
                }
                return s3q0.a;
            case 15:
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT \n            audio_track.id, \n            audio_track.uid, \n            audio_track.mid, \n            audio_track.downloading_state, \n            audio_track.json_raw,\n            playlists_to_tracks.rowid\n        FROM audio_track\n        INNER JOIN playlists_to_tracks \n        ON audio_track.mid = playlists_to_tracks.music_track_id\n        AND audio_track.uid = playlists_to_tracks.uid\n        WHERE playlists_to_tracks.uid = ? AND playlists_to_tracks.playlist_id = ?\n    ");
                try {
                    V0.D3(1, str3);
                    V0.D3(2, str4);
                    ArrayList arrayList4 = new ArrayList();
                    while (V0.step()) {
                        UserId b = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i5 = (int) V0.getLong(3);
                        if (i5 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i5 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i5 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i5 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i5 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        arrayList4.add(new ic50((int) V0.getLong(5), downloadingState, b, l2, V0.l2(4)));
                    }
                    return arrayList4;
                } finally {
                    V0.close();
                }
            case 16:
                bi20 bi20Var = (bi20) obj2;
                CatalogText catalogText = (CatalogText) obj;
                ((w060) obj3).getClass();
                return new UIBlockText(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, bi20Var.p.getString(TtmlNode.TAG_STYLE), catalogText.b, catalogText.c, catalogText.d, catalogText.e);
            case 17:
                ((ux90) obj3).c.add(((VkUiPermissionsHandler.Permissions) obj2).h());
                return s3q0.a;
            case 18:
                ((etv0) obj).b(false);
                ((p1a0) obj3).d.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.e.b);
                return s3q0.a;
            case 19:
                MusicTrack musicTrack = (MusicTrack) obj3;
                PodcastEpisodeFragment podcastEpisodeFragment = ((com.vk.music.podcast.impl.ui.episode.b) obj2).b;
                Episode episode = musicTrack.w;
                if (episode != null) {
                    episode.c = true;
                }
                podcastEpisodeFragment.ko(musicTrack);
                FragmentActivity activity = podcastEpisodeFragment.getActivity();
                if (activity != null) {
                    ikv0.a aVar2 = new ikv0.a(activity);
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_favorite_circle_fill_yellow_28, (Integer) null, (Size) null, 14);
                    aVar2.u = new ikv0.d(activity.getString(R.string.podcast_toast_fave_done), (String) null, (ikv0.d.a) null, 6);
                    aVar2.n();
                }
                return s3q0.a;
            case 20:
                com.vk.channels.impl.post_settings.b bVar2 = (com.vk.channels.impl.post_settings.b) obj2;
                j7c0 j7c0Var = (j7c0) obj;
                ChannelMsgSendConfig channelMsgSendConfig = j7c0Var.a;
                e.C0542e c0542e = (e.C0542e) ((com.vk.channels.impl.post_settings.e) obj3);
                pp80 pp80Var = c0542e.b;
                pp80Var.getClass();
                if (pp80Var.equals(pp80.a.a)) {
                    i = -1;
                } else {
                    if (!(pp80Var instanceof pp80.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = ((pp80.b) pp80Var).a * 86400;
                }
                j7c0 a = j7c0.a(j7c0Var, ChannelMsgSendConfig.a(channelMsgSendConfig, null, false, false, false, false, Integer.valueOf(i), null, null, null, false, false, false, false, null, 32735), c0542e.b, null, null, false, 28);
                bVar2.s(a.a, null);
                return a;
            case 21:
                PostingFragment postingFragment = (PostingFragment) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                int i6 = PostingFragment.L0;
                if (((brj0) obj).a == 0) {
                    PostingAction.Navigation.Back back = PostingAction.Navigation.Back.b;
                    postingFragment.getClass();
                    xn50.a.c(postingFragment, back);
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 22:
                ((p6h0) obj3).m.a(new q6h0.a(((u7h0.a) obj2).c));
                return s3q0.a;
            case 23:
                c1h c1hVar = (c1h) obj3;
                long j = ((q9x) obj).a;
                vuj vujVar = ((koh0) obj2).f.a;
                ((zak0) c1hVar.f).setValue(new q9x(j));
                ((zak0) c1hVar.g).setValue(Integer.valueOf(an10.b(vujVar.a(pli.w(j), c1hVar)) / 2));
                return s3q0.a;
            case 24:
                clj0 clj0Var = (clj0) obj3;
                Throwable th2 = (Throwable) obj;
                rmy rmyVar = ((gh8.g) obj2).a;
                boolean z = th2 instanceof clj0.a;
                clj0.a aVar3 = z ? (clj0.a) th2 : null;
                String g = aVar3 != null ? aVar3.g() : null;
                clj0.a aVar4 = z ? (clj0.a) th2 : null;
                String h = aVar4 != null ? aVar4.h() : null;
                clj0.a aVar5 = z ? (clj0.a) th2 : null;
                if (aVar5 == null || (th = aVar5.d()) == null) {
                    th = th2;
                }
                ((pvw0) clj0Var.c.b().b).A(th instanceof VKApiExecutionException ? ((VKApiExecutionException) th).s() : 0, g, h, rmyVar instanceof rmy.b);
                clj0Var.e.invoke(new fh8.j.b(rmyVar, th2));
                return s3q0.a;
            case 25:
                wk50.a aVar6 = (wk50.a) obj3;
                rnj0 rnj0Var = (rnj0) obj2;
                SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) j5g.a0((List) obj);
                if (sdkClipVideoFile == null) {
                    return s3q0.a;
                }
                aVar6.b(new q2d(sdkClipVideoFile));
                if (rnj0Var.b.L().d) {
                    wie wieVar = (wie) rnj0Var.a.c;
                    if (wieVar.isEnabled()) {
                        wieVar.a(sdkClipVideoFile);
                    }
                }
                return s3q0.a;
            case 26:
                StickerStockItem stickerStockItem = (StickerStockItem) obj3;
                k5l0 k5l0Var = (k5l0) obj2;
                VmojiAvatar vmojiAvatar = stickerStockItem.H;
                if (vmojiAvatar != null) {
                    k5l0Var.m.d(vmojiAvatar);
                } else {
                    k5l0Var.n.a(k5l0Var.l.getContext(), stickerStockItem);
                }
                return s3q0.a;
            case 27:
                ((Boolean) obj).getClass();
                ((izs) obj3).invoke(sum0.d.a((sum0.d) obj2, null, null, null, false, null, false, null, !r12.h, 0, null, false, false, 3967));
                return s3q0.a;
            case 28:
                ((Photo) obj3).x = (List) obj2;
                return s3q0.a;
            default:
                ffo0 ffo0Var = (ffo0) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                gzs gzsVar = (gzs) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                ViewGroup viewGroup = ffo0Var.m;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                RecyclerView recyclerView = ffo0Var.o;
                RecyclerView recyclerView2 = recyclerView == null ? null : recyclerView;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                float width = recyclerView.getWidth();
                FontButton fontButton = ffo0Var.p;
                if (fontButton == null) {
                    fontButton = null;
                }
                AnimatorSet a2 = lkf0.a(viewGroup, recyclerView2, width, fontButton, Anchor.End);
                ViewGroup viewGroup2 = ffo0Var.k;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                RecyclerView recyclerView3 = ffo0Var.n;
                animatorSet.playTogether(a2, lkf0.b(viewGroup2, recyclerView3 == null ? null : recyclerView3, (recyclerView3 != null ? recyclerView3 : null).getWidth(), frameLayout, Anchor.Start));
                animatorSet.addListener(new dfo0(gzsVar));
                animatorSet.start();
                return s3q0.a;
        }
    }

    public /* synthetic */ ju(String str, String str2, fb50 fb50Var) {
        this.b = 15;
        this.c = str;
        this.d = str2;
    }
}
