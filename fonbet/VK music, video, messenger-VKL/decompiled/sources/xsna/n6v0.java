package xsna;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.articles.api.preload.QueryParameters;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.attachpicker.impl.fragment.AttachMusicFragment;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.LinksParserData;
import com.vk.communities.GroupsSuggestionsFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.products.ProductCarousel;
import com.vk.dto.discover.carousel.products.ProductCarouselItem;
import com.vk.dto.discover.carousel.products.ProductCarouselPromoItem;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.SocialButtonType;
import com.vk.fave.entities.FavePage;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.home.HomeFragment2;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.screen.VideoActivity;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.location.common.LocationCommon;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.impl.EditPlaylistFragment;
import com.vk.music.fragment.impl.MusicArtistCatalogFragment;
import com.vk.music.fragment.impl.MusicCuratorCatalogFragment;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.posting.a;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.PostingType;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.profile.user.api.data.UserProfileSkeletonParams;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.webapp.fragments.NewsfeedSettingsAppFragment;
import com.vk.webapp.fragments.PostStatsFragment;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import com.vkontakte.android.fragments.groupadmin.BannedUserSettingsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.cqc0;
import xsna.dzd0;
import xsna.gd60;
import xsna.gzh0;
import xsna.ka40;

/* compiled from: VkNewsfeedBridge.kt */
/* loaded from: classes11.dex */
public final class n6v0 implements gd60 {
    public final ho4 b;
    public final qx2 c;
    public final rx2 d;
    public final sx2 e;
    public final yaa f;
    public final ProfileFragmentProviderComponent g;
    public final bpn0 h = new bpn0(new b63(20));
    public final yzc0 i = yzc0.b;
    public final fjk0 j = new fjk0();

    public n6v0(ho4 ho4Var, qx2 qx2Var, rx2 rx2Var, sx2 sx2Var, yaa yaaVar, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.b = ho4Var;
        this.c = qx2Var;
        this.d = rx2Var;
        this.e = sx2Var;
        this.f = yaaVar;
        this.g = profileFragmentProviderComponent;
    }

    @Override // xsna.gd60
    public final boolean A(Context context) {
        return pmr0.a(context) || pmr0.b(context);
    }

