package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.h5c0;

/* compiled from: PostMviReducer.kt */
/* loaded from: classes4.dex */
public final class l5c0 implements bm50<m5c0, h5c0> {
    @Override // xsna.bm50
    public final m5c0 a(m5c0 m5c0Var, h5c0 h5c0Var) {
        m5c0 m5c0Var2 = m5c0Var;
        h5c0 h5c0Var2 = h5c0Var;
        if (h5c0Var2 instanceof h5c0.b) {
            return m5c0.a(m5c0Var2, null, 0, null, null, null, null, null, null, 32719);
        }
        if (!(h5c0Var2 instanceof i5c0)) {
            return m5c0Var2;
        }
        i5c0 i5c0Var = (i5c0) h5c0Var2;
        NewsEntry newsEntry = i5c0Var.a;
        boolean z = newsEntry instanceof Post;
        return m5c0.a(m5c0Var2, z ? ((Post) newsEntry).m : m5c0Var2.b, z ? ((Post) newsEntry).n : m5c0Var2.c, i5c0Var.c, null, newsEntry, i5c0Var.b, null, null, 31604);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(h5c0 h5c0Var) {
        return true;
    }
}
