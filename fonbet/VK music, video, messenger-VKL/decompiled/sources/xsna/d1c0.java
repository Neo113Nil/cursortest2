package xsna;

import android.view.ViewGroup;
import com.vk.coowners.presentation.util.PostInfoData;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.displaymode.HeaderDisplayMode;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PostCoownersCompactRepostHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class d1c0 extends rp6<n1c0, Post> {
    public final emi E;
    public final e1c0 F;
    public final Object G;
    public final Object H;
    public final Object I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d1c0(ViewGroup viewGroup) {
        super(r2, viewGroup);
        HeaderDisplayMode headerDisplayMode = HeaderDisplayMode.DEFAULT;
        e1c0 e1c0Var = new e1c0(viewGroup.getContext());
        e1c0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.E = new emi(14);
        e1c0 e1c0Var2 = (e1c0) this.itemView;
        this.F = e1c0Var2;
        x550 x550Var = new x550(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, x550Var);
        this.H = msy.a(lazyThreadSafetyMode, new b1z(this, 12));
        this.I = msy.a(lazyThreadSafetyMode, new e20(22));
        if (headerDisplayMode == HeaderDisplayMode.OVERLAY) {
            e1c0Var2.setIconBackgroundTintList(m6(R.color.vk_white_alpha60));
            e1c0Var2.setDateTextColor(m6(R.color.vk_white));
        }
        e1c0Var2.setOnClickListener(new um3(this, 8));
        e1c0Var2.setAvatarClickListener(new bg0(this, 12));
        e1c0Var2.setCoauthorsTextClickListener(new yg1(this, 8));
    }

    @Override // xsna.rp6
    public final void R6(n1c0 n1c0Var) {
        n1c0 n1c0Var2 = n1c0Var;
        CharSequence charSequence = n1c0Var2.h;
        e1c0 e1c0Var = this.F;
        e1c0Var.setAuthorName(charSequence);
        CharSequence charSequence2 = n1c0Var2.i;
        e1c0Var.setCoauthorName((charSequence2 == null || charSequence2.length() == 0) ? null : x6(R.string.coowners_and_name, charSequence2));
        int i = n1c0Var2.l;
        e1c0Var.setCoauthorsCount(i > 0 ? s6(R.plurals.coowners_and_authors, i, Integer.valueOf(i)) : null);
        float f = 16;
        e1c0Var.v.o0(n1c0Var2.j.f(iah0.a(f)), null);
        e1c0Var.u.o0(n1c0Var2.k.f(iah0.a(f)), null);
        Integer num = n1c0Var2.m;
        e1c0Var.setDate(num != null ? this.E.m(num.intValue()) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b7(Post post, MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors.EntryPoint entryPoint) {
        Long l;
        Long valueOf;
        VideoFile videoFile;
        Long l2;
        Long valueOf2;
        VideoFile videoFile2;
        NewsfeedCoowners newsfeedCoowners = post.f0;
        int i = post.n;
        if (newsfeedCoowners != null) {
            NewsEntry t6 = t6();
            if (t6 != null) {
                if (t6 instanceof Post) {
                    valueOf2 = Long.valueOf(((Post) t6).n);
                } else if (t6 instanceof PromoPost) {
                    valueOf2 = Long.valueOf(((PromoPost) t6).n.n);
                } else if (t6 instanceof Photos) {
                    valueOf2 = Long.valueOf(((Photos) t6).m);
                } else if (t6 instanceof Videos) {
                    VideoAttachment Nb = ((Videos) t6).Nb();
                    valueOf2 = Long.valueOf((Nb == null || (videoFile2 = Nb.k) == null) ? 0L : videoFile2.o0());
                } else {
                    l2 = null;
                    UserId e = rv60.e(t6);
                    Long valueOf3 = e == null ? Long.valueOf(e.b) : null;
                    String str = t6.Cb().b;
                    p2r p2rVar = (p2r) this.I.getValue();
                    UserId e2 = rv60.e(post);
                    Long valueOf4 = e2 == null ? Long.valueOf(e2.b) : null;
                    p2rVar.getClass();
                    UiTracker uiTracker = UiTracker.a;
                    new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l2, valueOf3, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors(entryPoint, valueOf4 == null ? valueOf4.longValue() : UserId.d.b, i), 2)).q();
                }
                l2 = valueOf2;
                UserId e3 = rv60.e(t6);
                if (e3 == null) {
                }
                String str2 = t6.Cb().b;
                p2r p2rVar2 = (p2r) this.I.getValue();
                UserId e22 = rv60.e(post);
                if (e22 == null) {
                }
                p2rVar2.getClass();
                UiTracker uiTracker2 = UiTracker.a;
                new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l2, valueOf3, null, str2, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors(entryPoint, valueOf4 == null ? valueOf4.longValue() : UserId.d.b, i), 2)).q();
            }
            NewsEntry t62 = t6();
            if (t62 == null) {
                return;
            }
            Long valueOf5 = Long.valueOf(i);
            UserId e4 = rv60.e(post);
            Long valueOf6 = e4 != null ? Long.valueOf(e4.b) : null;
            String str3 = post.L.b;
            if (t62 instanceof Post) {
                valueOf = Long.valueOf(((Post) t62).n);
            } else if (t62 instanceof PromoPost) {
                valueOf = Long.valueOf(((PromoPost) t62).n.n);
            } else if (t62 instanceof Photos) {
                valueOf = Long.valueOf(((Photos) t62).m);
            } else {
                if (!(t62 instanceof Videos)) {
                    l = null;
                    UserId e5 = rv60.e(t62);
                    ((qe60) this.H.getValue()).a(this.itemView.getContext(), new PostInfoData(valueOf5, valueOf6, str3, l, e5 != null ? Long.valueOf(e5.b) : null, t62.Cb().b), newsfeedCoowners);
                }
                VideoAttachment Nb2 = ((Videos) t62).Nb();
                valueOf = Long.valueOf((Nb2 == null || (videoFile = Nb2.k) == null) ? 0L : videoFile.o0());
            }
            l = valueOf;
            UserId e52 = rv60.e(t62);
            ((qe60) this.H.getValue()).a(this.itemView.getContext(), new PostInfoData(valueOf5, valueOf6, str3, l, e52 != null ? Long.valueOf(e52.b) : null, t62.Cb().b), newsfeedCoowners);
        }
    }
}
