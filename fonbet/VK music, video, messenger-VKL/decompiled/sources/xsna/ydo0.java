package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import kotlin.LazyThreadSafetyMode;
import xsna.cio0;
import xsna.pjt0;
import xsna.s1q;

/* compiled from: TextDisplayItemsFactory.kt */
/* loaded from: classes.dex */
public final class ydo0 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new exw(5));

    public static iko0 a(Post post, NewsEntry newsEntry, v1c0 v1c0Var, boolean z, boolean z2, PostInteract postInteract) {
        s1q j;
        boolean b = v1c0Var.b();
        boolean z3 = !v1c0Var.b();
        s1q c = d(newsEntry) ? c(newsEntry) : null;
        Object a0 = j5g.a0(new cio0(postInteract).b(new cio0.a(post, newsEntry, z, z2, v1c0Var)));
        dio0 dio0Var = a0 instanceof dio0 ? (dio0) a0 : null;
        iko0 iko0Var = new iko0(post, newsEntry, 2, b, z3, (dio0Var == null || (j = dio0Var.j()) == null) ? c : j, z);
        if (dio0Var != null) {
            iko0Var.h = dio0Var;
        }
        return iko0Var;
    }

    public static s1q c(NewsEntry newsEntry) {
        s1q c;
        if (newsEntry instanceof FaveEntry) {
            Object d = ((FaveEntry) newsEntry).Eb().d();
            if (d instanceof VideoAttachment) {
                c = s1q.a.b();
            } else {
                c = c(d instanceof NewsEntry ? (NewsEntry) d : null);
            }
        } else {
            c = newsEntry instanceof PromoPost ? s1q.a.c() : newsEntry instanceof ShitAttachment ? s1q.a.a() : s1q.a.b();
        }
        return (newsEntry != null ? di60.l(newsEntry) : null) != null ? s1q.a(c, 1, 60) : c;
    }

    public static boolean d(NewsEntry newsEntry) {
        if (!(newsEntry instanceof FaveEntry)) {
            return (newsEntry instanceof Post) || (newsEntry instanceof PromoPost) || (newsEntry instanceof ShitAttachment) || (newsEntry instanceof Videos);
        }
        Object d = ((FaveEntry) newsEntry).Eb().d();
        if (d instanceof VideoAttachment) {
            return true;
        }
        return d(d instanceof NewsEntry ? (NewsEntry) d : null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final iko0 b(Videos videos, String str, s1c0 s1c0Var) {
        s1q b;
        VideoAttachment j;
        VideoAttachment videoAttachment;
        VideoFile Jb;
        String title;
        VideoFile Jb2;
        String j1;
        VideoAttachment j2;
        VideoFile Jb3;
        String j12;
        ?? r1 = this.a;
        if ((!((Boolean) r1.getValue()).booleanValue() && ((j2 = di60.j(videos)) == null || (Jb3 = j2.Jb()) == null || (j12 = Jb3.j1()) == null || j12.length() == 0)) || (((Boolean) r1.getValue()).booleanValue() && (((j = di60.j(videos)) == null || (Jb2 = j.Jb()) == null || (j1 = Jb2.j1()) == null || j1.length() <= 0) && di60.J(videos) && ((videoAttachment = (VideoAttachment) j5g.a0(videos.Pb())) == null || (Jb = videoAttachment.Jb()) == null || (title = Jb.getTitle()) == null || title.length() <= 0)))) {
            return null;
        }
        boolean b2 = s1c0Var.b();
        boolean z = !b2;
        Object a0 = j5g.a0(new pjt0().a(new pjt0.a(videos, videos, false, s1c0Var.f(), new v1c0(videos, videos, str, null, null, z))));
        dio0 dio0Var = a0 instanceof dio0 ? (dio0) a0 : null;
        if (dio0Var == null || (b = dio0Var.j()) == null) {
            b = s1q.a.b();
        }
        iko0 iko0Var = new iko0(videos, videos, 2, z, b2, b, false);
        if (dio0Var != null) {
            iko0Var.h = dio0Var;
        }
        return iko0Var;
    }
}
