package xsna;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.media3.common.StreamKey;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketItemOwnerInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelFilter;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.ExternalAudio;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.PollInfo;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.reviews.api.model.CreateMarketItemReviewArguments;
import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsHistoryMetaDb;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.music.view.player.holders.tracklist.MusicBigPlayerTrackListHolder;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.states.VkAuthState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import one.video.exo.datasource.dash.parser.AudioTracksFilterMode;
import xsna.b9a0;
import xsna.bbl0;
import xsna.e5i;
import xsna.ea6;
import xsna.f0r;
import xsna.h7u0;
import xsna.npf;
import xsna.pdv0;
import xsna.qvq;
import xsna.t1r;
import xsna.tra0;
import xsna.wk50;
import xsna.xn50;
import xsna.xrh;
import xsna.ysk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class mp3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mp3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        BaseImageDto baseImageDto;
        MusicTrack f;
        ExternalAudio externalAudio;
        MusicTrack f2;
        MusicTrack f3;
        ExternalAudio externalAudio2;
        MusicTrack f4;
        String str;
        l1a0 l1a0Var;
        int i = this.b;
        int i2 = 4;
        int i3 = 3;
        String str2 = "";
        r5 = null;
        BannerType bannerType = null;
        r5 = null;
        String str3 = null;
        boolean z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        byte b = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                PollAttachment pollAttachment = (PollAttachment) obj;
                ((rp3) obj3).d = ((PollInfo) obj2).b;
                ysg0.b.a(new zrb0(pollAttachment.f));
                ce60.b.getClass();
                p870.f().e(120, pollAttachment);
                break;
            case 1:
                VkAuthState vkAuthState = (VkAuthState) obj3;
                Bundle bundle = (Bundle) obj2;
                Throwable th = (Throwable) obj;
                if (!(th instanceof AuthException.NeedSilentAuthException)) {
                    break;
                } else {
                    vdx0 vdx0Var = e370.e;
                    wfn0 e = (vdx0Var != null ? vdx0Var : null).e();
                    AuthException.NeedSilentAuthException needSilentAuthException = (AuthException.NeedSilentAuthException) th;
                    String g = needSilentAuthException.g();
                    String i4 = needSilentAuthException.i();
                    q55 q55Var = q55.a;
                    break;
                }
            case 2:
                g9u0 g9u0Var = (g9u0) obj3;
                ea6.a aVar = (ea6.a) obj2;
                long j = aVar.a;
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    Channel channel = (Channel) optional.get();
                    if (channel.B == GroupPrivacy.OPEN || channel.o) {
                        break;
                    }
                }
                break;
            case 3:
                kea keaVar = (kea) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                UIBlockList uIBlockList = keaVar.l;
                if (uIBlockList != null) {
                    uIBlockList.y = p4g.q(arrayList);
                }
                UIBlockList uIBlockList2 = keaVar.l;
                keaVar.l = null;
                if (uIBlockList2 != null) {
                    keaVar.q(uIBlockList2);
                }
                break;
            case 4:
                ChannelsHistoryMetaDb channelsHistoryMetaDb = ((gkb) obj3).c;
                channelsHistoryMetaDb.b.b().execSQL(xqm0.g("\n            UPDATE " + channelsHistoryMetaDb.a.a + " \n            SET " + ChannelsHistoryMetaDb.Column.FULLY_FETCHED.getKey() + " = ?\n            WHERE " + ChannelsHistoryMetaDb.Column.FILTER_ID + " = ?\n            "), new Object[]{Boolean.FALSE, Integer.valueOf(((ChannelFilter) obj2).i())});
                break;
            case 5:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj3;
                ((Boolean) obj).getClass();
                int i5 = ClipsWrapperFragment.Q0;
                npf.f.a aVar2 = new npf.f.a(((huf) obj2).a);
                clipsWrapperFragment.getClass();
                xn50.a.c(clipsWrapperFragment, aVar2);
                break;
            case 6:
                ((jpg) obj3).a.b(((xrh.d.a) obj2).b);
                break;
            case 7:
                e5i.a aVar3 = (e5i.a) obj3;
                String str4 = (String) obj2;
                String[] strArr = {aVar3.itemView.getContext().getString(R.string.open), aVar3.itemView.getContext().getString(R.string.profile_copy), aVar3.itemView.getContext().getString(R.string.share)};
                d5i d5iVar = new d5i(b, aVar3, str4);
                h7u0.a aVar4 = new h7u0.a(aVar3.itemView.getContext());
                aVar4.h0(str4);
                aVar4.T(strArr, d5iVar);
                aVar4.m();
                break;
            case 8:
                p8k p8kVar = (p8k) obj3;
                CreateMarketItemReviewArguments createMarketItemReviewArguments = (CreateMarketItemReviewArguments) obj2;
                MarketMarketItemFullDto marketMarketItemFullDto = (MarketMarketItemFullDto) obj;
                mzp0 mzp0Var = p8kVar.i;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                long j2 = createMarketItemReviewArguments.b;
                Float f5 = createMarketItemReviewArguments.d;
                float floatValue = f5 != null ? f5.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                String title = marketMarketItemFullDto.getTitle();
                MarketItemOwnerInfoDto W = marketMarketItemFullDto.W();
                String e2 = W != null ? W.e() : null;
                String str5 = e2 == null ? "" : e2;
                List<BaseImageDto> K0 = marketMarketItemFullDto.K0();
                if (K0 != null && (baseImageDto = (BaseImageDto) j5g.a0(K0)) != null) {
                    str3 = baseImageDto.getUrl();
                }
                p8kVar.T(new v8k(Long.valueOf(j2), str3 == null ? "" : str3, createMarketItemReviewArguments.c, str5, title, floatValue, EmptyList.b, 4103));
                break;
            case 9:
                ysk yskVar = (ysk) obj2;
                StreamKey streamKey = (StreamKey) obj;
                int i6 = streamKey.d;
                cj0 cj0Var = ((jx90) obj3).c.get(streamKey.c);
                List<e7g0> list = cj0Var.c;
                int i7 = cj0Var.b;
                if (i7 == 2) {
                    e7g0 e7g0Var = list.get(i6);
                    svz svzVar = yskVar.j;
                    androidx.media3.common.a aVar5 = e7g0Var.b;
                    svzVar.getClass();
                    float[] fArr = xk80.t0;
                    z = Boolean.TRUE.booleanValue();
                } else if (i7 == 1) {
                    AudioTracksFilterMode audioTracksFilterMode = yskVar.k;
                    int i8 = audioTracksFilterMode == null ? -1 : ysk.a.$EnumSwitchMapping$0[audioTracksFilterMode.ordinal()];
                    if (i8 == 1 ? i6 <= 0 : i8 == 2 ? i6 < list.size() / 2 : i8 == 3 ? i6 <= list.size() / 2 : i8 == 4 && i6 != list.size() - 1) {
                        z = false;
                    }
                }
                break;
            case 10:
                InfoBar infoBar = (InfoBar) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                dnm d = ((xgl0) obj).b().d();
                if (!epx.f(d.b(), infoBar)) {
                    d.d(infoBar);
                    d.e(false);
                    ref$BooleanRef.element = true;
                }
                break;
            case 11:
                ((wsp) obj3).c.h((hyg0) obj, (rjb0) obj2);
                break;
            case 12:
                ((f0r.o) obj3).h((wk50.a) obj2, (Throwable) obj);
                break;
            case 13:
                ((wk50.a) obj3).a(new qvq.b.c((qvq.i) obj2, (bpd) obj));
                break;
            case 14:
                List list2 = (List) obj3;
                ((nvy) obj).e(list2.size(), new qqs(new rv4(b, z ? 1 : 0), list2), new rqs(list2, 0), new jai(2039820996, new sqs(list2, (izs) obj2), true));
                break;
            case 15:
                ((b5v) obj3).o = (Photo) obj;
                ((ProgressDialog) obj2).cancel();
                break;
            case 16:
                qhd0 qhd0Var = (qhd0) obj2;
                Integer num = (Integer) obj;
                int i9 = ((gep) obj3).a;
                if (num != null && num.intValue() == i9) {
                    qhd0Var.setValue(Integer.valueOf(((Number) qhd0Var.getValue()).intValue() + 1));
                }
                break;
            case 17:
                ((oo00) obj3).m.a(new rq00((cle) obj2, (View) obj));
                break;
            case 18:
                MusicBigPlayerTrackListHolder musicBigPlayerTrackListHolder = (MusicBigPlayerTrackListHolder) obj3;
                com.vk.music.player.domain.state.a aVar6 = (com.vk.music.player.domain.state.a) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    com.vk.music.player.f fVar = aVar6.a;
                    Object[] objArr = (fVar == null || (f4 = fVar.f()) == null || f4.Vb()) ? false : true;
                    com.vk.music.player.f fVar2 = aVar6.a;
                    Object[] objArr2 = (fVar2 == null || (f3 = fVar2.f()) == null || (externalAudio2 = f3.H) == null || externalAudio2.e != 6) ? false : true;
                    com.vk.music.player.f fVar3 = aVar6.a;
                    boolean Mb = (fVar3 == null || (f2 = fVar3.f()) == null) ? false : f2.Mb();
                    com.vk.music.player.f fVar4 = aVar6.a;
                    bwt0.p0(musicBigPlayerTrackListHolder.t, !com.vk.core.apps.a.b() && objArr == true && !Mb && ((fVar4 == null || (f = fVar4.f()) == null || (externalAudio = f.H) == null) ? true : epx.f(externalAudio.d, "vk")));
                    TextView textView = musicBigPlayerTrackListHolder.x;
                    textView.setText((objArr2 == true || Mb) ? textView.getContext().getString(R.string.play_queue_litres) : textView.getContext().getString(R.string.play_queue));
                    musicBigPlayerTrackListHolder.m6(aVar6);
                }
                RecyclerView recyclerView = musicBigPlayerTrackListHolder.w;
                RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null || musicBigPlayerTrackListHolder.n.k() != linearLayoutManager.v()) {
                    musicBigPlayerTrackListHolder.m6(aVar6);
                }
                break;
            case 19:
                List list3 = (List) obj3;
                int intValue = ((Integer) obj).intValue() * 500;
                List subList = list3.subList(intValue, Math.min(intValue + 500, list3.size()));
                tfx tfxVar = new tfx("audio.getByMoosicId", new nq(i3), new wq(5));
                tfxVar.i("audios", subList);
                break;
            case 20:
                MusicTrackCellVh musicTrackCellVh = (MusicTrackCellVh) obj3;
                View view = (View) obj2;
                Set<String> set = MusicTrackCellVh.A;
                if (!musicTrackCellVh.d()) {
                    SearchStatInfoProvider searchStatInfoProvider = musicTrackCellVh.f;
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MUSIC;
                    UIBlockMusicTrack uIBlockMusicTrack = musicTrackCellVh.p;
                    if (uIBlockMusicTrack != null && (str = uIBlockMusicTrack.z.y) != null) {
                        str2 = str;
                    }
                    SearchStatsLoggingInfo b2 = searchStatInfoProvider.b(type, str2, false);
                    UIBlockMusicTrack uIBlockMusicTrack2 = musicTrackCellVh.p;
                    if (uIBlockMusicTrack2 != null) {
                        MusicTrack musicTrack = uIBlockMusicTrack2.z;
                        zf40 zf40Var = musicTrackCellVh.z;
                        if (zf40Var != null) {
                            zf40Var.b();
                        }
                        musicTrackCellVh.e.a(new cfp0(uIBlockMusicTrack2, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.ShowSimilarSerp)));
                        lyd.g().M(view.getContext(), musicTrack.Fb(), b2, Boolean.valueOf(jnj.c(musicTrack.V)));
                    }
                }
                break;
            case 21:
                ((fr50) obj3).D.sa(new NewsfeedExternalAction.c.InterfaceC1439c.d(((MyTargetInternalNativeAdBlsUiDto) obj2).i));
                break;
            case 22:
                e860 e860Var = (e860) obj3;
                String str6 = (String) obj2;
                e860Var.n1 = true;
                r1a0 r1a0Var = e860Var.t1;
                if (r1a0Var != null) {
                    r1a0Var.b(str6);
                }
                s1a0 s1a0Var = e860Var.u1;
                if (s1a0Var != null) {
                    q1a0 q1a0Var = e860Var.v1;
                    if (q1a0Var != null && (l1a0Var = q1a0Var.b) != null) {
                        bannerType = l1a0Var.d;
                    }
                    s1a0Var.b(bannerType);
                }
                break;
            case 23:
                Context context = (Context) obj3;
                Integer num2 = (Integer) obj2;
                List list4 = (List) obj;
                if (list4.isEmpty()) {
                    enj.q(R.string.post_not_found, 0, context);
                } else if (num2 != null) {
                    pdv0.a c = vtk0.c().c((NewsEntry) list4.get(0));
                    c.F(num2.intValue());
                    c.y();
                    c.k(context);
                } else {
                    pdv0.a c2 = vtk0.c().c((NewsEntry) list4.get(0));
                    c2.y();
                    c2.k(context);
                }
                break;
            case 24:
                fxc0.B().Y().k(((rn90) obj3).itemView.getContext(), ((eo90) obj2).b, (r43 & 4) != 0 ? null : "VOIP_CALL_RECORDINGS", (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                break;
            case 25:
                int i10 = PhotoFlowFragment.m0;
                xn50.a.c((PhotoFlowFragment) obj3, new a.f((PhotoAlbumWrapper) obj, ((b9a0.f.C2600f) obj2).a, false));
                break;
            case 26:
                qhb0 qhb0Var = (qhb0) obj3;
                ((whb0) qhb0Var.d.getValue()).b(((b25) qhb0Var.c.getValue()).c(), (UserId) obj2, true);
                break;
            case 27:
                tra0.a.K((tra0.a) obj, (tra0) obj3, 0, 0, new xc50((t2d0) obj2, 9), 4);
                break;
            case 28:
                bbl0.c cVar = (bbl0.c) obj2;
                cVar.b.setLoadingState(true);
                bbl0.b bVar = ((bbl0) obj3).c;
                if (bVar != null) {
                    bVar.a(cVar);
                }
                break;
            default:
                StoryEntry storyEntry = (StoryEntry) obj2;
                StoryViewHeader storyViewHeader = ((x4m0) obj3).d.P;
                if (storyViewHeader != null) {
                    storyViewHeader.a(storyEntry);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mp3(t1r.c cVar, wk50.a aVar, qvq.i iVar) {
        this.b = 13;
        this.c = aVar;
        this.d = iVar;
    }
}
