package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Size;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeListDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogLongButtonBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSlidableSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.polls.Poll;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.user.UserProfile;
import com.vk.feedlikes.viewholders.PhotosLikeHeaderBlockViewHolder;
import com.vk.im.engine.models.users.User;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.QualityChooserViewState;
import com.vk.log.L;
import com.vk.music.fragment.impl.model.MusicPlaylistsModelDataContainer;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.participant.movie.Movie;
import xsna.dn90;
import xsna.gn90;
import xsna.ikv0;
import xsna.k840;
import xsna.kdk0;
import xsna.rtb0;
import xsna.tlo0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kb40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ModernSearchView modernSearchView;
        List<Movie> list;
        Map<CallMemberId, List<Movie>> map;
        Set<CallMemberId> set;
        Set<CallMemberId> set2;
        Set<CallMemberId> set3;
        PlayerTrack t;
        PlayerTrack playerTrack;
        int i = this.b;
        int i2 = 8;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                lb40 lb40Var = (lb40) obj2;
                ((wh50) ((zak0) lb40Var.h).getValue()).setValue(Boolean.FALSE);
                lb40Var.a.invoke((sx40) obj);
                return s3q0.a;
            case 1:
                com.vk.lists.c cVar = ((qd40) obj2).d;
                if (cVar != null) {
                    cVar.p(true);
                }
                return s3q0.a;
            case 2:
                ro40 ro40Var = (ro40) obj2;
                DownloadingState downloadingState = ro40Var.e.H;
                Playlist playlist = ((n8b0) obj).a;
                if (!epx.f(downloadingState, playlist.H)) {
                    ro40Var.e.H = playlist.H;
                }
                Activity activity = ro40Var.a;
                ikv0.d dVar = ro40Var.i;
                LinkedHashSet linkedHashSet = ro40Var.f;
                DownloadingState downloadingState2 = playlist.H;
                if (downloadingState2 instanceof DownloadingState.Downloaded) {
                    tlo0.a aVar = tlo0.Companion;
                    int size = playlist.y.size();
                    Object[] objArr = {Integer.valueOf(playlist.y.size())};
                    aVar.getClass();
                    CharSequence a = tlo0.b.a(tlo0.a.a(R.plurals.music_my_audios_snackbar_downloading_success, size, objArr), activity);
                    dVar.a.k(new ikv0.d.c(a != null ? a.toString() : null));
                    u1u0.f(2000L, new id(ro40Var, 7));
                    ro40Var.j = false;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((ap40) it.next()).F();
                    }
                } else if (downloadingState2 instanceof DownloadingState.PartlyDownloaded) {
                    ikv0 ikv0Var = ro40Var.h;
                    if (ikv0Var != null) {
                        ikv0Var.a();
                    }
                    ro40Var.j = false;
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        ((ap40) it2.next()).F();
                    }
                } else if (downloadingState2 instanceof DownloadingState.Downloading) {
                    ro40Var.e = playlist;
                    ikv0 ikv0Var2 = ro40Var.h;
                    if (ikv0Var2 == null || !ikv0Var2.b.c()) {
                        ikv0.a aVar2 = new ikv0.a(activity);
                        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_download_outline_24, Integer.valueOf(R.attr.vk_ui_accent_blue), (Size) null, 12);
                        aVar2.u = dVar;
                        aVar2.e = -1L;
                        aVar2.o = Integer.valueOf(iah0.a(8));
                        aVar2.l = 80;
                        aVar2.i = FloatingViewGesturesHelper.SwipeDirection.None;
                        ikv0 b = aVar2.b();
                        ro40Var.h = b;
                        ViewGroup viewGroup = ro40Var.b;
                        utj utjVar = b.b;
                        utjVar.l = null;
                        utjVar.m = new WeakReference<>(viewGroup);
                        utjVar.e();
                        ro40Var.j = true;
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            ((ap40) it3.next()).d();
                        }
                    }
                    DownloadingState downloadingState3 = playlist.H;
                    DownloadingState.Downloading downloading = downloadingState3 instanceof DownloadingState.Downloading ? (DownloadingState.Downloading) downloadingState3 : null;
                    if (downloading != null) {
                        String valueOf = String.valueOf((int) (downloading.b * 100));
                        tlo0.a aVar3 = tlo0.Companion;
                        int size2 = playlist.y.size();
                        Object[] objArr2 = {Integer.valueOf(playlist.y.size()), valueOf};
                        aVar3.getClass();
                        CharSequence a2 = tlo0.b.a(tlo0.a.a(R.plurals.music_my_audios_snackbar_downloading_progress_info, size2, objArr2), activity);
                        dVar.a.k(new ikv0.d.c(a2 != null ? a2.toString() : null));
                    }
                } else if (downloadingState2 instanceof DownloadingState.NotLoaded) {
                    if (ro40Var.k) {
                        Iterator it4 = linkedHashSet.iterator();
                        while (it4.hasNext()) {
                            ((ap40) it4.next()).G();
                        }
                    }
                    ro40Var.j = false;
                    ro40Var.k = false;
                }
                return s3q0.a;
            case 3:
                g250 g250Var = (g250) obj2;
                com.vk.dto.music.a aVar4 = (com.vk.dto.music.a) obj;
                g250Var.h = null;
                MusicPlaylistsModelDataContainer musicPlaylistsModelDataContainer = g250Var.d;
                VKList<Playlist> vKList = aVar4.b;
                musicPlaylistsModelDataContainer.f = vKList.j();
                MusicPlaylistsModelDataContainer musicPlaylistsModelDataContainer2 = g250Var.d;
                if (musicPlaylistsModelDataContainer2.h == null) {
                    musicPlaylistsModelDataContainer2.h = aVar4.c;
                }
                ArrayList<Playlist> arrayList = musicPlaylistsModelDataContainer2.i;
                if (arrayList == null) {
                    musicPlaylistsModelDataContainer2.i = vKList;
                    g250Var.y(new wd10(g250Var));
                } else {
                    arrayList.addAll(vKList);
                    g250Var.y(new xyf(g250Var, aVar4));
                }
                return s3q0.a;
            case 4:
                MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = (MusicClipsSelectorCatalogRootVh) obj2;
                VkSlidableSearchQueryVh vkSlidableSearchQueryVh = musicClipsSelectorCatalogRootVh.A;
                String str = (String) obj;
                SwitchCatalogVh switchCatalogVh = musicClipsSelectorCatalogRootVh.B;
                if (epx.f((switchCatalogVh != null ? switchCatalogVh : null).r, ltz.a)) {
                    return s3q0.a;
                }
                d3m.c(musicClipsSelectorCatalogRootVh.v.c, (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                CatalogLongButtonBannerVh catalogLongButtonBannerVh = musicClipsSelectorCatalogRootVh.u;
                if (catalogLongButtonBannerVh != null) {
                    catalogLongButtonBannerVh.a(false);
                }
                if (musicClipsSelectorCatalogRootVh.r && (modernSearchView = vkSlidableSearchQueryVh.b.k) != null && modernSearchView.getFocused()) {
                    musicClipsSelectorCatalogRootVh.i8(vyh0.a);
                    SearchResultsVh.cb(musicClipsSelectorCatalogRootVh.G, str, null, null, false, null, false, 62);
                }
                MusicSelectorCatalogRootVh.a aVar5 = musicClipsSelectorCatalogRootVh.q;
                if (aVar5 != null) {
                    aVar5.d();
                }
                ModernSearchView modernSearchView2 = vkSlidableSearchQueryVh.b.k;
                if (modernSearchView2 != null) {
                    modernSearchView2.c(100L);
                }
                return s3q0.a;
            case 5:
                tgi0 tgi0Var = (tgi0) obj;
                String str2 = ((ae50) obj2).g;
                if (str2 == null) {
                    str2 = "";
                }
                qgi0.h(tgi0Var, str2);
                qgi0.r(tgi0Var, "AudioTrackImage");
                return s3q0.a;
            case 6:
                zi50 zi50Var = (zi50) obj2;
                for (UserProfile userProfile : (List) obj) {
                    zi50Var.d.put(userProfile.c, userProfile);
                }
                return s3q0.a;
            case 7:
                yq70 yq70Var = (yq70) obj2;
                Source source = Source.CACHE;
                a1w a1wVar = yq70Var.b;
                e1w b2 = yq70Var.b(source);
                sl30 sl30Var = new sl30(yq70Var, i2);
                L l = L.a;
                yq70Var.d.b(a1wVar.E(yq70Var, b2).subscribe(sl30Var, new g68(2)));
                return s3q0.a;
            case 8:
                VKList vKList2 = (VKList) obj;
                gn90.a aVar6 = (gn90.a) ((gn90) obj2);
                return new dn90.b.C2743b(vKList2.size() + aVar6.b.a.size(), vKList2, vKList2.i() > vKList2.size() + aVar6.b.a.size());
            case 9:
                PhotosLikeHeaderBlockViewHolder photosLikeHeaderBlockViewHolder = (PhotosLikeHeaderBlockViewHolder) obj2;
                bpn0 bpn0Var = y501.c;
                ((e1r) (bpn0Var != null ? bpn0Var : null).getValue()).a(photosLikeHeaderBlockViewHolder.itemView.getContext());
                return s3q0.a;
            case 10:
                ((vja0) obj2).a.getClass();
                CallMemberId Y = com.vk.voip.ui.c.Y();
                dhw0 dhw0Var = (dhw0) ((it80) obj).a;
                boolean P = (dhw0Var == null || (set3 = dhw0Var.o) == null) ? false : j5g.P(set3, Y);
                boolean P2 = (dhw0Var == null || (set2 = dhw0Var.r) == null) ? false : j5g.P(set2, Y);
                if (dhw0Var != null && (set = dhw0Var.p) != null) {
                    z = j5g.P(set, Y);
                }
                boolean z2 = z;
                if (dhw0Var == null || (map = dhw0Var.q) == null || (list = map.get(Y)) == null) {
                    list = EmptyList.b;
                }
                return new cjk0(Y, P, P2, z2, list);
            case 11:
                e2b0 e2b0Var = (e2b0) obj2;
                String str3 = (String) obj;
                com.vk.music.player.f fVar = e2b0Var.e;
                if (str3 != null) {
                    if (e2b0Var.y.t(str3) == null && (playerTrack = fVar.c) != null && playerTrack.f.equals(str3)) {
                        t = fVar.c;
                    } else {
                        t = e2b0Var.y.t(str3);
                        t.e = fVar.f[0];
                    }
                    fVar.a(true);
                    fVar.q(t);
                    fVar.e[0] = t.b.c0;
                }
                e2b0Var.d0();
                return s3q0.a;
            case 12:
                PlaybackLaunchMeta playbackLaunchMeta = ((ihb0) obj2).a.b;
                List<AudioAudioDto> d = ((PodcastEpisodeListDto) obj).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                Iterator<T> it5 = d.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(oc4.d((AudioAudioDto) it5.next()));
                }
                List<MusicTrack> f = k840.a.c().f(arrayList2);
                ArrayList arrayList3 = new ArrayList(c5g.u(f, 10));
                Iterator<T> it6 = f.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(new xd50((MusicTrack) it6.next(), playbackLaunchMeta));
                }
                return arrayList3;
            case 13:
                return Boolean.valueOf(((Poll) obj2).b == ((rtb0.a) obj).a.b);
            case 14:
                return Boolean.valueOf(((bdc0) obj2).a((FragmentActivity) obj));
            case 15:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "PostingToolbarButtonBack");
                qgi0.h(tgi0Var2, ((enc0) obj2).c.getContext().getString(R.string.previous_step_talkback_title));
                return s3q0.a;
            case 16:
                Context context = (Context) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    Context context2 = e43.a;
                    j03.i(context2 != null ? context2 : null, (VKApiExecutionException) th);
                } else {
                    j03.j(context, th);
                }
                return s3q0.a;
            case 17:
                e5d0 e5d0Var = (e5d0) obj2;
                Pair pair = (Pair) obj;
                wpp wppVar = (wpp) pair.d();
                ers ersVar = (ers) pair.g();
                User user = (User) wppVar.c.get(Long.valueOf(e5d0Var.i.d));
                List<Peer> list2 = ersVar.a;
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it7 = list2.iterator();
                while (it7.hasNext()) {
                    qtd0 Bb = ersVar.e.Bb((Peer) it7.next());
                    if (Bb != null) {
                        arrayList4.add(Bb);
                    }
                }
                f5d0 f5d0Var = new f5d0(user, arrayList4, ersVar.f, false);
                e5d0Var.n.u.onNext(f5d0Var);
                e5d0Var.o = f5d0Var;
                return s3q0.a;
            case 18:
                com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a aVar7 = (com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a) obj2;
                QualityChooserViewState.b bVar = (QualityChooserViewState.b) obj;
                int i3 = com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a.p1;
                if (!(bVar instanceof QualityChooserViewState.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList5 = ((QualityChooserViewState.b.a) bVar).a;
                RecyclerView recyclerView = aVar7.l1;
                if (recyclerView != null) {
                    com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.b bVar2 = new com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.b(new kar(aVar7.requireContext()), arrayList5);
                    aVar7.n1 = new n7w(bVar2, 29);
                    recyclerView.setAdapter(bVar2);
                }
                VkButton vkButton = aVar7.m1;
                if (vkButton != null) {
                    bwt0.i0(vkButton, new g22(28, aVar7, arrayList5));
                }
                return s3q0.a;
            case 19:
                final m2g0 m2g0Var = (m2g0) obj2;
                return new uvl((ViewGroup) obj, new eig0() { // from class: xsna.o2g0
                    @Override // xsna.eig0
                    public final void a(Object obj3) {
                        t2g0 b3 = a3g0.b((d4g0) obj3);
                        if (b3 != null) {
                            m2g0.this.a(b3);
                        }
                    }
                });
            case 20:
                gzs gzsVar = (gzs) obj2;
                if (gzsVar != null) {
                }
                return s3q0.a;
            case 21:
                pch0 pch0Var = (pch0) obj2;
                pch0Var.e = (VoipViewModelState) obj;
                pch0Var.a();
                return s3q0.a;
            case 22:
                int intValue = ((Integer) obj).intValue();
                VideoSearchFiltersImpl videoSearchFiltersImpl = ((bth0) obj2).v;
                videoSearchFiltersImpl.g = intValue;
                videoSearchFiltersImpl.n = String.valueOf(intValue);
                return s3q0.a;
            case 23:
                PostingVisibilityMode postingVisibilityMode = (PostingVisibilityMode) obj;
                e3j0 e3j0Var = ((f3j0) obj2).o;
                if (e3j0Var != null) {
                    qdc0 qdc0Var = e3j0Var.b;
                    if (qdc0Var.o0() != postingVisibilityMode) {
                        ((fhc0) e3j0Var.q.getValue()).x().f(e3j0Var.o);
                    }
                    qdc0Var.Q(postingVisibilityMode);
                }
                return s3q0.a;
            case 24:
                com.vk.lists.c cVar2 = (com.vk.lists.c) obj2;
                cVar2.s = false;
                cVar2.r = null;
                cVar2.n(false);
                return s3q0.a;
            case 25:
                xn50.a.c((odk0) obj2, new kdk0.e((String) obj));
                return s3q0.a;
            case 26:
                L.i((Throwable) obj);
                ((s3l0) obj2).b.Ij();
                return s3q0.a;
            case 27:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                ((i8l0) obj2).b.setVisibility(4);
                return s3q0.a;
            case 28:
                etj etjVar = ((ncl0) obj2).d;
                etjVar.getClass();
                n2i0.a(etjVar.b, hf8.a, new Intent("com.vkontakte.android.STICKERS_NUM_NEW_ITEMS"));
                return s3q0.a;
            default:
                ((hpb0) obj2).s();
                return s3q0.a;
        }
    }
}
