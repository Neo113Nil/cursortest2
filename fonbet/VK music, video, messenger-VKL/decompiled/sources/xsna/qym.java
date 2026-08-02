package xsna;

import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Iterator;
import java.util.Set;
import xsna.svh0;

/* compiled from: DigestPostIndex.kt */
/* loaded from: classes4.dex */
public final class qym implements svh0<a, Digest> {
    public final ph50<NewsEntry, qh50<Digest>> a = new ph50<>(0);
    public final qh50<Digest> b = new qh50<>(0);

    /* compiled from: DigestPostIndex.kt */
    public static final class a extends svh0.a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Key(post=null)";
        }
    }

    @Override // xsna.svh0
    public final Set<Digest> a(a aVar) {
        qh50<Digest> d = this.a.d(null);
        if (d != null) {
            return new fzi0(d);
        }
        return null;
    }

    @Override // xsna.svh0
    public final void add(Object obj) {
        if (obj instanceof Digest) {
            this.b.e(obj);
            Digest digest = (Digest) obj;
            Iterator it = digest.q.iterator();
            while (it.hasNext()) {
                Post post = (Post) it.next();
                qh50<Digest> qh50Var = new qh50<>((Object) null);
                ph50<NewsEntry, qh50<Digest>> ph50Var = this.a;
                qh50<Digest> e = ph50Var.e(post, qh50Var);
                e.e(digest);
                if (!ph50Var.b(post)) {
                    ph50Var.p(post, e);
                }
            }
        }
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.h();
        this.b.f();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        if (obj instanceof Digest) {
            ph50<NewsEntry, qh50<Digest>> ph50Var = this.a;
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
