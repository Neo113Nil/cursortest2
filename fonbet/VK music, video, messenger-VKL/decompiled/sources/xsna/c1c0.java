package xsna;

import android.content.Context;
import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.tags.Tag;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;
import com.vkontakte.android.attachments.ShitAttachment;

/* compiled from: PostController.kt */
/* loaded from: classes3.dex */
public interface c1c0 {
    void A(Context context, UserId userId, Post post);

    void B(NewsEntry newsEntry, Integer num);

    void C(Context context, Post post);

    void D(Context context, Post post);

    void E(Context context, Post post, UserId userId, UserId userId2);

    void F(Context context, Post post);

    void G(Context context, Post post, z6c0 z6c0Var, b3m b3mVar);

    void H(Context context, NewsEntry newsEntry, boolean z, MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint);

    void I(Context context, NewsEntry newsEntry, int i);

    void J(Context context, ShitAttachment shitAttachment);

    void K(NewsEntry newsEntry);

    io.reactivex.rxjava3.core.a L(Context context, Post post);

    void M(Context context, Post post);

    void N(Context context, NewsEntry newsEntry, String str, NewsfeedAddBanTypeDto newsfeedAddBanTypeDto);

    io.reactivex.rxjava3.core.a O(Context context, Post post);

    void P(Context context, NewsEntry newsEntry, String str, String str2);

    void Q(Context context, UserId userId, Videos videos);

    void R(Context context, NewsEntry newsEntry, String str, int i, int i2);

    void S(Context context, Post post);

    void T(Context context, NewsEntry newsEntry, NewsEntry newsEntry2, String str, int i);

    void U(Context context, NewsEntry newsEntry, boolean z);

    void V(Comment comment, Post post, boolean z, ReactionMeta reactionMeta, String str);

    void W(Context context, TagsSuggestions tagsSuggestions, String str);

    void X(Context context, NewsEntry newsEntry, String str);

    void Y(Context context, Tag tag, h4 h4Var, com.vk.newsfeed.common.recycler.holders.attachments.a aVar);

    void Z(Context context, Post post, b3m b3mVar);

    void a(Post post);

    void a0(NewsEntry newsEntry);

    void b(Context context, aq3 aq3Var);

    io.reactivex.rxjava3.core.a b0(Context context, UserId userId, NewsEntry newsEntry);

    void c(int i, Context context, Post post, PostingCreationEntryPoint postingCreationEntryPoint);

    void d(Context context, NewsEntry newsEntry, boolean z, MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint creationEntryPoint);

    void e(Context context, String str);

    void f(Context context, l6z l6zVar, izs izsVar, udl udlVar);

    void g(NewsEntry newsEntry, Post post, String str);

    void h(NewsEntry newsEntry, Integer num);

    void i(Context context, Post post);

    void j(Context context, Post post, String str, NewsfeedAddBanTypeDto newsfeedAddBanTypeDto);

    void k(Context context, c6z c6zVar, boolean z);

    void l(String str, NewsEntry newsEntry);

    void m(Context context, PromoPost promoPost);

    void n(Context context, Post post, UserId userId, UserId userId2);

    void o(Context context, UserId userId, Post post);

    void p(Context context, NewsEntry newsEntry, Integer num);

    void q(Context context, NewsEntry newsEntry);

    void r(Context context, Post post);

    void s(NewsEntry newsEntry);

    void t(Context context, Post post, boolean z);

    void u(Context context, Html5Entry html5Entry);

    void v(Context context, Post post);

    void w(Context context, Post post);

    void x(Context context, Post post);

    void y(MyTargetNativeAdEntry myTargetNativeAdEntry);

    void z(Context context, NewsEntry newsEntry, boolean z);
}
