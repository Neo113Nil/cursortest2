package xsna;

import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.qn60;
import xsna.v2n;

/* compiled from: RemoveNewsEntryEditorAction.kt */
/* loaded from: classes4.dex */
public final class mxf0 implements qn60.b {
    public final NewsEntry a;
    public final pn60 b;

    public mxf0(NewsEntry newsEntry, pn60 pn60Var) {
        this.a = newsEntry;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        DiscoverGridItem Eb;
        NewsEntry newsEntry = this.a;
        aVar.h(newsEntry);
        HashSet c = aVar.c(new v2n.a(newsEntry));
        if (c != null) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) it.next();
                if (aVar.b(discoverMediaBlock) && (Eb = discoverMediaBlock.Eb(newsEntry)) != null) {
                    Eb.c.d = newsEntry.d;
                    qn60 qn60Var = aVar.a;
                    ux80<Object, List<ol60>> ux80Var = qn60Var.b;
                    List<ol60> d = ux80Var.b.d(discoverMediaBlock);
                    List<ol60> c2 = pn60.c(this.b, discoverMediaBlock, new u2n(new ywf0(newsEntry)), null, 12);
                    qn60.a.n(c2, d);
                    ux80Var.put(discoverMediaBlock, c2);
                    qn60Var.c.a(discoverMediaBlock);
                }
            }
        }
    }
}
