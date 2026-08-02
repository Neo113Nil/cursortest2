package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.zxing.pdf417.PDF417Common;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastSliderItem;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.view.ColorProgressBar;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastSliderItem;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.podcast.impl.ui.list.PodcastEpisodesListFragment;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.ModalPostRepostsTabFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SavePickTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.R;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.k7h0;
import xsna.p810;
import xsna.qr60;
import xsna.su10;
import xsna.u1a0;
import xsna.vfg0;
import xsna.vx60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class p010 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p010(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r0.B != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z = true;
        int i = 0;
        switch (this.b) {
            case 0:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ColorProgressBar colorProgressBar = marketItemCommentsFragment.V;
                if (colorProgressBar != null) {
                    bwt0.p0(colorProgressBar, !booleanValue);
                }
                SwipeRefreshLayout swipeRefreshLayout = marketItemCommentsFragment.Q;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(booleanValue);
                }
                return s3q0.a;
            case 1:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                SwipeRefreshLayout swipeRefreshLayout2 = marketItemReviewsFragment.g0;
                (swipeRefreshLayout2 != null ? swipeRefreshLayout2 : null).setRefreshing(booleanValue2);
                return s3q0.a;
            case 2:
                ((f810) this.c).T((p810.q) obj);
                return s3q0.a;
            case 3:
                ygc0 ygc0Var = (ygc0) obj;
                ((qhc0) this.c).invoke(new PostingAction$TechStats$Picker$SavePickTime(MobileOfficialAppsFeedStat$PickerType.MARKET, ygc0Var.b, ygc0Var.a));
                return s3q0.a;
            case 4:
                su10 su10Var = (su10) this.c;
                ((zak0) su10Var.o).setValue((su10.a) su10Var.d.get((String) obj));
                return s3q0.a;
            case 5:
                Pair pair = (Pair) obj;
                fza fzaVar = ((e120) this.c).g;
                if (fzaVar != null) {
                    fzaVar.invoke(pair.i(), pair.j());
                }
                return s3q0.a;
            case 6:
                eg20 eg20Var = (eg20) this.c;
                if (((oj0) obj).b != null && (!r2.isEmpty())) {
                    eg20Var.e.f();
                }
                return s3q0.a;
            case 7:
                po20 po20Var = (po20) this.c;
                ro20 ro20Var = (ro20) obj;
                synchronized (po20Var) {
                    if (po20Var.h) {
                        po20Var.c.onNext(ro20Var);
                    }
                }
                return s3q0.a;
            case 8:
                ModalPostRepostsTabFragment modalPostRepostsTabFragment = (ModalPostRepostsTabFragment) this.c;
                int i2 = ModalPostRepostsTabFragment.Y;
                TextView textView = modalPostRepostsTabFragment.V;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                VkRecyclerPaginatedView vkRecyclerPaginatedView = modalPostRepostsTabFragment.T;
                if (vkRecyclerPaginatedView != null) {
                    vkRecyclerPaginatedView.setVisibility(8);
                }
                ProgressBar progressBar = modalPostRepostsTabFragment.W;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                return s3q0.a;
            case 9:
                ((Attach) obj).m0(((w2w) this.c).d1());
                return s3q0.a;
            case 10:
                rx30 rx30Var = (rx30) this.c;
                int i3 = svr0.o;
                return new svr0((DialogItemView) bwt0.I(R.layout.vkim_dialogs_list_item_dialog, (ViewGroup) obj, false), rx30Var.h);
            case 11:
                MusicPageInfoBlockNewVh musicPageInfoBlockNewVh = (MusicPageInfoBlockNewVh) this.c;
                MusicPageInfoBlockNewVh.d dVar = (MusicPageInfoBlockNewVh.d) obj;
                b5a b5aVar = musicPageInfoBlockNewVh.c;
                UIBlockMusicArtistNew uIBlockMusicArtistNew = musicPageInfoBlockNewVh.o;
                if (uIBlockMusicArtistNew != null) {
                    String str = uIBlockMusicArtistNew.b;
                    Artist artist = uIBlockMusicArtistNew.z;
                    RecyclerView recyclerView = musicPageInfoBlockNewVh.l;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    Context context = recyclerView.getContext();
                    MusicPageInfoBlockNewVh.c(CommonAudioStat$TypeAudioArtistClickItem.EventType.ITEM_CLICK, dVar.g);
                    int i4 = MusicPageInfoBlockNewVh.i.$EnumSwitchMapping$0[dVar.c.ordinal()];
                    if (i4 == 1) {
                        kbj0 kbj0Var = musicPageInfoBlockNewVh.g;
                        if (kbj0Var != null) {
                            kbj0Var.l(context, artist);
                        }
                        b5aVar.a(new cfp0(uIBlockMusicArtistNew, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Share)));
                    } else if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            UIBlockAction uIBlockAction = dVar.d;
                            if (uIBlockAction != null) {
                                if ((uIBlockAction instanceof UIBlockActionPlayAudiosFromBlock) && jnj.j(artist.m)) {
                                    i0q0.f(new i3r(context, 2));
                                } else {
                                    boolean z2 = uIBlockAction instanceof UIBlockActionOpenUrl;
                                    if (z2 || (uIBlockAction instanceof UIBlockActionOpenSection)) {
                                        ActionOpenUrl actionOpenUrl = z2 ? ((UIBlockActionOpenUrl) uIBlockAction).A : null;
                                        if (actionOpenUrl != null) {
                                            maz e = xwk.d().e();
                                            RecyclerView recyclerView2 = musicPageInfoBlockNewVh.l;
                                            e.e((recyclerView2 != null ? recyclerView2 : null).getContext(), actionOpenUrl, uIBlockMusicArtistNew.f, null, Bundle.EMPTY);
                                        }
                                    } else {
                                        mba mbaVar = musicPageInfoBlockNewVh.f;
                                        if (mbaVar != null) {
                                            mbaVar.z(R.id.artist_action_chip, uIBlockAction);
                                        }
                                    }
                                }
                            }
                        } else if (jnj.j(artist.m)) {
                            i0q0.f(new i3r(context, 2));
                        } else {
                            musicPageInfoBlockNewVh.b(uIBlockMusicArtistNew, true);
                        }
                    } else if (jnj.j(artist.m)) {
                        i0q0.f(new i3r(context, 2));
                    } else {
                        MusicPageInfoBlockNewVh.g gVar = dVar.f;
                        if ((gVar != null ? gVar.a : null) != null) {
                            String str2 = gVar.a;
                            if (str2 != null) {
                                MusicAnalyticsInfo.ClickTarget clickTarget = MusicAnalyticsInfo.ClickTarget.PlayAll;
                                SearchStatInfoProvider searchStatInfoProvider = musicPageInfoBlockNewVh.d;
                                boolean a = searchStatInfoProvider != null ? searchStatInfoProvider.a() : false;
                                MusicPlaybackLaunchContext musicPlaybackLaunchContext = musicPageInfoBlockNewVh.e;
                                if (musicPlaybackLaunchContext == null) {
                                    musicPlaybackLaunchContext = a ? MusicPlaybackLaunchContext.o.Bb(str) : MusicPlaybackLaunchContext.Fb(uIBlockMusicArtistNew.f);
                                }
                                Pair pair2 = new Pair(ShuffleMode.SHUFFLE_OFF, musicPlaybackLaunchContext);
                                ShuffleMode shuffleMode = (ShuffleMode) pair2.d();
                                MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = (MusicPlaybackLaunchContext) pair2.g();
                                b5aVar.a(new cfp0(uIBlockMusicArtistNew, new MusicAnalyticsInfo(clickTarget)));
                                musicPlaybackLaunchContext2.Pb(str);
                                u2b0 u2b0Var = musicPageInfoBlockNewVh.b;
                                String str3 = uIBlockMusicArtistNew.b;
                                String str4 = uIBlockMusicArtistNew.c;
                                String str5 = gVar.c;
                                if (str5 == null) {
                                    str5 = artist.b;
                                }
                                String str6 = str5;
                                String name = uIBlockMusicArtistNew.getName();
                                if (name == null) {
                                    name = "";
                                }
                                u2b0Var.N0(new lqk0((StartPlaySource) new StartPlayVkMixSource(str3, str4, str2, str2.equals("common"), name, null, str6, null, null, null, PDF417Common.MAX_CODEWORDS_IN_BARCODE, null), (MusicTrack) (0 == true ? 1 : 0), (List) null, musicPlaybackLaunchContext2, 0, shuffleMode, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) (0 == true ? 1 : 0), 0L, 822));
                            }
                        } else {
                            musicPageInfoBlockNewVh.b(uIBlockMusicArtistNew, false);
                        }
                    }
                }
                return s3q0.a;
            case 12:
                MusicSearchCatalogRootVh musicSearchCatalogRootVh = (MusicSearchCatalogRootVh) this.c;
                mhy.d(musicSearchCatalogRootVh.q);
                yp70 yp70Var = (yp70) musicSearchCatalogRootVh.w.getValue();
                myc0.h(yp70Var.h, yp70Var.b, null, new xp70(yp70Var, null), 2);
                musicSearchCatalogRootVh.v.b();
                return s3q0.a;
            case 13:
                MusicTrack musicTrack = (MusicTrack) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(musicTrack.b), "id");
                w9yVar.d(Long.valueOf(musicTrack.c.b), "owner_id");
                w9yVar.e(musicTrack.d, "title");
                w9yVar.e(musicTrack.e, "subtitle");
                w9yVar.c(Integer.valueOf(musicTrack.f), "duration");
                w9yVar.c(Integer.valueOf(musicTrack.g), "content_restricted");
                w9yVar.e(musicTrack.h, "artist");
                w9yVar.e(musicTrack.i, "url");
                w9yVar.e(musicTrack.j, "audio_streams");
                w9yVar.c(Integer.valueOf(musicTrack.k), "track_genre_id");
                w9yVar.c(Integer.valueOf(musicTrack.n), "lyrics_id");
                w9yVar.e(musicTrack.r, "access_key");
                w9yVar.b(Boolean.valueOf(musicTrack.s), "is_explicit");
                w9yVar.e(musicTrack.y, "track_code");
                w9yVar.d(Long.valueOf(musicTrack.z), "date");
                w9yVar.g("album", musicTrack.q);
                w9yVar.g("podcast_info", musicTrack.w);
                w9yVar.g("nft_info", musicTrack.x);
                w9yVar.e(musicTrack.v, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
                w9yVar.e(musicTrack.t, "main_artists");
                w9yVar.e(musicTrack.u, "featured_artists");
                w9yVar.c(Integer.valueOf(musicTrack.A), "album_part_number");
                w9yVar.b(Boolean.valueOf(musicTrack.B), "is_focus_track");
                w9yVar.g("audio_chart_info", musicTrack.D);
                w9yVar.b(Boolean.valueOf(musicTrack.E), "stories_allowed");
                w9yVar.b(Boolean.valueOf(musicTrack.F), "short_videos_allowed");
                w9yVar.b(Boolean.valueOf(musicTrack.G), "stories_cover_allowed");
                w9yVar.e(musicTrack.K, "original_sound_video_id");
                w9yVar.b(Boolean.valueOf(musicTrack.p), "has_lyrics");
                w9yVar.b(Boolean.valueOf(musicTrack.L), "in_clips_favorite_allowed");
                w9yVar.b(Boolean.valueOf(musicTrack.M), "in_clips_favorite");
                w9yVar.g("external_audio", musicTrack.H);
                w9yVar.c(Integer.valueOf(musicTrack.N), "special_project_id");
                w9yVar.g("audiobook_chapter", musicTrack.O);
                w9yVar.b(Boolean.valueOf(musicTrack.P), "dislike");
                w9yVar.c(Integer.valueOf(musicTrack.Q), "legal_notices_type");
                w9yVar.b(Boolean.valueOf(musicTrack.R), "can_download_short_video");
                w9yVar.e(musicTrack.S, "main_color");
                w9yVar.g("thumb", musicTrack.T);
                w9yVar.b(Boolean.valueOf(musicTrack.U), "like");
                w9yVar.c(Integer.valueOf(musicTrack.V), "flags_context");
                w9yVar.g("moosic_audio", musicTrack.W);
                w9yVar.b(Boolean.valueOf(musicTrack.X), "trending");
                w9yVar.g("preview_url", musicTrack.Y);
                w9yVar.e(musicTrack.Z, "release_audio_id");
                w9yVar.g("audio_loudness", musicTrack.a0);
                DownloadingState downloadingState = musicTrack.J;
                vuu vuuVar = downloadingState instanceof vuu ? (vuu) downloadingState : null;
                if (vuuVar != null) {
                    i = vuuVar.g5();
                } else {
                    DownloadingState.NotLoaded.b.getClass();
                }
                w9yVar.c(Integer.valueOf(i), "downloading_state");
                return s3q0.a;
            case 14:
                ((awq) this.c).o((Throwable) obj);
                return s3q0.a;
            case 15:
                vy60 vy60Var = (vy60) obj;
                ((py60) this.c).e(new vx60.a(vy60Var.f, vy60Var.e));
                return new ux60(new qr60.a.g(vy60Var.a, vy60Var.b, vy60Var.d, true, false, null, null, 96));
            case 16:
                xd80 xd80Var = (xd80) this.c;
                xd80Var.l.a(new BitmapDrawable(xd80Var.itemView.getContext().getResources(), (Bitmap) obj), xd80.w);
                xd80Var.W5();
                return s3q0.a;
            case 17:
                zn80 zn80Var = (zn80) this.c;
                aq10 aq10Var = (aq10) obj;
                StringBuilder sb = new StringBuilder("(");
                sb.append(y2r0.j0(aq10Var.a()));
                sb.append(UcumUtils.UCUM_MILLISECODS);
                if (zn80Var.a == 2) {
                    cms0 d = fr10.d(aq10Var.d);
                    sb.append("-");
                    sb.append(d.b().name());
                }
                sb.append(")");
                return sb.toString();
            case 18:
                u1a0 u1a0Var = (u1a0) this.c;
                int i5 = u1a0.A1;
                u1a0Var.Yn(u1a0.b.ERROR);
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 19:
                bi20 bi20Var = (bi20) this.c;
                return new UIBlockPodcastSliderItem(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, (PodcastSliderItem) obj);
            case 20:
                PodcastEpisodesListFragment podcastEpisodesListFragment = (PodcastEpisodesListFragment) this.c;
                int i6 = PodcastEpisodesListFragment.d0;
                podcastEpisodesListFragment.finish();
                return s3q0.a;
            case 21:
                String str7 = (String) obj;
                z84 z84Var = ((scc0) this.c).f;
                if (z84Var != null && z84Var.i0(str7)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                PostingState.Editing editing = (PostingState.Editing) obj;
                ((qkc0) this.c).d.getClass();
                if (tuk0.c(editing)) {
                    PostEditableData postEditableData = editing.i;
                    if (postEditableData.o == null) {
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 23:
                ((ogs0) this.c).invoke(new vfg0.a.c((File) obj));
                return s3q0.a;
            case 24:
                ((b2e0) this.c).a();
                return s3q0.a;
            case 25:
                ((c7h0) this.c).T(new k7h0.a((Throwable) obj));
                return s3q0.a;
            case 26:
                return Boolean.valueOf(((rah0) this.c).b());
            case 27:
                ((io.reactivex.rxjava3.core.b) this.c).onError((Throwable) obj);
                return s3q0.a;
            case 28:
                wh50 wh50Var = (wh50) this.c;
                Float f = (Float) obj;
                f.floatValue();
                wh50Var.setValue(f);
                return s3q0.a;
            default:
                return new am2(((f3l0) this.c).i, (ViewGroup) obj);
        }
    }
}
