package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.svh0;

/* compiled from: NewsEntryAttachmentIndex.kt */
/* loaded from: classes4.dex */
public final class ca60 implements svh0<a, NewsEntry> {
    public final ph50<Attachment, qh50<NewsEntry>> a = new ph50<>(32);
    public final qh50<NewsEntry> b = new qh50<>((Object) null);

    /* compiled from: NewsEntryAttachmentIndex.kt */
    public static final class a extends svh0.a {
        public final Attachment a;

        public a(Attachment attachment) {
            this.a = attachment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Key(attachment=" + this.a + ')';
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.svh0
    public final void add(Object obj) {
        Post post;
        ArrayList<EntryAttachment> arrayList;
        List<EntryAttachment> N7;
        if (obj instanceof NewsEntry) {
            NewsEntry newsEntry = (NewsEntry) obj;
            qh50<NewsEntry> qh50Var = this.b;
            if (qh50Var.a(newsEntry)) {
                remove(newsEntry);
            }
            qh50Var.e(newsEntry);
            if (newsEntry instanceof NewsEntryWithAttachments) {
                Iterator<T> it = ((NewsEntryWithAttachments) newsEntry).Gb().iterator();
                while (it.hasNext()) {
                    b(((EntryAttachment) it.next()).b, newsEntry);
                }
            }
            if ((newsEntry instanceof fsx0) && (N7 = ((fsx0) newsEntry).N7()) != null) {
                Iterator<T> it2 = N7.iterator();
                while (it2.hasNext()) {
                    b(((EntryAttachment) it2.next()).b, newsEntry);
                }
            }
            if ((newsEntry instanceof Post) && (post = ((Post) newsEntry).D) != null && (arrayList = post.z) != null) {
                Iterator<T> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    b(((EntryAttachment) it3.next()).b, newsEntry);
                }
            }
            if (newsEntry instanceof PromoPost) {
                Iterator<T> it4 = ((PromoPost) newsEntry).n.z.iterator();
                while (it4.hasNext()) {
                    b(((EntryAttachment) it4.next()).b, newsEntry);
                }
            }
        }
    }

    public final void b(Attachment attachment, NewsEntry newsEntry) {
        qh50<NewsEntry> qh50Var = new qh50<>((Object) null);
        ph50<Attachment, qh50<NewsEntry>> ph50Var = this.a;
        qh50<NewsEntry> e = ph50Var.e(attachment, qh50Var);
        e.e(newsEntry);
        if (ph50Var.b(attachment)) {
            return;
        }
        ph50Var.p(attachment, e);
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.h();
        this.b.f();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        if (obj instanceof NewsEntry) {
            ph50<Attachment, qh50<NewsEntry>> ph50Var = this.a;
            Object[] objArr = ph50Var.c;
            long[] jArr = ph50Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
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
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.b.m(obj);
        }
    }
}