    @Override // xsna.gd60
    public final void A0(Context context, VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, DeprecatedStatisticInterface deprecatedStatisticInterface, boolean z, String str3) {
        fxc0.B().Y().k(context, videoFile, (r43 & 4) != 0 ? null : str, (r43 & 8) != 0 ? null : adsDataProvider, (r43 & 16) != 0 ? null : str2, (r43 & 32) != 0 ? null : deprecatedStatisticInterface, (r43 & 64) != 0 ? false : z, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : str3, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
    }

    @Override // xsna.gd60
    public final boolean B(Matcher matcher, ArrayList arrayList) {
        return xwk.d().a().j(matcher, new ArrayList<>(arrayList), 0);
    }

    @Override // xsna.gd60
    public final void B0(Context context, String str) {
        o19.j(context).b(context, str);
    }

    @Override // xsna.gd60
    public final void C(Context context, ButtonAction buttonAction, PostInteract postInteract, ShitAttachment shitAttachment, String str) {
        s21.b(context, buttonAction, postInteract, shitAttachment, str);
    }

    @Override // xsna.gd60
    public final void C0() {
        j5t.b();
    }

    @Override // xsna.gd60
    public final boolean D() {
        return enq.a.a();
    }

    @Override // xsna.gd60
    public final g420 D0(f420 f420Var) {
        return new h420(f420Var);
    }

    @Override // xsna.gd60
    public final void E(Context context, UserId userId, String str, PromoPost promoPost) {
        pwd0 D;
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        D = this.g.ye(userId, null).G(str).C(promoPost.Jb().Xb(), promoPost.Jb().q()).K(promoPost.Jb().Cb().r()).D(FullSourceJoinApi.EntryServiceType.FEED, promoPost.Jb().getType(), null);
        D.y(promoPost.Hb()).k(context);
    }

    @Override // xsna.gd60
    public final void E0(Context context, ShitAttachment shitAttachment, ShitAttachment.Card card, int i) {
        s21.f(context, shitAttachment, card, i, null);
    }

    @Override // xsna.gd60
    public final void F(Context context, String str, int i, String str2) {
        hf3.d(new np20(i, context, null, new iq20(str2, str, null, null, null, null, null, null, 252), new aq20(null, null, null, null, null, null, null, false, null, false, 3071), 4));
    }

    @Override // xsna.gd60
    public final void F0(Context context) {
        dzd0.a.b(context);
    }

    @Override // xsna.gd60
    public final void G(Context context, long j, String str) {
        hf3.d(new np20((int) j, context, new mq20(str, (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), null, null, 24));
    }

    @Override // xsna.gd60
    public final void G0(Context context, GoodAlbum goodAlbum) {
        ef10.a(goodAlbum, context, (com.vk.ecomm.storefrontservices.api.a) this.d.invoke(), (dhc) this.e.invoke());
    }

    @Override // xsna.gd60
    public final void H(NewsEntry newsEntry) {
        s21.o(newsEntry);
    }

    @Override // xsna.gd60
    public final String H0(Group group) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(xa4.w(group));
    }

    @Override // xsna.gd60
    public final FragmentImpl I(int i, int i2) {
        AttachMusicFragment.a aVar = new AttachMusicFragment.a();
        aVar.z(i);
        aVar.A(i2);
        aVar.y(true);
        return aVar.f();
    }

    @Override // xsna.gd60
    public final void I0(Context context, String str, String str2, List<String> list, int i) {
        s21.h(context, str, str2, list, i);
    }

    @Override // xsna.gd60
    public final void J0(Context context, NewsEntry newsEntry, String str, int i) {
        VideoFile Jb;
        int i2 = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        if (newsEntry instanceof Photos) {
            PhotoAttachment Mb = ((Photos) newsEntry).Mb();
            if (Mb != null) {
                a.K("photo");
                a.F(Mb.Gb().intValue());
                a.G(Mb.q());
            }
        } else if (newsEntry instanceof Videos) {
            a.K("video");
            VideoAttachment Nb = ((Videos) newsEntry).Nb();
            if (Nb != null && (Jb = Nb.Jb()) != null) {
                a.F(Jb.o0());
                a.G(Jb.I0());
                String r = Jb.r();
                if (r != null) {
                    a.J(r);
                }
            }
        } else if (newsEntry instanceof Post) {
            a.K("wall");
            Post post = (Post) newsEntry;
            a.F(post.Xb());
            a.G(post.q());
            String r2 = post.r();
            if (r2 != null) {
                a.J(r2);
            }
        } else if (newsEntry instanceof PromoPost) {
            a.K("ad");
            PromoPost promoPost = (PromoPost) newsEntry;
            a.z(promoPost.Ib(), newsEntry);
            String r3 = promoPost.r();
            if (r3 != null) {
                a.J(r3);
            }
        } else if (newsEntry instanceof ShitAttachment) {
            a.K("ad");
            a.z(((ShitAttachment) newsEntry).Fb(), newsEntry);
        } else if (newsEntry instanceof Html5Entry) {
            a.K("ad");
            a.z(((Html5Entry) newsEntry).Fb(), newsEntry);
        }
        if (str != null) {
            a.I(str);
        }
        a.i(xa4.L(context), i);
    }

    @Override // xsna.gd60
    public final void K(Context context, String str, String str2) {
        com.vk.common.links.c.Q(context, str, true, null, str2, null, false, false, null);
    }

    @Override // xsna.gd60
    public final boolean K0(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        ((u2b0) this.h.getValue()).m1(null, Collections.singletonList(musicTrack), musicPlaybackLaunchContext, (r15 & 8) == 0, new PlaybackActionMeta(6, 0L, 2, null));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r7 == null) goto L6;
     */
    @Override // xsna.gd60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(Context context, UserId userId, String str, String str2, gd60.b bVar) {
        FullSourceJoinApi.EntryServiceType entryServiceType;
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        pwd0 M = this.g.ye(userId, null).G(str).K(str2).M(new UserProfileSkeletonParams(bVar.c(), bVar.a(), bVar.g(), bVar.d()));
        String f = bVar.f();
        String b = bVar.b();
        if (b != null) {
            FullSourceJoinApi.EntryServiceType.Companion.getClass();
            entryServiceType = FullSourceJoinApi.EntryServiceType.a.a(b);
        }
        entryServiceType = FullSourceJoinApi.EntryServiceType.FEED;
        M.D(entryServiceType, f, bVar.e()).k(context);
    }

