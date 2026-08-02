package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import kotlin.Pair;

/* compiled from: DonutTeaserItemsBuilder.kt */
/* loaded from: classes4.dex */
public final class o3o {
    public final a2o a;

    public o3o(a2o a2oVar) {
        this.a = a2oVar;
    }

    public final u1c0 a(Post post, NewsEntry newsEntry, r1o r1oVar) {
        u1c0 u1c0Var = new u1c0(post, newsEntry, 23);
        ol60 ol60Var = (ol60) j5g.a0(new c0o(this.a).a(0, new Pair<>(post, r1oVar), null));
        if (ol60Var != null) {
            u1c0Var.h = ol60Var;
        }
        return u1c0Var;
    }
}
