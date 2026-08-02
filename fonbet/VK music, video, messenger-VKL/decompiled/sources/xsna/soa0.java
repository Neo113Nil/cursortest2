package xsna;

import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import java.util.Set;
import xsna.svh0;

/* compiled from: PinnedNewsEntryIndex.kt */
/* loaded from: classes4.dex */
public final class soa0 implements svh0<a, NewsEntry> {
    public final xg50<NewsEntry> a = new xg50<>(16);

    /* compiled from: PinnedNewsEntryIndex.kt */
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
        NewsEntry b = this.a.b(aVar.a.b);
        if (b != null) {
            return Collections.singleton(b);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.svh0
    public final void add(Object obj) {
        Owner s;
        if (obj instanceof NewsEntry) {
            NewsEntry newsEntry = (NewsEntry) obj;
            if (na60.e(newsEntry)) {
                UserId userId = newsEntry instanceof Post ? ((Post) newsEntry).m : (!(newsEntry instanceof l490) || (s = ((l490) newsEntry).s()) == null) ? null : s.b;
                if (userId == null) {
                    return;
                }
                long j = userId.b;
                boolean f = na60.f(newsEntry);
                xg50<NewsEntry> xg50Var = this.a;
                if (f) {
                    xg50Var.i(j, obj);
                } else if (epx.f(xg50Var.b(j), obj)) {
                    xg50Var.h(j);
                }
            }
        }
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.d();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        Owner s;
        if (obj instanceof NewsEntry) {
            Parcelable parcelable = (NewsEntry) obj;
            UserId userId = parcelable instanceof Post ? ((Post) parcelable).m : (!(parcelable instanceof l490) || (s = ((l490) parcelable).s()) == null) ? null : s.b;
            if (userId == null) {
                return;
            }
            long j = userId.b;
            xg50<NewsEntry> xg50Var = this.a;
            if (epx.f(xg50Var.b(j), obj)) {
                xg50Var.h(j);
            }
        }
    }
}
