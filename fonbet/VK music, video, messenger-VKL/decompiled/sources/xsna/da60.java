package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.attachments.AudioAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.svh0;

/* compiled from: NewsEntryAudioAttachmentIndex.kt */
/* loaded from: classes4.dex */
public final class da60 implements svh0<a, NewsEntry> {
    public final pg50<qh50<NewsEntry>> a = new pg50<>((Object) null);

    /* compiled from: NewsEntryAudioAttachmentIndex.kt */
    public static final class a extends svh0.a {
        public final AudioAttachment a;

        public a(AudioAttachment audioAttachment) {
            this.a = audioAttachment;
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
        qh50<NewsEntry> b = this.a.b(System.identityHashCode(aVar.a.f));
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
        if (obj instanceof NewsEntryWithAttachments) {
            NewsEntry newsEntry = (NewsEntry) obj;
            if (newsEntry instanceof NewsEntryWithAttachments) {
                Iterator<T> it = ((NewsEntryWithAttachments) newsEntry).Gb().iterator();
                while (it.hasNext()) {
                    Attachment attachment = ((EntryAttachment) it.next()).b;
                    if (attachment instanceof AudioAttachment) {
                        b((AudioAttachment) attachment, newsEntry);
                    }
                }
            }
            if ((newsEntry instanceof fsx0) && (N7 = ((fsx0) newsEntry).N7()) != null) {
                Iterator<T> it2 = N7.iterator();
                while (it2.hasNext()) {
                    Attachment attachment2 = ((EntryAttachment) it2.next()).b;
                    if (attachment2 instanceof AudioAttachment) {
                        b((AudioAttachment) attachment2, newsEntry);
                    }
                }
            }
            if ((newsEntry instanceof Post) && (post = ((Post) newsEntry).D) != null && (arrayList = post.z) != null) {
                Iterator<T> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Attachment attachment3 = ((EntryAttachment) it3.next()).b;
                    if (attachment3 instanceof AudioAttachment) {
                        b((AudioAttachment) attachment3, newsEntry);
                    }
                }
            }
            if (newsEntry instanceof PromoPost) {
                Iterator<T> it4 = ((PromoPost) newsEntry).n.z.iterator();
                while (it4.hasNext()) {
                    Attachment attachment4 = ((EntryAttachment) it4.next()).b;
                    if (attachment4 instanceof AudioAttachment) {
                        b((AudioAttachment) attachment4, newsEntry);
                    }
                }
            }
        }
    }

    public final void b(AudioAttachment audioAttachment, NewsEntry newsEntry) {
        int identityHashCode = System.identityHashCode(audioAttachment.f);
        qh50 qh50Var = new qh50((Object) null);
        pg50<qh50<NewsEntry>> pg50Var = this.a;
        qh50<NewsEntry> qh50Var2 = (qh50) pg50Var.c(identityHashCode, qh50Var);
        qh50Var2.e(newsEntry);
        if (pg50Var.a(identityHashCode)) {
            return;
        }
        pg50Var.k(identityHashCode, qh50Var2);
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
        pg50<qh50<NewsEntry>> pg50Var = this.a;
        Object[] objArr = pg50Var.c;
        long[] jArr = pg50Var.a;
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
