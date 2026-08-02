package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import java.util.Set;
import xsna.svh0;

/* compiled from: NewsEntryWithAttachmentsIndex.kt */
/* loaded from: classes4.dex */
public final class jb60 implements svh0<a, NewsEntry> {
    public final ph50<NewsEntryWithAttachments, qh50<NewsEntry>> a = new ph50<>(32);

    /* compiled from: NewsEntryWithAttachmentsIndex.kt */
    public static final class a extends svh0.a {
        public final NewsEntryWithAttachments a;

        public a(NewsEntryWithAttachments newsEntryWithAttachments) {
            this.a = newsEntryWithAttachments;
        }
    }

    @Override // xsna.svh0
    public final Set<NewsEntry> a(a aVar) {
        qh50<NewsEntry> d = this.a.d(aVar.a);
        if (d != null) {
            return new fzi0(d);
        }
        return null;
    }

    @Override // xsna.svh0
    public final void add(Object obj) {
        Post post;
        if (obj instanceof NewsEntry) {
            if (obj instanceof NewsEntryWithAttachments) {
                b((NewsEntryWithAttachments) obj, (NewsEntry) obj);
            }
            if ((obj instanceof Post) && (post = ((Post) obj).D) != null) {
                b(post, (NewsEntry) obj);
            }
            if (obj instanceof PromoPost) {
                b(((PromoPost) obj).n, (NewsEntry) obj);
            }
        }
    }

    public final void b(NewsEntryWithAttachments newsEntryWithAttachments, NewsEntry newsEntry) {
        qh50<NewsEntry> qh50Var = new qh50<>((Object) null);
        ph50<NewsEntryWithAttachments, qh50<NewsEntry>> ph50Var = this.a;
        qh50<NewsEntry> e = ph50Var.e(newsEntryWithAttachments, qh50Var);
        e.e(newsEntry);
        if (ph50Var.b(newsEntryWithAttachments)) {
            return;
        }
        ph50Var.p(newsEntryWithAttachments, e);
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.h();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        if (!(obj instanceof NewsEntry)) {
            return;
        }
        ph50<NewsEntryWithAttachments, qh50<NewsEntry>> ph50Var = this.a;
        Object[] objArr = ph50Var.c;
        long[] jArr = ph50Var.a;
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
