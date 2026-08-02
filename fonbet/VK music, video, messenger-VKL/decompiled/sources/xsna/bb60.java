package xsna;

import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentActivity;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Set;
import xsna.svh0;

/* compiled from: NewsEntryObsceneTextIndex.kt */
/* loaded from: classes4.dex */
public final class bb60 implements svh0<a, NewsEntry> {
    public final qh50<NewsEntry> a = new qh50<>(0);

    /* compiled from: NewsEntryObsceneTextIndex.kt */
    public static final class a extends svh0.a {
        public static final a a = new a();
    }

    public static boolean b(Post post) {
        if (post.l.zb(68719476736L)) {
            return true;
        }
        Activity activity = post.C;
        ArrayList<Comment> arrayList = activity instanceof CommentsActivity ? ((CommentsActivity) activity).d : activity instanceof CommentActivity ? ((CommentActivity) activity).d : null;
        if (arrayList != null) {
            for (Comment comment : arrayList) {
                if (comment.g != null && comment.v) {
                    return true;
                }
            }
        }
        Post post2 = post.D;
        return post2 != null && b(post2);
    }

    @Override // xsna.svh0
    public final Set<NewsEntry> a(a aVar) {
        qh50<NewsEntry> qh50Var = this.a;
        if (qh50Var.d == 0) {
            return null;
        }
        return new fzi0(qh50Var);
    }

    @Override // xsna.svh0
    public final void add(Object obj) {
        Post R;
        if ((obj instanceof NewsEntry) && (R = di60.R((NewsEntry) obj)) != null && b(R)) {
            this.a.e(obj);
        }
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.f();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        if (obj instanceof NewsEntry) {
            this.a.m(obj);
        }
    }
}
