package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.HashSet;
import xsna.j6c0;
import xsna.qn60;

/* compiled from: ReplacePostExcerptConfigEditorAction.kt */
/* loaded from: classes4.dex */
public final class k1g0 implements qn60.b {
    public final NewsEntry a;
    public final s1q b;
    public final pn60 c;

    public k1g0(NewsEntry newsEntry, s1q s1qVar, pn60 pn60Var) {
        this.a = newsEntry;
        this.b = s1qVar;
        this.c = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        NewsEntry newsEntry = this.a;
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            HashSet c = aVar.c(new j6c0.a(post.m, post.n));
            if (c != null && c.contains(newsEntry)) {
                aVar.e(newsEntry, new wq20(this, 22));
            }
        }
    }
}
