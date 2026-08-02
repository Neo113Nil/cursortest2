package xsna;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.articles.api.preload.QueryParameters;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.LinksParserData;
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
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.SocialButtonType;
import com.vk.fave.entities.FavePage;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;

/* compiled from: NewsfeedBridge.kt */
/* loaded from: classes.dex */
public interface gd60 {
    public static final a a = a.a;

    /* compiled from: NewsfeedBridge.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final String f;
        public final String g;

        public b() {
            this(null, null, false, false, null, null, 127);
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public final boolean d() {
            return this.d;
        }

        public final String e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        public final String f() {
            return this.f;
        }

        public final boolean g() {
            return this.c;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int b = qoy.b(qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d);
            String str3 = this.e;
            int hashCode2 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.g;
            return hashCode3 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfileOpeningParameters(fullName=");
            sb.append(this.a);
            sb.append(", avatarUrl=");
            sb.append(this.b);
            sb.append(", isNftAvatar=");
            sb.append(this.c);
            sb.append(", hasUnseenStories=");
            sb.append(this.d);
            sb.append(", entryService=");
            sb.append(this.e);
            sb.append(", prevSource=");
            sb.append(this.f);
            sb.append(", prevScreen=");
            return ho8.a(sb, this.g, ')');
        }

        public b(String str, String str2, boolean z, boolean z2, String str3, String str4, int i) {
            str = (i & 1) != 0 ? null : str;
            str2 = (i & 2) != 0 ? null : str2;
            z = (i & 4) != 0 ? false : z;
            z2 = (i & 8) != 0 ? false : z2;
            str3 = (i & 16) != 0 ? null : str3;
            str4 = (i & 32) != 0 ? null : str4;
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
            this.e = str3;
            this.f = str4;
            this.g = null;
        }
    }

    static /* synthetic */ io.reactivex.rxjava3.disposables.c J(gd60 gd60Var, Context context, ApiApplication apiApplication, String str, String str2, String str3, int i) {
        String str4;
        gd60 gd60Var2;
        Context context2;
        ApiApplication apiApplication2;
        if ((i & 8) != 0) {
            str = "menu";
        }
        String str5 = str;
        String str6 = (i & 16) != 0 ? null : str2;
        if ((i & 64) != 0) {
            str4 = null;
            context2 = context;
            apiApplication2 = apiApplication;
            gd60Var2 = gd60Var;
        } else {
            str4 = str3;
            gd60Var2 = gd60Var;
            context2 = context;
            apiApplication2 = apiApplication;
        }
        return gd60Var2.b(context2, apiApplication2, str5, str6, str4);
    }

    static /* synthetic */ void Q0(gd60 gd60Var, Context context, String str, String str2, Bundle bundle, LaunchContext launchContext, int i) {
        if ((i & 8) != 0) {
            bundle = null;
        }
        if ((i & 16) != 0) {
            launchContext = null;
        }
        gd60Var.V(context, str, str2, bundle, launchContext);
    }

    static /* synthetic */ void T0(gd60 gd60Var, Context context, FavePage favePage, pqq pqqVar, wzs wzsVar, fzp fzpVar, int i) {
        if ((i & 16) != 0) {
            fzpVar = null;
        }
        gd60Var.e0(context, favePage, pqqVar, wzsVar, fzpVar);
    }

    static /* synthetic */ void W(gd60 gd60Var, Context context, long j, Integer num, Integer num2, String str, String str2, String str3, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        gd60Var.S0(context, j, num, num2, str, str2, str3, (i & 128) != 0 ? null : bool);
    }

    static /* synthetic */ void X0(gd60 gd60Var, Context context, gmq gmqVar, pqq pqqVar, wzs wzsVar, izs izsVar, int i) {
        if ((i & 8) != 0) {
            wzsVar = null;
        }
        if ((i & 16) != 0) {
            izsVar = null;
        }
        gd60Var.i(context, gmqVar, pqqVar, wzsVar, izsVar);
    }

