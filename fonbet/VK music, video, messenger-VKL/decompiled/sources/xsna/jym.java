package xsna;

import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: DigestItemHolder.kt */
/* loaded from: classes4.dex */
public abstract class jym extends qi6<Post> {
    public int C;

    @Override // xsna.qi6
    public final void E6(Post post) {
        List<DigestItem> list;
        DigestItem digestItem;
        NewsEntry t6 = t6();
        Digest digest = t6 instanceof Digest ? (Digest) t6 : null;
        if (digest == null || (list = digest.m) == null || (digestItem = (DigestItem) j5g.b0(this.C, list)) == null) {
            return;
        }
        R6(digestItem);
    }

    public abstract void R6(DigestItem digestItem);

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.C = u1c0Var.f;
        super.a6(u1c0Var);
    }
}
