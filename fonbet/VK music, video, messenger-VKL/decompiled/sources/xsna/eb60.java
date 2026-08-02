package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.svh0;

/* compiled from: NewsEntryPhotoOwnerIdIndex.kt */
/* loaded from: classes4.dex */
public final class eb60 implements svh0<a, NewsEntry> {
    public final xg50<qh50<NewsEntry>> a = new xg50<>(16);

    /* compiled from: NewsEntryPhotoOwnerIdIndex.kt */
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.svh0
    public final void add(Object obj) {
        Post post;
        ArrayList<EntryAttachment> arrayList;
        List<EntryAttachment> N7;
        if (obj instanceof NewsEntry) {
            NewsEntry newsEntry = (NewsEntry) obj;
            if (newsEntry instanceof NewsEntryWithAttachments) {
                Iterator<T> it = ((NewsEntryWithAttachments) newsEntry).Gb().iterator();
                while (it.hasNext()) {
                    Attachment attachment = ((EntryAttachment) it.next()).b;
                    if (attachment instanceof PhotoAttachment) {
                        b(((PhotoAttachment) attachment).g, newsEntry);
                    }
                }
            }
            if ((newsEntry instanceof fsx0) && (N7 = ((fsx0) newsEntry).N7()) != null) {
                Iterator<T> it2 = N7.iterator();
                while (it2.hasNext()) {
                    Attachment attachment2 = ((EntryAttachment) it2.next()).b;
                    if (attachment2 instanceof PhotoAttachment) {
                        b(((PhotoAttachment) attachment2).g, newsEntry);
                    }
                }
            }
            if ((newsEntry instanceof Post) && (post = ((Post) newsEntry).D) != null && (arrayList = post.z) != null) {
                Iterator<T> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Attachment attachment3 = ((EntryAttachment) it3.next()).b;
                    if (attachment3 instanceof PhotoAttachment) {
                        b(((PhotoAttachment) attachment3).g, newsEntry);
                    }
                }
            }
            if (newsEntry instanceof PromoPost) {
                Iterator<T> it4 = ((PromoPost) newsEntry).n.z.iterator();
                while (it4.hasNext()) {
                    Attachment attachment4 = ((EntryAttachment) it4.next()).b;
                    if (attachment4 instanceof PhotoAttachment) {
                        b(((PhotoAttachment) attachment4).g, newsEntry);
                    }
                }
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