    static /* synthetic */ void Z0(gd60 gd60Var, Context context, UserId userId, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        gd60Var.s0(context, userId, str, str2);
    }

    static void j(gd60 gd60Var, Context context, PostingVisibilityMode postingVisibilityMode, izs izsVar, gzs gzsVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, List list, List list2, String str, boolean z, int i) {
        boolean z2;
        gd60 gd60Var2;
        Context context2;
        PostingVisibilityMode postingVisibilityMode2;
        izs izsVar2;
        gzs gzsVar2;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = (i & 16) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen;
        List list3 = (i & 32) != 0 ? EmptyList.b : list;
        List list4 = (i & 64) != 0 ? EmptyList.b : list2;
        String str2 = (i & 128) != 0 ? "" : str;
        boolean z3 = (i & 256) == 0;
        if ((i & 512) != 0) {
            z2 = false;
            context2 = context;
            postingVisibilityMode2 = postingVisibilityMode;
            izsVar2 = izsVar;
            gzsVar2 = gzsVar;
            gd60Var2 = gd60Var;
        } else {
            z2 = z;
            gd60Var2 = gd60Var;
            context2 = context;
            postingVisibilityMode2 = postingVisibilityMode;
            izsVar2 = izsVar;
            gzsVar2 = gzsVar;
        }
        gd60Var2.R(context2, postingVisibilityMode2, izsVar2, gzsVar2, mobileOfficialAppsCoreNavStat$EventScreen2, list3, list4, str2, z3, z2);
    }

    boolean A(Context context);

    void A0(Context context, VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, DeprecatedStatisticInterface deprecatedStatisticInterface, boolean z, String str3);

    boolean B(Matcher matcher, ArrayList arrayList);

    void B0(Context context, String str);

    void C(Context context, ButtonAction buttonAction, PostInteract postInteract, ShitAttachment shitAttachment, String str);

    void C0();

    boolean D();

    g420 D0(f420 f420Var);

    void E(Context context, UserId userId, String str, PromoPost promoPost);

    void E0(Context context, ShitAttachment shitAttachment, ShitAttachment.Card card, int i);

    void F(Context context, String str, int i, String str2);

    void F0(Context context);

    void G(Context context, long j, String str);

    void G0(Context context, GoodAlbum goodAlbum);

    String H0(Group group);

    FragmentImpl I(int i, int i2);

    void I0(Context context, String str, String str2, List<String> list, int i);

    void J0(Context context, NewsEntry newsEntry, String str, int i);

    void K(Context context, String str, String str2);

