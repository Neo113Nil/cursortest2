package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: EntriesActionsController.kt */
/* loaded from: classes4.dex */
public final class bqp {
    public final EntriesListPresenter a;
    public final com.vk.lists.b b;

    public bqp(EntriesListPresenter entriesListPresenter, com.vk.lists.b bVar) {
        this.a = entriesListPresenter;
        this.b = bVar;
    }

    public static int a(DiscoverMediaBlock discoverMediaBlock, NewsEntry newsEntry) {
        int size = discoverMediaBlock.j.size();
        for (int i = 0; i < size; i++) {
            if (discoverMediaBlock.j.get(i).c.equals(newsEntry)) {
                return i;
            }
        }
        return -1;
    }

    public static void c(bqp bqpVar, UserId userId, int i) {
        Post post;
        Iterator it = bqpVar.b.d.iterator();
        int i2 = -1;
        NewsEntry newsEntry = null;
        ywf0 ywf0Var = null;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            NewsEntry newsEntry2 = ((u1c0) it.next()).b;
            if (newsEntry2 instanceof DiscoverMediaBlock) {
                ArrayList<DiscoverGridItem> arrayList = ((DiscoverMediaBlock) newsEntry2).j;
                int size = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        post = null;
                        break;
                    }
                    NewsEntry newsEntry3 = arrayList.get(i5).c;
                    post = newsEntry3 instanceof Post ? (Post) newsEntry3 : null;
                    if (post != null && epx.f(post.m, userId) && post.n == i) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (post != null) {
                    i4++;
                    ywf0Var = new ywf0(post);
                    i2 = i3;
                    newsEntry = post;
                }
            } else {
                if (newsEntry2 instanceof Post) {
                    Post post2 = (Post) newsEntry2;
                    if (epx.f(post2.m, userId) && post2.n == i) {
                        if (i2 == -1) {
                            i2 = i3;
                        }
                        i4++;
                        newsEntry = newsEntry2;
                    }
                }
                if (i2 != -1) {
                    break;
                }
            }
            i3++;
        }
        if (newsEntry != null) {
            EntriesListPresenter entriesListPresenter = bqpVar.a;
            if (ywf0Var != null) {
                bqpVar.b.G(ywf0Var, new t3h(bqpVar, newsEntry), new oj(bqpVar));
                entriesListPresenter.Y();
                return;
            }
            if (i2 >= 0) {
                entriesListPresenter.c.B(i2, i4);
            }
            entriesListPresenter.V(newsEntry);
            entriesListPresenter.Y();
            entriesListPresenter.b.mk(newsEntry);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final boolean b(NewsEntry newsEntry, boolean z) {
        com.vk.lists.b bVar = this.b;
        Iterator it = bVar.d.iterator();
        ywf0 ywf0Var = null;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            NewsEntry newsEntry2 = ((u1c0) it.next()).b;
            if (!(newsEntry instanceof DiscoverMediaBlock) && (newsEntry2 instanceof DiscoverMediaBlock)) {
                DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) newsEntry2;
                int a = a(discoverMediaBlock, newsEntry);
                if (a >= 0) {
                    discoverMediaBlock.j.get(a).c.d = newsEntry.d;
                    i2++;
                    ywf0Var = new ywf0(newsEntry);
                    i = i3;
                }
            } else if (newsEntry2.equals(newsEntry)) {
                if (i == -1) {
                    i = i3;
                }
                i2++;
            } else if (i != -1) {
                break;
            }
            i3++;
        }
        EntriesListPresenter entriesListPresenter = this.a;
        fqp fqpVar = entriesListPresenter.b;
        if (ywf0Var != null) {
            bVar.G(ywf0Var, new t3h(this, newsEntry), new oj(this));
            entriesListPresenter.Y();
            return false;
        }
        if (i >= 0) {
            if (z) {
                fqpVar.g6();
            }
            entriesListPresenter.c.B(i, i2);
        }
        boolean V = entriesListPresenter.V(newsEntry);
        fy0 fy0Var = new fy0(7, entriesListPresenter, newsEntry);
        if (z) {
            fqpVar.Aa(fy0Var);
            return V;
        }
        fy0Var.invoke();
        return V;
    }
}
