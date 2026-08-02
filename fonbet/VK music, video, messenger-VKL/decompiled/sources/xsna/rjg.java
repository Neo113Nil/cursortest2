package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.holders.ArticleVh;
import com.vk.catalog2.feature.music.holders.PodcastSliderItemRoundBackgroundVh;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.VisibleStatus;
import com.vk.fave.entities.FaveCategory;
import com.vk.fave.entities.FavePage;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.fragments.FavesFragment;
import com.vk.feedlikes.fragments.FeedLikesFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.PodcastAttachment;
import kotlin.collections.EmptyList;

/* compiled from: CommonFaveBridge.kt */
/* loaded from: classes7.dex */
public final class rjg implements smq {
    public static final rjg a = new rjg();

    @Override // xsna.smq
    public final void a(Context context, String str) {
        FeedLikesFragment.a aVar = new FeedLikesFragment.a(FeedLikesFragment.class, null, null);
        aVar.j.putString("filter_key", str);
        aVar.k(context);
    }

    @Override // xsna.smq
    public final void b(Context context, UserProfile userProfile, wzs wzsVar, izs izsVar, String str, String str2, String str3) {
        enq enqVar = enq.a;
        gnq.a.getClass();
        xuo0.a.getClass();
        enq.k(context, new FavePage("user", null, xuo0.c(), userProfile.l0(), userProfile.d, userProfile.n, userProfile.k, EmptyList.b), new pqq(str, str2, str3, null, 8), (r17 & 8) != 0 ? null : wzsVar, (r17 & 16) != 0 ? null : izsVar, (r17 & 32) != 0, null, null, null);
    }

    @Override // xsna.smq
    public final void c(Context context, Group group, wzs wzsVar, izs izsVar, String str, String str2, String str3) {
        enq enqVar = enq.a;
        gnq.a.getClass();
        xuo0.a.getClass();
        enq.k(context, new FavePage("group", null, xuo0.c(), tsj.a(group), group.d, VisibleStatus.f, group.k, EmptyList.b), new pqq(str, str2, str3, null, 8), (r17 & 8) != 0 ? null : wzsVar, (r17 & 16) != 0 ? null : izsVar, (r17 & 32) != 0, null, null, null);
    }

    @Override // xsna.smq
    public final void d(Context context, Article article, lo7 lo7Var, ArticleVh.a aVar, izs izsVar, boolean z, String str, String str2) {
        h(context, new ArticleAttachment(article), lo7Var, aVar, izsVar, z, str, null, str2);
    }

    @Override // xsna.smq
    public final void e(Context context) {
        FaveCategory faveCategory = FaveCategory.ARTICLE;
        FaveSource faveSource = FaveSource.QR;
        FavesFragment.a aVar = new FavesFragment.a();
        aVar.y(faveCategory, faveSource);
        aVar.k(context);
    }

    @Override // xsna.smq
    public final void g(Context context, ExtendedUserProfile extendedUserProfile, w1 w1Var, String str) {
        enq enqVar = enq.a;
        enq.k(context, gnq.a.a(extendedUserProfile), new pqq(null, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE), null, null, 12), w1Var, null, true, str, "community_page", "community_navbar");
    }

    @Override // xsna.smq
    public final void h(Context context, gmq gmqVar, wzs<? super Boolean, ? super gmq, s3q0> wzsVar, wzs<? super Boolean, ? super gmq, s3q0> wzsVar2, izs<? super gmq, s3q0> izsVar, boolean z, String str, String str2, String str3) {
        enq.h(context, gmqVar, new pqq(str, str2, str3, null, 8), wzsVar2, izsVar, z, wzsVar);
    }

    @Override // xsna.smq
    public final void i(Context context) {
        FaveCategory faveCategory = FaveCategory.LINK;
        FaveSource faveSource = FaveSource.QR;
        FavesFragment.a aVar = new FavesFragment.a();
        aVar.y(faveCategory, faveSource);
        aVar.k(context);
    }

    @Override // xsna.smq
    public final void j(Context context) {
        FaveCategory faveCategory = FaveCategory.POST;
        FaveSource faveSource = FaveSource.QR;
        FavesFragment.a aVar = new FavesFragment.a();
        aVar.y(faveCategory, faveSource);
        aVar.k(context);
    }

    @Override // xsna.smq
    public final boolean k() {
        return com.vk.core.apps.a.b();
    }

    @Override // xsna.smq
    public final void l(Context context, MusicTrack musicTrack, PodcastSliderItemRoundBackgroundVh.a aVar, PodcastSliderItemRoundBackgroundVh.b bVar, String str) {
        h(context, new PodcastAttachment(musicTrack, new Owner(musicTrack.c, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194302, null)), null, aVar, bVar, true, str, null, null);
    }

    @Override // xsna.smq
    public final void m(Context context) {
        FavesFragment.a aVar = new FavesFragment.a();
        aVar.y(FaveCategory.ALL, FaveSource.SNACKBAR);
        aVar.k(context);
    }

    @Override // xsna.smq
    public final void n(Context context) {
        FaveCategory faveCategory = FaveCategory.COMMUNITY;
        FaveSource faveSource = FaveSource.QR;
        FavesFragment.a aVar = new FavesFragment.a();
        aVar.y(faveCategory, faveSource);
        aVar.k(context);
    }

    @Override // xsna.smq
    public final void o(Context context, String str, wzs wzsVar, izs izsVar) {
        enq.j(context, gnq.g(null, str, false), new pqq(null, "qr_popup", null, null, 8), wzsVar, izsVar, false, null, 64);
    }
}
