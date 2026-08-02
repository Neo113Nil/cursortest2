package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.j6c0;
import xsna.qn60;

/* compiled from: ExpandPostTextEditorAction.kt */
/* loaded from: classes4.dex */
public final class t7q implements qn60.b {
    public final List<NewsEntry> a;
    public final pn60 b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public t7q(List<? extends NewsEntry> list, pn60 pn60Var, String str) {
        this.a = list;
        this.b = pn60Var;
        this.c = str;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Serializer.StreamParcelableAdapter streamParcelableAdapter;
        HashSet c;
        Object obj;
        List<NewsEntry> list = this.a;
        String str = this.c;
        if (str == null || str.length() == 0) {
            streamParcelableAdapter = (NewsEntry) j5g.a0(list);
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((NewsEntry) obj).Ab(), str)) {
                        break;
                    }
                }
            }
            streamParcelableAdapter = (NewsEntry) obj;
        }
        Post post = streamParcelableAdapter instanceof Post ? (Post) streamParcelableAdapter : null;
        if (post == null || (c = aVar.c(new j6c0.a(post.m, post.n))) == null || !c.contains(post)) {
            return;
        }
        aVar.e(post, new bjk(this, 8));
    }
}