    @Override // xsna.gd60
    public final void L0(Context context, String str, Integer num, UserId userId) {
        int i = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        a.K(str);
        if (userId != null) {
            a.F(num.intValue());
            a.G(userId);
        }
        a.k(context);
    }

    @Override // xsna.gd60
    public final oxq0 M(FragmentImpl fragmentImpl, RecyclerPaginatedView recyclerPaginatedView, WallGetMode wallGetMode, boolean z) {
        return new mxq0(fragmentImpl, recyclerPaginatedView, wallGetMode, z);
    }

    @Override // xsna.gd60
    public final void M0(bc6 bc6Var) {
        new ProfileFriendsFragment.a(FriendsListParams.BestFriendsList.b, FriendsListPrivacyType.POST, null, null, false, 60).i(bc6Var, 428);
    }

    @Override // xsna.gd60
    public final Pattern N0() {
        return eaz.a();
    }

    @Override // xsna.gd60
    public final void O(Context context, ShitAttachment shitAttachment, int i, boolean z) {
        s21.d(context, shitAttachment, i, z);
    }

    @Override // xsna.gd60
    public final void O0(ProductCarouselPromoItem productCarouselPromoItem) {
        zx1.c(productCarouselPromoItem);
    }

    @Override // xsna.gd60
    public final fjk0 P() {
        return this.j;
    }

    @Override // xsna.gd60
    public final void P0(ProductCarouselItem productCarouselItem, boolean z) {
        zx1.b(productCarouselItem);
    }

    @Override // xsna.gd60
    public final Pattern Q() {
        return eaz.b();
    }

    @Override // xsna.gd60
    public final void R(Context context, PostingVisibilityMode postingVisibilityMode, izs<? super PostingVisibilityMode, s3q0> izsVar, gzs<s3q0> gzsVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, List<UserId> list, List<Integer> list2, String str, boolean z, boolean z2) {
        PostingType postingType = z2 ? PostingType.LIVE_RECORDING : PostingType.CLIP;
        com.vk.newsfeed.impl.posting.a a = a.C1384a.a();
        String str2 = cqc0.v;
        cqc0 cqc0Var = new cqc0(context, postingVisibilityMode, postingType, izsVar, gzsVar, new com.vk.movika.sdk.base.flow.binding.l(27, context, mobileOfficialAppsCoreNavStat$EventScreen), a, cqc0.b.a());
        cqc0Var.Y0(list, list2);
        cqc0Var.b1(z);
    }

    @Override // xsna.gd60
    public final void R0(Context context, UserId userId, ImageStatus imageStatus) {
        szk0.a(context, userId, imageStatus);
    }

    @Override // xsna.gd60
    public final boolean S(Context context) {
        return pmp.a(context);
    }

    @Override // xsna.gd60
    public final void S0(Context context, long j, Integer num, Integer num2, String str, String str2, String str3, Boolean bool) {
        com.vkontakte.android.fragments.h hVar = new com.vkontakte.android.fragments.h();
        hVar.c(j);
        if (num != null) {
            hVar.d(num.intValue());
        }
        if (num2 != null) {
            hVar.b(num2.intValue());
        }
        if (str != null && str.length() != 0) {
            hVar.h(str);
        }
        if (str2 != null) {
            hVar.f(str2);
        }
        if (str3 != null && str3.length() != 0) {
            hVar.e(str3);
        }
        if (bool != null) {
            hVar.g(bool.booleanValue());
        }
        hVar.a(context);
    }

    @Override // xsna.gd60
    public final void T(String str, GroupSuggestion groupSuggestion, String str2) {
        apu.a(str, groupSuggestion, str2);
    }

