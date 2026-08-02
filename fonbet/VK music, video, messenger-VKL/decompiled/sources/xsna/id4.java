package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.core.view.BottomConfirmButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.j;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Result;
import one.video.player.OneVideoPlayer;
import ru.ok.android.externcalls.sdk.Conversation;
import xsna.q630;
import xsna.sst0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class id4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ id4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        View findViewByPosition;
        OneVideoPlayer a;
        OneVideoPlayer a2;
        OneVideoPlayer a3;
        OneVideoPlayer a4;
        m7q c;
        Group b;
        int i = this.b;
        q630.a aVar = q630.a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                kd4 kd4Var = (kd4) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1200509410, intValue, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.Content.<anonymous> (AudioBookBigPlayerControls.kt:39)");
                    }
                    kd4Var.c(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((bh7) obj3).e(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                avh avhVar = (avh) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1971599460, intValue2, -1, "com.vk.profile.core.tabs.ui.videos.CommunityProfileVideoItemViewHolderRedesigned.<anonymous>.<anonymous> (CommunityProfileVideoItemViewHolderRedesigned.kt:93)");
                    }
                    VideoCardViewState videoCardViewState = (VideoCardViewState) ((zak0) avhVar.t).getValue();
                    if (videoCardViewState == null) {
                        aVar3.K(-2053182781);
                    } else {
                        aVar3.K(-2053182780);
                        sst0.b bVar = avhVar.u;
                        if (bVar != null) {
                            aVar3.K(1970709921);
                            avhVar.q6(videoCardViewState, bVar, aVar3, 0);
                        } else {
                            aVar3.K(1966639280);
                        }
                        aVar3.j();
                        videoCardViewState.d().c(VideoCardViewState.Size.Sharp, aVar3, 6);
                        com.vk.libvideo.design.compose.video.videocard.a.d(videoCardViewState, s200.H(txj0.f(aVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 7), aVar3, 48, 0);
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((f1i) obj3).go(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                mwl.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                final DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) obj3;
                final sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = discoverSimilarFeedFragment.b0;
                if (recyclerView == null) {
                    return s3q0.a;
                }
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                final Integer valueOf = sq60Var.e ? Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0) : null;
                final Integer valueOf2 = valueOf != null ? Integer.valueOf((linearLayoutManager == null || (findViewByPosition = linearLayoutManager.findViewByPosition(valueOf.intValue())) == null) ? 0 : findViewByPosition.getTop()) : null;
                discoverSimilarFeedFragment.eo().a().H0(recyclerView, new d7n(0, discoverSimilarFeedFragment, sq60Var), new Runnable() { // from class: xsna.f7n
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Integer num;
                        LinearLayoutManager linearLayoutManager2;
                        qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                        Integer num2 = valueOf;
                        if (num2 != null && (num = valueOf2) != null && (linearLayoutManager2 = linearLayoutManager) != null) {
                            linearLayoutManager2.K(num2.intValue(), num.intValue());
                        }
                        sq60 sq60Var2 = sq60Var;
                        boolean z = sq60Var2.d;
                        DiscoverSimilarFeedFragment discoverSimilarFeedFragment2 = discoverSimilarFeedFragment;
                        if (z) {
                            RecyclerView recyclerView2 = discoverSimilarFeedFragment2.b0;
                            RecyclerView.o layoutManager2 = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                            LinearLayoutManager linearLayoutManager3 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                            if (linearLayoutManager3 != null) {
                                linearLayoutManager3.K(0, 0);
                            }
                        }
                        ((o170) discoverSimilarFeedFragment2.eo().a.V.getValue()).b(discoverSimilarFeedFragment2.b0);
                        discoverSimilarFeedFragment2.eo().b().a(sq60Var2.a);
                        ehv ehvVar = (ehv) discoverSimilarFeedFragment2.eo().e.b;
                        if (ehvVar != null) {
                            ehvVar.r();
                        }
                    }
                }, sq60Var.a, sq60Var.c);
                return s3q0.a;
            case 6:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i2 = MarketEditAlbumCoverFragment.d0;
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2036105908, intValue3, -1, "com.vk.ecomm.market.album.MarketEditAlbumCoverFragment.onViewCreated.<anonymous>.<anonymous> (MarketEditAlbumCoverFragment.kt:178)");
                    }
                    boolean jo = marketEditAlbumCoverFragment.jo();
                    boolean y = aVar4.y(marketEditAlbumCoverFragment);
                    Object x = aVar4.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new l500(marketEditAlbumCoverFragment, 1);
                        aVar4.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar4.y(marketEditAlbumCoverFragment);
                    Object x2 = aVar4.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new jrh(marketEditAlbumCoverFragment, 23);
                        aVar4.R(x2);
                    }
                    l1p.a(jo, gzsVar, (gzs) x2, ahn.E(aVar, "edit_storefront_album_edit_cover_products_top_bar"), aVar4, 3072);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 7:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                e2g0 e2g0Var = ((MarketItemReviewRepliesFragment) obj3).Y;
                if (e2g0Var != null) {
                    e2g0Var.o(booleanValue);
                }
                return s3q0.a;
            case 8:
                po20 po20Var = (po20) obj3;
                Integer num = (Integer) obj2;
                boolean z = ((Boolean) obj).booleanValue() && (num.intValue() > 1) == true;
                int intValue4 = num.intValue();
                po20Var.a.getClass();
                com.vk.voip.ui.c.r.getClass();
                Conversation conversation = OKVoipEngine.E.getConversation();
                return new ep20(intValue4, z, conversation != null ? conversation.getMe().isCreator() : false);
            case 9:
                kkm kkmVar = (kkm) obj2;
                BottomConfirmButton bottomConfirmButton = ((xia0) obj3).f;
                if (bottomConfirmButton != null) {
                    bottomConfirmButton.setAccentColor(kkmVar.f(R.attr.vk_legacy_accent));
                }
                return s3q0.a;
            case 10:
                rj01 rj01Var = (rj01) obj3;
                com.vk.clips.editor.state.model.b bVar2 = (com.vk.clips.editor.state.model.b) obj;
                com.vk.clips.editor.state.model.b bVar3 = (com.vk.clips.editor.state.model.b) obj2;
                nov novVar = bVar2.b;
                nov novVar2 = bVar3.b;
                if (epx.f(bVar2.a, bVar3.a) && epx.f(novVar.getStickerMatrix(), novVar2.getStickerMatrix()) && epx.f(novVar.getCommons().o(), novVar2.getCommons().o()) && rj01Var.i(novVar, novVar2)) {
                    r7 = true;
                }
                return Boolean.valueOf(r7);
            case 11:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj3;
                videoAutoPlay.N((VideoFile) obj);
                Object W0 = VideoAutoPlay.W0(videoAutoPlay, null, 7);
                Throwable a5 = Result.a(W0);
                if (a5 == null) {
                    m7q m7qVar = (m7q) W0;
                    sht0 sht0Var = videoAutoPlay.l0;
                    videoAutoPlay.C1(m7qVar);
                    if (sht0Var != null) {
                        qu5.c().h(sht0Var, videoAutoPlay.l0);
                    }
                    d3b0 d3b0Var = videoAutoPlay.p0;
                    if (epx.f((d3b0Var == null || (c = d3b0Var.c()) == null) ? null : c.a, m7qVar.a)) {
                        j.a aVar5 = videoAutoPlay.R;
                        long position = videoAutoPlay.getPosition();
                        aVar5.getClass();
                        d3b0 d3b0Var2 = videoAutoPlay.p0;
                        if (d3b0Var2 != null) {
                            OneVideoPlayer a6 = d3b0Var2.a();
                            Float valueOf3 = a6 != null ? Float.valueOf(a6.b()) : null;
                            boolean a7 = videoAutoPlay.a();
                            boolean isPlaying = videoAutoPlay.isPlaying();
                            o1b0 c2 = qu5.c();
                            sr10 sr10Var = dy2.a;
                            d3b0 g = o1b0.g(c2, m7qVar, videoAutoPlay, true, epx.f(sr10Var != null ? sr10Var.g() : null, Boolean.TRUE), new com.vk.libvideo.autoplay.i(1, videoAutoPlay, VideoAutoPlay.class, "onSourceRebind", "onSourceRebind(Lcom/vk/media/player/video/PlayerProtocol;)V", 0), null, 992);
                            if (g != null && (a4 = g.a()) != null) {
                                a4.seekTo(position);
                            }
                            if (valueOf3 != null && g != null && (a2 = g.a()) != null && a2.O() && (a3 = g.a()) != null) {
                                a3.setPlaybackSpeed(valueOf3.floatValue());
                            }
                            if (!a7) {
                                if (isPlaying) {
                                    if (g != null && (a = g.a()) != null) {
                                        a.resume();
                                    }
                                } else if (g != null) {
                                    g.C(false);
                                }
                            }
                        }
                    }
                } else {
                    L.i(a5);
                }
                return s3q0.a;
            default:
                UserId userId = (UserId) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (UIBlock uIBlock : arrayList) {
                    if (uIBlock instanceof UIBlockVideo) {
                        UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                        if (uIBlockVideo.B.I0().b == userId.b) {
                            uIBlockVideo.B.q6(Boolean.TRUE);
                        }
                    } else if ((uIBlock instanceof UIBlockSearchAuthor) && (-uIBlock.g.b) == userId.b && (b = ((UIBlockSearchAuthor) uIBlock).y.b()) != null) {
                        b.v0 = true;
                    }
                    arrayList2.add(uIBlock);
                }
                return new UIBlockList(uIBlockList, arrayList2);
        }
    }

    public /* synthetic */ id4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
