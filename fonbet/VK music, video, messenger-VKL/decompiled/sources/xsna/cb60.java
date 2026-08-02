package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Set;
import xsna.svh0;

/* compiled from: NewsEntryOwnerIdIndex.kt */
/* loaded from: classes4.dex */
public final class cb60 implements svh0<a, NewsEntry> {
    public final xg50<qh50<NewsEntry>> a = new xg50<>(32);

    /* compiled from: NewsEntryOwnerIdIndex.kt */
    public static final class a extends svh0.a {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Key(ownerId="), this.a, ')');
        }
    }

    @Override // xsna.svh0
    public final Set<NewsEntry> a(a aVar) {
        qh50<NewsEntry> b = this.a.b(aVar.a.b);
        if (b != null) {
            return new fzi0(b);
        }
        return null;
    }

    @Override // xsna.svh0
    public final void add(Object obj) {
        UserId userId;
        Owner owner;
        UserId userId2;
        Owner s;
        UserId userId3;
        if (obj instanceof NewsEntry) {
            if ((obj instanceof l490) && (s = ((l490) obj).s()) != null && (userId3 = s.b) != null) {
                b(userId3, (NewsEntry) obj);
            }
            if (obj instanceof Post) {
                NewsEntry newsEntry = (NewsEntry) obj;
                Post post = (Post) obj;
                b(post.m, newsEntry);
                Post post2 = post.D;
                if (post2 != null && (owner = post2.o) != null && (userId2 = owner.b) != null) {
                    b(userId2, newsEntry);
                }
                Caption caption = post.x;
                if (caption == null || (userId = caption.h) == null) {
                    return;
                }
                b(userId, newsEntry);
            }
        }
    }

    public final void b(UserId userId, NewsEntry newsEntry) {
        long j = userId.b;
        qh50<NewsEntry> qh50Var = new qh50<>((Object) null);
        xg50<qh50<NewsEntry>> xg50Var = this.a;
        qh50<NewsEntry> c = xg50Var.c(j, qh50Var);
        c.e(newsEntry);
        long j2 = userId.b;
        if (xg50Var.a(j2)) {
            return;
        }
        xg50Var.i(j2, c);
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.d();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        if (!(obj instanceof NewsEntry)) {
            return;
        }
        xg50<qh50<NewsEntry>> xg50Var = this.a;
        Object[] objArr = xg50Var.c;
        long[] jArr = xg50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((qh50) objArr[(i << 3) + i3]).m(obj);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