    boolean K0(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    void L(Context context, UserId userId, String str, String str2, b bVar);

    void L0(Context context, String str, Integer num, UserId userId);

    oxq0 M(FragmentImpl fragmentImpl, RecyclerPaginatedView recyclerPaginatedView, WallGetMode wallGetMode, boolean z);

    void M0(bc6 bc6Var);

    Pattern N0();

    void O(Context context, ShitAttachment shitAttachment, int i, boolean z);

    void O0(ProductCarouselPromoItem productCarouselPromoItem);

    fjk0 P();

    void P0(ProductCarouselItem productCarouselItem, boolean z);

    Pattern Q();

    void R(Context context, PostingVisibilityMode postingVisibilityMode, izs<? super PostingVisibilityMode, s3q0> izsVar, gzs<s3q0> gzsVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, List<UserId> list, List<Integer> list2, String str, boolean z, boolean z2);

    void R0(Context context, UserId userId, ImageStatus imageStatus);

    boolean S(Context context);

    void S0(Context context, long j, Integer num, Integer num2, String str, String str2, String str3, Boolean bool);

    void T(String str, GroupSuggestion groupSuggestion, String str2);

    String U();

    boolean U0();

    void V(Context context, String str, String str2, Bundle bundle, LaunchContext launchContext);

    LinksParserData W0();

    void X(int i, FragmentImpl fragmentImpl);

    Pattern Y();

    void Y0(Activity activity, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    void Z(Context context, UserId userId, String str, String str2, Post post, b bVar);

    m6r0 a();

    boolean a1();

    io.reactivex.rxjava3.disposables.c b(Context context, ApiApplication apiApplication, String str, String str2, String str3);

    CharSequence b0(String str);

    void b1(Activity activity, Bundle bundle);

    void c(View view, UserId userId, int i, boolean z, String str, String str2, izs<? super UserId, s3q0> izsVar, izs<? super UserId, s3q0> izsVar2);

    void c0(Context context, UserId userId, String str);

    SQLiteOpenHelper c1(Context context);

    void clear();

    CharSequence d(CharSequence charSequence, LinksParserData linksParserData);

    void d0(Activity activity);

    void d1(Context context, Playlist playlist, NewsEntry newsEntry, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    void e(long j, Context context, UserId userId, SocialButtonType socialButtonType, FullSourceJoinApi fullSourceJoinApi, String str, String str2, izs izsVar, izs izsVar2, boolean z, boolean z2);

    void e0(Context context, FavePage favePage, pqq pqqVar, wzs wzsVar, izs izsVar);

    boolean e1(int i);

    boolean f(Context context);

    zvh f0(UserId userId, FragmentImpl fragmentImpl, RecyclerPaginatedView recyclerPaginatedView, WallGetMode wallGetMode, ExtendedCommunityProfile extendedCommunityProfile, io.reactivex.rxjava3.core.q<?> qVar);

    FragmentImpl f1(int i, int i2, boolean z);

    void g(Context context, UserId userId, String str, String str2, String str3, b bVar);

    wzc0 g0();

    void g1(Context context);

    CharSequence h(CharSequence charSequence);

    io.reactivex.rxjava3.core.q h0(FragmentActivity fragmentActivity);

    void h1(Context context);

    void i(Context context, gmq gmqVar, pqq pqqVar, wzs wzsVar, izs izsVar);

    void i0(fg1 fg1Var);

    void i1(int i, Context context, UserId userId);

    Class<? extends kyr0> k0();

    void k1(Context context, GeoAttachment geoAttachment);

    Pattern l();

    Class<? extends j34> l0();

    void l1(ImageStatus imageStatus);

    void m(ProductCarousel productCarousel);

    void m1(ShitAttachment shitAttachment);

    void n();

    CharSequence n0(CharSequence charSequence);

    SpannableString n1(Context context, SpannableStringBuilder spannableStringBuilder, String str);

    rgc0 o();

    Activity o1();

    void p(Context context, String str, String str2);

    void p0(Integer num, Integer num2);

    void p1(Context context, Playlist playlist);

    boolean q();

    void q0(Context context, Article article, SnippetAttachment snippetAttachment, QueryParameters queryParameters, String str, boolean z);

    void q1(View view, UserId userId, boolean z, String str, String str2, boolean z2, ku1 ku1Var, SocialButtonType socialButtonType);

    boolean r(Context context, UserId userId, int i, int i2);

    void r0(Context context, ShitAttachment shitAttachment, int i, AdClickContext adClickContext);

    int s(Group group, boolean z);

    void s0(Context context, UserId userId, String str, String str2);

    void s1(Context context, String str, String str2);

    void t(FaveTag faveTag);

    xe8 t0();

    void u(Context context);

    dw20 u1(FragmentActivity fragmentActivity, VideoFile videoFile);

    void v(Action action, Context context, NewsEntry newsEntry, String str, String str2, List<? extends Attachment> list, String str3, Integer num);

    void v0(bfg<?> bfgVar, String str, int i, UserId userId, String str2);

    void v1(Context context, String str, String str2, String str3, boolean z, int i);

    p870 w();

    void w0(Context context, PrettyCardAttachment.Card card);

    void w1(Context context, gmq gmqVar, String str, String str2, String str3);

    void x();

    boolean x0(VideoFile videoFile);

    boolean x1(FragmentActivity fragmentActivity);

    void y();

    boolean y0();

    void y1(Context context);

    void z(Context context, UserId userId, int i, String str, String str2, MusicTrack.AssistantData assistantData);

    void z0(Context context, PhotoAlbum photoAlbum, String str);

    default void H(NewsEntry newsEntry) {
    }

    default void m0(PromoPost promoPost) {
    }

    default void r1(NewsEntry newsEntry) {
    }

    default void u0(NewsEntry newsEntry) {
    }

    default void j0(FragmentActivity fragmentActivity, FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod) {
    }

    /* compiled from: NewsfeedBridge.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final gd60 STUB = new C2931a();

        public final gd60 getSTUB() {
            return STUB;
        }

        /* compiled from: NewsfeedBridge.kt */
        /* renamed from: xsna.gd60$a$a, reason: collision with other inner class name */
        public static final class C2931a implements gd60 {
            @Override // xsna.gd60
            public final boolean A(Context context) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void A0(Context context, VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, DeprecatedStatisticInterface deprecatedStatisticInterface, boolean z, String str3) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean B(Matcher matcher, ArrayList arrayList) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void B0(Context context, String str) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void C(Context context, ButtonAction buttonAction, PostInteract postInteract, ShitAttachment shitAttachment, String str) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void C0() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean D() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final g420 D0(f420 f420Var) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void E(Context context, UserId userId, String str, PromoPost promoPost) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void E0(Context context, ShitAttachment shitAttachment, ShitAttachment.Card card, int i) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void F(Context context, String str, int i, String str2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void F0(Context context) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void G(Context context, long j, String str) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void G0(Context context, GoodAlbum goodAlbum) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void H(NewsEntry newsEntry) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final String H0(Group group) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final FragmentImpl I(int i, int i2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void I0(Context context, String str, String str2, List list, int i) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void J0(Context context, NewsEntry newsEntry, String str, int i) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void K(Context context, String str, String str2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean K0(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void L(Context context, UserId userId, String str, String str2, b bVar) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void L0(Context context, String str, Integer num, UserId userId) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final oxq0 M(FragmentImpl fragmentImpl, RecyclerPaginatedView recyclerPaginatedView, WallGetMode wallGetMode, boolean z) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void M0(bc6 bc6Var) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final Pattern N0() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void O(Context context, ShitAttachment shitAttachment, int i, boolean z) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void O0(ProductCarouselPromoItem productCarouselPromoItem) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final fjk0 P() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void P0(ProductCarouselItem productCarouselItem, boolean z) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final Pattern Q() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void R(Context context, PostingVisibilityMode postingVisibilityMode, izs izsVar, gzs gzsVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, List list, List list2, String str, boolean z, boolean z2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void R0(Context context, UserId userId, ImageStatus imageStatus) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean S(Context context) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void S0(Context context, long j, Integer num, Integer num2, String str, String str2, String str3, Boolean bool) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void T(String str, GroupSuggestion groupSuggestion, String str2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final String U() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean U0() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void V(Context context, String str, String str2, Bundle bundle, LaunchContext launchContext) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final LinksParserData W0() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void X(int i, FragmentImpl fragmentImpl) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final Pattern Y() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void Y0(Activity activity, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void Z(Context context, UserId userId, String str, String str2, Post post, b bVar) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final m6r0 a() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean a1() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final io.reactivex.rxjava3.disposables.c b(Context context, ApiApplication apiApplication, String str, String str2, String str3) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final CharSequence b0(String str) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void b1(Activity activity, Bundle bundle) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void c(View view, UserId userId, int i, boolean z, String str, String str2, izs izsVar, izs izsVar2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void c0(Context context, UserId userId, String str) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final SQLiteOpenHelper c1(Context context) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void clear() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final CharSequence d(CharSequence charSequence, LinksParserData linksParserData) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void d0(Activity activity) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void d1(Context context, Playlist playlist, NewsEntry newsEntry, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void e(long j, Context context, UserId userId, SocialButtonType socialButtonType, FullSourceJoinApi fullSourceJoinApi, String str, String str2, izs izsVar, izs izsVar2, boolean z, boolean z2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void e0(Context context, FavePage favePage, pqq pqqVar, wzs wzsVar, izs izsVar) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean e1(int i) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean f(Context context) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final zvh f0(UserId userId, FragmentImpl fragmentImpl, RecyclerPaginatedView recyclerPaginatedView, WallGetMode wallGetMode, ExtendedCommunityProfile extendedCommunityProfile, io.reactivex.rxjava3.core.q<?> qVar) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final FragmentImpl f1(int i, int i2, boolean z) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void g(Context context, UserId userId, String str, String str2, String str3, b bVar) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final wzc0 g0() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void g1(Context context) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final CharSequence h(CharSequence charSequence) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final io.reactivex.rxjava3.core.q h0(FragmentActivity fragmentActivity) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void h1(Context context) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void i(Context context, gmq gmqVar, pqq pqqVar, wzs wzsVar, izs izsVar) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void i0(fg1 fg1Var) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void i1(int i, Context context, UserId userId) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void j0(FragmentActivity fragmentActivity, FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final Class<? extends kyr0> k0() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void k1(Context context, GeoAttachment geoAttachment) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final Pattern l() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final Class<? extends j34> l0() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void l1(ImageStatus imageStatus) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void m(ProductCarousel productCarousel) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void m0(PromoPost promoPost) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void m1(ShitAttachment shitAttachment) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void n() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final CharSequence n0(CharSequence charSequence) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final SpannableString n1(Context context, SpannableStringBuilder spannableStringBuilder, String str) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final rgc0 o() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final Activity o1() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void p(Context context, String str, String str2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void p0(Integer num, Integer num2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void p1(Context context, Playlist playlist) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean q() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void q0(Context context, Article article, SnippetAttachment snippetAttachment, QueryParameters queryParameters, String str, boolean z) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void q1(View view, UserId userId, boolean z, String str, String str2, boolean z2, ku1 ku1Var, SocialButtonType socialButtonType) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean r(Context context, UserId userId, int i, int i2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void r0(Context context, ShitAttachment shitAttachment, int i, AdClickContext adClickContext) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void r1(NewsEntry newsEntry) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final int s(Group group, boolean z) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void s0(Context context, UserId userId, String str, String str2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void s1(Context context, String str, String str2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void t(FaveTag faveTag) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final xe8 t0() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void u(Context context) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void u0(NewsEntry newsEntry) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final dw20 u1(FragmentActivity fragmentActivity, VideoFile videoFile) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void v(Action action, Context context, NewsEntry newsEntry, String str, String str2, List list, String str3, Integer num) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void v0(bfg bfgVar, String str, int i, UserId userId, String str2) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void v1(Context context, String str, String str2, String str3, boolean z, int i) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final p870 w() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void w0(Context context, PrettyCardAttachment.Card card) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void w1(Context context, gmq gmqVar, String str, String str2, String str3) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void x() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean x0(VideoFile videoFile) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean x1(FragmentActivity fragmentActivity) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void y() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final boolean y0() {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void y1(Context context) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void z(Context context, UserId userId, int i, String str, String str2, MusicTrack.AssistantData assistantData) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void z0(Context context, PhotoAlbum photoAlbum, String str) {
                sdy.w();
                throw null;
            }

            @Override // xsna.gd60
            public final void j1(Context context, ShitAttachment shitAttachment, ShitAttachment.Card card, int i) {
            }
        }
    }

    default void j1(Context context, ShitAttachment shitAttachment, ShitAttachment.Card card, int i) {
    }
}