    @Override // xsna.gd60
    public final String U() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.discover_search_placeholder);
    }

    @Override // xsna.gd60
    public final boolean U0() {
        return enq.f();
    }

    @Override // xsna.gd60
    public final void V(Context context, String str, String str2, Bundle bundle, LaunchContext launchContext) {
        com.vk.common.links.b.h(context, str, str2, bundle, launchContext);
    }

    @Override // xsna.gd60
    public final LinksParserData W0() {
        return new LinksParserData(128, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382);
    }

    @Override // xsna.gd60
    public final void X(int i, FragmentImpl fragmentImpl) {
        PostingAttachGalleryFragment postingAttachGalleryFragment = fragmentImpl instanceof PostingAttachGalleryFragment ? (PostingAttachGalleryFragment) fragmentImpl : null;
        if (postingAttachGalleryFragment != null) {
            postingAttachGalleryFragment.io(i == 3);
        }
    }

    @Override // xsna.gd60
    public final Pattern Y() {
        return eaz.d();
    }

    @Override // xsna.gd60
    public final void Y0(Activity activity, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        String str = ka40.B;
        ka40.a.e(activity, playlist, musicPlaybackLaunchContext);
    }

    @Override // xsna.gd60
    public final void Z(Context context, UserId userId, String str, String str2, Post post, gd60.b bVar) {
        pwd0 D;
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        D = this.g.ye(userId, null).G(str).M(new UserProfileSkeletonParams(bVar.c(), bVar.a(), bVar.g(), bVar.d())).D(FullSourceJoinApi.EntryServiceType.FEED, post.getType(), null);
        D.C(post.Xb(), post.q()).K(str2).k(context);
    }

    @Override // xsna.gd60
    public final m6r0 a() {
        return q6r0.f();
    }

    @Override // xsna.gd60
    public final boolean a1() {
        o2l.a.getClass();
        return o2l.b("__dbg_no_ads", false);
    }

    @Override // xsna.gd60
    public final io.reactivex.rxjava3.disposables.c b(Context context, ApiApplication apiApplication, String str, String str2, String str3) {
        return hf3.c(new op20(apiApplication, context, new mq20((String) null, (String) null, (String) null, str3, 50, (String) null, ""), new iq20(str2, str, null, null, null, null, null, null, 252), new aq20(null, null, null, null, null, null, null, false, null, false, 3564)));
    }

    @Override // xsna.gd60
    public final CharSequence b0(String str) {
        return xwk.d().a().m(str);
    }

    @Override // xsna.gd60
    public final void b1(Activity activity, Bundle bundle) {
        BannedUserSettingsFragment.qo(activity, bundle);
    }

    @Override // xsna.gd60
    public final void c(View view, UserId userId, int i, boolean z, String str, String str2, izs<? super UserId, s3q0> izsVar, izs<? super UserId, s3q0> izsVar2) {
        xwk.e().T().c(view, userId, i, z, str, str2, izsVar, izsVar2);
    }

    @Override // xsna.gd60
    public final void c0(Context context, UserId userId, String str) {
        GroupsSuggestionsFragment.a aVar = new GroupsSuggestionsFragment.a(null);
        aVar.z(str);
        aVar.y(userId);
        aVar.k(context);
    }

    @Override // xsna.gd60
    public final SQLiteOpenHelper c1(Context context) {
        return bwk.b(context);
    }

    @Override // xsna.gd60
    public final CharSequence d(CharSequence charSequence, LinksParserData linksParserData) {
        return xwk.d().a().d(charSequence, linksParserData);
    }

    @Override // xsna.gd60
    public final void d0(Activity activity) {
        new HomeFragment2.a().k(activity);
    }

    @Override // xsna.gd60
    public final void d1(Context context, Playlist playlist, NewsEntry newsEntry, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        String t;
        DisplayMusicPlaylistFragment.a aVar = new DisplayMusicPlaylistFragment.a(playlist);
        if (musicPlaybackLaunchContext != null && (t = musicPlaybackLaunchContext.t()) != null) {
            aVar.B(t);
        }
        if (newsEntry != null) {
            aVar.A(newsEntry);
        }
        aVar.k(context);
    }

    @Override // xsna.gd60
    public final void e(long j, Context context, UserId userId, SocialButtonType socialButtonType, FullSourceJoinApi fullSourceJoinApi, String str, String str2, izs izsVar, izs izsVar2, boolean z, boolean z2) {
        xwk.e().T().e(j, context, userId, socialButtonType, fullSourceJoinApi, str, str2, izsVar, izsVar2, z, z2);
    }

    @Override // xsna.gd60
    public final void e0(Context context, FavePage favePage, pqq pqqVar, wzs wzsVar, izs izsVar) {
        enq.k(context, favePage, pqqVar, (r17 & 8) != 0 ? null : wzsVar, (r17 & 16) != 0 ? null : izsVar, (r17 & 32) != 0 ? true : true, null, null, null);
    }

    @Override // xsna.gd60
    public final boolean e1(int i) {
        return xa4.B(i);
    }

    @Override // xsna.gd60
    public final boolean f(Context context) {
        return pmr0.a(context);
    }

    @Override // xsna.gd60
    public final zvh f0(UserId userId, FragmentImpl fragmentImpl, RecyclerPaginatedView recyclerPaginatedView, WallGetMode wallGetMode, ExtendedCommunityProfile extendedCommunityProfile, io.reactivex.rxjava3.core.q<?> qVar) {
        return new vvh(userId, fragmentImpl, recyclerPaginatedView, wallGetMode, extendedCommunityProfile, qVar);
    }

    @Override // xsna.gd60
    public final FragmentImpl f1(int i, int i2, boolean z) {
        PostingAttachGalleryFragment postingAttachGalleryFragment = new PostingAttachGalleryFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("currAtt", i);
        bundle.putInt("maxAtt", i2);
        bundle.putBoolean("takePhoto", z);
        bundle.putBoolean("shouldMeasureTechStats", true);
        postingAttachGalleryFragment.setArguments(bundle);
        return postingAttachGalleryFragment;
    }

    @Override // xsna.gd60
    public final void g(Context context, UserId userId, String str, String str2, String str3, gd60.b bVar) {
        this.g.ye(userId, str3).M(new UserProfileSkeletonParams(bVar.c(), bVar.a(), bVar.g(), bVar.d())).G(str).K(str2).k(context);
    }

    @Override // xsna.gd60
    public final wzc0 g0() {
        return this.i;
    }

    @Override // xsna.gd60
    public final void g1(Context context) {
        dzd0.a.a(context);
    }

    @Override // xsna.gd60
    public final CharSequence h(CharSequence charSequence) {
        return xwk.d().a().m(charSequence);
    }

    @Override // xsna.gd60
    public final io.reactivex.rxjava3.core.q h0(FragmentActivity fragmentActivity) {
        return kzz.b(fragmentActivity);
    }

    @Override // xsna.gd60
    public final void h1(Context context) {
        int i = NewsfeedSettingsAppFragment.a0;
        NewsfeedSettingsAppFragment.b.a().k(context);
        ce60.b.getClass();
        ce60.f.remove("face_recognition");
    }

    @Override // xsna.gd60
    public final void i(Context context, gmq gmqVar, pqq pqqVar, wzs wzsVar, izs izsVar) {
        enq.j(context, gmqVar, pqqVar, wzsVar, izsVar, true, null, 64);
    }

    @Override // xsna.gd60
    public final void i0(fg1 fg1Var) {
        fg1Var.invoke();
    }

    @Override // xsna.gd60
    public final void i1(int i, Context context, UserId userId) {
        int i2 = PostStatsFragment.a0;
        PostStatsFragment.b.a(i, userId).k(context);
    }

    @Override // xsna.gd60
    public final void j0(FragmentActivity fragmentActivity, FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod) {
        DiscoverSearchFragment.a aVar = new DiscoverSearchFragment.a();
        aVar.y();
        aVar.A(fragmentWithGlobalSearch$EntryMethod);
        aVar.k(fragmentActivity);
    }

    @Override // xsna.gd60
    public final void j1(Context context, ShitAttachment shitAttachment, ShitAttachment.Card card, int i) {
        s21.f(context, shitAttachment, card, i, AdClickContext.BUTTON);
    }

    @Override // xsna.gd60
    public final Class<VideoActivity> k0() {
        return VideoActivity.class;
    }

    @Override // xsna.gd60
    public final void k1(Context context, GeoAttachment geoAttachment) {
        zl00.b(context, geoAttachment);
    }

    @Override // xsna.gd60
    public final Pattern l() {
        return eaz.c();
    }

    @Override // xsna.gd60
    public final Class<PhotoVideoAttachActivity> l0() {
        return PhotoVideoAttachActivity.class;
    }

    @Override // xsna.gd60
    public final void l1(ImageStatus imageStatus) {
        o6r0 c = q6r0.c();
        c.k(imageStatus);
        c.f();
    }

    @Override // xsna.gd60
    public final void m(ProductCarousel productCarousel) {
        zx1.a(productCarousel);
    }

    @Override // xsna.gd60
    public final void m0(PromoPost promoPost) {
        s21.n(promoPost);
    }

    @Override // xsna.gd60
    public final void m1(ShitAttachment shitAttachment) {
        s21.i(shitAttachment);
    }

    @Override // xsna.gd60
    public final void n() {
        ce60.b.getClass();
        ce60.f.add("newsfeed_order");
    }

    @Override // xsna.gd60
    public final CharSequence n0(CharSequence charSequence) {
        return xwk.d().a().m(umo0.a(charSequence));
    }

    @Override // xsna.gd60
    public final SpannableString n1(Context context, SpannableStringBuilder spannableStringBuilder, String str) {
        int i = gzh0.n;
        return gzh0.a.a(context, spannableStringBuilder, str);
    }

    @Override // xsna.gd60
    public final rgc0 o() {
        return new ugc0();
    }

    @Override // xsna.gd60
    public final Activity o1() {
        Handler handler = x93.a;
        c63 c63Var = c63.a;
        return c63.b();
    }

    @Override // xsna.gd60
    public final void p(Context context, String str, String str2) {
        MusicArtistCatalogFragment.a aVar = new MusicArtistCatalogFragment.a(str);
        aVar.C(str2);
        aVar.k(context);
    }

    @Override // xsna.gd60
    public final void p0(Integer num, Integer num2) {
        ysg0.b.a(new zaa0(num != null ? num.intValue() : -9002, num2 != null ? num2.intValue() : -9000));
    }

    @Override // xsna.gd60
    public final void p1(Context context, Playlist playlist) {
        EditPlaylistFragment.a aVar = new EditPlaylistFragment.a();
        aVar.y(playlist);
        aVar.k(context);
    }

    @Override // xsna.gd60
    public final boolean q() {
        o2l.a.getClass();
        return o2l.b("__dbg_feed_logging_avg_time_holders", false);
    }

    @Override // xsna.gd60
    public final void q0(Context context, Article article, SnippetAttachment snippetAttachment, QueryParameters queryParameters, String str, boolean z) {
        bu00.r(context, article, snippetAttachment, queryParameters, str, z);
    }

    @Override // xsna.gd60
    public final void q1(View view, UserId userId, boolean z, String str, String str2, boolean z2, ku1 ku1Var, SocialButtonType socialButtonType) {
        xwk.e().T().j(view, userId, z, str, str2, z2, null, ku1Var, null, socialButtonType);
    }

    @Override // xsna.gd60
    public final boolean r(Context context, UserId userId, int i, int i2) {
        return ((n9p0) this.c.invoke()).b(i, i2, context, userId, null);
    }

    @Override // xsna.gd60
    public final void r0(Context context, ShitAttachment shitAttachment, int i, AdClickContext adClickContext) {
        s21.e(context, shitAttachment, i, adClickContext);
    }

    @Override // xsna.gd60
    public final void r1(NewsEntry newsEntry) {
        s21.j(newsEntry);
    }

    @Override // xsna.gd60
    public final int s(Group group, boolean z) {
        return xa4.u(group.C, group.m, group.s, z);
    }

    @Override // xsna.gd60
    public final void s0(Context context, UserId userId, String str, String str2) {
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        this.g.ye(userId, null).G(str).K(str2).k(context);
    }

    @Override // xsna.gd60
    public final void s1(Context context, String str, String str2) {
        MusicCuratorCatalogFragment.a aVar = new MusicCuratorCatalogFragment.a(str);
        aVar.C(str2);
        aVar.k(context);
    }

    @Override // xsna.gd60
    public final void t(FaveTag faveTag) {
        enq.a.getClass();
        enq.e(faveTag);
    }

    @Override // xsna.gd60
    public final xe8 t0() {
        return new xe8(5);
    }

    @Override // xsna.gd60
    public final void u(Context context) {
        ww50 v = s200.v(context);
        if (v != null) {
            m820.c(v, R.id.menu_expert_card, false);
        }
    }

    @Override // xsna.gd60
    public final void u0(NewsEntry newsEntry) {
        s21.l(newsEntry);
    }

    @Override // xsna.gd60
    public final dw20 u1(FragmentActivity fragmentActivity, VideoFile videoFile) {
        dw20 a;
        a = f1s0.a(fragmentActivity, videoFile, (r8 & 4) != 0, o25.a().c(), null, null);
        return a;
    }

    @Override // xsna.gd60
    public final void v(Action action, Context context, NewsEntry newsEntry, String str, String str2, List<? extends Attachment> list, String str3, Integer num) {
        com.vk.extensions.a.b(action, context, newsEntry, str, str2, list, str3, num, null, 128);
        if (newsEntry instanceof PromoPost) {
            s21.c(action, (PromoPost) newsEntry);
        }
    }

    @Override // xsna.gd60
    public final void v0(bfg<?> bfgVar, String str, int i, UserId userId, String str2) {
        int i2 = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        a.K(str);
        a.F(i);
        a.G(userId);
        if (str2 != null) {
            a.I(str2);
        }
        bfgVar.y7(a);
    }

    @Override // xsna.gd60
    public final void v1(Context context, String str, String str2, String str3, boolean z, int i) {
        s21.g(context, str, str2, str3, z, i);
    }

    @Override // xsna.gd60
    public final p870 w() {
        ce60.b.getClass();
        return p870.f();
    }

    @Override // xsna.gd60
    public final void w0(Context context, PrettyCardAttachment.Card card) {
        s21.m(context, card);
    }

    @Override // xsna.gd60
    public final void w1(Context context, gmq gmqVar, String str, String str2, String str3) {
        enq.g(context, gmqVar, new pqq(str, str2, str3, null, 8), null, null);
    }

    @Override // xsna.gd60
    public final void x() {
        ((oie) this.b.invoke()).init();
    }

    @Override // xsna.gd60
    public final boolean x0(VideoFile videoFile) {
        return fxc0.B().c(videoFile);
    }

    @Override // xsna.gd60
    public final boolean x1(FragmentActivity fragmentActivity) {
        LocationCommon.a.getClass();
        return LocationCommon.b(fragmentActivity);
    }

    @Override // xsna.gd60
    public final void y() {
        m820.g(-1, "expert_card");
    }

    @Override // xsna.gd60
    public final boolean y0() {
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        return o260Var.h().isEnabled();
    }

    @Override // xsna.gd60
    public final void y1(Context context) {
        DiscoverSearchFragment.a aVar = new DiscoverSearchFragment.a();
        aVar.F();
        aVar.k(context);
    }

    @Override // xsna.gd60
    public final void z(Context context, UserId userId, int i, String str, String str2, MusicTrack.AssistantData assistantData) {
        PodcastEpisodeFragment.a aVar = new PodcastEpisodeFragment.a(userId, i);
        aVar.B(str);
        aVar.C(str2);
        aVar.y(assistantData);
        aVar.k(context);
    }

    @Override // xsna.gd60
    public final void z0(Context context, PhotoAlbum photoAlbum, String str) {
        oga0.a((oga0) this.f.invoke(), context, photoAlbum, str, 24);
    }

    @Override // xsna.gd60
    public final void clear() {
    }
}
